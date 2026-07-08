package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C10493048l;
import X.C1397510mTF;
import X.C13LE;
import X.C13LQ;
import X.C1440005kM;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1722550uvV;
import X.C189200o6;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C338490DOt;
import X.C418440Gaw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.C814803Gg;
import X.C817603Hi;
import X.C890103dr;
import X.C894903ed;
import X.C897503f3;
import X.C914303hl;
import X.C933503kr;
import X.C983603sw;
import X.C987103tV;
import X.EnumC1712310uez;
import X.EnumC872903b5;
import X.InterfaceC1164530gPT;
import X.InterfaceC1722540uvU;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.InterfaceC902903fv;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPipoEcomRiskAppealV3ConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.DirectCheckoutBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p8b.c;

/* JADX INFO: loaded from: classes2.dex */
public final class CCDCAddCardHalfFragment extends CommerceBottomSheetDialogFragment implements c, InterfaceC1164530gPT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZyHELIOSAgOGs8KDY+LSs4ZywwLCZiCgwXCwQoLQwyOiEEKCM1DjctLiI2JjE=";
    public TuxNavBar LLJI;
    public C197039127h LLJIJIL;
    public DirectCheckoutBottomWidget LLJILJIL;
    public TuxTextView LLJILJILJ;
    public LinearLayout LLJILLL;
    public TuxTextView LLJJ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJI;
    public FrameLayout LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public PaymentMethod LLJJIJIIJIL;
    public EnterParams LLJJIJIL;
    public String LLJJJ;
    public EnumC872903b5 LLJJJIL;
    public Function0<Unit> LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final CCDCAddCardHalfFragment$processLifecycleObserver$1 LLJJJJLIIL;
    public InterfaceC902903fv LLJJL;
    public C1397510mTF LLJJLIIIJLLLLLLLZ;
    public C1397510mTF LLJL;
    public View LLJLIL;
    public TuxSheet LLJLILLLLZIIL;
    public boolean LLJLL;
    public C983603sw LLJLLIL;
    public boolean LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CCDCAddCardHalfFragment.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/payment/ccdc/CCDCAddCardViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CCDCAddCardHalfFragment() {
        AssemVMLazy assemVMLazy;
        super(0);
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CCDCAddCardViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 1040);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(186);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS545S0100000_1, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1041), aFwS228S0000000_1, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS545S0100000_1, new AwS545S0100000_1((Fragment) this, 1042), aFwS228S0000000_1, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS545S0100000_1, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1043), aFwS228S0000000_1, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJIJI = assemVMLazy;
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1039));
        this.LLJJJJLIIL = new CCDCAddCardHalfFragment$processLifecycleObserver$1();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, androidx.fragment.app.DialogFragment
    public final int getTheme() {
        this.LL = true;
        return R.style.aad;
    }

    @Override // p8b.c
    public final String getViewName() {
        return "CCDCAddCardHalfFragment";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment
    public final boolean uH() {
        return false;
    }

    public final void cS() {
        Function0<Unit> function0 = this.LLJJJJ;
        if (function0 != null) {
            function0.invoke();
        }
        dismissAllowingStateLoss();
    }

    public final C197039127h dS() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ckd) : null;
            this.LLJIJIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final DirectCheckoutBottomWidget gS() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.fui) : null;
            this.LLJILJIL = (DirectCheckoutBottomWidget) viewFindViewById;
        }
        return (DirectCheckoutBottomWidget) viewFindViewById;
    }

    public final TuxTextView hS() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.q5r) : null;
            this.LLJILJILJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final ViewOnAttachStateChangeListenerC20604515jv iS() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qjt) : null;
            this.LLJJI = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
    }

    public final CCDCAddCardViewModel kS() {
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
        return (CCDCAddCardViewModel) assemVMLazy.getValue();
    }

    public final boolean mS() {
        PaymentMethodsData paymentMethodsData;
        EnterParams enterParams = this.LLJJIJIL;
        return !(enterParams == null || (paymentMethodsData = enterParams.paymentData) == null || !paymentMethodsData.LJJII()) || C897503f3.LJI(this.LLJJIJIL);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment
    public final void PR() {
        C817603Hi c817603Hi = kS().LLJJIJI;
        EnterParams enterParams = this.LLJJIJIL;
        c817603Hi.LIZJ = enterParams != null ? enterParams.LIZLLL : null;
        kS().LLJJIJI.LJIIL(this, "a2270.b8168", null);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment
    public final Integer VR() {
        return Integer.valueOf(C10493048l.LIZ() - C10493048l.LIZIZ(getActivity()));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Unit unit;
        super.onDestroyView();
        InterfaceC902903fv interfaceC902903fv = this.LLJJL;
        if (interfaceC902903fv != null) {
            interfaceC902903fv.LIZ();
        }
        ProcessLifecycleOwner.Companion.get().getLifecycle().removeObserver(this.LLJJJJLIIL);
        C890103dr.LIZ.getClass();
        C890103dr.LIZJ.clear();
        ((LinkedHashMap) C890103dr.LJ).clear();
        C914303hl.LIZ.getClass();
        C914303hl.LIZJ(this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("EC_CLOSE_PREVIOUS_PAGE", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_payment_change", this);
        try {
            C1397510mTF c1397510mTF = this.LLJL;
            if (c1397510mTF == null || !c1397510mTF.LJIIIZ()) {
                unit = null;
            } else {
                c1397510mTF.LIZIZ(null);
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        this.LLJL = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIII = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        C19EG activity;
        super.onResume();
        C890103dr.LIZ.getClass();
        if (!C890103dr.LJ.containsKey("stay_duration")) {
            C890103dr.LJIJJ("stay_duration");
        }
        C933503kr c933503kr = C933503kr.LIZ;
        Context context = getContext();
        c933503kr.getClass();
        if (!C933503kr.LIZ(context)) {
            C933503kr.LIZIZ = EnumC1712310uez.NOT_SUPPORT;
            return;
        }
        Context context2 = getContext();
        if (context2 == null || !((IPipoCcdcService) ServiceManager.get().getService(IPipoCcdcService.class)).LJIIL(context2)) {
            EnumC1712310uez enumC1712310uez = EnumC1712310uez.NOT_ENABLED;
            C933503kr.LIZIZ = enumC1712310uez;
            C1440005kM.LIZ(new C894903ed(enumC1712310uez));
            return;
        }
        if (C933503kr.LIZIZ == EnumC1712310uez.NOT_ENABLED || C933503kr.LIZIZ == EnumC1712310uez.NOT_SUPPORT) {
            EnumC1712310uez enumC1712310uez2 = EnumC1712310uez.ENABLED;
            C933503kr.LIZIZ = enumC1712310uez2;
            C1440005kM.LIZ(new C894903ed(enumC1712310uez2));
        }
        if (this.LLJLL || (activity = getActivity()) == null) {
            return;
        }
        C1722550uvV c1722550uvVLJIILIIL = ((IPipoCcdcService) ServiceManager.get().getService(IPipoCcdcService.class)).LJIILIIL(activity, getViewLifecycleOwner(), new InterfaceC1722540uvU() { // from class: X.03ea
            @Override // X.InterfaceC1722540uvU
            public final void LIZIZ(List<String> list) {
            }

            @Override // X.InterfaceC1722540uvU
            public final void LIZJ() {
                C890103dr.LIZ.getClass();
                C890103dr.LJIJJ("nfc_scanning");
                C933503kr.LIZ.getClass();
                EnumC1712310uez enumC1712310uez3 = C933503kr.LIZIZ;
                EnumC1712310uez enumC1712310uez4 = EnumC1712310uez.SCANNING;
                if (enumC1712310uez3 != enumC1712310uez4) {
                    C933503kr.LIZIZ = enumC1712310uez4;
                    C1440005kM.LIZ(new C894903ed(enumC1712310uez4));
                }
            }

            @Override // X.InterfaceC1722540uvU
            public final void LIZ(C897203f0 c897203f0) {
                C933503kr.LIZ.getClass();
                EnumC1712310uez enumC1712310uez3 = C933503kr.LIZIZ;
                EnumC1712310uez enumC1712310uez4 = EnumC1712310uez.ENABLED;
                if (enumC1712310uez3 != enumC1712310uez4) {
                    C933503kr.LIZIZ = enumC1712310uez4;
                    C1440005kM.LIZ(new C894903ed(enumC1712310uez4));
                    CCDCAddCardViewModel cCDCAddCardViewModelKS = this.LIZ.kS();
                    String str = c897203f0.LIZ;
                    C904203g8 c904203g8KQ2 = this.LIZ.kS().KQ2();
                    String str2 = c897203f0.LIZIZ;
                    c904203g8KQ2.getClass();
                    cCDCAddCardViewModelKS.TQ2(new C894003eU(str, C904203g8.LJ(str2), c897203f0.LIZ), EnumC890503dv.NFC, -1);
                }
            }

            @Override // X.InterfaceC1722540uvU
            public final void onError(int i) {
                Context context3;
                C933503kr.LIZ.getClass();
                EnumC1712310uez enumC1712310uez3 = C933503kr.LIZIZ;
                EnumC1712310uez enumC1712310uez4 = EnumC1712310uez.ENABLED;
                if (enumC1712310uez3 != enumC1712310uez4) {
                    C933503kr.LIZIZ = enumC1712310uez4;
                    C1440005kM.LIZ(new C894903ed(enumC1712310uez4));
                    CCDCAddCardHalfFragment cCDCAddCardHalfFragment = this.LIZ;
                    C1397510mTF c1397510mTF = cCDCAddCardHalfFragment.LLJJLIIIJLLLLLLLZ;
                    if ((c1397510mTF != null && c1397510mTF.LJIIIZ()) || (context3 = cCDCAddCardHalfFragment.getContext()) == null) {
                        return;
                    }
                    C1397580mTM c1397580mTM = new C1397580mTM(context3);
                    c1397580mTM.LIZIZ(cCDCAddCardHalfFragment.getString(2131832877));
                    c1397580mTM.LJI(cCDCAddCardHalfFragment.getString(2131832878));
                    C985403tE.LIZ(c1397580mTM, AFwS228S0000000_1.get$arr$(627));
                    c1397580mTM.LJII = false;
                    c1397580mTM.LIZLLL(AFwS228S0000000_1.get$arr$(628));
                    C1397510mTF c1397510mTF2 = new C1397510mTF(c1397580mTM);
                    cCDCAddCardHalfFragment.LLJJLIIIJLLLLLLLZ = c1397510mTF2;
                    c1397510mTF2.LIZLLL();
                }
            }
        });
        this.LLJJL = c1722550uvVLJIILIIL;
        if (c1722550uvVLJIILIIL != null) {
            c1722550uvVLJIILIIL.LIZIZ();
        }
        this.LLJLL = true;
    }

    public final void nS(int i) {
        View currentFocus;
        View viewFindFocus;
        Window window;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvIS = iS();
        if (viewOnAttachStateChangeListenerC20604515jvIS == null) {
            return;
        }
        View[] viewArr = new View[2];
        C19EG activity = getActivity();
        Object obj = null;
        if (activity != null && (window = activity.getWindow()) != null) {
            currentFocus = window.getCurrentFocus();
        } else {
            currentFocus = null;
        }
        viewArr[0] = currentFocus;
        View view = getView();
        if (view != null) {
            viewFindFocus = view.findFocus();
        } else {
            viewFindFocus = null;
        }
        viewArr[1] = viewFindFocus;
        Iterator it2 = ((ArrayList) C13LQ.LJIJI(viewArr)).iterator();
        loop0: while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            View view2 = (View) next;
            while (view2 != null) {
                if (Intrinsics.LJFF(view2, viewOnAttachStateChangeListenerC20604515jvIS)) {
                    obj = next;
                    break loop0;
                } else {
                    Object parent = view2.getParent();
                    if (parent instanceof View) {
                        view2 = (View) parent;
                    }
                }
            }
        }
        View view3 = (View) obj;
        if (view3 == null) {
            return;
        }
        int[] iArr = new int[2];
        view3.getLocationOnScreen(iArr);
        int height = (iArr[1] + view3.getHeight()) - i;
        if (height >= 0 && height > 0) {
            viewOnAttachStateChangeListenerC20604515jvIS.scrollBy(0, height + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardHalfFragment.onCreate(android.os.Bundle):void");
    }

    public final void oS(String str, String str2) {
        Object c098200Yq;
        try {
            c098200Yq = getChildFragmentManager();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        FragmentManager fragmentManager = (FragmentManager) c098200Yq;
        if (fragmentManager == null) {
            return;
        }
        C814803Gg c814803Gg = C814803Gg.LIZ;
        Context context = getContext();
        c814803Gg.getClass();
        C814803Gg.LIZ(context, fragmentManager, str, str2);
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        Object c098200Yq;
        if (Intrinsics.LJFF(str, "EC_CLOSE_PREVIOUS_PAGE")) {
            cS();
            return;
        }
        if (!Intrinsics.LJFF(str, "ec_payment_change") || !EcPipoEcomRiskAppealV3ConfigSettings.LIZIZ()) {
            return;
        }
        try {
            c098200Yq = new JSONObject(str2).optString("appeal_scene");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        if (!Intrinsics.LJFF(c098200Yq, "ccdc_pre_bind") || !isAdded() || isDetached() || isRemoving()) {
            return;
        }
        dismissAllowingStateLoss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ce  */
    /* JADX WARN: Type inference failed for: r4v14, types: [X.03em, android.view.ViewTreeObserver$OnGlobalFocusChangeListener] */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instruction units count: 1279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardHalfFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.aop, viewGroup, false);
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
