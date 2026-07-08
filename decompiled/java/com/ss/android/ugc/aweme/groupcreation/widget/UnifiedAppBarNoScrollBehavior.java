package com.ss.android.ugc.aweme.groupcreation.widget;

import X.C16G0;
import X.C16GW;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.im.common.widget.appbar.IMAppBarLayout$Behavior;

/* JADX INFO: loaded from: classes32.dex */
public final class UnifiedAppBarNoScrollBehavior extends IMAppBarLayout$Behavior {
    public boolean LJIILLIIL;

    public UnifiedAppBarNoScrollBehavior() {
        this.LJIILLIIL = true;
    }

    public UnifiedAppBarNoScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJIILLIIL = true;
    }

    @Override // com.ss.android.ugc.aweme.im.common.widget.appbar.IMAppBarLayout$Behavior
    /* JADX INFO: renamed from: LIZJ */
    public final boolean onStartNestedScroll(C16G0 c16g0, C16GW c16gw, View view, View view2, int i, int i2) {
        if (!this.LJIILLIIL) {
            return false;
        }
        return super.onStartNestedScroll(c16g0, c16gw, view, view2, i, i2);
    }

    @Override // com.ss.android.ugc.aweme.im.common.widget.appbar.IMAppBarLayout$Behavior, X.C16BC
    public final /* bridge */ /* synthetic */ boolean onStartNestedScroll(C16G0 c16g0, View view, View view2, View view3, int i, int i2) {
        return onStartNestedScroll(c16g0, (C16GW) view, view2, view3, i, i2);
    }
}
