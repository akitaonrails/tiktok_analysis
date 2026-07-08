package com.ss.android.ugc.aweme.account.login.twostep;

import X.C0XQ5;
import X.C1233960iDS;
import X.C1237010iIN;
import X.C197039127h;
import X.C19EG;
import X.C20684815ws;
import X.C2344009Gk;
import X.C786410Ut5;
import Y.ACListenerS122S0200000_19;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment;
import com.ss.android.ugc.aweme.services.TwoStepVerificationService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class AddCurrentAuthDeviceFragment extends BaseI18nLoginFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0ISHELIOStiPTg8OzEpOWESLCEPPD0hLSs4CDonIAEpPyYwLQM+KCg+LSs4";
    public String LLLIILIL = "skip";

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void HS() {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void aS() {
    }

    @Override // X.C0XYD
    public final void pn(int i, String str) {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int sS() {
        return R.layout.xz;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        String string;
        String string2;
        C19EG activity = getActivity();
        if (activity != null) {
            C197039127h c197039127h = (C197039127h) activity.findViewById(R.id.ad1);
            C786410Ut5.U8(c197039127h, new ACListenerS122S0200000_19(c197039127h, this, 6));
        }
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LIZ = getString(2131857337);
        c1237010iIN.LJIIL = false;
        Context context = getContext();
        String str = "";
        if (context == null || (string = context.getString(2131857336)) == null) {
            string = "";
        }
        c1237010iIN.LJIIIIZZ = string;
        Context context2 = getContext();
        if (context2 != null && (string2 = context2.getString(2131857333)) != null) {
            str = string2;
        }
        c1237010iIN.LJIIIZ = str;
        c1237010iIN.LIZLLL = getString(2131857334);
        c1237010iIN.LIZIZ = null;
        c1237010iIN.LJFF = false;
        return c1237010iIN;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (Intrinsics.LJFF(this.LLLIILIL, "add")) {
            return;
        }
        C1233960iDS c1233960iDS = C1233960iDS.LIZ;
        String enterFrom = getEnterFrom();
        String str = this.LLLIILIL;
        c1233960iDS.getClass();
        C1233960iDS.LJIILIIL(null, null, enterFrom, str);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        TextView textView;
        super.onActivityCreated(bundle);
        C19EG activity = getActivity();
        if (activity != null && (textView = (TextView) activity.findViewById(R.id.fsd)) != null) {
            textView.setText(((TwoStepVerificationService) C0XQ5.LIZIZ.LJFF()).getDeviceName());
        }
        C1233960iDS c1233960iDS = C1233960iDS.LIZ;
        String enterFrom = getEnterFrom();
        c1233960iDS.getClass();
        C2344009Gk c2344009GkLIZ = C1233960iDS.LIZ();
        c2344009GkLIZ.LJIIIIZZ("enter_from", enterFrom);
        C20684815ws.LJIILLIIL("adding_trusted_device_show", c2344009GkLIZ.LIZ);
    }
}
