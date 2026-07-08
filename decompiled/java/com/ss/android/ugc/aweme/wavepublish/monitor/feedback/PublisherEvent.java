package com.ss.android.ugc.aweme.wavepublish.monitor.feedback;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class PublisherEvent {

    @C09CT("aweme_type")
    public final int awemeType;

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("event_name")
    public final String eventName;

    @C09CT("publish_id")
    public final String publishId;

    @C09CT("timestamp")
    public final long timestamp;

    @C09CT("timezone")
    public final String timezone;

    @C09CT("utc_time")
    public final String utcTime;

    @C09CT("update_version_code")
    public final int versionCode;

    public PublisherEvent(String str, String str2, String str3, int i, long j, String str4, String str5, int i2) {
        this.eventName = str;
        this.publishId = str2;
        this.creationId = str3;
        this.versionCode = i;
        this.timestamp = j;
        this.utcTime = str4;
        this.timezone = str5;
        this.awemeType = i2;
    }
}
