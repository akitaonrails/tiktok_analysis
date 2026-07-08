package com.google.android.material.bottomsheet;

import X.C16G0;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes22.dex */
public final class CashierBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {
    public boolean LIZ;
    public boolean LIZIZ;

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    public final void setPeekHeight(int i) {
        if (!this.LIZ) {
            super.setPeekHeight(i);
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public final boolean onInterceptTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) {
        if (this.LIZIZ) {
            return true;
        }
        return super.onInterceptTouchEvent(c16g0, v, motionEvent);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public final boolean onTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) {
        if (this.LIZIZ) {
            return true;
        }
        return super.onTouchEvent(c16g0, v, motionEvent);
    }
}
