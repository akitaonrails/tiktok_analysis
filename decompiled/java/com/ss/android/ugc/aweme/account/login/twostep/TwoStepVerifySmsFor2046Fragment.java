package com.ss.android.ugc.aweme.account.login.twostep;

import X.C01GW;
import X.C0HZQ;
import X.C0XZ4;
import X.C1233960iDS;
import X.C1236860iI8;
import X.C1236880iIA;
import X.C1237010iIN;
import X.C1237220iIi;
import X.C1266060j3E;
import X.C1388190mED;
import X.C19481011Jo;
import X.C197039127h;
import X.C2188811AlT;
import X.C294000Bfi;
import X.C452501pT;
import X.C784500Uq0;
import X.C786410Ut5;
import X.C851360XaY;
import X.C851370XaZ;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import Y.ACListenerS154S0100000_19;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class TwoStepVerifySmsFor2046Fragment extends InputCodeFragmentV2 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0IStiHELIOSPTg8OzEpOWEHPyofPSojHiA+ICkqGyg/DyAhenV4fwkhKSIhLCEn";
    public C0HZQ LLLLLJLJLL;
    public C197039127h LLLLLL;
    public ConstraintLayout LLLLLLIL;
    public final C01GW LLLLLLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 229));
    public final C01GW LLLLLLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 46));
    public final C01GW LLLLLLLLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 45));
    public final C01GW LLLLLLLLLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 230));
    public final C01GW LLLLLLLZIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 232));
    public final C01GW LLLLLLZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 231));
    public String LLLLLLZZ;

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int sS() {
        return R.layout.xy;
    }

    public final C197039127h AT() {
        View viewFindViewById = this.LLLLLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.p8k) : null;
            this.LLLLLL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final String CT() {
        return (String) this.LLLLLLLLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, X.InterfaceC1237610iJL
    public final void LJJLL() {
        C1233960iDS c1233960iDS = C1233960iDS.LIZ;
        String enterFrom = getEnterFrom();
        String enterMethod = getEnterMethod();
        String strCT = CT();
        c1233960iDS.getClass();
        C1233960iDS.LJIIZILJ(enterFrom, enterMethod, strCT, "sms");
        super.LJJLL();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final C1236860iI8 eT() {
        C1236860iI8 c1236860iI8 = new C1236860iI8();
        c1236860iI8.LIZ = (String) this.LLLLLLJ.getValue();
        c1236860iI8.LIZIZ = true;
        c1236860iI8.LJ = false;
        c1236860iI8.LJFF = false;
        c1236860iI8.LJI = true;
        return c1236860iI8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getString(2131847249));
        sbLIZ.append('\n');
        sbLIZ.append(getString(2131829360));
        c1237010iIN.LJIIIIZZ = C2188811AlT.LIZIZ(sbLIZ);
        c1237010iIN.LJIIIZ = C1236880iIA.LIZIZ(C1236880iIA.LIZLLL(getString(2131829359, this.LLLLLLJ.getValue()), new String[]{this.LLLLLLJ.getValue()}, 52), getContext(), R.attr.a1j, this.LLLLLLJ.getValue());
        c1237010iIN.LIZ = " ";
        c1237010iIN.LJIIL = false;
        c1237010iIN.LIZ = getString(2131857339);
        c1237010iIN.LJIIIIZZ = getString(2131857342);
        c1237010iIN.LJIIL = false;
        c1237010iIN.LJIIJJI = getEnterFrom();
        return c1237010iIN;
    }

    public final C0HZQ zT() {
        View viewFindViewById = this.LLLLLJLJLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.dq1) : null;
            this.LLLLLJLJLL = (C0HZQ) viewFindViewById;
        }
        return (C0HZQ) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLLLJLJLL = null;
        this.LLLLLL = null;
        this.LLLLLLIL = null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void uT() {
        KeyboardUtils.LIZIZ(iT());
        DT("resend").LJIILL();
    }

    public final C19481011Jo DT(String str) {
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        EnumC852660Xce enumC852660XceSR = SR();
        EnumC852910Xd3 enumC852910Xd3VR = VR();
        HashMap map = (HashMap) this.LLLLLLZ.getValue();
        c0xz4.getClass();
        return C0XZ4.LJJIIZ(this, this, "", enumC852660XceSR, enumC852910Xd3VR, "", str, map).LJFF(new C1266060j3E(this, 12));
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C1237220iIi c1237220iIi;
        C1233960iDS c1233960iDS = C1233960iDS.LIZ;
        String enterFrom = getEnterFrom();
        String enterMethod = getEnterMethod();
        String strCT = CT();
        c1233960iDS.getClass();
        C1233960iDS.LJIJI(enterFrom, enterMethod, strCT, "sms");
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            C786410Ut5.LJJJI("page", "twosv_login", arguments);
        }
        C851370XaZ c851370XaZLIZ = C851360XaY.LIZ(getActivity(), (String) this.LLLLLLJ.getValue(), SR());
        if (c851370XaZLIZ != null && (c1237220iIi = c851370XaZLIZ.LIZ) != null && c1237220iIi.LIZIZ()) {
            return;
        }
        DT("auto_system").LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void qT(CharSequence charSequence) {
        boolean z;
        C197039127h c197039127hAT = AT();
        if (charSequence != null && charSequence.length() == 6) {
            z = true;
        } else {
            z = false;
        }
        c197039127hAT.setEnabled(z);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Activity activityLIZ;
        TextView textView;
        super.onViewCreated(view, bundle);
        C1236880iIA.LIZ(zT(), getContext());
        zT().setChecked(TwoStepAuthApi.LJI());
        C786410Ut5.D7(zT(), new CompoundButton.OnCheckedChangeListener() { // from class: X.0iI7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Keva.getRepo("two_step_verification").storeBoolean("ask_next_time", z);
            }
        });
        if (((List) this.LLLLLLL.getValue()) != null && (!r0.isEmpty())) {
            TuxTextView tuxTextViewZS = ZS();
            if (tuxTextViewZS != null) {
                tuxTextViewZS.setText(2131823012);
                C786410Ut5.LLLLZLL(tuxTextViewZS, 0);
                C786410Ut5.h9(tuxTextViewZS, new ACListenerS154S0100000_19(this, 50));
            }
        } else {
            C786410Ut5.LLLLZLL(ZS(), 8);
        }
        AT().setEnabled(true);
        C786410Ut5.U8(AT(), new ACListenerS154S0100000_19(this, 51));
        C786410Ut5.I7(new ACListenerS154S0100000_19(view, 52), view);
        lT().getPinField().setDimOnComplete(false);
        C197039127h c197039127hAT = AT();
        if (c197039127hAT != null) {
            c197039127hAT.setEnabled(false);
            c197039127hAT.setText(getString(R.string.epx));
            if (C294000Bfi.LIZ()) {
                C1236880iIA.LIZJ(c197039127hAT, c197039127hAT.getContext(), R.attr.a00, R.attr.a0o);
            }
        }
        Context context = getContext();
        View viewFindViewById = null;
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null && (textView = (TextView) activityLIZ.findViewById(R.id.kpd)) != null) {
            textView.setTextColor(C784500Uq0.LIZ(getContext()));
        }
        View view2 = this.LLLLLLIL;
        if (view2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById = view3.findViewById(R.id.dpu);
            }
            this.LLLLLLIL = (ConstraintLayout) viewFindViewById;
            view2 = viewFindViewById;
        }
        C786410Ut5.Y7((ConstraintLayout) view2, new ACListenerS154S0100000_19(this, 53));
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void rT(String str, String str2) {
        KeyboardUtils.LIZIZ(iT());
        this.LLLLLLZZ = str;
    }
}
