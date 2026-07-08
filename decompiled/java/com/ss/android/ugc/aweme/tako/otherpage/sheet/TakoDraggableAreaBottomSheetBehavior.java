package com.ss.android.ugc.aweme.tako.otherpage.sheet;

import X.C16G0;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes8.dex */
public final class TakoDraggableAreaBottomSheetBehavior extends BottomSheetBehavior<View> {
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public final void onNestedPreScroll(C16G0 c16g0, View view, View view2, int i, int i2, int[] iArr, int i3) {
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public final boolean onStartNestedScroll(C16G0 c16g0, View view, View view2, View view3, int i, int i2) {
        return false;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public final boolean onInterceptTouchEvent(C16G0 c16g0, View view, MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(c16g0, view, motionEvent);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public final boolean onTouchEvent(C16G0 c16g0, View view, MotionEvent motionEvent) {
        return super.onTouchEvent(c16g0, view, motionEvent);
    }
}
