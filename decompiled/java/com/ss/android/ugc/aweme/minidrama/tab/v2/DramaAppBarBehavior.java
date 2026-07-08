package com.ss.android.ugc.aweme.minidrama.tab.v2;

import X.AbstractC20746216Ge;
import X.C16G0;
import X.C16GX;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout$Behavior;

/* JADX INFO: loaded from: classes32.dex */
public final class DramaAppBarBehavior extends AppBarLayout$Behavior {
    public boolean LIZ;
    public boolean LIZIZ;

    public DramaAppBarBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setDragCallback(new AbstractC20746216Ge() { // from class: X.16Gd
            @Override // X.C16GK
            public final boolean LIZ(C16GX c16gx) {
                return this.LIZ.LIZ;
            }
        });
    }

    @Override // X.C16BC
    public final boolean onNestedFling(C16G0 c16g0, View view, View view2, float f, float f2, boolean z) {
        if (this.LIZIZ && super.onNestedFling(c16g0, view, view2, f, f2, z)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final boolean onStartNestedScroll(C16G0 c16g0, C16GX c16gx, View view, View view2, int i, int i2) {
        if (this.LIZIZ && super.onStartNestedScroll(c16g0, c16gx, view, view2, i, i2)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, X.C16BC
    public final /* bridge */ /* synthetic */ boolean onStartNestedScroll(C16G0 c16g0, View view, View view2, View view3, int i, int i2) {
        return onStartNestedScroll(c16g0, (C16GX) view, view2, view3, i, i2);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final void onNestedPreScroll(C16G0 c16g0, C16GX c16gx, View view, int i, int i2, int[] iArr, int i3) {
        if (!this.LIZIZ) {
            return;
        }
        super.onNestedPreScroll(c16g0, c16gx, view, i, i2, iArr, i3);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, X.C16BC
    public final /* bridge */ /* synthetic */ void onNestedPreScroll(C16G0 c16g0, View view, View view2, int i, int i2, int[] iArr, int i3) {
        onNestedPreScroll(c16g0, (C16GX) view, view2, i, i2, iArr, i3);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final void onNestedScroll(C16G0 c16g0, C16GX c16gx, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (!this.LIZIZ) {
            return;
        }
        super.onNestedScroll(c16g0, c16gx, view, i, i2, i3, i4, i5, iArr);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, X.C16BC
    public final /* bridge */ /* synthetic */ void onNestedScroll(C16G0 c16g0, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(c16g0, (C16GX) view, view2, i, i2, i3, i4, i5, iArr);
    }
}
