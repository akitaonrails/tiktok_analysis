package com.bytedance.android.livesdk.goal.model;

import X.C09CT;
import com.bytedance.android.livesdk.gift.model.LiveStreamSubGoal;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SubGoalRecommendInfo {

    @C09CT("description")
    public String description = "";

    @C09CT("gallery_goal_rec_extra")
    public GalleryGoalRecExtra galleryGoalRecExtra;

    @C09CT("items")
    public List<LiveStreamSubGoal> items;

    @C09CT("stream_goal_rec_extra")
    public StreamGoalRecExtra streamGoalRecExtra;

    @C09CT("subscription_rec_extra")
    public SubscriptionGoalRecExtra subscriptionRecExtra;

    @C09CT("type")
    public int type;
}
