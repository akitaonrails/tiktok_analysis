package com.ss.android.ugc.aweme.biz.wallet.biz.landing.base;

import X.C098200Yq;
import X.C1685300txQ;
import X.C1716350ulV;
import X.C1716470ulh;
import X.C1716510ull;
import X.C1716550ulp;
import X.C1717080umg;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C786410Ut5;
import X.InterfaceC836760Ws6;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.foundation.fragment.BaseEntryFragment;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import jv6.a;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes27.dex */
@InterfaceC836760Ws6
public class BaseWalletLandingFragment extends BaseEntryFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiclM2EkKSkgLDt9Kiw2HELIOSZyMyJiElJyh9KiQ/LGERKTYpHi4/JCA4BS49LCwiLgkhKSIhLCEn";
    public String LLIZ = "";
    public String LLIZLLLIL = "";
    public String LLJ = "default";
    public String LLJI = "";

    @Override // com.ss.android.ugc.aweme.foundation.fragment.BaseEntryFragment
    public final Map<String, Object> SR() {
        C1716510ull c1716510ull = C1716510ull.LIZ;
        String str = this.LLIZLLLIL;
        c1716510ull.getClass();
        return C1716510ull.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.foundation.fragment.BaseEntryFragment
    public void UR() {
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
            String string4 = arguments.getString("truly_scene");
            if (string4 == null) {
                string4 = "";
            }
            this.LLJI = string4;
            if (this.LLJ.length() == 0) {
                this.LLJ = "default";
            }
            String strDecode = Uri.decode(arguments.getString("host"));
            if (strDecode == null) {
                strDecode = "";
            }
            String string5 = arguments.getString("token");
            if (string5 == null) {
                string5 = "";
            }
            String string6 = arguments.getString("merchant_id");
            if (string6 == null) {
                string6 = "";
            }
            String string7 = arguments.getString("merchant_user_id");
            if (string7 == null) {
                string7 = "";
            }
            C1716550ulp c1716550ulp = C1716550ulp.LIZ;
            String str = this.LLIZLLLIL;
            String str2 = this.LLIZ;
            C1716350ulV c1716350ulV = new C1716350ulV(string6, string7);
            long jCurrentTimeMillis = System.currentTimeMillis();
            String string8 = arguments.getString("pipo_product_code");
            C1717080umg c1717080umg = new C1717080umg(strDecode, string5, str2, c1716350ulV, "", jCurrentTimeMillis, (Map) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Bundle) null, string8 != null ? string8 : "", (Integer) null, (String) null, 1834944);
            c1716550ulp.getClass();
            C1716550ulp.LIZIZ(str, c1717080umg);
        }
    }

    public Map<String, String> VR() {
        return C2097608Jq.LJ();
    }

    @Override // com.ss.android.ugc.aweme.foundation.fragment.BaseEntryFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1716470ulh.LIZ(this.LLIZLLLIL, "fp_sdk_entry_loading_show", C2097608Jq.LJIIL(C2097608Jq.LJIIZILJ(C2097608Jq.LJIIJ(new Pair(Scene.SCENE_SERVICE, this.LLIZLLLIL), new Pair("source_id", this.LLIZ))), VR()));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    @Override // com.ss.android.ugc.aweme.foundation.fragment.BaseEntryFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        a.LIZLLL(layoutInflater.getContext());
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
