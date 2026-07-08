package com.bytedance.android.livesdk.goal.model;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class PinCardActionResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("gallery_goal_get_title_response")
        public GalleryGoalGetTitleResponse galleryGoalGetTitleResponse;

        @C09CT("subscription_goal_get_response")
        public SubscriptionGoalGetResponse subscriptionGoalGetResponse;

        public static final class GalleryGoalGetTitleResponse {

            @C09CT("gallery_opt_out_status")
            public int galleryOptOutStatus;

            @C09CT("gift_count_left")
            public long giftCountLeft;
        }

        public static final class SubscriptionGoalGetResponse {

            @C09CT("already_subscribed")
            public boolean alreadySubscribed;
        }
    }
}
