package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.minute_game.model.Contributor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class MinuteGameGetAchievementResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("footy_fever_achievement")
        public FootyFeverAchievement footyFeverAchievement;

        @C09CT("steady_on_the_ball_achievement")
        public SteadyOnTheBallAchievement steadyOnTheBallAchievement;

        @C09CT("trigger_gift")
        public Gift triggerGift;

        @C09CT("prop_gifts")
        public List<Gift> propGifts = new ArrayList();

        @C09CT("highlights")
        public List<Highlight> highlights = new ArrayList();
    }

    /* JADX INFO: loaded from: classes36.dex */
    public static final class FootyFeverAchievement {

        @C09CT("best_performance")
        public int bestPerformance;

        @C09CT("highest_score")
        public long highestScore;

        @C09CT("total_count")
        public long totalCount;
    }

    public static final class Gift {

        @C09CT("gift_id")
        public long giftId;

        @C09CT("gift_name")
        public String giftName = "";

        @C09CT("icon")
        public ImageModel icon;

        @C09CT("price")
        public long price;
    }

    public static final class Highlight {

        @C09CT("gameplay_id")
        public long gameplayId;

        @C09CT("item_id")
        public long itemId;

        @C09CT("video_url")
        public String videoUrl = "";

        @C09CT("cover_url")
        public String coverUrl = "";

        @C09CT("description")
        public String description = "";

        @C09CT("top_contributors")
        public List<Contributor> topContributors = new ArrayList();
    }

    /* JADX INFO: loaded from: classes36.dex */
    public static final class SteadyOnTheBallAchievement {

        @C09CT("best_performance")
        public int bestPerformance;

        @C09CT("highest_score")
        public long highestScore;

        @C09CT("total_count")
        public long totalCount;
    }
}
