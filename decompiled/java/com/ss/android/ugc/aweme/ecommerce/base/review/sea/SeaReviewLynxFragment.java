package com.ss.android.ugc.aweme.ecommerce.base.review.sea;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C034S;
import X.C098200Yq;
import X.C1073904Hx;
import X.C1120604Zw;
import X.C11T7;
import X.C13LE;
import X.C13LP;
import X.C1502500pCa;
import X.C1622206Wu;
import X.C1639420slQ;
import X.C1685300txQ;
import X.C1757320vpa;
import X.C1760450vud;
import X.C1760500vui;
import X.C1760620vuu;
import X.C1878350yyn;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1AQS;
import X.C2095008Iq;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C817603Hi;
import X.C987103tV;
import X.InterfaceC1164530gPT;
import X.InterfaceC1760590vur;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import Y.AfS195S0100000_26;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.ReviewApi;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.PdpReviewClickEvent;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaReviewLynxFragment extends ECBaseFragment implements InterfaceC1164530gPT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExHELIOSKTYpZz02PiwpPmEgLSRiGioyGiA6ICokBDwiMQkhKSIhLCEn";
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 323));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 325));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 321));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 324));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 322));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1394));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1393));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 514));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 515));
    public final AssemVMLazy LLJILJIL;
    public SeaPdpViewModel LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SeaReviewLynxFragment.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/review/sea/SeaReviewLynxViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SeaReviewLynxFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaReviewLynxViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 326);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(251);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 516), aFwS268S0000000_26, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new AwS570S0100000_26((Fragment) this, 517), aFwS268S0000000_26, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 518), aFwS268S0000000_26, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJILJIL = assemVMLazy;
    }

    public final int VR() {
        return ((Number) this.LLILZLL.getValue()).intValue();
    }

    public final SeaReviewLynxViewModel WR() {
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (SeaReviewLynxViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final void UR() {
        try {
            C1073904Hx c1073904Hx = WR().LLILZLL;
            PdpReviewClickEvent pdpReviewClickEvent = (PdpReviewClickEvent) this.LLIZ.getValue();
            String str = pdpReviewClickEvent != null ? pdpReviewClickEvent.btmToken : null;
            int iVR = VR();
            C817603Hi c817603Hi = c1073904Hx.LIZ;
            if (c817603Hi.LIZ) {
                return;
            }
            c817603Hi.LJIIL(this, iVR == 2 ? "a2270.b47167" : "a2270.b7736", str);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        IECommerceHostService iECommerceHostService;
        ISeaPdpCommunicationService iSeaPdpCommunicationServiceTR2;
        ISeaPdpCommunicationService iSeaPdpCommunicationServiceTR22;
        ISeaPdpCommunicationService iSeaPdpCommunicationServiceTR23;
        super.onDestroy();
        SeaPdpViewModel seaPdpViewModel = this.LLJILJILJ;
        if (seaPdpViewModel != null && (iSeaPdpCommunicationServiceTR23 = seaPdpViewModel.TR2()) != null) {
            iSeaPdpCommunicationServiceTR23.H6(this, "pdpSeaFetchReviewData");
        }
        SeaPdpViewModel seaPdpViewModel2 = this.LLJILJILJ;
        if (seaPdpViewModel2 != null && (iSeaPdpCommunicationServiceTR22 = seaPdpViewModel2.TR2()) != null) {
            iSeaPdpCommunicationServiceTR22.H6(this, "pdpSeaOpenReviewGallery");
        }
        SeaPdpViewModel seaPdpViewModel3 = this.LLJILJILJ;
        if (seaPdpViewModel3 != null && (iSeaPdpCommunicationServiceTR2 = seaPdpViewModel3.TR2()) != null) {
            iSeaPdpCommunicationServiceTR2.H6(this, "pdpSeaOpenReviewReportPage");
        }
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZJ("ec_cart_entry_click", this);
        }
        IEventCenter iEventCenter2 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter2 != null) {
            iEventCenter2.LIZJ("ec_share_icon_click", this);
        }
        IEventCenter iEventCenter3 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter3 != null) {
            iEventCenter3.LIZJ("ec_buy_now_click", this);
        }
        IEventCenter iEventCenter4 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter4 != null) {
            iEventCenter4.LIZJ("ec_sku_submit", this);
        }
        IEventCenter iEventCenter5 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter5 != null) {
            iEventCenter5.LIZJ("ec_add_cart_click", this);
        }
        IEventCenter iEventCenter6 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter6 != null) {
            iEventCenter6.LIZJ("ec_seller_shop_icon_click", this);
        }
        IEventCenter iEventCenter7 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter7 != null) {
            iEventCenter7.LIZJ("ec_im_icon_click", this);
        }
        IEventCenter iEventCenter8 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter8 != null) {
            iEventCenter8.LIZJ("ec_review_digg", this);
        }
        try {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                Object service = ServiceManager.get().getService(IApplicationDependencyService.class);
                IECommerceHostService iECommerceHostService2 = (IECommerceHostService) service;
                C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService2 != null ? iECommerceHostService2.getClass().getName() : null, iECommerceHostService2 != null);
                iECommerceHostService = (IECommerceHostService) service;
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            if (((IApplicationDependencyService) iECommerceHostService).isOffline()) {
                C1878350yyn.LIZ(InterfaceC1760590vur.LIZ, this);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final boolean ZR(String str) {
        String str2 = (String) this.LLJI.getValue();
        if (str2 != null && !a0.LJJJIL(str2) && str != null && !a0.LJJJIL(str) && !Intrinsics.LJFF(str, this.LLJI.getValue())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        String string;
        Object obj;
        ArrayList arrayList;
        String string2;
        String str;
        int[] iArrLLII;
        String str2;
        String str3;
        String str4;
        ISeaPdpCommunicationService iSeaPdpCommunicationServiceTR2;
        ISeaPdpCommunicationService iSeaPdpCommunicationServiceTR22;
        ISeaPdpCommunicationService iSeaPdpCommunicationServiceTR23;
        ISeaPdpCommunicationService iSeaPdpCommunicationServiceTR24;
        Object obj2;
        Object obj3;
        super.onCreate(bundle);
        WR().LL = (PdpReviewClickEvent) this.LLIZ.getValue();
        SeaReviewLynxViewModel seaReviewLynxViewModelWR = WR();
        String str5 = (String) this.LLILLL.getValue();
        String str6 = (String) this.LLILZ.getValue();
        if (VR() == 1) {
            i = 0;
        } else {
            i = 1;
        }
        Integer numValueOf = Integer.valueOf(((Number) this.LLILZIL.getValue()).intValue());
        String str7 = (String) this.LLIZLLLIL.getValue();
        HashMap map = (HashMap) this.LLJ.getValue();
        Integer numLJIIJJI = null;
        if (map != null && (obj3 = map.get("author_id")) != null) {
            string = obj3.toString();
        } else {
            string = null;
        }
        HashMap map2 = (HashMap) this.LLJ.getValue();
        if (map2 != null) {
            obj = map2.get("traffic_source_list");
        } else {
            obj = null;
        }
        if (!(obj instanceof ArrayList) || (arrayList = (ArrayList) obj) == null) {
            arrayList = new ArrayList();
        }
        HashMap map3 = (HashMap) this.LLJ.getValue();
        if (map3 != null && (obj2 = map3.get("traffic_source")) != null) {
            string2 = obj2.toString();
        } else {
            string2 = null;
        }
        seaReviewLynxViewModelWR.LLILLJJLI = new C1760450vud(str5, str6, i, numValueOf, str7, string, arrayList, string2, (String) this.LLJI.getValue(), (String) this.LLJIJIL.getValue());
        WR().LLILLL = (HashMap) this.LLJ.getValue();
        SeaPdpViewModel seaPdpViewModel = this.LLJILJILJ;
        if (seaPdpViewModel != null && (iSeaPdpCommunicationServiceTR24 = seaPdpViewModel.TR2()) != null) {
            C1502500pCa.LIZ(iSeaPdpCommunicationServiceTR24, this, "pdpSeaOpenReviewGallery", new AwS640S0100000_26(this, 186));
        }
        SeaPdpViewModel seaPdpViewModel2 = this.LLJILJILJ;
        if (seaPdpViewModel2 != null && (iSeaPdpCommunicationServiceTR23 = seaPdpViewModel2.TR2()) != null) {
            C1502500pCa.LIZ(iSeaPdpCommunicationServiceTR23, this, "pdpSeaOpenReviewReportPage", new AwS640S0100000_26(this, 187));
        }
        SeaPdpViewModel seaPdpViewModel3 = this.LLJILJILJ;
        if (seaPdpViewModel3 != null && (iSeaPdpCommunicationServiceTR22 = seaPdpViewModel3.TR2()) != null) {
            C1502500pCa.LIZ(iSeaPdpCommunicationServiceTR22, this, "pdpSeaReviewUpdateResponseCache", new AwS640S0100000_26(this, 188));
        }
        SeaPdpViewModel seaPdpViewModel4 = this.LLJILJILJ;
        if (seaPdpViewModel4 != null && (iSeaPdpCommunicationServiceTR2 = seaPdpViewModel4.TR2()) != null) {
            C1502500pCa.LIZ(iSeaPdpCommunicationServiceTR2, this, "pdpSeaReviewGetResponseCache", new AwS640S0100000_26(this, 189));
        }
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZLLL("ec_cart_entry_click", this);
        }
        IEventCenter iEventCenter2 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter2 != null) {
            iEventCenter2.LIZLLL("ec_share_icon_click", this);
        }
        IEventCenter iEventCenter3 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter3 != null) {
            iEventCenter3.LIZLLL("ec_buy_now_click", this);
        }
        IEventCenter iEventCenter4 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter4 != null) {
            iEventCenter4.LIZLLL("ec_sku_submit", this);
        }
        IEventCenter iEventCenter5 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter5 != null) {
            iEventCenter5.LIZLLL("ec_add_cart_click", this);
        }
        IEventCenter iEventCenter6 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter6 != null) {
            iEventCenter6.LIZLLL("ec_seller_shop_icon_click", this);
        }
        IEventCenter iEventCenter7 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter7 != null) {
            iEventCenter7.LIZLLL("ec_im_icon_click", this);
        }
        IEventCenter iEventCenter8 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter8 != null) {
            iEventCenter8.LIZLLL("ec_review_digg", this);
        }
        SeaReviewLynxViewModel seaReviewLynxViewModelWR2 = WR();
        C1760620vuu c1760620vuuLIZIZ = C1760500vui.LIZIZ(seaReviewLynxViewModelWR2.LLILLJJLI.LIZ);
        C1760450vud c1760450vud = seaReviewLynxViewModelWR2.LLILLJJLI;
        if (c1760450vud.LIZJ == 0) {
            String str8 = seaReviewLynxViewModelWR2.LLILLJJLI.LIZ;
            PdpReviewClickEvent pdpReviewClickEvent = seaReviewLynxViewModelWR2.LL;
            if (pdpReviewClickEvent != null) {
                str2 = pdpReviewClickEvent.clickedFilterId;
                str3 = pdpReviewClickEvent.clickedReviewId;
            } else {
                str2 = null;
                str3 = null;
            }
            Boolean bool = Boolean.TRUE;
            Boolean bool2 = Boolean.FALSE;
            if (pdpReviewClickEvent != null && (str4 = pdpReviewClickEvent.clickedFilterType) != null) {
                numLJIIJJI = C2095008Iq.LJIIJJI(str4);
            }
            new C11T7(AFwS311S0000000_25.get$arr$(69), C1639420slQ.LIZ(c1760620vuuLIZIZ.LIZLLL, c1760620vuuLIZIZ.LJIIIZ)).request(new ReviewApi.ReviewRequest(str8, str2, 10, 1, true, 1, str3, bool, null, bool2, null, numLJIIJJI, null, seaReviewLynxViewModelWR2.LLILLJJLI.LJIIIZ)).LJJLL(new AfS195S0100000_26(seaReviewLynxViewModelWR2, 17), new AfS195S0100000_26(seaReviewLynxViewModelWR2, 18));
            return;
        }
        String str9 = c1760450vud.LIZ;
        String str10 = c1760450vud.LIZIZ;
        PdpReviewClickEvent pdpReviewClickEvent2 = seaReviewLynxViewModelWR2.LL;
        if (pdpReviewClickEvent2 != null) {
            str = pdpReviewClickEvent2.clickedFilterId;
        } else {
            str = null;
        }
        String str11 = c1760450vud.LJFF;
        ArrayList<Integer> arrayList2 = c1760450vud.LJI;
        if (arrayList2 != null) {
            iArrLLII = C13LP.LLII(arrayList2);
        } else {
            iArrLLII = null;
        }
        Boolean bool3 = Boolean.TRUE;
        String str12 = seaReviewLynxViewModelWR2.LLILLJJLI.LJII;
        if (str12 != null) {
            numLJIIJJI = C2095008Iq.LJIIJJI(str12);
        }
        new C11T7(AFwS311S0000000_25.get$arr$(69), C1639420slQ.LIZ(c1760620vuuLIZIZ.LJFF, c1760620vuuLIZIZ.LJIIJ)).request(new ReviewApi.ListShopReviewRequest(str9, str10, true, 10, 1, str, str11, iArrLLII, bool3, numLJIIJJI, 1, Boolean.FALSE)).LJJLL(new AfS195S0100000_26(seaReviewLynxViewModelWR2, 19), new AfS195S0100000_26(seaReviewLynxViewModelWR2, 20));
    }

    public final void aS(String str, Map<String, ? extends Object> map) {
        ISeaPdpCommunicationService iSeaPdpCommunicationServiceTR2;
        SeaPdpViewModel seaPdpViewModel = this.LLJILJILJ;
        if (seaPdpViewModel != null && (iSeaPdpCommunicationServiceTR2 = seaPdpViewModel.TR2()) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("button_name", str);
            linkedHashMap.put("event_params", map);
            iSeaPdpCommunicationServiceTR2.kC2(this, "pdp_sea_button_click", linkedHashMap, null, new C1757320vpa(null));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0268 A[Catch: s -> 0x027d, Exception -> 0x037f, TryCatch #1 {Exception -> 0x037f, blocks: (B:114:0x0249, B:115:0x0252, B:117:0x0258, B:119:0x025d, B:121:0x0271, B:124:0x027a, B:131:0x0286, B:133:0x0294, B:134:0x0298, B:137:0x02a2, B:141:0x02ac, B:143:0x02b1, B:145:0x02b5, B:146:0x02ba, B:150:0x02e9, B:152:0x02ee, B:154:0x02f6, B:155:0x02fb, B:157:0x02ff, B:158:0x030c, B:160:0x0310, B:161:0x0315, B:163:0x0319, B:164:0x0326, B:166:0x032a, B:168:0x0331, B:170:0x0335, B:171:0x0342, B:173:0x0346, B:174:0x0353, B:176:0x0357, B:177:0x035c, B:179:0x0362, B:181:0x0367, B:130:0x0282, B:120:0x0268), top: B:207:0x0249 }] */
    @Override // X.InterfaceC1164530gPT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onEvent(java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.review.sea.SeaReviewLynxFragment.onEvent(java.lang.String, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS603S0100000_24(this, 49), 3);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.axg, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
