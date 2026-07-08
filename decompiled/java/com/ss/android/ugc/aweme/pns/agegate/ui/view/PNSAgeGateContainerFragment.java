package com.ss.android.ugc.aweme.pns.agegate.ui.view;

import X.C01GW;
import X.C098200Yq;
import X.C0NRA;
import X.C10UK;
import X.C10WS;
import X.C10WT;
import X.C128Y;
import X.C1685300txQ;
import X.C1845210y7L;
import X.C1848530yCh;
import X.C189200o6;
import X.C19257310Vn;
import X.C19257910Vt;
import X.C19331910k9;
import X.C19332010kA;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C23250099c;
import X.C452501pT;
import X.C752720Tfq;
import X.C786410Ut5;
import X.EnumC1848020yBs;
import X.EnumC19257610Vq;
import X.EnumC452301pR;
import X.InterfaceC19257010Vk;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxet.ITracingService;
import com.ss.android.ugc.aweme.pns.agegate.viewmodels.PNSAgeGateContainerCleanViewModel;
import com.ss.android.ugc.aweme.pns.agegate.viewmodels.PNSBaseAgeGateViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class PNSAgeGateContainerFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUiOmEyLyArKDs2HELIOSZjAlZzk6LTJiGQEACSIpDi4nLQYjJzsyISspOwkhKSIhLCEn";
    public final C01GW LL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 496));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 495));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 497));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 499));
    public final C01GW LLILZIL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS572S0100000_28(this, 492));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 493));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 498));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 491));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 494));

    public final boolean NR() {
        return ((Boolean) this.LLILLJJLI.getValue()).booleanValue();
    }

    public final C19257310Vn OR() {
        return (C19257310Vn) this.LL.getValue();
    }

    public final PNSBaseAgeGateViewModel PR() {
        return (PNSBaseAgeGateViewModel) this.LLILZ.getValue();
    }

    public final C10WS MR() {
        C128Y c128yLJJJJZI = getChildFragmentManager().LJJJJZI("age_gate_fragment_tag");
        if (c128yLJJJJZI instanceof C10WS) {
            return (C10WS) c128yLJJJJZI;
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C19EG activity;
        Object objLIZ;
        Fragment fragment;
        Bundle bundleData;
        Bundle arguments;
        super.onViewCreated(view, bundle);
        Object value = this.LLILLL.getValue();
        Map<EnumC19257610Vq, InterfaceC19257010Vk> map = C19257910Vt.LIZ;
        InterfaceC19257010Vk interfaceC19257010Vk = (InterfaceC19257010Vk) ((LinkedHashMap) map).get(value);
        if (interfaceC19257010Vk != null && (bundleData = interfaceC19257010Vk.data()) != null && (arguments = getArguments()) != null) {
            C786410Ut5.LJJIIJZLJL(arguments, bundleData);
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            C786410Ut5.LJJIZ(arguments2, "age_gate_params", OR());
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            arguments3.putBoolean("is_container_fragment", true);
        }
        if (bundle == null && MR() == null) {
            InterfaceC19257010Vk interfaceC19257010Vk2 = (InterfaceC19257010Vk) ((LinkedHashMap) map).get(this.LLILLL.getValue());
            if (interfaceC19257010Vk2 != null && (objLIZ = interfaceC19257010Vk2.LIZ()) != null) {
                if ((objLIZ instanceof Fragment) && (fragment = (Fragment) objLIZ) != null) {
                    fragment.setArguments(getArguments());
                }
                C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
                c19ehLJIIJ.LJIJ(R.id.iiv, (Fragment) objLIZ, "age_gate_fragment_tag");
                c19ehLJIIJ.LJIIJJI();
            } else {
                C19EG activity2 = getActivity();
                if (activity2 != null) {
                    activity2.finish();
                }
            }
        }
        if (this.LLIZLLLIL.getValue() == null && (activity = getActivity()) != null) {
            activity.finish();
        }
        PR().zQ2((C10UK) this.LLIZLLLIL.getValue(), (C10WT) this.LLIZ.getValue(), SystemClock.elapsedRealtime(), OR());
        ((PNSAgeGateContainerCleanViewModel) this.LLILZIL.getValue()).LL.add(OR().getScene());
        C0NRA.LIZ("pns_age_gate_show", new LinkedHashMap(), OR().getLogParams());
        requireActivity().getOnBackPressedDispatcher().LIZ(requireActivity(), new C19331910k9(this, 1));
        if (NR()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C752720Tfq(this, null), 3);
        }
        getChildFragmentManager().LJZL(new C19332010kA(this, 1), false);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.mg, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            C1848530yCh.LIZJ(viewTd, "page_btm_b0812", EnumC1848020yBs.PAGE, null);
            ITracingService iTracingServiceLIZ = C1845210y7L.LIZ();
            if (iTracingServiceLIZ != null) {
                iTracingServiceLIZ.LJIIIZ(viewTd, "normal_btm");
            }
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
