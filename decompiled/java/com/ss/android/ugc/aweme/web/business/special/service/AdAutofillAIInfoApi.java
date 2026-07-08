package com.ss.android.ugc.aweme.web.business.special.service;

import X.C1040290dB5;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.web.business.special.service.model.AdAutofillAIInfoResponse;

/* JADX INFO: loaded from: classes17.dex */
public interface AdAutofillAIInfoApi {
    public static final C1040290dB5 LIZ = C1040290dB5.LIZ;

    @InterfaceC1501160pAQ("/api/ad/iab/autofill/v1/")
    Object getAutofillAIInfo(@InterfaceC1501070pAH("channel_name") String str, InterfaceC1364105Vn<? super AdAutofillAIInfoResponse> interfaceC1364105Vn);
}
