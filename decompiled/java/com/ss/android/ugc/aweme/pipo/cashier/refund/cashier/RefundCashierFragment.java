package com.ss.android.ugc.aweme.pipo.cashier.refund.cashier;

import X.C098200Yq;
import X.C1250250idj;
import X.C1685300txQ;
import X.C1707980uY0;
import X.C1708610uZ1;
import X.C1709110uZp;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C723850SaN;
import X.C786410Ut5;
import X.EnumC1709120uZq;
import X.InterfaceC1709310ua9;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class RefundCashierFragment extends PipoCashierBaseFragment {
    public static final HashMap<String, Boolean> LLJJJIL = new HashMap<>();
    public static final HashMap<String, Boolean> LLJJJJ = new HashMap<>();
    public static final HashMap<String, Boolean> LLJJJJJIL = new HashMap<>();
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUlOSB9KyQ/ISY2OmHELIOSs+LCkmJiFiKi4gICwpO2EBLSM5JysQKTYkICohDjctLiI2JjE=";
    public C1709110uZp LLJJJ;

    @Override // com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment
    public final void cS() {
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment
    public final C1250250idj aS() {
        C1250250idj c1250250idj = new C1250250idj();
        C1709110uZp c1709110uZp = this.LLJJJ;
        c1250250idj.LIZJ = getString(Intrinsics.LJFF(c1709110uZp != null ? c1709110uZp.LJIIL : null, "V2") ? 2131840091 : 2131857128);
        return c1250250idj;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        C1709110uZp c1709110uZp = this.LLJJJ;
        if (c1709110uZp != null && (str = c1709110uZp.LJIIJ) != null) {
            Boolean bool = LLJJJJ.get(str);
            Boolean bool2 = Boolean.FALSE;
            if (Intrinsics.LJFF(bool, bool2) || Intrinsics.LJFF(LLJJJJJIL.get(str), bool2)) {
                EnumC1709120uZq enumC1709120uZq = EnumC1709120uZq.REFUND_RESULT_SERVER_ERROR_DEFAULT;
                C1707980uY0.LIZ(1, str, Integer.valueOf(enumC1709120uZq.getErrorCode()), enumC1709120uZq.getErrorMessage());
            } else {
                C1707980uY0.LIZ(2, str, null, null);
            }
        }
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment
    public final void dS(long j, String str) {
        String str2;
        String str3;
        String str4;
        C1709110uZp c1709110uZp = this.LLJJJ;
        String str5 = null;
        if (c1709110uZp != null) {
            str2 = c1709110uZp.LJIIJ;
        } else {
            str2 = null;
        }
        InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ = C1708610uZ1.LIZIZ(str2);
        HashMap<String, Boolean> map = LLJJJIL;
        C1709110uZp c1709110uZp2 = this.LLJJJ;
        if (c1709110uZp2 != null) {
            str5 = c1709110uZp2.LJIIJ;
        }
        boolean zLJFF = Intrinsics.LJFF(map.get(str5), Boolean.TRUE);
        HashMap map2 = new HashMap();
        C1709110uZp c1709110uZp3 = this.LLJJJ;
        String str6 = "";
        if (c1709110uZp3 == null || (str3 = c1709110uZp3.LJFF) == null) {
            str3 = "";
        }
        map2.put("total_payment", str3);
        C1709110uZp c1709110uZp4 = this.LLJJJ;
        if (c1709110uZp4 != null && (str4 = c1709110uZp4.LJI) != null) {
            str6 = str4;
        }
        map2.put("currency", str6);
        interfaceC1709310ua9LIZIZ.LJII(j, "select_refund_method", str, map2, zLJFF);
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS597S0100000_18(this, 217), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dw1, viewGroup, false);
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
