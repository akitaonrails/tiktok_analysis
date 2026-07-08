package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.C0XGR;
import X.C1237010iIN;
import X.C1238880iLO;
import X.C1251150ifB;
import X.C13IQ;
import X.C14SL;
import X.C19EG;
import X.C20684815ws;
import X.C723850SaN;
import X.C851590Xav;
import X.C851660Xb2;
import X.EnumC852910Xd3;
import X.InterfaceC851550Xar;
import android.os.Bundle;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class SignUpTermsConsentFragment extends BaseI18nLoginFragment implements InterfaceC851550Xar {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0IStiP3HELIOS19PSxiLz0yLygpJzsgZhYlLiEGOBEpOyIgCyoiOio9PAM+KCg+LSs4";
    public String LLLIL;
    public boolean LLLILZ;
    public boolean LLLILZJ;
    public int LLLILZLLLI;
    public C14SL LLLJ;
    public boolean LLLJIL;
    public int LLLIILIL = EnumC852910Xd3.TERMS_CONSENT_SIGN_UP.getValue();
    public String LLLIZZ = "";

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void HS() {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void aS() {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        return null;
    }

    @Override // X.C0XYD
    public final void pn(int i, String str) {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int sS() {
        return R.layout.ye;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        if (!this.LLLILZ || this.LLLILZJ) {
            super.onBackPressed();
            return false;
        }
        this.LLLILZLLLI = 0;
        NS();
        return true;
    }

    public final void NS() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", EnumC852910Xd3.FINISH.getValue());
        arguments.putInt("result_code", this.LLLILZLLLI);
        arguments.putInt("current_page", EnumC852910Xd3.TERMS_CONSENT_SIGN_UP_THIRD_PARTY.getValue());
        fo(arguments);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String PS(String str) {
        switch (str.hashCode()) {
            case -1495818221:
                if (!str.equals("consent-to-collect-and-user-of-your-personal-information-for-marketing-purpose")) {
                    return "";
                }
                return "agree_to_receive_notifications_of_marketing_content_and_promotions";
            case -498638057:
                if (!str.equals("privacy-policy")) {
                    return "";
                }
                return "agree_to_tiktok_privacy_policy";
            case 623683781:
                if (!str.equals("terms-of-service")) {
                    return "";
                }
                return "agree_to_tiktok_terms_of_service";
            case 975365518:
                if (!str.equals("agree_all")) {
                    return "";
                }
                return "select_all";
            case 2064195680:
                if (!str.equals("terms-and-conditions-kr")) {
                    return "";
                }
                return "agree_to_terms_and_conditions_kr";
            default:
                return "";
        }
    }

    public final void RS(int i) {
        SignUpOrLoginActivity signUpOrLoginActivity;
        if (getActivity() instanceof SignUpOrLoginActivity) {
            C19EG activity = getActivity();
            if ((activity instanceof SignUpOrLoginActivity) && (signUpOrLoginActivity = (SignUpOrLoginActivity) activity) != null) {
                signUpOrLoginActivity.LLILZIL = Integer.valueOf(i);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        String str;
        String string;
        int value;
        AuthResult authResult;
        String str2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        boolean z2 = true;
        if (VR() == EnumC852910Xd3.TERMS_CONSENT_SIGN_UP_THIRD_PARTY) {
            z = true;
        } else {
            z = false;
        }
        this.LLLILZ = z;
        String str3 = "";
        if (z) {
            if (arguments != null && (authResult = (AuthResult) arguments.getParcelable("key_auth_result")) != null && (str2 = authResult.mProviderId) != null) {
                str3 = str2;
            }
            this.LLLIL = str3;
            int value2 = EnumC852910Xd3.THIRD_PARTY_AGE_GATE.getValue();
            if (arguments != null) {
                value = arguments.getInt("previous_page", EnumC852910Xd3.NONE.getValue());
            } else {
                value = EnumC852910Xd3.NONE.getValue();
            }
            if (value2 != value) {
                z2 = false;
            }
            this.LLLILZJ = z2;
        } else {
            this.LLLIILIL = VR().getValue();
            if (arguments != null && (string = arguments.getString("sms_code_key", "")) != null) {
                str3 = string;
            }
            this.LLLIZZ = str3;
            if (this.LLLIILIL == EnumC852910Xd3.TERMS_CONSENT_NEW_PHONE_USER.getValue()) {
                str = "sms_verification";
            } else {
                str = "phone";
            }
            this.LLLIL = str;
        }
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", getEnterFrom());
        c0xgr.LIZLLL("enter_method", getEnterMethod());
        c0xgr.LIZLLL("platform", this.LLLIL);
        C20684815ws.LJIILLIIL("register_terms_show", c0xgr.LIZ);
        this.LLLJ = new C14SL(ComplianceServiceProvider.LJJII().LIZIZ(), new AwS598S0100000_19(this, 90), new AwS598S0100000_19(this, 91), new AwS598S0100000_19(this, 92), new AwS598S0100000_19(this, 93), new C1238880iLO(this), true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RS(1);
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.y08);
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LIZJ(new AwS563S0100000_19(this, 314));
        tuxNavBar.LIZIZ(c1251150ifB);
        tuxNavBar.LJIIZILJ(false);
        ComplianceServiceProvider.LIZIZ.getClass();
        C13IQ<? extends UISlotAssem> c13iqLIZIZ = ComplianceServiceProvider.LJIIJ().LIZIZ();
        if (c13iqLIZIZ != null) {
            C723850SaN.LIZ(this, false, null, new AwS368S0200000_2(this, (SignUpTermsConsentFragment) c13iqLIZIZ, (C13IQ<? extends UISlotAssem>) 11), 3);
        }
    }

    @Override // X.InterfaceC851550Xar
    public final void QK(EnumC852910Xd3 enumC852910Xd3, Bundle bundle, C851660Xb2 c851660Xb2) {
        C851590Xav.LIZ(enumC852910Xd3, bundle, c851660Xb2);
    }

    public final void QS(String str, boolean z, boolean z2) {
        int i;
        String str2;
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", getEnterFrom());
        c0xgr.LIZLLL("enter_method", getEnterMethod());
        c0xgr.LIZLLL("platform", this.LLLIL);
        c0xgr.LIZLLL("content", str);
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        c0xgr.LIZ(i, "click_type");
        if (z2) {
            if (this.LLLJIL) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c0xgr.LIZJ("trending_on", str2);
        }
        C20684815ws.LJIILLIIL("register_terms_click", c0xgr.LIZ);
    }
}
