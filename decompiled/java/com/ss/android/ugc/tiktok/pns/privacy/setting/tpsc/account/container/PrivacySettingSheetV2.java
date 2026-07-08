package com.ss.android.ugc.tiktok.pns.privacy.setting.tpsc.account.container;

import X.AbstractC191832103a;
import X.C01GW;
import X.C098200Yq;
import X.C0C76;
import X.C0OM1;
import X.C103A;
import X.C103L;
import X.C103N;
import X.C103R;
import X.C104A;
import X.C106V;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C1848530yCh;
import X.C189200o6;
import X.C1913480ztS;
import X.C191834103c;
import X.C191848103q;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.EnumC1848020yBs;
import X.InterfaceC344240DeY;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.api.IDebugConfig;
import com.ss.android.ugc.tiktok.tpsc.core.render.TPSCRenderManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS13S1500000_28;
import kotlin.jvm.internal.AwS143S1200000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class PrivacySettingSheetV2 extends Fragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjElIjs8I2s8Jzx9ODclPy4wMWs/LDsnISsrHELIOSZzsjOyZiKCwwJzAiPWEwJys4KCY9LTdiGT06PiQvMBw2PDElJygAICApPRlh";
    public RecyclerView LL;
    public C103L LLILLJJLI;
    public C103R LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 649));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 650));

    public final RecyclerView MR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ms4) : null;
            this.LL = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C103N c103n;
        C103L c103l = this.LLILLJJLI;
        CharSequence charSequenceLIZ = (c103l == null || (c103n = c103l.LIZIZ) == null) ? null : c103n.LIZ(requireContext());
        C0OM1 c0om1 = new C0OM1();
        if (charSequenceLIZ != null) {
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = charSequenceLIZ;
            c0om1.LIZJ = c1250250idj;
        }
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS572S0100000_28(this, 648));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C103R c103r = this.LLILLL;
        if (c103r != null) {
            c103r.LIZ();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        C103R c103r = this.LLILLL;
        if (c103r != null) {
            c103r.onPagePause();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        C103R c103r = this.LLILLL;
        if (c103r != null) {
            c103r.LJFF();
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C103R c103r = this.LLILLL;
        if (c103r != null) {
            c103r.LLFF();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C103R c103r = this.LLILLL;
        if (c103r != null) {
            c103r.LIZJ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("page_tag")) != null) {
            TPSCRenderManager.LIZ.getClass();
            this.LLILLJJLI = TPSCRenderManager.LJ(string);
            AwS429S0200000_28 awS429S0200000_28 = new AwS429S0200000_28(this, bundle, 65);
            if (this.LLILLJJLI == null) {
                C1913480ztS.LIZ("pns_tpsc_configurable_exception", C2097608Jq.LJIIIIZZ(new Pair("type", "config_not_found"), new Pair("page_tag", string)), null, 12);
                C19EG activity = getActivity();
                if (activity != null) {
                    DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(activity);
                    C786410Ut5.J4(dialogC1389620mGW);
                    C103A.LIZJ(string, "fallback", new AwS13S1500000_28(dialogC1389620mGW, this, string, activity, awS429S0200000_28, bundle, 1), new AwS143S1200000_28(dialogC1389620mGW, string, activity, 4));
                    return;
                }
                return;
            }
            awS429S0200000_28.invoke();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C103R c103r = this.LLILLL;
        if (c103r != null) {
            c103r.onSaveInstanceState(bundle);
        }
    }

    public final void NR(View view, Bundle bundle) {
        C103L c103l = this.LLILLJJLI;
        if (c103l != null) {
            MR().setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
            MR().setItemAnimator(null);
            RecyclerView recyclerViewMR = MR();
            C106V.LIZ.getClass();
            TPSCRenderManager tPSCRenderManagerLIZJ = C106V.LIZJ();
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(requireContext(), R.style.abs);
            ViewModelStoreOwner activity = getActivity();
            if (activity == null) {
                activity = this;
            }
            C191848103q c191848103q = new C191848103q(contextThemeWrapper, activity, this, c103l.LIZ, getArguments(), null, null, 224);
            List<? extends C104A> list = c103l.LJ;
            tPSCRenderManagerLIZJ.getClass();
            C191834103c c191834103cLIZJ = TPSCRenderManager.LIZJ(c191848103q, list);
            ((ArrayList) c191834103cLIZJ.LLILZIL).add(new AbstractC191832103a() { // from class: X.103T
                @Override // X.AbstractC191832103a
                public final void LIZIZ(List<AbstractC191840103i> list2) {
                    ((ArrayList) list2).add(new AnonymousClass1042(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
                }
            });
            recyclerViewMR.setAdapter(c191834103cLIZJ);
            C103R c103r = this.LLILLL;
            if (c103r != null) {
                c103r.LJI(view);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("page_tag")) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("page_pns_tpsc_");
            sbLIZ.append(string);
            C1848530yCh.LIZJ(this, C2188811AlT.LIZIZ(sbLIZ), EnumC1848020yBs.SUBPAGE, null);
        }
        NR(view, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        View viewTd;
        String str;
        IDebugConfig iDebugConfigLIZ = C0C76.LIZ();
        boolean z2 = true;
        if (iDebugConfigLIZ != null && iDebugConfigLIZ.isOpen()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.bep, viewGroup, false);
            TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.run);
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TPSC2 SDK (");
            C103L c103l = this.LLILLJJLI;
            if (c103l == null || c103l.LIZJ != 1) {
                z2 = false;
            }
            if (z2) {
                str = "Server";
            } else {
                str = "Local";
            }
            sbLIZ.append(str);
            sbLIZ.append(')');
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.beo, viewGroup, false);
        }
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
