package com.ss.android.ugc.aweme.ad.recording.model;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class EngageInfo implements Cloneable {

    @C09CT("cid")
    public final String creativeId;

    @C09CT("label")
    public final String label;

    @C09CT("refer")
    public final String refer;

    @C09CT("tag")
    public final String tag;

    @C09CT("time_stamp")
    public final Long timeStamp;

    public final Object clone() {
        return new EngageInfo(this.tag, this.label, this.refer, this.creativeId, this.timeStamp);
    }

    public EngageInfo(String str, String str2, String str3, String str4, Long l) {
        this.tag = str;
        this.label = str2;
        this.refer = str3;
        this.creativeId = str4;
        this.timeStamp = l;
    }
}
