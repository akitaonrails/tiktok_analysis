package com.ss.android.ugc.aweme.ecommerce.search.result.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;

/* JADX INFO: loaded from: classes11.dex */
public final class TuxSRPFixViewPagerSheetBehavior extends TuxSheetBehavior<View> {
    public final RecyclerView LJI(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView recyclerViewLJI = LJI(viewGroup.getChildAt(i));
                if (recyclerViewLJI != null) {
                    return recyclerViewLJI;
                }
            }
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            return null;
        }
        return null;
    }

    @Override // com.bytedance.tux.sheet.sheet.TuxSheetBehavior
    public final View findScrollingChild(View view) {
        return LJI(view);
    }
}
