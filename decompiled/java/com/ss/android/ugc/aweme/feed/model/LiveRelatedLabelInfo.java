package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class LiveRelatedLabelInfo implements Serializable {

    @C09CT("label_type")
    public String labelType;

    @C09CT("related_room_id")
    public long relatedRoomId;

    public LiveRelatedLabelInfo() {
        this(null, 0L);
    }

    public LiveRelatedLabelInfo(String str, long j) {
        this.labelType = str;
        this.relatedRoomId = j;
    }
}
