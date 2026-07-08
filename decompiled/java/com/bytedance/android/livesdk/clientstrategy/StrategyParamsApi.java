package com.bytedance.android.livesdk.clientstrategy;

import X.C11NZ;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import tikcast.api.epiphron.UploadFeatureRequest;
import tikcast.api.epiphron.UploadFeatureResponse;

/* JADX INFO: loaded from: classes13.dex */
public interface StrategyParamsApi {
    @InterfaceC1501170pAR("/webcast/epiphron/feature/upload/")
    C11NZ<UploadFeatureResponse> upload(@InterfaceC1485405rg UploadFeatureRequest uploadFeatureRequest);
}
