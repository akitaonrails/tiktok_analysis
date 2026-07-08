package com.ss.android.ugc.aweme.toolbar.widget;

import X.C01GW;
import X.C2188191AkT;
import X.C452501pT;
import X.C788530UwV;
import X.InterfaceC1318780kQG;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS564S0100000_20;

/* JADX INFO: loaded from: classes21.dex */
public final class ToolbarScrollView extends ScrollView {
    public int LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public final C01GW LLILZ;
    public InterfaceC1318780kQG LLILZIL;
    public Function0<Rect> LLILZLL;
    public int LLIZ;

    private final Runnable getStopScrollRunnable() {
        return (Runnable) this.LLILZ.getValue();
    }

    public final void LIZ() {
        HandlerHook.viewPostDelay(this, getStopScrollRunnable(), 100L);
    }

    public final Function0<Rect> getGetFirstItemRect() {
        return this.LLILZLL;
    }

    public final int getMaxHeight() {
        return this.LLIZ;
    }

    public final InterfaceC1318780kQG getScrollStateChangeListener() {
        return this.LLILZIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (C788530UwV.LIZ("dispatchScrollViewTouchEvent")) {
            C2188191AkT.LIZLLL();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0053  */
    @Override // android.widget.ScrollView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            kotlin.jvm.functions.Function0<android.graphics.Rect> r0 = r4.LLILZLL
            if (r0 == 0) goto L24
            java.lang.Object r2 = r0.invoke()
            android.graphics.Rect r2 = (android.graphics.Rect) r2
        La:
            r3 = 0
            if (r2 == 0) goto L26
            int r0 = r2.left
            float r1 = (float) r0
            float r0 = r5.getRawX()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L23
            int r0 = r2.right
            float r1 = (float) r0
            float r0 = r5.getRawX()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L26
        L23:
            return r3
        L24:
            r2 = 0
            goto La
        L26:
            X.0kQG r0 = r4.LLILZIL
            if (r0 != 0) goto L2f
            boolean r0 = super.onTouchEvent(r5)
            return r0
        L2f:
            int r2 = r5.getAction()
            if (r2 == 0) goto L5f
            r1 = 1
            if (r2 == r1) goto L53
            r0 = 2
            if (r2 == r0) goto L43
            r0 = 3
            if (r2 == r0) goto L53
        L3e:
            boolean r0 = super.onTouchEvent(r5)
            return r0
        L43:
            boolean r0 = r4.LLILLL
            if (r0 != 0) goto L50
            X.0kQG r0 = r4.LLILZIL
            if (r0 == 0) goto L4e
            r0.LIZ(r3)
        L4e:
            r4.LLILLL = r1
        L50:
            r4.LLILLJJLI = r1
            goto L3e
        L53:
            r4.LLILLJJLI = r3
            int r0 = r4.getScrollY()
            r4.LL = r0
            r4.LIZ()
            goto L3e
        L5f:
            java.lang.Runnable r0 = r4.getStopScrollRunnable()
            com.bytedance.bpea.transmit.hook.HandlerHook.viewRemoveCallbacks(r4, r0)
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.toolbar.widget.ToolbarScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setGetFirstItemRect(Function0<Rect> function0) {
        this.LLILZLL = function0;
    }

    public final void setMaxHeight(int i) {
        this.LLIZ = i;
        invalidate();
    }

    public final void setScrollStateChangeListener(InterfaceC1318780kQG interfaceC1318780kQG) {
        this.LLILZIL = interfaceC1318780kQG;
    }

    public ToolbarScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = -1;
        this.LLILZ = C452501pT.LIZIZ(new AwS564S0100000_20(this, 44));
        this.LLIZ = -1;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.LLIZ;
        if (i3 > 0) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE));
        } else {
            super.onMeasure(i, i2);
        }
    }
}
