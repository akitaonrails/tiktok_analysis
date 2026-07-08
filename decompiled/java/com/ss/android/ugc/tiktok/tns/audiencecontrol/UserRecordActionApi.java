package com.ss.android.ugc.tiktok.tns.audiencecontrol;

import X.C0TWQ;
import X.C11NZ;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes13.dex */
public interface UserRecordActionApi {
    public static final C0TWQ LIZ = C0TWQ.LIZ;

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/user/record_action")
    C11NZ<BaseResponse> recordAction(@InterfaceC1501050pAF("action_type") String str);
}
