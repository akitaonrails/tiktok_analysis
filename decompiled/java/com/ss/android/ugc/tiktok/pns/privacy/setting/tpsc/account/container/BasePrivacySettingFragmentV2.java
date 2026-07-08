package com.ss.android.ugc.tiktok.pns.privacy.setting.tpsc.account.container;

import X.AbstractC191832103a;
import X.AbstractC191843103l;
import X.C01GW;
import X.C098200Yq;
import X.C0C76;
import X.C0FNV;
import X.C103A;
import X.C103L;
import X.C103R;
import X.C103W;
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
import X.C191880104w;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.InterfaceC836760Ws6;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.api.IDebugConfig;
import com.ss.android.ugc.tiktok.pns.ui.BaseFragment;
import com.ss.android.ugc.tiktok.tpsc.core.render.TPSCRenderManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS13S1500000_28;
import kotlin.jvm.internal.AwS143S1200000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
@InterfaceC836760Ws6
public class BasePrivacySettingFragmentV2 extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjElIjs8I2s8Jzx9ODclPy4wMWs/LDsnISsrZzsjOyHELIOSZiKCwwJzAiPWEwJys4KCY9LTdiCy4gLRU+IDkyKzwfLDsnISsrDz0yLygpJzsFeg==";
    public TuxNavBar LL;
    public RecyclerView LLILLJJLI;
    public View LLILLL;
    public TuxTextView LLILZ;
    public C103L LLILZIL;
    public C191834103c LLILZLL;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 642));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 643));
    public C103R LLJ;

    public void NR() {
        C106V.LIZ.getClass();
        C191880104w c191880104wLIZIZ = C106V.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enter_");
        Bundle arguments = getArguments();
        sbLIZ.append(arguments != null ? arguments.getString("page_tag") : null);
        sbLIZ.append("_page");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c191880104wLIZIZ.getClass();
        C191880104w.LIZLLL(strLIZIZ, null, false);
    }

    public final RecyclerView PR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ms4) : null;
            this.LLILLJJLI = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    public final TuxNavBar RR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.y1z) : null;
            this.LL = (TuxNavBar) viewFindViewById;
        }
        return (TuxNavBar) viewFindViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C103R c103r = this.LLJ;
        if (c103r != null) {
            c103r.LIZ();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        C103R c103r = this.LLJ;
        if (c103r != null) {
            c103r.onPagePause();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        C103R c103r = this.LLJ;
        if (c103r != null) {
            c103r.LJFF();
        }
        super.onStop();
    }

    @Override // com.ss.android.ugc.tiktok.pns.ui.BaseFragment, X.InterfaceC21503819Do
    public final void tv() {
        C103R c103r = this.LLJ;
        if (c103r != null) {
            c103r.LIZIZ(getActivity());
        }
        finish();
    }

    public BasePrivacySettingFragmentV2() {
        C106V.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.tiktok.pns.ui.BaseFragment
    public final int MR() {
        IDebugConfig iDebugConfigLIZ = C0C76.LIZ();
        return (iDebugConfigLIZ == null || !iDebugConfigLIZ.isOpen()) ? R.layout.bek : R.layout.bel;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C103R c103r = this.LLJ;
        if (c103r != null) {
            c103r.LLFF();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C103R c103r = this.LLJ;
        if (c103r != null) {
            c103r.LIZJ();
        }
    }

    @Override // com.ss.android.ugc.tiktok.pns.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("page_tag")) != null) {
            NR();
            TPSCRenderManager.LIZ.getClass();
            this.LLILZIL = TPSCRenderManager.LJ(string);
            AwS429S0200000_28 awS429S0200000_28 = new AwS429S0200000_28(this, bundle, 64);
            if (this.LLILZIL == null) {
                C1913480ztS.LIZ("pns_tpsc_configurable_exception", C2097608Jq.LJIIIIZZ(new Pair("type", "config_not_found"), new Pair("page_tag", string)), null, 12);
                C19EG activity = getActivity();
                if (activity != null) {
                    DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(activity);
                    C0FNV.LIZJ(dialogC1389620mGW);
                    OR(string, new AwS13S1500000_28(dialogC1389620mGW, this, string, activity, awS429S0200000_28, bundle, 0), new AwS143S1200000_28(dialogC1389620mGW, string, activity, 3));
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
        C103R c103r = this.LLJ;
        if (c103r != null) {
            c103r.onSaveInstanceState(bundle);
        }
    }

    public final void SR(View view, Bundle bundle) {
        Object obj;
        List<AbstractC191843103l> list;
        C103R c103r;
        C103L c103l = this.LLILZIL;
        if (c103l != null) {
            TuxNavBar tuxNavBarRR = RR();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
            c1251150ifB.LJIIIIZZ = getString(2131823332);
            c1251150ifB.LIZJ(new AwS572S0100000_28(this, 644));
            tuxNavBarRR.LIZIZ(c1251150ifB);
            PR().setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
            PR().setItemAnimator(null);
            C106V.LIZ.getClass();
            TPSCRenderManager tPSCRenderManagerLIZJ = C106V.LIZJ();
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(requireContext(), R.style.abl);
            ViewModelStoreOwner activity = getActivity();
            if (activity == null) {
                activity = this;
            }
            C191848103q c191848103q = new C191848103q(contextThemeWrapper, activity, this, c103l.LIZ, getArguments(), null, null, 224);
            List<? extends C104A> list2 = c103l.LJ;
            tPSCRenderManagerLIZJ.getClass();
            C191834103c c191834103cLIZJ = TPSCRenderManager.LIZJ(c191848103q, list2);
            Map<String, ? extends Object> map = c103l.LJFF;
            if (map != null) {
                obj = map.get("top_bubble_hint");
            } else {
                obj = null;
            }
            if ((obj instanceof C103W) && obj != null) {
                throw null;
            }
            final AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(this, 645);
            final AwS607S0100000_28 awS607S0100000_28 = new AwS607S0100000_28(this, 169);
            ((ArrayList) c191834103cLIZJ.LLILZIL).add(new AbstractC191832103a(awS572S0100000_28, awS607S0100000_28) { // from class: X.103U
                public final Function0<Boolean> LIZ;
                public final Function1<List<? extends AbstractC191843103l>, Unit> LIZIZ;

                @Override // X.AbstractC191832103a
                public final void LIZ(List<? extends AbstractC191843103l> list3) {
                    this.LIZIZ.invoke(list3);
                }

                @Override // X.AbstractC191832103a
                public final void LIZIZ(List<AbstractC191840103i> list3) {
                    ArrayList<Object> arrayList = (ArrayList) list3;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (!this.LIZ.invoke().booleanValue() && !(C13LP.LJJJJZI(list3) instanceof C191857103z)) {
                        arrayList2.add(new AnonymousClass1042(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
                    }
                    Object obj2 = null;
                    for (Object obj3 : arrayList) {
                        if (obj2 != null) {
                            if (obj3 instanceof C191857103z) {
                                arrayList2.add(new AnonymousClass1042(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))));
                            } else if ((obj3 instanceof InterfaceC191854103w) && ((InterfaceC191854103w) obj3).x0() && !(obj2 instanceof C191857103z)) {
                                arrayList2.add(new AnonymousClass1042(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))));
                            }
                        }
                        arrayList2.add(obj3);
                        obj2 = obj3;
                    }
                    arrayList2.add(new AnonymousClass1042(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
                    arrayList.clear();
                    arrayList.addAll(arrayList2);
                }

                {
                    this.LIZ = awS572S0100000_28;
                    this.LIZIZ = awS607S0100000_28;
                }
            });
            c191834103cLIZJ.LJJIJIIJIL();
            this.LLILZLL = c191834103cLIZJ;
            PR().setAdapter(this.LLILZLL);
            String string = c103l.LIZIZ.LIZ(requireContext()).toString();
            TuxNavBar tuxNavBarRR2 = RR();
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = string;
            tuxNavBarRR2.LJIJJ(c1250250idj);
            C103R c103r2 = this.LLJ;
            if (c103r2 != null) {
                c103r2.LJI(view);
            }
            C191834103c c191834103c = this.LLILZLL;
            if (c191834103c != null && (list = c191834103c.LLILLJJLI) != null && (c103r = this.LLJ) != null) {
                c103r.LJ(list);
            }
        }
    }

    @Override // com.ss.android.ugc.tiktok.pns.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        RR().LJIIZILJ(false);
        RR().setNavBackground(0);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("page_tag")) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("page_pns_tpsc_");
            sbLIZ.append(string);
            C1848530yCh.LIZLLL(this, C2188811AlT.LIZIZ(sbLIZ), null);
        }
        SR(view, bundle);
    }

    public void OR(String str, Function0<Unit> function0, Function0<Unit> function02) {
        C103A.LIZJ(str, "fallback", function0, function02);
    }

    @Override // com.ss.android.ugc.tiktok.pns.ui.BaseFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        TuxTextView tuxTextView;
        String str;
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        IDebugConfig iDebugConfigLIZ = C0C76.LIZ();
        boolean z2 = true;
        if (iDebugConfigLIZ != null && iDebugConfigLIZ.isOpen()) {
            z = true;
        } else {
            z = false;
        }
        C19GS c19gs = null;
        if (z) {
            if (viewOnCreateView != null) {
                tuxTextView = (TuxTextView) viewOnCreateView.findViewById(R.id.run);
            } else {
                tuxTextView = null;
            }
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TPSC2 SDK (");
                C103L c103l = this.LLILZIL;
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
            }
        }
        if (!(viewOnCreateView instanceof View)) {
            viewOnCreateView = null;
        }
        if (viewOnCreateView != null) {
            try {
                ViewTreeLifecycleOwner.set(viewOnCreateView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewOnCreateView, this);
                viewOnCreateView.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewOnCreateView;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewOnCreateView;
    }
}
