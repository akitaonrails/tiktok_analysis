package com.ss.android.ugc.aweme.poi.content.poicampaign;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes19.dex */
public final class CampaignInfo {

    @C09CT("service_agreement_content")
    public final String agreement;

    @C09CT("content_bg_color")
    public final String contentBgColor;

    @C09CT("content_bg_img")
    public final String contentBgImg;

    @C09CT("end_time")
    public final Long endTime;

    @C09CT("direction_hand_img")
    public final String handImg;

    @C09CT("header_cover_img")
    public final String headerCoverImg;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final Long id;

    @C09CT("share_bg_img")
    public final String shareBgImg;

    @C09CT("star_img")
    public final String starImage;

    @C09CT("start_time")
    public final Long startTime;

    public CampaignInfo(Long l, String str, String str2, String str3, String str4, String str5, String str6, Long l2, Long l3, String str7) {
        this.id = l;
        this.starImage = str;
        this.headerCoverImg = str2;
        this.contentBgImg = str3;
        this.handImg = str4;
        this.contentBgColor = str5;
        this.shareBgImg = str6;
        this.startTime = l2;
        this.endTime = l3;
        this.agreement = str7;
    }
}
