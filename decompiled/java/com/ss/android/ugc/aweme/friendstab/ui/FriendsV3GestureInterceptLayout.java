package com.ss.android.ugc.aweme.friendstab.ui;

import X.C01GW;
import X.C2188811AlT;
import X.C452501pT;
import X.EnumC998580c5o;
import X.InterfaceC998590c5p;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import kotlin.Pair;
import kotlin.jvm.internal.AwS417S0200000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class FriendsV3GestureInterceptLayout extends FrameLayout {
    public EnumC998580c5o LL;
    public final int LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public InterfaceC998590c5p LLILZIL;
    public final C01GW LLILZLL;

    public FriendsV3GestureInterceptLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final GestureDetector getGestureDetector() {
        return (GestureDetector) this.LLILZLL.getValue();
    }

    public final boolean LIZJ() {
        EnumC998580c5o enumC998580c5o = this.LL;
        return enumC998580c5o == EnumC998580c5o.LL || enumC998580c5o == EnumC998580c5o.LLILZIL;
    }

    public final boolean LIZIZ(MotionEvent motionEvent) {
        float fAbs = Math.abs(motionEvent.getX() - this.LLILLL);
        float fAbs2 = Math.abs(motionEvent.getY() - this.LLILZ);
        int i = this.LLILLJJLI;
        if (fAbs <= i && fAbs2 <= i) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onInterceptTouchEvent, event=");
        sbLIZ.append(motionEvent.getActionMasked());
        C2188811AlT.LIZIZ(sbLIZ);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2) {
                EnumC998580c5o enumC998580c5o = this.LL;
                EnumC998580c5o enumC998580c5o2 = EnumC998580c5o.LLILZ;
                if (enumC998580c5o != enumC998580c5o2 && LIZIZ(motionEvent)) {
                    this.LL = enumC998580c5o2;
                }
            }
        } else {
            EnumC998580c5o enumC998580c5o3 = EnumC998580c5o.LL;
            this.LL = enumC998580c5o3;
            Pair pairLIZ = LIZ(this, motionEvent.getRawX(), motionEvent.getRawY());
            Object first = pairLIZ.getFirst();
            boolean zBooleanValue = ((Boolean) pairLIZ.getSecond()).booleanValue();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onInterceptTouchEvent, clickableChild=");
            sbLIZ2.append(first);
            sbLIZ2.append(" under [");
            sbLIZ2.append(motionEvent.getRawX());
            sbLIZ2.append(", ");
            sbLIZ2.append(motionEvent.getRawY());
            sbLIZ2.append(']');
            C2188811AlT.LIZIZ(sbLIZ2);
            if (zBooleanValue) {
                enumC998580c5o3 = EnumC998580c5o.LLILZIL;
            } else if (first != null) {
                enumC998580c5o3 = EnumC998580c5o.LLILLJJLI;
            }
            this.LL = enumC998580c5o3;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("onInterceptTouchEvent, currentMode=");
        sbLIZ3.append(this.LL);
        C2188811AlT.LIZIZ(sbLIZ3);
        if (LIZJ()) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("onInterceptTouchEvent, deliver ");
            sbLIZ4.append(motionEvent.getActionMasked());
            sbLIZ4.append(" to gestureDetector");
            C2188811AlT.LIZIZ(sbLIZ4);
            getGestureDetector().onTouchEvent(motionEvent);
        }
        EnumC998580c5o enumC998580c5o4 = this.LL;
        if (enumC998580c5o4 != EnumC998580c5o.LLILLL && enumC998580c5o4 != EnumC998580c5o.LLILZIL) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onTouchEvent, event=");
        sbLIZ.append(motionEvent);
        sbLIZ.append(", currentMode=");
        sbLIZ.append(this.LL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!LIZJ()) {
            return false;
        }
        getGestureDetector().onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 2) {
            EnumC998580c5o enumC998580c5o = this.LL;
            EnumC998580c5o enumC998580c5o2 = EnumC998580c5o.LLILZ;
            if (enumC998580c5o != enumC998580c5o2 && LIZIZ(motionEvent)) {
                this.LL = enumC998580c5o2;
                return true;
            }
            return true;
        }
        return true;
    }

    public final void setGestureListener(InterfaceC998590c5p interfaceC998590c5p) {
        this.LLILZIL = interfaceC998590c5p;
    }

    public FriendsV3GestureInterceptLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LL = EnumC998580c5o.LL;
        this.LLILLJJLI = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LLILZLL = C452501pT.LIZIZ(new AwS417S0200000_16(context, this, 24));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
    
        return new kotlin.Pair(null, java.lang.Boolean.TRUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
    
        r1 = X.C2188811AlT.LIZ();
        r1.append("findClickableChildUnderPoint finish with child ");
        r1.append(r2);
        X.C2188811AlT.LIZIZ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:
    
        return new kotlin.Pair(r2, java.lang.Boolean.FALSE);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LIZ(android.view.ViewGroup r6, float r7, float r8) {
        /*
            X.0e8y r1 = new X.0e8y
            r0 = 4
            r1.<init>(r6, r0)
            java.util.Iterator r6 = r1.iterator()
        La:
            r1 = r6
            X.0e8x r1 = (X.C1077410e8x) r1
            boolean r0 = r1.hasNext()
            r3 = 0
            if (r0 == 0) goto Lb8
            java.lang.Object r2 = r1.next()
            android.view.View r2 = (android.view.View) r2
            int r0 = r2.getVisibility()
            r5 = 1
            r1 = 0
            if (r0 != 0) goto La
            r0 = 2
            int[] r4 = new int[r0]
            r2.getLocationOnScreen(r4)
            r1 = r4[r1]
            float r0 = (float) r1
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto La
            int r0 = r2.getWidth()
            int r1 = r1 + r0
            float r0 = (float) r1
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 >= 0) goto La
            r1 = r4[r5]
            float r0 = (float) r1
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 < 0) goto La
            int r0 = r2.getHeight()
            int r1 = r1 + r0
            float r0 = (float) r1
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 >= 0) goto La
            boolean r0 = r2.isClickable()
            if (r0 != 0) goto La1
            boolean r0 = r2.hasOnClickListeners()
            if (r0 != 0) goto La1
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto La
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "findClickableChildUnderPoint continue to find recursively in "
            r1.append(r0)
            r1.append(r2)
            X.C2188811AlT.LIZIZ(r1)
            boolean r0 = r2 instanceof X.C487390J9l
            if (r0 != 0) goto L99
            boolean r0 = r2 instanceof X.C725850Sdb
            if (r0 != 0) goto L99
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            kotlin.Pair r0 = LIZ(r2, r7, r8)
            java.lang.Object r2 = r0.getFirst()
            java.lang.Object r0 = r0.getSecond()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L8f
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r3, r1)
            return r0
        L8f:
            if (r2 == 0) goto La
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            return r0
        L99:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r3, r1)
            return r0
        La1:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "findClickableChildUnderPoint finish with child "
            r1.append(r0)
            r1.append(r2)
            X.C2188811AlT.LIZIZ(r1)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            return r0
        Lb8:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.ui.FriendsV3GestureInterceptLayout.LIZ(android.view.ViewGroup, float, float):kotlin.Pair");
    }
}
