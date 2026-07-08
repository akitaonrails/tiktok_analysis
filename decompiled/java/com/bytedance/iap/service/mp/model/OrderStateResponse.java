package com.bytedance.iap.service.mp.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes28.dex */
public final class OrderStateResponse {

    @C09CT("data")
    public Data data;

    @C09CT("error_code")
    public Integer errorCode;

    @C09CT("message")
    public String message;

    public static final class Data {

        @C09CT("request_id")
        public String orderId;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public String status;
    }
}
