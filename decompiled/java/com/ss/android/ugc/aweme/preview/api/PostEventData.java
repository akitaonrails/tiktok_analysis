package com.ss.android.ugc.aweme.preview.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PostEventData {

    @C09CT("event")
    public final String event;

    @C09CT("post_event_type")
    public final Integer postEventType;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostEventData)) {
            return false;
        }
        PostEventData postEventData = (PostEventData) obj;
        return Intrinsics.LJFF(this.postEventType, postEventData.postEventType) && Intrinsics.LJFF(this.event, postEventData.event);
    }

    public final int hashCode() {
        Integer num = this.postEventType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.event;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PostEventData(postEventType=");
        sbLIZ.append(this.postEventType);
        sbLIZ.append(", event=");
        sbLIZ.append(this.event);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PostEventData(Integer num, String str) {
        this.postEventType = num;
        this.event = str;
    }
}
