package com.ss.android.ugc.aweme.commercialize.service;

import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonAdRealtimeInfoResponse;
import com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonAdRealtimeInfoResult;
import com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonCheckoutAdModel;

/* JADX INFO: loaded from: classes12.dex */
public interface IAmazonAdRealtimeInfoService {
    Object LIZ(AmazonCheckoutAdModel amazonCheckoutAdModel, InterfaceC1364105Vn<? super AmazonAdRealtimeInfoResponse> interfaceC1364105Vn);

    void LIZIZ(AmazonAdRealtimeInfoResult amazonAdRealtimeInfoResult, Aweme aweme);

    Object LIZJ(String str, AmazonCheckoutAdModel amazonCheckoutAdModel, InterfaceC1364105Vn<? super AmazonAdRealtimeInfoResult> interfaceC1364105Vn);
}
