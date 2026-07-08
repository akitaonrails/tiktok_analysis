package com.ss.android.ugc.aweme.commercialize.feed.assem;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C07CW;
import X.C07KT;
import X.C0RDX;
import X.C0RLP;
import X.C1003330cDT;
import X.C1009740cNo;
import X.C1010120cOQ;
import X.C1017070cZd;
import X.C1022620cia;
import X.C13LE;
import X.C1558520qew;
import X.C18169079r;
import X.C19719912Dl;
import X.C2189821An6;
import X.C289640BWw;
import X.C294480BgU;
import X.C452501pT;
import X.C693680RIw;
import X.C723830SaL;
import X.C724240Sb0;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C995580c0y;
import X.C995590c0z;
import X.C996010c1f;
import X.C996290c27;
import X.C996370c2F;
import X.C996490c2R;
import X.C996700c2m;
import X.C996720c2o;
import X.InterfaceC1017820caq;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC691660RBc;
import android.view.View;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ability.auto.IAutoADAbility;
import com.ss.android.ugc.aweme.ability.overlay.ICommerceFeedOverlayAbility;
import com.ss.android.ugc.aweme.ad.feed.component.IAdComponentService;
import com.ss.android.ugc.aweme.ad.service.ICommerceFeedOverlayService;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.commercialize.abtest.SplashAdAssemOptConfig;
import com.ss.android.ugc.aweme.commercialize.assem.AdAssemUtils;
import com.ss.android.ugc.aweme.commercialize.feed.assem.interactivead.AdInteractiveAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.playfun.AdPlayFunAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.tag.AdBesideSponsorLabelTagAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.tag.AdvertiserFollowerCountLabelAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.LandingPageConfig;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class FeedCommerceAssem extends CommerceContentBaseAssem<FeedCommerceAssem> implements IAutoADAbility, ICommerceFeedOverlayAbility, InterfaceC1554640qYg {
    public Aweme LLJL;
    public boolean LLJLILLLLZIIL;
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(129));
    public final C01GW LLJJL = C737910Sx3.LIZJ(this, C13LE.LIZ(FeedAdViewModel.class), AFwS252S0000000_16.get$arr$(113));
    public final C01GW LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZJ(this, C13LE.LIZ(FeedAdEventViewModel.class), AFwS252S0000000_16.get$arr$(114));
    public final C01GW LLJLIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(56));

    @Override // com.ss.android.ugc.aweme.ability.overlay.ICommerceFeedOverlayAbility
    public final void JT() {
        this.LLJLILLLLZIIL = true;
    }

    @Override // com.ss.android.ugc.aweme.ability.overlay.ICommerceFeedOverlayAbility
    public final void hn2() {
        this.LLJLILLLLZIIL = false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -832563578 || iHashCode == -789123018) {
            return this;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        ICommerceFeedOverlayService iCommerceFeedOverlayService = (ICommerceFeedOverlayService) PluggableExtentionKt.pluggableSpi$default(ICommerceFeedOverlayService.class, false, false, false, 14, null);
        if (iCommerceFeedOverlayService != null) {
            iCommerceFeedOverlayService.LIZJ(this);
        }
    }

    public final IAdComponentService ep() {
        return (IAdComponentService) this.LLJLIL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0RDX.LIZIZ((InterfaceC691660RBc) it2.next());
            }
        }
        ICommerceFeedOverlayService iCommerceFeedOverlayService = (ICommerceFeedOverlayService) PluggableExtentionKt.pluggableSpi$default(ICommerceFeedOverlayService.class, false, false, false, 14, null);
        if (iCommerceFeedOverlayService != null) {
            iCommerceFeedOverlayService.LIZJ(this);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        super.oo();
        C1022620cia.LJ("FeedCommerceAssem", "on in active");
    }

    @Override // com.ss.android.ugc.aweme.ability.overlay.ICommerceFeedOverlayAbility
    public final boolean nu0() {
        return this.LLJLILLLLZIIL;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC691660RBc) it2.next()).LJLIIIL(i);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC691660RBc) it2.next()).LLLI(i);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.auto.IAutoADAbility
    public final void mg0(C1003330cDT c1003330cDT) {
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJJLIIIJLLLLLLLZ.getValue();
        assemViewModel.getClass();
        assemViewModel.setState(new AwS595S0100000_16(c1003330cDT, 333));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new C0RLP(this, view));
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJLIIIJLLLLLLLZ.getValue(), C996290c27.INSTANCE, C736820SvI.LIZLLL(), new C996490c2R(), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJLIIIJLLLLLLLZ.getValue(), C996370c2F.INSTANCE, C736820SvI.LIZLLL(), new C996720c2o(), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJL.getValue(), C996010c1f.INSTANCE, C736820SvI.LIZLLL(), new C995580c0y(), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJL.getValue(), C996700c2m.INSTANCE, C736820SvI.LIZLLL(), new C995590c0z(), 4);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        boolean z;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        IFeedService iFeedServiceLIZIZ;
        InterfaceC1017820caq interfaceC1017820caqLJIILIIL;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        AwemeRawAd awemeRawAd2;
        LandingPageConfig landingPageConfig;
        Integer num;
        IAdAssemUtils iAdAssemUtilsLIZIZ;
        C19719912Dl c19719912DlLIZ;
        Aweme aweme2;
        AwemeRawAd awemeRawAd3;
        SplashAdAssemOptConfig splashAdAssemOptConfig;
        SplashAdAssemOptConfig splashAdAssemOptConfig2;
        VideoItemParams videoItemParams2 = videoItemParams;
        Aweme aweme3 = videoItemParams2.getAweme();
        this.LLJL = aweme3;
        if (aweme3 != null && C1017070cZd.LLFZ(aweme3)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (C1017070cZd.LLIZLLLIL(this.LLJL) && (splashAdAssemOptConfig2 = (SplashAdAssemOptConfig) C07KT.LIZ.getValue()) != null && Intrinsics.LJFF(splashAdAssemOptConfig2.interactiveGestureOpt, Boolean.TRUE)) {
                C723830SaL.LJ(this, C13LE.LIZ(AdInteractiveAssem.class), false, null);
            } else {
                C723830SaL.LJ(this, C13LE.LIZ(AdInteractiveAssem.class), true, null);
            }
        }
        Aweme aweme4 = this.LLJL;
        if (aweme4 != null && C1017070cZd.LLIILZL(aweme4)) {
            if (C1017070cZd.LLIZLLLIL(this.LLJL) && (splashAdAssemOptConfig = (SplashAdAssemOptConfig) C07KT.LIZ.getValue()) != null && Intrinsics.LJFF(splashAdAssemOptConfig.playFunOpt, Boolean.TRUE)) {
                C723830SaL.LJ(this, C13LE.LIZ(AdPlayFunAssem.class), false, null);
            } else {
                C723830SaL.LJ(this, C13LE.LIZ(AdPlayFunAssem.class), true, null);
            }
        }
        if (C1017070cZd.LJLIIIL(this.LLJL)) {
            C723830SaL.LJ(this, C13LE.LIZ(AdBesideSponsorLabelTagAssem.class), true, null);
        }
        Aweme aweme5 = videoItemParams2.getAweme();
        if (aweme5 != null && AwemeExtKt.isAdTraffic(aweme5) && (aweme2 = videoItemParams2.getAweme()) != null && (awemeRawAd3 = aweme2.getAwemeRawAd()) != null && awemeRawAd3.getFollowerLabel() != null && !C693680RIw.LIZ()) {
            C723830SaL.LJ(this, C13LE.LIZ(AdvertiserFollowerCountLabelAssem.class), true, null);
        }
        if (C1017070cZd.LJJLIIIJLJLI(this.LLJL) && (iAdAssemUtilsLIZIZ = AdAssemUtils.LIZIZ()) != null && (c19719912DlLIZ = iAdAssemUtilsLIZIZ.LIZ()) != null) {
            C723830SaL.LJ(this, c19719912DlLIZ, true, null);
        }
        if (C1017070cZd.LJ(this.LLJL) && C07CW.LIZ()) {
            C723830SaL.LJ(this, ep().LJIJ(), true, null);
        }
        if (C1017070cZd.LLIIL(this.LLJL)) {
            C723830SaL.LJ(this, ep().LJIIIIZZ(), true, null);
        }
        Aweme aweme6 = this.LLJL;
        if ((aweme6 != null && (awemeRawAd2 = aweme6.getAwemeRawAd()) != null && (landingPageConfig = awemeRawAd2.getLandingPageConfig()) != null && (num = landingPageConfig.webWatchWhileLoadingType) != null && num.intValue() == 1) || ((aweme = this.LLJL) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && C1010120cOQ.LJJJI(awemeRawAd))) {
            if (!C294480BgU.LIZIZ() && ((baseFeedPageParams = videoItemParams2.baseFeedPageParams) == null || (c2189821An6 = baseFeedPageParams.param) == null || c2189821An6.getAdBISurveyLandingPage() == null)) {
                C723830SaL.LJ(this, ep().LJIIL(), true, null);
            }
            C723830SaL.LJ(this, ep().LJJIFFI(), true, null);
        }
        C723830SaL.LJ(this, ep().LJIILIIL(), true, null);
        if (C1009740cNo.LIZLLL(this.LLJL) || C1017070cZd.LJJJJZI(this.LLJL)) {
            C723830SaL.LJ(this, ep().LJIJJLI(), true, null);
        }
        if (C289640BWw.LIZ()) {
            C723830SaL.LJ(this, ep().LJIILLIIL(), true, null);
        }
        if (C1017070cZd.LLIIL(this.LLJL) && C18169079r.LIZ()) {
            C723830SaL.LJ(this, ep().LJIIJJI(), true, null);
        }
        ICommerceService iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi$default(ICommerceService.class, false, false, false, 14, null);
        if (iCommerceService != null && (iFeedServiceLIZIZ = iCommerceService.LIZIZ()) != null && (interfaceC1017820caqLJIILIIL = iFeedServiceLIZIZ.LJIILIIL()) != null && interfaceC1017820caqLJIILIIL.LJIIIZ(C1017070cZd.LJJIJLIJ(this.LLJL))) {
            C723830SaL.LJ(this, ep().LJJ(), true, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0RDX.LIZ((InterfaceC691660RBc) it2.next(), i, aweme);
            }
        }
        ICommerceFeedOverlayService iCommerceFeedOverlayService = (ICommerceFeedOverlayService) PluggableExtentionKt.pluggableSpi$default(ICommerceFeedOverlayService.class, false, false, false, 14, null);
        if (iCommerceFeedOverlayService != null) {
            iCommerceFeedOverlayService.LIZIZ(this);
        }
    }
}
