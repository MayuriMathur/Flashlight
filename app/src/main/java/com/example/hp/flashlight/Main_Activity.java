package com.example.hp.flashlight;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
//import android.hardware.Camera;
import android.hardware.camera2.*;
import android.util.Log;
import android.view.View;
import android.content.Context;
import android.content.pm.PackageManager;
import android.widget.ToggleButton;
import android.view.View;
import android.hardware.Camera.Parameters;




public class Main_Activity extends AppCompatActivity {

ToggleButton button;
final Context context= this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flash_app);
        button = (ToggleButton) findViewById(R.id.togglebutton);
        final PackageManager pm = context.getPackageManager();
    }
        public void OnToggleClicked(View view){
            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
            String cameraId = null; // Usually front camera is at 0 position.
            try {
                cameraId = camManager.getCameraIdList()[0];
                camManager.setTorchMode(cameraId, true);

            } catch (CameraAccessException e) {
                e.printStackTrace();
            }

        }
}