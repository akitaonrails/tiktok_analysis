package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.cci;

import X.C019F;
import X.C01D1;
import X.C03C8;
import X.C03DZ;
import X.C098200Yq;
import X.C09AY;
import X.C0H1U;
import X.C1397510mTF;
import X.C13LE;
import X.C1440005kM;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1722550uvV;
import X.C189200o6;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19FO;
import X.C19GS;
import X.C2097908Jt;
import X.C2187451AjH;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C616540OGe;
import X.C722002rq;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C830903Ml;
import X.C873003b6;
import X.C873403bA;
import X.C890103dr;
import X.C894903ed;
import X.C933503kr;
import X.C987103tV;
import X.EnumC1712310uez;
import X.EnumC872903b5;
import X.InterfaceC1722540uvU;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.cci.AddCCICardFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.DirectCheckoutBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS115S1100000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AddCCICardFragment extends ECBaseFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZyHELIOSAgOGs8KDY+LSs4ZywwLCZiKiw6ZgQoLQwQAQYtOysVOiQrJCo9PA==";
    public TuxNavBar LLILLL;
    public ViewOnAttachStateChangeListenerC20604515jv LLILZ;
    public C197039127h LLILZIL;
    public TuxTextView LLILZLL;
    public DirectCheckoutBottomWidget LLIZ;
    public FrameLayout LLIZLLLIL;
    public PaymentMethod LLJ;
    public EnterParams LLJI;
    public String LLJIJIL;
    public EnumC872903b5 LLJILJIL;
    public C09AY LLJILJILJ;
    public C873003b6 LLJILLL;
    public AwS580S0100000_1 LLJJ;
    public final AssemVMLazy LLJJI;
    public boolean LLJJIII;
    public C1397510mTF LLJJIJI;
    public KeyBoardVisibilityUtil LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AddCCICardFragment.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/payment/ccdc/CCDCAddCardViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AddCCICardFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CCDCAddCardViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 1050);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(198);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS545S0100000_1, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1051), aFwS228S0000000_1, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS545S0100000_1, new AwS545S0100000_1((Fragment) this, 1052), aFwS228S0000000_1, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS545S0100000_1, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1053), aFwS228S0000000_1, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJI = assemVMLazy;
    }

    public final C197039127h VR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ckd) : null;
            this.LLILZIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final CCDCAddCardViewModel WR() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (CCDCAddCardViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        KeyBoardVisibilityUtil keyBoardVisibilityUtil = this.LLJJIJIIJIL;
        if (keyBoardVisibilityUtil != null) {
            keyBoardVisibilityUtil.LIZ();
        }
        this.LLJJIJIIJIL = null;
        super.onDestroyView();
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        C19EG activity;
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(AddCCICardFragment.class.getName());
        }
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
        if (this.LLJJIII || (activity = getActivity()) == null) {
            return;
        }
        C1722550uvV c1722550uvVLJIILIIL = ((IPipoCcdcService) ServiceManager.get().getService(IPipoCcdcService.class)).LJIILIIL(activity, getViewLifecycleOwner(), new InterfaceC1722540uvU() { // from class: X.03eb
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
                    CCDCAddCardViewModel cCDCAddCardViewModelWR = this.LIZ.WR();
                    String str = c897203f0.LIZ;
                    C904203g8 c904203g8KQ2 = this.LIZ.WR().KQ2();
                    String str2 = c897203f0.LIZIZ;
                    c904203g8KQ2.getClass();
                    cCDCAddCardViewModelWR.TQ2(new C894003eU(str, C904203g8.LJ(str2), c897203f0.LIZ), EnumC890503dv.NFC, -1);
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
                    AddCCICardFragment addCCICardFragment = this.LIZ;
                    C1397510mTF c1397510mTF = addCCICardFragment.LLJJIJI;
                    if ((c1397510mTF != null && c1397510mTF.LJIIIZ()) || (context3 = addCCICardFragment.getContext()) == null) {
                        return;
                    }
                    C1397580mTM c1397580mTM = new C1397580mTM(context3);
                    c1397580mTM.LIZIZ(addCCICardFragment.getString(2131832877));
                    c1397580mTM.LJI(addCCICardFragment.getString(2131832878));
                    C985403tE.LIZ(c1397580mTM, AFwS228S0000000_1.get$arr$(641));
                    c1397580mTM.LJII = false;
                    c1397580mTM.LIZLLL(AFwS228S0000000_1.get$arr$(642));
                    C1397510mTF c1397510mTF2 = new C1397510mTF(c1397580mTM);
                    addCCICardFragment.LLJJIJI = c1397510mTF2;
                    c1397510mTF2.LIZLLL();
                }
            }
        });
        if (c1722550uvVLJIILIIL != null) {
            c1722550uvVLJIILIIL.LIZIZ();
        }
        this.LLJJIII = true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        EnterParams enterParams;
        C19FO c19fo;
        EnterParams enterParams2;
        String str2;
        ButtonInfo buttonInfo;
        String priceStr;
        BillInfoData billInfoData;
        Summary summaryLIZ;
        BillInfoData billInfoData2;
        Summary summaryLIZ2;
        Price price;
        PaymentMethodsData paymentMethodsData;
        ButtonStyle buttonStyleLJIILLIIL;
        Context context;
        PaymentMethodsData paymentMethodsData2;
        ButtonInfo buttonInfo2;
        ECRichText eCRichText;
        super.onViewCreated(view, bundle);
        C890103dr c890103dr = C890103dr.LIZ;
        EnterParams enterParams3 = this.LLJI;
        String str3 = this.LLJIJIL;
        String strLIZ = C873403bA.LIZ(this.LLJILJIL);
        WR().CQ2();
        PaymentMethod paymentMethod = this.LLJ;
        String str4 = null;
        if (paymentMethod != null) {
            str = paymentMethod.id;
        } else {
            str = null;
        }
        c890103dr.getClass();
        C890103dr.LIZLLL(enterParams3, str3, strLIZ, str);
        C890103dr.LJIJJ("stay_duration");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C890103dr.LIZJ);
        C890103dr.LJIJ("tiktokec_enter_page", linkedHashMap);
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.p12);
            } else {
                viewFindViewById = null;
            }
            this.LLILLL = (TuxNavBar) viewFindViewById;
        }
        C0H1U.LIZIZ(viewFindViewById);
        String strLIZIZ = C890103dr.LIZIZ(getContext(), 2131832653, "continue");
        C890103dr.LJIIIZ = strLIZIZ;
        C890103dr.LJI(strLIZIZ, C2097908Jt.LIZJ(new Pair("button_type", "add_card")));
        View viewFindViewById2 = this.LLILZ;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.qjt);
            } else {
                viewFindViewById2 = null;
            }
            this.LLILZ = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById2;
        }
        ((RecyclerView) viewFindViewById2).setNestedScrollingEnabled(false);
        C723850SaN.LIZ(this, false, null, new AwS115S1100000_1(this, strLIZIZ, 40), 3);
        EnterParams enterParams4 = this.LLJI;
        if (enterParams4 != null && (paymentMethodsData2 = enterParams4.paymentData) != null && (buttonInfo2 = paymentMethodsData2.cashierButtonInfo) != null && (eCRichText = buttonInfo2.authorizationStatement) != null) {
            View viewFindViewById3 = this.LLILZLL;
            if (viewFindViewById3 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById3 = view4.findViewById(R.id.q5r);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLILZLL = (TuxTextView) viewFindViewById3;
            }
            C03DZ.LIZJ(viewFindViewById3);
            View viewFindViewById4 = this.LLILZLL;
            if (viewFindViewById4 == null) {
                View view5 = getView();
                if (view5 != null) {
                    viewFindViewById4 = view5.findViewById(R.id.q5r);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLILZLL = (TuxTextView) viewFindViewById4;
            }
            C03C8.LIZJ((TextView) viewFindViewById4, eCRichText, "ccdc_payment_tips", null);
        }
        EnterParams enterParams5 = this.LLJI;
        if (enterParams5 != null && (paymentMethodsData = enterParams5.paymentData) != null && (buttonStyleLJIILLIIL = paymentMethodsData.LJIILLIIL(enterParams5.LJJIJIIJI)) != null) {
            int i = C830903Ml.LIZ[buttonStyleLJIILLIIL.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4 && (context = getContext()) != null) {
                            VR().LJJJJL(new AwS580S0100000_1(context, 640));
                        }
                    } else {
                        VR().setButtonVariant(4);
                    }
                } else {
                    VR().setButtonVariant(1);
                }
            } else {
                VR().setButtonVariant(0);
            }
        }
        if (Intrinsics.LJFF(this.LLJIJIL, "ADD_NEW_CCI_BR") && (enterParams2 = this.LLJI) != null && Intrinsics.LJFF(enterParams2.LJIIJ, Boolean.TRUE)) {
            View viewFindViewById5 = this.LLIZ;
            if (viewFindViewById5 == null) {
                View view6 = getView();
                if (view6 != null) {
                    viewFindViewById5 = view6.findViewById(R.id.fui);
                } else {
                    viewFindViewById5 = null;
                }
                this.LLIZ = (DirectCheckoutBottomWidget) viewFindViewById5;
            }
            DirectCheckoutBottomWidget directCheckoutBottomWidget = (DirectCheckoutBottomWidget) viewFindViewById5;
            if (directCheckoutBottomWidget != null) {
                EnterParams enterParams6 = this.LLJI;
                if (enterParams6 != null) {
                    str2 = enterParams6.LJIIL;
                    buttonInfo = enterParams6.LJIILIIL;
                } else {
                    str2 = null;
                    buttonInfo = null;
                }
                PaymentMethod paymentMethod2 = this.LLJ;
                if (enterParams6 != null && (billInfoData2 = enterParams6.LJIILLIIL) != null && (summaryLIZ2 = C722002rq.LIZ(billInfoData2, enterParams6.paymentInfo)) != null && (price = summaryLIZ2.total) != null) {
                    priceStr = price.getPriceStr();
                } else {
                    priceStr = null;
                }
                EnterParams enterParams7 = this.LLJI;
                if (enterParams7 != null && (billInfoData = enterParams7.LJIILLIIL) != null && (summaryLIZ = C722002rq.LIZ(billInfoData, enterParams7.paymentInfo)) != null) {
                    str4 = summaryLIZ.totalDiscountBenefitText;
                }
                DirectCheckoutBottomWidget.LIZ(directCheckoutBottomWidget, str2, buttonInfo, paymentMethod2, priceStr, str4, new AwS580S0100000_1(this, 641));
            }
        }
        if (Intrinsics.LJFF(this.LLJIJIL, "ADD_NEW_CCI_BR") && (enterParams = WR().LLILLJJLI) != null && Intrinsics.LJFF(enterParams.LJIIJ, Boolean.TRUE)) {
            Context context2 = getContext();
            if ((context2 instanceof C19GS) && (c19fo = (C19FO) context2) != null) {
                this.LLJJIJIIJIL = new KeyBoardVisibilityUtil(c19fo, (Integer) 32, (Function2<? super Boolean, ? super Integer, Unit>) new AwS615S0100000_1(this, 44));
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
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
