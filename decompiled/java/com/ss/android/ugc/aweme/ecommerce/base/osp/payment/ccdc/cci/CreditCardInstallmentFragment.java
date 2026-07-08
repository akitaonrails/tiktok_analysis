package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.cci;

import X.C01GW;
import X.C03SY;
import X.C03WK;
import X.C098200Yq;
import X.C0OM1;
import X.C10493048l;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C340190DVh;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C865003Zo;
import X.C865503Zt;
import X.C873403bA;
import X.C890103dr;
import X.C897103ez;
import X.C914303hl;
import X.C958103op;
import X.C985403tE;
import X.EnumC837803Pc;
import X.EnumC865103Zp;
import X.EnumC872903b5;
import X.InterfaceC1164530gPT;
import X.InterfaceC871003am;
import Y.ARunnableS101S0100000_1;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomMergeBalanceAndInstallmentSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.cci.AddCCICardFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.cci.CreditCardInstallmentFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CciCashierDisplayType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle;
import com.ss.android.ugc.aweme.ecommerce.core.ab.GuaranteeConfig;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS402S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import p8b.c;

/* JADX INFO: loaded from: classes2.dex */
public final class CreditCardInstallmentFragment extends CommerceBottomSheetDialogFragment implements c, InterfaceC1164530gPT {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZyAgOGs8HELIOSKDY+LSs4ZywwLCZiKiw6ZgY+LCs6PAYtOysaJjY4KCM/JSAiPQkhKSIhLCEn";
    public TuxNavBar LLJI;
    public PaymentMethod LLJIJIL;
    public EnterParams LLJILJIL;
    public EnumC865103Zp LLJILJILJ;
    public EnumC865103Zp LLJILLL;
    public EnumC872903b5 LLJJ;
    public Function0<Unit> LLJJI;
    public String LLJJIII;
    public ButtonStyle LLJJIJI;
    public FragmentManager LLJJIJIIJIL;
    public PaymentInfo LLJJIJIL;
    public InterfaceC871003am LLJJJ;
    public InstallmentPlan LLJJJIL;
    public String LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;

