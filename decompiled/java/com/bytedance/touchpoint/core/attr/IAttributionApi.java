package com.bytedance.touchpoint.core.attr;

import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.bytedance.touchpoint.api.model.AttributionBody;
import com.bytedance.touchpoint.api.model.AttributionResponse;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes29.dex */
public interface IAttributionApi {
    @InterfaceC1501170pAR("/tiktok/touchpoint/platform/touchpoint/report_media_source/v1/")
    ListenableFuture<AttributionResponse> confirmAttribution(@InterfaceC1485405rg AttributionBody attributionBody);
}
