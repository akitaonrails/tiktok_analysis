package com.ss.android.ugc.aweme.history;

import X.AbstractC1024610cln;
import X.C01GW;
import X.C036E;
import X.C098200Yq;
import X.C1037220d68;
import X.C1390410mHn;
import X.C1685300txQ;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C21520819Kc;
import X.C452501pT;
import X.C786410Ut5;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes17.dex */
public final class AdsActivityHistoryWebTabFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zi0lOjs8OjxiHELIOSCCsgCSY4IDk6PDwEIDwnJzc1HioxHCQuDz0yLygpJzs=";
    public String LL;
    public String LLILLJJLI;
    public C1037220d68 LLILLL;
    public C1390410mHn LLILZ;
    public C1749280vcc LLILZIL;
    public long LLILZLL;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 306));

    public final void NR() {
        C21520819Kc.LIZIZ("no_network_ui", null);
        LJIIL();
        C1037220d68 c1037220d68 = this.LLILLL;
        if (c1037220d68 != null) {
            C786410Ut5.Q0(c1037220d68, 8);
        }
        C1749280vcc c1749280vcc = this.LLILZIL;
        if (c1749280vcc != null) {
            c1749280vcc.setStatus((C1722300uv6) this.LLIZ.getValue());
        }
        C1749280vcc c1749280vcc2 = this.LLILZIL;
        if (c1749280vcc2 != null) {
            C786410Ut5.LLLZLZ(c1749280vcc2, 0);
        }
    }

    public final void LJIIL() {
        C1390410mHn c1390410mHn = this.LLILZ;
        if (c1390410mHn != null && c1390410mHn.LLIZLLLIL) {
            c1390410mHn.LIZLLL();
        }
        C1390410mHn c1390410mHn2 = this.LLILZ;
        if (c1390410mHn2 != null) {
            C786410Ut5.LLLZZIL(c1390410mHn2, 8);
        }
        C1037220d68 c1037220d68 = this.LLILLL;
        if (c1037220d68 != null) {
            C786410Ut5.Q0(c1037220d68, 0);
        }
    }

    public final void MR() {
        String str = this.LLILLJJLI;
        if (str == null || a0.LJJJIL(str)) {
            C21520819Kc.LIZIZ("invalid_url", null);
            return;
        }
        requireContext();
        try {
            if (C036E.LIZ.LIZIZ()) {
                this.LLILZLL = SystemClock.elapsedRealtime();
                C21520819Kc.LIZIZ("load_start", null);
                C21520819Kc.LIZIZ("loading_show", null);
                C1749280vcc c1749280vcc = this.LLILZIL;
                if (c1749280vcc != null) {
                    C786410Ut5.LLLZLZ(c1749280vcc, 8);
                }
                C1390410mHn c1390410mHn = this.LLILZ;
                if (c1390410mHn != null) {
                    C786410Ut5.LLLZZIL(c1390410mHn, 0);
                }
                C1390410mHn c1390410mHn2 = this.LLILZ;
                if (c1390410mHn2 != null) {
                    c1390410mHn2.LIZJ();
                }
                C1037220d68 c1037220d68 = this.LLILLL;
                if (c1037220d68 != null) {
                    C786410Ut5.Q0(c1037220d68, 4);
                }
                C1037220d68 c1037220d682 = this.LLILLL;
                if (c1037220d682 != null) {
                    Uri uri = UriProtector.parse(this.LLILLJJLI);
                    Bundle bundle = new Bundle();
                    C786410Ut5.LJJJI("url", this.LLILLJJLI, bundle);
                    AbstractC1024610cln abstractC1024610cln = new AbstractC1024610cln() { // from class: X.0dX9
                        @Override // X.AbstractC1537870q7d
                        public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("durationMs=");
                            sbLIZ.append(SystemClock.elapsedRealtime() - this.LL.LLILZLL);
                            C21520819Kc.LIZIZ("load_success", C2188811AlT.LIZIZ(sbLIZ));
                            this.LL.LJIIL();
                            C1749280vcc c1749280vcc2 = this.LL.LLILZIL;
                            if (c1749280vcc2 != null) {
                                C786410Ut5.LLLZLZ(c1749280vcc2, 8);
                            }
                        }

                        @Override // X.AbstractC1537870q7d
                        public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str2, String str3) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("durationMs=");
                            sbLIZ.append(SystemClock.elapsedRealtime() - this.LL.LLILZLL);
                            sbLIZ.append(", reason=");
                            sbLIZ.append(str3);
                            C21520819Kc.LIZIZ("load_fail", C2188811AlT.LIZIZ(sbLIZ));
                            this.LL.LJIIL();
                        }
                    };
                    if (Intrinsics.LJFF(c1037220d682.LLILZLL, uri.toString())) {
                        return;
                    }
                    c1037220d682.LLILZLL = uri.toString();
                    c1037220d682.LIZ(uri, bundle, abstractC1024610cln);
                    return;
                }
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C21520819Kc.LIZIZ("offline_block", null);
        NR();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        C1037220d68 c1037220d68 = this.LLILLL;
        if (c1037220d68 != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1037220d68.LL) != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        }
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String string2 = null;
        if (arguments != null) {
            string = arguments.getString("arg_tab_id");
        } else {
            string = null;
        }
        this.LL = string;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            string2 = arguments2.getString("arg_load_url");
        }
        this.LLILLJJLI = string2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLILLL = (C1037220d68) view.findViewById(R.id.aig);
        this.LLILZ = (C1390410mHn) view.findViewById(R.id.aie);
        this.LLILZIL = (C1749280vcc) view.findViewById(R.id.aif);
        C21520819Kc.LIZIZ("view_created", null);
        MR();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.mc, viewGroup, false);
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
