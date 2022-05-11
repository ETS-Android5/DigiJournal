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

public final class FragmentCategoryAddBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button cancelButton;

  @NonNull
  public final Button createButton;

  @NonNull
  public final TextView header;

  @NonNull
  public final TextInputEditText title;

  private FragmentCategoryAddBinding(@NonNull FrameLayout rootView, @NonNull Button cancelButton,
      @NonNull Button createButton, @NonNull TextView header, @NonNull TextInputEditText title) {
    this.rootView = rootView;
    this.cancelButton = cancelButton;
    this.createButton = createButton;
    this.header = header;
    this.title = title;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCategoryAddBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCategoryAddBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_category_add, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCategoryAddBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cancel_button;
      Button cancelButton = ViewBindings.findChildViewById(rootView, id);
      if (cancelButton == null) {
        break missingId;
      }

      id = R.id.create_button;
      Button createButton = ViewBindings.findChildViewById(rootView, id);
      if (createButton == null) {
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

      return new FragmentCategoryAddBinding((FrameLayout) rootView, cancelButton, createButton,
          header, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
