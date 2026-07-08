package com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet;

import X.C16G0;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;

/* JADX INFO: loaded from: classes27.dex */
public final class TuxCashierSheetBehavior<V extends View> extends TuxSheetBehavior<V> {
    public boolean LJJIJLIJ;
    public boolean LJJIL;

    @Override // com.bytedance.tux.sheet.sheet.TuxSheetBehavior
    public final void setPeekHeight(int i) {
        if (!this.LJJIJLIJ) {
            setPeekHeight(i, false);
        }
    }

    @Override // com.bytedance.tux.sheet.sheet.TuxSheetBehavior, X.C16BC
    public final boolean onInterceptTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) {
        if (this.LJJIL) {
            return true;
        }
        return super.onInterceptTouchEvent(c16g0, v, motionEvent);
    }

    @Override // com.bytedance.tux.sheet.sheet.TuxSheetBehavior, X.C16BC
    public final boolean onTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) {
        if (this.LJJIL) {
            return true;
        }
        return super.onTouchEvent(c16g0, v, motionEvent);
    }
}
