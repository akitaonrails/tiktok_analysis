package com.ss.android.ugc.aweme.journey.step.swipeup;

import X.C01GW;
import X.C037H;
import X.C037I;
import X.C098200Yq;
import X.C0B6N;
import X.C0C64;
import X.C0CR3;
import X.C10H4;
import X.C10H5;
import X.C10NW;
import X.C10PL;
import X.C10R5;
import X.C10RS;
import X.C10SV;
import X.C10TH;
import X.C1150504el;
import X.C1489670ort;
import X.C1568170quV;
import X.C1685300txQ;
import X.C1845210y7L;
import X.C1848530yCh;
import X.C189200o6;
import X.C1911410zq7;
import X.C1912470zrp;
import X.C1912560zry;
import X.C1912930zsZ;
import X.C1912940zsa;
import X.C1912950zsb;
import X.C1923507g9;
import X.C19235810Ng;
import X.C19246710Rl;
import X.C19247010Ro;
import X.C19EG;
import X.C19GS;
import X.C21648719nx;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2344009Gk;
import X.C452501pT;
import X.C616540OGe;
import X.C786410Ut5;
import X.C807840VmY;
import X.EnumC452301pR;
import X.InterfaceC1740760vOs;
import Y.ATListenerS347S0200000_28;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.app.services.IHybridABInfoService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.step.swipeup.BaseSwipeUpComponent;
import com.ss.android.ugc.aweme.journey.step.swipeup.SwipeUpVideoComponent;
import com.ss.android.ugc.aweme.nxet.ITracingService;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public abstract class BaseSwipeUpComponent extends NUJComponentFragment implements InterfaceC1740760vOs {
    public View LLJI;
    public String LLJILJIL;
    public GestureDetector LLJILJILJ;
    public float LLJILLL;
    public float LLJJ;
    public boolean LLJJI;
    public long LLJIJIL = System.currentTimeMillis();
    public final C01GW LLJJIII = C452501pT.LIZ(EnumC452301pR.NONE, AFwS217S0000000_28.get$arr$(246));

    public abstract View ZR();

    public abstract String aS();

    public void cS() {
    }

    public void dS() {
    }

    public abstract void gS(View view);

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b8846";
    }

    public abstract int getLayoutId();

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    public BaseSwipeUpComponent() {
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        C10NW c10nw = C10NW.JOURNEY_SWIPE_UP_ID;
        c1912930zsZ.getClass();
        C1912940zsa c1912940zsaLIZ = C1912930zsZ.LIZ(c10nw);
        C1912930zsZ.LIZJ(c1912940zsaLIZ != null ? c1912940zsaLIZ.LJII : null);
    }

    public void WR() {
        C19EG activity = getActivity();
        if (activity != null && C19246710Rl.LIZ("nuj") != 0) {
            TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(activity, ImmersionBar.LJIILJJIL(activity));
            tuxImmersionBar.LIZJ(false, false);
            tuxImmersionBar.LIZLLL();
        }
        VR();
        NR(null);
    }

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(getClass().getName());
        }
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        C10NW c10nw = C10NW.JOURNEY_SWIPE_UP_ID;
        c1912930zsZ.getClass();
        C1912940zsa c1912940zsaLIZ = C1912930zsZ.LIZ(c10nw);
        C1912930zsZ.LIZJ(c1912940zsaLIZ != null ? c1912940zsaLIZ.LJI : null);
        super.onResume();
        this.LLJIJIL = System.currentTimeMillis();
        C2211631BhB.LJIIL(this, getActivity());
        C1912940zsa c1912940zsaLIZ2 = C1912930zsZ.LIZ(c10nw);
        C1912930zsZ.LIZIZ(c1912940zsaLIZ2 != null ? c1912940zsaLIZ2.LJI : null);
        C1912940zsa c1912940zsaLIZ3 = C1912930zsZ.LIZ(c10nw);
        C1912930zsZ.LIZIZ(c1912940zsaLIZ3 != null ? c1912940zsaLIZ3.LJII : null);
        C1912930zsZ.LIZLLL(c10nw);
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    public void VR() {
        C1489670ort.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    public final void bS(String str) {
        C10R5 c10r5 = C10R5.LJIIIIZZ;
        C10R5 c10r5LIZ = C10RS.LIZ();
        C1923507g9.LIZ = System.currentTimeMillis() - this.LLJIJIL;
        try {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("exit_method", str);
            c2344009Gk.LJIIIIZZ("user_type", (String) this.LLJJIII.getValue());
            c2344009Gk.LIZLLL(System.currentTimeMillis() - this.LLJIJIL, "duration");
            c2344009Gk.LIZJ(c10r5LIZ.LJI, "if_send_fake_feed");
            c2344009Gk.LJIIIIZZ("debuginfo", c10r5LIZ.LJII.toString());
            Integer numLIZIZ = ((IHybridABInfoService) ServiceManager.get().getService(IHybridABInfoService.class)).LIZIZ();
            if (numLIZIZ != null) {
                c2344009Gk.LIZJ(numLIZIZ.intValue(), "is_ab_backend_resp_received");
            }
            C0CR3.LIZ.getClass();
            c2344009Gk.LIZJ(C0CR3.LJIIIZ ? 1 : 0, "is_hybrid_ab_api_rev");
            C10H5 c10h5 = C10H5.EXIT_WELCOME_SCREEN;
            c2344009Gk.LJIIIIZZ("enter_from", this.LLJILJIL);
            c2344009Gk.LJIIIIZZ("ui_type", aS());
            C10SV.LIZ(c2344009Gk);
            Map<String, String> map = c2344009Gk.LIZ;
            C807840VmY.LIZ(map);
            C10SV.LIZIZ(c10h5, map);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C1912950zsb c1912950zsb;
        Integer numValueOf;
        C10PL c10pl;
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        C10NW c10nw = C10NW.JOURNEY_SWIPE_UP_ID;
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
        C19235810Ng c19235810Ng = C10NW.Companion;
        C1912470zrp c1912470zrpOR = NUJComponentFragment.OR();
        if (c1912470zrpOR != null && (c10pl = (C10PL) c1912470zrpOR.LIZIZ(C10PL.class)) != null) {
            numValueOf = Integer.valueOf(c10pl.LE0());
        } else {
            numValueOf = null;
        }
        c19235810Ng.getClass();
        this.LLJILJIL = C19235810Ng.LIZ(numValueOf);
        cS();
        C1912940zsa c1912940zsaLIZ2 = C1912930zsZ.LIZ(c10nw);
        if (c1912940zsaLIZ2 != null) {
            c1912950zsb2 = c1912940zsaLIZ2.LIZLLL;
        }
        C1912930zsZ.LIZIZ(c1912950zsb2);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C1912950zsb c1912950zsb;
        String strLIZLLL;
        C10H4 c10h4;
        C1912560zry c1912560zryLJFF;
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        C10NW c10nw = C10NW.JOURNEY_SWIPE_UP_ID;
        c1912930zsZ.getClass();
        C1912940zsa c1912940zsaLIZ = C1912930zsZ.LIZ(c10nw);
        C1912950zsb c1912950zsb2 = null;
        if (c1912940zsaLIZ != null) {
            c1912950zsb = c1912940zsaLIZ.LJFF;
        } else {
            c1912950zsb = null;
        }
        C1912930zsZ.LIZJ(c1912950zsb);
        C1150504el.LIZ().LIZLLL("interest_swipe_fragment_view_created", false);
        super.onViewCreated(view, bundle);
        C1568170quV.LIZ(2370);
        C10TH c10thLIZ = C19247010Ro.LIZ();
        if (c10thLIZ != null) {
            strLIZLLL = c10thLIZ.LIZLLL();
        } else {
            strLIZLLL = null;
        }
        if (Intrinsics.LJFF(strLIZLLL, "online")) {
            C10H5 c10h5 = C10H5.WELCOME_SCREEN_SHOW;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", this.LLJILJIL);
            c2344009Gk.LJIIIIZZ("user_type", (String) this.LLJJIII.getValue());
            c2344009Gk.LJIIIIZZ("ui_type", aS());
            C10SV.LIZ(c2344009Gk);
            Map<String, String> map = c2344009Gk.LIZ;
            C807840VmY.LIZ(map);
            C10SV.LIZIZ(c10h5, map);
        }
        final View viewZR = ZR();
        this.LLJI = viewZR;
        this.LLJILJILJ = new GestureDetector(viewZR.getContext(), new C21648719nx() { // from class: X.10RC
            @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                BaseSwipeUpComponent baseSwipeUpComponent = this.LL;
                baseSwipeUpComponent.getClass();
                if (!(baseSwipeUpComponent instanceof SwipeUpVideoComponent) || motionEvent == null || motionEvent2 == null) {
                    return false;
                }
                C1489670ort.LIZ();
                if (motionEvent2.getRawY() - motionEvent.getRawY() < 0.0f) {
                    float fAbs = Math.abs(motionEvent2.getRawY() - motionEvent.getRawY());
                    this.LL.getClass();
                    if (fAbs >= 21.25f) {
                        float fAbs2 = Math.abs(f2);
                        this.LL.getClass();
                        if (fAbs2 >= 280.0f) {
                            this.LL.hS(viewZR, "quick_slide_up", "c5319", "d1940");
                            return true;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
        });
        C1912470zrp c1912470zrpOR = NUJComponentFragment.OR();
        if (c1912470zrpOR != null && (c10h4 = c1912470zrpOR.LIZ) != null && (c1912560zryLJFF = c10h4.LJFF()) != null && c1912560zryLJFF.LIZLLL) {
            viewZR.setOnTouchListener(new ATListenerS347S0200000_28(this, viewZR, 0));
        }
        gS(view);
        C1150504el.LIZ().LJI("interest_swipe_fragment_view_created", false);
        boolean zBooleanValue = ((Boolean) C0B6N.LIZ.getValue()).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hybrid_uneven_test_experiment_swipe_up get value:");
        sbLIZ.append(zBooleanValue);
        C1911410zq7.LIZJ("SwipeUp", C2188811AlT.LIZIZ(sbLIZ));
        C0C64.LJIILLIIL().LJJIIJ(true, "hybrid_test_experiment_custom_1", 31744, C037H.class, C037I.LIZ, 1);
        C1912940zsa c1912940zsaLIZ2 = C1912930zsZ.LIZ(c10nw);
        if (c1912940zsaLIZ2 != null) {
            c1912950zsb2 = c1912940zsaLIZ2.LJFF;
        }
        C1912930zsZ.LIZIZ(c1912950zsb2);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1912950zsb c1912950zsb;
        C1912950zsb c1912950zsb2;
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        C10NW c10nw = C10NW.JOURNEY_SWIPE_UP_ID;
        c1912930zsZ.getClass();
        C1912940zsa c1912940zsaLIZ = C1912930zsZ.LIZ(c10nw);
        C19GS c19gs = null;
        if (c1912940zsaLIZ != null) {
            c1912950zsb = c1912940zsaLIZ.LJ;
        } else {
            c1912950zsb = null;
        }
        C1912930zsZ.LIZJ(c1912950zsb);
        C1150504el.LIZ().LIZLLL("interest_swipe_fragment_createview", false);
        View viewTd = C786410Ut5.Td(layoutInflater, getLayoutId(), viewGroup, false);
        C1150504el.LIZ().LJI("interest_swipe_fragment_createview", false);
        C1912940zsa c1912940zsaLIZ2 = C1912930zsZ.LIZ(c10nw);
        if (c1912940zsaLIZ2 != null) {
            c1912950zsb2 = c1912940zsaLIZ2.LJ;
        } else {
            c1912950zsb2 = null;
        }
        C1912930zsZ.LIZIZ(c1912950zsb2);
        if (viewTd != null) {
            C1848530yCh.LIZLLL(viewTd, "page_btm_b8846", AFwS271S0000000_28.get$arr$(119));
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

    public final void hS(View view, String str, String str2, String str3) {
        if (view == null) {
            return;
        }
        if (!this.LLJJI) {
            bS(str);
            C2211631BhB.LJIJ(view, str2, str3, null, null);
            Boolean bool = Boolean.TRUE;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ITracingService iTracingServiceLIZ = C1845210y7L.LIZ();
            if (iTracingServiceLIZ != null) {
                iTracingServiceLIZ.LIZ(view, null, "swipe_up", linkedHashMap, bool);
            }
            this.LLJJI = true;
        }
        WR();
    }
}
