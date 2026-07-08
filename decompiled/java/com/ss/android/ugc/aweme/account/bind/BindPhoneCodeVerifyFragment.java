package com.ss.android.ugc.aweme.account.bind;

import X.C01GW;
import X.C0HZQ;
import X.C0XUD;
import X.C0XZ4;
import X.C1236860iI8;
import X.C1236890iIB;
import X.C1237010iIN;
import X.C2187451AjH;
import X.C444920HcY;
import X.C452501pT;
import X.C616540OGe;
import X.C786410Ut5;
import X.C851910XbR;
import X.C852810Xct;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import X.InterfaceC1236910iID;
import Y.ACListenerS122S0200000_19;
import Y.ACListenerS148S0100000_13;
import Y.ARunnableS119S0100000_19;
import Y.ARunnableS52S0300000_19;
import Y.AfS182S0100000_13;
import Y.AfS188S0100000_19;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public final class BindPhoneCodeVerifyFragment extends InputCodeFragmentV2 {
    public static final Regex LLLLLLIL = new Regex("(.)");
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiHELIOSKyY9LGsOICE3GC0jJyoQJyEpHyohISM1Dz0yLygpJzs=";
    public final C01GW LLLLLJLJLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 68));
    public final String LLLLLL = "phone";

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void vT(long j, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void xT() {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final C1236860iI8 eT() {
        C1236860iI8 c1236860iI8 = new C1236860iI8();
        c1236860iI8.LIZ = (String) this.LLLLLJLJLL.getValue();
        c1236860iI8.LIZIZ = true;
        C852810Xct.LIZ.getClass();
        c1236860iI8.LJ = C852810Xct.LIZIZ(this);
        return c1236860iI8;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        String strReplace = LLLLLLIL.replace((String) this.LLLLLJLJLL.getValue(), "$1\u2060");
        String strK4 = C786410Ut5.k4(Locale.US, getString(2131829359), Arrays.copyOf(new Object[]{strReplace}, 1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strK4);
        int iLJJJ = a0.LJJJ(strK4, strReplace, 0, false, 6);
        if (iLJJJ >= 0) {
            C786410Ut5.q2(spannableStringBuilder, new C444920HcY(52, false), iLJJJ, strReplace.length() + iLJJJ, 18);
        }
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LJIIIIZZ = getString(2131829360);
        c1237010iIN.LJIIIZ = spannableStringBuilder;
        c1237010iIN.LIZ = " ";
        c1237010iIN.LJIIL = true;
        c1237010iIN.LJIIJJI = "optional_signup_phone_code";
        c1237010iIN.LJIILIIL = "aweme://roma_redirect/?spark_page=TT_CSP_Common_TopicList&entrance=PII_phone_otp&enter_from=PII_phone_otp";
        return c1237010iIN;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void uT() {
        C0XZ4.LJJ(C0XZ4.LIZ, this, this, (String) this.LLLLLJLJLL.getValue(), SR(), VR(), null, null, "resend", null, RR(), null, null, 7008).LJIIIIZZ(new AfS188S0100000_19(this, 4)).LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(BindPhoneCodeVerifyFragment.class.getName());
        }
        super.onResume();
        C0HZQ c0hzq = this.LLLF;
        if (c0hzq != null) {
            HandlerHook.viewPostDelay(c0hzq, new ARunnableS119S0100000_19(this, 16), 100L);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final String hS() {
        return this.LLLLLL;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.gyc);
        final boolean z = true;
        if (viewFindViewById != null) {
            C851910XbR c851910XbR = C851910XbR.LIZ;
            C0XUD.LIZ.getClass();
            boolean z2 = !C0XUD.LJIIJJI;
            String str = this.LLLLLL;
            AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(43);
            c851910XbR.getClass();
            this.LLLF = C851910XbR.LIZ(viewFindViewById, true, z2, "", str, aFwS257S0000000_19, true);
        }
        C1236890iIB c1236890iIB = C1236890iIB.LIZ;
        final TuxTextView tuxTextViewZS = ZS();
        String str2 = (String) this.LLLLLJLJLL.getValue();
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("use_email", false)) {
            z = false;
        }
        final AFwS207S0000000_19 aFwS207S0000000_19 = AFwS207S0000000_19.get$arr$(19);
        c1236890iIB.getClass();
        C1236890iIB.LJFF = str2;
        C1236890iIB.LIZ(new InterfaceC1236910iID() { // from class: X.0hdk
            @Override // X.InterfaceC1236910iID
            public final void LIZ(boolean z3) {
                C19EG activity;
                C1236890iIB c1236890iIB2 = C1236890iIB.LIZ;
                BaseAccountFlowFragment baseAccountFlowFragment = this;
                boolean z4 = z;
                Function0<Unit> function0 = aFwS207S0000000_19;
                c1236890iIB2.getClass();
                ArrayList arrayList = new ArrayList();
                if (C1236890iIB.LIZIZ) {
                    arrayList.add(new C1211810hdj(2131824503, new ACListenerS122S0200000_19(baseAccountFlowFragment, function0, 33)));
                }
                if (z4) {
                    arrayList.add(new C1211810hdj(2131836811, new ACListenerS148S0100000_13(baseAccountFlowFragment, 35)));
                }
                if (!arrayList.isEmpty() && (activity = this.getActivity()) != null) {
                    activity.runOnUiThread(new ARunnableS52S0300000_19(this, tuxTextViewZS, arrayList, 3));
                }
            }
        }, VR(), SR());
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void rT(String str, String str2) {
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        String str3 = (String) this.LLLLLJLJLL.getValue();
        EnumC852660Xce enumC852660XceSR = SR();
        EnumC852910Xd3 enumC852910Xd3VR = VR();
        String strRR = RR();
        c0xz4.getClass();
        C0XZ4.LIZJ(this, this, str3, enumC852660XceSR, enumC852910Xd3VR, str, false, "mobile", strRR, null).LJIIIIZZ(new AfS182S0100000_13(this, 11)).LJIILL();
    }
}
