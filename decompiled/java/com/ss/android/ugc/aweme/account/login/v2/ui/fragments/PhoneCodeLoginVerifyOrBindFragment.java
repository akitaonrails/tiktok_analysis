package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.C01GW;
import X.C0HZQ;
import X.C0XUD;
import X.C0XZ4;
import X.C123100dR;
import X.C1236860iI8;
import X.C1236890iIB;
import X.C1237010iIN;
import X.C2097908Jt;
import X.C2187451AjH;
import X.C452501pT;
import X.C616540OGe;
import X.C786410Ut5;
import X.C851910XbR;
import X.C852810Xct;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import Y.ARunnableS119S0100000_19;
import Y.AfS178S0100000_9;
import Y.AfS188S0100000_19;
import android.os.Bundle;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class PhoneCodeLoginVerifyOrBindFragment extends InputCodeFragmentV2 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0IStiP319PSxiHELIOSLz0yLygpJzsgZhUkJiE2CyooLAM8LywiHyohISM1Bj0RISsoDz0yLygpJzs=";
    public final C01GW LLLLLJLJLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 298));
    public final C01GW LLLLLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 295));
    public final C01GW LLLLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 296));
    public final C01GW LLLLLLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 297));
    public final C01GW LLLLLLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 299));
    public final C01GW LLLLLLLLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 293));
    public final C01GW LLLLLLLLLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 294));
    public final C01GW LLLLLLLZIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 292));
    public final String LLLLLLZ = "phone";

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void vT(long j, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final C1236860iI8 eT() {
        C1236860iI8 c1236860iI8 = new C1236860iI8();
        c1236860iI8.LIZIZ = true;
        c1236860iI8.LIZ = (String) this.LLLLLJLJLL.getValue();
        C852810Xct.LIZ.getClass();
        c1236860iI8.LJ = C852810Xct.LIZIZ(this);
        return c1236860iI8;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LJIIIIZZ = getString(2131826452);
        c1237010iIN.LJIIIZ = C786410Ut5.k4(Locale.US, getString(2131829359), Arrays.copyOf(new Object[]{this.LLLLLJLJLL.getValue()}, 1));
        c1237010iIN.LIZ = " ";
        c1237010iIN.LJIIL = true;
        c1237010iIN.LJIJJ = C123100dR.LIZ((String) this.LLLLLLLLL.getValue());
        c1237010iIN.LJIJJLI = (String) this.LLLLLLLLL.getValue();
        c1237010iIN.LJIL = (String) this.LLLLLLLLLL.getValue();
        c1237010iIN.LJJ = (String) this.LLLLLLLZIL.getValue();
        return c1237010iIN;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void uT() {
        AT("resend");
    }

    public final boolean zT() {
        return ((Boolean) this.LLLLLL.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, X.C0XYD
    public final EnumC852910Xd3 LLJJLIIIJLLLLLLLZ() {
        return SR() == EnumC852660Xce.BIND_PHONE ? EnumC852910Xd3.NON1P_PHONE_BIND : EnumC852910Xd3.VERIFY_PHONE;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        C0HZQ c0hzq;
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(PhoneCodeLoginVerifyOrBindFragment.class.getName());
        }
        super.onResume();
        if (!zT() || (c0hzq = this.LLLF) == null) {
            return;
        }
        HandlerHook.viewPostDelay(c0hzq, new ARunnableS119S0100000_19(this, 28), 100L);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void xT() {
        if (zT()) {
            return;
        }
        super.xT();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final String hS() {
        return this.LLLLLLZ;
    }

    public final void AT(String str) {
        String str2;
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        if (((Boolean) this.LLLLLLIL.getValue()).booleanValue()) {
            str2 = "";
        } else {
            str2 = (String) this.LLLLLJLJLL.getValue();
        }
        C0XZ4.LJJ(c0xz4, this, this, str2, SR(), LLJJLIIIJLLLLLLLZ(), null, null, str, null, RR(), 48, C2097908Jt.LIZJ(new Pair("passport_ticket", this.LLLLLLJ.getValue())), 864).LJIIIIZZ(new AfS188S0100000_19(this, 16)).LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (((Boolean) this.LLLLLLIL.getValue()).booleanValue()) {
            AT("user_click");
        } else {
            oT();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (zT()) {
            C1236890iIB c1236890iIB = C1236890iIB.LIZ;
            TuxTextView tuxTextViewZS = ZS();
            String str = (String) this.LLLLLJLJLL.getValue();
            AFwS207S0000000_19 aFwS207S0000000_19 = AFwS207S0000000_19.get$arr$(46);
            String str2 = (String) this.LLLLLLJ.getValue();
            c1236890iIB.getClass();
            C1236890iIB.LJFF(this, tuxTextViewZS, str, "", aFwS207S0000000_19, str2);
            View viewFindViewById = view.findViewById(R.id.gyc);
            if (viewFindViewById != null) {
                C851910XbR c851910XbR = C851910XbR.LIZ;
                C0XUD.LIZ.getClass();
                boolean z = !C0XUD.LJIIJJI;
                String str3 = this.LLLLLLZ;
                AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(63);
                c851910XbR.getClass();
                this.LLLF = C851910XbR.LIZ(viewFindViewById, true, z, "", str3, aFwS257S0000000_19, true);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void rT(String str, String str2) {
        if (zT()) {
            Object value = this.LLLLLLJ.getValue();
            EnumC852660Xce enumC852660XceSR = SR();
            boolean zBooleanValue = ((Boolean) this.LLLLLLIL.getValue()).booleanValue();
            String str3 = (String) this.LLLLLLL.getValue();
            AwS557S0100000_13 awS557S0100000_13 = new AwS557S0100000_13(this, 81);
            if (enumC852660XceSR != EnumC852660Xce.VERIFY && !zBooleanValue) {
                if (enumC852660XceSR == EnumC852660Xce.BIND_PHONE) {
                    C0XZ4 c0xz4 = C0XZ4.LIZ;
                    EnumC852910Xd3 enumC852910Xd3 = EnumC852910Xd3.PHONE_SMS_BIND;
                    Map mapLIZJ = C2097908Jt.LIZJ(new Pair("passport_ticket", value));
                    c0xz4.getClass();
                    C0XZ4.LIZJ(this, this, "", enumC852660XceSR, enumC852910Xd3, str, false, str3, "failed_3p_login", mapLIZJ).LJIIIIZZ(new AfS178S0100000_9(awS557S0100000_13, 74)).LJIILL();
                    return;
                }
                return;
            }
            C0XZ4 c0xz42 = C0XZ4.LIZ;
            Map mapLIZJ2 = C2097908Jt.LIZJ(new Pair("passport_ticket", value));
            c0xz42.getClass();
            C0XZ4.LJI(this, this, "", str, 48, mapLIZJ2, null).LJIIIIZZ(new AfS178S0100000_9(awS557S0100000_13, 73)).LJIILL();
        }
    }
}
