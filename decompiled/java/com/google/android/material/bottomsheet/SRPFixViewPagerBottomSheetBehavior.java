package com.google.android.material.bottomsheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public final class SRPFixViewPagerBottomSheetBehavior extends BottomSheetBehavior<View> {
    public final RecyclerView LIZ(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView recyclerViewLIZ = LIZ(viewGroup.getChildAt(i));
                if (recyclerViewLIZ != null) {
                    return recyclerViewLIZ;
                }
            }
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    public final View findScrollingChild(View view) {
        return LIZ(view);
    }
}
