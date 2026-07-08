package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.subpage;

import X.C034S;
import X.C042R;
import X.C098200Yq;
import X.C0OM1;
import X.C1018703yb;
import X.C1054104Ah;
import X.C1120604Zw;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13LP;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1AQS;
import X.C740060T1g;
import X.C786410Ut5;
import X.InterfaceC344240DeY;
import X.InterfaceC911603hK;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SeaPaymentInstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SeaPaymentPanelInfo;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS86S1200000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpPaymentPanelFragment extends ECBaseFragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZz83HELIOSOGs/LC59OzAuOS40LWsfLC4DLDUcKDY+LSs4GS49LSkKOy40JSAiPQ==";
    public final SeaPaymentPanelInfo LLILLL;
    public final String LLILZ;
    public final Map<String, Object> LLILZIL;
    public LinearLayout LLILZLL;

    static {
        new C042R();
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        String str = this.LLILLL.title;
        if (str == null) {
            str = "";
        }
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = str;
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS545S0100000_1(this, 1358));
        c0om1.LIZIZ(c1251150ifB);
        c0om1.LIZLLL = false;
        return c0om1;
    }

    public final Map<String, Object> VR() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<SeaPaymentInstallmentPlan> list = this.LLILLL.installmentPlans;
        if (list != null) {
            linkedHashMap.put("installment_plan_cnt", Integer.valueOf(list.size()));
            linkedHashMap.put("total_installment_cnt", C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS228S0000000_1.get$arr$(328), 31));
            linkedHashMap.put("amount_per_installment", C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS228S0000000_1.get$arr$(329), 31));
            linkedHashMap.put("is_free_interest", C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS228S0000000_1.get$arr$(330), 31));
            linkedHashMap.put("free_interest_installment_cnt", C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS228S0000000_1.get$arr$(331), 31));
            linkedHashMap.put("original_interest", C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS228S0000000_1.get$arr$(332), 31));
            linkedHashMap.put("original_total_interest", C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS228S0000000_1.get$arr$(333), 31));
            linkedHashMap.put("sales_interest", C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS228S0000000_1.get$arr$(334), 31));
            linkedHashMap.put("sales_total_interest", C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS228S0000000_1.get$arr$(335), 31));
            linkedHashMap.put("total_installment_amount", C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS228S0000000_1.get$arr$(336), 31));
        }
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748820vbs
    public final String getPageName() {
        String str = this.LLILZ;
        return (str == null || str.length() == 0) ? "cc_installment_info" : this.LLILZ;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        IECommerceHostService iECommerceHostService;
        ConcurrentHashMap<String, Object> concurrentHashMap;
        super.onStop();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
        String str = (rootPageMonitor == null || !rootPageMonitor.LJFF()) ? "return" : "close";
        C1054104Ah c1054104AhLIZ = C740060T1g.LIZ(getContext());
        if (c1054104AhLIZ == null || (concurrentHashMap = c1054104AhLIZ.LIZIZ) == null) {
            return;
        }
        C1018703yb.LIZLLL("tiktokec_stay_page", new AwS86S1200000_1((Map) concurrentHashMap, (Map<String, ? extends Object>) this, (SeaPdpPaymentPanelFragment) str, (String) 35));
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x0171  */
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instruction units count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.subpage.SeaPdpPaymentPanelFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public SeaPdpPaymentPanelFragment(SeaPaymentPanelInfo seaPaymentPanelInfo, String str, Map<String, ? extends Object> map) {
        this.LLILLL = seaPaymentPanelInfo;
        this.LLILZ = str;
        this.LLILZIL = map;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        C19GS c19gs = null;
        if (getContext() != null) {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.awq, viewGroup, false);
        } else {
            viewTd = null;
        }
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
