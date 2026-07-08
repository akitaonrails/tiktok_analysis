package com.ss.android.ugc.aweme.biz.wallet.biz.finish;

import X.C098200Yq;
import X.C1685300txQ;
import X.C1716340ulU;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20277814Wa;
import X.C2097608Jq;
import X.C723850SaN;
import X.C786410Ut5;
import X.EnumC1716530uln;
import X.InterfaceC1716990umX;
import X.InterfaceC1724030uxt;
import X.InterfaceC21503819Do;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import jv6.a;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS112S0110000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
@InterfaceC836760Ws6
public final class WalletAccountFinishFragment extends BaseFragment implements InterfaceC21503819Do, InterfaceC1724030uxt {
    public static final HashMap<String, InterfaceC1716990umX> LLJJI = new HashMap<>();
    public static final HashMap<String, String> LLJJIII = new HashMap<>();
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiclM2EkKSkgLDt9KiHELIOSw2Zyk6Jiw/IWEEKSkgLDsSKyYjPCEnDiwiIDw7DjctLiI2JjE=";
    public boolean LLIZLLLIL;
    public long LLJILLL;
    public String LLJJ;
    public String LLIZ = "";
    public String LLJ = "";
    public String LLJI = "";
    public String LLJIJIL = "";
    public String LLJILJIL = "";
    public String LLJILJILJ = "";

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

    @Override // X.InterfaceC1724030uxt
    public final void bF() {
        C1716340ulU.LIZJ("credit_activate_result", EnumC1716530uln.CLOSE, String.valueOf(System.currentTimeMillis() - this.LLJILLL), C2097608Jq.LJIIJ(new Pair("source_id", this.LLJIJIL)));
    }

    @Override // X.InterfaceC1724030uxt
    public final void cv() {
        C1716340ulU.LIZJ("credit_activate_result", EnumC1716530uln.RETURN, String.valueOf(System.currentTimeMillis() - this.LLJILLL), C2097608Jq.LJIIJ(new Pair("source_id", this.LLJIJIL)));
    }

    @Override // X.InterfaceC21503819Do
    public final void tv() {
        String str = this.LLIZ;
        HashMap<String, InterfaceC1716990umX> map = LLJJI;
        InterfaceC1716990umX interfaceC1716990umX = map.get(str);
        if (interfaceC1716990umX != null) {
            interfaceC1716990umX.onCancel();
            map.remove(str);
        }
    }

    @Override // X.InterfaceC1724030uxt
    public final void vg() {
        C1716340ulU.LIZJ("credit_activate_result", EnumC1716530uln.NEXT, String.valueOf(System.currentTimeMillis() - this.LLJILLL), C2097608Jq.LJIIJ(new Pair("source_id", this.LLJIJIL)));
    }

    @Override // X.InterfaceC1724030uxt
    public final void Hz() {
        this.LLJILLL = System.currentTimeMillis();
        C1716340ulU.LIZIZ("credit_activate_result", C2097608Jq.LJIIJ(new Pair("source_id", this.LLJIJIL)));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        NR(AFwS268S0000000_26.get$arr$(98));
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString(Scene.SCENE_SERVICE);
            String str = "";
            if (string == null) {
                string = "";
            }
            this.LLIZ = string;
            arguments.getString("schema");
            this.LLIZLLLIL = TextUtils.equals(arguments.getString("no_animation"), "1");
            String string2 = arguments.getString("home_page_url");
            if (string2 == null) {
                string2 = "";
            }
            this.LLJ = string2;
            String string3 = arguments.getString("previous_page_id");
            if (string3 == null) {
                string3 = "";
            }
            this.LLJI = string3;
            String string4 = arguments.getString("enter_from");
            if (string4 == null) {
                string4 = "";
            }
            this.LLJIJIL = string4;
            String string5 = arguments.getString("user_status");
            if (string5 == null) {
                string5 = "";
            }
            this.LLJILJIL = string5;
            String string6 = arguments.getString("activate_result");
            if (string6 != null) {
                str = string6;
            }
            this.LLJILJILJ = str;
            this.LLJJ = arguments.getString("source_btm_token");
        }
        NR(new AwS605S0100000_26(this, 61));
        BtmSDK.INSTANCE.registerBtmPageOnCreate(this, "a2270.b57044", this.LLJJ);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("show_close");
        } else {
            string = null;
        }
        boolean z = true;
        if (string != null && string.length() != 0 && !Intrinsics.LJFF(string, "true")) {
            z = false;
        }
        C723850SaN.LIZ(this, false, null, new AwS112S0110000_26(this, z, 0), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        a.LIZLLL(layoutInflater.getContext());
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ib7, viewGroup, false);
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
