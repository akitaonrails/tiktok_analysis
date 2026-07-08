package com.ss.android.ugc.aweme.tako.botpage.bottombox.view;

import X.C16G0;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;

/* JADX INFO: loaded from: classes27.dex */
public final class TuxTakoInputExpandBehavior extends TuxSheetBehavior<View> {
    @Override // com.bytedance.tux.sheet.sheet.TuxSheetBehavior, X.C16BC
    public final boolean onInterceptTouchEvent(C16G0 c16g0, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2) {
            return false;
        }
        return super.onInterceptTouchEvent(c16g0, view, motionEvent);
    }
}
