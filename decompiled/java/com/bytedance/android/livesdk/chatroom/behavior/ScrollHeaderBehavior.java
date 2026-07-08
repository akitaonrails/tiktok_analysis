package com.bytedance.android.livesdk.chatroom.behavior;

import X.C16BC;
import X.C16G0;
import X.C500260Jjc;
import Y.AObjectS360S0100000_17;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ScrollHeaderBehavior extends C16BC<View> {
    public AObjectS360S0100000_17 LIZ;

    public ScrollHeaderBehavior() {
    }

    public ScrollHeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.C16BC
    public final boolean layoutDependsOn(C16G0 c16g0, View view, View view2) {
        return Intrinsics.LJFF(view2, c16g0.findViewWithTag("suctionBottomView"));
    }

    @Override // X.C16BC
    public final boolean onDependentViewChanged(C16G0 c16g0, View view, View view2) {
        AObjectS360S0100000_17 aObjectS360S0100000_17 = this.LIZ;
        if (aObjectS360S0100000_17 != null) {
            aObjectS360S0100000_17.invoke(view2);
        }
        c16g0.requestLayout();
        return false;
    }

    @Override // X.C16BC
    public final boolean onMeasureChild(C16G0 c16g0, View view, int i, int i2, int i3, int i4) {
        View viewFindViewWithTag;
        int i5;
        int i6 = view.getLayoutParams().height;
        int i7 = 0;
        if ((i6 != -2 && i6 != -1) || (viewFindViewWithTag = c16g0.findViewWithTag("suctionBottomView")) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size == 0) {
            size = c16g0.getHeight();
        }
        int iMin = Math.min((int) Math.abs(viewFindViewWithTag.getTranslationY()), viewFindViewWithTag.getMeasuredHeight());
        if (C500260Jjc.LJJJJIZL(viewFindViewWithTag)) {
            i7 = iMin;
        }
        int i8 = size - i7;
        if (i6 == -1) {
            i5 = 1073741824;
        } else {
            i5 = Integer.MIN_VALUE;
        }
        c16g0.LJIILIIL(view, i, i2, View.MeasureSpec.makeMeasureSpec(i8, i5), i4);
        return true;
    }
}