    public CreditCardInstallmentFragment() {
        super(0);
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1056));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1055));
    }

    @Override // p8b.c
    public final String getViewName() {
        return "CCDCAddCardHalfFragment";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment
    public final boolean uH() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment
    public final Integer VR() {
        PaymentInfo paymentInfo;
        PaymentMethod paymentMethod;
        EnterParams enterParams;
        EnterParams enterParams2 = this.LLJILJIL;
        if (enterParams2 != null && enterParams2.LJJIIJZLJL) {
            return Integer.valueOf((int) C958103op.LIZ());
        }
        PaymentMethod paymentMethod2 = this.LLJIJIL;
        if (paymentMethod2 != null && paymentMethod2.LJJJLZIJ()) {
            return Integer.valueOf((int) C958103op.LIZ());
        }
        String str = null;
        if (C03WK.LIZ(this.LLJILJIL) && (enterParams = this.LLJILJIL) != null && enterParams.LJJIII != null) {
            if (enterParams != null) {
                return enterParams.LJJIII;
            }
            return null;
        }
        EnterParams enterParams3 = this.LLJILJIL;
        if (enterParams3 != null && (paymentInfo = enterParams3.paymentInfo) != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
            str = paymentMethod.id;
        }
        return EcomMergeBalanceAndInstallmentSettings.LIZ(str) ? Integer.valueOf((int) C958103op.LIZ()) : Integer.valueOf(C10493048l.LIZ() - C10493048l.LIZIZ(getActivity()));
    }

    public final void cS() {
        Function0<Unit> function0 = this.LLJJI;
        if (function0 != null) {
            function0.invoke();
        }
        dismissAllowingStateLoss();
        C03SY.LIZ.getClass();
        C03SY.LJJ("");
    }

    public final TuxNavBar dS() {
        return (TuxNavBar) this.LLJJJJLIIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, androidx.fragment.app.DialogFragment
    public final int getTheme() {
        EnterParams enterParams = this.LLJILJIL;
        if (enterParams == null || !enterParams.LJJIIJZLJL) {
            this.LL = true;
            return R.style.aad;
        }
        this.LL = false;
        return R.style.aae;
    }

    public final void iS() {
        if (!((GuaranteeConfig) C897103ez.LIZIZ.getValue()).ccdcPopup) {
            dismissAllowingStateLoss();
            return;
        }
        Context context = getContext();
        if (context == null) {
            return;
        }
        TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(context, R.raw.icon_shield_tick);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.o9, context);
        if (numLIZJ != null) {
            tuxIconDrawable.LJFF(numLIZJ.intValue());
        }
        tuxIconDrawable.setBounds(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(43)));
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJIIIZ = new C340190DVh(0, context, tuxIconDrawable);
        c1397580mTM.LJFF(2131832656);
        c1397580mTM.LIZ(2131832654);
        C985403tE.LIZ(c1397580mTM, new AwS612S0100000_33(this, 48));
        c1397580mTM.LIZLLL(AFwS228S0000000_1.get$arr$(200));
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
        C890103dr.LIZ.getClass();
        C890103dr.LJIILJJIL();
    }

    public final void gS() {
        String string;
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        AddCCICardFragment addCCICardFragment = new AddCCICardFragment();
        addCCICardFragment.LLJ = this.LLJIJIL;
        addCCICardFragment.LLJI = this.LLJILJIL;
        addCCICardFragment.LLJILJILJ = new AwS545S0100000_1(this, 1057);
        addCCICardFragment.LLJIJIL = C865503Zt.LIZ(this.LLJILJILJ);
        addCCICardFragment.LLJILJIL = EnumC872903b5.ADD_CCI;
        addCCICardFragment.LLJJ = new AwS580S0100000_1(this, 142);
        c19ehLJIIJ.LJIJ(R.id.dkr, addCCICardFragment, null);
        c19ehLJIIJ.LJIIIZ();
        EnterParams enterParams = this.LLJILJIL;
        boolean z = enterParams != null && enterParams.LJ;
        PaymentMethod paymentMethod = this.LLJIJIL;
        if (paymentMethod == null || (string = paymentMethod.newPaymentMethodTitle) == null) {
            string = getString(2131832907);
        }
        if (!z) {
            hS(string, null);
            return;
        }
        C0OM1 c0om1 = new C0OM1();
        c0om1.LIZLLL = true;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZIZ = "BACK_ACTION_TAG";
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS545S0100000_1(this, 1622));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = string;
        c0om1.LIZJ = c1250250idj;
        TuxNavBar tuxNavBarDS = dS();
        if (tuxNavBarDS != null) {
            tuxNavBarDS.setNavActions(c0om1);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C890103dr.LIZ.getClass();
        C890103dr.LIZJ.clear();
        ((LinkedHashMap) C890103dr.LJ).clear();
        C914303hl.LIZ.getClass();
        C914303hl.LIZJ(this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("EC_CLOSE_PREVIOUS_PAGE", this);
        this.LLJI = null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        EnterParams enterParams = this.LLJILJIL;
        if (enterParams != null) {
            str = enterParams.LIZLLL;
        } else {
            str = null;
        }
        BtmSDK.INSTANCE.registerBtmPageOnCreate(this, "a2270.b8168", str);
    }

    public final void hS(String str, Function0<Unit> function0) {
        C0OM1 c0om1 = new C0OM1();
        c0om1.LIZLLL = true;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZIZ = "BACK_ACTION_TAG";
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LJI = true;
        c1251150ifB.LIZJ(new AwS402S0200000_1((Function0) function0, (Function0<Unit>) this, (CreditCardInstallmentFragment) 14));
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c0om1.LJ(c1251150ifB);
        C890103dr.LIZ.getClass();
        C890103dr.LJI("back", null);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = str;
        c0om1.LIZJ = c1250250idj;
        TuxNavBar tuxNavBarDS = dS();
        if (tuxNavBarDS != null) {
            tuxNavBarDS.setNavActions(c0om1);
        }
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        if (Intrinsics.LJFF(str, "EC_CLOSE_PREVIOUS_PAGE")) {
            cS();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        EnumC872903b5 enumC872903b5;
        String str;
        String str2;
        String string;
        String str3;
        CciCashierDisplayType cciCashierDisplayType;
        PaymentMethodsData paymentMethodsData;
        EnumC837803Pc enumC837803Pc;
        super.onViewCreated(view, bundle);
        EnumC865103Zp enumC865103Zp = this.LLJILJILJ;
        if (enumC865103Zp != null) {
            int i = C865003Zo.LIZ[enumC865103Zp.ordinal()];
            AwS545S0100000_1 awS545S0100000_1 = null;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            gS();
                            return;
                        }
                        return;
                    }
                    FragmentManager childFragmentManager = getChildFragmentManager();
                    EnterParams enterParams = this.LLJILJIL;
                    if (enterParams != null && (enumC837803Pc = enterParams.LJJIJIIJI) != null && C865003Zo.LIZIZ[enumC837803Pc.ordinal()] == 1) {
                        enumC872903b5 = EnumC872903b5.INSTALLMENT_PLAN_SELECTION;
                    } else {
                        enumC872903b5 = EnumC872903b5.CC_INSTALLMENT_PLAN;
                    }
                    C19EH c19ehLJIIJ = childFragmentManager.LJIIJ();
                    BankInstallmentFragment bankInstallmentFragment = new BankInstallmentFragment();
                    bankInstallmentFragment.LLILZIL = this.LLJIJIL;
                    bankInstallmentFragment.LLILZLL = this.LLJILJIL;
                    bankInstallmentFragment.LLIZ = this.LLJILJILJ;
                    bankInstallmentFragment.LLIZLLLIL = enumC872903b5;
                    bankInstallmentFragment.LLJILLL = this.LLJILLL;
                    bankInstallmentFragment.LLJ = this.LLJJI;
                    bankInstallmentFragment.LLJI = new InterfaceC871003am() { // from class: X.03bE
                        @Override // X.InterfaceC871003am
                        public final void LIZ(C873003b6 c873003b6) {
                        }

                        @Override // X.InterfaceC871003am
                        public final void LIZIZ(InstallmentPlan installmentPlan) {
                            InterfaceC871003am interfaceC871003am = this.LIZ.LLJJJ;
                            if (interfaceC871003am != null) {
                                interfaceC871003am.LIZIZ(installmentPlan);
                            }
                            this.LIZ.cS();
                        }
                    };
                    bankInstallmentFragment.LLJILJILJ = this.LLJJIJI;
                    bankInstallmentFragment.LLJIJIL = this.LLJJIII;
                    bankInstallmentFragment.LLJILJIL = this.LLJJIJIL;
                    bankInstallmentFragment.LLJJ = this.LLJJJIL;
                    bankInstallmentFragment.LLJJI = this.LLJJJJ;
                    c19ehLJIIJ.LJIJ(R.id.dkr, bankInstallmentFragment, null);
                    c19ehLJIIJ.LJIIIZ();
                    PaymentMethod paymentMethod = this.LLJIJIL;
                    if (paymentMethod != null && paymentMethod.LJJJJLI()) {
                        hS(getString(2131833037), new AwS545S0100000_1(this, 1623));
                        return;
                    }
                    C890103dr c890103dr = C890103dr.LIZ;
                    EnterParams enterParams2 = this.LLJILJIL;
                    String strLIZ = C865503Zt.LIZ(this.LLJILJILJ);
                    String strLIZ2 = C873403bA.LIZ(enumC872903b5);
                    PaymentMethod paymentMethod2 = this.LLJIJIL;
                    if (paymentMethod2 != null) {
                        str = paymentMethod2.id;
                    } else {
                        str = null;
                    }
                    c890103dr.getClass();
                    C890103dr.LIZLLL(enterParams2, strLIZ, strLIZ2, str);
                    PaymentMethod paymentMethod3 = this.LLJIJIL;
                    if (paymentMethod3 != null) {
                        str2 = paymentMethod3.id;
                    } else {
                        str2 = null;
                    }
                    if (EcomMergeBalanceAndInstallmentSettings.LIZ(str2)) {
                        string = getString(2131840234);
                    } else {
                        string = getString(2131832923);
                    }
                    PaymentMethod paymentMethod4 = this.LLJIJIL;
                    if (paymentMethod4 != null) {
                        str3 = paymentMethod4.id;
                    } else {
                        str3 = null;
                    }
                    C03SY c03sy = C03SY.LIZ;
                    EnterParams enterParams3 = this.LLJILJIL;
                    if (enterParams3 != null && (paymentMethodsData = enterParams3.paymentData) != null) {
                        cciCashierDisplayType = paymentMethodsData.cciCashierDisplayType;
                    } else {
                        cciCashierDisplayType = null;
                    }
                    c03sy.getClass();
                    if (C03SY.LIZLLL(cciCashierDisplayType, str3)) {
                        awS545S0100000_1 = new AwS545S0100000_1(this, 1624);
                    }
                    hS(string, awS545S0100000_1);
                    return;
                }
                gS();
                return;
            }
            C19EH c19ehLJIIJ2 = getChildFragmentManager().LJIIJ();
            BankInstallmentFragment bankInstallmentFragment2 = new BankInstallmentFragment();
            bankInstallmentFragment2.LLILZIL = this.LLJIJIL;
            bankInstallmentFragment2.LLILZLL = this.LLJILJIL;
            bankInstallmentFragment2.LLIZ = this.LLJILJILJ;
            bankInstallmentFragment2.LLIZLLLIL = EnumC872903b5.CC_INSTALLMENT_PLAN;
            bankInstallmentFragment2.LLJ = this.LLJJI;
            bankInstallmentFragment2.LLJILLL = this.LLJILLL;
            bankInstallmentFragment2.LLJI = new InterfaceC871003am() { // from class: X.03eZ
                @Override // X.InterfaceC871003am
                public final void LIZIZ(InstallmentPlan installmentPlan) {
                }

                @Override // X.InterfaceC871003am
                public final void LIZ(C873003b6 c873003b6) {
                    PaymentMethod paymentMethod5;
                    String str4;
                    CreditCardInstallmentFragment creditCardInstallmentFragment = this.LIZ;
                    C19EH c19ehLJIIJ3 = creditCardInstallmentFragment.getChildFragmentManager().LJIIJ();
                    AddCCICardFragment addCCICardFragment = new AddCCICardFragment();
                    String str5 = null;
                    if (c873003b6 != null) {
                        paymentMethod5 = c873003b6.LJFF;
                    } else {
                        paymentMethod5 = null;
                    }
                    addCCICardFragment.LLJ = paymentMethod5;
                    addCCICardFragment.LLJI = creditCardInstallmentFragment.LLJILJIL;
                    addCCICardFragment.LLJILJILJ = new AwS545S0100000_1(creditCardInstallmentFragment, 1626);
                    addCCICardFragment.LLJIJIL = "ADD_NEW_CCI_SEA";
                    addCCICardFragment.LLJILJIL = EnumC872903b5.ADD_CCI;
                    addCCICardFragment.LLJILLL = c873003b6;
                    c19ehLJIIJ3.LJIJ(R.id.dkr, addCCICardFragment, null);
                    c19ehLJIIJ3.LJII("BACK_STACK_TAG");
                    c19ehLJIIJ3.LJIIIZ();
                    try {
                        C19EG activity = creditCardInstallmentFragment.getActivity();
                        if (activity != null) {
                            activity.runOnUiThread(new ARunnableS101S0100000_1(creditCardInstallmentFragment, 53));
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1AF0.LJ(e);
                    }
                    C03SY c03sy2 = C03SY.LIZ;
                    if (c873003b6 != null) {
                        str4 = c873003b6.LIZJ;
                    } else {
                        str4 = null;
                    }
                    c03sy2.getClass();
                    C03SY.LJJ(str4);
                    C890103dr c890103dr2 = C890103dr.LIZ;
                    EnterParams enterParams4 = creditCardInstallmentFragment.LLJILJIL;
                    String strLIZ3 = C865503Zt.LIZ(creditCardInstallmentFragment.LLJILJILJ);
                    String strLIZ4 = C873403bA.LIZ(creditCardInstallmentFragment.LLJJ);
                    PaymentMethod paymentMethod6 = creditCardInstallmentFragment.LLJIJIL;
                    if (paymentMethod6 != null) {
                        str5 = paymentMethod6.id;
                    }
                    c890103dr2.getClass();
                    C890103dr.LIZLLL(enterParams4, strLIZ3, strLIZ4, str5);
                }
            };
            bankInstallmentFragment2.LLJIJIL = this.LLJJIII;
            bankInstallmentFragment2.LLJILJILJ = this.LLJJIJI;
            c19ehLJIIJ2.LJIJ(R.id.dkr, bankInstallmentFragment2, null);
            c19ehLJIIJ2.LJIIIZ();
            hS(getString(2131833036), null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.aol, viewGroup, false);
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
