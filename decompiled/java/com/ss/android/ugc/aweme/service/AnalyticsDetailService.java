package com.ss.android.ugc.aweme.service;

import X.AbstractC19484711Kz;
import X.C424280GkM;
import X.C7740030o;
import X.InterfaceC1615920s9W;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inteceptor.AnalyticsDetailInterceptor;
import com.ss.android.ugc.aweme.model.InsightTypeRequest;
import com.ss.android.ugc.aweme.model.InsightTypeResponse;
import com.ss.android.ugc.aweme.model.InsightTypeResponseV2;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class AnalyticsDetailService implements IAnalyticsDetailService {
    public final InterfaceC1615920s9W LIZ;
    public final Gson LIZIZ;

    @Override // com.ss.android.ugc.aweme.service.IAnalyticsDetailService
    public final AnalyticsDetailInterceptor LIZIZ() {
        return new AnalyticsDetailInterceptor();
    }

    public AnalyticsDetailService() {
        InterfaceC1615920s9W.LIZ.getClass();
        this.LIZ = (InterfaceC1615920s9W) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(Api.LIZ).create(InterfaceC1615920s9W.class);
        this.LIZIZ = C7740030o.LIZ().getGson();
    }

    @Override // com.ss.android.ugc.aweme.service.IAnalyticsDetailService
    public final C424280GkM LIZ(Context context) {
        return new C424280GkM(context);
    }

    @Override // com.ss.android.ugc.aweme.service.IAnalyticsDetailService
    public final AbstractC19484711Kz<InsightTypeResponse> LIZJ(List<InsightTypeRequest> list) {
        return this.LIZ.LIZIZ(GsonProtectorUtils.toJson(this.LIZIZ, list));
    }

    @Override // com.ss.android.ugc.aweme.service.IAnalyticsDetailService
    public final AbstractC19484711Kz<InsightTypeResponseV2> LIZLLL(List<InsightTypeRequest> list) {
        return this.LIZ.LIZ(GsonProtectorUtils.toJson(this.LIZIZ, list));
    }
}
