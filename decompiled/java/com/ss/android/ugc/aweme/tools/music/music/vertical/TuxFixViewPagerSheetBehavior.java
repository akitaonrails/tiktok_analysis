package com.ss.android.ugc.aweme.tools.music.music.vertical;

import X.C20691215xu;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;

/* JADX INFO: loaded from: classes32.dex */
public class TuxFixViewPagerSheetBehavior extends TuxSheetBehavior<View> {
    @Override // com.bytedance.tux.sheet.sheet.TuxSheetBehavior
    public final View findScrollingChild(View view) {
        if (view == null || view.getVisibility() != 0) {
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
