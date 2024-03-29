// Generated by view binder compiler. Do not edit!
package com.example.testingskripsinew.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.example.testingskripsinew.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class HistoryAsdosHadirBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnAbsen;

  @NonNull
  public final Button btnHadir;

  @NonNull
  public final Button btnIzin;

  @NonNull
  public final Button btnKeluar;

  @NonNull
  public final TextView bulan;

  @NonNull
  public final ImageButton buttonBack;

  @NonNull
  public final Guideline guideline;

  @NonNull
  public final Guideline guideline1;

  @NonNull
  public final Guideline guideline2;

  @NonNull
  public final Guideline guideline3;

  @NonNull
  public final Guideline guideline4;

  @NonNull
  public final TextView jam;

  @NonNull
  public final TextView jamMasuk;

  @NonNull
  public final TextView jamPraktikum;

  @NonNull
  public final TextView namaUser;

  @NonNull
  public final TextView tahun;

  @NonNull
  public final TextView textPengajar1;

  @NonNull
  public final TextView tgl;

  @NonNull
  public final TextView totalHadir;

  @NonNull
  public final TextView txtCheckin;

  private HistoryAsdosHadirBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnAbsen,
      @NonNull Button btnHadir, @NonNull Button btnIzin, @NonNull Button btnKeluar,
      @NonNull TextView bulan, @NonNull ImageButton buttonBack, @NonNull Guideline guideline,
      @NonNull Guideline guideline1, @NonNull Guideline guideline2, @NonNull Guideline guideline3,
      @NonNull Guideline guideline4, @NonNull TextView jam, @NonNull TextView jamMasuk,
      @NonNull TextView jamPraktikum, @NonNull TextView namaUser, @NonNull TextView tahun,
      @NonNull TextView textPengajar1, @NonNull TextView tgl, @NonNull TextView totalHadir,
      @NonNull TextView txtCheckin) {
    this.rootView = rootView;
    this.btnAbsen = btnAbsen;
    this.btnHadir = btnHadir;
    this.btnIzin = btnIzin;
    this.btnKeluar = btnKeluar;
    this.bulan = bulan;
    this.buttonBack = buttonBack;
    this.guideline = guideline;
    this.guideline1 = guideline1;
    this.guideline2 = guideline2;
    this.guideline3 = guideline3;
    this.guideline4 = guideline4;
    this.jam = jam;
    this.jamMasuk = jamMasuk;
    this.jamPraktikum = jamPraktikum;
    this.namaUser = namaUser;
    this.tahun = tahun;
    this.textPengajar1 = textPengajar1;
    this.tgl = tgl;
    this.totalHadir = totalHadir;
    this.txtCheckin = txtCheckin;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static HistoryAsdosHadirBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static HistoryAsdosHadirBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.history_asdos_hadir, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static HistoryAsdosHadirBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_absen;
      Button btnAbsen = rootView.findViewById(id);
      if (btnAbsen == null) {
        break missingId;
      }

      id = R.id.btn_hadir;
      Button btnHadir = rootView.findViewById(id);
      if (btnHadir == null) {
        break missingId;
      }

      id = R.id.btn_izin;
      Button btnIzin = rootView.findViewById(id);
      if (btnIzin == null) {
        break missingId;
      }

      id = R.id.btn_keluar;
      Button btnKeluar = rootView.findViewById(id);
      if (btnKeluar == null) {
        break missingId;
      }

      id = R.id.bulan;
      TextView bulan = rootView.findViewById(id);
      if (bulan == null) {
        break missingId;
      }

      id = R.id.button_back;
      ImageButton buttonBack = rootView.findViewById(id);
      if (buttonBack == null) {
        break missingId;
      }

      id = R.id.guideline;
      Guideline guideline = rootView.findViewById(id);
      if (guideline == null) {
        break missingId;
      }

      id = R.id.guideline1;
      Guideline guideline1 = rootView.findViewById(id);
      if (guideline1 == null) {
        break missingId;
      }

      id = R.id.guideline2;
      Guideline guideline2 = rootView.findViewById(id);
      if (guideline2 == null) {
        break missingId;
      }

      id = R.id.guideline3;
      Guideline guideline3 = rootView.findViewById(id);
      if (guideline3 == null) {
        break missingId;
      }

      id = R.id.guideline4;
      Guideline guideline4 = rootView.findViewById(id);
      if (guideline4 == null) {
        break missingId;
      }

      id = R.id.jam;
      TextView jam = rootView.findViewById(id);
      if (jam == null) {
        break missingId;
      }

      id = R.id.jam_masuk;
      TextView jamMasuk = rootView.findViewById(id);
      if (jamMasuk == null) {
        break missingId;
      }

      id = R.id.jam_praktikum;
      TextView jamPraktikum = rootView.findViewById(id);
      if (jamPraktikum == null) {
        break missingId;
      }

      id = R.id.nama_user;
      TextView namaUser = rootView.findViewById(id);
      if (namaUser == null) {
        break missingId;
      }

      id = R.id.tahun;
      TextView tahun = rootView.findViewById(id);
      if (tahun == null) {
        break missingId;
      }

      id = R.id.textPengajar1;
      TextView textPengajar1 = rootView.findViewById(id);
      if (textPengajar1 == null) {
        break missingId;
      }

      id = R.id.tgl;
      TextView tgl = rootView.findViewById(id);
      if (tgl == null) {
        break missingId;
      }

      id = R.id.total_hadir;
      TextView totalHadir = rootView.findViewById(id);
      if (totalHadir == null) {
        break missingId;
      }

      id = R.id.txt_checkin;
      TextView txtCheckin = rootView.findViewById(id);
      if (txtCheckin == null) {
        break missingId;
      }

      return new HistoryAsdosHadirBinding((ConstraintLayout) rootView, btnAbsen, btnHadir, btnIzin,
          btnKeluar, bulan, buttonBack, guideline, guideline1, guideline2, guideline3, guideline4,
          jam, jamMasuk, jamPraktikum, namaUser, tahun, textPengajar1, tgl, totalHadir, txtCheckin);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
