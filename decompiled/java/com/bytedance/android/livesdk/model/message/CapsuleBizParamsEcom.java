package com.bytedance.android.livesdk.model.message;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class CapsuleBizParamsEcom {

    @C09CT("event_tracking")
    public EventTracking eventTracking;

    public static final class EventTracking {

        @C09CT("ecom_recomm_id")
        public String ecomRecommId = "";

        @C09CT("ecom_recomm_trigger")
        public String ecomRecommTrigger = "";
    }
}
