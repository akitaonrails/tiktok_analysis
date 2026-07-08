package com.ss.android.ugc.aweme.tako.botpage.bottombox.view;

import X.C16G0;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoInputExpandBehavior extends BottomSheetBehavior<View> {
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public final boolean onInterceptTouchEvent(C16G0 c16g0, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2) {
            return false;
        }
        return super.onInterceptTouchEvent(c16g0, view, motionEvent);
    }
}
