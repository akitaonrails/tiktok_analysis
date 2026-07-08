package com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util;

import X.C16G0;
import X.C16GW;
import android.view.View;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.im.common.widget.appbar.IMAppBarLayout$Behavior;

/* JADX INFO: loaded from: classes32.dex */
public final class NavBarMaximumScrollableBehavior extends IMAppBarLayout$Behavior {
    public final View LJIILLIIL;
    public final C16GW LJIIZILJ;

    @Override // com.ss.android.ugc.aweme.im.common.widget.appbar.IMViewOffsetBehavior
    public final boolean setTopAndBottomOffset(int i) {
        int iMax = Math.max(this.LJIIZILJ.getMeasuredHeight() - this.LJIILLIIL.getMeasuredHeight(), 0);
        if (iMax <= Math.abs(i)) {
            i = -iMax;
        }
        return super.setTopAndBottomOffset(i);
    }

    public NavBarMaximumScrollableBehavior(TuxNavBar tuxNavBar, C16GW c16gw) {
        this.LJIILLIIL = tuxNavBar;
        this.LJIIZILJ = c16gw;
    }

    @Override // com.ss.android.ugc.aweme.im.common.widget.appbar.IMAppBarLayout$Behavior
    /* JADX INFO: renamed from: LIZLLL */
    public final int setHeaderTopBottomOffset(C16G0 c16g0, C16GW c16gw, int i, int i2, int i3) {
        return super.setHeaderTopBottomOffset(c16g0, c16gw, i, Math.max(i2, -Math.max(this.LJIIZILJ.getMeasuredHeight() - this.LJIILLIIL.getMeasuredHeight(), 0)), i3);
    }

    @Override // com.ss.android.ugc.aweme.im.common.widget.appbar.IMAppBarLayout$Behavior, com.ss.android.ugc.aweme.im.common.widget.appbar.IMHeaderBehavior
    public final /* bridge */ /* synthetic */ int setHeaderTopBottomOffset(C16G0 c16g0, View view, int i, int i2, int i3) {
        return setHeaderTopBottomOffset(c16g0, (C16GW) view, i, i2, i3);
    }
}
