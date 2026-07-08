package com.ss.android.ugc.aweme.setting.ui.beta;

import X.C01GW;
import X.C0DRA;
import X.C0OM1;
import X.C0TVI;
import X.C1251150ifB;
import X.C127K;
import X.C127P;
import X.C127Q;
import X.C14K9;
import X.C1697810uHb;
import X.C20684815ws;
import X.C418440Gaw;
import X.C431260Gvc;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC452301pR;
import X.InterfaceC836760Ws6;
import android.content.Context;
import android.os.Bundle;
import android.text.Spanned;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
@InterfaceC836760Ws6
public final class BetaExplainPage extends BasePage {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpPTHELIOSs6JiJiPCZ9KiA4KGERLTEtDDcjJCQlJx8yLyA=";
    public final C01GW LLJ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS556S0100000_12(this, 598));

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int UR() {
        return R.layout.f5s;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Window window = requireActivity().getWindow();
        C0DRA.LIZ(window, false);
        window.setStatusBarColor(0);
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C14K9.LJIJJ(view.findViewById(R.id.view_container), new C0TVI() { // from class: X.0TTU
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                ((FrameLayout.LayoutParams) view2.getLayoutParams()).topMargin = c20246014Ju.LIZ(7).LIZIZ;
                return c20246014Ju;
            }
        });
        ((TuxTextView) view.findViewById(R.id.title)).LJJJJI(30.0f);
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
        tuxNavBar.LJIIZILJ(false);
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS556S0100000_12(this, 597));
        c0om1.LJ(c1251150ifB);
        c0om1.LIZJ(0);
        tuxNavBar.setNavActions(c0om1);
        Context context = view.getContext();
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.dlh);
        C786410Ut5.LJJJJJL(linearLayout);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        final int i = 0;
        for (Object obj : (List) this.LLJ.getValue()) {
            int i2 = i + 1;
            if (i >= 0) {
                Pair pair = (Pair) obj;
                TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                tuxTextView.setText((CharSequence) pair.getSecond());
                tuxTextView.setPadding(iLIZIZ, 0, iLIZIZ, iLIZIZ);
                if (pair.getSecond() instanceof Spanned) {
                    tuxTextView.setMovementMethod(C431260Gvc.LIZ);
                }
                C127K c127k = new C127K(context, null, 6);
                C786410Ut5.Y6(c127k, new LinearLayout.LayoutParams(-1, -2));
                c127k.setTitle(getString(((Number) pair.getFirst()).intValue()));
                C127P c127p = new C127P(context, tuxTextView, null);
                c127p.LIZLLL = new C127Q() { // from class: X.0TTT
                    @Override // X.C127Q
                    public final void onDismiss() {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LIZJ(i + 1, "clicked_content");
                        C20684815ws.LJIILLIIL("tiktok_beta_FAQ_page_click", c2344009Gk.LIZ);
                    }

                    @Override // X.C127Q
                    public final void onShow() {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LIZJ(i + 1, "clicked_content");
                        C20684815ws.LJIILLIIL("tiktok_beta_FAQ_page_click", c2344009Gk.LIZ);
                    }
                };
                c127k.setAccessory(c127p);
                linearLayout.addView(c127k);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C20684815ws.onEventV3("tiktok_beta_FAQ_page_show");
    }
}
