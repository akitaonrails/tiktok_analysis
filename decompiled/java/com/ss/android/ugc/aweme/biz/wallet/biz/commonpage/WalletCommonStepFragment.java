package com.ss.android.ugc.aweme.biz.wallet.biz.commonpage;

import X.C098200Yq;
import X.C1548870qPN;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20277814Wa;
import X.C723850SaN;
import X.C786410Ut5;
import X.InterfaceC1221990hu9;
import X.InterfaceC21503819Do;
import X.InterfaceC836760Ws6;
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
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import jv6.a;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
@InterfaceC836760Ws6
public final class WalletCommonStepFragment extends BaseFragment implements InterfaceC21503819Do {
    public static final HashMap<String, InterfaceC1221990hu9> LLJ = new HashMap<>();
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiclM2EkKSkgLDt9KiHELIOSw2Zyw8JSgjJz8yLyBiHi4/JCA4CiA+JSoiGjs2OAM+KCg+LSs4";
    public String LLIZ = "";
    public String LLIZLLLIL = "";

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
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

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        LLJ.remove(this.LLIZ);
        super.onDestroy();
    }

    @Override // X.InterfaceC21503819Do
    public final void tv() throws JSONException {
        InterfaceC1221990hu9 interfaceC1221990hu9 = LLJ.get(this.LLIZLLLIL);
        if (interfaceC1221990hu9 != null) {
            interfaceC1221990hu9.onCancel();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", "EV_FAIL");
        new C1548870qPN().LJ("PA_SDK_EVENTS", C786410Ut5.J3(jSONObject));
        C20277814Wa.LIZIZ(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        NR(AFwS257S0000000_19.get$arr$(73));
        super.onCreate(bundle);
        C19EG activity = getActivity();
        if (activity != null) {
            a.LIZLLL(activity);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("step_name");
            String str = "";
            if (string == null) {
                string = "";
            }
            this.LLIZ = string;
            String string2 = arguments.getString(Scene.SCENE_SERVICE);
            if (string2 != null) {
                str = string2;
            }
            this.LLIZLLLIL = str;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS598S0100000_19(this, 104), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ib5, viewGroup, false);
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
