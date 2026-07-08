package com.ss.android.ugc.aweme.feed.model.survey;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes24.dex */
public final class FrequencyGroup implements Serializable {

    @C09CT("max_count")
    public final int count;

    @C09CT("group_name")
    public final String groupName;

    @C09CT("interval")
    public final int interval;

    public FrequencyGroup() {
        this("", 604800, 1);
    }

    public FrequencyGroup(String str, int i, int i2) {
        this.groupName = str;
        this.interval = i;
        this.count = i2;
    }
}
