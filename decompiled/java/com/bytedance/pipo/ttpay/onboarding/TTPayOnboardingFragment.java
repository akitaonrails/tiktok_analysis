package com.bytedance.pipo.ttpay.onboarding;

import X.C098200Yq;
import X.C1685300txQ;
import X.C1716350ulV;
import X.C1716550ulp;
import X.C1717080umg;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2097908Jt;
import X.C723850SaN;
import X.C786410Ut5;
import X.InterfaceC1724030uxt;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.biz.wallet.biz.landing.base.BaseWalletLandingFragment;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import jv6.a;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes27.dex */
public final class TTPayOnboardingFragment extends BaseWalletLandingFragment implements InterfaceC1724030uxt {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs8ID88ZjE4OS4qZioiKyAyHELIOSOiElJyh9HBEcKDYcJicjKD03ISsrDz0yLygpJzs=";
    public String LLJIJIL;
    public String LLJILJIL;

    @Override // X.InterfaceC1724030uxt
    public final void Hz() {
    }

    @Override // X.InterfaceC1724030uxt
    public final void bF() {
    }

    @Override // X.InterfaceC1724030uxt
    public final void cv() {
    }

    @Override // X.InterfaceC1724030uxt
    public final void vg() {
    }

    @Override // com.ss.android.ugc.aweme.biz.wallet.biz.landing.base.BaseWalletLandingFragment, com.ss.android.ugc.aweme.foundation.fragment.BaseEntryFragment
    public final void UR() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString(Scene.SCENE_SERVICE);
            if (string == null) {
                string = "";
            }
            this.LLIZLLLIL = string;
            String string2 = arguments.getString("source");
            if (string2 == null) {
                string2 = "";
            }
            this.LLIZ = string2;
            String string3 = arguments.getString("theme");
            if (string3 == null) {
                string3 = "";
            }
            this.LLJ = string3;
            String string4 = arguments.getString("entrance");
            if (string4 == null) {
                string4 = "";
            }
            this.LLJIJIL = string4;
            String string5 = arguments.getString("source_btm_token");
            if (string5 == null) {
                string5 = "";
            }
            this.LLJILJIL = string5;
            if (this.LLJ.length() == 0) {
                this.LLJ = "default";
            }
            String strDecode = Uri.decode(arguments.getString("host"));
            if (strDecode == null) {
                strDecode = "";
            }
            String string6 = arguments.getString("token");
            if (string6 == null) {
                string6 = "";
            }
            String string7 = arguments.getString("merchant_id");
            if (string7 == null) {
                string7 = "";
            }
            String string8 = arguments.getString("merchant_user_id");
            String str = string8 != null ? string8 : "";
            C1716550ulp c1716550ulp = C1716550ulp.LIZ;
            String str2 = this.LLIZLLLIL;
            String str3 = this.LLIZ;
            C1716350ulV c1716350ulV = new C1716350ulV(string7, str);
            long jCurrentTimeMillis = System.currentTimeMillis();
            String string9 = arguments.getString("balance_url");
            String string10 = arguments.getString("template_code");
            String string11 = arguments.getString("portal_url");
            String string12 = arguments.getString("topup_url");
            String string13 = arguments.getString("withdraw_url");
            String string14 = arguments.getString("balance_limit_url");
            String string15 = arguments.getString("fail_url");
            String string16 = arguments.getString("session_id");
            String str4 = this.LLJIJIL;
            String string17 = arguments.getString("pipo_product_code");
            C1717080umg c1717080umg = new C1717080umg(strDecode, string6, str3, c1716350ulV, "", jCurrentTimeMillis, (Map) null, str4, string10, string11, string9, string12, string13, string14, string15, string16, getArguments(), string17, Integer.valueOf(arguments.getInt("disable_toast", 0)), arguments.getString("schema_extra_param"), 192);
            c1716550ulp.getClass();
            C1716550ulp.LIZIZ(str2, c1717080umg);
        }
    }

    @Override // com.ss.android.ugc.aweme.biz.wallet.biz.landing.base.BaseWalletLandingFragment
    public final Map<String, String> VR() {
        String str = this.LLJIJIL;
        if (str == null) {
            str = "";
        }
        return C2097908Jt.LIZJ(new Pair("enter_from", str));
    }

    @Override // com.ss.android.ugc.aweme.biz.wallet.biz.landing.base.BaseWalletLandingFragment, com.ss.android.ugc.aweme.foundation.fragment.BaseEntryFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.ss.android.ugc.aweme.biz.wallet.biz.landing.base.BaseWalletLandingFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS598S0100000_19(this, 53), 3);
    }

    @Override // com.ss.android.ugc.aweme.biz.wallet.biz.landing.base.BaseWalletLandingFragment, com.ss.android.ugc.aweme.foundation.fragment.BaseEntryFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        a.LIZLLL(layoutInflater.getContext());
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.i32, viewGroup, false);
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
