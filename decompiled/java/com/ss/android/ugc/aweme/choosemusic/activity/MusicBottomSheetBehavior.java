package com.ss.android.ugc.aweme.choosemusic.activity;

import X.C16G0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;

/* JADX INFO: loaded from: classes32.dex */
public final class MusicBottomSheetBehavior<V extends View> extends ViewPagerBottomSheetBehavior<V> {
    public MusicBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior, X.C16BC
    public final boolean onInterceptTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(c16g0, v, motionEvent);
    }
}
