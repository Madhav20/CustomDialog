package com.madhav.maheshwari.customdialog;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import com.shreyaspatil.MaterialDialog.BottomSheetMaterialDialog;

import com.shreyaspatil.MaterialDialog.MaterialDialog;

import com.shreyaspatil.MaterialDialog.interfaces.DialogInterface;
import com.shreyaspatil.MaterialDialog.interfaces.OnCancelListener;
import com.shreyaspatil.MaterialDialog.interfaces.OnDismissListener;
import com.shreyaspatil.MaterialDialog.interfaces.OnShowListener;
/*import com.madhav.maheshwari.customdialog.MaterialDialog;
import com.madhav.maheshwari.customdialog.BottomSheetMaterialDialog;*/

public class MainActivity extends AppCompatActivity implements View.OnClickListener, OnShowListener, OnCancelListener, OnDismissListener {

    private MaterialDialog mSimpleDialog;
    private MaterialDialog mAnimatedDialog;
    private BottomSheetMaterialDialog mSimpleBottomSheetDialog;
    private BottomSheetMaterialDialog mAnimatedBottomSheetDialog;

    AbstractDialog abstractDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mButtonSimpleDialog = findViewById(R.id.button_simple_dialog);
        Button mButtonAnimatedDialog = findViewById(R.id.button_animated_dialog);
        Button mButtonBottomSheetDialog = findViewById(R.id.button_simple_bottomsheet_dialog);
        Button mButtonAnimatedBottomSheetDialog = findViewById(R.id.button_animated_bottomsheet_dialog);

        // Simple Material Dialog
        mSimpleDialog = new MaterialDialog.Builder(this)
                .setTitle("Delete?")
                .setMessage("Are you sure want to delete this file?")
                .setCancelable(false)
                .setPositiveButton("Delete", R.drawable.ic_delete, new MaterialDialog.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Deleted!", Toast.LENGTH_SHORT).show();
                        dialogInterface.dismiss();
                    }
                })
                .setNegativeButton("Cancel", R.drawable.ic_close, new MaterialDialog.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        Toast.makeText(getApplicationContext(), "Cancelled!", Toast.LENGTH_SHORT).show();
                        dialogInterface.dismiss();
                    }
                })
                .build();

        // Simple BottomSheet Material Dialog
        mSimpleBottomSheetDialog = new BottomSheetMaterialDialog.Builder(this)
                .setTitle("Delete?")
                .setMessage("Are you sure want to delete this file?")
                .setCancelable(false)
                .setPositiveButton("Delete", R.drawable.ic_delete, new BottomSheetMaterialDialog.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Deleted!", Toast.LENGTH_SHORT).show();
                        dialogInterface.dismiss();
                    }
                })
                .setNegativeButton("Cancel", R.drawable.ic_close, new BottomSheetMaterialDialog.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        Toast.makeText(getApplicationContext(), "Cancelled!", Toast.LENGTH_SHORT).show();
                        dialogInterface.dismiss();
                    }
                })
                .build();

        // Animated Simple Material Dialog
        mAnimatedDialog = new MaterialDialog.Builder(this)
                .setTitle("Delete?")
                .setMessage("Are you sure want to delete this file?")
                .setCancelable(false)
                .setPositiveButton("Delete", R.drawable.ic_delete, new MaterialDialog.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Deleted!", Toast.LENGTH_SHORT).show();
                        //Toast.makeText(MainActivity.this, ""+abstractDialog.getText(), Toast.LENGTH_SHORT).show();

                        dialogInterface.dismiss();
                    }
                })
                .setNegativeButton("Cancel", R.drawable.ic_close, new MaterialDialog.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        Toast.makeText(getApplicationContext(), "Cancelled!", Toast.LENGTH_SHORT).show();
                        dialogInterface.dismiss();
                    }
                })
                .setAnimation("main_attendance.json")
                .build();

        // Animated BottomSheet Material Dialog
        mAnimatedBottomSheetDialog = new BottomSheetMaterialDialog.Builder(this)
                .setTitle("Delete?")
                .setMessage("Are you sure want to delete this file?")
                .setCancelable(false)
                .setPositiveButton("Delete", R.drawable.ic_delete, new BottomSheetMaterialDialog.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Deleted!", Toast.LENGTH_SHORT).show();
                        dialogInterface.dismiss();
                    }
                })
                .setNegativeButton("Cancel", R.drawable.ic_close, new BottomSheetMaterialDialog.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {

                        Toast.makeText(getApplicationContext(), "Cancelled!", Toast.LENGTH_SHORT).show();
                        dialogInterface.dismiss();
                    }
                })
                .setAnimation("custom_attendance.json")
                .build();

        mButtonSimpleDialog.setOnClickListener(this);
        mButtonBottomSheetDialog.setOnClickListener(this);
        mButtonAnimatedDialog.setOnClickListener(this);
        mButtonAnimatedBottomSheetDialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_simple_dialog :
                mSimpleDialog.show();
                break;

            case R.id.button_simple_bottomsheet_dialog :
                mSimpleBottomSheetDialog.show();
                break;

            case R.id.button_animated_dialog :
                mAnimatedDialog.show();
                break;

            case R.id.button_animated_bottomsheet_dialog :
                mAnimatedBottomSheetDialog.show();
                break;
        }
    }

    @Override
    public void onShow(DialogInterface dialogInterface) {

    }

    @Override
    public void onCancel(DialogInterface dialogInterface) {

    }

    @Override
    public void onDismiss(DialogInterface dialogInterface) {

    }
}
