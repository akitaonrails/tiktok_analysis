package com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.ui;

import X.C01GW;
import X.C0OM1;
import X.C103K;
import X.C10B4;
import X.C10B8;
import X.C10BC;
import X.C10KE;
import X.C1163504gr;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C191880104w;
import X.C191969108h;
import X.C19203810Ay;
import X.C197039127h;
import X.C431260Gvc;
import X.C444940Hca;
import X.C452501pT;
import X.C786410Ut5;
import Y.ACListenerS162S0100000_28;
import Y.AObserverS230S0100000_28;
import android.content.Context;
import android.os.Bundle;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.viewmodel.PaPromptViewModel;
import com.ss.android.ugc.tiktok.pns.ui.BaseFragment;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class PaPromptFragmentForExistingUsers extends BaseFragment implements C10B8 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjElIjs8I2s8Jzx9ODclPy4wMWs/LDsnISsrHELIOSZz8yODcjJD8nZjAlZx8yGDcjJD8nDjctLiI2JjEKJj0WMCw/PSY9LxA/LD0g";
    public TuxTextView LL;
    public TuxNavBar LLILLJJLI;
    public TuxTextView LLILLL;
    public C197039127h LLILZ;
    public C197039127h LLILZIL;
    public RadiusLayout LLILZLL;
    public RadiusLayout LLIZ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 636));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 635));

    @Override // com.ss.android.ugc.tiktok.pns.ui.BaseFragment
    public final int MR() {
        return R.layout.be6;
    }

    @Override // X.C10B8
    public final boolean onBackPressed() {
        return false;
    }

    public final C197039127h NR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.rv1) : null;
            this.LLILZ = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final RadiusLayout OR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.rvj) : null;
            this.LLILZLL = (RadiusLayout) viewFindViewById;
        }
        return (RadiusLayout) viewFindViewById;
    }

    public final C197039127h PR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sec) : null;
            this.LLILZIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final RadiusLayout RR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sfv) : null;
            this.LLIZ = (RadiusLayout) viewFindViewById;
        }
        return (RadiusLayout) viewFindViewById;
    }

    public final PaPromptViewModel SR() {
        return (PaPromptViewModel) this.LLIZLLLIL.getValue();
    }

    public final boolean UR() {
        return SR().LL.getValue() == C10B4.PRIVATE;
    }

    public final void VR() {
        SR().xQ2(new C10BC(this), new C19203810Ay(this));
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
    }

    @Override // com.ss.android.ugc.tiktok.pns.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SR().LL.observe(this, new AObserverS230S0100000_28(this, 102));
        SR().LLILLJJLI.observe(this, new AObserverS230S0100000_28(this, 103));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void WR(android.content.Context r10, X.C10B4 r11) {
        /*
            r9 = this;
            X.0mTM r4 = new X.0mTM
            r4.<init>(r10)
            android.content.Context r8 = r9.getContext()
            r5 = 0
            if (r8 == 0) goto Lc1
            int[] r1 = X.C10B5.LIZ
            int r0 = r11.ordinal()
            r2 = r1[r0]
            r7 = 32
            r1 = 2131845199(0x7f11604f, float:1.9323812E38)
            r6 = 1
            if (r2 == r6) goto L99
            r0 = 2
            if (r2 == r0) goto L99
            r0 = 3
            if (r2 == r0) goto L72
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
        L27:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r4.LIZIZ(r0)
            kotlin.jvm.internal.AwS607S0100000_28 r1 = new kotlin.jvm.internal.AwS607S0100000_28
            r0 = 166(0xa6, float:2.33E-43)
            r1.<init>(r9, r0)
            X.C985403tE.LIZ(r4, r1)
            r4.LJII = r5
            X.0mTF r0 = new X.0mTF
            r0.<init>(r4)
            r0.LIZLLL()
            X.04gr r3 = X.C1163504gr.LIZIZ
            X.108h r2 = new X.108h
            r2.<init>()
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "exist_account_privacy_page"
            r2.LIZLLL(r1, r0)
            java.lang.String r1 = "action_type"
            java.lang.String r0 = "show"
            r2.LIZLLL(r1, r0)
            com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.viewmodel.PaPromptViewModel r0 = r9.SR()
            X.10B9 r0 = r0.wQ2()
            if (r0 == 0) goto L70
            java.lang.String r1 = r0.getEtText()
        L63:
            java.lang.String r0 = "click_type"
            r2.LIZLLL(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "exist_account_privacy_manage_confirm"
            r3.onEventV3(r0, r1)
            return
        L70:
            r1 = 0
            goto L63
        L72:
            java.lang.String r3 = r9.getString(r1)
            android.text.Spannable[] r2 = new android.text.Spannable[r6]
            X.0Hca r1 = new X.0Hca
            r1.<init>()
            r0 = 2131845190(0x7f116046, float:1.9323794E38)
            java.lang.String r0 = r9.getString(r0)
            r1.LIZJ = r0
            r1.LIZLLL(r6)
            r1.LIZIZ(r7)
            r1.LIZIZ = r5
            java.lang.CharSequence r0 = r1.LIZ(r8)
            r2[r5] = r0
            android.text.Spanned r0 = X.C10KE.LIZIZ(r3, r2)
            goto Lbf
        L99:
            java.lang.String r3 = r9.getString(r1)
            android.text.Spannable[] r2 = new android.text.Spannable[r6]
            X.0Hca r1 = new X.0Hca
            r1.<init>()
            r0 = 2131845189(0x7f116045, float:1.9323792E38)
            java.lang.String r0 = r9.getString(r0)
            r1.LIZJ = r0
            r1.LIZLLL(r6)
            r1.LIZIZ(r7)
            r1.LIZIZ = r5
            java.lang.CharSequence r0 = r1.LIZ(r8)
            r2[r5] = r0
            android.text.Spanned r0 = X.C10KE.LIZIZ(r3, r2)
        Lbf:
            if (r0 != 0) goto L27
        Lc1:
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.ui.PaPromptFragmentForExistingUsers.WR(android.content.Context, X.10B4):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.tiktok.pns.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C10B4 c10b4;
        super.onViewCreated(view, bundle);
        MutableLiveData<C10B4> mutableLiveData = SR().LL;
        C191880104w.LIZ.getClass();
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIL = C191880104w.LJIIL();
        if (privacyUserSettingsV2LJIIL != null && C103K.LIZ(privacyUserSettingsV2LJIIL)) {
            c10b4 = C10B4.PRIVATE;
        } else {
            c10b4 = C10B4.PUBLIC;
        }
        mutableLiveData.postValue(c10b4);
        View viewFindViewById = this.LL;
        Spanned spannedLIZIZ = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.title);
            } else {
                viewFindViewById = null;
            }
            this.LL = (TuxTextView) viewFindViewById;
        }
        ((TuxTextView) viewFindViewById).LJJJJI(36.0f);
        View viewFindViewById2 = this.LLILLJJLI;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.xzl);
            } else {
                viewFindViewById2 = null;
            }
            this.LLILLJJLI = (TuxNavBar) viewFindViewById2;
        }
        TuxNavBar tuxNavBar = (TuxNavBar) viewFindViewById2;
        if (tuxNavBar != null) {
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
            c1251150ifB.LIZJ(new AwS572S0100000_28(this, 1004));
            c0om1.LJ(c1251150ifB);
            tuxNavBar.setNavActions(c0om1);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, tuxNavBar.getContext());
            if (numLIZJ != null) {
                tuxNavBar.setNavBackground(numLIZJ.intValue());
            }
        }
        View viewFindViewById3 = this.LLILLL;
        if (viewFindViewById3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById3 = view4.findViewById(R.id.jok);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILLL = (TuxTextView) viewFindViewById3;
        }
        ((TextView) viewFindViewById3).setMovementMethod(C431260Gvc.LIZ);
        View viewFindViewById4 = this.LLILLL;
        if (viewFindViewById4 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById4 = view5.findViewById(R.id.jok);
            } else {
                viewFindViewById4 = null;
            }
            this.LLILLL = (TuxTextView) viewFindViewById4;
        }
        TextView textView = (TextView) viewFindViewById4;
        Context context = getContext();
        if (context != null) {
            String string = getString(2131845187);
            C444940Hca c444940Hca = new C444940Hca();
            c444940Hca.LIZJ = getString(2131845545);
            c444940Hca.LJIIIIZZ = new AwS572S0100000_28(this, 1003);
            c444940Hca.LIZLLL(1);
            c444940Hca.LIZIZ = false;
            c444940Hca.LIZIZ(62);
            spannedLIZIZ = C10KE.LIZIZ(string, c444940Hca.LIZ(context));
        }
        textView.setText(spannedLIZIZ);
        if (UR()) {
            NR().setText(getString(2131845213));
            PR().setText(getString(2131845216));
            C786410Ut5.LLZZ(OR(), 0);
            C786410Ut5.LLZZ(RR(), 8);
        } else {
            NR().setText(getString(2131845215));
            PR().setText(getString(2131845214));
            C786410Ut5.LLZZ(OR(), 8);
            C786410Ut5.LLZZ(RR(), 0);
        }
        C786410Ut5.U8(NR(), new ACListenerS162S0100000_28(this, 81));
        C786410Ut5.U8(PR(), new ACListenerS162S0100000_28(this, 82));
        C1163504gr c1163504gr = C1163504gr.LIZIZ;
        C191969108h c191969108h = new C191969108h();
        c191969108h.LIZLLL("enter_from", "exist_account_privacy_page");
        c191969108h.LIZLLL("action_type", "show");
        c1163504gr.onEventV3("exist_account_privacy_manage_page", c191969108h.LIZ);
    }
}
