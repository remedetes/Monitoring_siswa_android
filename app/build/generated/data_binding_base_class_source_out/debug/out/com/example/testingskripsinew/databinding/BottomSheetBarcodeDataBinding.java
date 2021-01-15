// Generated by view binder compiler. Do not edit!
package com.example.testingskripsinew.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.testingskripsinew.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class BottomSheetBarcodeDataBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout bottomSheet;

  @NonNull
  public final Button btnAbsen;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView textViewKelas;

  @NonNull
  public final TextView textViewMatkul;

  @NonNull
  public final TextView textViewTitle;

  @NonNull
  public final View view;

  private BottomSheetBarcodeDataBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout bottomSheet, @NonNull Button btnAbsen, @NonNull ImageView imageView,
      @NonNull TextView textViewKelas, @NonNull TextView textViewMatkul,
      @NonNull TextView textViewTitle, @NonNull View view) {
    this.rootView = rootView;
    this.bottomSheet = bottomSheet;
    this.btnAbsen = btnAbsen;
    this.imageView = imageView;
    this.textViewKelas = textViewKelas;
    this.textViewMatkul = textViewMatkul;
    this.textViewTitle = textViewTitle;
    this.view = view;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BottomSheetBarcodeDataBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BottomSheetBarcodeDataBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.bottom_sheet_barcode_data, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BottomSheetBarcodeDataBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout bottomSheet = (ConstraintLayout) rootView;

      id = R.id.btn_absen;
      Button btnAbsen = rootView.findViewById(id);
      if (btnAbsen == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = rootView.findViewById(id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.text_view_kelas;
      TextView textViewKelas = rootView.findViewById(id);
      if (textViewKelas == null) {
        break missingId;
      }

      id = R.id.text_view_matkul;
      TextView textViewMatkul = rootView.findViewById(id);
      if (textViewMatkul == null) {
        break missingId;
      }

      id = R.id.text_view_title;
      TextView textViewTitle = rootView.findViewById(id);
      if (textViewTitle == null) {
        break missingId;
      }

      id = R.id.view;
      View view = rootView.findViewById(id);
      if (view == null) {
        break missingId;
      }

      return new BottomSheetBarcodeDataBinding((ConstraintLayout) rootView, bottomSheet, btnAbsen,
          imageView, textViewKelas, textViewMatkul, textViewTitle, view);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}