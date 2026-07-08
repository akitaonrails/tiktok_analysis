package com.ss.android.ugc.aweme.minis.request;

import X.C040I;
import X.C11NZ;
import X.C1232840iBe;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.minis.model.metrics.MinisMetricsRequest;
import com.ss.android.ugc.aweme.minis.model.metrics.MinisMetricsResponse;

/* JADX INFO: loaded from: classes20.dex */
public interface IMetricsApi {
    public static final C1232840iBe LIZ = C1232840iBe.LIZ;

    @InterfaceC1501170pAR("/tiktok/minis/emit")
    C11NZ<MinisMetricsResponse> reportMetrics(@C040I MinisMetricsRequest minisMetricsRequest);
}
