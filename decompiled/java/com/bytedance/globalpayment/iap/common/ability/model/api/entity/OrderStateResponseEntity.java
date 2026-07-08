package com.bytedance.globalpayment.iap.common.ability.model.api.entity;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes28.dex */
public class OrderStateResponseEntity extends ResponseEntity {

    @JsonName("data")
    public Data data;

    public static class Data {

        @JsonName("request_id")
        public String orderId;

        @JsonName(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public String status;

        @JsonName("track_id")
        public String trackId;
    }
}
