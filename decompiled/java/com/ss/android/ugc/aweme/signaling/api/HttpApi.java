package com.ss.android.ugc.aweme.signaling.api;

import X.C11NZ;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import com.bytedance.android.livesdk.signaling.model.UplinkMessageRequest;
import com.bytedance.android.livesdk.signaling.model.UplinkMessageResponse;

/* JADX INFO: loaded from: classes8.dex */
public interface HttpApi {
    @InterfaceC1501170pAR("/webcast/signaling/uplink/")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    C11NZ<UplinkMessageResponse> postUplink(@InterfaceC1485405rg UplinkMessageRequest uplinkMessageRequest);

    @InterfaceC1501170pAR("/webcast/signaling/fallback/")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    C11NZ<PostUplinkBatchResponse> postUplinkBatch(@InterfaceC1485405rg PostUplinkBatchRequest postUplinkBatchRequest);
}
