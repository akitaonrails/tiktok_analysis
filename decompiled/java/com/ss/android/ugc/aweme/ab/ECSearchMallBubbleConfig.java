package com.ss.android.ugc.aweme.ab;

import X.C01GW;
import X.C09CT;
import X.C0QZ0;
import X.C452501pT;

/* JADX INFO: loaded from: classes11.dex */
public final class ECSearchMallBubbleConfig {
    public static final ECSearchMallBubbleConfigModel LIZ = new ECSearchMallBubbleConfigModel(false, false, 0, true, true, true);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0QZ0());

    public static ECSearchMallBubbleConfigModel LIZ() {
        return (ECSearchMallBubbleConfigModel) LIZIZ.getValue();
    }

    public static final class ECSearchMallBubbleConfigModel {

        @C09CT("enable_after_feed_video_bubble")
        public final boolean enableAfterFeedVideoBubble;

        @C09CT("enable_after_feed_video_bubble_avoid_banner")
        public final boolean enableAfterFeedVideoBubbleAvoidBanner;

        @C09CT("enable_after_feed_video_bubble_avoid_comment")
        public final boolean enableAfterFeedVideoBubbleAvoidComment;

        @C09CT("enable_after_feed_video_bubble_is_ecom_intent")
        public final boolean enableAfterFeedVideoBubbleIsEcomIntent;

        @C09CT("enable_after_general_search_bubble")
        public final boolean enableAfterGeneralSearchBubble;

        @C09CT("feed_video_trigger_threshold")
        public final long feedVideoTriggerThreshold;

        public ECSearchMallBubbleConfigModel() {
            this(false, false, 0L, true, true, true);
        }

        public ECSearchMallBubbleConfigModel(boolean z, boolean z2, long j, boolean z3, boolean z4, boolean z5) {
            this.enableAfterGeneralSearchBubble = z;
            this.enableAfterFeedVideoBubble = z2;
            this.feedVideoTriggerThreshold = j;
            this.enableAfterFeedVideoBubbleIsEcomIntent = z3;
            this.enableAfterFeedVideoBubbleAvoidBanner = z4;
            this.enableAfterFeedVideoBubbleAvoidComment = z5;
        }
    }
}
