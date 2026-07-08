package com.bytedance.android.livesdk.rank.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class RankEntranceV3RequestParams {

    @C09CT("anchor_id")
    public Long anchorId;

    @C09CT("room_id")
    public Long roomId;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.anchorId != null) {
            sb.append(", anchor_id=");
            sb.append(this.anchorId);
        }
        if (this.roomId != null) {
            sb.append(", room_id=");
            sb.append(this.roomId);
        }
        sb.replace(0, 2, "RankEntranceV2RequestParams{");
        sb.append('}');
        return sb.toString();
    }
}
