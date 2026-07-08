package com.bytedance.android.livesdk.performance.api;

import X.C11NZ;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import webcast.api.room.ClientPerformanceHarvestRequest;
import webcast.api.room.ClientPerformanceHarvestResponse;

/* JADX INFO: loaded from: classes18.dex */
public interface PerformanceApi {
    @InterfaceC1501170pAR("/webcast/room/client_performance_harvest/")
    C11NZ<ClientPerformanceHarvestResponse> postPerformanceInfo(@InterfaceC1485405rg ClientPerformanceHarvestRequest clientPerformanceHarvestRequest);
}
