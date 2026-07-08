package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class HighQualityBoostInfoV2 implements Serializable {

    @C09CT("description")
    public final String description;

    @C09CT("hot_request_count")
    public final Long hotRequestCount;

    @C09CT("is_hq_photo_boost")
    public final Boolean isHqPhotoBoost;

    @C09CT("link")
    public final String link;

    @C09CT("photo_queue_hot_request_cnt")
    public final Long photoQueueHotRequestCnt;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HighQualityBoostInfoV2(description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", link=");
        sbLIZ.append(this.link);
        sbLIZ.append(", isHqPhotoBoost=");
        sbLIZ.append(this.isHqPhotoBoost);
        sbLIZ.append(", photoQueueHotRequestCnt=");
        sbLIZ.append(this.photoQueueHotRequestCnt);
        sbLIZ.append(", hotRequestCount=");
        sbLIZ.append(this.hotRequestCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean isHqPhotoBoost() {
        return this.isHqPhotoBoost;
    }

    public HighQualityBoostInfoV2(String str, String str2, Boolean bool, Long l, Long l2) {
        this.description = str;
        this.link = str2;
        this.isHqPhotoBoost = bool;
        this.photoQueueHotRequestCnt = l;
        this.hotRequestCount = l2;
    }
}
