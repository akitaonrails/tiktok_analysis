package com.ss.android.ugc.aweme.ad.comment.reviewtab.vm;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class PublishReviewRequest implements Serializable {

    @C09CT("convert_ad_id")
    public final long convertAdId;

    @C09CT("convert_app_id")
    public final Long convertAppId;

    @C09CT("convert_creative_id")
    public final long convertCreativeId;

    @C09CT("convert_external_url")
    public final String convertExternalUrl;

    @C09CT("convert_id")
    public final String convertId;

    @C09CT("convert_item_id")
    public final long convertItemId;

    @C09CT("nickname")
    public final String nickname;

    @C09CT("text")
    public final String text;

    @C09CT("user_id")
    public final long userId;

    public PublishReviewRequest() {
        this(0L, 0L, null, null, null, 0L, 0L, "", "");
    }

    public final long getConvertAdId() {
        return this.convertAdId;
    }

    public final Long getConvertAppId() {
        return this.convertAppId;
    }

    public final long getConvertCreativeId() {
        return this.convertCreativeId;
    }

    public final String getConvertExternalUrl() {
        return this.convertExternalUrl;
    }

    public final String getConvertId() {
        return this.convertId;
    }

    public final long getConvertItemId() {
        return this.convertItemId;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getText() {
        return this.text;
    }

    public final long getUserId() {
        return this.userId;
    }

    public PublishReviewRequest(long j, long j2, Long l, String str, String str2, long j3, long j4, String str3, String str4) {
        this.convertAdId = j;
        this.convertCreativeId = j2;
        this.convertAppId = l;
        this.convertExternalUrl = str;
        this.convertId = str2;
        this.convertItemId = j3;
        this.userId = j4;
        this.nickname = str3;
        this.text = str4;
    }
}
