package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PanelRefresh {

    @C09CT("fan_club")
    public FanClub fanClub;

    @C09CT("gallery_data")
    public Gallery galleryData;

    @C09CT("gift_id")
    public long giftId;

    @C09CT("price")
    public long price;

    @C09CT("timestamp")
    public long timestamp;

    @C09CT("user_level")
    public UserLevel userLevel;

    @C09CT("to_user_id")
    public Long toUserId = 0L;

    @C09CT("room_id")
    public Long roomId = 0L;

    @C09CT("all_gallery_data")
    public List<Gallery> allGalleryData = new ArrayList();

    public static final class FanClub {

        @C09CT("time_to_sleep")
        public long timeToSleep;
    }

    public static final class Gallery {

        @C09CT("can_sponsor")
        public boolean canSponsor;

        @C09CT("gift_id")
        public long giftId;

        @C09CT("goal_count")
        public long goalCount;

        @C09CT("is_gallery_available")
        public boolean isGalleryAvailable;

        @C09CT("left_count_to_sponsor")
        public long leftCountToSponsor;

        @C09CT("light_gift_up")
        public boolean lightGiftUp;

        @C09CT("sponsor_id")
        public long sponsorId;
    }

    public static final class UserLevel {

        @C09CT("current_level")
        public long currentLevel;

        @C09CT("current_score")
        public long currentScore;

        @C09CT("did_user_opt_out")
        public boolean didUserOptOut;

        @C09CT("is_upgrade")
        public boolean isUpgrade;

        @C09CT("score_left_to_level")
        public long scoreLeftToLevel;
    }
}
