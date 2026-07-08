package com.ss.android.ugc.aweme.feed.landscape.component;

import X.C01GW;
import X.C0P0T;
import X.C452501pT;
import X.C713290RyR;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import Y.ARunnableS80S0200000_11;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeAutoRotationTipsAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class LandscapeAutoRotationTipsComponent extends BasePanelComponent implements LandscapeAutoRotationTipsAbility, InterfaceC1554640qYg {
    public C0P0T LLILLJJLI;
    public final Keva LL = Keva.getRepo("landscape_auto_rotation");
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 403));

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 95148254) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeAutoRotationTipsAbility
    public final void NM0() {
        C0P0T c0p0t = this.LLILLJJLI;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) this.LLILLL.getValue();
        if (landscapeFeedViewPagerAbility != null) {
            landscapeFeedViewPagerAbility.bY0(this, new AwS625S0100000_11(this, 34));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeAutoRotationTipsAbility
    public final void T50(View view) {
        int i;
        if (!this.LL.getBoolean("auto_rotation_tip", false) && (i = this.LL.getInt("key_auto_rotation_status", 0)) != 4 && i != 5) {
            boolean z = C713290RyR.LIZ;
            if (C713290RyR.LIZ && view != null) {
                HandlerHook.viewPost(view, new ARunnableS80S0200000_11(this, view, 11));
            }
        }
    }
}
