package com.bytedance.pipo.ttpay.recharge;

import X.C01GW;
import X.C098200Yq;
import X.C0TVI;
import X.C14K9;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20097313kJ;
import X.C723850SaN;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC836760Ws6;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
@InterfaceC836760Ws6
public final class RechargeFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs8ID88ZjE4OS4qZjHELIOScpKicyOiIpZx02Ky0tOyg2DjctLiI2JjE=";
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(84), "session_id", String.class);
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(68), "host", String.class);
    public final C01GW LLJ = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(65), "enter_from", String.class);
    public final C01GW LLJI = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(77), "previous_page_id", String.class);
    public final C01GW LLJIJIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(58), "trace_id", String.class);
    public final C01GW LLJILJIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(64), "unified_pd_code", String.class);
    public final C01GW LLJILJILJ = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(71), "merchant_id", String.class);
    public final C01GW LLJILLL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(72), "merchant_user_id", String.class);
    public final C01GW LLJJ = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(76), "pc_product_code", String.class);
    public final C01GW LLJJI = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(78), "product_code", String.class);
    public final C01GW LLJJIII = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(62), "ui_type", String.class);
    public final C01GW LLJJIJI = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(60), "trade_type", String.class);
    public final C01GW LLJJIJIIJIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(74), "mode", String.class);
    public final C01GW LLJJIJIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(61), "currency", String.class);
    public final C01GW LLJJJ = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(83), "scene_code", String.class);
    public final C01GW LLJJJIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(67), "fund_type", String.class);
    public final C01GW LLJJJJ = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(59), "country_code", String.class);
    public final C01GW LLJJJJJIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(66), "unified_pd_code_submit", String.class);
    public final C01GW LLJJJJLIIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(82), Scene.SCENE_SERVICE, String.class);
    public final C01GW LLJJL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(57), "title", String.class);
    public final C01GW LLJJLIIIJLLLLLLLZ = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(81), "result_link", String.class);
    public final C01GW LLJL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(69), "idc", String.class);
    public final C01GW LLJLIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(79), "qr_code_type", String.class);
    public final C01GW LLJLILLLLZIIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(63), "customer_service_link", String.class);
    public final C01GW LLJLL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(80), "recommend_amount", String.class);
    public final C01GW LLJLLIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(70), "max_amount", String.class);
    public final C01GW LLJLLL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(73), "min_amount", String.class);
    public final C01GW LLJZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS268S0000000_26.get$arr$(85), "source_btm_token", String.class);

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        NR(AFwS268S0000000_26.get$arr$(75));
        super.onCreate(bundle);
        try {
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            btmSDK.registerBtmPageOnCreate(this, "a2270.b15220", (String) this.LLJZ.getValue());
            PageFinder pageFinderVia = PageFinder.via((Fragment) this);
            BcmParams bcmParams = new BcmParams();
            bcmParams.put("active_scenario", "QR_CODE_CREATE");
            btmSDK.setBcmPageParams(pageFinderVia, bcmParams, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C19EG activity;
        super.onViewCreated(view, bundle);
        if (Intrinsics.LJFF(this.LLJJIII.getValue(), "FULL_PAGE") && (activity = getActivity()) != null) {
            ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(activity);
            TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(activity, immersionBarLJIILJJIL);
            immersionBarLJIILJJIL.LJIIL();
            tuxImmersionBar.LIZ(false);
            immersionBarLJIILJJIL.LJIIJ(!C960203pA.LIZIZ(activity));
            tuxImmersionBar.LIZLLL();
        }
        if (Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(view, new C0TVI() { // from class: X.0uwW
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    C426750GoL.LJIIL(view2, null, null, null, Integer.valueOf(c20246014Ju.LIZ(7).LIZLLL), 23);
                    return c20246014Ju;
                }
            });
            C20097313kJ.LIZJ(view);
        }
        C723850SaN.LIZ(this, false, null, new AwS605S0100000_26(this, 47), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c9j, viewGroup, false);
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
