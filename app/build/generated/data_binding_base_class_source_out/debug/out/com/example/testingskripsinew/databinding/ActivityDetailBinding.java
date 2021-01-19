// Generated by view binder compiler. Do not edit!
package com.example.testingskripsinew.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
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

public final class ActivityDetailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

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
  public final Guideline guideline5;

  @NonNull
  public final TextView hari;

  @NonNull
  public final TextView jamTgl;

  @NonNull
  public final TextView kelas;

  @NonNull
  public final TextView mataKuliah;

  @NonNull
  public final TextView npmPengajar1;

  @NonNull
  public final TextView npmPengajar2;

  @NonNull
  public final TextView pengajar1;

  @NonNull
  public final TextView pengajar2;

  @NonNull
  public final ImageView qrCodeImage;

  @NonNull
  public final TextView textPengajar1;

  @NonNull
  public final TextView textPengajar2;

  @NonNull
  public final TextView txtProfilAsdos;

  private ActivityDetailBinding(@NonNull ConstraintLayout rootView, @NonNull ImageButton buttonBack,
      @NonNull Guideline guideline, @NonNull Guideline guideline1, @NonNull Guideline guideline2,
      @NonNull Guideline guideline3, @NonNull Guideline guideline4, @NonNull Guideline guideline5,
      @NonNull TextView hari, @NonNull TextView jamTgl, @NonNull TextView kelas,
      @NonNull TextView mataKuliah, @NonNull TextView npmPengajar1, @NonNull TextView npmPengajar2,
      @NonNull TextView pengajar1, @NonNull TextView pengajar2, @NonNull ImageView qrCodeImage,
      @NonNull TextView textPengajar1, @NonNull TextView textPengajar2,
      @NonNull TextView txtProfilAsdos) {
    this.rootView = rootView;
    this.buttonBack = buttonBack;
    this.guideline = guideline;
    this.guideline1 = guideline1;
    this.guideline2 = guideline2;
    this.guideline3 = guideline3;
    this.guideline4 = guideline4;
    this.guideline5 = guideline5;
    this.hari = hari;
    this.jamTgl = jamTgl;
    this.kelas = kelas;
    this.mataKuliah = mataKuliah;
    this.npmPengajar1 = npmPengajar1;
    this.npmPengajar2 = npmPengajar2;
    this.pengajar1 = pengajar1;
    this.pengajar2 = pengajar2;
    this.qrCodeImage = qrCodeImage;
    this.textPengajar1 = textPengajar1;
    this.textPengajar2 = textPengajar2;
    this.txtProfilAsdos = txtProfilAsdos;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
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

      id = R.id.guideline5;
      Guideline guideline5 = rootView.findViewById(id);
      if (guideline5 == null) {
        break missingId;
      }

      id = R.id.hari;
      TextView hari = rootView.findViewById(id);
      if (hari == null) {
        break missingId;
      }

      id = R.id.jamTgl;
      TextView jamTgl = rootView.findViewById(id);
      if (jamTgl == null) {
        break missingId;
      }

      id = R.id.kelas;
      TextView kelas = rootView.findViewById(id);
      if (kelas == null) {
        break missingId;
      }

      id = R.id.mata_kuliah;
      TextView mataKuliah = rootView.findViewById(id);
      if (mataKuliah == null) {
        break missingId;
      }

      id = R.id.npmPengajar1;
      TextView npmPengajar1 = rootView.findViewById(id);
      if (npmPengajar1 == null) {
        break missingId;
      }

      id = R.id.npmPengajar2;
      TextView npmPengajar2 = rootView.findViewById(id);
      if (npmPengajar2 == null) {
        break missingId;
      }

      id = R.id.pengajar1;
      TextView pengajar1 = rootView.findViewById(id);
      if (pengajar1 == null) {
        break missingId;
      }

      id = R.id.pengajar2;
      TextView pengajar2 = rootView.findViewById(id);
      if (pengajar2 == null) {
        break missingId;
      }

      id = R.id.qrCodeImage;
      ImageView qrCodeImage = rootView.findViewById(id);
      if (qrCodeImage == null) {
        break missingId;
      }

      id = R.id.textPengajar1;
      TextView textPengajar1 = rootView.findViewById(id);
      if (textPengajar1 == null) {
        break missingId;
      }

      id = R.id.textPengajar2;
      TextView textPengajar2 = rootView.findViewById(id);
      if (textPengajar2 == null) {
        break missingId;
      }

      id = R.id.txtProfilAsdos;
      TextView txtProfilAsdos = rootView.findViewById(id);
      if (txtProfilAsdos == null) {
        break missingId;
      }

      return new ActivityDetailBinding((ConstraintLayout) rootView, buttonBack, guideline,
          guideline1, guideline2, guideline3, guideline4, guideline5, hari, jamTgl, kelas,
          mataKuliah, npmPengajar1, npmPengajar2, pengajar1, pengajar2, qrCodeImage, textPengajar1,
          textPengajar2, txtProfilAsdos);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
