package com.bytedance.android.livesdk.model.message;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class LinkerCreateContent {

    @C09CT("link_type")
    public Long linkType;

    @C09CT("owner_id")
    public Long ownerId;

    @C09CT("owner_room_id")
    public Long ownerRoomId;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.ownerId != null) {
            sb.append(", owner_id=");
            sb.append(this.ownerId);
        }
        if (this.ownerRoomId != null) {
            sb.append(", owner_room_id=");
            sb.append(this.ownerRoomId);
        }
        if (this.linkType != null) {
            sb.append(", link_type=");
            sb.append(this.linkType);
        }
        sb.replace(0, 2, "LinkerCreateContent{");
        sb.append('}');
        return sb.toString();
    }
}
