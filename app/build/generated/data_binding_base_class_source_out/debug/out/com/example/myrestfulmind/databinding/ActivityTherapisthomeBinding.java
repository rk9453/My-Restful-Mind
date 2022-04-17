// Generated by view binder compiler. Do not edit!
package com.example.myrestfulmind.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myrestfulmind.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityTherapisthomeBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView imageBack;

  @NonNull
  public final ImageView imageSchedule;

  @NonNull
  public final ImageView imageSignout;

  @NonNull
  public final TextView tvUpdateSchedule;

  @NonNull
  public final TextView tvViewHistory;

  private ActivityTherapisthomeBinding(@NonNull RelativeLayout rootView,
      @NonNull ImageView imageBack, @NonNull ImageView imageSchedule,
      @NonNull ImageView imageSignout, @NonNull TextView tvUpdateSchedule,
      @NonNull TextView tvViewHistory) {
    this.rootView = rootView;
    this.imageBack = imageBack;
    this.imageSchedule = imageSchedule;
    this.imageSignout = imageSignout;
    this.tvUpdateSchedule = tvUpdateSchedule;
    this.tvViewHistory = tvViewHistory;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTherapisthomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTherapisthomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_therapisthome, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTherapisthomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageBack;
      ImageView imageBack = ViewBindings.findChildViewById(rootView, id);
      if (imageBack == null) {
        break missingId;
      }

      id = R.id.imageSchedule;
      ImageView imageSchedule = ViewBindings.findChildViewById(rootView, id);
      if (imageSchedule == null) {
        break missingId;
      }

      id = R.id.imageSignout;
      ImageView imageSignout = ViewBindings.findChildViewById(rootView, id);
      if (imageSignout == null) {
        break missingId;
      }

      id = R.id.tvUpdateSchedule;
      TextView tvUpdateSchedule = ViewBindings.findChildViewById(rootView, id);
      if (tvUpdateSchedule == null) {
        break missingId;
      }

      id = R.id.tvViewHistory;
      TextView tvViewHistory = ViewBindings.findChildViewById(rootView, id);
      if (tvViewHistory == null) {
        break missingId;
      }

      return new ActivityTherapisthomeBinding((RelativeLayout) rootView, imageBack, imageSchedule,
          imageSignout, tvUpdateSchedule, tvViewHistory);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
