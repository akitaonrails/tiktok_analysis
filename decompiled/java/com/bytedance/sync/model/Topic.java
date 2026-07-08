package com.bytedance.sync.model;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes14.dex */
public class Topic {

    @C09CT("business")
    public final long business;

    /* JADX INFO: renamed from: did, reason: collision with root package name */
    @C09CT("deviceid")
    public String f333did;

    @C09CT("topic")
    public final String topic;

    @C09CT("secuid")
    public String uid;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Topic{topic='");
        sbLIZ.append(this.topic);
        sbLIZ.append('\'');
        sbLIZ.append(", business=");
        sbLIZ.append(this.business);
        sbLIZ.append(", did='");
        sbLIZ.append(this.f333did);
        sbLIZ.append('\'');
        sbLIZ.append(", uid='");
        sbLIZ.append(this.uid);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Topic(String str, long j) {
        this.topic = str;
        this.business = j;
    }
}
