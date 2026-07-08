package com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ui;

import X.AbstractC21586119dr;
import X.C16G0;
import X.C20733116Bd;
import X.C20733416Bg;
import X.C21586019dq;
import X.C418440Gaw;
import X.C426750GoL;
import X.C497820Jfg;
import X.C814420VxA;
import X.InterfaceC20733816Bk;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import com.ss.android.ugc.aweme.visualsearch.components.bottomsheet.SearchBottomSheetBehavior;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS432S0200000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class SearchSevenSplitScreenBehavior<V extends View> extends SearchBottomSheetBehavior<V> {
    public static final /* synthetic */ int LJJJJIZL = 0;
    public final Context LJJIJLIJ;
    public float LJJIL;
    public int LJJIZ;
    public Function1<? super Integer, Unit> LJJJ;
    public boolean LJJJI;
    public float LJJJIL;
    public float LJJJJ;
    public final C20733416Bg LJJJJI;

    public SearchSevenSplitScreenBehavior() {
        this(null, null);
    }

    @Override // com.ss.android.ugc.aweme.visualsearch.components.bottomsheet.SearchBottomSheetBehavior
    public final int LIZLLL(int i) {
        int i2 = this.LJJIZ;
        if (i2 > 0) {
            return i2;
        }
        return super.LIZLLL(i);
    }

    @Override // com.ss.android.ugc.aweme.visualsearch.components.bottomsheet.SearchBottomSheetBehavior
    public final void LJFF(int i) {
        this.LJJJ.invoke(Integer.valueOf(i));
    }

    @Override // com.ss.android.ugc.aweme.visualsearch.components.bottomsheet.SearchBottomSheetBehavior
    public final View findScrollingChild(View view) {
        return super.findScrollingChild(view);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.16Bg] */
    public SearchSevenSplitScreenBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJJIJLIJ = context;
        this.LJJIL = 0.08f;
        this.LJJIZ = -1;
        this.LJJJ = AFwS276S0000000_31.get$arr$(168);
        this.LJJJJI = new InterfaceC20733816Bk() { // from class: X.16Bg
            @Override // X.InterfaceC20733816Bk
            public final Interpolator create() {
                return C1619980sG4.LJIILIIL();
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.visualsearch.components.bottomsheet.SearchBottomSheetBehavior
    public final C21586019dq LIZIZ(C16G0 c16g0, AbstractC21586119dr abstractC21586119dr) {
        return C20733116Bd.LIZ(c16g0, this.LJJJJI, abstractC21586119dr, new AwS432S0200000_31(c16g0, (C16G0) this, 68));
    }

    @Override // com.ss.android.ugc.aweme.visualsearch.components.bottomsheet.SearchBottomSheetBehavior
    public final boolean shouldHide(View view, float f) {
        int i;
        if (view == null) {
            return true;
        }
        if (this.LJIIL && this.LJIILIIL) {
            return true;
        }
        if (view.getTop() < this.LJI) {
            return false;
        }
        float fAbs = (float) Math.abs((view.getTop() + (f * 0.1f)) - this.LJI);
        double d = fAbs;
        double d2 = this.LJII;
        if (this.LIZLLL) {
            i = -1;
        } else {
            i = this.LIZIZ;
        }
        if (d > Math.min(d2, i >> 1) || fAbs / this.LJIJI > this.LJJIL) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x010c  */
    @Override // com.ss.android.ugc.aweme.visualsearch.components.bottomsheet.SearchBottomSheetBehavior, X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(X.C16G0 r10, V r11, android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ui.SearchSevenSplitScreenBehavior.onInterceptTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // com.ss.android.ugc.aweme.visualsearch.components.bottomsheet.SearchBottomSheetBehavior, X.C16BC
    public final boolean onTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) {
        int iLIZIZ;
        if (motionEvent.getAction() == 2) {
            float rawY = motionEvent.getRawY() - this.LJJJIL;
            float rawX = motionEvent.getRawX() - this.LJJJJ;
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            Context context = this.LJJIJLIJ;
            boolean z = false;
            if (context != null && C426750GoL.LIZLLL(context)) {
                z = true;
            }
            if (z) {
                Context context2 = this.LJJIJLIJ;
                if (context2 != null) {
                    iLIZIZ = C497820Jfg.LIZIZ(context2) - iLIZIZ2;
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                }
                if ((rawX > 0.0f || this.LJJJJ <= iLIZIZ) && Math.abs(rawX) > Math.abs(rawY)) {
                    return true;
                }
            } else if ((rawX < 0.0f || this.LJJJJ >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))) && Math.abs(rawX) > Math.abs(rawY)) {
                return true;
            }
        }
        return super.onTouchEvent(c16g0, v, motionEvent);
    }
}
