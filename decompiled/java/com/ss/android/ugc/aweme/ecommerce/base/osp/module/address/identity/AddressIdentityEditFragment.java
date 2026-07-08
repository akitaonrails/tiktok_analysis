package com.ss.android.ugc.aweme.ecommerce.base.osp.module.address.identity;

import X.C034S;
import X.C049Z;
import X.C098200Yq;
import X.C10508049a;
import X.C1120604Zw;
import X.C1685300txQ;
import X.C1741890vQh;
import X.C1748720vbi;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1AQS;
import X.C2187451AjH;
import X.C2252611DEt;
import X.C259800zU;
import X.C616540OGe;
import X.C723850SaN;
import X.C786410Ut5;
import X.InterfaceC911603hK;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoPanel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS20S1400000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressIdentityEditFragment extends ECBaseFragment {
    public static C2252611DEt LLIZ = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZyAgOGshJismHELIOSJCBiKCs3OiA/OmE6LCAiPSYnMWsNLSshLTY/ACs2JjElPTYWLCw4Dz0yLygpJzs=";
    public long LLILLL = SystemClock.elapsedRealtime();
    public String LLILZ = "add";
    public String LLILZIL;
    public Map<String, ? extends Object> LLILZLL;

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(AddressIdentityEditFragment.class.getName());
        }
        super.onResume();
        this.LLILLL = SystemClock.elapsedRealtime();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        IECommerceHostService iECommerceHostService;
        super.onStop();
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = "return";
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
        if (rootPageMonitor != null && rootPageMonitor.LJFF()) {
            c259800zU.element = "close";
        }
        C1748720vbi.LIZIZ(this, new C10508049a(), new AwS367S0200000_1(c259800zU, (C259800zU<String>) this, (AddressIdentityEditFragment) 52));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        IdentityInfoPanel identityInfoPanel;
        String string;
        String string2;
        String string3;
        Boolean boolValueOf;
        HashMap<String, Object> mapLJIIJ;
        String string4;
        String string5;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (identityInfoPanel = (IdentityInfoPanel) arguments.getParcelable("rfc_curp_panel_data")) != null) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                string = arguments2.getString("rfc_curp_panel_invalid_hint");
            } else {
                string = null;
            }
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                string2 = arguments3.getString("rfc_curp_panel_fill_type");
            } else {
                string2 = null;
            }
            this.LLILZ = string2;
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                string3 = arguments4.getString("trigger_event");
            } else {
                string3 = null;
            }
            this.LLILZIL = string3;
            Bundle arguments5 = getArguments();
            if (arguments5 != null && (string5 = arguments5.getString("has_address")) != null) {
                boolValueOf = Boolean.valueOf(Boolean.parseBoolean(string5));
            } else {
                boolValueOf = null;
            }
            Bundle arguments6 = getArguments();
            if (arguments6 != null && (string4 = arguments6.getString("trackParams")) != null) {
                mapLJIIJ = C1741890vQh.LJIIJ(string4);
            } else {
                mapLJIIJ = null;
            }
            this.LLILZLL = mapLJIIJ;
            C723850SaN.LIZ(this, false, null, new AwS20S1400000_1(this, identityInfoPanel, string, boolValueOf, view, 2), 3);
            C1748720vbi.LIZIZ(this, new C049Z(), new AwS580S0100000_1(this, 95));
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.aoh, viewGroup, false);
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
