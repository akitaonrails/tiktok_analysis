package com.ss.android.ugc.aweme.search.common.ui.component;

import X.C01GW;
import X.C0PYP;
import X.C0PYS;
import X.C0R4J;
import X.C0SUC;
import X.C1566140qrE;
import X.C2189821An6;
import X.C299750Boz;
import X.C452501pT;
import X.C630740Ooa;
import X.EnumC452301pR;
import X.InterfaceC1565950qqv;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.internal.AwS128S0110000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchInflowCommonComponent extends BasePanelComponent {
    public final C01GW LL;
    public boolean LLILLJJLI;
    public final C0R4J LLILLL;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public SearchInflowCommonComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS554S0100000_10((InterfaceC1565950qqv) this, 293), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS128S0110000_10(false, (InterfaceC1565950qqv) this, 4));
        }
        this.LL = c01gwLIZIZ;
        this.LLILLJJLI = true;
        this.LLILLL = new C0R4J(this, 0);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C0PYP c0pyp = C0PYP.LIZ;
        C2189821An6 c2189821An6LIZ = C0SUC.LIZ(getContext());
        c0pyp.getClass();
        if (C0PYP.LIZ(c2189821An6LIZ)) {
            C0PYS.LIZ.storeBoolean("has_entered_search_inner_flow", true);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        super.onStart();
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LL.getValue();
        if (iFeedPanelPlatformAbility == null || (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbility.Mb()) == null) {
            return;
        }
        iViewPagerComponentAbilityMb.Bv0(this.LLILLL);
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        super.onStop();
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LL.getValue();
        if (iFeedPanelPlatformAbility == null || (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbility.Mb()) == null) {
            return;
        }
        iViewPagerComponentAbilityMb.Xl0(this.LLILLL);
    }
}
