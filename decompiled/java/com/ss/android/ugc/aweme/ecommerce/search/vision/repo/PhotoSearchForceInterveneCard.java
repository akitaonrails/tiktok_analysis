package com.ss.android.ugc.aweme.ecommerce.search.vision.repo;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes11.dex */
public final class PhotoSearchForceInterveneCard {

    @C09CT("author_id")
    public final String authorId;

    @C09CT("live_room_id")
    public final String liveRoomId;

    @C09CT("position")
    public final int position;

    @C09CT("product_id")
    public final String productId;

    @C09CT("type")
    public final int type;

    @C09CT("video_id")
    public final String videoId;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoSearchForceInterveneCard(productId=");
        sbLIZ.append(this.productId);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", position=");
        sbLIZ.append(this.position);
        sbLIZ.append(", liveRoomId=");
        sbLIZ.append(this.liveRoomId);
        sbLIZ.append(", videoId=");
        sbLIZ.append(this.videoId);
        sbLIZ.append(", authorId=");
        sbLIZ.append(this.authorId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PhotoSearchForceInterveneCard(String str, int i, int i2, String str2, String str3, String str4) {
        this.productId = str;
        this.type = i;
        this.position = i2;
        this.liveRoomId = str2;
        this.videoId = str3;
        this.authorId = str4;
    }
}
