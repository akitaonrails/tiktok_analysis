package com.ss.android.ugc.aweme.photo;

import X.C16G0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;

/* JADX INFO: loaded from: classes32.dex */
public final class LocalViewPagerBottomSheetBehavior<V extends View> extends ViewPagerBottomSheetBehavior<V> {
    public LocalViewPagerBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior, X.C16BC
    public final void onNestedPreScroll(C16G0 c16g0, V v, View view, int i, int i2, int[] iArr) {
        if (Integer.valueOf(view.getId()) != null) {
            return;
        }
        super.onNestedPreScroll(c16g0, v, view, i, i2, iArr);
    }
}
