package edu.psm.application1;

import android.app.Application;

import org.altbeacon.beacon.BeaconConsumer;

public class MonitorActivity extends Application implements BeaconConsumer {
    @Override
    public void onBeaconServiceConnect() {

    }
}
