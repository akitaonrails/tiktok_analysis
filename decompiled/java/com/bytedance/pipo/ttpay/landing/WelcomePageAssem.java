package com.bytedance.pipo.ttpay.landing;

import X.AbstractC2201008jo;
import X.C019F;
import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C0PEM;
import X.C1251150ifB;
import X.C12ES;
import X.C13LE;
import X.C1637806bA;
import X.C1717770unn;
import X.C1719730uqx;
import X.C1719770ur1;
import X.C1720020urQ;
import X.C1720100urY;
import X.C1720760usc;
import X.C1721300utU;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C2187701Ajg;
import X.C2200508jj;
import X.C2200608jk;
import X.C2200808jm;
import X.C2217381BqS;
import X.C23250099c;
import X.C426750GoL;
import X.C452501pT;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.EnumC1720110urZ;
import X.InterfaceC1720050urT;
import X.InterfaceC2217461Bqa;
import X.ViewTreeObserverOnGlobalLayoutListenerC1775940wJc;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.pipo.stellar.base.dynamic.page.DynamicPageAssem;
import com.bytedance.pipo.stellar.base.dynamic.page.DynamicPageViewModel;
import com.bytedance.pipo.stellar.base.model.prop.DialogContentDO;
import com.bytedance.pipo.stellar.base.model.prop.StellarActionDO;
import com.bytedance.pipo.stellar.base.model.prop.ToastContentDO;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS656S0100000_7;

