package com.ss.android.ugc.aweme.compliance.privacy.phl;

import X.AbstractC21673619ry;
import X.C01GW;
import X.C098200Yq;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C21578619ce;
import X.C2344009Gk;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1809520xBm;
import X.InterfaceC446950Hfp;
import Y.ACListenerS141S0100000_6;
import Y.AObserverS210S0100000_6;
import Y.ARunnableS106S0100000_6;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.tiktok.privacy.api.phl.model.PrivacyHighlightsForTeensVideo;
import com.ss.android.ugc.tiktok.privacy.api.phl.vm.PhlViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class PhlFragment extends BaseFragment implements InterfaceC446950Hfp {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/HELIOSISQiKip9ODclPy4wMWs8ISN9GC0gDz0yLygpJzs=";
    public C1749280vcc LLIZ;
    public TuxIconView LLIZLLLIL;
    public View LLJ;
    public TextView LLJI;
    public TuxTextView LLJIJIL;
    public TuxTextView LLJILJIL;
    public C21578619ce LLJILJILJ;
    public RecyclerView LLJILLL;
    public View LLJJ;
    public C197039127h LLJJI;
    public Function0<Unit> LLJJIJIIJIL;
    public ARunnableS106S0100000_6 LLJJJIL;
    public long LLJJJJ;
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS550S0100000_6(this, 62));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 61));
    public String LLJJIJIL = "";
    public final C01GW LLJJJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(40));

    public final PhlViewModel SR() {
        return (PhlViewModel) this.LLJJIII.getValue();
    }

    public final boolean UR() {
        return Intrinsics.LJFF(this.LLJJIJIL, "new_user_journey") || Intrinsics.LJFF(this.LLJJIJIL, "account_privacy_page");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ((Handler) this.LLJJJ.getValue()).removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((Handler) this.LLJJJ.getValue()).removeCallbacksAndMessages(null);
        ARunnableS106S0100000_6 aRunnableS106S0100000_6 = new ARunnableS106S0100000_6(this, 43);
        this.LLJJJIL = aRunnableS106S0100000_6;
        C786410Ut5.LJLIIL(1000L, (Handler) this.LLJJJ.getValue(), aRunnableS106S0100000_6);
    }

    @Override // X.InterfaceC446950Hfp
    public final void Oc(Function0<Unit> function0) {
        this.LLJJIJIIJIL = function0;
    }

    public final void VR(String str) {
        Integer numValueOf;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLJJIJIL);
        List<PrivacyHighlightsForTeensVideo> value = SR().LLILZ.getValue();
        if (value != null) {
            numValueOf = Integer.valueOf(value.size());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "video_cnt");
        c2344009Gk.LJIIIIZZ("exit_method", str);
        c2344009Gk.LIZLLL(this.LLJJJJ, "staytime");
        C20684815ws.LJIILLIIL("exit_privacy_highlights_teens_page", c2344009Gk.LIZ);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Object obj;
        super.onCreate(bundle);
        NR(AFwS236S0000000_6.get$arr$(55));
        Bundle arguments = getArguments();
        if (arguments != null) {
            try {
                obj = arguments.get("enter_from");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                obj = null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                obj = null;
            }
        } else {
            obj = null;
        }
        this.LLJJIJIL = (String) obj;
        ((Handler) this.LLJJJ.getValue()).removeCallbacksAndMessages(null);
        ARunnableS106S0100000_6 aRunnableS106S0100000_6 = new ARunnableS106S0100000_6(this, 43);
        this.LLJJJIL = aRunnableS106S0100000_6;
        C786410Ut5.LJLIIL(1000L, (Handler) this.LLJJJ.getValue(), aRunnableS106S0100000_6);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLIZ = (C1749280vcc) view.findViewById(R.id.qa5);
        if (Intrinsics.LJFF(this.LLJJIJIL, "new_user_journey")) {
            C1749280vcc c1749280vcc = this.LLIZ;
            if (c1749280vcc != null) {
                C786410Ut5.LLLZLZ(c1749280vcc, 8);
            }
        } else {
            C1749280vcc c1749280vcc2 = this.LLIZ;
            if (c1749280vcc2 != null) {
                C786410Ut5.LLLZLZ(c1749280vcc2, 0);
            }
            C1749280vcc c1749280vcc3 = this.LLIZ;
            if (c1749280vcc3 != null) {
                c1749280vcc3.LJ();
            }
            SR().LLILZLL.observe(getViewLifecycleOwner(), new AObserverS210S0100000_6(this, 23));
        }
        this.LLIZLLLIL = (TuxIconView) view.findViewById(R.id.qa1);
        C197039127h c197039127h = null;
        if (UR()) {
            TuxIconView tuxIconView = this.LLIZLLLIL;
            if (tuxIconView == null) {
                tuxIconView = null;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        } else {
            TuxIconView tuxIconView2 = this.LLIZLLLIL;
            if (tuxIconView2 == null) {
                tuxIconView2 = null;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
            TuxIconView tuxIconView3 = this.LLIZLLLIL;
            if (tuxIconView3 == null) {
                tuxIconView3 = null;
            }
            C786410Ut5.a9(tuxIconView3, new ACListenerS141S0100000_6(this, 19));
        }
        this.LLJ = view.findViewById(R.id.qa6);
        this.LLJI = (TextView) view.findViewById(R.id.qa8);
        this.LLJIJIL = (TuxTextView) view.findViewById(R.id.qa9);
        if (UR()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LLJIJIL.getLayoutParams();
            marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
            marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
            C786410Ut5.R6(this.LLJIJIL, marginLayoutParams);
            this.LLJIJIL.setTextSize(1, 36.0f);
        }
        this.LLJILJIL = (TuxTextView) view.findViewById(R.id.qa7);
        if (UR()) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.LLJILJIL.getLayoutParams();
            marginLayoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
            marginLayoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
            marginLayoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            C786410Ut5.R6(this.LLJILJIL, marginLayoutParams2);
        }
        C21578619ce c21578619ce = (C21578619ce) view.findViewById(R.id.qa4);
        this.LLJILJILJ = c21578619ce;
        c21578619ce.setOnScrollChangeListener(new InterfaceC1809520xBm() { // from class: X.0H5F
            @Override // X.InterfaceC1809520xBm
            public final void LIZ(C21578619ce c21578619ce2, int i, int i2, int i3, int i4) {
                if (i2 > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90))) {
                    View view2 = this.LIZ.LLJ;
                    if (view2 != null) {
                        C786410Ut5.LJLLLLLL(0, view2);
                    }
                    TextView textView = this.LIZ.LLJI;
                    if (textView != null) {
                        C786410Ut5.LLIL(textView, 0);
                        return;
                    }
                    return;
                }
                View view3 = this.LIZ.LLJ;
                if (view3 != null) {
                    C786410Ut5.LJLLLLLL(4, view3);
                }
                TextView textView2 = this.LIZ.LLJI;
                if (textView2 == null) {
                    return;
                }
                C786410Ut5.LLIL(textView2, 4);
            }
        });
        SR().LLILLJJLI.observe(getViewLifecycleOwner(), new Observer() { // from class: X.0H4H
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                Number numberValueOf;
                String str = (String) obj;
                if (Intrinsics.LJFF(this.LL.LLJJIJIL, "new_user_journey")) {
                    numberValueOf = 46;
                } else {
                    numberValueOf = Double.valueOf(37.5d);
                }
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numberValueOf));
                TuxTextView tuxTextView = this.LL.LLJIJIL;
                if (tuxTextView != null) {
                    SpannableString spannableString = new SpannableString(str);
                    C786410Ut5.p2(spannableString, new C434230H0z(iLIZIZ), 0, spannableString.length(), 33);
                    tuxTextView.setText(spannableString);
                }
                TextView textView = this.LL.LLJI;
                if (textView != null) {
                    textView.setText(str);
                }
            }
        });
        SR().LLILLL.observe(getViewLifecycleOwner(), new AObserverS210S0100000_6(this, 24));
        this.LLJILLL = (RecyclerView) view.findViewById(R.id.qa3);
        if (UR()) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.LLJILLL.getLayoutParams();
            marginLayoutParams3.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
            marginLayoutParams3.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
            C786410Ut5.p6(this.LLJILLL, marginLayoutParams3);
        }
        this.LLJILLL.setLayoutManager(new LinearLayoutManager(getContext()));
        this.LLJILLL.setAdapter((AbstractC21673619ry) this.LLJJIJI.getValue());
        SR().LLILZ.observe(getViewLifecycleOwner(), new AObserverS210S0100000_6(this, 25));
        this.LLJJ = view.findViewById(R.id.qa2);
        this.LLJJI = (C197039127h) view.findViewById(R.id.q_s);
        if (UR()) {
            View view2 = this.LLJJ;
            if (view2 == null) {
                view2 = null;
            }
            C786410Ut5.LJLLLLLL(0, view2);
            C197039127h c197039127h2 = this.LLJJI;
            if (c197039127h2 == null) {
                c197039127h2 = null;
            }
            C786410Ut5.LLLLLLJ(c197039127h2, 0);
            C197039127h c197039127h3 = this.LLJJI;
            if (c197039127h3 == null) {
                c197039127h3 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) c197039127h3.getLayoutParams();
            marginLayoutParams4.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
            marginLayoutParams4.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
            C197039127h c197039127h4 = this.LLJJI;
            if (c197039127h4 == null) {
                c197039127h4 = null;
            }
            C786410Ut5.J6(c197039127h4, marginLayoutParams4);
            C197039127h c197039127h5 = this.LLJJI;
            if (c197039127h5 != null) {
                c197039127h = c197039127h5;
            }
            C786410Ut5.U8(c197039127h, new ACListenerS141S0100000_6(this, 20));
            SR().LLILZIL.observe(getViewLifecycleOwner(), new AObserverS210S0100000_6(this, 22));
            return;
        }
        View view3 = this.LLJJ;
        if (view3 == null) {
            view3 = null;
        }
        C786410Ut5.LJLLLLLL(8, view3);
        C197039127h c197039127h6 = this.LLJJI;
        if (c197039127h6 != null) {
            c197039127h = c197039127h6;
        }
        C786410Ut5.LLLLLLJ(c197039127h, 8);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bcw, viewGroup, false);
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
