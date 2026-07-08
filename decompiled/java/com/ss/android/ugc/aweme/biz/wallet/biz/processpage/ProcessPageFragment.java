package com.ss.android.ugc.aweme.biz.wallet.biz.processpage;

import X.C01GW;
import X.C098200Yq;
import X.C1238130iKB;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1685300txQ;
import X.C1716310ulR;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20277814Wa;
import X.C2097608Jq;
import X.C723850SaN;
import X.C786410Ut5;
import X.EnumC1716530uln;
import X.InterfaceC1719050upr;
import X.InterfaceC1724030uxt;
import X.InterfaceC21503819Do;
import X.InterfaceC836760Ws6;
import Y.ACListenerS160S0100000_26;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import jv6.a;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
@InterfaceC836760Ws6
public final class ProcessPageFragment extends BaseFragment implements InterfaceC21503819Do, InterfaceC1724030uxt {
    public static final HashMap<String, InterfaceC1719050upr> LLJIJIL = new HashMap<>();
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiclM2EkKSkgLDt9HELIOSKiw2Zz8hJyYpOjwjKSIpZx8hJyYpOjwDKSIpDz0yLygpJzs=";
    public TuxIconView LLIZ;
    public C197039127h LLIZLLLIL;
    public final C01GW LLJ = RouteArgExtension.INSTANCE.navArg(this);
    public long LLJI;

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    public final void UR() {
        String previousPageId;
        String eventParam;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("popup_id", "quit_kyc"), new Pair("obj_id", "{1,continue; 2, leave}"));
        ProcessPageRouteArg processPageRouteArgSR = SR();
        if (processPageRouteArgSR != null && (eventParam = processPageRouteArgSR.getEventParam()) != null) {
            C1716310ulR.LIZ.getClass();
            mapLJIIJ.putAll(C1716310ulR.LIZ(eventParam));
        }
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        ProcessPageRouteArg processPageRouteArgSR2 = SR();
        if (processPageRouteArgSR2 == null || (previousPageId = processPageRouteArgSR2.getPreviousPageId()) == null) {
            previousPageId = "";
        }
        c1716310ulR.getClass();
        C1716310ulR.LIZJ("fp_sdk_bnpl_popup_show", "creator_wallet_activate_step_progress", previousPageId, mapLJIIJ);
        C1397580mTM c1397580mTM = new C1397580mTM(requireContext());
        c1397580mTM.LJFF(2131840470);
        c1397580mTM.LIZ(2131840468);
        C1238130iKB.LIZ(c1397580mTM, new AwS605S0100000_26(this, 69));
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
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
    public final void Hz() {
        String previousPageId;
        String eventParam;
        String scene;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ProcessPageRouteArg processPageRouteArgSR = SR();
        if (processPageRouteArgSR != null && (scene = processPageRouteArgSR.getScene()) != null) {
            linkedHashMap.put("busi_type", scene);
        }
        ProcessPageRouteArg processPageRouteArgSR2 = SR();
        if (processPageRouteArgSR2 != null && (eventParam = processPageRouteArgSR2.getEventParam()) != null) {
            C1716310ulR.LIZ.getClass();
            linkedHashMap.putAll(C1716310ulR.LIZ(eventParam));
        }
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        ProcessPageRouteArg processPageRouteArgSR3 = SR();
        if (processPageRouteArgSR3 == null || (previousPageId = processPageRouteArgSR3.getPreviousPageId()) == null) {
            previousPageId = "";
        }
        C1716310ulR.LJFF(c1716310ulR, "creator_wallet_activate_step_progress", previousPageId, linkedHashMap);
    }

    public final ProcessPageRouteArg SR() {
        return (ProcessPageRouteArg) this.LLJ.getValue();
    }

    @Override // X.InterfaceC1724030uxt
    public final void bF() {
        String eventParam;
        String scene;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ProcessPageRouteArg processPageRouteArgSR = SR();
        if (processPageRouteArgSR != null && (scene = processPageRouteArgSR.getScene()) != null) {
            linkedHashMap.put("busi_type", scene);
        }
        ProcessPageRouteArg processPageRouteArgSR2 = SR();
        if (processPageRouteArgSR2 != null && (eventParam = processPageRouteArgSR2.getEventParam()) != null) {
            C1716310ulR.LIZ.getClass();
            linkedHashMap.putAll(C1716310ulR.LIZ(eventParam));
        }
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        ProcessPageRouteArg processPageRouteArgSR3 = SR();
        String previousPageId = processPageRouteArgSR3 != null ? processPageRouteArgSR3.getPreviousPageId() : null;
        EnumC1716530uln enumC1716530uln = EnumC1716530uln.CLOSE;
        String strValueOf = String.valueOf(System.currentTimeMillis() - this.LLJI);
        c1716310ulR.getClass();
        C1716310ulR.LJI("creator_wallet_activate_step_progress", previousPageId, enumC1716530uln, strValueOf, linkedHashMap);
    }

