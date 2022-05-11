// Generated by view binder compiler. Do not edit!
package com.s22.digijournal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.s22.digijournal.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentTaskEditBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button backButton;

  @NonNull
  public final TextView deadlineTextView;

  @NonNull
  public final TextView detailLabel;

  @NonNull
  public final TextInputEditText detailText;

  @NonNull
  public final Button editButton;

  @NonNull
  public final TextView header;

  @NonNull
  public final TextInputEditText title;

  private FragmentTaskEditBinding(@NonNull FrameLayout rootView, @NonNull Button backButton,
      @NonNull TextView deadlineTextView, @NonNull TextView detailLabel,
      @NonNull TextInputEditText detailText, @NonNull Button editButton, @NonNull TextView header,
      @NonNull TextInputEditText title) {
    this.rootView = rootView;
    this.backButton = backButton;
    this.deadlineTextView = deadlineTextView;
    this.detailLabel = detailLabel;
    this.detailText = detailText;
    this.editButton = editButton;
    this.header = header;
    this.title = title;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentTaskEditBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentTaskEditBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_task_edit, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentTaskEditBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back_button;
      Button backButton = ViewBindings.findChildViewById(rootView, id);
      if (backButton == null) {
        break missingId;
      }

      id = R.id.deadline_textView;
      TextView deadlineTextView = ViewBindings.findChildViewById(rootView, id);
      if (deadlineTextView == null) {
        break missingId;
      }

      id = R.id.detail_label;
      TextView detailLabel = ViewBindings.findChildViewById(rootView, id);
      if (detailLabel == null) {
        break missingId;
      }

      id = R.id.detail_text;
      TextInputEditText detailText = ViewBindings.findChildViewById(rootView, id);
      if (detailText == null) {
        break missingId;
      }

      id = R.id.edit_button;
      Button editButton = ViewBindings.findChildViewById(rootView, id);
      if (editButton == null) {
        break missingId;
      }

      id = R.id.header;
      TextView header = ViewBindings.findChildViewById(rootView, id);
      if (header == null) {
        break missingId;
      }

      id = R.id.title;
      TextInputEditText title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new FragmentTaskEditBinding((FrameLayout) rootView, backButton, deadlineTextView,
          detailLabel, detailText, editButton, header, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
