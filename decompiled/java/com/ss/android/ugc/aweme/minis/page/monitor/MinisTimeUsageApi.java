package com.ss.android.ugc.aweme.minis.page.monitor;

import X.C0CQT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC2661011f;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: loaded from: classes.dex */
public final class MinisTimeUsageApi implements IMinisTimeUsageApi {
    public static final MinisTimeUsageApi LIZIZ = new MinisTimeUsageApi();
    public final /* synthetic */ IMinisTimeUsageApi LIZ;

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimeUsageApi
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/minis/usage_time")
    public Object reportMinisTimeUsage(@InterfaceC1501050pAF("client_key") String str, @InterfaceC1501050pAF("session_usage_time_seconds") long j, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn) {
        return this.LIZ.reportMinisTimeUsage(str, j, interfaceC1364105Vn);
    }

    public MinisTimeUsageApi() {
        InterfaceC2661011f interfaceC2661011fLIZ;
        IMinisTimeUsageApi iMinisTimeUsageApi;
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        this.LIZ = (iRetrofitFactory == null || (interfaceC2661011fLIZ = iRetrofitFactory.LIZ(C0CQT.LIZJ)) == null || (iMinisTimeUsageApi = (IMinisTimeUsageApi) interfaceC2661011fLIZ.create(IMinisTimeUsageApi.class)) == null) ? new IMinisTimeUsageApi() { // from class: X.01OK
            @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimeUsageApi
            public final Object reportMinisTimeUsage(String str, long j, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn) {
                return new BaseResponse();
            }
        } : iMinisTimeUsageApi;
    }
}
