package com.ss.android.ugc.aweme.ecommerce.search.result.ui;

import X.C16G0;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes11.dex */
public final class HalfShopBehavior extends BottomSheetBehavior<View> {
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public final boolean onInterceptTouchEvent(C16G0 c16g0, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2) {
            return false;
        }
        return super.onInterceptTouchEvent(c16g0, view, motionEvent);
    }
}
