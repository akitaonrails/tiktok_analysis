package com.ss.android.ugc.aweme.explore.ui.animation;

import X.C1086520eNe;
import X.C16G0;
import X.C16GX;
import X.C497820Jfg;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout$Behavior;

/* JADX INFO: loaded from: classes28.dex */
public final class FixedThresholdAppBarBehavior extends AppBarLayout$Behavior {
    public final int LIZ;
    public boolean LIZIZ;

    public static C1086520eNe LIZ(View view) {
        if (view instanceof C1086520eNe) {
            return (C1086520eNe) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C1086520eNe c1086520eNeLIZ = LIZ(viewGroup.getChildAt(i));
                if (c1086520eNeLIZ != null) {
                    return c1086520eNeLIZ;
                }
            }
            return null;
        }
        return null;
    }

    public FixedThresholdAppBarBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LIZ = (int) (((double) C497820Jfg.LIZ(context)) * 0.1d);
        this.LIZIZ = true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final void onNestedPreScroll(C16G0 c16g0, C16GX c16gx, View view, int i, int i2, int[] iArr, int i3) {
        int iComputeVerticalScrollOffset;
        C1086520eNe c1086520eNeLIZ;
        if (i2 > 0 && this.LIZIZ) {
            if ((view instanceof ViewGroup) && view != null && (c1086520eNeLIZ = LIZ(view)) != null) {
                iComputeVerticalScrollOffset = c1086520eNeLIZ.computeVerticalScrollOffset();
            } else {
                iComputeVerticalScrollOffset = 0;
            }
            if (iComputeVerticalScrollOffset < this.LIZ) {
                return;
            }
        }
        super.onNestedPreScroll(c16g0, c16gx, view, i, i2, iArr, i3);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, X.C16BC
    public final /* bridge */ /* synthetic */ void onNestedPreScroll(C16G0 c16g0, View view, View view2, int i, int i2, int[] iArr, int i3) {
        onNestedPreScroll(c16g0, (C16GX) view, view2, i, i2, iArr, i3);
    }
}
