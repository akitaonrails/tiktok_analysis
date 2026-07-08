package com.ss.android.ugc.aweme.inbox.bulletin;

import X.C20691215xu;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;

/* JADX INFO: loaded from: classes32.dex */
public final class TuxBBFixViewPagerSheetBehavior extends TuxSheetBehavior<View> {
    @Override // com.bytedance.tux.sheet.sheet.TuxSheetBehavior
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
