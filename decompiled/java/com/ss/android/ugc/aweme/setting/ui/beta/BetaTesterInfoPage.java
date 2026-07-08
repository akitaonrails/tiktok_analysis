package com.ss.android.ugc.aweme.setting.ui.beta;

import X.AbstractC848400XPy;
import X.C0DRA;
import X.C0OM1;
import X.C0TVI;
import X.C0XQ7;
import X.C1251150ifB;
import X.C12N4;
import X.C1308910kAL;
import X.C14K9;
import X.C19318810i2;
import X.C197039127h;
import X.C20684815ws;
import X.C20694015yM;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C427690Gpr;
import X.C786410Ut5;
import X.C814420VxA;
import X.C844470XAv;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS147S0100000_12;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import com.ss.android.ugc.aweme.setting.experiment.BetaAppExperiment;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.ss.android.ugc.aweme.setting.ui.beta.BetaTesterInfoPage;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
@InterfaceC836760Ws6
public final class BetaTesterInfoPage extends BasePage {
    public static final String LLJIJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpPTs6HELIOSJiJiPCZ9KiA4KGERLTEtHSogPCA+ACE1JxUtLio=";
    public final Keva LLJ = Keva.getRepo("beta_testing");
    public final Map<String, String> LLJI = C2097608Jq.LJIIIIZZ(new Pair("PH", "https://activity.tiktok.com/magic/eco/runtime/release/64f714b80e765003d607ed78?appType=tiktok&magic_page_no=1&use_spark=1"), new Pair("MY", "https://activity.tiktok.com/magic/eco/runtime/release/64f717812600830acc9b2e45?appType=tiktok&magic_page_no=1&use_spark=1"), new Pair("ID", "https://activity.tiktok.com/magic/eco/runtime/release/64f719fa0e765003d607ed86?appType=tiktok&magic_page_no=1&use_spark=1"), new Pair("TH", "https://activity.tiktok.com/magic/eco/runtime/release/64f71b771b7428076200de49?appType=tiktok&magic_page_no=1&use_spark=1"));

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int UR() {
        return R.layout.f5t;
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("feedback_");
        C844470XAv.LIZ.getClass();
        sbLIZ.append(C844470XAv.LJ());
        sbLIZ.append('_');
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        LLJIJIL = C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Window window = requireActivity().getWindow();
        C0DRA.LIZ(window, false);
        window.setStatusBarColor(0);
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        C14K9.LJIJJ(view.findViewById(R.id.view_container), new C0TVI() { // from class: X.0TTl
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                ((FrameLayout.LayoutParams) view2.getLayoutParams()).topMargin = c20246014Ju.LIZ(7).LIZIZ;
                return c20246014Ju;
            }
        });
        ((TuxTextView) view.findViewById(R.id.title)).LJJJJI(32.0f);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(70));
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.jxe);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_tiktok_beta;
        c419910GdJ.LIZIZ = iLIZIZ;
        c419910GdJ.LIZJ = iLIZIZ;
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(view.getContext());
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.e1);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(18));
        tuxIconView.setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(view.getContext())));
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.bw_);
        final C197039127h c197039127h2 = (C197039127h) view.findViewById(R.id.hse);
        int i = 8;
        final float fLIZIZ = C418440Gaw.LIZIZ(8);
        C427690Gpr.LJ(c197039127h2, fLIZIZ);
        C786410Ut5.LLLLLLJ(c197039127h2, 0);
        ZR(c197039127h2, this.LLJ.getBoolean(LLJIJIL, false), fLIZIZ);
        C786410Ut5.U8(c197039127h2, new View.OnClickListener() { // from class: X.0TTk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String string2;
                C0XI4 c0xi4 = new C0XI4("https://feedback.tiktokv.com/falcon/fe_tiktok_common/faq/feedback/");
                c0xi4.LJ("locale", ((ILanguageService) ServiceManager.get().getService(ILanguageService.class)).getAppLanguage());
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(view.getContext(), "aweme://webview/");
                smartRouteBuildRoute.withParam("url", c0xi4.LJFF());
                smartRouteBuildRoute.withParam("hide_nav_bar", "1");
                smartRouteBuildRoute.withParam("container_color_auto_dark", "1");
                smartRouteBuildRoute.open();
                this.LLJ.storeBoolean(BetaTesterInfoPage.LLJIJIL, true);
                this.ZR(c197039127h2, true, fLIZIZ);
                C2344009Gk c2344009Gk = new C2344009Gk();
                Bundle arguments = this.getArguments();
                if (arguments == null || (string2 = arguments.getString("enter_from")) == null) {
                    string2 = "";
                }
                c2344009Gk.LJIIIIZZ("enter_from", string2);
                c2344009Gk.LJIIIIZZ("clicked_content", "share_feedback");
                C20684815ws.LJIILLIIL("tiktok_beta_page_click", c2344009Gk.LIZ);
            }
        });
        C427690Gpr.LJ(c197039127h, fLIZIZ);
        C786410Ut5.U8(c197039127h, new ACListenerS147S0100000_12(this, 273));
        ZR(c197039127h, false, fLIZIZ);
        if (BetaAppExperiment.LJIIIIZZ) {
            i = 0;
        }
        C786410Ut5.LLLLLLJ(c197039127h, i);
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
        tuxNavBar.LJIIZILJ(false);
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS556S0100000_12(this, 599));
        c0om1.LJ(c1251150ifB);
        c0om1.LIZJ(0);
        C1251150ifB c1251150ifB2 = new C1251150ifB();
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZLLL = C1308910kAL.LIZJ(R.attr.a1h, view.getContext());
        c419910GdJ2.LIZ = R.raw.icon_question_mark_circle_ltr;
        c1251150ifB2.LIZLLL();
        c1251150ifB2.LJ = c419910GdJ2;
        c1251150ifB2.LIZLLL = true;
        c1251150ifB2.LIZJ(new AwS556S0100000_12(this, 600));
        c0om1.LIZIZ(c1251150ifB2);
        tuxNavBar.setNavActions(c0om1);
        C19318810i2 c19318810i2 = new C19318810i2((ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.rn0));
        String string2 = getString(2131827351);
        C419910GdJ c419910GdJ3 = new C419910GdJ();
        c419910GdJ3.LIZLLL = C1308910kAL.LIZJ(R.attr.a1p, view.getContext());
        c419910GdJ3.LIZ = R.raw.icon_pen_on_doc_fill;
        c19318810i2.LIZ(new C12N4(new C20694015yM(string2, c419910GdJ3, new ACListenerS147S0100000_12(this, 272), "learn_more", false, false, null, 16777200)));
        c19318810i2.LJ();
        C2344009Gk c2344009Gk = new C2344009Gk();
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("enter_from")) == null) {
            string = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", string);
        C20684815ws.LJIILLIIL("enter_tiktok_beta_page", c2344009Gk.LIZ);
    }

    public final void ZR(C197039127h c197039127h, boolean z, float f) {
        if (z) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.br);
            c384050F3z.LIZJ = Float.valueOf(f);
            c197039127h.setBackground(c384050F3z.LIZ(requireActivity()));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, c197039127h.getContext());
            if (numLIZJ != null) {
                c197039127h.setTextColor(numLIZJ.intValue());
                return;
            }
            return;
        }
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a04);
        c384050F3z2.LIZJ = Float.valueOf(f);
        c197039127h.setBackground(c384050F3z2.LIZ(requireActivity()));
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ee, c197039127h.getContext());
        if (numLIZJ2 == null) {
            return;
        }
        c197039127h.setTextColor(numLIZJ2.intValue());
    }
}
