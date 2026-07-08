package com.ss.android.ugc.aweme.innerpush.ui;

import X.AbstractC21616419ik;
import X.C1380390m1d;
import X.C20731216Ak;
import X.C21581419d6;
import X.C21616519il;
import X.C418440Gaw;
import X.C497820Jfg;
import X.C814420VxA;
import X.InterfaceC1427630nFp;
import X.InterfaceC20731416Am;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ss.android.ugc.aweme.innerpush.ui.InnerPushPullUpLayout;

/* JADX INFO: loaded from: classes32.dex */
public final class InnerPushPullUpLayout extends C1380390m1d {
    public float LLIZLLLIL;
    public boolean LLJ;
    public final int LLJI;
    public final int LLJIJIL;
    public final C21616519il LLJILJIL;
    public boolean LLJILJILJ;

    public InnerPushPullUpLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final boolean getAnimating() {
        return this.LLJILJILJ;
    }

    public final boolean getTouchOutSide() {
        return this.LLJ;
    }

    @Override // X.C1380390m1d, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        if (((Boolean) C20731216Ak.LIZIZ.getValue()).booleanValue()) {
            if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
                if (numValueOf.intValue() == 0) {
                    this.LLILLJJLI = motionEvent.getY();
                    this.LLIZLLLIL = motionEvent.getY();
                    Rect rect = new Rect();
                    View view = this.LLILLL;
                    if (view != null) {
                        view.getHitRect(rect);
                    }
                    int i = rect.left;
                    int i2 = this.LLJI;
                    int i3 = rect.top;
                    int i4 = this.LLJIJIL;
                    rect.set(i + i2, i3 + i4, rect.right + i2, rect.bottom + i4);
                    this.LLJ = !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
                } else {
                    if (numValueOf.intValue() == 2) {
                        if (Math.abs(this.LLILLJJLI - motionEvent.getY()) > 3.0f && this.LLILLJJLI - motionEvent.getY() > ViewConfiguration.get(getContext()).getScaledTouchSlop() - C497820Jfg.LIZJ(getContext())) {
                            return true;
                        }
                        return false;
                    }
                    if (numValueOf.intValue() == 3 || numValueOf.intValue() == 1) {
                        this.LLJ = false;
                        return false;
                    }
                }
            }
            return false;
        }
        if (motionEvent != null) {
            if (motionEvent.getAction() == 0) {
                this.LLILLJJLI = motionEvent.getY();
            } else {
                if (motionEvent.getAction() == 2 && Math.abs(this.LLILLJJLI - motionEvent.getY()) > 3.0f && this.LLILLJJLI - motionEvent.getY() > ViewConfiguration.get(getContext()).getScaledTouchSlop() - C497820Jfg.LIZJ(getContext())) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        if (java.lang.Math.abs(r0) > 1000.0f) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    @Override // X.C1380390m1d, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.innerpush.ui.InnerPushPullUpLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setAnimating(boolean z) {
        this.LLJILJILJ = z;
    }

    public final void setTouchOutSide(boolean z) {
        this.LLJ = z;
    }

    public InnerPushPullUpLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        this.LLJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        C21616519il c21616519il = new C21616519il(this, AbstractC21616419ik.LJIL);
        C21581419d6 c21581419d6 = new C21581419d6(0.0f);
        c21581419d6.LIZ(0.85f);
        c21581419d6.LIZIZ(522.0f);
        c21616519il.LJJ = c21581419d6;
        c21616519il.LIZJ(new InterfaceC20731416Am() { // from class: X.16Ah
            @Override // X.InterfaceC20731416Am
            public final void LIZ(float f, float f2) {
                this.LIZ.setAnimating(true);
            }
        });
        c21616519il.LIZIZ(new InterfaceC1427630nFp() { // from class: X.16Ag
            @Override // X.InterfaceC1427630nFp
            public final void LIZ(AbstractC21616419ik abstractC21616419ik, boolean z, float f, float f2) {
                InnerPushPullUpLayout innerPushPullUpLayout = this.LIZ;
                innerPushPullUpLayout.LLIZLLLIL = 0.0f;
                innerPushPullUpLayout.setAnimating(false);
            }
        });
        this.LLJILJIL = c21616519il;
    }
}
