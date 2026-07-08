package com.ss.android.ugc.aweme.setting.ui.beta;

import X.C09S2;
import X.C0OM1;
import X.C1251150ifB;
import X.C12ES;
import X.C1308910kAL;
import X.C1390410mHn;
import X.C197039127h;
import X.C19EG;
import X.C20588115hH;
import X.C20684815ws;
import X.C2344009Gk;
import X.C431260Gvc;
import X.C444940Hca;
import X.C786410Ut5;
import X.EnumC1913590ztd;
import X.InterfaceC2661011f;
import X.InterfaceC747470TTt;
import X.InterfaceC836760Ws6;
import Y.ACListenerS23S0500000_12;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.setting.experiment.BetaAppExperiment;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.ss.android.ugc.aweme.setting.ui.beta.BetaEmailRegisterPage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes13.dex */
@InterfaceC836760Ws6
public final class BetaEmailRegisterPage extends BasePage {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpPTs6JiHELIOSJiPCZ9KiA4KGERLTEtDCIyISkeLCg6OzEpOx8yLyA=";
    public final Regex LLJ = new Regex("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    public final InterfaceC747470TTt LLJI;

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int UR() {
        return R.layout.f60;
    }

    public BetaEmailRegisterPage() {
        InterfaceC2661011f interfaceC2661011fLIZ = C09S2.LIZLLL().LIZ(Api.LIZ);
        this.LLJI = (InterfaceC747470TTt) (interfaceC2661011fLIZ != null ? interfaceC2661011fLIZ.create(InterfaceC747470TTt.class) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        CharSequence charSequenceLIZJ;
        String string;
        super.onViewCreated(view, bundle);
        C1390410mHn c1390410mHn = (C1390410mHn) view.findViewById(R.id.nl1);
        TextView textView = (TextView) view.findViewById(R.id.xyz);
        textView.setMovementMethod(C431260Gvc.LIZ);
        C444940Hca c444940Hca = new C444940Hca();
        c444940Hca.LIZJ = getString(2131827346);
        c444940Hca.LIZIZ = false;
        c444940Hca.LIZIZ(62);
        c444940Hca.LIZLLL(1);
        c444940Hca.LJIIIIZZ = new AwS556S0100000_12(this, 596);
        CharSequence charSequenceLIZ = c444940Hca.LIZ(requireActivity());
        C19EG activity = getActivity();
        if (activity != null) {
            charSequenceLIZJ = C20588115hH.LIZJ(activity, 2131827342, charSequenceLIZ);
        } else {
            charSequenceLIZJ = null;
        }
        textView.setText(charSequenceLIZJ);
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.y08);
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS556S0100000_12(this, 595));
        c0om1.LJ(c1251150ifB);
        c0om1.LIZJ(0);
        tuxNavBar.setNavActions(c0om1);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.whe);
        final EditText editText = (EditText) view.findViewById(R.id.hcz);
        final View viewFindViewById = view.findViewById(R.id.warn);
        final GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C12ES.LIZJ(4.0f, requireActivity()));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zs, requireActivity());
        if (numLIZJ != null) {
            gradientDrawable.setStroke(1, numLIZJ.intValue());
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.br, requireActivity());
        if (numLIZJ2 != null) {
            gradientDrawable.setColor(numLIZJ2.intValue());
        }
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.0TTQ
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                if (!z) {
                    BetaEmailRegisterPage betaEmailRegisterPage = this.LL;
                    String string2 = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtd4vH0jV94hmuGsvKcFGU90tY/3YvFIkHrtCI0+oMp8nQcwY=", null)).toString();
                    if (!betaEmailRegisterPage.LLJ.matches(string2) || string2.length() == 0) {
                        C786410Ut5.LJLLLLLL(0, viewFindViewById);
                        editText.setBackground(gradientDrawable);
                    }
                }
            }
        });
        C786410Ut5.U8(c197039127h, new ACListenerS23S0500000_12(this, editText, viewFindViewById, gradientDrawable, c1390410mHn, 0));
        C2344009Gk c2344009Gk = new C2344009Gk();
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("enter_from")) == null) {
            string = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", string);
        c2344009Gk.LIZJ(BetaAppExperiment.LJIIIIZZ ? 1 : 0, "has_join_beta");
        C20684815ws.LJIILLIIL("enter_tiktok_beta_gp_email_page", c2344009Gk.LIZ);
        ICompliancePolicyService iCompliancePolicyServiceLJIIIIZZ = ComplianceServiceProvider.LJIIIIZZ();
        if (iCompliancePolicyServiceLJIIIIZZ != null) {
            EnumC1913590ztd.SETTINGS_BETA_EMAIL_REGISTER_PAGE.getValue();
            iCompliancePolicyServiceLJIIIIZZ.LIZLLL();
        }
    }
}
