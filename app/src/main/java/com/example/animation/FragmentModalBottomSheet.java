package com.example.animation;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class FragmentModalBottomSheet extends BottomSheetDialogFragment  {
    @SuppressLint("RestrictedApi")
    @Override
    public void setupDialog(@NonNull Dialog dialog, int style) {
        super.setupDialog(dialog, style);
        View contentView=View.inflate(getContext(),R.layout.fragment_modal_bottomsheet,null);
        dialog.setContentView(contentView);

        CoordinatorLayout.LayoutParams params=(CoordinatorLayout.LayoutParams)((View) contentView.getParent()).getLayoutParams();
        CoordinatorLayout.Behavior behavior=params.getBehavior();


    }
}
