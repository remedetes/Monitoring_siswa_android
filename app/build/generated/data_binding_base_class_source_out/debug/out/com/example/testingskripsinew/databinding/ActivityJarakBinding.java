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
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.example.testingskripsinew.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.skyfishjy.library.RippleBackground;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityJarakBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView alerText;

  @NonNull
  public final Button btnCheckin;

  @NonNull
  public final ImageButton buttonBack;

  @NonNull
  public final FloatingActionButton fabCheckIn;

  @NonNull
  public final Group group;

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
  public final RippleBackground rippleBackground;

  @NonNull
  public final TextView statusJarak;

  @NonNull
  public final TextView statusLat;

  @NonNull
  public final TextView statusLong;

  @NonNull
  public final TextView txtJarak;

  @NonNull
  public final TextView txtLat;

  @NonNull
  public final TextView txtLong;

  @NonNull
  public final TextView txtTitle;

  private ActivityJarakBinding(@NonNull ConstraintLayout rootView, @NonNull TextView alerText,
      @NonNull Button btnCheckin, @NonNull ImageButton buttonBack,
      @NonNull FloatingActionButton fabCheckIn, @NonNull Group group, @NonNull Guideline guideline,
      @NonNull Guideline guideline1, @NonNull Guideline guideline2, @NonNull Guideline guideline3,
      @NonNull Guideline guideline4, @NonNull RippleBackground rippleBackground,
      @NonNull TextView statusJarak, @NonNull TextView statusLat, @NonNull TextView statusLong,
      @NonNull TextView txtJarak, @NonNull TextView txtLat, @NonNull TextView txtLong,
      @NonNull TextView txtTitle) {
    this.rootView = rootView;
    this.alerText = alerText;
    this.btnCheckin = btnCheckin;
    this.buttonBack = buttonBack;
    this.fabCheckIn = fabCheckIn;
    this.group = group;
    this.guideline = guideline;
    this.guideline1 = guideline1;
    this.guideline2 = guideline2;
    this.guideline3 = guideline3;
    this.guideline4 = guideline4;
    this.rippleBackground = rippleBackground;
    this.statusJarak = statusJarak;
    this.statusLat = statusLat;
    this.statusLong = statusLong;
    this.txtJarak = txtJarak;
    this.txtLat = txtLat;
    this.txtLong = txtLong;
    this.txtTitle = txtTitle;
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
      id = R.id.aler_text;
      TextView alerText = rootView.findViewById(id);
      if (alerText == null) {
        break missingId;
      }

      id = R.id.btn_checkin;
      Button btnCheckin = rootView.findViewById(id);
      if (btnCheckin == null) {
        break missingId;
      }

      id = R.id.button_back;
      ImageButton buttonBack = rootView.findViewById(id);
      if (buttonBack == null) {
        break missingId;
      }

      id = R.id.fabCheckIn;
      FloatingActionButton fabCheckIn = rootView.findViewById(id);
      if (fabCheckIn == null) {
        break missingId;
      }

      id = R.id.group;
      Group group = rootView.findViewById(id);
      if (group == null) {
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

      id = R.id.rippleBackground;
      RippleBackground rippleBackground = rootView.findViewById(id);
      if (rippleBackground == null) {
        break missingId;
      }

      id = R.id.status_jarak;
      TextView statusJarak = rootView.findViewById(id);
      if (statusJarak == null) {
        break missingId;
      }

      id = R.id.status_lat;
      TextView statusLat = rootView.findViewById(id);
      if (statusLat == null) {
        break missingId;
      }

      id = R.id.status_long;
      TextView statusLong = rootView.findViewById(id);
      if (statusLong == null) {
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

      id = R.id.txt_title;
      TextView txtTitle = rootView.findViewById(id);
      if (txtTitle == null) {
        break missingId;
      }

      return new ActivityJarakBinding((ConstraintLayout) rootView, alerText, btnCheckin, buttonBack,
          fabCheckIn, group, guideline, guideline1, guideline2, guideline3, guideline4,
          rippleBackground, statusJarak, statusLat, statusLong, txtJarak, txtLat, txtLong,
          txtTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
