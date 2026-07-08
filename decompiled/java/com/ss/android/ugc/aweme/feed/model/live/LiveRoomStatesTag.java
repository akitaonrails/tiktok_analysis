package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class LiveRoomStatesTag {

    @C09CT("tag_key")
    public String tagKey;

    @C09CT("tag_value")
    public String tagValue;

    public LiveRoomStatesTag() {
    }

    public final void setTagKey(String str) {
        this.tagKey = str;
    }

    public final void setTagValue(String str) {
        this.tagValue = str;
    }

    public LiveRoomStatesTag(String str, String str2) {
        this.tagKey = str;
        this.tagValue = str2;
    }
}
