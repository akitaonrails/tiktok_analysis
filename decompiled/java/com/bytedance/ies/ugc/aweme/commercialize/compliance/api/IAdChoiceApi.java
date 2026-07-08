package com.bytedance.ies.ugc.aweme.commercialize.compliance.api;

import X.C0TPM;
import X.C0X9S;
import X.InterfaceC1501170pAR;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice.AdChoiceDeviceUserAge;

/* JADX INFO: loaded from: classes13.dex */
public interface IAdChoiceApi {
    public static final C0TPM LIZ = C0TPM.LIZ;

    @InterfaceC1501170pAR("/tiktok/v1/csp/device_interval_info")
    C0X9S<AdChoiceDeviceUserAge> getDeviceUserAge();
}
