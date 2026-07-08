package com.ss.android.ugc.aweme.account.bind;

import X.C01GW;
import X.C1233960iDS;
import X.C1237010iIN;
import X.C19736912Jz;
import X.C19EG;
import X.C20684815ws;
import X.C2344009Gk;
import X.C426750GoL;
import X.C452501pT;
import X.C784500Uq0;
import X.C786410Ut5;
import X.EnumC852660Xce;
import Y.ACListenerS154S0100000_19;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class BindTOTPFragment extends BaseI18nLoginFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvHELIOSKiAmJjFiKyY9LGsOICE3HAoYGQkhKSIhLCEn";
    public String LLLIILIL;
    public Integer LLLIL;
    public boolean LLLILZ;
    public final C01GW LLLILZJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 69));

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
        return R.layout.yj;
    }

    public final boolean PS() {
        Integer num = this.LLLIL;
        return num != null && num.intValue() == EnumC852660Xce.UPDATE_TOTP.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LIZ = getString(NS() ? 2131857337 : 2131850714);
        boolean z = false;
        c1237010iIN.LJIIL = false;
        if (NS() && !PS()) {
            z = true;
        }
        c1237010iIN.LJI = z;
        return c1237010iIN;
    }

    public final boolean NS() {
        Bundle arguments = getArguments();
        return arguments != null && arguments.getInt("progress", -1) >= 0;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        if (!NS() || PS()) {
            super.onBackPressed();
            return false;
        }
        if (C784500Uq0.LIZJ(getActivity())) {
            return true;
        }
        super.onBackPressed();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Integer numValueOf;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            numValueOf = Integer.valueOf(arguments.getInt("current_scene"));
        } else {
            numValueOf = null;
        }
        this.LLLIL = numValueOf;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        C19736912Jz c19736912Jz;
        TextView textView2;
        TuxTextView tuxTextView;
        View viewFindViewById;
        View viewFindViewById2;
        String string;
        TuxTextView tuxTextView2;
        String string2;
        super.onViewCreated(view, bundle);
        C19EG activity = getActivity();
        View viewFindViewById3 = null;
        if (activity != null) {
            textView = (TextView) activity.findViewById(R.id.yg5);
        } else {
            textView = null;
        }
        C19EG activity2 = getActivity();
        if (activity2 != null) {
            c19736912Jz = (C19736912Jz) activity2.findViewById(R.id.yg6);
        } else {
            c19736912Jz = null;
        }
        C19EG activity3 = getActivity();
        if (activity3 != null) {
            textView2 = (TextView) activity3.findViewById(R.id.yg7);
        } else {
            textView2 = null;
        }
        C19EG activity4 = getActivity();
        if (activity4 != null) {
            tuxTextView = (TuxTextView) activity4.findViewById(R.id.updateInstruction);
        } else {
            tuxTextView = null;
        }
        C19EG activity5 = getActivity();
        if (activity5 != null) {
            viewFindViewById = activity5.findViewById(R.id.ey3);
        } else {
            viewFindViewById = null;
        }
        C19EG activity6 = getActivity();
        if (activity6 != null) {
            viewFindViewById2 = activity6.findViewById(R.id.p8l);
        } else {
            viewFindViewById2 = null;
        }
        if (textView != null) {
            textView.setText("1. " + getString(2131850713) + "\n\n2. " + getString(2131850710) + "\n\n3. " + getString(2131850711) + "\n\n4. " + getString(2131850712));
        }
        Bundle arguments = getArguments();
        if (arguments != null && (string2 = arguments.getString("totp_key_uri")) != null && c19736912Jz != null) {
            c19736912Jz.LIZ(string2);
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            string = arguments2.getString("totp_secret");
        } else {
            string = null;
        }
        this.LLLIILIL = string;
        if (textView2 != null) {
            textView2.setText(string);
        }
        if (PS() && tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        C1233960iDS c1233960iDS = C1233960iDS.LIZ;
        String enterFrom = getEnterFrom();
        String str = (String) this.LLLILZJ.getValue();
        c1233960iDS.getClass();
        C2344009Gk c2344009GkLIZ = C1233960iDS.LIZ();
        c2344009GkLIZ.LJIIIIZZ("enter_from", enterFrom);
        c2344009GkLIZ.LJIIIIZZ("popup_type", "totp");
        c2344009GkLIZ.LJIIIIZZ("flow_type", str);
        C20684815ws.LJIILLIIL("twosv_totp_key_show", c2344009GkLIZ.LIZ);
        GS(new ACListenerS154S0100000_19(this, 27), viewFindViewById);
        GS(new ACListenerS154S0100000_19(this, 28), viewFindViewById2);
        if (NS()) {
            C19EG activity7 = getActivity();
            if (activity7 != null) {
                viewFindViewById3 = activity7.findViewById(R.id.yg6);
            }
            C19EG activity8 = getActivity();
            if (activity8 != null && (tuxTextView2 = (TuxTextView) activity8.findViewById(R.id.pyn)) != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 0);
            }
            if (viewFindViewById3 != null) {
                C426750GoL.LJIIIZ(viewFindViewById3, 0, 0, 0, 0, false, 16);
            }
        }
    }
}