    @Override // X.InterfaceC1724030uxt
    public final void cv() {
        String eventParam;
        String scene;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ProcessPageRouteArg processPageRouteArgSR = SR();
        if (processPageRouteArgSR != null && (scene = processPageRouteArgSR.getScene()) != null) {
            linkedHashMap.put("busi_type", scene);
        }
        ProcessPageRouteArg processPageRouteArgSR2 = SR();
        if (processPageRouteArgSR2 != null && (eventParam = processPageRouteArgSR2.getEventParam()) != null) {
            C1716310ulR.LIZ.getClass();
            linkedHashMap.putAll(C1716310ulR.LIZ(eventParam));
        }
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        ProcessPageRouteArg processPageRouteArgSR3 = SR();
        String previousPageId = processPageRouteArgSR3 != null ? processPageRouteArgSR3.getPreviousPageId() : null;
        EnumC1716530uln enumC1716530uln = EnumC1716530uln.RETURN;
        String strValueOf = String.valueOf(System.currentTimeMillis() - this.LLJI);
        c1716310ulR.getClass();
        C1716310ulR.LJI("creator_wallet_activate_step_progress", previousPageId, enumC1716530uln, strValueOf, linkedHashMap);
    }

    @Override // X.InterfaceC21503819Do
    public final void tv() {
        onEventClick("back");
        UR();
    }

    @Override // X.InterfaceC1724030uxt
    public final void vg() {
        String eventParam;
        String scene;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ProcessPageRouteArg processPageRouteArgSR = SR();
        if (processPageRouteArgSR != null && (scene = processPageRouteArgSR.getScene()) != null) {
            linkedHashMap.put("busi_type", scene);
        }
        ProcessPageRouteArg processPageRouteArgSR2 = SR();
        if (processPageRouteArgSR2 != null && (eventParam = processPageRouteArgSR2.getEventParam()) != null) {
            C1716310ulR.LIZ.getClass();
            linkedHashMap.putAll(C1716310ulR.LIZ(eventParam));
        }
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        ProcessPageRouteArg processPageRouteArgSR3 = SR();
        String previousPageId = processPageRouteArgSR3 != null ? processPageRouteArgSR3.getPreviousPageId() : null;
        EnumC1716530uln enumC1716530uln = EnumC1716530uln.NEXT;
        String strValueOf = String.valueOf(System.currentTimeMillis() - this.LLJI);
        c1716310ulR.getClass();
        C1716310ulR.LJI("creator_wallet_activate_step_progress", previousPageId, enumC1716530uln, strValueOf, linkedHashMap);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
        this.LLIZLLLIL = null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        NR(AFwS268S0000000_26.get$arr$(101));
        NR(new AwS605S0100000_26(this, 68));
        super.onCreate(bundle);
    }

    public final void onEventClick(String str) {
        String previousPageId;
        String eventParam;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("obj_id", str), new Pair("click_use_time", String.valueOf(System.currentTimeMillis() - this.LLJI)));
        ProcessPageRouteArg processPageRouteArgSR = SR();
        if (processPageRouteArgSR != null && (eventParam = processPageRouteArgSR.getEventParam()) != null) {
            C1716310ulR.LIZ.getClass();
            mapLJIIJ.putAll(C1716310ulR.LIZ(eventParam));
        }
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        ProcessPageRouteArg processPageRouteArgSR2 = SR();
        if (processPageRouteArgSR2 == null || (previousPageId = processPageRouteArgSR2.getPreviousPageId()) == null) {
            previousPageId = "";
        }
        c1716310ulR.getClass();
        C1716310ulR.LIZJ("fp_sdk_bnpl_step_progress_click", "creator_wallet_activate_step_progress", previousPageId, mapLJIIJ);
    }

    public final void onEventDialogClick(String str) {
        String previousPageId;
        String eventParam;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("popup_id", "quit_kyc"), new Pair("obj_id", str));
        ProcessPageRouteArg processPageRouteArgSR = SR();
        if (processPageRouteArgSR != null && (eventParam = processPageRouteArgSR.getEventParam()) != null) {
            C1716310ulR.LIZ.getClass();
            mapLJIIJ.putAll(C1716310ulR.LIZ(eventParam));
        }
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        ProcessPageRouteArg processPageRouteArgSR2 = SR();
        if (processPageRouteArgSR2 == null || (previousPageId = processPageRouteArgSR2.getPreviousPageId()) == null) {
            previousPageId = "";
        }
        c1716310ulR.getClass();
        C1716310ulR.LIZJ("fp_sdk_bnpl_popup_click", "creator_wallet_activate_step_progress", previousPageId, mapLJIIJ);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String previousPageId;
        String eventParam;
        super.onViewCreated(view, bundle);
        View viewFindViewById = null;
        C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 72), 3);
        View view2 = this.LLIZ;
        if (view2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById = view3.findViewById(R.id.rwi);
            }
            this.LLIZ = (TuxIconView) viewFindViewById;
            view2 = viewFindViewById;
        }
        C786410Ut5.a9((TuxIconView) view2, new ACListenerS160S0100000_26(this, 11));
        this.LLJI = System.currentTimeMillis();
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("interface_return_cost", String.valueOf(0L)));
        ProcessPageRouteArg processPageRouteArgSR = SR();
        if (processPageRouteArgSR != null && (eventParam = processPageRouteArgSR.getEventParam()) != null) {
            C1716310ulR.LIZ.getClass();
            mapLJIIJ.putAll(C1716310ulR.LIZ(eventParam));
        }
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        ProcessPageRouteArg processPageRouteArgSR2 = SR();
        if (processPageRouteArgSR2 == null || (previousPageId = processPageRouteArgSR2.getPreviousPageId()) == null) {
            previousPageId = "";
        }
        c1716310ulR.getClass();
        C1716310ulR.LIZJ("fp_sdk_bnpl_step_progress_show", "creator_wallet_activate_step_progress", previousPageId, mapLJIIJ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        a.LIZLLL(layoutInflater.getContext());
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ib6, viewGroup, false);
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
