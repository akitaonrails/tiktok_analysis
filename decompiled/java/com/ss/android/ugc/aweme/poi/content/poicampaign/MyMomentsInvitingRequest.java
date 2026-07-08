package com.ss.android.ugc.aweme.poi.content.poicampaign;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class MyMomentsInvitingRequest {

    @C09CT("campaign_id")
    public final Integer campaignId;

    @C09CT("invite_ucode")
    public final String inviterUID;

    @C09CT("poi_id")
    public final String poiID;

    @C09CT("video_id")
    public final String videoID;

    public MyMomentsInvitingRequest(Integer num, String str, String str2, String str3) {
        this.campaignId = num;
        this.inviterUID = str;
        this.videoID = str2;
        this.poiID = str3;
    }
}
