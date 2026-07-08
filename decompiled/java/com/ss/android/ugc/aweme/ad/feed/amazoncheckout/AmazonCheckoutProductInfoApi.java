package com.ss.android.ugc.aweme.ad.feed.amazoncheckout;

import X.C0X9S;
import X.C1005070cGH;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonAdRealTimeInfoRequest;
import com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonAdRealtimeInfoResponse;

/* JADX INFO: loaded from: classes17.dex */
public interface AmazonCheckoutProductInfoApi {
    public static final C1005070cGH LIZ = C1005070cGH.LIZ;

    @InterfaceC1501170pAR("/aweme/v1/ad/amazon/product/details/query/")
    C0X9S<AmazonAdRealtimeInfoResponse> getAmazonCheckoutAdCardInfo(@InterfaceC1485405rg AmazonAdRealTimeInfoRequest amazonAdRealTimeInfoRequest);

    @InterfaceC1501170pAR("/aweme/v1/ad/amazon/product/details/query/")
    Object getAmazonCheckoutAdCardInfoSuspend(@InterfaceC1485405rg AmazonAdRealTimeInfoRequest amazonAdRealTimeInfoRequest, InterfaceC1364105Vn<? super AmazonAdRealtimeInfoResponse> interfaceC1364105Vn);
}
