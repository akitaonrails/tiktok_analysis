package com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util;

import X.C16G0;
import X.C16GW;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.common.widget.appbar.IMAppBarLayout$Behavior;

/* JADX INFO: loaded from: classes32.dex */
public final class MaximumScrollableBehavior extends IMAppBarLayout$Behavior {
    public final RecyclerView LJIILLIIL;
    public final C16GW LJIIZILJ;
    public final View LJIJ;
    public final int LJIJI;

    public final int LJI() {
        int height = this.LJIILLIIL.getHeight();
        ViewGroup.LayoutParams layoutParams = this.LJIILLIIL.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        return Math.max(((height + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0)) + this.LJIIZILJ.getHeight()) - (this.LJIJ.getHeight() - this.LJIJI), 0);
    }

    @Override // com.ss.android.ugc.aweme.im.common.widget.appbar.IMViewOffsetBehavior
    public final boolean setTopAndBottomOffset(int i) {
        int iLJI = LJI();
        if (iLJI <= Math.abs(i)) {
            i = -iLJI;
        }
        return super.setTopAndBottomOffset(i);
    }

    public MaximumScrollableBehavior(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, C16GW c16gw, View view, int i) {
        this.LJIILLIIL = viewOnAttachStateChangeListenerC20604515jv;
        this.LJIIZILJ = c16gw;
        this.LJIJ = view;
        this.LJIJI = i;
    }

    @Override // com.ss.android.ugc.aweme.im.common.widget.appbar.IMAppBarLayout$Behavior
    /* JADX INFO: renamed from: LIZLLL */
    public final int setHeaderTopBottomOffset(C16G0 c16g0, C16GW c16gw, int i, int i2, int i3) {
        return super.setHeaderTopBottomOffset(c16g0, c16gw, i, Math.max(i2, -LJI()), i3);
    }

    @Override // com.ss.android.ugc.aweme.im.common.widget.appbar.IMAppBarLayout$Behavior, com.ss.android.ugc.aweme.im.common.widget.appbar.IMHeaderBehavior
    public final /* bridge */ /* synthetic */ int setHeaderTopBottomOffset(C16G0 c16g0, View view, int i, int i2, int i3) {
        return setHeaderTopBottomOffset(c16g0, (C16GW) view, i, i2, i3);
    }
}
