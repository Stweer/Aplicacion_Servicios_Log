package com.example.aplicacion_servicios_log.Presenter;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;

import androidx.core.app.ActivityCompat;

import com.example.aplicacion_servicios_log.View.MapsView;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;

public class MapsPresenterImpl implements MapsPresenter{
    final private int request_code_ask_permission=111;
    LatLng pos;
    MapsView mapsView;
    Context ctx;
    GoogleMap mapa;
    public MapsPresenterImpl(MapsView mapsView) {
        this.mapsView=mapsView;
        ctx=mapsView.getContext();
    }

    @Override
    public void verificarpermisos() {
        int permisoLocation = ActivityCompat.checkSelfPermission(ctx, Manifest.permission.ACCESS_FINE_LOCATION);
        if(permisoLocation != PackageManager.PERMISSION_GRANTED){
            mapsView.PermisoOn();
        }else {
            mapsView.PErmisoOff();
        }
    }

    @Override
    public void GuardarPosicion() {
        if (mapa.getMyLocation() != null) {
            mapsView.ubicacionOn();

        } else{
            mapsView.ubicacionOf();
        }

    }
}
