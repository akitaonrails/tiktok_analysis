package com.ss.android.ugc.aweme.views;

import X.C0ZOA;
import X.C0ZOE;
import X.C0ZOM;
import X.C1954807lC;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class InterceptingConstraintLayout extends ConstraintLayout {
    public C0ZOE LL;

    public InterceptingConstraintLayout(Context context) {
        this(context, null, 6, 0);
    }

    public InterceptingConstraintLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C0ZOE c0zoe = this.LL;
        if (Intrinsics.LJFF(c0zoe, C0ZOM.LIZ)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (c0zoe instanceof C0ZOA) {
            return true;
        }
        throw new C1954807lC();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0ZOE c0zoe = this.LL;
        if (Intrinsics.LJFF(c0zoe, C0ZOM.LIZ)) {
            return super.onTouchEvent(motionEvent);
        }
        if (c0zoe instanceof C0ZOA) {
            Function2<ViewGroup, MotionEvent, Unit> function2 = ((C0ZOA) c0zoe).LIZ;
            if (function2 != null) {
                function2.invoke(this, motionEvent);
                return true;
            }
            return true;
        }
        throw new C1954807lC();
    }

    public final void setMode(C0ZOE c0zoe) {
        this.LL = c0zoe;
    }

    public InterceptingConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C0ZOM.LIZ;
    }

    public /* synthetic */ InterceptingConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
