package com.ss.android.ugc.aweme.tako.multipletemplate.gallery;

import X.C16G0;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes8.dex */
public final class TakoGalleryBottomSheetBehaviour extends BottomSheetBehavior<View> {
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public final boolean onInterceptTouchEvent(C16G0 c16g0, View view, MotionEvent motionEvent) {
        super.onInterceptTouchEvent(c16g0, view, motionEvent);
        return true;
    }
}
