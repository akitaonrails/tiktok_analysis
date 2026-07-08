package com.bytedance.android.livesdk.goal.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class GetV2Response {

    @C09CT("data")
    public Data data;

    public static final class CommonTab {

        @C09CT("additional_info")
        public GoalAdditionalInfo additionalInfo;

        @C09CT("current_user_progress")
        public CurrentUserProgress currentUserProgress;

        @C09CT("description_type")
        public int descriptionType;

        @C09CT("goal_preset_descriptions_starling_keys")
        public List<String> goalPresetDescriptionsStarlingKeys = new ArrayList();

        @C09CT("is_contributor")
        public boolean isContributor;

        @C09CT("is_new_user")
        public boolean isNewUser;

        @C09CT("ongoing_goal")
        public LiveStreamGoal ongoingGoal;

        @C09CT("pin")
        public Pin pin;

        @C09CT("recommend_info")
        public SubGoalRecommendInfo recommendInfo;

        @C09CT("tab_status")
        public int tabStatus;

        public static final class CurrentUserProgress {

            @C09CT("contribution")
            public long contribution;
        }
    }

    public static final class Data {

        @C09CT("anchor_ab_params")
        public Map<String, String> anchorAbParams = new LinkedHashMap();

        @C09CT("audience")
        public Audience audience;

        @C09CT("flash_tab")
        public FlashTab flashTab;

        @C09CT("gallery_tab")
        public GalleryTab galleryTab;

        @C09CT("gift_tab")
        public GiftTab giftTab;

        @C09CT("is_user_opt_out_contributor")
        public boolean isUserOptOutContributor;

        @C09CT("owner")
        public GoalOwner owner;

        @C09CT("subscription_tab")
        public SubscriptionTab subscriptionTab;

        /* JADX INFO: loaded from: classes.dex */
        public static final class Audience {

            @C09CT("image")
            public ImageModel image;
        }
    }

    public static final class FlashTab {

        @C09CT("common")
        public CommonTab common;
    }

    public static final class GalleryTab {

        @C09CT("auto_create")
        public int autoCreate;

        @C09CT("common")
        public CommonTab common;

        @C09CT("gallery_tab_extra")
        public String galleryTabExtra = "";

        @C09CT("gift_gallery_gray_icon")
        public ImageModel giftGalleryGrayIcon;

        public static final class GalleryTabExtra {

            @C09CT("gallery_all_lit_up")
            public boolean galleryAllLitUp;

            @C09CT("viewer_current_sent_count")
            public long viewerCurrentSentCount;

            @C09CT("viewer_is_sponsor")
            public boolean viewerIsSponsor;

            @C09CT("viewer_optout_status")
            public int viewerOptoutStatus;
        }
    }

    public static final class GiftTab {

        @C09CT("auto_create")
        public int autoCreate;

        @C09CT("can_set_vote")
        public boolean canSetVote;

        @C09CT("challenge_info")
        public ChallengeInfo challengeInfo;

        @C09CT("common")
        public CommonTab common;

        public static final class ChallengeInfo {

            @C09CT("challenge_duration")
            public long challengeDuration;

            @C09CT("flare_cards_remaining")
            public long flareCardsRemaining;

            @C09CT("goals")
            public List<LiveStreamGoal> goals = new ArrayList();

            @C09CT("received_flare_card_award")
            public boolean receivedFlareCardAward;

            @C09CT("reward_duration")
            public long rewardDuration;
        }
    }

    public static final class Pin {

        @C09CT("cold_down")
        public boolean coldDown;

        @C09CT("pin_end_time")
        public long pinEndTime;

        @C09CT("ready_time")
        public long readyTime;
    }

    public static final class SubscriptionTab {

        @C09CT("common")
        public CommonTab common;

        @C09CT("monthly_pricing")
        public String monthlyPricing = "";

        @C09CT("subscribed")
        public boolean subscribed;

        @C09CT("subscriber_count")
        public long subscriberCount;
    }
}
