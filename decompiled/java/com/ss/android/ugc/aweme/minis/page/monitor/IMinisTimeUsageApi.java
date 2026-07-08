package com.ss.android.ugc.aweme.minis.page.monitor;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes.dex */
public interface IMinisTimeUsageApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/minis/usage_time")
    Object reportMinisTimeUsage(@InterfaceC1501050pAF("client_key") String str, @InterfaceC1501050pAF("session_usage_time_seconds") long j, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);
}
