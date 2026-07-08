package com.bytedance.pipo.stellar.base.page;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C13LE;
import X.C1548870qPN;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1715520ukA;
import X.C1849907Mj;
import X.C189200o6;
import X.C1948507kB;
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
import X.InterfaceC1548890qPP;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.InterfaceC836760Ws6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
@InterfaceC836760Ws6
public final class StellarPageFragment extends BaseFragment implements InterfaceC1548890qPP {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs8ID88ZjY4LCM/KTdiKyHELIOS4gLWs8KCg2ZhY4LCM/KTccKCg2DjctLiI2JjE=";
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS257S0000000_19.get$arr$(18), "target_page", String.class);
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS257S0000000_19.get$arr$(30), "page_id", String.class);
    public final C01GW LLJ = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS257S0000000_19.get$arr$(35), "previous_page_id", String.class);
    public final C01GW LLJI = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS257S0000000_19.get$arr$(23), "entrance", String.class);
    public final C01GW LLJIJIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS257S0000000_19.get$arr$(22), "enter_from", String.class);
    public final C01GW LLJILJIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS257S0000000_19.get$arr$(20), "trace_id", String.class);
    public final C01GW LLJILJILJ = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS257S0000000_19.get$arr$(37), "session_id", String.class);
    public final C01GW LLJILLL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS257S0000000_19.get$arr$(27), "merchant_id", String.class);
    public final C01GW LLJJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS257S0000000_19.get$arr$(26), "host", String.class);
    public final C01GW LLJJI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS257S0000000_19.get$arr$(32), "path", String.class);
    public final C01GW LLJJIII = RouteArgExtension.INSTANCE.optionalArg(this, AFwS257S0000000_19.get$arr$(25), "extra", String.class);
    public final C01GW LLJJIJI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS257S0000000_19.get$arr$(19), "container_id", String.class);
    public final C01GW LLJJIJIIJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS257S0000000_19.get$arr$(31), "page_title", String.class);
    public final C01GW LLJJIJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS257S0000000_19.get$arr$(38), "source_btm_token", String.class);
    public final C01GW LLJJJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS257S0000000_19.get$arr$(17), "btm_id", String.class);
    public final C01GW LLJJJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS257S0000000_19.get$arr$(24), "extra_log", String.class);
    public final C01GW LLJJJJ = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS257S0000000_19.get$arr$(36), "report_page_event", Integer.class);
    public final C01GW LLJJJJJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS257S0000000_19.get$arr$(28), "need_polling", String.class);
    public final C01GW LLJJJJLIIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS257S0000000_19.get$arr$(33), "polling_interval", String.class);
    public final C01GW LLJJL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS257S0000000_19.get$arr$(16), "sum_times", String.class);
    public final C01GW LLJJLIIIJLLLLLLLZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS257S0000000_19.get$arr$(34), "polling_params", String.class);
    public final C01GW LLJL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS257S0000000_19.get$arr$(21), "current_time", String.class);
    public final AssemVMLazy LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StellarPageFragment.class, "vm", "getVm()Lcom/bytedance/pipo/stellar/base/page/StellarPageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public StellarPageFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StellarPageViewModel.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 59);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(39);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 60), aFwS257S0000000_19, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new AwS563S0100000_19((Fragment) this, 61), aFwS257S0000000_19, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 62), aFwS257S0000000_19, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJLIL = assemVMLazy;
    }

    public final String SR() {
        return (String) this.LLIZ.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        new C1548870qPN().LJI("pipo_stellar_page_close", this);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        NR(AFwS257S0000000_19.get$arr$(29));
        super.onCreate(bundle);
        if (bundle != null && C1948507kB.LIZ(SR()) && C1849907Mj.LIZ(SR())) {
            C1715520ukA.LIZIZ(bundle, SR());
            C19EG activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        new C1548870qPN().LJFF("pipo_stellar_page_close", this);
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        String str = (String) this.LLJJJ.getValue();
        if (str == null) {
            str = "";
        }
        btmSDK.registerBtmPageOnCreate(this, str, (String) this.LLJJIJIL.getValue());
    }

    @Override // X.InterfaceC1548890qPP
    public final void onEvent(String str, String str2) {
        C19EG activity;
        JSONObject jSONObject = new JSONObject(str2);
        if (Intrinsics.LJFF(str, "pipo_stellar_page_close") && Intrinsics.LJFF(SR(), jSONObject.optString("target_page")) && (activity = getActivity()) != null) {
            activity.finish();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS598S0100000_19(this, 51), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c9q, viewGroup, false);
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
