package com.ss.android.ugc.aweme.preview.api;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class QualityAdvisorSubmitEventRequest {

    @C09CT("events")
    public final List<PostEventData> events;

    @C09CT("post_item_id")
    public final String postItemId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QualityAdvisorSubmitEventRequest)) {
            return false;
        }
        QualityAdvisorSubmitEventRequest qualityAdvisorSubmitEventRequest = (QualityAdvisorSubmitEventRequest) obj;
        return Intrinsics.LJFF(this.postItemId, qualityAdvisorSubmitEventRequest.postItemId) && Intrinsics.LJFF(this.events, qualityAdvisorSubmitEventRequest.events);
    }

    public final int hashCode() {
        String str = this.postItemId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<PostEventData> list = this.events;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QualityAdvisorSubmitEventRequest(postItemId=");
        sbLIZ.append(this.postItemId);
        sbLIZ.append(", events=");
        sbLIZ.append(this.events);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public QualityAdvisorSubmitEventRequest(String str, List<PostEventData> list) {
        this.postItemId = str;
        this.events = list;
    }
}
