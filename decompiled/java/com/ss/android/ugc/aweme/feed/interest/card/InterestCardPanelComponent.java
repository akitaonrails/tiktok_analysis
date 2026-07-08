package com.ss.android.ugc.aweme.feed.interest.card;

import X.C01GW;
import X.C0RUJ;
import X.C1514430pVp;
import X.C1566140qrE;
import X.C1620830sHR;
import X.C299750Boz;
import X.C452501pT;
import X.C630740Ooa;
import X.EnumC452301pR;
import X.InterfaceC1563550qn3;
import X.InterfaceC1565950qqv;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.interest.IInterestReselectionService;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.internal.AwS140S0110000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class InterestCardPanelComponent extends BasePanelComponent implements InterfaceC1563550qn3, C0RUJ {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final IInterestReselectionService LLILLL;

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "interests_reselection_card_panel";
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // X.C0RUJ
    public final void lj() {
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return true;
    }

    @Override // X.InterfaceC1563550qn3
    public final void fi() {
        IViewPagerComponentAbility iViewPagerComponentAbility;
        IInterestReselectionService iInterestReselectionService = this.LLILLL;
        if (iInterestReselectionService == null || !iInterestReselectionService.LJII() || (iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILLJJLI.getValue()) == null) {
            return;
        }
        iViewPagerComponentAbility.Bv0(new C1620830sHR(this, 14));
    }

    public InterestCardPanelComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 409), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS140S0110000_24(false, (InterfaceC1565950qqv) this, 5));
        }
        this.LL = c01gwLIZIZ;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 410));
        this.LLILLL = (IInterestReselectionService) PluggableExtentionKt.pluggableSpi$default(IInterestReselectionService.class, false, false, false, 14, null);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        IInterestReselectionService iInterestReselectionService = this.LLILLL;
        if (iInterestReselectionService != null) {
            iInterestReselectionService.LJIIIZ(this);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        IViewPagerComponentAbility iViewPagerComponentAbility;
        super.onParentViewCreated();
        if (C1514430pVp.LIZLLL().booleanValue()) {
            IInterestReselectionService iInterestReselectionService = this.LLILLL;
            if (iInterestReselectionService != null) {
                iInterestReselectionService.LJIJJ(this);
                return;
            }
            return;
        }
        IInterestReselectionService iInterestReselectionService2 = this.LLILLL;
        if (iInterestReselectionService2 == null || !iInterestReselectionService2.LJII() || (iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILLJJLI.getValue()) == null) {
            return;
        }
        iViewPagerComponentAbility.Bv0(new C1620830sHR(this, 14));
    }
}
