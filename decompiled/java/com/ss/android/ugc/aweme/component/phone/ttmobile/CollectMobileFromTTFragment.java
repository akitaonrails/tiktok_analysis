package com.ss.android.ugc.aweme.component.phone.ttmobile;

import X.C01GW;
import X.C098200Yq;
import X.C13LE;
import X.C14EU;
import X.C1685300txQ;
import X.C1715520ukA;
import X.C1719430uqT;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20277814Wa;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C990770btD;
import X.InterfaceC1567370qtD;
import X.InterfaceC1724030uxt;
import X.InterfaceC21503819Do;
import X.InterfaceC2217461Bqa;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.component.phone.PhoneNumberFragment;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import jv6.a;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS605S0100000_26;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes27.dex */
@InterfaceC836760Ws6
public final class CollectMobileFromTTFragment extends BaseFragment implements InterfaceC21503819Do, InterfaceC1724030uxt {
    public static final C1719430uqT LLIZLLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final HashMap<String, InterfaceC1567370qtD> LLJI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD88JiAiPWEjICoiHELIOSLGEnPCgjKyY/LWsPJiM/LSY4BCAxISkpDz08JREYDz0yLygpJzs=";
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.navArg(this);

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0uqT] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CollectMobileFromTTFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/component/phone/ttmobile/CollectMobileFromTTViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLIZLLLIL = new Object() { // from class: X.0uqT
        };
        LLJI = new HashMap<>();
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC1724030uxt
    public final void Hz() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.InterfaceC1724030uxt
    public final void bF() {
    }

    @Override // X.InterfaceC1724030uxt
    public final void cv() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void qO(Intent intent) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    @Override // X.InterfaceC1724030uxt
    public final void vg() {
    }

    public final TTPhoneRouteArg SR() {
        return (TTPhoneRouteArg) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC21503819Do
    public final void tv() {
        String scene;
        C1719430uqT c1719430uqT = LLIZLLLIL;
        TTPhoneRouteArg tTPhoneRouteArgSR = SR();
        if (tTPhoneRouteArgSR == null || (scene = tTPhoneRouteArgSR.getScene()) == null) {
            scene = "";
        }
        c1719430uqT.getClass();
        InterfaceC1567370qtD interfaceC1567370qtD = LLJI.get(scene);
        if (interfaceC1567370qtD != null) {
            interfaceC1567370qtD.LIZ(false, null, null, null, null);
        }
        C20277814Wa.LIZIZ(this);
    }

    public CollectMobileFromTTFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CollectMobileFromTTViewModel.class);
        new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS568S0100000_24(c19719912DlLIZ, 252), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 253), AFwS268S0000000_26.get$arr$(118));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String scene;
        EventBus.LIZLLL().LJJI(this);
        TTPhoneRouteArg tTPhoneRouteArgSR = SR();
        if (tTPhoneRouteArgSR != null && (scene = tTPhoneRouteArgSR.getScene()) != null) {
            PhoneNumberFragment.LLJJI.getClass();
            PhoneNumberFragment.LLJJIJI.remove(scene);
        }
        super.onDestroy();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String sourceBtmToken;
        Window window;
        NR(AFwS268S0000000_26.get$arr$(117));
        activityConfiguration(new AwS605S0100000_26(this, 115));
        super.onCreate(bundle);
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        EventBus.LIZLLL().LJIJJ(this);
        TTPhoneRouteArg tTPhoneRouteArgSR = SR();
        if (tTPhoneRouteArgSR != null) {
            sourceBtmToken = tTPhoneRouteArgSR.getSourceBtmToken();
        } else {
            sourceBtmToken = null;
        }
        BtmSDK.INSTANCE.registerBtmPageOnCreate(this, "a2270.b79668", sourceBtmToken);
        C1715520ukA.LIZIZ(bundle, "CollectMobileFromTTFragment");
    }

    @C14EU
    public final void onEvent(C990770btD c990770btD) {
        requireActivity().finish();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS605S0100000_26(this, 116), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        a.LIZLLL(layoutInflater.getContext());
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.agj, viewGroup, false);
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
