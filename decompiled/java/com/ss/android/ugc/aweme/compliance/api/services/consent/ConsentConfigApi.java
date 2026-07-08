package com.ss.android.ugc.aweme.compliance.api.services.consent;

import X.C0X9S;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.compliance.api.services.consent.model.ConsentConfigResponse;

/* JADX INFO: loaded from: classes29.dex */
public interface ConsentConfigApi {
    @InterfaceC1501170pAR("/consent/api/device_consent/config/v1")
    C0X9S<ConsentConfigResponse> fetchConsentConfig(@InterfaceC1501070pAH("country_code") String str);
}
