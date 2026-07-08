package com.ss.android.ugc.aweme.pipo.cashier.cashier.subcashier;

import X.C019F;
import X.C01D1;
import X.C098200Yq;
import X.C123100dR;
import X.C1250250idj;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1708610uZ1;
import X.C1709040uZi;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC1709020uZg;
import X.InterfaceC1709310ua9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PODaInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PODisplayInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class SubCashierFragment extends PipoCashierBaseFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUlOSB9KyQ/ISY2OmHELIOSsvKDw7ISA+ZzwmKiYtOic6LTdiGjoxCyQ/ISY2OgM+KCg+LSs4";
    public SubCashierEnterParams LLJJJ;
    public Function1<? super String, Unit> LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubCashierFragment.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/pipo/cashier/cashier/subcashier/SubCashierViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SubCashierFragment() {
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubCashierViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 750);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(429);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 1092), aFwS268S0000000_26, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            return;
        }
        if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new AwS570S0100000_26((Fragment) this, 1093), aFwS268S0000000_26, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 1094), aFwS268S0000000_26, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment
    public final C1250250idj aS() {
        PaymentOption paymentOption;
        PODisplayInfo pODisplayInfo;
        C1250250idj c1250250idj = new C1250250idj();
        SubCashierEnterParams subCashierEnterParams = this.LLJJJ;
        String string = null;
        if (subCashierEnterParams != null && (paymentOption = subCashierEnterParams.parentPaymentOption) != null && (pODisplayInfo = paymentOption.displayInfo) != null) {
            string = pODisplayInfo.name;
        }
        if (!C123100dR.LIZ(string) || string == null) {
            string = getString(2131857121);
        }
        c1250250idj.LIZJ = string;
        return c1250250idj;
    }

    public final String getPageName() {
        PaymentOption paymentOption;
        PODaInfo pODaInfo;
        SubCashierEnterParams subCashierEnterParams = this.LLJJJ;
        String str = null;
        if (subCashierEnterParams != null && (paymentOption = subCashierEnterParams.parentPaymentOption) != null && (pODaInfo = paymentOption.trackInfo) != null) {
            str = pODaInfo.optionName;
        }
        return (!C123100dR.LIZ(str) || str == null) ? "" : str;
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment
    public final void cS() {
        EnumC1709020uZg enumC1709020uZg;
        String pageName = getPageName();
        SubCashierEnterParams subCashierEnterParams = this.LLJJJ;
        InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ = C1708610uZ1.LIZIZ(subCashierEnterParams != null ? subCashierEnterParams.payRequestId : null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SubCashierEnterParams subCashierEnterParams2 = this.LLJJJ;
        linkedHashMap.put("enter_from", (subCashierEnterParams2 == null || (enumC1709020uZg = subCashierEnterParams2.LIZJ) == null) ? "" : C1709040uZi.LIZ(enumC1709020uZg));
        interfaceC1709310ua9LIZIZ.LIZIZ(pageName, linkedHashMap);
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment
    public final void dS(long j, String str) {
        String str2;
        String strLIZ;
        EnumC1709020uZg enumC1709020uZg;
        SubCashierEnterParams subCashierEnterParams = this.LLJJJ;
        if (subCashierEnterParams != null) {
            str2 = subCashierEnterParams.payRequestId;
        } else {
            str2 = null;
        }
        InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ = C1708610uZ1.LIZIZ(str2);
        String pageName = getPageName();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SubCashierEnterParams subCashierEnterParams2 = this.LLJJJ;
        if (subCashierEnterParams2 != null && (enumC1709020uZg = subCashierEnterParams2.LIZJ) != null) {
            strLIZ = C1709040uZi.LIZ(enumC1709020uZg);
        } else {
            strLIZ = "";
        }
        linkedHashMap.put("enter_from", strLIZ);
        interfaceC1709310ua9LIZIZ.LJII(j, pageName, str, linkedHashMap, true);
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS597S0100000_18(this, 215), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dvx, viewGroup, false);
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
