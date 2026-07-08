package com.google.android.material.bottomsheet;

import X.C20691215xu;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes32.dex */
public class FixViewPagerBottomSheetBehavior extends BottomSheetBehavior<View> {
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    public final View findScrollingChild(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view instanceof ViewPager) {
            View viewLIZ = C20691215xu.LIZ((ViewPager) view);
            if (viewLIZ == null) {
                return null;
            }
            View viewFindScrollingChild = findScrollingChild(viewLIZ);
            if (viewFindScrollingChild != null) {
                return viewFindScrollingChild;
            }
        }
        return super.findScrollingChild(view);
    }
}
