package com.ss.android.ugc.aweme.social.thought.ui.like;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C0XQ7;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C189200o6;
import X.C197020126o;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C23250099c;
import X.C318970Cet;
import X.C319530Cfn;
import X.C341220DZg;
import X.C452501pT;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS31S0100000_4;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class SocialThoughtLikePanelFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYjKiYyJGs4ISAmLy04HELIOSZzo6ZiklIip9GyovIC4/HC0jPCg7PAklIioDKSspJQkhKSIhLCEn";
    public ViewOnAttachStateChangeListenerC20604515jv LLIZLLLIL;
    public C1749280vcc LLJ;
    public boolean LLJI;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 232));
    public final AsS31S0100000_4 LLJIJIL = new AsS31S0100000_4(this, 3);

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLIZLLLIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.removeOnScrollListener(this.LLJIJIL);
        }
        this.LLIZLLLIL = null;
        this.LLJ = null;
        super.onDestroyView();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        String string3;
        String string4;
        super.onViewCreated(view, bundle);
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.xua);
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LJII = 2131823332;
        c1251150ifB.LIZJ(new AwS548S0100000_4(this, 233));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131850211);
        c0om1.LIZJ = c1250250idj;
        C197020126o c197020126o = new C197020126o();
        c197020126o.LIZ(new AwS548S0100000_4(this, 234));
        c0om1.LIZIZ(c197020126o);
        c0om1.LIZLLL = false;
        tuxNavBar.setNavActions(c0om1);
        this.LLJ = (C1749280vcc) view.findViewById(R.id.xuc);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.xu9);
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext(), 1, false));
        viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(this);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(SocialThoughtLikeCell.class);
        viewOnAttachStateChangeListenerC20604515jv.addOnScrollListener(this.LLJIJIL);
        this.LLIZLLLIL = viewOnAttachStateChangeListenerC20604515jv;
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("thought_id");
        } else {
            string = null;
        }
        String str = "";
        if (string == null) {
            string = "";
        }
        if (!Intrinsics.LJFF(((C319530Cfn) ((SocialThoughtInteractionVM) this.LLIZ.getValue()).LLILLJJLI.getValue()).LIZ, string) && string.length() > 0) {
            ((SocialThoughtInteractionVM) this.LLIZ.getValue()).vQ2(string);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C318970Cet(this, null), 3);
        if (!this.LLJI) {
            this.LLJI = true;
            Bundle arguments2 = getArguments();
            C341220DZg c341220DZg = C341220DZg.LIZ;
            if (arguments2 == null || (string2 = arguments2.getString("thought_id")) == null) {
                string2 = "";
            }
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            if (curUserId == null) {
                curUserId = "";
            }
            long size = ((C319530Cfn) ((SocialThoughtInteractionVM) this.LLIZ.getValue()).LLILLJJLI.getValue()).LIZIZ.size();
            if (arguments2 == null || (string3 = arguments2.getString("enter_from")) == null) {
                string3 = "";
            }
            if (arguments2 != null && (string4 = arguments2.getString("enter_method")) != null) {
                str = string4;
            }
            c341220DZg.getClass();
            C341220DZg.LJIIZILJ("ttsocial_thought_likes_list_panel_show", C2097608Jq.LJIIIIZZ(new Pair("enter_from", string3), new Pair("enter_method", str), new Pair("author_id", curUserId), new Pair("thought_id", string2), new Pair("like_count", Long.valueOf(size))));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ft5, viewGroup, false);
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
