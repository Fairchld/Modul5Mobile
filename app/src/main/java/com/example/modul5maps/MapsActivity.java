package com.example.modul5maps;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng Sma1tgr = new LatLng(-0.4095603,116.9881231);
        mMap.addMarker(new MarkerOptions().position(Sma1tgr).title("SMA 1 Tenggarong"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Sma1tgr));

        LatLng Smp1tgr = new LatLng(-0.4116667,116.9855368);
        mMap.addMarker(new MarkerOptions().position(Smp1tgr).title("SMP 1 Tenggarong"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Smp1tgr));

        LatLng Sd1tgr = new LatLng(-0.410945,116.989426);
        mMap.addMarker(new MarkerOptions().position(Sd1tgr).title("SD 1 Tenggarong"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Sd1tgr));
    }
}
