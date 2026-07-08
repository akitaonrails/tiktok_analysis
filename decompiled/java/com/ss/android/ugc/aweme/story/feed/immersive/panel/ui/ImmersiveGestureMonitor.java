package com.ss.android.ugc.aweme.story.feed.immersive.panel.ui;

import X.C01GW;
import X.C14KQ;
import X.C1600780rl6;
import X.C21616519il;
import X.C444960Hcc;
import X.C452501pT;
import X.InterfaceC1619900sFw;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.story.experiment.StoryGestureThreshold;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class ImmersiveGestureMonitor extends FrameLayout {
    public InterfaceC1619900sFw LL;
    public float LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public long LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;

    public ImmersiveGestureMonitor() {
        throw null;
    }

    private final float getOldHorizontalThreshold() {
        return 8.0f;
    }

    private final float getNewHorizontalThreshold() {
        return ((StoryGestureThreshold) C1600780rl6.LIZIZ.getValue()).x * C14KQ.LJIIIIZZ(getContext());
    }

    private final float getScaledTouchSlop() {
        return ((Number) this.LLJI.getValue()).floatValue();
    }

    private final C21616519il getSpringAnimation() {
        return (C21616519il) this.LLJIJIL.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (getSpringAnimation().LJFF) {
            getSpringAnimation().LIZLLL();
        }
    }

    public final InterfaceC1619900sFw getEventListener$story_release() {
        return this.LL;
    }

    public final boolean LIZ(float f) {
        if (!C1600780rl6.LIZ() && f >= getOldHorizontalThreshold()) {
            return true;
        }
        if (C1600780rl6.LIZ() && f >= getNewHorizontalThreshold()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        boolean z;
        boolean z2;
        InterfaceC1619900sFw interfaceC1619900sFw;
        InterfaceC1619900sFw interfaceC1619900sFw2;
        if ((!C444960Hcc.LIZIZ() && i > 0) || (C444960Hcc.LIZIZ() && i < 0)) {
            z = true;
        } else {
            z = false;
        }
        if ((!C444960Hcc.LIZIZ() && i < 0) || (C444960Hcc.LIZIZ() && i > 0)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && (interfaceC1619900sFw2 = this.LL) != null && interfaceC1619900sFw2.Qc() && C1600780rl6.LIZ()) {
            return true;
        }
        if (z2 && (interfaceC1619900sFw = this.LL) != null && interfaceC1619900sFw.wl() && C1600780rl6.LIZ()) {
            return true;
        }
        return super.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        InterfaceC1619900sFw interfaceC1619900sFw;
        if (i > 0 && (interfaceC1619900sFw = this.LL) != null && interfaceC1619900sFw.f5()) {
            return true;
        }
        return super.canScrollVertically(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.immersive.panel.ui.ImmersiveGestureMonitor.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setEventListener$story_release(InterfaceC1619900sFw interfaceC1619900sFw) {
        this.LL = interfaceC1619900sFw;
    }

    public ImmersiveGestureMonitor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJ = -1L;
        this.LLJI = C452501pT.LIZIZ(new AwS551S0100000_7(context, 426));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1160));
    }
}
