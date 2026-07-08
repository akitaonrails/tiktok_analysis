package com.bytedance.pipo.ttpay.landing;

import X.C01GW;
import X.C098200Yq;
import X.C14EU;
import X.C1505710pHl;
import X.C1685300txQ;
import X.C1713870uhV;
import X.C1715520ukA;
import X.C1775680wJC;
import X.C1849907Mj;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C452501pT;
import X.C585330MxX;
import X.C723850SaN;
import X.C786410Ut5;
import X.InterfaceC836760Ws6;
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
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.text.u;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;

/* JADX INFO: loaded from: classes27.dex */
@InterfaceC836760Ws6
public final class WelcomePageFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs8ID88ZjE4OS4qZiktHELIOSJys6JiJiHio/KyohLB8yLyAKOy40JSAiPQ==";
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(42), "session_id", String.class);
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(39), "host", String.class);
    public final C01GW LLJ = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(38), "enter_from", String.class);
    public final C01GW LLJI = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(41), "previous_page_id", String.class);
    public final C01GW LLJIJIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(44), "trace_id", String.class);
    public final C01GW LLJILJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS268S0000000_26.get$arr$(43), "source_btm_token", String.class);
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 56));

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        EventBus.LIZLLL().LJJI(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() throws JSONException {
        super.onStart();
        C1713870uhV.LIZ("pipo_page_enter", C2097608Jq.LJIIL((Map) this.LLJILJILJ.getValue(), C2097908Jt.LIZJ(new Pair("busi_line", "tiktokpay"))));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        EventBus.LIZLLL().LJIJJ(this);
        NR(AFwS268S0000000_26.get$arr$(40));
        super.onCreate(bundle);
        if (bundle != null && C1849907Mj.LIZ("ttpay_welcome_page")) {
            C1715520ukA.LIZIZ(bundle, "ttpay_welcome_page");
            C19EG activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        C1505710pHl.LIZ = (String) this.LLIZ.getValue();
        C1505710pHl.LIZIZ = (String) this.LLIZLLLIL.getValue();
        C19EG activity2 = getActivity();
        if (activity2 != null) {
            activity2.getOnBackPressedDispatcher().LIZ(activity2, new C1775680wJC(activity2, 0));
        }
        try {
            if (((String) this.LLJILJIL.getValue()) != null) {
                BtmSDK.INSTANCE.registerBtmPageOnCreate(this, "a2270.b32145", (String) this.LLJILJIL.getValue());
            }
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            PageFinder pageFinderVia = PageFinder.via((Fragment) this);
            BcmParams bcmParams = new BcmParams();
            bcmParams.put("active_scenario", "WELCOME");
            btmSDK.setBcmPageParams(pageFinderVia, bcmParams, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @C14EU
    public final void onEvent(C585330MxX c585330MxX) {
        C19EG activity;
        if (u.LJIJI(c585330MxX.LIZ, "close_source_page", true) && (activity = getActivity()) != null) {
            activity.finish();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS605S0100000_26(this, 42), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c9w, viewGroup, false);
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
