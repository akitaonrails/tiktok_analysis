package com.ss.android.ugc.aweme.pipo.postpayment.impl;

import X.C01GW;
import X.C098200Yq;
import X.C1211110hcb;
import X.C1548870qPN;
import X.C1685300txQ;
import X.C1708710uZB;
import X.C1708720uZC;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C20277814Wa;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1244130iTr;
import X.InterfaceC21503819Do;
import X.InterfaceC836760Ws6;
import Y.ARunnableS119S0100000_19;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.component.base.ui.PipoTransparentActivity;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
@InterfaceC836760Ws6(attachActivity = PipoTransparentActivity.class)
public final class PostPaymentActionHostFragment extends BaseFragment implements InterfaceC21503819Do, InterfaceC1244130iTr {
    public static final BPEAHandler LLJILLL = new BPEAHandler(Looper.getMainLooper());
    public static final Set<PostPaymentActionHostFragment> LLJJ = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUlOSB9OCo/PT8yMSgpHELIOSJzt9ISg8JWEDJzY4GS4qJSAiPQ4wPCwjJwc8OzEKOy40JSAiPQ==";
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS257S0000000_19.get$arr$(248), "action_type", String.class);
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS257S0000000_19.get$arr$(249), "material_content", String.class);
    public final C01GW LLJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS257S0000000_19.get$arr$(247), "action_session_id", String.class);
    public final C01GW LLJI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS257S0000000_19.get$arr$(250), "page_name", String.class);
    public final AtomicBoolean LLJIJIL = new AtomicBoolean(false);
    public String LLJILJIL;
    public C1211110hcb LLJILJILJ;

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
    public final void tv() throws JSONException {
        ip("user_back", true);
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    public final void SR() {
        int i = (int) (624 * getResources().getDisplayMetrics().density);
        C19EG c19egRequireActivity = requireActivity();
        Window window = c19egRequireActivity.getWindow();
        c19egRequireActivity.setFinishOnTouchOutside(false);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.getDecorView().setBackgroundColor(0);
        window.addFlags(2);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        attributes.width = -1;
        attributes.height = i;
        attributes.dimAmount = 0.32f;
        window.setAttributes(attributes);
        window.setLayout(-1, i);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() throws JSONException {
        C19EG activity = getActivity();
        if (activity == null || !activity.isChangingConfigurations()) {
            ip("destroy", true);
        }
        LLJJ.remove(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        SR();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        SR();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String upperCase;
        super.onCreate(bundle);
        String str = (String) this.LLIZ.getValue();
        C1211110hcb c1211110hcb = null;
        str = null;
        String str2 = null;
        c1211110hcb = null;
        if (str != null) {
            upperCase = str.toUpperCase(Locale.ROOT);
        } else {
            upperCase = null;
        }
        this.LLJILJIL = upperCase;
        String str3 = (String) this.LLJ.getValue();
        if (str3 != null && (!a0.LJJJIL(str3))) {
            String str4 = (String) this.LLJI.getValue();
            if (str4 != null && (!a0.LJJJIL(str4))) {
                str2 = str4;
            }
            c1211110hcb = new C1211110hcb(str3, str2);
        }
        this.LLJILJILJ = c1211110hcb;
        LLJJ.add(this);
    }

    @Override // X.InterfaceC1244130iTr
    public final boolean ip(String str, boolean z) throws JSONException {
        String str2;
        if (!this.LLJIJIL.compareAndSet(false, true)) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("action complete: ");
        String str3 = this.LLJILJIL;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        sbLIZ.append(str3);
        sbLIZ.append(", ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("TTLSPostPaymentActionHost, ");
        sbLIZ2.append(strLIZIZ);
        c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ2));
        C1548870qPN c1548870qPN = new C1548870qPN();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("from", "pipo_post_payment");
        C1211110hcb c1211110hcb = this.LLJILJILJ;
        if (c1211110hcb == null || (str2 = c1211110hcb.actionSessionId) == null) {
            str2 = "";
        }
        jSONObject.put("action_session_id", str2);
        String str5 = this.LLJILJIL;
        if (str5 != null) {
            str4 = str5;
        }
        jSONObject.put("action_type", str4);
        jSONObject.put("action", str);
        jSONObject.put("result", z);
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        c1548870qPN.LJ("pipo_post_payment_action_complete", C786410Ut5.J3(jSONObject));
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
        return true;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws JSONException {
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            String str = this.LLJILJIL;
            if (!Intrinsics.LJFF(str, "VISA_PAYMENT_SIGNAL") && !Intrinsics.LJFF(str, "AFTER_PAYMENT_BIND_RETAIN")) {
                ip("unsupported_action", false);
                return;
            }
            String str2 = this.LLJILJIL;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = (String) this.LLIZLLLIL.getValue();
            C1211110hcb c1211110hcb = this.LLJILJILJ;
            PipoPostPaymentGuideFragment pipoPostPaymentGuideFragment = new PipoPostPaymentGuideFragment();
            Bundle bundle2 = new Bundle();
            C786410Ut5.LJJJI("arg_action_type", str2, bundle2);
            C786410Ut5.LJJJI("arg_material_content", str3, bundle2);
            if (c1211110hcb != null) {
                C786410Ut5.LJJIZ(bundle2, "arg_post_payment_context", c1211110hcb);
            }
            pipoPostPaymentGuideFragment.setArguments(bundle2);
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJ(15731217, pipoPostPaymentGuideFragment, null);
            c19ehLJIIJ.LJIIL();
        }
        HandlerHook.viewPost(view, new ARunnableS119S0100000_19(this, 84));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setId(15731217);
        frameLayout.setBackgroundColor(0);
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        try {
            ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(frameLayout, this);
            frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return frameLayout;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return frameLayout;
        }
    }
}
