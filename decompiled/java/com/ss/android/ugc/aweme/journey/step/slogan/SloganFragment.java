package com.ss.android.ugc.aweme.journey.step.slogan;

import X.C01GW;
import X.C07MK;
import X.C098200Yq;
import X.C0CR3;
import X.C0NEY;
import X.C10H5;
import X.C10NW;
import X.C10SV;
import X.C1150504el;
import X.C123100dR;
import X.C1514430pVp;
import X.C1568170quV;
import X.C1685300txQ;
import X.C1848530yCh;
import X.C1877480yxO;
import X.C189200o6;
import X.C1911410zq7;
import X.C1912310zrZ;
import X.C1912460zro;
import X.C1912470zrp;
import X.C1912930zsZ;
import X.C1912940zsa;
import X.C1912950zsb;
import X.C1913090zsp;
import X.C19EG;
import X.C19GS;
import X.C1E95;
import X.C2187451AjH;
import X.C2211631BhB;
import X.C2214201BlK;
import X.C2344009Gk;
import X.C452501pT;
import X.C616540OGe;
import X.C786410Ut5;
import X.C807840VmY;
import X.EnumC452301pR;
import X.InterfaceC1740760vOs;
import X.InterfaceC1912440zrm;
import Y.ARunnableS128S0100000_28;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.NewUserJourneyContainerActivity;
import com.ss.android.ugc.aweme.app.services.IHybridABInfoService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.NewUserJourneyActivity;
import com.ss.android.ugc.aweme.journey.com.ss.android.ugc.aweme.NewUserJourneyFragment;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public abstract class SloganFragment extends NUJComponentFragment implements InterfaceC1740760vOs {
    public static Integer LLJILJILJ = 0;
    public final BPEAHandler LLJI = new BPEAHandler(Looper.getMainLooper());
    public long LLJIJIL = SystemClock.elapsedRealtime();
    public final C01GW LLJILJIL = C452501pT.LIZ(EnumC452301pR.NONE, AFwS217S0000000_28.get$arr$(245));

    public void VR() {
    }

    public abstract View WR(LayoutInflater layoutInflater, ViewGroup viewGroup);

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b87967";
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    public static void aS() {
        C1911410zq7.LIZ("NewUserLaunchActivity", "ControlSloganFragment onViewCreated");
        C1150504el.LIZ().LJI("interest_slogan_fragment_viewcreated", false);
        C1150504el.LIZ().LIZLLL("interest_slogan_viewcreated_to_interest_fragment_create", false);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        C1911410zq7.LIZ("SloganFragment", "onStop called");
        super.onStop();
        if (C2214201BlK.LJIIJJI && !((IMandatoryLoginService) ServiceManager.get().getService(IMandatoryLoginService.class)).shouldShowForcedLogin(false)) {
            ZR(Boolean.TRUE);
        }
        C1911410zq7.LIZ("SloganFragment", "onStop ...");
    }

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(getClass().getName());
        }
        super.onResume();
        this.LLJIJIL = SystemClock.elapsedRealtime();
        C2211631BhB.LJIIL(this, getActivity());
        C1911410zq7.LIZ("SloganFragment", "onResume");
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    public final void ZR(Boolean bool) {
        String str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("user_type", (String) this.LLJILJIL.getValue());
        c2344009Gk.LIZJ(Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0, "is_background");
        c2344009Gk.LIZLLL(SystemClock.elapsedRealtime() - this.LLJIJIL, "duration");
        c2344009Gk.LJIIIIZZ("ui_type", RR());
        if (C1E95.LIZIZ.LJIJI()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("if_send_fake_feed", str);
        Integer numLIZIZ = ((IHybridABInfoService) ServiceManager.get().getService(IHybridABInfoService.class)).LIZIZ();
        if (numLIZIZ != null) {
            c2344009Gk.LIZJ(numLIZIZ.intValue(), "is_ab_backend_resp_received");
        }
        C0CR3.LIZ.getClass();
        c2344009Gk.LIZJ(C0CR3.LJIIIZ ? 1 : 0, "is_hybrid_ab_api_rev");
        C10SV.LIZ(c2344009Gk);
        C10H5 c10h5 = C10H5.EXIT_SLOGAN_PAGE;
        Map<String, String> map = c2344009Gk.LIZ;
        C807840VmY.LIZ(map);
        C10SV.LIZIZ(c10h5, map);
    }

    public final void bS(boolean z) {
        IMainService iMainService;
        C19EG activity = getActivity();
        if (activity == null) {
            return;
        }
        if (!(activity instanceof NewUserJourneyActivity) && !(activity instanceof NewUserJourneyContainerActivity) && (iMainService = (IMainService) PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null)) != null && iMainService.isNUJSingleActivityExpHit(activity)) {
            return;
        }
        if (z && C1912310zrZ.LIZ()) {
            C1911410zq7.LIZ("NewUserLaunchActivity", "delay preStartMainActivity1 by exp");
            C1912460zro.LIZ.getClass();
            C1912460zro.LIZIZ = true;
            return;
        }
        C1911410zq7.LIZ("NewUserLaunchActivity", "preStartMainActivity1");
        C07MK.LIZ.getClass();
        if (!C07MK.LIZ() && Build.VERSION.SDK_INT > 28) {
            C0NEY.LIZ(0, "is_preload_main");
        } else {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS128S0100000_28(this, 40));
        }
    }

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C1912950zsb c1912950zsb;
        int iIntValue;
        InterfaceC1912440zrm interfaceC1912440zrm;
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        C10NW c10nw = C10NW.JOURNEY_SLOGAN_ID;
        c1912930zsZ.getClass();
        C1912940zsa c1912940zsaLIZ = C1912930zsZ.LIZ(c10nw);
        C1912950zsb c1912950zsb2 = null;
        if (c1912940zsaLIZ != null) {
            c1912950zsb = c1912940zsaLIZ.LIZLLL;
        } else {
            c1912950zsb = null;
        }
        C1912930zsZ.LIZJ(c1912950zsb);
        super.onCreate(bundle);
        C1911410zq7.LIZ("SloganFragment", "onCreate called");
        this.LLJIJIL = SystemClock.elapsedRealtime();
        AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(this, 701);
        C1912470zrp c1912470zrpOR = NUJComponentFragment.OR();
        if (c1912470zrpOR != null && (interfaceC1912440zrm = (InterfaceC1912440zrm) c1912470zrpOR.LIZIZ(InterfaceC1912440zrm.class)) != null) {
            interfaceC1912440zrm.Vb0(awS572S0100000_28);
            interfaceC1912440zrm.cH2(SystemClock.elapsedRealtime());
        }
        Integer numLIZIZ = ((IHybridABInfoService) ServiceManager.get().getService(IHybridABInfoService.class)).LIZIZ();
        if (numLIZIZ != null) {
            iIntValue = numLIZIZ.intValue();
        } else {
            iIntValue = 0;
        }
        C10H5 c10h5 = C10H5.SHOW_SLOGAN_PAGE;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("user_type", (String) this.LLJILJIL.getValue());
        c2344009Gk.LIZJ(iIntValue, "is_ab_backend_resp_received");
        C0CR3.LIZ.getClass();
        c2344009Gk.LIZJ(C0CR3.LJIIIZ ? 1 : 0, "is_hybrid_ab_api_rev");
        c2344009Gk.LJIIIIZZ("ui_type", RR());
        C10SV.LIZ(c2344009Gk);
        LLJILJILJ = C123100dR.LIZIZ(c2344009Gk.LJIIIZ("from_start_to_current_duration"));
        Map<String, String> map = c2344009Gk.LIZ;
        C807840VmY.LIZ(map);
        C10SV.LIZIZ(c10h5, map);
        if (getActivity() instanceof NewUserJourneyActivity) {
            ((NewUserJourneyActivity) getActivity()).LLLLZLL(false);
        } else if (getParentFragment() instanceof NewUserJourneyFragment) {
            ((NewUserJourneyFragment) getParentFragment()).kS(false);
        }
        C1877480yxO.LIZ.getClass();
        if (C1514430pVp.LIZLLL().booleanValue()) {
            Set<String> set = C1877480yxO.LIZIZ;
            String str = C1877480yxO.LIZJ;
            if (set.contains(str)) {
                C1877480yxO.LIZ(C1877480yxO.LJFF, "client_local_experiment_exposed_android");
            }
            if (set.contains(str)) {
                C1877480yxO.LIZ(C1877480yxO.LJFF, "client_local_flag_experiment_exposed_android");
            }
            C1877480yxO.LIZIZ("hybrid_ab_experiment_exposed_app_launch_android");
            C1877480yxO.LIZIZ("client_general_experiment_exposed_app_launch_android");
            C1877480yxO.LIZIZ("absdk_experiment_exposed_app_launch_android");
            Iterator<Long> it2 = C1877480yxO.LIZLLL.iterator();
            while (it2.hasNext()) {
                final long jLongValue = it2.next().longValue();
                C786410Ut5.LJLIIL(jLongValue, new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0ylO
                    public final void LIZ() {
                        long j = jLongValue / ((long) 100);
                        C1877480yxO c1877480yxO = C1877480yxO.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("client_local_flag_experiment_exposed_");
                        sbLIZ.append(j);
                        sbLIZ.append("_android");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c1877480yxO.getClass();
                        if (C1877480yxO.LIZIZ.contains(C1877480yxO.LIZJ)) {
                            C1877480yxO.LIZ(C1877480yxO.LJFF, strLIZIZ);
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("hybrid_ab_experiment_exposed_");
                        sbLIZ2.append(j);
                        sbLIZ2.append("_android");
                        C1877480yxO.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("client_general_experiment_exposed_");
                        sbLIZ3.append(j);
                        sbLIZ3.append("_android");
                        C1877480yxO.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("absdk_experiment_exposed_");
                        sbLIZ4.append(j);
                        sbLIZ4.append("_android");
                        C1877480yxO.LIZIZ(C2188811AlT.LIZIZ(sbLIZ4));
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("EmptyExperimentsEventProvider@ff25.fireDelayedEvents$1$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("EmptyExperimentsEventProvider@ff25.fireDelayedEvents$1$1");
                    }
                });
            }
        }
        C1912930zsZ c1912930zsZ2 = C1912930zsZ.LIZ;
        C10NW c10nw2 = C10NW.JOURNEY_SLOGAN_ID;
        c1912930zsZ2.getClass();
        C1912940zsa c1912940zsaLIZ2 = C1912930zsZ.LIZ(c10nw2);
        if (c1912940zsaLIZ2 != null) {
            c1912950zsb2 = c1912940zsaLIZ2.LIZLLL;
        }
        C1912930zsZ.LIZIZ(c1912950zsb2);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1568170quV.LIZ(2100);
        C1150504el.LIZ().LIZLLL("interest_slogan_fragment_viewcreated", false);
        C1913090zsp.LIZ.getClass();
        C1913090zsp.LJFF = SystemClock.elapsedRealtime();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1912950zsb c1912950zsb;
        C1912950zsb c1912950zsb2;
        C1150504el.LIZ().LJI("interest_window_focus_changed_to_slogan_fragment", false);
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        C10NW c10nw = C10NW.JOURNEY_SLOGAN_ID;
        c1912930zsZ.getClass();
        C1912940zsa c1912940zsaLIZ = C1912930zsZ.LIZ(c10nw);
        C19GS c19gs = null;
        if (c1912940zsaLIZ != null) {
            c1912950zsb = c1912940zsaLIZ.LJ;
        } else {
            c1912950zsb = null;
        }
        C1912930zsZ.LIZJ(c1912950zsb);
        C1150504el.LIZ().LIZLLL("interest_slogan_fragment_creaetview", false);
        View viewWR = WR(layoutInflater, viewGroup);
        C1150504el.LIZ().LJI("interest_slogan_fragment_creaetview", false);
        C1912940zsa c1912940zsaLIZ2 = C1912930zsZ.LIZ(c10nw);
        if (c1912940zsaLIZ2 != null) {
            c1912950zsb2 = c1912940zsaLIZ2.LJ;
        } else {
            c1912950zsb2 = null;
        }
        C1912930zsZ.LIZIZ(c1912950zsb2);
        if (viewWR != null) {
            C1848530yCh.LIZLLL(viewWR, "page_btm_b87967", AFwS271S0000000_28.get$arr$(118));
        }
        if (!(viewWR instanceof View)) {
            viewWR = null;
        }
        if (viewWR != null) {
            try {
                ViewTreeLifecycleOwner.set(viewWR, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewWR, this);
                viewWR.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewWR;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewWR;
    }
}
