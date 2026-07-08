package com.ss.android.ugc.aweme.service;

import X.AbstractC19484711Kz;
import X.C424280GkM;
import android.content.Context;
import com.ss.android.ugc.aweme.inteceptor.AnalyticsDetailInterceptor;
import com.ss.android.ugc.aweme.model.InsightTypeRequest;
import com.ss.android.ugc.aweme.model.InsightTypeResponse;
import com.ss.android.ugc.aweme.model.InsightTypeResponseV2;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public interface IAnalyticsDetailService {
    C424280GkM LIZ(Context context);

    AnalyticsDetailInterceptor LIZIZ();

    AbstractC19484711Kz<InsightTypeResponse> LIZJ(List<InsightTypeRequest> list);

    AbstractC19484711Kz<InsightTypeResponseV2> LIZLLL(List<InsightTypeRequest> list);
}
