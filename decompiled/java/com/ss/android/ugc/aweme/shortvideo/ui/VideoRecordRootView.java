package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes23.dex */
public final class VideoRecordRootView extends FrameLayout {
    public Runnable LL;
    public long LLILLJJLI;
    public long LLILLL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LL = null;
    }

    public final long getFirstDrawnTimeMS() {
        return this.LLILLL;
    }

    public final long getFirstMeasureStartTimeMS() {
        return this.LLILLJJLI;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.LLILLL <= 0) {
            this.LLILLL = System.currentTimeMillis();
        }
        Runnable runnable = this.LL;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void setOnDrawnListener(Runnable runnable) {
        this.LL = runnable;
    }

    public VideoRecordRootView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = -1L;
        this.LLILLL = -1L;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.LLILLJJLI <= 0) {
            this.LLILLJJLI = System.currentTimeMillis();
        }
        super.onMeasure(i, i2);
    }
}
