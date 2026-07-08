package com.ss.android.ugc.aweme.sticker.data;

import X.C09CT;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.Serializable;

/* JADX INFO: loaded from: classes30.dex */
public final class CountDownStickerStruct implements Serializable {

    @C09CT("background_message")
    public BackgroundMessage backgroundMessage;

    @C09CT("business_type")
    public String businessType;

    @C09CT("event_id")
    public long eventId;

    @C09CT("end_time")
    public Long expiredTime;

    @C09CT("is_subscribed")
    public Boolean subscribe;

    @C09CT("subscribe_count")
    public long subscribeNum;

    @C09CT("text_already_ended")
    public String textAlreadyExpired;

    @C09CT("text_already_subscribed")
    public String textAlreadySubscribed;

    @C09CT("text_to_be_subscribed")
    public String textTobeSubscribed;

    @C09CT("title")
    public String title;

    public CountDownStickerStruct() {
        this(null, 0L, 0L, Boolean.FALSE, "", "", "");
    }

    public final long getMillSecond() {
        Long l = this.expiredTime;
        if (l != null) {
            return l.longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        }
        return 0L;
    }

    public final BackgroundMessage getBackgroundMessage() {
        return this.backgroundMessage;
    }

    public final String getBusinessType() {
        return this.businessType;
    }

    public final long getEventId() {
        return this.eventId;
    }

    public final Long getExpiredTime() {
        return this.expiredTime;
    }

    public final Boolean getSubscribe() {
        return this.subscribe;
    }

    public final long getSubscribeNum() {
        return this.subscribeNum;
    }

    public final String getTextAlreadyExpired() {
        return this.textAlreadyExpired;
    }

    public final String getTextAlreadySubscribed() {
        return this.textAlreadySubscribed;
    }

    public final String getTextTobeSubscribed() {
        return this.textTobeSubscribed;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setBackgroundMessage(BackgroundMessage backgroundMessage) {
        this.backgroundMessage = backgroundMessage;
    }

    public final void setBusinessType(String str) {
        this.businessType = str;
    }

    public final void setEventId(long j) {
        this.eventId = j;
    }

    public final void setExpiredTime(Long l) {
        this.expiredTime = l;
    }

    public final void setSubscribe(Boolean bool) {
        this.subscribe = bool;
    }

    public final void setSubscribeNum(long j) {
        this.subscribeNum = j;
    }

    public final void setTextAlreadyExpired(String str) {
        this.textAlreadyExpired = str;
    }

    public final void setTextAlreadySubscribed(String str) {
        this.textAlreadySubscribed = str;
    }

    public final void setTextTobeSubscribed(String str) {
        this.textTobeSubscribed = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public CountDownStickerStruct(String str, long j, long j2, Boolean bool, String str2, String str3, String str4) {
        this.title = str;
        this.subscribeNum = j2;
        this.subscribe = bool;
        this.textAlreadyExpired = str2;
        this.textTobeSubscribed = str3;
        this.textAlreadySubscribed = str4;
        this.expiredTime = Long.valueOf(j);
        this.businessType = "";
    }
}
