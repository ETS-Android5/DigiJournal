// Generated by view binder compiler. Do not edit!
package com.s22.digijournal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.navigation.NavigationView;
import com.s22.digijournal.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityNavigationDrawerBinding implements ViewBinding {
  @NonNull
  private final DrawerLayout rootView;

  @NonNull
  public final AppBarNavigationDrawerBinding appBarNavigationDrawer;

  @NonNull
  public final DrawerLayout drawerLayout;

  @NonNull
  public final NavigationView navView;

  private ActivityNavigationDrawerBinding(@NonNull DrawerLayout rootView,
      @NonNull AppBarNavigationDrawerBinding appBarNavigationDrawer,
      @NonNull DrawerLayout drawerLayout, @NonNull NavigationView navView) {
    this.rootView = rootView;
    this.appBarNavigationDrawer = appBarNavigationDrawer;
    this.drawerLayout = drawerLayout;
    this.navView = navView;
  }

  @Override
  @NonNull
  public DrawerLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityNavigationDrawerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityNavigationDrawerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_navigation_drawer, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityNavigationDrawerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.app_bar_navigation_drawer;
      View appBarNavigationDrawer = ViewBindings.findChildViewById(rootView, id);
      if (appBarNavigationDrawer == null) {
        break missingId;
      }
      AppBarNavigationDrawerBinding binding_appBarNavigationDrawer = AppBarNavigationDrawerBinding.bind(appBarNavigationDrawer);

      DrawerLayout drawerLayout = (DrawerLayout) rootView;

      id = R.id.nav_view;
      NavigationView navView = ViewBindings.findChildViewById(rootView, id);
      if (navView == null) {
        break missingId;
      }

      return new ActivityNavigationDrawerBinding((DrawerLayout) rootView,
          binding_appBarNavigationDrawer, drawerLayout, navView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
