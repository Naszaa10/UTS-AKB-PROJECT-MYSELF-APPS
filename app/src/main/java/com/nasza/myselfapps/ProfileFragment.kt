package com.nasza.myselfapps

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import de.hdodenhof.circleimageview.BuildConfig
import org.osmdroid.api.IMapController
import org.osmdroid.config.Configuration
import org.osmdroid.util.GeoPoint
import org.osmdroid.views.MapView
import org.osmdroid.views.overlay.Marker

//<!--
//~     Tanggal Pengerjaan : 25/05/2024 - 09/6/2024
//~     Nim : 10121073
//~     Nama : Nasza Dwi Prayoga
//~     email : nasza9909@gmail.com
//~     kelas : PEM-ANDRO 3
//~     Copyright © 2024 Nasza Dwi Prayoga. All rights reserved.
//-->
class ProfileFragment : Fragment() {

    private lateinit var mapView: MapView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        // Initialize MapView
        Configuration.getInstance().userAgentValue = BuildConfig.APPLICATION_ID
        mapView = view.findViewById(R.id.map)
        mapView.setMultiTouchControls(true)

        // Set initial map center and zoom level
        val mapController: IMapController = mapView.controller
        mapController.setZoom(15.0)
        val startPoint = GeoPoint(-6.8758542, 107.6333703)
        mapController.setCenter(startPoint)

        // Add marker to map
        val startMarker = Marker(mapView)
        startMarker.position = startPoint
        startMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM)
        startMarker.title = "Lokasi Saya"
        mapView.overlays.add(startMarker)

        // WhatsApp button
        val btnDialNumber: ImageButton = view.findViewById(R.id.btn_dial_number)
        btnDialNumber.setOnClickListener {
            val uri = Uri.parse("https://wa.me/+62895343338617")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        // Email button
        val btnEmail: ImageButton = view.findViewById(R.id.btn_email)
        btnEmail.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "nasza9909@gmail.com", null))
            startActivity(Intent.createChooser(emailIntent, "Send email..."))
        }

        // Instagram button
        val btnIG: ImageButton = view.findViewById(R.id.btn_ig)
        btnIG.setOnClickListener {
            val uri = Uri.parse("https://www.instagram.com/naszaa03_")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        // Google Maps button
        val btnOpenMaps: Button = view.findViewById(R.id.btn_open_maps)
        btnOpenMaps.setOnClickListener {
            val uri = Uri.parse("https://www.google.com/maps/@-6.8758542,107.6333703,15z?entry=ttu")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        return view
    }

    override fun onResume() {
        super.onResume()
        mapView.onResume()
    }

    override fun onPause() {
        super.onPause()
        mapView.onPause()
    }
}