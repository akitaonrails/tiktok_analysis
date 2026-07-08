package com.bytedance.geckox.statistic.model;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public class EventMessageModel {

    @C09CT("access_key")
    public String accessKey;

    @C09CT("channels")
    public String channels;

    @C09CT("duration")
    public long duration;

    @C09CT("err_msg")
    public String errMsg;

    @C09CT("event_type")
    public int eventType;

    @C09CT("extra")
    public String extra;

    @C09CT("sub_type")
    public int subType;

    public void setAccessKey(String str) {
        this.accessKey = str;
    }

    public void setChannels(String str) {
        this.channels = str;
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setErrMsg(String str) {
        this.errMsg = str;
    }

    public void setEventType(int i) {
        this.eventType = i;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setSubType(int i) {
        this.subType = i;
    }

    public EventMessageModel(int i, int i2) {
        this.eventType = i;
        this.subType = i2;
    }
}
