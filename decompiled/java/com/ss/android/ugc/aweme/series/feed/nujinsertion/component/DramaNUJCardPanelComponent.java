package com.ss.android.ugc.aweme.series.feed.nujinsertion.component;

import X.C01GW;
import X.C0RRR;
import X.C1566140qrE;
import X.C1577270r9B;
import X.C1620830sHR;
import X.C2188811AlT;
import X.C299750Boz;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.EnumC452301pR;
import X.InterfaceC1565950qqv;
import X.InterfaceC1577280r9C;
import X.InterfaceC1577470r9V;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.model.DramaDNUFeedCardConfig;
import com.ss.android.ugc.aweme.model.MiniDramaFeedCardResponse;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import com.ss.android.ugc.aweme.series.feed.nujinsertion.component.DramaNUJCardPanelComponent;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.List;
import kotlin.jvm.internal.AwS140S0110000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class DramaNUJCardPanelComponent extends BasePanelComponent {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public final C630740Ooa LLIZLLLIL;
    public final C1577270r9B LLJ;
    public final C1620830sHR LLJI;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final void bo() {
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLIZLLLIL.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Xl0(this.LLJI);
        }
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final DataLayerAbility m310do() {
        return (DataLayerAbility) this.LLILLJJLI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC738140SxQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.feed.nujinsertion.component.DramaNUJCardPanelComponent.onResume():void");
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0r9B] */
    public DramaNUJCardPanelComponent() {
        C01GW c01gwLIZIZ;
        C01GW c01gwLIZIZ2;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 938), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS140S0110000_24(false, (InterfaceC1565950qqv) this, 11));
        }
        this.LL = c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa2 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 939), null);
            C1566140qrE.LIZJ(this, c630740Ooa2);
            c01gwLIZIZ2 = c630740Ooa2;
        } else {
            c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS140S0110000_24(false, (InterfaceC1565950qqv) this, 12));
        }
        this.LLILLJJLI = c01gwLIZIZ2;
        this.LLIZLLLIL = C628500Oky.LIZ(new AwS568S0100000_24(this, 940));
        this.LLJ = new InterfaceC1577470r9V() { // from class: X.0r9B
            @Override // X.InterfaceC1577470r9V
            public final void LIZ(MiniDramaFeedCardResponse miniDramaFeedCardResponse) {
            }

            @Override // X.InterfaceC1577470r9V
            public final void LIZIZ(DramaDNUFeedCardConfig dramaDNUFeedCardConfig) {
                Aweme awemeLJIIIIZZ;
                Aweme awemeLJIILLIIL;
                String aid;
                boolean z;
                DataLayerAbility dataLayerAbilityM310do;
                Fragment fragment;
                InterfaceC1577280r9C interfaceC1577280r9CLIZ;
                if (!Intrinsics.LJFF(dramaDNUFeedCardConfig.shouldShowInsertVideo, Boolean.TRUE)) {
                    IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LIZ.LLIZLLLIL.getValue();
                    String aid2 = null;
                    if (iViewPagerComponentAbility != null) {
                        awemeLJIIIIZZ = iViewPagerComponentAbility.LJIIIIZZ();
                    } else {
                        awemeLJIIIIZZ = null;
                    }
                    ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
                    if (iSeriesFeedServiceLIZIZ != null && (interfaceC1577280r9CLIZ = iSeriesFeedServiceLIZIZ.LIZ()) != null) {
                        awemeLJIILLIIL = interfaceC1577280r9CLIZ.LJIILLIIL();
                    } else {
                        awemeLJIILLIIL = null;
                    }
                    if (awemeLJIIIIZZ != null) {
                        aid = awemeLJIIIIZZ.getAid();
                    } else {
                        aid = null;
                    }
                    if (awemeLJIILLIIL != null) {
                        aid2 = awemeLJIILLIIL.getAid();
                    }
                    if ((Intrinsics.LJFF(aid, aid2) || this.LIZ.LLILZLL) && C1573840r3e.LIZ(dramaDNUFeedCardConfig.notShowInsertVideoToast)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (this.LIZ.fo(awemeLJIILLIIL) && awemeLJIILLIIL != null && (dataLayerAbilityM310do = this.LIZ.m310do()) != null) {
                        C606150Nq1 c606150Nq1 = C606500Nqa.LIZLLL;
                        if (dataLayerAbilityM310do.wT(awemeLJIILLIIL, C606130Npz.LIZ("drama_nuj_video_card")) != null) {
                            DramaNUJCardPanelComponent dramaNUJCardPanelComponent = this.LIZ;
                            if (z && (fragment = dramaNUJCardPanelComponent.getPanelContext().LJ) != null) {
                                C1389880mGw c1389880mGw = new C1389880mGw(fragment);
                                c1389880mGw.LJIIIZ(dramaDNUFeedCardConfig.notShowInsertVideoToast);
                                c1389880mGw.LJIIJ();
                            }
                            C1577320r9G c1577320r9G = C1577320r9G.LIZ;
                            EnumC1577400r9O enumC1577400r9O = EnumC1577400r9O.REMOVE_CARD;
                            c1577320r9G.getClass();
                            C1577320r9G.LIZIZ(c1577320r9G, enumC1577400r9O, null, null, C1577320r9G.LIZ(awemeLJIILLIIL), "user_under_18", null, null, CardStruct.IStatusCode.DEFAULT, null, null, null, null, null, null, null, null, null, null, 523990);
                        }
                    }
                }
            }
        };
        this.LLJI = new C1620830sHR(this, 7);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        InterfaceC1577280r9C interfaceC1577280r9CLIZ;
        InterfaceC1577280r9C interfaceC1577280r9CLIZ2;
        super.onDestroy();
        if (this.LLILZ) {
            ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
            if (iSeriesFeedServiceLIZIZ != null && (interfaceC1577280r9CLIZ2 = iSeriesFeedServiceLIZIZ.LIZ()) != null) {
                interfaceC1577280r9CLIZ2.LJIIIIZZ(this.LLJ);
            }
            ISeriesFeedService iSeriesFeedServiceLIZIZ2 = C0RRR.LIZIZ();
            if (iSeriesFeedServiceLIZIZ2 == null || (interfaceC1577280r9CLIZ = iSeriesFeedServiceLIZIZ2.LIZ()) == null) {
                return;
            }
            interfaceC1577280r9CLIZ.LIZIZ();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        InterfaceC1577280r9C interfaceC1577280r9CLIZ;
        super.onParentViewCreated();
        if (!this.LLILLL) {
            IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLIZLLLIL.getValue();
            if (iViewPagerComponentAbility != null) {
                iViewPagerComponentAbility.Bv0(this.LLJI);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FYP Page Listener added - item count: ");
            DataLayerAbility dataLayerAbilityM310do = m310do();
            sbLIZ.append(dataLayerAbilityM310do != null ? Integer.valueOf(dataLayerAbilityM310do.Q0()) : null);
            C2188811AlT.LIZIZ(sbLIZ);
            this.LLILLL = true;
        }
        if (this.LLILZ) {
            return;
        }
        ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
        if (iSeriesFeedServiceLIZIZ != null && (interfaceC1577280r9CLIZ = iSeriesFeedServiceLIZIZ.LIZ()) != null) {
            interfaceC1577280r9CLIZ.LJIILL(this.LLJ);
        }
        this.LLILZ = true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
    }

    public final boolean fo(Aweme aweme) {
        DataLayerAbility dataLayerAbilityM310do;
        List<Aweme> items;
        if (aweme == null || (dataLayerAbilityM310do = m310do()) == null || (items = dataLayerAbilityM310do.getItems()) == null) {
            return false;
        }
        for (Aweme aweme2 : items) {
            if (Intrinsics.LJFF(aweme2.getAid(), aweme.getAid())) {
                if (aweme2 == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
