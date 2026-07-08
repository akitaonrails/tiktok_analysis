package com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes9.dex */
public final class LiveRecordingsListHighlightItem {

    @C09CT("cover_url")
    public final String coverUrl;

    @C09CT("create_time")
    public final Long createTime;

    @C09CT("fragment_id")
    public final Long fragmentId;

    @C09CT("fragment_type")
    public final Long fragmentType;

    @C09CT("is_posted")
    public final Boolean isPosted;

    @C09CT("mp4_video_meta_info")
    public final VideoMetaInfo metaInfo;

    @C09CT("room_id")
    public final Long roomId;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveRecordingsListHighlightItem(fragmentId=");
        sbLIZ.append(this.fragmentId);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.roomId);
        sbLIZ.append(", fragmentType=");
        sbLIZ.append(this.fragmentType);
        sbLIZ.append(", coverUrl=");
        sbLIZ.append(this.coverUrl);
        sbLIZ.append(", createTime=");
        sbLIZ.append(this.createTime);
        sbLIZ.append(", isPosted=");
        sbLIZ.append(this.isPosted);
        sbLIZ.append(", metaInfo=");
        sbLIZ.append(this.metaInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LiveRecordingsListHighlightItem(Long l, Long l2, Long l3, String str, Long l4, Boolean bool, VideoMetaInfo videoMetaInfo) {
        this.fragmentId = l;
        this.roomId = l2;
        this.fragmentType = l3;
        this.coverUrl = str;
        this.createTime = l4;
        this.isPosted = bool;
        this.metaInfo = videoMetaInfo;
    }
}
