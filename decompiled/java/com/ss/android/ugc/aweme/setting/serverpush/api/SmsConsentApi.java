package com.ss.android.ugc.aweme.setting.serverpush.api;

import X.C11NZ;
import X.C423801kq;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.setting.model.NeedSmsConsentResponse;
import com.ss.android.ugc.aweme.setting.model.UpdateSmsConsentStatusRequest;

/* JADX INFO: loaded from: classes.dex */
public interface SmsConsentApi {
    public static final C423801kq LIZ = C423801kq.LIZ;

    @InterfaceC1501170pAR("/notification/settings/sms/keys")
    C11NZ<NeedSmsConsentResponse> getNeedShowSmsConsent(@InterfaceC1501070pAH("fields") String str);

    @InterfaceC1501170pAR("/notification/settings/sms/set")
    C11NZ<BaseResponse> updateSmsConsentStatus(@InterfaceC1485405rg UpdateSmsConsentStatusRequest updateSmsConsentStatusRequest);
}
