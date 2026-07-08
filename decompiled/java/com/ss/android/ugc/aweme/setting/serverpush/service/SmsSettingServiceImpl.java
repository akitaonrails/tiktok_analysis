package com.ss.android.ugc.aweme.setting.serverpush.service;

import X.C01J0;
import X.C0C64;
import X.C0PEM;
import X.C11S5;
import X.C19476611Hw;
import X.C2296808zG;
import X.C23250099c;
import X.C423801kq;
import com.ss.android.ugc.aweme.setting.serverpush.ISmsSettingService;
import com.ss.android.ugc.aweme.setting.serverpush.api.SmsConsentApi;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelAuthEdmAndSmsGuideV3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class SmsSettingServiceImpl implements ISmsSettingService {
    @Override // com.ss.android.ugc.aweme.setting.serverpush.ISmsSettingService
    public final C19476611Hw LIZ() {
        SmsConsentApi.LIZ.getClass();
        return C423801kq.LIZIZ.getNeedShowSmsConsent("primary_sms_auth").LJL(C11S5.LIZ());
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.ISmsSettingService
    public final C19476611Hw LIZIZ(int i) {
        SmsConsentApi.LIZ.getClass();
        return C423801kq.LIZ(i);
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.ISmsSettingService
    public final void LIZJ(Function1<? super Boolean, Unit> function1) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "show_sms_consent_after_bind_phone", true, false) || ChannelAuthEdmAndSmsGuideV3.INSTANCE.enabled()) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01J0(this, function1, null), 3);
        }
    }
}
