package com.ss.android.ugc.aweme.series.specialcard.component;

import X.C01GW;
import X.C098200Yq;
import X.C0RRR;
import X.C14EU;
import X.C1561510qjl;
import X.C1561520qjm;
import X.C1561530qjn;
import X.C1563690qnH;
import X.C1566140qrE;
import X.C1577310r9F;
import X.C1577460r9U;
import X.C1593870rZx;
import X.C189200o6;
import X.C20647815qu;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C299750Boz;
import X.C452501pT;
import X.C584950Mwv;
import X.C606130Npz;
import X.C606150Nq1;
import X.C606500Nqa;
import X.C606540Nqe;
import X.C628500Oky;
import X.C630740Ooa;
import X.EnumC1577410r9P;
import X.EnumC452301pR;
import X.InterfaceC1565950qqv;
import X.InterfaceC1577280r9C;
import X.InterfaceC1577470r9V;
import X.InterfaceC1616070s9l;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.MiniDramaCardInfo;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import com.ss.android.ugc.aweme.series.specialcard.component.MiniDramaDNUGuideCardPanelComponent;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public final class MiniDramaDNUGuideCardPanelComponent extends BasePanelComponent {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public boolean LLILLL;
    public long LLILZ;
    public Aweme LLILZIL;
    public String LLILZLL;
    public final C630740Ooa LLIZ;
    public final C1563690qnH LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final IViewPagerComponentAbility Mb() {
        return (IViewPagerComponentAbility) this.LLIZ.getValue();
    }

    public final void bo() {
        MiniDramaCardInfo miniDramaCardInfo;
        if (this.LLILLL) {
            return;
        }
        this.LLILLL = true;
        Aweme aweme = this.LLILZIL;
        if (aweme != null) {
            PaidContentInfo paidContentInfo = aweme.mPaidContentInfo;
            if (Intrinsics.LJFF((paidContentInfo == null || (miniDramaCardInfo = paidContentInfo.getMiniDramaCardInfo()) == null) ? null : miniDramaCardInfo.cardType, "dnu")) {
                C1577310r9F c1577310r9F = C1577310r9F.LIZ;
                long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILZ;
                c1577310r9F.getClass();
                if (C1577310r9F.LJFF(aweme)) {
                    return;
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", "homepage_hot");
                c2344009Gk.LJIIIIZZ("card_id", "pgc_drama_dnu_card");
                c2344009Gk.LJIIIIZZ("aweme_id", aweme.getAid());
                c2344009Gk.LJIIIIZZ("business_type", "pgc");
                c2344009Gk.LJIIIIZZ("card_type", "card");
                c2344009Gk.LJIIIIZZ("series_card_type", C1577310r9F.LIZ(aweme));
                c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
                C20684815ws.LJIILLIIL("special_shaped_card_time", c2344009Gk.LIZ);
            }
        }
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m313do() {
        MiniDramaCardInfo miniDramaCardInfo;
        Aweme aweme = this.LLILZIL;
        if (aweme != null) {
            PaidContentInfo paidContentInfo = aweme.mPaidContentInfo;
            if (Intrinsics.LJFF((paidContentInfo == null || (miniDramaCardInfo = paidContentInfo.getMiniDramaCardInfo()) == null) ? null : miniDramaCardInfo.cardType, "dnu")) {
                C1577310r9F c1577310r9F = C1577310r9F.LIZ;
                c1577310r9F.getClass();
                C1577310r9F.LIZLLL(aweme, "show", "", "", "");
                C20647815qu c20647815qu = C20647815qu.LIZ;
                String aid = aweme.getAid();
                if (aid == null) {
                    aid = "";
                }
                String requestId = aweme.getRequestId();
                c20647815qu.getClass();
                C20647815qu.LIZJ("pgc_drama_dnu_card", aid, requestId);
                this.LLILLL = false;
                this.LLILZ = System.currentTimeMillis();
                DataLayerAbility dataLayerAbility = (DataLayerAbility) this.LLILLJJLI.getValue();
                C1577310r9F.LIZJ(c1577310r9F, EnumC1577410r9P.CARD_SHOW, C1577310r9F.LIZ(aweme), Integer.valueOf(dataLayerAbility != null ? dataLayerAbility.au(aweme) : -1), null, null, null, null, null, null, null, 8142);
                C1593870rZx.LIZIZ.LIZIZ();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0qnH] */
    public MiniDramaDNUGuideCardPanelComponent() {
        C01GW c01gwLIZIZ;
        C01GW c01gwLIZIZ2;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1103), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C1561520qjm(false, this));
        }
        this.LL = c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa2 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1104), null);
            C1566140qrE.LIZJ(this, c630740Ooa2);
            c01gwLIZIZ2 = c630740Ooa2;
        } else {
            c01gwLIZIZ2 = C452501pT.LIZIZ(new C1561510qjl(false, this));
        }
        this.LLILLJJLI = c01gwLIZIZ2;
        this.LLIZ = C628500Oky.LIZ(new C1561530qjn(this));
        this.LLIZLLLIL = new InterfaceC1616070s9l() { // from class: X.0qnH
            @Override // X.InterfaceC1616160s9u
            public final /* synthetic */ void onBeforePageChange() {
            }

            @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
            public final void onPageScrollStateChanged(int i) {
            }

            @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
            public final void onPageScrolled(int i, float f, int i2) {
            }

            @Override // X.InterfaceC1616070s9l
            public final void onPageScrolledEnd(int i, float f, int i2) {
            }

            @Override // X.InterfaceC1616070s9l
            public final void onPageSelected(int i, boolean z) {
            }

            @Override // X.InterfaceC1616160s9u
            public final /* synthetic */ void onScrollToItemStart(int i) {
            }

            @Override // X.InterfaceC1616160s9u
            public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
            }

            @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
            public final void onPageSelected(int i) {
                Aweme awemeLJIIIIZZ;
                MiniDramaDNUGuideCardPanelComponent miniDramaDNUGuideCardPanelComponent = this.LL;
                try {
                    miniDramaDNUGuideCardPanelComponent.fo(i);
                    IViewPagerComponentAbility iViewPagerComponentAbilityMb = miniDramaDNUGuideCardPanelComponent.Mb();
                    if (iViewPagerComponentAbilityMb != null) {
                        awemeLJIIIIZZ = iViewPagerComponentAbilityMb.LJIIIIZZ();
                    } else {
                        awemeLJIIIIZZ = null;
                    }
                    miniDramaDNUGuideCardPanelComponent.LLILZIL = awemeLJIIIIZZ;
                    miniDramaDNUGuideCardPanelComponent.m313do();
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }

            @Override // X.InterfaceC1616070s9l
            public final void onPageUnSelected(C0SZ8 c0sz8) {
                String aid;
                MiniDramaDNUGuideCardPanelComponent miniDramaDNUGuideCardPanelComponent = this.LL;
                String str = miniDramaDNUGuideCardPanelComponent.LLILZLL;
                Aweme aweme = miniDramaDNUGuideCardPanelComponent.LLILZIL;
                String aid2 = null;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                if (!Intrinsics.LJFF(str, aid)) {
                    this.LL.bo();
                    MiniDramaDNUGuideCardPanelComponent miniDramaDNUGuideCardPanelComponent2 = this.LL;
                    Aweme aweme2 = miniDramaDNUGuideCardPanelComponent2.LLILZIL;
                    if (aweme2 != null) {
                        aid2 = aweme2.getAid();
                    }
                    miniDramaDNUGuideCardPanelComponent2.LLILZLL = aid2;
                }
            }
        };
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        ISeriesFeedService iSeriesFeedServiceLIZIZ;
        InterfaceC1577280r9C interfaceC1577280r9CLIZ;
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        IViewPagerComponentAbility iViewPagerComponentAbilityMb = Mb();
        if (iViewPagerComponentAbilityMb != null) {
            iViewPagerComponentAbilityMb.Xl0(this.LLIZLLLIL);
        }
        InterfaceC1577470r9V interfaceC1577470r9VLJI = C1577460r9U.LLILLJJLI.LJI();
        if (interfaceC1577470r9VLJI == null || (iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ()) == null || (interfaceC1577280r9CLIZ = iSeriesFeedServiceLIZIZ.LIZ()) == null) {
            return;
        }
        interfaceC1577280r9CLIZ.LJIIIIZZ(interfaceC1577470r9VLJI);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        ISeriesFeedService iSeriesFeedServiceLIZIZ;
        InterfaceC1577280r9C interfaceC1577280r9CLIZ;
        super.onParentViewCreated();
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("mini_drama_auto_trigger_attribution_enable", false)) {
            C1577460r9U.LLILLJJLI.LJIIJ(C2097608Jq.LJ());
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onParentViewCreated viewPagerComponentAbility:");
        IViewPagerComponentAbility iViewPagerComponentAbilityMb = Mb();
        sbLIZ.append(iViewPagerComponentAbilityMb != null ? Integer.valueOf(iViewPagerComponentAbilityMb.hashCode()) : null);
        sbLIZ.append(" hasRegisterOnPageSelectListener:");
        sbLIZ.append(this.LLJI);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!this.LLJI) {
            IViewPagerComponentAbility iViewPagerComponentAbilityMb2 = Mb();
            if (iViewPagerComponentAbilityMb2 != null) {
                iViewPagerComponentAbilityMb2.Bv0(this.LLIZLLLIL);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onPageChangedListener is registered by onParentViewCreated viewPagerComponentAbility:");
            IViewPagerComponentAbility iViewPagerComponentAbilityMb3 = Mb();
            sbLIZ2.append(iViewPagerComponentAbilityMb3 != null ? Integer.valueOf(iViewPagerComponentAbilityMb3.hashCode()) : null);
            C2188811AlT.LIZIZ(sbLIZ2);
            this.LLJI = true;
        }
        InterfaceC1577470r9V interfaceC1577470r9VLJI = C1577460r9U.LLILLJJLI.LJI();
        if (interfaceC1577470r9VLJI == null || (iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ()) == null || (interfaceC1577280r9CLIZ = iSeriesFeedServiceLIZIZ.LIZ()) == null) {
            return;
        }
        interfaceC1577280r9CLIZ.LJIILL(interfaceC1577470r9VLJI);
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        bo();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        this.LLILLL = false;
        this.LLILZ = System.currentTimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void fo(int r19) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.specialcard.component.MiniDramaDNUGuideCardPanelComponent.fo(int):void");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onMiniDramaSpecialCardEvent(C584950Mwv c584950Mwv) {
        int iLJLLJ;
        Integer num;
        Aweme next;
        MiniDramaCardInfo miniDramaCardInfo;
        String str;
        MiniDramaCardInfo miniDramaCardInfo2;
        if (!this.LLJI && Mb() != null) {
            IViewPagerComponentAbility iViewPagerComponentAbilityMb = Mb();
            if (iViewPagerComponentAbilityMb != null) {
                iViewPagerComponentAbilityMb.Bv0(this.LLIZLLLIL);
            }
            this.LLJI = true;
        }
        DataLayerAbility dataLayerAbility = (DataLayerAbility) this.LLILLJJLI.getValue();
        if (dataLayerAbility == null) {
            return;
        }
        if (c584950Mwv.LIZ) {
            Iterator<Aweme> it2 = dataLayerAbility.getItems().iterator();
            while (true) {
                num = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    PaidContentInfo paidContentInfo = next.mPaidContentInfo;
                    if (paidContentInfo != null && (miniDramaCardInfo2 = paidContentInfo.getMiniDramaCardInfo()) != null) {
                        str = miniDramaCardInfo2.cardType;
                    } else {
                        str = null;
                    }
                    if (Intrinsics.LJFF(str, "dnu")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            Aweme aweme = next;
            if (aweme != null) {
                C606150Nq1 c606150Nq1 = C606500Nqa.LIZLLL;
                C606540Nqe c606540NqeWT = dataLayerAbility.wT(aweme, C606130Npz.LIZ("pgc_drama_dnu_card"));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onMiniDramaSpecialCardEvent delete old card style = ");
                PaidContentInfo paidContentInfo2 = aweme.mPaidContentInfo;
                if (paidContentInfo2 != null && (miniDramaCardInfo = paidContentInfo2.getMiniDramaCardInfo()) != null) {
                    num = miniDramaCardInfo.style;
                }
                sbLIZ.append(num);
                sbLIZ.append(" deleteResult = ");
                sbLIZ.append(c606540NqeWT.LIZ());
                C2188811AlT.LIZIZ(sbLIZ);
                C1577310r9F c1577310r9F = C1577310r9F.LIZ;
                EnumC1577410r9P enumC1577410r9P = EnumC1577410r9P.REMOVE_CARD;
                c1577310r9F.getClass();
                C1577310r9F.LIZJ(c1577310r9F, enumC1577410r9P, C1577310r9F.LIZ(aweme), null, c584950Mwv.LIZJ, null, String.valueOf(c606540NqeWT.LIZ), c606540NqeWT.LIZIZ, null, null, null, 7342);
            }
        }
        if (c584950Mwv.LIZIZ && c584950Mwv.LIZ) {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LL.getValue();
            if (iFeedPanelPlatformAbility != null) {
                iLJLLJ = iFeedPanelPlatformAbility.LJLLJ();
            } else {
                iLJLLJ = 2;
            }
            try {
                fo(iLJLLJ);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565950qqv
    public final void onPagePause(int i) {
        super.onPagePause(i);
        bo();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565950qqv
    public final void onPageResume(int i) {
        super.onPageResume(i);
        this.LLILLL = false;
        this.LLILZ = System.currentTimeMillis();
    }
}
