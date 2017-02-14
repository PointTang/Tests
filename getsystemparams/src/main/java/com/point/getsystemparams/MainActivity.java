package com.point.getsystemparams;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		 Log.i("point-test",
		 " _model_ " + android.os.Build.MODEL
		 + "\n _brand_ " + android.os.Build.BRAND + "\n _bootloader_ " +
		 android.os.Build.BOOTLOADER
		 + "\n _product_ " + android.os.Build.PRODUCT + "\n _cpu ABI & ABI2_ " +
		 android.os.Build.CPU_ABI
		 + " " + android.os.Build.CPU_ABI2 + "\n _device_ " +
		 android.os.Build.DEVICE
		 + "\n _fingerprint_ " + android.os.Build.FINGERPRINT + "\n _hardware_ "
		 + android.os.Build.HARDWARE + "\n _host_ " + android.os.Build.HOST + "\n_id_ "
		 + android.os.Build.ID + "\n _manufacturer_ " +
		 android.os.Build.MANUFACTURER
		 + "\n _version.incremental_ " + android.os.Build.VERSION.INCREMENTAL
		 + "\n _version.release_ " + android.os.Build.VERSION.RELEASE
		 + "\n _version.codename_ " + android.os.Build.VERSION.CODENAME
//		 + "\n _class_utils_softversion_" + ClassUtils.getSoftVersion()
//		 + "\n _class_utils_devicemodel_" + ClassUtils.getDeviceModel()

		 );

	}
}
