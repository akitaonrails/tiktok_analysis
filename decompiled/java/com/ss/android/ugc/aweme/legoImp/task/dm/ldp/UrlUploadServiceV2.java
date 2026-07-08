package com.ss.android.ugc.aweme.legoImp.task.dm.ldp;

import X.C0X9S;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.tiktok.pns.ldp.api.model.FrequencyRequestParams;
import com.tiktok.pns.ldp.api.model.UnknownRequestParams;

/* JADX INFO: loaded from: classes14.dex */
public interface UrlUploadServiceV2 {
    @InterfaceC1501170pAR("/tiktok/privacy/pet/ldp/v1/upload_event")
    C0X9S<URLUploadResponseBody> getDataRequestBody(@InterfaceC1485405rg FrequencyRequestParams frequencyRequestParams);

    @InterfaceC1501170pAR("/tiktok/privacy/pet/ldp/v1/unknown_data")
    C0X9S<URLUploadResponseBody> getUnknownDataRequestBody(@InterfaceC1485405rg UnknownRequestParams unknownRequestParams);
}
