package com.example.verzeski.myapplication;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtWifiInfo;
    Button btnInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtWifiInfo = (TextView) findViewById(R.id.idText);
        btnInfo = (Button) findViewById(R.id.idBtn);



    }

    public void getWifiInformation(View view) {

        WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
        WifiInfo wifiInfo = wifiManager.getConnectionInfo();
        String ssid = wifiInfo.getSSID();
        int rssid = wifiInfo.getRssi();
        String info = "Access Point: " + "\n" + ssid +"\n"
                + "SEGNALE " + "\n" + rssid;
        txtWifiInfo.setText(info);
    }
}
