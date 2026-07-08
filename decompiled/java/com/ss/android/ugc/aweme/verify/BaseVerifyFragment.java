package com.ss.android.ugc.aweme.verify;

import X.C01GW;
import X.C098200Yq;
import X.C1218820hp2;
import X.C1269004xs;
import X.C1323820kYO;
import X.C1548820qPI;
import X.C1685300txQ;
import X.C1713570uh1;
import X.C1714040uhm;
import X.C1714660uim;
import X.C189200o6;
import X.C19719612Di;
import X.C19EG;
import X.C19GS;
import X.C20277814Wa;
import X.C2188811AlT;
import X.C397901gf;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC2242008qQ;
import X.InterfaceC1724030uxt;
import X.InterfaceC21503819Do;
import Y.ARunnableS103S0100000_3;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS152S1100000_3;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public abstract class BaseVerifyFragment extends BaseFragment implements InterfaceC21503819Do, DialogInterface.OnCancelListener, InterfaceC1724030uxt {
    public Context LLJI;
    public BaseVerifyTuxSheet LLJILJIL;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1954));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1130));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1131));
    public final Map<String, Boolean> LLJIJIL = new LinkedHashMap();

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    public String UR() {
        return "";
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    public void WR() {
    }

    public abstract int ZR();

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

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void qO(Intent intent) {
    }

    @Override // X.InterfaceC21503819Do
    public /* synthetic */ void tv() {
        C20277814Wa.LIZIZ(this);
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    public final C1713570uh1 SR() {
        return (C1713570uh1) this.LLIZLLLIL.getValue();
    }

    public final C1714660uim VR() {
        return (C1714660uim) this.LLJ.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        Context context = this.LLJI;
        return context == null ? super.getContext() : context;
    }

    @Override // X.InterfaceC1724030uxt
    public final void Hz() {
        C1714660uim c1714660uimVR = VR();
        c1714660uimVR.getClass();
        c1714660uimVR.LIZLLL = System.currentTimeMillis();
        c1714660uimVR.LIZ("fp_sdk_bnpl_enter_page", null);
    }

    @Override // X.InterfaceC1724030uxt
    public void bF() {
        VR().LJ("close");
    }

    @Override // X.InterfaceC1724030uxt
    public final void cv() {
        VR().LJ("return");
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C19719612Di.LJJIII(((LinkedHashMap) this.LLJIJIL).keySet(), new AwS582S0100000_3(this, 58), true);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        aS(EnumC2242008qQ.PAGE_CLOSED.getEventName());
    }

    @Override // X.InterfaceC1724030uxt
    public final void vg() {
        VR().LJ("next");
    }

    public final void aS(String str) {
        AwS152S1100000_3 awS152S1100000_3 = new AwS152S1100000_3(this, str, 2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getClass().getName());
        sbLIZ.append('_');
        sbLIZ.append(hashCode());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Map<String, Boolean> map = this.LLJIJIL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append('-');
        sbLIZ2.append("");
        if (!map.containsKey(C2188811AlT.LIZIZ(sbLIZ2))) {
            Map<String, Boolean> map2 = this.LLJIJIL;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append('-');
            sbLIZ3.append("");
            map2.put(C2188811AlT.LIZIZ(sbLIZ3), Boolean.TRUE);
            try {
                awS152S1100000_3.invoke();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public final void bS(String str) {
        if (Intrinsics.LJFF(str, "PASS")) {
            aS(EnumC2242008qQ.VERIFY_SUCCEEDED_PAGE_CLOSED.getEventName());
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        String str;
        C1714040uhm c1714040uhm;
        super.onAttach(context);
        C1713570uh1 c1713570uh1SR = SR();
        if (c1713570uh1SR != null && (c1714040uhm = c1713570uh1SR.LIZ.LIZIZ) != null) {
            str = c1714040uhm.LIZLLL;
        } else {
            str = null;
        }
        this.LLJI = C1218820hp2.LIZ(context, str);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        activityConfiguration(new AwS605S0100000_26(this, 424));
        if (C1269004xs.LIZ().enablePublishEvPageLoaded) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", "EV_PAGE_LOADED");
            C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, new C1323820kYO(jSONObject), "HYBRID_LAYOUT_MODULES_EVENTS"));
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        HandlerHook.viewPost(view, new ARunnableS103S0100000_3(this, 55));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater.cloneInContext(this.LLJI), ZR(), viewGroup, false);
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
