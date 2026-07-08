package com.ss.android.ugc.feed.platform.panel.midad;

import X.C01GW;
import X.C0BTK;
import X.C0N6Z;
import X.C0SHX;
import X.C0SR4;
import X.C0SZ8;
import X.C0T0X;
import X.C0T12;
import X.C0T1R;
import X.C0T3B;
import X.C1022290ci3;
import X.C1022620cia;
import X.C1029590ctp;
import X.C1511170pQZ;
import X.C1558520qew;
import X.C1559680qgo;
import X.C1559730qgt;
import X.C1566140qrE;
import X.C1590970rVH;
import X.C1601000rlS;
import X.C1618220sDE;
import X.C19EG;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2245741Cv6;
import X.C2344009Gk;
import X.C2487409ou;
import X.C274680Ape;
import X.C293430Ben;
import X.C299750Boz;
import X.C452501pT;
import X.C581980Ms8;
import X.C606500Nqa;
import X.C630740Ooa;
import X.C724240Sb0;
import X.C740740T3w;
import X.EnumC2245291CuN;
import X.EnumC452301pR;
import X.EnumC584610MwN;
import X.InterfaceC1481730of5;
import X.InterfaceC1483670oiD;
import X.InterfaceC1554640qYg;
import X.InterfaceC1565950qqv;
import X.InterfaceC1601020rlU;
import X.InterfaceC1603020roi;
import X.InterfaceC19392410tu;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC739770T0d;
import X.InterfaceC739930T0t;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.IAdReRankServiceManagerService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.feed.midad.IMidAdCellAbility;
import com.ss.android.ugc.aweme.commercialize.AwemeContextServiceImpl;
import com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper;
import com.ss.android.ugc.aweme.commercialize.service.IAwemeContextService;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import com.ss.android.ugc.feed.platform.cell.RootCellComponent;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility;
import com.ss.android.ugc.feed.platform.panel.midad.MidAdComponent;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class MidAdComponent extends BasePanelComponent implements IMidAdAbility, InterfaceC1554640qYg {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C1601000rlS LLILLL;

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -998920429) {
            return null;
        }
        return this;
    }

    public final IFeedPanelPlatformAbility bo() {
        return (IFeedPanelPlatformAbility) this.LL.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0rlS] */
    public MidAdComponent() {
        C01GW c01gwLIZIZ;
        C01GW c01gwLIZIZ2;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1549), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C1559680qgo(false, this));
        }
        this.LL = c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa2 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1550), null);
            C1566140qrE.LIZJ(this, c630740Ooa2);
            c01gwLIZIZ2 = c630740Ooa2;
        } else {
            c01gwLIZIZ2 = C452501pT.LIZIZ(new C1559730qgt(false, this));
        }
        this.LLILLJJLI = c01gwLIZIZ2;
        this.LLILLL = new InterfaceC19392410tu() { // from class: X.0rlS
            @Override // X.InterfaceC19392410tu
            public final void LIZ() {
                IMidAdCellAbility iMidAdCellAbilityHp0 = this.LIZ.Hp0();
                if (iMidAdCellAbilityHp0 != null) {
                    iMidAdCellAbilityHp0.kg1(true);
                }
            }

            @Override // X.InterfaceC19392410tu
            public final void LIZIZ() {
                IMidAdCellAbility iMidAdCellAbilityHp0 = this.LIZ.Hp0();
                if (iMidAdCellAbilityHp0 != null) {
                    iMidAdCellAbilityHp0.kg1(false);
                }
            }
        };
    }

    @Override // com.ss.android.ugc.feed.platform.panel.midad.IMidAdAbility
    public final IMidAdCellAbility Hp0() {
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        C0SZ8 c0sz8LJLIL;
        RootCellComponent rootCellComponentLIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo = bo();
        if (iFeedPanelPlatformAbilityBo == null || (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbilityBo.Mb()) == null || (c0sz8LJLIL = iViewPagerComponentAbilityMb.LJLIL()) == null || (rootCellComponentLIZ = C0T0X.LIZ(c0sz8LJLIL)) == null || (interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(rootCellComponentLIZ)) == null) {
            return null;
        }
        return (IMidAdCellAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, IMidAdCellAbility.class, null);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.midad.IMidAdAbility
    public final void LJJIII() {
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        C0SZ8 c0sz8LJLIL;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo = bo();
        if (iFeedPanelPlatformAbilityBo == null || (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbilityBo.Mb()) == null || (c0sz8LJLIL = iViewPagerComponentAbilityMb.LJLIL()) == null) {
            return;
        }
        c0sz8LJLIL.h(true);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.midad.IMidAdAbility
    public final List<Aweme> Mk() {
        C0SR4 c0sr4Zv0;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo = bo();
        if (iFeedPanelPlatformAbilityBo == null || (c0sr4Zv0 = iFeedPanelPlatformAbilityBo.Zv0()) == null) {
            return null;
        }
        return c0sr4Zv0.LJJJLZIJ();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.midad.IMidAdAbility
    public final ViewGroup getRootView() {
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        C0SZ8 c0sz8LJLIL;
        InterfaceC739930T0t interfaceC739930T0tLJIJJLI;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo = bo();
        View rootView = (iFeedPanelPlatformAbilityBo == null || (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbilityBo.Mb()) == null || (c0sz8LJLIL = iViewPagerComponentAbilityMb.LJLIL()) == null || (interfaceC739930T0tLJIJJLI = c0sz8LJLIL.LJIJJLI()) == null) ? null : interfaceC739930T0tLJIJJLI.getRootView();
        if (rootView instanceof ViewGroup) {
            return (ViewGroup) rootView;
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        C0SHX.LIZ(c19egLIZ, C1590970rVH.LIZ(this)).LJIIIZ("long_press_layer", new C0T3B() { // from class: X.0rlT
            @Override // X.C0T3B
            public final void LIZ() {
                IMidAdCellAbility iMidAdCellAbilityHp0 = this.LIZ.Hp0();
                if (iMidAdCellAbilityHp0 != null) {
                    iMidAdCellAbilityHp0.Wx0(false);
                }
            }

            @Override // X.C0T3B
            public final void LIZIZ() {
                IMidAdCellAbility iMidAdCellAbilityHp0 = this.LIZ.Hp0();
                if (iMidAdCellAbilityHp0 != null) {
                    iMidAdCellAbilityHp0.Wx0(true);
                }
            }
        });
        IPipFeedService iPipFeedService = (IPipFeedService) ServiceManager.get().getService(IPipFeedService.class);
        if (iPipFeedService != null) {
            iPipFeedService.LJIILIIL(this.LLILLL);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        try {
            SettingsManager.LIZLLL().getClass();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (SettingsManager.LIZ("mid_roll_memory_leak_fix", true)) {
            IPipFeedService iPipFeedService = (IPipFeedService) ServiceManager.get().getService(IPipFeedService.class);
            if (iPipFeedService != null) {
                iPipFeedService.LJFF(this.LLILLL);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.midad.IMidAdAbility
    public final void r3(Aweme aweme) {
        String aid;
        int iLJLLJ;
        C2189821An6 c2189821An6;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo;
        Aweme awemeD2;
        Aweme awemeD22;
        String aid2;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo2;
        IAdReRankServiceManagerService iAdReRankServiceManagerService;
        InterfaceC1603020roi interfaceC1603020roiLIZIZ;
        InterfaceC1603020roi interfaceC1603020roiLIZIZ2;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        C0SZ8 c0sz8LJLIL;
        Aweme aweme2;
        if (!C2245741Cv6.LIZJ(aweme) && !C2245741Cv6.LIZIZ(aweme)) {
            return;
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo3 = bo();
        String aid3 = null;
        if (iFeedPanelPlatformAbilityBo3 != null && (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbilityBo3.Mb()) != null && (c0sz8LJLIL = iViewPagerComponentAbilityMb.LJLIL()) != null && (aweme2 = c0sz8LJLIL.getAweme()) != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        if (!TextUtils.equals(aid, aweme.getAid())) {
            return;
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo4 = bo();
        int itemCount = 0;
        if (iFeedPanelPlatformAbilityBo4 != null) {
            iLJLLJ = iFeedPanelPlatformAbilityBo4.LJLLJ();
        } else {
            iLJLLJ = 0;
        }
        IAdReRankServiceManagerService iAdReRankServiceManagerService2 = (IAdReRankServiceManagerService) ServiceManager.get().getService(IAdReRankServiceManagerService.class);
        if (iAdReRankServiceManagerService2 != null && (interfaceC1603020roiLIZIZ2 = iAdReRankServiceManagerService2.LIZIZ(EnumC584610MwN.FEED)) != null) {
            interfaceC1603020roiLIZIZ2.H4(iLJLLJ, aweme);
        }
        if (C2245741Cv6.LIZJ(aweme)) {
            C274680Ape.LIZ.getClass();
            C293430Ben.LIZ.getClass();
            if (C293430Ben.LIZ() && ((Number) C274680Ape.LIZIZ.getValue()).intValue() == 1 && (iAdReRankServiceManagerService = (IAdReRankServiceManagerService) ServiceManager.get().getService(IAdReRankServiceManagerService.class)) != null && (interfaceC1603020roiLIZIZ = iAdReRankServiceManagerService.LIZIZ(EnumC584610MwN.FEED)) != null) {
                interfaceC1603020roiLIZIZ.Z4(EnumC2245291CuN.ON_SHOW_POSTROLL);
            }
            IAwemeContextService iAwemeContextServiceLIZ = AwemeContextServiceImpl.LIZ();
            if (bo() != null && iAwemeContextServiceLIZ != null) {
                int i = iLJLLJ - 1;
                int i2 = iLJLLJ + 1;
                if (i == -1) {
                    awemeD2 = iAwemeContextServiceLIZ.LLLJL();
                } else {
                    IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo5 = bo();
                    if (iFeedPanelPlatformAbilityBo5 != null) {
                        awemeD2 = iFeedPanelPlatformAbilityBo5.d2(i);
                    } else {
                        awemeD2 = null;
                    }
                }
                IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo6 = bo();
                if (iFeedPanelPlatformAbilityBo6 != null) {
                    itemCount = iFeedPanelPlatformAbilityBo6.getItemCount();
                }
                if (i2 < itemCount && (iFeedPanelPlatformAbilityBo2 = bo()) != null) {
                    awemeD22 = iFeedPanelPlatformAbilityBo2.d2(i2);
                } else {
                    awemeD22 = null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[mayAppendContext] previous=[aid=");
                if (awemeD2 != null) {
                    aid2 = awemeD2.getAid();
                } else {
                    aid2 = null;
                }
                sbLIZ.append(aid2);
                sbLIZ.append(",index=");
                sbLIZ.append(i);
                sbLIZ.append("], next=[aid=");
                if (awemeD22 != null) {
                    aid3 = awemeD22.getAid();
                }
                sbLIZ.append(aid3);
                sbLIZ.append(",index=");
                sbLIZ.append(i2);
                sbLIZ.append(']');
                C1022620cia.LIZ("MidAdComponent", C2188811AlT.LIZIZ(sbLIZ));
                iAwemeContextServiceLIZ.LLLL(aweme, awemeD2, awemeD22);
            }
            ((IAdReRankServiceManagerService) ServiceManager.get().getService(IAdReRankServiceManagerService.class)).LIZIZ(EnumC584610MwN.FEED).K4(iLJLLJ, aweme);
            C1029590ctp.LIZLLL().LJIILJJIL(getContext(), aweme);
            if (C0BTK.LIZ() && (c2189821An6 = getPanelContext().LIZJ) != null && (iFeedPanelPlatformAbilityBo = bo()) != null) {
                C0T12.LIZ(aweme, iFeedPanelPlatformAbilityBo.zj(), c2189821An6, C0T1R.LIZ(getPanelContext()), C724240Sb0.LIZ(this));
            }
        }
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static final void m343do(Aweme aweme, Aweme aweme2, boolean z, MidAdComponent midAdComponent, C0SR4 c0sr4) {
        int iLJJLIIIJ;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        String aid;
        if (C2245741Cv6.LIZIZ(aweme) && C2245741Cv6.LIZJ(aweme2)) {
            C1618220sDE c1618220sDE = C1618220sDE.LIZ;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            c1618220sDE.getClass();
            if (aid != null) {
                C1618220sDE.LIZJ(new C2344009Gk(), aid, "midroll_ads_show");
            }
        }
        if (z) {
            DataLayerAbility dataLayerAbility = (DataLayerAbility) midAdComponent.LLILLJJLI.getValue();
            if (dataLayerAbility != null) {
                int iAu = dataLayerAbility.au(aweme);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[replaceAwemeNewInternal] new=");
                sbLIZ.append(aweme2.getAid());
                sbLIZ.append(", position=");
                sbLIZ.append(iAu);
                C1022620cia.LIZ("MidAdComponent", C2188811AlT.LIZIZ(sbLIZ));
                if (iAu >= 0) {
                    dataLayerAbility.YE0(iAu, iAu + 1, new C606500Nqa("post_roll", "ad"), Collections.singletonList(aweme2));
                }
            }
        } else {
            if (c0sr4 != null) {
                iLJJLIIIJ = c0sr4.LJJLIIIJ(aweme);
            } else {
                iLJJLIIIJ = -1;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[replaceAwemeInternal] new=");
            sbLIZ2.append(aweme2.getAid());
            sbLIZ2.append(", position=");
            sbLIZ2.append(iLJJLIIIJ);
            C1022620cia.LIZ("MidAdComponent", C2188811AlT.LIZIZ(sbLIZ2));
            if (iLJJLIIIJ < 0) {
                return;
            }
            if (c0sr4 != null) {
                c0sr4.LJJLIIJ(c0sr4.LJJLIIIJ(aweme), aweme2);
            }
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo = midAdComponent.bo();
        if (iFeedPanelPlatformAbilityBo != null && (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbilityBo.Mb()) != null) {
            iViewPagerComponentAbilityMb.cA0();
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(midAdComponent);
        if (c19egLIZ != null) {
            C740740T3w.LJII(c19egLIZ, aweme2);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.midad.IMidAdAbility
    public final void JH0(final Aweme aweme, final Aweme aweme2, InterfaceC1483670oiD interfaceC1483670oiD, InterfaceC1601020rlU interfaceC1601020rlU, Long l, final boolean z) {
        C0SR4 c0sr4Zv0;
        long currentPosition;
        int iS2;
        IPlayerComponentAbility iPlayerComponentAbilityX32;
        InterfaceC739770T0d interfaceC739770T0dP2;
        InterfaceC1481730of5 interfaceC1481730of5LJIIIZ;
        if (aweme2 == null || aweme == null) {
            return;
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo = bo();
        if (iFeedPanelPlatformAbilityBo != null) {
            c0sr4Zv0 = iFeedPanelPlatformAbilityBo.Zv0();
        } else {
            c0sr4Zv0 = null;
        }
        if (C2245741Cv6.LIZJ(aweme)) {
            C0N6Z.LJIIIZ = true;
            if (interfaceC1483670oiD != null && (interfaceC1481730of5LJIIIZ = interfaceC1483670oiD.LJIIIZ()) != null) {
                currentPosition = interfaceC1481730of5LJIIIZ.getCurrentPosition();
            } else {
                currentPosition = 0;
            }
            C581980Ms8 c581980Ms8 = new C581980Ms8(currentPosition, 12);
            IAdSceneService iAdSceneService = (IAdSceneService) ServiceManager.get().getService(IAdSceneService.class);
            int iLJLLJ = 0;
            if (iAdSceneService != null && iAdSceneService.LIZIZ() != null) {
                Context context = getContext();
                String aid = aweme.getAid();
                IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo2 = bo();
                if (iFeedPanelPlatformAbilityBo2 != null && (iPlayerComponentAbilityX32 = iFeedPanelPlatformAbilityBo2.x32()) != null && (interfaceC739770T0dP2 = iPlayerComponentAbilityX32.P2()) != null) {
                    iS2 = interfaceC739770T0dP2.s2();
                } else {
                    iS2 = 0;
                }
                C1022290ci3.LIZJ(aweme2, context, aweme, aid, c581980Ms8, iS2 + 1, C1511170pQZ.LIZIZ());
            }
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo3 = bo();
            if (iFeedPanelPlatformAbilityBo3 != null) {
                iLJLLJ = iFeedPanelPlatformAbilityBo3.LJLLJ();
            }
            ((IAdReRankServiceManagerService) ServiceManager.get().getService(IAdReRankServiceManagerService.class)).LIZIZ(EnumC584610MwN.FEED).O4(iLJLLJ, aweme);
            AdSessionPositionHelper.LIZ.getClass();
            long j = AdSessionPositionHelper.LJII;
            if (j != -1) {
                AdSessionPositionHelper.LJIIIIZZ = j;
                AdSessionPositionHelper.LJII = -1L;
            }
            if (interfaceC1601020rlU != null) {
                interfaceC1601020rlU.LJJI();
            }
        }
        if (l != null && l.longValue() > 0) {
            final C0SR4 c0sr4 = c0sr4Zv0;
            C2487409ou.LIZLLL(l.longValue(), new Runnable() { // from class: X.0rlR
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MidAdComponent@75e.replaceAweme$1");
                    try {
                        MidAdComponent.m343do(aweme, aweme2, z, this, c0sr4);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MidAdComponent@75e.replaceAweme$1");
                }
            });
        } else {
            m343do(aweme, aweme2, z, this, c0sr4Zv0);
        }
    }
}
