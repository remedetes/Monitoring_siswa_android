// Generated by view binder compiler. Do not edit!
package com.example.testingskripsinew.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.example.testingskripsinew.R;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityScheduleBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppBarLayout appBarLayout;

  @NonNull
  public final Guideline guideline9;

  @NonNull
  public final RecyclerView rvListjadwal;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final Toolbar toolbar;

  private ActivityScheduleBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppBarLayout appBarLayout, @NonNull Guideline guideline9,
      @NonNull RecyclerView rvListjadwal, @NonNull TextView textView6, @NonNull TextView textView7,
      @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.appBarLayout = appBarLayout;
    this.guideline9 = guideline9;
    this.rvListjadwal = rvListjadwal;
    this.textView6 = textView6;
    this.textView7 = textView7;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityScheduleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityScheduleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_schedule, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityScheduleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appBarLayout;
      AppBarLayout appBarLayout = rootView.findViewById(id);
      if (appBarLayout == null) {
        break missingId;
      }

      id = R.id.guideline9;
      Guideline guideline9 = rootView.findViewById(id);
      if (guideline9 == null) {
        break missingId;
      }

      id = R.id.rvListjadwal;
      RecyclerView rvListjadwal = rootView.findViewById(id);
      if (rvListjadwal == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = rootView.findViewById(id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = rootView.findViewById(id);
      if (textView7 == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = rootView.findViewById(id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityScheduleBinding((ConstraintLayout) rootView, appBarLayout, guideline9,
          rvListjadwal, textView6, textView7, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}