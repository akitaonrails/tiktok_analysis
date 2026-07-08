package com.ss.android.ugc.aweme.localservice.optimistic.base;

import X.C614850O9r;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public interface NetOptimisticApi {
    public static final C614850O9r LIZ = C614850O9r.LIZ;

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/poi/collect/v1")
    Object collectPoi(@InterfaceC1501050pAF("poi_id") String str, @InterfaceC1501050pAF("action") int i, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/aweme/v1/commit/item/digg/")
    Object diggAweme(@InterfaceC1501130pAN Map<String, String> map, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);
}
