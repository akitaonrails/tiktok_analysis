package com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.ui;

import X.C01GW;
import X.C106V;
import X.C10B4;
import X.C10B8;
import X.C10BA;
import X.C10BB;
import X.C10BD;
import X.C10BE;
import X.C10KE;
import X.C1163504gr;
import X.C1207604ny;
import X.C1389890mGx;
import X.C1841350y17;
import X.C191880104w;
import X.C191969108h;
import X.C197039127h;
import X.C19EG;
import X.C444940Hca;
import X.C452501pT;
import X.C632200Oqw;
import Y.AObserverS230S0100000_28;
import android.content.Context;
import android.os.Bundle;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.viewmodel.PaPromptViewModel;
import com.ss.android.ugc.tiktok.pns.ui.BaseFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class PaPromptFragment extends BaseFragment implements C10B8 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjElIjs8I2s8Jzx9ODclPy4wMWHELIOSs/LDsnISsrZz8yODcjJD8nZjAlZx8yGDcjJD8nDjctLiI2JjE=";
    public TuxTextView LL;
    public C1841350y17 LLILLJJLI;
    public C1841350y17 LLILLL;
    public TuxTextView LLILZ;
    public C197039127h LLILZIL;
    public C197039127h LLILZLL;
    public C197039127h LLIZ;
    public TuxTextView LLIZLLLIL;
    public ConstraintLayout LLJ;
    public ConstraintLayout LLJI;
    public boolean LLJJ;
    public long LLJJI;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 634));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 632));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 633));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 629));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS572S0100000_28(this, 631));

    @Override // com.ss.android.ugc.tiktok.pns.ui.BaseFragment
    public final int MR() {
        return R.layout.be5;
    }

    @Override // X.C10B8
    public final boolean onBackPressed() {
        return true;
    }

    public final TuxTextView NR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.jok) : null;
            this.LLIZLLLIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C197039127h OR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.p8o) : null;
            this.LLILZIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final int PR() {
        return ((Number) this.LLJILJIL.getValue()).intValue();
    }

    public final int RR() {
        return ((Number) this.LLJILJILJ.getValue()).intValue();
    }

    public final C197039127h SR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.rv1) : null;
            this.LLILZLL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C1841350y17 UR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.rvf) : null;
            this.LLILLL = (C1841350y17) viewFindViewById;
        }
        return (C1841350y17) viewFindViewById;
    }

    public final C197039127h VR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sec) : null;
            this.LLIZ = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C1841350y17 WR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sfn) : null;
            this.LLILLJJLI = (C1841350y17) viewFindViewById;
        }
        return (C1841350y17) viewFindViewById;
    }

    public final TuxTextView aS() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.title) : null;
            this.LL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final PaPromptViewModel bS() {
        return (PaPromptViewModel) this.LLJIJIL.getValue();
    }

    public final void hS() {
        C1163504gr c1163504gr = C1163504gr.LIZIZ;
        C191969108h c191969108h = new C191969108h();
        c191969108h.LIZLLL("action_type", "click");
        c191969108h.LIZLLL("enter_from", "account_privacy_page");
        c191969108h.LIZLLL("click_type", bS().LL.getValue() == C10B4.PUBLIC ? "public" : "private");
        c191969108h.LIZ(RR() > 0 ? 1 : 0, "is_later_show");
        c191969108h.LIZLLL("enter_position", (String) this.LLJILLL.getValue());
        c191969108h.LIZIZ(System.currentTimeMillis() - this.LLJJI, "stay_time");
        c1163504gr.onEventV3("account_privacy_manage_page", c191969108h.LIZ);
        bS().xQ2(new C10BD(this), new C10BA(this));
    }

    public final void iS() {
        C1163504gr c1163504gr = C1163504gr.LIZIZ;
        C191969108h c191969108h = new C191969108h();
        c191969108h.LIZLLL("action_type", "click");
        c191969108h.LIZLLL("enter_from", "account_privacy_page");
        c191969108h.LIZLLL("click_type", "remind_me_later");
        c191969108h.LIZ(RR() > 0 ? 1 : 0, "is_later_show");
        c191969108h.LIZLLL("enter_position", (String) this.LLJILLL.getValue());
        c191969108h.LIZIZ(System.currentTimeMillis() - this.LLJJI, "stay_time");
        c1163504gr.onEventV3("account_privacy_manage_page", c191969108h.LIZ);
        bS().LL.setValue(C10B4.REMIND_LATER);
        bS().xQ2(new C10BE(this), new C10BB(this));
    }

    public final void cS() {
        TextView textView;
        TextView textView2;
        if (PR() == 9) {
            View view = getView();
            if (view != null && (textView2 = (TextView) view.findViewById(R.id.see)) != null) {
                textView2.setText(getString(2131822798));
            }
            View view2 = getView();
            if (view2 == null || (textView = (TextView) view2.findViewById(R.id.rv4)) == null) {
                return;
            }
            textView.setText(getString(2131822797));
        }
    }

    public final void gS() {
        PaPromptProcessFragment paPromptProcessFragment;
        Fragment parentFragment = getParentFragment();
        if ((parentFragment instanceof PaPromptProcessFragment) && (paPromptProcessFragment = (PaPromptProcessFragment) parentFragment) != null) {
            paPromptProcessFragment.OR();
        }
        if (RR() >= 2) {
            bS().vQ2();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LLJJI = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Spanned ZR(int i) {
        Context context = getContext();
        if (context != null) {
            String string = getString(i);
            C444940Hca c444940Hca = new C444940Hca();
            c444940Hca.LIZJ = getString(2131845545);
            c444940Hca.LJIIIIZZ = new AwS572S0100000_28(this, 630);
            c444940Hca.LIZLLL(1);
            c444940Hca.LIZIZ = false;
            c444940Hca.LIZIZ(62);
            return C10KE.LIZIZ(string, c444940Hca.LIZ(context));
        }
        return null;
    }

    public final void dS(Throwable th) {
        String string;
        PaPromptProcessFragment paPromptProcessFragment;
        if (th instanceof C632200Oqw) {
            string = ((C632200Oqw) th).getErrorMsg();
        } else {
            string = "";
        }
        if (string.length() == 0) {
            string = getString(2131848736);
        }
        C19EG activity = getActivity();
        if (activity != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LJIIJJI();
        }
        if (C1207604ny.LIZ()) {
            C106V.LIZ.getClass();
            C191880104w.LJFF(C106V.LIZIZ(), "pa_prompt_page");
        } else {
            C106V.LIZ.getClass();
            C106V.LIZIZ().getClass();
            C191880104w.LIZIZ("pa_prompt_page", null);
            C106V.LIZIZ().getClass();
            C191880104w.LIZLLL("pa_prompt_page", null, true);
        }
        Fragment parentFragment = getParentFragment();
        if ((parentFragment instanceof PaPromptProcessFragment) && (paPromptProcessFragment = (PaPromptProcessFragment) parentFragment) != null) {
            paPromptProcessFragment.OR();
        }
    }

    @Override // com.ss.android.ugc.tiktok.pns.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bS().LL.observe(this, new AObserverS230S0100000_28(this, 100));
        bS().LLILLJJLI.observe(this, new AObserverS230S0100000_28(this, 101));
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x01e4  */
    @Override // com.ss.android.ugc.tiktok.pns.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.ui.PaPromptFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void kS(android.content.Context r10, kotlin.jvm.functions.Function0<kotlin.Unit> r11, X.C10B4 r12) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.ui.PaPromptFragment.kS(android.content.Context, kotlin.jvm.functions.Function0, X.10B4):void");
    }
}
