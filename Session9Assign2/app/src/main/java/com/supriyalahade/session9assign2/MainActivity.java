package com.supriyalahade.session9assign2;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView text;
    Button button_alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.textView);
        button_alert= (Button)findViewById(R.id.Alert_id);

        button_alert.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        AlertDialog.Builder alertdialogbuider = new AlertDialog.Builder(this);
        alertdialogbuider.setMessage("Are you sure you want to delete this?");
        alertdialogbuider.setIcon(R.drawable.delete);
        alertdialogbuider.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                text.setVisibility(View.GONE);
                Toast.makeText(MainActivity.this, "Text Is Deleted", Toast.LENGTH_SHORT).show();
            }
        });

        alertdialogbuider.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Text Not Deleted", Toast.LENGTH_SHORT).show();
                dialogInterface.dismiss();
            }
        });
        alertdialogbuider.setTitle("Confirm Delete...");
        alertdialogbuider.create();
        alertdialogbuider.show();


    }

}
