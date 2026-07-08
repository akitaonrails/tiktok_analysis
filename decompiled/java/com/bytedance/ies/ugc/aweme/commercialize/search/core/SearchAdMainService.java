package com.bytedance.ies.ugc.aweme.commercialize.search.core;

import X.AbstractC1025510cnF;
import X.C01GW;
import X.C0NDA;
import X.C0PEM;
import X.C0R13;
import X.C1002720cCU;
import X.C1002760cCY;
import X.C1004580cFU;
import X.C1007860cKm;
import X.C1009980cOC;
import X.C1010090cON;
import X.C1010120cOQ;
import X.C1010390cOr;
import X.C1010400cOs;
import X.C1010550cP7;
import X.C1010570cP9;
import X.C1011050cPv;
import X.C1011060cPw;
import X.C1011070cPx;
import X.C1011150cQ5;
import X.C1011160cQ6;
import X.C1011170cQ7;
import X.C1011180cQ8;
import X.C1011210cQB;
import X.C1011420cQW;
import X.C1011470cQb;
import X.C1011520cQg;
import X.C1017070cZd;
import X.C1018480cbu;
import X.C1021060cg4;
import X.C1022820ciu;
import X.C1025430cn7;
import X.C1025520cnG;
import X.C1025670cnV;
import X.C1025880cnq;
import X.C11NZ;
import X.C1227904rF;
import X.C1239604t8;
import X.C1AF0;
import X.C2188811AlT;
import X.C23250099c;
import X.C2510609se;
import X.C309390CAv;
import X.C452501pT;
import X.C655360PnC;
import X.C655610Pnb;
import X.C656780PpU;
import X.C658140Prg;
import X.C717630SCz;
import X.C817503Hh;
import X.C991560buU;
import X.EnumC658110Prd;
import X.EnumC658120Pre;
import X.EnumC710310Rtd;
import X.InterfaceC1008930cMV;
import X.InterfaceC1010140cOS;
import X.InterfaceC1010470cOz;
import X.InterfaceC1011380cQS;
import X.InterfaceC1011390cQT;
import X.InterfaceC1011400cQU;
import X.InterfaceC1011510cQf;
import X.InterfaceC20673515v3;
import X.InterfaceC643990PNt;
import X.InterfaceC655240Pn0;
import X.InterfaceC655350PnB;
import X.InterfaceC656040PoI;
import X.InterfaceC656050PoJ;
import X.InterfaceC656120PoQ;
import X.InterfaceC656550Pp7;
import X.InterfaceC656730PpP;
import X.InterfaceC656740PpQ;
import X.InterfaceC657350PqP;
import X.InterfaceC657510Pqf;
import X.InterfaceC660150Puv;
import X.InterfaceC682870QqT;
import X.InterfaceC688220Qz6;
import Y.AfS185S0100000_16;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.aisummary.section.AISummaryAnoleSectionCell;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.aisummary.section.AISummaryTextSectionCell;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.commercialize.router.api.ICRouterManager;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterCoreModel;
import com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterModelTransform;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.search.AIAdCardSection;
import com.ss.android.ugc.aweme.feed.model.search.AIAdCardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS334S0000000_10;
import kotlin.jvm.internal.AwS130S1100000_16;
import kotlin.jvm.internal.AwS30S0001000_16;
import kotlin.jvm.internal.AwS31S0000100_16;
import kotlin.jvm.internal.AwS67S1000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class SearchAdMainService implements ISearchAdMainService {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1239604t8());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1011470cQb());
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(70));

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final boolean LIZ() {
        C0NDA.LJII.getValue().getClass();
        return false;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final boolean LIZJ() {
        C0NDA.LJII.getValue().getClass();
        return false;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final InterfaceC1010140cOS LJIIIIZZ() {
        return C0NDA.LJII.getValue();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final boolean LJIILLIIL() {
        return C0NDA.LJII.getValue().LIZLLL;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final InterfaceC643990PNt LJJIIJZLJL() {
        return (C1018480cbu) this.LIZJ.getValue();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final InterfaceC688220Qz6 LJJI() {
        return C1010090cON.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (com.bytedance.ies.abmock.SettingsManager.LIZ("enable_search_inflow_live_ad_click_delay_local_logic", false) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        ((com.ss.android.ugc.aweme.live.ILiveOuterService) com.ss.android.ugc.aweme.framework.services.ServiceManager.get().getService(com.ss.android.ugc.aweme.live.ILiveOuterService.class)).k4().LJJIJIL(X.EnumC464390IIz.AUDIENCE_LIVE_PLAY_DURATION, new X.C1002810cCd(r9, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        if (com.bytedance.ies.abmock.SettingsManager.LIZ("enable_search_inflow_live_ad_click_delay_local_logic_cl", false) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        return X.C23250099c.LIZLLL(X.C2296808zG.LIZ(X.C0PEM.LIZJ), null, null, new X.C1002800cCc(r9, r3, null), 3);
     */
    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C09AE LIZLLL(final com.ss.android.ugc.aweme.feed.model.Aweme r9) {
        /*
            r8 = this;
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "logSearchAdLiveDurationEvent enterType: "
            r2.append(r0)
            java.lang.String r1 = "draw"
            r2.append(r1)
            X.C2188811AlT.LIZIZ(r2)
            int r0 = X.C2510609se.LIZ
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r9.getAwemeRawAd()
            if (r0 == 0) goto L96
            com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel r0 = r0.getSearchAdInfo()
            if (r0 == 0) goto L96
            java.lang.Long r0 = r0.searchAdLiveClickDelayTime
            if (r0 == 0) goto L96
            long r3 = r0.longValue()
        L27:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r9.getAwemeRawAd()
            r5 = 0
            if (r0 == 0) goto L94
            com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel r0 = r0.getSearchAdInfo()
            if (r0 == 0) goto L94
            java.lang.Long r0 = r0.searchAdLiveClickDelayTime
        L36:
            r7 = 0
            if (r0 == 0) goto L92
            r6 = 1
        L3a:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r1)
            if (r0 == 0) goto L71
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L71
            if (r6 == 0) goto L72
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r0 = "enable_search_inflow_live_ad_click_delay_local_logic"
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r7)
            if (r0 != 0) goto L81
        L57:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.live.ILiveOuterService> r0 = com.ss.android.ugc.aweme.live.ILiveOuterService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.live.ILiveOuterService r0 = (com.ss.android.ugc.aweme.live.ILiveOuterService) r0
            X.15v3 r2 = r0.k4()
            X.0IIz r1 = X.EnumC464390IIz.AUDIENCE_LIVE_PLAY_DURATION
            X.0cCd r0 = new X.0cCd
            r0.<init>(r9, r3)
            r2.LJJIJIL(r1, r0)
        L71:
            return r5
        L72:
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r0 = "enable_search_inflow_live_ad_click_delay_local_logic_cl"
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r7)
            if (r0 == 0) goto L57
        L81:
            X.1DFB r0 = X.C0PEM.LIZJ
            X.054G r2 = X.C2296808zG.LIZ(r0)
            X.0cCc r1 = new X.0cCc
            r1.<init>(r9, r3, r5)
            r0 = 3
            X.0956 r0 = X.C23250099c.LIZLLL(r2, r5, r5, r1, r0)
            return r0
        L92:
            r6 = 0
            goto L3a
        L94:
            r0 = r5
            goto L36
        L96:
            long r3 = X.C1010130cOR.LIZ
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdMainService.LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme):X.09AE");
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final void LJI(Aweme aweme) {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1002720cCU(aweme, null), 2);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final InterfaceC682870QqT LJII(final Aweme aweme) {
        return new InterfaceC682870QqT(aweme) { // from class: X.0cOE
            public final Aweme LIZ;
            public final SearchAdEventLogger LIZIZ;

            @Override // X.InterfaceC682870QqT
            public final void LIZIZ() {
                SearchAdEventLogger searchAdEventLogger = this.LIZIZ;
                if (searchAdEventLogger != null) {
                    C1009980cOC.LIZ.getClass();
                    searchAdEventLogger.logAd(C1009980cOC.LJLJJLL);
                }
            }

            @Override // X.InterfaceC682870QqT
            public final void LJ() {
                SearchAdEventLogger searchAdEventLogger = this.LIZIZ;
                if (searchAdEventLogger != null) {
                    C1009980cOC.LIZ.getClass();
                    searchAdEventLogger.logAd(C1009980cOC.LJLILLLLZI);
                }
            }

            @Override // X.InterfaceC682870QqT
            public final void LJFF() {
                SearchAdEventLogger searchAdEventLogger = this.LIZIZ;
                if (searchAdEventLogger != null) {
                    C1009980cOC.LIZ.getClass();
                    searchAdEventLogger.logAd(C1009980cOC.LJLIIL);
                }
            }

            @Override // X.InterfaceC682870QqT
            public final void LJI() {
                SearchAdEventLogger searchAdEventLogger = this.LIZIZ;
                if (searchAdEventLogger != null) {
                    C1009980cOC.LIZ.getClass();
                    searchAdEventLogger.logAd(C1009980cOC.LJLIL);
                }
            }

            @Override // X.InterfaceC682870QqT
            public final void LJII() {
                SearchAdEventLogger searchAdEventLogger = this.LIZIZ;
                if (searchAdEventLogger != null) {
                    C1009980cOC.LIZ.getClass();
                    searchAdEventLogger.logAd(C1009980cOC.LJLJLJ);
                }
            }

            @Override // X.InterfaceC682870QqT
            public final void LJIIIIZZ() {
                SearchAdEventLogger searchAdEventLogger = this.LIZIZ;
                if (searchAdEventLogger != null) {
                    C1009980cOC.LIZ.getClass();
                    searchAdEventLogger.logAd(C1009980cOC.LJLJLLL);
                }
            }

            @Override // X.InterfaceC682870QqT
            public final void LJIIIZ() {
                SearchAdEventLogger searchAdEventLogger = this.LIZIZ;
                if (searchAdEventLogger != null) {
                    C1009980cOC.LIZ.getClass();
                    searchAdEventLogger.logAd(C1009980cOC.LJLJL);
                }
            }

            @Override // X.InterfaceC682870QqT
            public final void LJIIJ() {
                SearchAdEventLogger searchAdEventLogger = this.LIZIZ;
                if (searchAdEventLogger != null) {
                    C1009980cOC.LIZ.getClass();
                    searchAdEventLogger.logAd((InterfaceC1023400cjq) C1009980cOC.LLFZ.getValue());
                }
            }

            @Override // X.InterfaceC682870QqT
            public final void LJIIL() {
                SearchAdEventLogger searchAdEventLogger = this.LIZIZ;
                if (searchAdEventLogger != null) {
                    C1009980cOC.LIZ.getClass();
                    C989080bqU.LIZ(searchAdEventLogger, C1009980cOC.LJJZZIII, this.LIZ, "show");
                }
            }

            @Override // X.InterfaceC682870QqT
            public final void LJIILIIL() {
                SearchAdEventLogger searchAdEventLogger = this.LIZIZ;
                if (searchAdEventLogger != null) {
                    C1009980cOC.LIZ.getClass();
                    searchAdEventLogger.logAd((InterfaceC1023400cjq) C1009980cOC.LLFII.getValue());
                }
            }

            @Override // X.InterfaceC682870QqT
            public final void LJIILJJIL() {
                SearchAdEventLogger searchAdEventLogger = this.LIZIZ;
                if (searchAdEventLogger != null) {
                    C1009980cOC.LIZ.getClass();
                    searchAdEventLogger.logAd(C1009980cOC.LJL);
                }
            }

            @Override // X.InterfaceC682870QqT
            public final void LJIILL() {
                SearchAdEventLogger searchAdEventLogger = this.LIZIZ;
                if (searchAdEventLogger != null) {
                    C1009980cOC.LIZ.getClass();
                    searchAdEventLogger.logAd(C1009980cOC.LJLJI);
                }
            }

            @Override // X.InterfaceC682870QqT
            public final void LJIILLIIL() {
                SearchAdEventLogger searchAdEventLogger = this.LIZIZ;
                if (searchAdEventLogger != null) {
                    C1009980cOC.LIZ.getClass();
                    searchAdEventLogger.logAd(C1009980cOC.LJLJJL);
                }
            }

            @Override // X.InterfaceC682870QqT
            public final void LJIJ() {
                SearchAdEventLogger searchAdEventLogger = this.LIZIZ;
                if (searchAdEventLogger != null) {
                    C1009980cOC.LIZ.getClass();
                    searchAdEventLogger.logAd(C1009980cOC.LJLI);
                }
            }

            {
                this.LIZ = aweme;
                this.LIZIZ = new SearchAdEventLogger(aweme, C1010120cOQ.LJIIIIZZ(aweme));
            }

            @Override // X.InterfaceC682870QqT
            public final void LIZ(long j) {
                SearchAdEventLogger searchAdEventLogger = this.LIZIZ;
                if (searchAdEventLogger != null) {
                    C1009980cOC.LIZ.getClass();
                    searchAdEventLogger.logAd(C1009980cOC.LJJZZI, new AwS31S0000100_16(j, 16));
                }
            }

            @Override // X.InterfaceC682870QqT
            public final void LIZJ(long j) {
                SearchAdEventLogger searchAdEventLogger = new SearchAdEventLogger(this.LIZ);
                C1009980cOC.LIZ.getClass();
                searchAdEventLogger.logAd(C1009980cOC.LJLL, new AwS31S0000100_16(j, 18));
            }

            @Override // X.InterfaceC682870QqT
            public final void LJIIJJI(long j) {
                SearchAdEventLogger searchAdEventLogger = new SearchAdEventLogger(this.LIZ);
                C1009980cOC.LIZ.getClass();
                searchAdEventLogger.logAd(C1009980cOC.LJLLI, new AwS31S0000100_16(j, 17));
            }

            @Override // X.InterfaceC682870QqT
            public final void LJIIZILJ(String str) {
                SearchAdEventLogger searchAdEventLogger = this.LIZIZ;
                if (searchAdEventLogger != null) {
                    C1009980cOC.LIZ.getClass();
                    searchAdEventLogger.logAd(C1009980cOC.LJLIIIL, new AwS67S1000000_16(str, 26));
                }
            }

            @Override // X.InterfaceC682870QqT
            public final void LJIJI(int i) {
                SearchAdEventLogger searchAdEventLogger = this.LIZIZ;
                if (searchAdEventLogger != null) {
                    C1009980cOC.LIZ.getClass();
                    searchAdEventLogger.logAd((InterfaceC1023400cjq<C443120HZe<String, String, String>>) C1009980cOC.LLFFF.getValue(), new AwS30S0001000_16(i, 15));
                }
            }

            @Override // X.InterfaceC682870QqT
            public final void LJIJJ(String str) {
                SearchAdEventLogger searchAdEventLogger = this.LIZIZ;
                if (searchAdEventLogger != null) {
                    C1009980cOC.LIZ.getClass();
                    searchAdEventLogger.logAd(C1009980cOC.LJLJJI, new AwS67S1000000_16(str, 25));
                }
            }

            @Override // X.InterfaceC682870QqT
            public final void l(int i) {
                SearchAdEventLogger searchAdEventLogger = this.LIZIZ;
                if (searchAdEventLogger != null) {
                    C1009980cOC.LIZ.getClass();
                    searchAdEventLogger.logAd((InterfaceC1023400cjq<C443120HZe<String, String, String>>) C1009980cOC.LLFF.getValue(), new AwS30S0001000_16(i, 16));
                }
            }

            @Override // X.InterfaceC682870QqT
            public final void LIZLLL(Aweme aweme2, String str, boolean z) {
                C1023960ckk c1023960ckk;
                if (z) {
                    c1023960ckk = C1010020cOG.LIZ;
                } else {
                    c1023960ckk = C1010050cOJ.LIZ;
                }
                new SearchAdEventLogger(aweme2, C1010120cOQ.LJIIIIZZ(aweme2)).logAd(c1023960ckk, new AwS130S1100000_16(str, aweme2, 18));
            }
        };
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final InterfaceC655240Pn0 LJIIIZ(InterfaceC657350PqP interfaceC657350PqP) {
        return new C1010570cP9(interfaceC657350PqP);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final InterfaceC655350PnB LJIIJ(C655360PnC c655360PnC) {
        return new C1010550cP7(c655360PnC);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final InterfaceC1010470cOz LJIILL(C1010400cOs c1010400cOs) {
        return new C1010390cOr(c1010400cOs);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final InterfaceC656730PpP LJIJJ(InterfaceC1011400cQU interfaceC1011400cQU) {
        return new C1011150cQ5(interfaceC1011400cQU);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final boolean LJIL(Aweme aweme) {
        EnumC710310Rtd enumC710310Rtd;
        C1007860cKm c1007860cKmLJIILIIL;
        if (aweme != null && C1010120cOQ.LJJIFFI(aweme)) {
            InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
            if (interfaceC657510PqfLIZLLL != null && (c1007860cKmLJIILIIL = interfaceC657510PqfLIZLLL.LJIILIIL()) != null) {
                enumC710310Rtd = c1007860cKmLJIILIIL.LIZJ;
            } else {
                enumC710310Rtd = null;
            }
            if (enumC710310Rtd == EnumC710310Rtd.CLICK) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final InterfaceC656740PpQ LJJ(C656780PpU c656780PpU) {
        return new C1011160cQ6(c656780PpU);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final List<Aweme> LJJIFFI(List<? extends Map<?, ?>> list) {
        if (list == null) {
            return null;
        }
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            ArrayList arrayList = new ArrayList();
            for (Map<?, ?> map : list) {
                c1227904rF.getClass();
                Aweme aweme = (Aweme) C1227904rF.LIZIZ(C1227904rF.LJI(map), Aweme.class);
                IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
                if (iAwemeService != null) {
                    iAwemeService.LLILLL(aweme);
                }
                arrayList.add(aweme);
            }
            return arrayList;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return null;
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final InterfaceC656050PoJ LJIIL(Context context, Aweme aweme) {
        return new C1011060cPw(new C1011520cQg(context, aweme));
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final boolean LJIILJJIL(Aweme aweme, String str) {
        boolean z;
        if (aweme == null) {
            return false;
        }
        if (!C1017070cZd.LLILL(aweme, str) && !C1010120cOQ.LJJI(aweme)) {
            z = false;
        } else {
            z = true;
        }
        if (C1010120cOQ.LJJI(aweme)) {
            SearchAdEventLogger searchAdEventLogger = new SearchAdEventLogger(aweme, C1010120cOQ.LJIIIIZZ(aweme));
            C1009980cOC.LIZ.getClass();
            searchAdEventLogger.logAd(C1009980cOC.LJIILL);
        }
        return z;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final void LJIJ(Aweme aweme, String str) {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1002760cCY(aweme, str, null), 2);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final void LJJIII(Aweme aweme, Object obj) {
        if (aweme != null && (obj instanceof C1022820ciu) && obj != null) {
            C991560buU.LIZ.getClass();
            C991560buU.LIZ((C1022820ciu) obj, aweme);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIIZ(android.content.Context r3, androidx.fragment.app.Fragment r4) {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.search.ISearchService> r0 = com.ss.android.ugc.aweme.search.ISearchService.class
            java.lang.Object r1 = r1.getService(r0)
            com.ss.android.ugc.aweme.search.ISearchService r1 = (com.ss.android.ugc.aweme.search.ISearchService) r1
            boolean r0 = r3 instanceof android.app.Activity
            if (r0 == 0) goto L17
            android.app.Activity r3 = (android.app.Activity) r3
        L12:
            boolean r0 = r1.LJLLL(r3, r4)
            return r0
        L17:
            boolean r0 = r3 instanceof android.view.ContextThemeWrapper
            if (r0 == 0) goto L2c
            android.content.ContextWrapper r3 = (android.content.ContextWrapper) r3
            android.content.Context r0 = r3.getBaseContext()
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L2c
            android.content.Context r3 = r3.getBaseContext()
            android.app.Activity r3 = (android.app.Activity) r3
            goto L12
        L2c:
            android.app.Activity r3 = X.C2214201BlK.LJFF()
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdMainService.LJJIIZ(android.content.Context, androidx.fragment.app.Fragment):boolean");
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final InterfaceC656120PoQ LJJIIZI(final Context context, final Aweme aweme) {
        C1011210cQB c1011210cQB = new C1011210cQB();
        c1011210cQB.LIZJ(new InterfaceC1011510cQf(context, aweme) { // from class: X.0cQj
            public final Aweme LIZ;
            public final /* synthetic */ Context LIZIZ;

            @Override // X.InterfaceC1011510cQf
            public final Aweme getAweme() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1011510cQf
            public final Context getContext() {
                return this.LIZIZ;
            }

            {
                this.LIZ = aweme;
            }
        });
        return c1011210cQB;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final C0R13 LJFF(final Context context, final AIAdCardStruct aIAdCardStruct, final AFwS334S0000000_10 aFwS334S0000000_10) {
        C0R13 c0r13 = new C0R13() { // from class: X.0cQA
            public Aweme LL;
            public InterfaceC1011390cQT LLILLJJLI;
            public final SearchAdEventLogger LLILLL = new SearchAdEventLogger();
            public final Map<String, InterfaceC1011540cQi> LLILZ = new LinkedHashMap();
            public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(361));

            @Override // X.C0PPF
            public final void bind() {
                List<Aweme> awemeList;
                String strValueOf;
                InterfaceC1011390cQT interfaceC1011390cQT = this.LLILLJJLI;
                if (interfaceC1011390cQT != null && (awemeList = interfaceC1011390cQT.getAwemeList()) != null) {
                    int size = awemeList.size();
                    int i = 0;
                    for (Aweme aweme : awemeList) {
                        int i2 = i + 1;
                        if (i < 0) {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                        Aweme aweme2 = aweme;
                        if (aweme2 == null || (strValueOf = aweme2.getAid()) == null) {
                            strValueOf = String.valueOf(i);
                        }
                        C1011190cQ9 c1011190cQ9 = new C1011190cQ9();
                        boolean z = i == size + (-1);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("[AISummaryCardModule][createSubCardModule] aid=");
                        sbLIZ.append(aweme2 != null ? aweme2.getAid() : null);
                        sbLIZ.append(" index=");
                        sbLIZ.append(i);
                        sbLIZ.append(" isLastAd=");
                        sbLIZ.append(z);
                        C2188811AlT.LIZIZ(sbLIZ);
                        this.LLILZ.put(strValueOf, c1011190cQ9);
                        Integer numValueOf = Integer.valueOf(i);
                        InterfaceC1011390cQT interfaceC1011390cQT2 = this.LLILLJJLI;
                        Context context2 = interfaceC1011390cQT2 != null ? interfaceC1011390cQT2.getContext() : null;
                        InterfaceC1011390cQT interfaceC1011390cQT3 = this.LLILLJJLI;
                        C586140Myq c586140Myq = new C586140Myq(aweme2, numValueOf, context2, interfaceC1011390cQT3, z);
                        c1011190cQ9.LL = aweme2;
                        c1011190cQ9.LLILLL = interfaceC1011390cQT3;
                        c1011190cQ9.LLILZ = context2;
                        c1011190cQ9.LLILZIL = z;
                        c1011190cQ9.LLIZ = c586140Myq;
                        i = i2;
                    }
                }
                for (C0PPF c0ppf : ((LinkedHashMap) this.LLILZ).values()) {
                    if (c0ppf != null) {
                        c0ppf.bind();
                    }
                }
                this.LLILLL.withContext(this.LL);
            }

            @Override // X.C0PPF
            public final void onViewAttachedToWindow() {
                for (C0PPF c0ppf : ((LinkedHashMap) this.LLILZ).values()) {
                    if (c0ppf != null) {
                        c0ppf.onViewAttachedToWindow();
                    }
                }
                SearchAdEventLogger searchAdEventLogger = this.LLILLL;
                if (searchAdEventLogger != null) {
                    C1009980cOC.LIZ.getClass();
                    searchAdEventLogger.logAd((InterfaceC1023400cjq) C1009980cOC.LLIIJI.getValue());
                }
                for (InterfaceC1011540cQi interfaceC1011540cQi : ((LinkedHashMap) this.LLILZ).values()) {
                    if (interfaceC1011540cQi != null) {
                        interfaceC1011540cQi.LJIILLIIL(true);
                    }
                }
            }

            @Override // X.C0PPF
            public final void onViewDetachedFromWindow() {
                for (C0PPF c0ppf : ((LinkedHashMap) this.LLILZ).values()) {
                    if (c0ppf != null) {
                        c0ppf.onViewDetachedFromWindow();
                    }
                }
                for (InterfaceC1011540cQi interfaceC1011540cQi : ((LinkedHashMap) this.LLILZ).values()) {
                    if (interfaceC1011540cQi != null) {
                        interfaceC1011540cQi.LJIILLIIL(false);
                    }
                }
            }

            @Override // X.C0Q70
            public final <T extends InterfaceC656540Pp6> void LIZJ(T t) {
                Aweme aweme;
                if (t instanceof InterfaceC1011390cQT) {
                    InterfaceC1011390cQT interfaceC1011390cQT = (InterfaceC1011390cQT) t;
                    this.LLILLJJLI = interfaceC1011390cQT;
                    List<Aweme> awemeList = interfaceC1011390cQT.getAwemeList();
                    if (awemeList != null) {
                        aweme = (Aweme) C13LP.LJJJLL(awemeList);
                    } else {
                        aweme = null;
                    }
                    this.LL = aweme;
                }
            }

            /* JADX WARN: Type inference failed for: r5v0, types: [X.0cRF] */
            @Override // X.C0R13
            public final void LJ(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, List list, List list2) {
                C20600815jK<InterfaceC1891350zJl> state;
                int iIntValue;
                InterfaceC1891350zJl c1011490cQd;
                String aid;
                C1011560cQk c1011560cQk = (C1011560cQk) this.LLILZIL.getValue();
                c1011560cQk.LIZ = viewOnAttachStateChangeListenerC20604515jv;
                viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(AISummaryTextSectionCell.class, AISummaryAnoleSectionCell.class);
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = c1011560cQk.LIZ;
                if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                    viewOnAttachStateChangeListenerC20604515jv2.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv2.getContext(), 1, false));
                }
                C1011560cQk c1011560cQk2 = (C1011560cQk) this.LLILZIL.getValue();
                Map<String, InterfaceC1011540cQi> map = this.LLILZ;
                ?? r5 = new Object() { // from class: X.0cRF
                };
                c1011560cQk2.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (true) {
                    C0Q18 c0q18LIZ = null;
                    if (!it2.hasNext()) {
                        break;
                    }
                    AIAdCardSection aIAdCardSection = (AIAdCardSection) it2.next();
                    Integer awemeIndex = aIAdCardSection.getAwemeIndex();
                    if (awemeIndex != null) {
                        iIntValue = awemeIndex.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    Aweme aweme = (Aweme) C13LP.LJJJLZIJ(iIntValue, list2);
                    if (aweme == null) {
                        aweme = (Aweme) C13LP.LJJJLL(list2);
                    }
                    int layoutType = aIAdCardSection.getLayoutType();
                    if (layoutType == EnumC113900bx.MARKDOWN_SUMMARY.getValue()) {
                        c1011490cQd = new C1011490cQd(aIAdCardSection, r5);
                    } else if (layoutType == EnumC113900bx.ANOLE_CARD.getValue()) {
                        if (aweme != null) {
                            aid = aweme.getAid();
                        } else {
                            aid = null;
                        }
                        InterfaceC1011540cQi interfaceC1011540cQi = (InterfaceC1011540cQi) ((LinkedHashMap) map).get(aid);
                        if (interfaceC1011540cQi != null) {
                            c0q18LIZ = interfaceC1011540cQi.LIZ();
                        }
                        c1011490cQd = new C0Q1C(r5, c0q18LIZ, C13LP.LJJLIIIJL(arrayList) instanceof C1011490cQd);
                    }
                    arrayList.add(c1011490cQd);
                }
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = c1011560cQk2.LIZ;
                if (viewOnAttachStateChangeListenerC20604515jv3 != null && (state = viewOnAttachStateChangeListenerC20604515jv3.getState()) != null) {
                    state.LJIIJJI(arrayList, null);
                }
            }
        };
        c0r13.LIZJ(new InterfaceC1011390cQT(context, aIAdCardStruct, aFwS334S0000000_10) { // from class: X.0R14
            public final InterfaceC1631620sYq<Aweme, String, View, Unit> LIZ;
            public final /* synthetic */ AIAdCardStruct LIZIZ;
            public final /* synthetic */ Context LIZJ;

            @Override // X.InterfaceC1011390cQT
            public final List<Aweme> getAwemeList() {
                AIAdCardStruct aIAdCardStruct2 = this.LIZIZ;
                if (aIAdCardStruct2 != null) {
                    return aIAdCardStruct2.getAwemeList();
                }
                return null;
            }

            @Override // X.InterfaceC1011390cQT
            public final InterfaceC1631620sYq<Aweme, String, View, Unit> LIZ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1011390cQT
            public final Context getContext() {
                return this.LIZJ;
            }

            {
                this.LIZ = aFwS334S0000000_10;
            }
        });
        return c0r13;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final InterfaceC656040PoI LJIIJJI(final Context context, final Aweme aweme, final AFwS334S0000000_10 aFwS334S0000000_10) {
        C1011180cQ8 c1011180cQ8 = new C1011180cQ8();
        c1011180cQ8.LIZJ(new InterfaceC1011380cQS(context, aweme, aFwS334S0000000_10) { // from class: X.0cQV
            public final Aweme LIZ;
            public final InterfaceC1631620sYq<Aweme, String, View, Unit> LIZIZ;
            public final /* synthetic */ Context LIZJ;

            @Override // X.InterfaceC1011380cQS
            public final InterfaceC1631620sYq<Aweme, String, View, Unit> LIZ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1011380cQS
            public final Aweme getAweme() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1011380cQS
            public final Context getContext() {
                return this.LIZJ;
            }

            {
                this.LIZ = aweme;
                this.LIZIZ = aFwS334S0000000_10;
            }
        });
        return c1011180cQ8;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final View LJIILIIL(String str, ViewGroup viewGroup, EnumC658120Pre enumC658120Pre) {
        C717630SCz c717630SCz = new C717630SCz(viewGroup);
        c717630SCz.LIZIZ(str, enumC658120Pre);
        return c717630SCz.LIZ;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final View LJIIZILJ(AwemeRawAd awemeRawAd, ViewGroup viewGroup, EnumC658120Pre enumC658120Pre) {
        if (awemeRawAd == null || viewGroup == null) {
            return null;
        }
        C717630SCz c717630SCz = new C717630SCz(viewGroup);
        c717630SCz.LIZ(awemeRawAd, enumC658120Pre);
        return c717630SCz.LIZ;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final InterfaceC656550Pp7 LJJII(Aweme aweme, Context context, EnumC658110Prd enumC658110Prd) {
        InterfaceC660150Puv interfaceC660150PuvLJIJ;
        InterfaceC656550Pp7 interfaceC656550Pp7;
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
        if (interfaceC657510PqfLIZLLL != null) {
            interfaceC660150PuvLJIJ = interfaceC657510PqfLIZLLL.LJIJ(aweme);
        } else {
            interfaceC660150PuvLJIJ = null;
        }
        if ((interfaceC660150PuvLJIJ instanceof InterfaceC656550Pp7) && (interfaceC656550Pp7 = (InterfaceC656550Pp7) interfaceC660150PuvLJIJ) != null) {
            return interfaceC656550Pp7;
        }
        C1011420cQW c1011420cQW = new C1011420cQW(context, aweme);
        int i = C658140Prg.LIZ[enumC658110Prd.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return new C1011070cPx(c1011420cQW);
            }
            return new C1011170cQ7(c1011420cQW);
        }
        return new C1011050cPv(c1011420cQW);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final void LJJIIJ(Context context, Aweme aweme, int i) {
        C1007860cKm c1007860cKmLJIILIIL;
        IFeedService iFeedServiceLIZIZ;
        InterfaceC1008930cMV interfaceC1008930cMVLIZJ;
        InterfaceC660150Puv interfaceC660150PuvLJIJ;
        Long lValueOf;
        C1004580cFU shareInfo;
        C1004580cFU shareInfo2;
        long jLJIILL;
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL;
        if (aweme == null) {
            return;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && C1010120cOQ.LJIJJ(awemeRawAd)) {
            if (C1010120cOQ.LJJIFFI(aweme) && i > 0 && (interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL()) != null) {
                interfaceC657510PqfLIZLLL.LJIILIIL().LIZLLL = true;
                interfaceC657510PqfLIZLLL.LJIILIIL().LJ = i;
            }
            if (C1010120cOQ.LJJIFFI(aweme)) {
                InterfaceC657510Pqf interfaceC657510PqfLIZLLL2 = C655610Pnb.LIZIZ.LIZLLL();
                if (interfaceC657510PqfLIZLLL2 != null) {
                    interfaceC660150PuvLJIJ = interfaceC657510PqfLIZLLL2.LJIJ(aweme);
                    if (interfaceC660150PuvLJIJ != null && (shareInfo2 = interfaceC660150PuvLJIJ.getShareInfo()) != null) {
                        IAdPhotoModeService iAdPhotoModeService = (IAdPhotoModeService) PluggableExtentionKt.pluggableSpi$default(IAdPhotoModeService.class, false, false, false, 14, null);
                        if (iAdPhotoModeService != null) {
                            jLJIILL = iAdPhotoModeService.LJIILL();
                        } else {
                            jLJIILL = 0;
                        }
                        shareInfo2.LJI = jLJIILL;
                    }
                } else {
                    interfaceC660150PuvLJIJ = null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[onDetailPageFinish] inflowImageStayTime = ");
                if (interfaceC660150PuvLJIJ != null && (shareInfo = interfaceC660150PuvLJIJ.getShareInfo()) != null) {
                    lValueOf = Long.valueOf(shareInfo.LJI);
                } else {
                    lValueOf = null;
                }
                sbLIZ.append(lValueOf);
                C2188811AlT.LIZIZ(sbLIZ);
                int i2 = C2510609se.LIZ;
            }
            ICommerceService iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi$default(ICommerceService.class, false, false, false, 14, null);
            if (iCommerceService != null && (iFeedServiceLIZIZ = iCommerceService.LIZIZ()) != null && (interfaceC1008930cMVLIZJ = iFeedServiceLIZIZ.LIZJ(context, aweme, "general_search", true)) != null) {
                interfaceC1008930cMVLIZJ.LJJIII();
                interfaceC1008930cMVLIZJ.LIZ();
                IAnoleManager iAnoleManagerRi = interfaceC1008930cMVLIZJ.Ri();
                if (iAnoleManagerRi != null) {
                    iAnoleManagerRi.LJ();
                }
            }
            InterfaceC657510Pqf interfaceC657510PqfLIZLLL3 = C655610Pnb.LIZIZ.LIZLLL();
            if (interfaceC657510PqfLIZLLL3 != null && (c1007860cKmLJIILIIL = interfaceC657510PqfLIZLLL3.LJIILIIL()) != null) {
                c1007860cKmLJIILIIL.LJFF = aweme;
            }
        }
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL4 = C655610Pnb.LIZIZ.LIZLLL();
        if (interfaceC657510PqfLIZLLL4 != null) {
            interfaceC657510PqfLIZLLL4.LJIIL();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0123  */
    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LIZIZ(android.content.Context r17, android.view.ViewGroup r18, com.ss.android.ugc.aweme.feed.model.Aweme r19, final X.InterfaceC682870QqT r20) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdMainService.LIZIZ(android.content.Context, android.view.ViewGroup, com.ss.android.ugc.aweme.feed.model.Aweme, X.0QqT):android.view.View");
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final void LJIJI(String str, String str2, AfS185S0100000_16 afS185S0100000_16, AfS185S0100000_16 afS185S0100000_162) {
        long j;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        C11NZ<NewLiveRoomStruct> c11nzLJFF;
        try {
            j = CastLongProtector.parseLong(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            j = 0;
        }
        ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null && (c11nzLJFF = interfaceC20673515v3K4.LJFF(j, str2)) != null) {
            c11nzLJFF.LJJLL(afS185S0100000_16, afS185S0100000_162);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final boolean LJIJJLI(Context context, Aweme aweme, String str, String str2) {
        if (context == null) {
            return false;
        }
        ICRouterManager iCRouterManager = (ICRouterManager) this.LIZIZ.getValue();
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        C1025880cnq c1025880cnq = new C1025880cnq(context, aid, aweme, C1017070cZd.LJJIJLIJ(aweme), ((ICRouterModelTransform) this.LIZ.getValue()).LIZ(C1017070cZd.LJJIJLIJ(aweme)));
        C1025520cnG c1025520cnG = new C1025520cnG(null, str2, null, str, "result_ad", 2, null, null, 965);
        C1025670cnV c1025670cnV = C1025670cnV.LIZIZ;
        Object[] objArr = 0 == true ? 1 : 0;
        iCRouterManager.LIZLLL(c1025880cnq, c1025520cnG, new C1021060cg4((CRouterCoreModel) (0 == true ? 1 : 0), (AbstractC1025510cnF) new C1025430cn7(c1025670cnV, c1025670cnV, null, objArr, 124), 5), true).LJI();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final boolean LJ(Context context, Aweme aweme, String str, String str2, int i, String str3, String str4) {
        if (context == null) {
            return false;
        }
        CRouterCoreModel cRouterCoreModel = (CRouterCoreModel) C309390CAv.LIZ(str4, CRouterCoreModel.class);
        ICRouterManager iCRouterManager = (ICRouterManager) this.LIZIZ.getValue();
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        C1025880cnq c1025880cnq = new C1025880cnq(context, aid, aweme, C1017070cZd.LJJIJLIJ(aweme), ((ICRouterModelTransform) this.LIZ.getValue()).LIZ(C1017070cZd.LJJIJLIJ(aweme)));
        C1025520cnG c1025520cnG = new C1025520cnG(null, str3, null, str, str2, i, null, null, 965);
        C1025670cnV c1025670cnV = C1025670cnV.LIZIZ;
        iCRouterManager.LIZLLL(c1025880cnq, c1025520cnG, new C1021060cg4(cRouterCoreModel, new C1025430cn7(c1025670cnV, c1025670cnV, null, 0 == true ? 1 : 0, 124), 4), true).LJI();
        return true;
    }
}
