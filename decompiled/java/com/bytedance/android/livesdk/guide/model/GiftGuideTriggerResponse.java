package com.bytedance.android.livesdk.guide.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftGuideTriggerResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("gift_guide_message")
        public GiftGuideMessage giftGuideMessage;

        @C09CT("success")
        public boolean success;
    }
}
