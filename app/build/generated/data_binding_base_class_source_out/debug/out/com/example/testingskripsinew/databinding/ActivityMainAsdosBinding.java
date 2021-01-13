// Generated by view binder compiler. Do not edit!
package com.example.testingskripsinew.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class ActivityMainAsdosBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnHistPresensi;

  @NonNull
  public final Button btnProfilAsdos;

  @NonNull
  public final Guideline guideline;

  @NonNull
  public final Guideline guideline1;

  @NonNull
  public final Guideline guideline2;

  @NonNull
  public final Guideline guideline3;

  @NonNull
  public final Guideline guideline5;

  @NonNull
  public final TextView namaAsdos;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView titleDashboard;

  @NonNull
  public final View view;

  private ActivityMainAsdosBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnHistPresensi, @NonNull Button btnProfilAsdos, @NonNull Guideline guideline,
      @NonNull Guideline guideline1, @NonNull Guideline guideline2, @NonNull Guideline guideline3,
      @NonNull Guideline guideline5, @NonNull TextView namaAsdos, @NonNull TextView textView6,
      @NonNull TextView titleDashboard, @NonNull View view) {
    this.rootView = rootView;
    this.btnHistPresensi = btnHistPresensi;
    this.btnProfilAsdos = btnProfilAsdos;
    this.guideline = guideline;
    this.guideline1 = guideline1;
    this.guideline2 = guideline2;
    this.guideline3 = guideline3;
    this.guideline5 = guideline5;
    this.namaAsdos = namaAsdos;
    this.textView6 = textView6;
    this.titleDashboard = titleDashboard;
    this.view = view;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainAsdosBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainAsdosBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main_asdos, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainAsdosBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_hist_presensi;
      Button btnHistPresensi = rootView.findViewById(id);
      if (btnHistPresensi == null) {
        break missingId;
      }

      id = R.id.btn_profil_asdos;
      Button btnProfilAsdos = rootView.findViewById(id);
      if (btnProfilAsdos == null) {
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

      id = R.id.guideline5;
      Guideline guideline5 = rootView.findViewById(id);
      if (guideline5 == null) {
        break missingId;
      }

      id = R.id.nama_asdos;
      TextView namaAsdos = rootView.findViewById(id);
      if (namaAsdos == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = rootView.findViewById(id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.titleDashboard;
      TextView titleDashboard = rootView.findViewById(id);
      if (titleDashboard == null) {
        break missingId;
      }

      id = R.id.view;
      View view = rootView.findViewById(id);
      if (view == null) {
        break missingId;
      }

      return new ActivityMainAsdosBinding((ConstraintLayout) rootView, btnHistPresensi,
          btnProfilAsdos, guideline, guideline1, guideline2, guideline3, guideline5, namaAsdos,
          textView6, titleDashboard, view);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
