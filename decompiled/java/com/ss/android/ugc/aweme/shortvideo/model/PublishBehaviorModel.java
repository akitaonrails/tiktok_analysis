package com.ss.android.ugc.aweme.shortvideo.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes14.dex */
public final class PublishBehaviorModel {
    public final String code;
    public int idIndex = -1;
    public final String info;
    public final String publishId;
    public final String stage;
    public final long timeStamp;
    public final BehaviorType type;

    public final String getSimpleTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-HHmmss", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC+0"));
        return simpleDateFormat.format(new Date(this.timeStamp));
    }

    public final String getCode() {
        return this.code;
    }

    public final int getIdIndex() {
        return this.idIndex;
    }

    public final String getInfo() {
        return this.info;
    }

    public final String getPublishId() {
        return this.publishId;
    }

    public final String getStage() {
        return this.stage;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final BehaviorType getType() {
        return this.type;
    }

    public final void setIdIndex(int i) {
        this.idIndex = i;
    }

    public PublishBehaviorModel(long j, String str, BehaviorType behaviorType, String str2, String str3, String str4) {
        this.timeStamp = j;
        this.publishId = str;
        this.type = behaviorType;
        this.stage = str2;
        this.code = str3;
        this.info = str4;
    }
}
