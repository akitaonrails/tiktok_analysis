package com.ss.android.ugc.aweme.tako.detail.guide;

import X.C01GW;
import X.C0R4J;
import X.C0RD6;
import X.C0SUC;
import X.C14TF;
import X.C1566140qrE;
import X.C1860520yW2;
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
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoInflowCommonComponent extends BasePanelComponent {
    public final C01GW LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public final C0R4J LLILZ;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public TakoInflowCommonComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS554S0100000_10((InterfaceC1565950qqv) this, 893), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS128S0110000_10(false, (InterfaceC1565950qqv) this, 5));
        }
        this.LL = c01gwLIZIZ;
        this.LLILLL = true;
        this.LLILZ = new C0R4J(this, 1);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        if (C14TF.LIZIZ.LJJJJIZL(C0SUC.LIZ(getContext()).getEventType())) {
            C1860520yW2.LIZ.getClass();
            C1860520yW2.LJIIL().storeBoolean("has_entered_search_inner_flow", true);
        }
        this.LLILLJJLI = true;
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        super.onStart();
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LL.getValue();
        if (iFeedPanelPlatformAbility == null || (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbility.Mb()) == null) {
            return;
        }
        iViewPagerComponentAbilityMb.Bv0(this.LLILZ);
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        super.onStop();
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LL.getValue();
        if (iFeedPanelPlatformAbility == null || (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbility.Mb()) == null) {
            return;
        }
        iViewPagerComponentAbilityMb.Xl0(this.LLILZ);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        c0rd6.LIZIZ("event_on_render_first_frame", new AwS589S0100000_10(this, 366));
    }
}
