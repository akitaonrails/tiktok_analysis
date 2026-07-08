package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0HZQ;
import X.C0XQ5;
import X.C0XUD;
import X.C0XZ4;
import X.C1236860iI8;
import X.C1236880iIA;
import X.C1236890iIB;
import X.C1237010iIN;
import X.C2187451AjH;
import X.C452501pT;
import X.C616540OGe;
import X.C786410Ut5;
import X.C851910XbR;
import X.C852810Xct;
import X.C852880Xd0;
import X.C854460XfY;
import X.C854700Xfw;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import Y.ARunnableS113S0100000_13;
import Y.AfS182S0100000_13;
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
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AFwS247S0000000_13;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class PhoneNon1pBindFragment extends InputCodeFragmentV2 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0IStiHELIOSP319PSxiLz0yLygpJzsgZhUkJiE2BioieD8RISsoDz0yLygpJzs=";
    public final C01GW LLLLLJLJLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 83));
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
        c1236860iI8.LIZIZ = true;
        c1236860iI8.LIZ = zT();
        C852810Xct.LIZ.getClass();
        c1236860iI8.LJ = C852810Xct.LIZIZ(this);
        return c1236860iI8;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LJIIIIZZ = getString(2131829360);
        c1237010iIN.LJIIIZ = C1236880iIA.LIZIZ(C1236880iIA.LIZLLL(C786410Ut5.k4(Locale.US, getString(2131858480), Arrays.copyOf(new Object[]{zT()}, 1)), new String[]{zT()}, 52), getContext(), R.attr.a1j, zT());
        c1237010iIN.LIZ = " ";
        c1237010iIN.LJIIL = true;
        return c1237010iIN;
    }

    public final String zT() {
        return (String) this.LLLLLJLJLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        super.clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(PhoneNon1pBindFragment.class.getName());
        }
        super.onResume();
        C0HZQ c0hzq = this.LLLF;
        if (c0hzq != null) {
            HandlerHook.viewPostDelay(c0hzq, new ARunnableS113S0100000_13(this, 89), 100L);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void uT() {
        LJJJLIIL();
        C852880Xd0.LIZ(this, zT(), "resend").LJFF(new C854700Xfw(this, 1)).LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final String hS() {
        return this.LLLLLL;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C852880Xd0.LIZ(this, zT(), "user_click").LJFF(new C854700Xfw(this, 0)).LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1236890iIB c1236890iIB = C1236890iIB.LIZ;
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.dnx);
        String strZT = zT();
        C0XQ5.LIZIZ.LJIIJ();
        boolean z = !AbstractC848400XPy.LJJIJIIJIL();
        AFwS200S0000000_13 aFwS200S0000000_13 = AFwS200S0000000_13.get$arr$(87);
        AwS557S0100000_13 awS557S0100000_13 = new AwS557S0100000_13(this, 82);
        c1236890iIB.getClass();
        C1236890iIB.LJ(this, tuxTextView, strZT, null, z, aFwS200S0000000_13, awS557S0100000_13);
        View viewFindViewById = view.findViewById(R.id.gyc);
        if (viewFindViewById != null) {
            C851910XbR c851910XbR = C851910XbR.LIZ;
            C0XUD.LIZ.getClass();
            boolean z2 = !C0XUD.LJIIJJI;
            String str = this.LLLLLL;
            AFwS247S0000000_13 aFwS247S0000000_13 = AFwS247S0000000_13.get$arr$(16);
            c851910XbR.getClass();
            this.LLLF = C851910XbR.LIZ(viewFindViewById, true, z2, "", str, aFwS247S0000000_13, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void rT(String str, String str2) {
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        String strZT = zT();
        EnumC852660Xce enumC852660XceSR = SR();
        EnumC852910Xd3 enumC852910Xd3VR = VR();
        C854460XfY.LIZ.getClass();
        Map mapLJIIIZ = C854460XfY.LJIIIZ(this);
        c0xz4.getClass();
        C0XZ4.LIZJ(this, this, strZT, enumC852660XceSR, enumC852910Xd3VR, str, false, "mobile", null, mapLJIIIZ).LJIIIIZZ(new AfS182S0100000_13(this, 46)).LJIILL();
    }
}
