
package com.example.shaurma;


import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback {

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


    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;                                        // Зумим камеру сразу на Пензу
        LatLngBounds australiaBounds = new LatLngBounds(
                new LatLng(53.2006600, 45.0046400), // SW bounds
                new LatLng(53.2006600, 45.0046400)  // NE bounds
        );
        mMap.setMinZoomPreference(10.0f);
        mMap.setMaxZoomPreference(14.0f);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(australiaBounds.getCenter(), 10));
        // Первая точка
        final LatLng shaurma1 = new LatLng(53.15270141911472, 44.96764375119565);
        Marker shaurm = mMap.addMarker(
                new MarkerOptions()
                        .position(shaurma1)
                        .title("Шаурма Шашлык")
                        .snippet("Оценка: 3,5/5"));

        // Вторая точка
        final LatLng shaurma2 = new LatLng(53.162171581733304, 44.9789709306978);
        Marker shaurm2 = mMap.addMarker(
                new MarkerOptions()
                        .position(shaurma2)
                        .title("Гриль Хаус")
                        .snippet("Оценка: 4.3/5"));

        // Третья точка
        final LatLng shaurma3 = new LatLng(53.16608285095531, 44.985151375631354);
        Marker shaurm3 = mMap.addMarker(
                new MarkerOptions()
                        .position(shaurma3)
                        .title("Шаурма №1")
                        .snippet("Оценка: не известна"));


        // Четвертая точка
        final LatLng shaurma4 = new LatLng(53.16772715003653, 45.0074720214384);
        Marker shaurm4 = mMap.addMarker(
                new MarkerOptions()
                        .position(shaurma4)
                        .title("Шаурма Гриль")
                        .snippet("Оценка: 3.7/5 Средняя цена: 120Р"));



        // Пятая точка
        final LatLng shaurma5 = new LatLng(53.185732267097, 45.00293460447436);
        Marker shaurm5 = mMap.addMarker(
                new MarkerOptions()
                        .position(shaurma5)
                        .title("Шаурма №1")
                        .snippet("Оценка: 4.7/5"));

        // Шестая точка
        final LatLng shaurma6 = new LatLng(53.19499094855929, 45.01289971814152);
        Marker shaurm6 = mMap.addMarker(
                new MarkerOptions()
                        .position(shaurma6)
                        .title("Шаурма")
                        .snippet("Оценка: 4.7/5"));

        // Седьмая точка
        final LatLng shaurma7 = new LatLng(53.1925208206943, 45.01581770087248);
        Marker shaurm7 = mMap.addMarker(
                new MarkerOptions()
                        .position(shaurma7)
                        .title("Кушай мясо")
                        .snippet("Оценка: 4.5/5"));

        // Восьмая точка
        final LatLng shaurma8 = new LatLng(53.186341504187666, 45.054775345187494);
        Marker shaurm8 = mMap.addMarker(
                new MarkerOptions()
                        .position(shaurma8)
                        .title("ШАУРМА хальяль")
                        .snippet("Оценка: 1.0/5"));

        // Девятая точка
        final LatLng shaurma9 = new LatLng(53.190457764178156, 45.0654202680709);
        Marker shaurm9 = mMap.addMarker(
                new MarkerOptions()
                        .position(shaurma9)
                        .title("Шаурма 24 Часа")
                        .snippet("Оценка: не известна"));

        // Десятая точка
        final LatLng shaurma10 = new LatLng(53.217918762948315, 44.999153726923616);
        Marker shaurm10 = mMap.addMarker(
                new MarkerOptions()
                        .position(shaurma10)
                        .title("Гриль Хаус")
                        .snippet("Оценка: 4.8/5"));

        // Одиннодцатая точка
        final LatLng shaurma11 = new LatLng(53.190457764178156, 45.0654202680709);
        Marker shaurm11 = mMap.addMarker(
                new MarkerOptions()
                        .position(shaurma11)
                        .title("Шаурма на углях")
                        .snippet("Оценка: 2.3/5"));

        // Двинадцатая точка
        final LatLng shaurma12 = new LatLng(53.222852376724894, 44.981895299194576);
        Marker shaurm12 = mMap.addMarker(
                new MarkerOptions()
                        .position(shaurma12)
                        .title("Шаурма ")
                        .snippet("Оценка: 1.7/5"));

        // Тринадцатая точка
        final LatLng shaurma13 = new LatLng(53.21127634770585, 44.988798821661646);
        Marker shaurm13 = mMap.addMarker(
                new MarkerOptions()
                        .position(shaurma13)
                        .title("Шаурма")
                        .snippet("Оценка: 3.3/5"));
    }

}

