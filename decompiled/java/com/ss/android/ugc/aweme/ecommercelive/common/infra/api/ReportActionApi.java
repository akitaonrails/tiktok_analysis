package com.ss.android.ugc.aweme.ecommercelive.common.infra.api;

import X.C09CT;
import X.C0NT3;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;

/* JADX INFO: loaded from: classes10.dex */
public interface ReportActionApi {
    public static final C0NT3 LIZ = C0NT3.LIZ;

    @InterfaceC1501170pAR("/api/live_creator/v1/live_creator/report_action")
    Object reportAction(@InterfaceC1485405rg ReportActionRequest reportActionRequest, InterfaceC1364105Vn<? super BaseResponse<Object>> interfaceC1364105Vn);

    public static final class ReportActionRequest {

        @C09CT("callback_scene")
        public final Integer scene;

        public ReportActionRequest(Integer num) {
            this.scene = num;
        }
    }
}
