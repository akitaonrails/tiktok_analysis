package com.google.android.material.bottomsheet;

import X.C20691215xu;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes32.dex */
public final class BBFixViewPagerBottomSheetBehavior extends BottomSheetBehavior<View> {
    public final void LIZ(View view) {
        this.nestedScrollingChildRef = new WeakReference<>(findScrollingChild(view));
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    public final View findScrollingChild(View view) {
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
