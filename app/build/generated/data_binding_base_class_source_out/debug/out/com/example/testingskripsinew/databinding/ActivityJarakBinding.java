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

public final class ActivityJarakBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnCheckin;

  @NonNull
  public final Button btnCheckout;

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
  public final TextView txtJarak;

  @NonNull
  public final TextView txtLat;

  @NonNull
  public final TextView txtLong;

  @NonNull
  public final TextView txtStatusjarak;

  @NonNull
  public final TextView txtStatuslat;

  @NonNull
  public final TextView txtStatuslong;

  private ActivityJarakBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnCheckin,
      @NonNull Button btnCheckout, @NonNull ImageButton buttonBack, @NonNull Guideline guideline,
      @NonNull Guideline guideline1, @NonNull Guideline guideline2, @NonNull Guideline guideline3,
      @NonNull Guideline guideline4, @NonNull TextView txtJarak, @NonNull TextView txtLat,
      @NonNull TextView txtLong, @NonNull TextView txtStatusjarak, @NonNull TextView txtStatuslat,
      @NonNull TextView txtStatuslong) {
    this.rootView = rootView;
    this.btnCheckin = btnCheckin;
    this.btnCheckout = btnCheckout;
    this.buttonBack = buttonBack;
    this.guideline = guideline;
    this.guideline1 = guideline1;
    this.guideline2 = guideline2;
    this.guideline3 = guideline3;
    this.guideline4 = guideline4;
    this.txtJarak = txtJarak;
    this.txtLat = txtLat;
    this.txtLong = txtLong;
    this.txtStatusjarak = txtStatusjarak;
    this.txtStatuslat = txtStatuslat;
    this.txtStatuslong = txtStatuslong;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityJarakBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityJarakBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_jarak, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityJarakBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_checkin;
      Button btnCheckin = rootView.findViewById(id);
      if (btnCheckin == null) {
        break missingId;
      }

      id = R.id.btn_checkout;
      Button btnCheckout = rootView.findViewById(id);
      if (btnCheckout == null) {
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

      id = R.id.txt_jarak;
      TextView txtJarak = rootView.findViewById(id);
      if (txtJarak == null) {
        break missingId;
      }

      id = R.id.txt_lat;
      TextView txtLat = rootView.findViewById(id);
      if (txtLat == null) {
        break missingId;
      }

      id = R.id.txt_long;
      TextView txtLong = rootView.findViewById(id);
      if (txtLong == null) {
        break missingId;
      }

      id = R.id.txt_statusjarak;
      TextView txtStatusjarak = rootView.findViewById(id);
      if (txtStatusjarak == null) {
        break missingId;
      }

      id = R.id.txt_statuslat;
      TextView txtStatuslat = rootView.findViewById(id);
      if (txtStatuslat == null) {
        break missingId;
      }

      id = R.id.txt_statuslong;
      TextView txtStatuslong = rootView.findViewById(id);
      if (txtStatuslong == null) {
        break missingId;
      }

      return new ActivityJarakBinding((ConstraintLayout) rootView, btnCheckin, btnCheckout,
          buttonBack, guideline, guideline1, guideline2, guideline3, guideline4, txtJarak, txtLat,
          txtLong, txtStatusjarak, txtStatuslat, txtStatuslong);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
