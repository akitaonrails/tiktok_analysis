package com.ss.android.ugc.aweme.ecommerce.search.vision.behavior;

import X.C16G0;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes8.dex */
public final class PhotoSearchPartialDisableBottomSheetBehavior extends BottomSheetBehavior<View> {
    public View LIZ;

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public final boolean onInterceptTouchEvent(C16G0 c16g0, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View view2 = this.LIZ;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (view2 != null) {
                int[] iArr = new int[2];
                view2.getLocationOnScreen(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                int width = view2.getWidth() + i;
                int height = view2.getHeight() + i2;
                if (i <= x && x <= width && i2 <= y && y <= height) {
                    return false;
                }
            }
        }
        return super.onInterceptTouchEvent(c16g0, view, motionEvent);
    }
}