/* JADX INFO: loaded from: classes27.dex */
public final class WelcomePageAssem extends DynamicPageAssem<C1720020urQ> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 55));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 32));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 31));
    public final AssemVMLazy LLJJ;
    public final long LLJJI;
    public long LLJJIII;
    public boolean LLJJIJI;
    public final Map<String, WeakReference<TuxSheet>> LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(WelcomePageAssem.class, "vm", "getVm()Lcom/bytedance/pipo/ttpay/landing/WelcomePageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public WelcomePageAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(WelcomePageViewModel.class);
        this.LLJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 33), AFwS268S0000000_26.get$arr$(37), null, true);
        checkSupervisorPrepared();
        new C723580SZw(this, C1719770ur1.class, "KEY_ARG_LANDING");
        this.LLJJI = System.currentTimeMillis();
        this.LLJJIII = System.currentTimeMillis();
        this.LLJJIJI = true;
        this.LLJJIJIIJIL = new LinkedHashMap();
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.pipo.stellar.base.dynamic.page.DynamicPageAssem
    public final C1720760usc Ka1() {
        Object c098200Yq;
        InterfaceC1720050urT interfaceC1720050urT = new InterfaceC1720050urT() { // from class: X.0urX
            /* JADX WARN: Removed duplicated region for block: B:59:0x0162  */
            @Override // X.InterfaceC1720050urT
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void bL(com.bytedance.pipo.stellar.base.model.prop.StellarActionDO r24, X.C1720250urn r25, androidx.fragment.app.Fragment r26) {
                /*
                    Method dump skipped, instruction units count: 1150
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1720090urX.bL(com.bytedance.pipo.stellar.base.model.prop.StellarActionDO, X.0urn, androidx.fragment.app.Fragment):void");
            }
        };
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(this, 53);
        try {
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI == null) {
                fragmentLJI = C724240Sb0.LJI(this);
            }
            c098200Yq = btmSDK.getPageId(PageFinder.via(fragmentLJI));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return new C1720760usc(this, interfaceC1720050urT, awS570S0100000_26, false, (String) c098200Yq, 8);
    }

    public final WelcomePageViewModel So() {
        AssemVMLazy assemVMLazy = this.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (WelcomePageViewModel) assemVMLazy.getValue();
    }

    public final void Vo() {
        Unit unit;
        if (this.LLJJIJI) {
            this.LLJJIJI = false;
            try {
                ViewTreeObserver viewTreeObserver = Ho().getViewTreeObserver();
                if (viewTreeObserver != null) {
                    ViewTreeObserverOnGlobalLayoutListenerC1775940wJc viewTreeObserverOnGlobalLayoutListenerC1775940wJc = new ViewTreeObserverOnGlobalLayoutListenerC1775940wJc(this, 1);
                    viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1775940wJc);
                    C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1775940wJc, ViewTreeObserver.OnGlobalLayoutListener.class);
                    unit = Unit.LIZ;
                } else {
                    unit = null;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    @Override // com.bytedance.pipo.stellar.base.dynamic.page.DynamicPageAssem
    public final void onRenderStart() {
        String str;
        try {
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            PageFinder pageFinderVia = PageFinder.via(C724240Sb0.LJI(this));
            BcmParams bcmParams = new BcmParams();
            Map<String, String> mapVQ2 = So().vQ2();
            if (mapVQ2 != null && (str = (String) ((LinkedHashMap) mapVQ2).get("active_scenario")) != null) {
                bcmParams.put("active_scenario", str);
            }
            btmSDK.setBcmPageParams(pageFinderVia, bcmParams, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.bytedance.pipo.stellar.base.dynamic.page.DynamicPageAssem
    public final DynamicPageViewModel<C1720020urQ> Jo() {
        return So();
    }

    @Override // com.bytedance.pipo.stellar.base.dynamic.page.DynamicPageAssem
    public final void No() {
        Ho().LIZJ();
        try {
            Vo();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        if (C1717770unn.LIZIZ().isAppBackGround()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("quit_type", "close");
            linkedHashMap.put("is_load_data", CardStruct.IStatusCode.DEFAULT);
            linkedHashMap.put("stay_time", String.valueOf(System.currentTimeMillis() - this.LLJJI));
            So().xQ2(linkedHashMap);
        }
    }

    @Override // com.bytedance.pipo.stellar.base.dynamic.page.DynamicPageAssem
    public final void Oo(StellarActionDO stellarActionDO) {
        C19EG activity;
        Fragment fragmentLJI;
        C19EG activity2;
        OnBackPressedDispatcher onBackPressedDispatcher;
        AbstractC2201008jo abstractC2201008joLIZIZ = C1720100urY.LIZIZ(stellarActionDO);
        if (abstractC2201008joLIZIZ == null) {
            return;
        }
        if (abstractC2201008joLIZIZ instanceof C2200508jj) {
            Fragment fragmentLJI2 = C724240Sb0.LJI(this);
            if (fragmentLJI2 != null) {
                C1721300utU c1721300utU = C1721300utU.LIZ;
                ToastContentDO toastContentDO = stellarActionDO.toastContent;
                c1721300utU.getClass();
                C1721300utU.LJIIL(fragmentLJI2, toastContentDO);
                return;
            }
            return;
        }
        if (abstractC2201008joLIZIZ instanceof C2200808jm) {
            if (((C2200808jm) abstractC2201008joLIZIZ).LIZ != EnumC1720110urZ.PAGE || (fragmentLJI = C724240Sb0.LJI(this)) == null || (activity2 = fragmentLJI.getActivity()) == null || (onBackPressedDispatcher = activity2.getOnBackPressedDispatcher()) == null) {
                return;
            }
            onBackPressedDispatcher.LJ();
            return;
        }
        if (!(abstractC2201008joLIZIZ instanceof C2200608jk)) {
            return;
        }
        C1721300utU c1721300utU2 = C1721300utU.LIZ;
        InterfaceC1720050urT interfaceC1720050urT = Ka1().LIZIZ;
        Fragment fragmentLJI3 = C724240Sb0.LJI(this);
        if (fragmentLJI3 != null) {
            activity = fragmentLJI3.getActivity();
        } else {
            activity = null;
        }
        DialogContentDO dialogContentDO = stellarActionDO.dialogContentDO;
        c1721300utU2.getClass();
        C1721300utU.LJIIJJI(interfaceC1720050urT, activity, dialogContentDO, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIZ(this, So(), new C2217381BqS() { // from class: X.0urL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1720020urQ) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0urN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1720020urQ) obj).LLILLJJLI;
            }
        }, null, new AwS656S0100000_7(this, 1), 12);
        WelcomePageViewModel welcomePageViewModelSo = So();
        welcomePageViewModelSo.withState(new AwS605S0100000_26(welcomePageViewModelSo, 503));
        C23250099c.LIZLLL(welcomePageViewModelSo.getAssemVMScope(), C0PEM.LIZJ, null, new C1719730uqx(welcomePageViewModelSo, null), 2);
        C426750GoL.LJIIIZ((View) this.LLJILLL.getValue(), null, Integer.valueOf(C12ES.LJIIJJI(C724240Sb0.LIZ(this))), null, null, false, 29);
        TuxNavBar tuxNavBar = (TuxNavBar) this.LLJILLL.getValue();
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB.LIZJ(new AwS570S0100000_26(this, 54));
        c0om1.LJ(c1251150ifB);
        c0om1.LIZJ(0);
        tuxNavBar.setNavActions(c0om1);
    }
}
