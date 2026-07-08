package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class FeedAdsVideo {

    @C09CT("cid")
    public final String cid;

    @C09CT("item_id")
    public final String itemId;

    @C09CT("req_id")
    public final String reqId;

    @C09CT("reward_duration")
    public final int rewardDuration;

    @C09CT("rewards")
    public final int rewards;

    @C09CT("rit")
    public final String rit;

    @C09CT("task_event_key")
    public final String taskEventKey;

    @C09CT("timestamp")
    public final long timeStamp;

    public FeedAdsVideo() {
        this("", "", "", "", 0, "", 0, 0L);
    }

    public FeedAdsVideo(String str, String str2, String str3, String str4, int i, String str5, int i2, long j) {
        this.itemId = str;
        this.reqId = str2;
        this.cid = str3;
        this.rit = str4;
        this.rewards = i;
        this.taskEventKey = str5;
        this.rewardDuration = i2;
        this.timeStamp = j;
    }
}
