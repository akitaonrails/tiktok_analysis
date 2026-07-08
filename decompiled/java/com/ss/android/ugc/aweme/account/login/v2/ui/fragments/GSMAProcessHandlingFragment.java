package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.C0WZX;
import X.C0XZ4;
import X.C1237010iIN;
import X.C19EG;
import X.C2187451AjH;
import X.C2204961BRm;
import X.C616540OGe;
import X.C851590Xav;
import X.C851660Xb2;
import X.C852810Xct;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import X.InterfaceC851550Xar;
import Y.AfS149S0200000_13;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.GSMAService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class GSMAProcessHandlingFragment extends BaseI18nLoginFragment implements InterfaceC851550Xar {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0IStiP319HELIOSPSxiLz0yLygpJzsgZgIfBA4DOiovLDwgACQiLSM6JiIKOy40JSAiPQ==";
    public boolean LLLIILIL = true;

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

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int sS() {
        return R.layout.y7;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(GSMAProcessHandlingFragment.class.getName());
        }
        super.onResume();
        if (this.LLLIILIL) {
            this.LLLIILIL = false;
            return;
        }
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        boolean z;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putInt("previous_page", EnumC852910Xd3.INPUT_PHONE_SIGN_UP.getValue());
            arguments.putInt("current_page", EnumC852910Xd3.PHONE_SMS_SIGN_UP.getValue());
        }
        C852810Xct.LIZ.getClass();
        PhoneNumberUtil.PhoneNumber phoneNumberLJII = C852810Xct.LJII(getArguments());
        String strLIZ = PhoneNumberUtil.LIZ(phoneNumberLJII);
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("gsma_code")) == null) {
            string = "";
        }
        if (getActivity() != null) {
            C0XZ4 c0xz4 = C0XZ4.LIZ;
            Bundle arguments3 = getArguments();
            if (arguments3 != null && arguments3.getBoolean("is_register")) {
                z = true;
            } else {
                z = false;
            }
            EnumC852660Xce enumC852660Xce = EnumC852660Xce.LOGIN;
            EnumC852910Xd3 enumC852910Xd3 = EnumC852910Xd3.PHONE_SMS_LOGIN;
            Map<String, String> gSMAExtraMap = GSMAService.INSTANCE.getGSMAExtraMap();
            c0xz4.getClass();
            C0XZ4.LJIJJ(this, this, strLIZ, string, z, enumC852660Xce, enumC852910Xd3, gSMAExtraMap, null).LJIIIIZZ(new AfS149S0200000_13(this, phoneNumberLJII, 11)).LJIILL();
        }
    }

    @Override // X.C0XYD
    public final void pn(int i, String str) throws Throwable {
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("from_sms_login_continue")) {
            return;
        }
        C19EG activity = getActivity();
        if (activity != null) {
            C2204961BRm.LLJJIJIL(102, new Intent(), activity, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4F7WzzjzzRSEqAB/F5lnqAz22SahYe2ZFHSa1HWKAuxy7lI4Etg==", null));
        }
        C19EG activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    @Override // X.InterfaceC851550Xar
    public final void QK(EnumC852910Xd3 enumC852910Xd3, Bundle bundle, C851660Xb2 c851660Xb2) {
        C851590Xav.LIZ(enumC852910Xd3, bundle, c851660Xb2);
    }
}
