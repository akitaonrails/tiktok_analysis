package com.ss.android.ugc.aweme.component.phone.change.setting;

import X.C098200Yq;
import X.C14EU;
import X.C1685300txQ;
import X.C1715520ukA;
import X.C1716350ulV;
import X.C1716500ulk;
import X.C1716550ulp;
import X.C1717080umg;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20277814Wa;
import X.C723850SaN;
import X.C786410Ut5;
import X.InterfaceC1724030uxt;
import X.InterfaceC21503819Do;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
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
import java.util.Map;
import jv6.a;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS598S0100000_19;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes27.dex */
@InterfaceC836760Ws6
public final class PhoneSettingFragment extends BaseFragment implements InterfaceC21503819Do, InterfaceC1724030uxt {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD88JiAiPWEjICoiHELIOSLGEwICQiLip9OyA4PSY9L2scISA9LRYpPTs6JiIKOy40JSAiPQ==";
    public String LLIZ = "";
    public String LLIZLLLIL = "";
    public String LLJ = "";
    public String LLJI = "";
    public String LLJIJIL = "";
    public String LLJILJIL = "";
    public String LLJILJILJ = "";
    public String LLJILLL = "";

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
    public final /* synthetic */ void tv() {
        C20277814Wa.LIZIZ(this);
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    @Override // X.InterfaceC1724030uxt
    public final void vg() {
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        EventBus.LIZLLL().LJJI(this);
        super.onDestroy();
    }

    @Override // X.InterfaceC1724030uxt
    public final void Hz() {
        System.currentTimeMillis();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        NR(AFwS268S0000000_26.get$arr$(111));
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString(Scene.SCENE_SERVICE);
            String str = "";
            if (string == null) {
                string = "";
            }
            this.LLIZ = string;
            String strDecode = Uri.decode(arguments.getString("host"));
            if (strDecode == null) {
                strDecode = "";
            }
            this.LLJIJIL = strDecode;
            String string2 = arguments.getString("token");
            if (string2 == null) {
                string2 = "";
            }
            this.LLJI = string2;
            String string3 = arguments.getString("merchant_id");
            if (string3 == null) {
                string3 = "";
            }
            this.LLIZLLLIL = string3;
            String string4 = arguments.getString("merchant_user_id");
            if (string4 == null) {
                string4 = "";
            }
            this.LLJ = string4;
            String string5 = arguments.getString("enter_from");
            if (string5 == null) {
                string5 = "";
            }
            this.LLJILJIL = string5;
            String string6 = arguments.getString("previous_page_id");
            if (string6 == null) {
                string6 = "";
            }
            this.LLJILJILJ = string6;
            String string7 = arguments.getString("theme");
            if (string7 != null) {
                str = string7;
            }
            this.LLJILLL = str;
            C1716550ulp c1716550ulp = C1716550ulp.LIZ;
            String str2 = this.LLIZ;
            C1717080umg c1717080umg = new C1717080umg(this.LLJIJIL, this.LLJI, this.LLJILJIL, new C1716350ulV(this.LLIZLLLIL, this.LLJ), "", System.currentTimeMillis(), (Map) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Bundle) null, (String) null, (Integer) null, (String) null, 2097088);
            c1716550ulp.getClass();
            C1716550ulp.LIZIZ(str2, c1717080umg);
        }
        EventBus.LIZLLL().LJIJJ(this);
        C1715520ukA.LIZIZ(bundle, "PhoneSettingFragment");
    }

    @C14EU
    public final void onEvent(C1716500ulk c1716500ulk) {
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS598S0100000_19(this, 128), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        a.LIZLLL(layoutInflater.getContext());
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dun, viewGroup, false);
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
