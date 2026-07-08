package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class ListParams {

    @C09CT("anchor_id")
    public Long anchorId;

    @C09CT("count")
    public Long count;

    @C09CT("enable_pagination")
    public Boolean enablePagination;

    @C09CT("link_status")
    public Long linkStatus;

    @C09CT("link_type")
    public Long linkType;

    @C09CT("modify_time_after")
    public Long modifyTimeAfter;

    @C09CT("offset")
    public Long offset;

    @C09CT("room_id")
    public Long roomId;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.roomId != null) {
            sb.append(", room_id=");
            sb.append(this.roomId);
        }
        if (this.linkStatus != null) {
            sb.append(", link_status=");
            sb.append(this.linkStatus);
        }
        if (this.offset != null) {
            sb.append(", offset=");
            sb.append(this.offset);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.anchorId != null) {
            sb.append(", anchor_id=");
            sb.append(this.anchorId);
        }
        if (this.linkType != null) {
            sb.append(", link_type=");
            sb.append(this.linkType);
        }
        if (this.enablePagination != null) {
            sb.append(", enable_pagination=");
            sb.append(this.enablePagination);
        }
        if (this.modifyTimeAfter != null) {
            sb.append(", modify_time_after=");
            sb.append(this.modifyTimeAfter);
        }
        sb.replace(0, 2, "ListParams{");
        sb.append('}');
        return sb.toString();
    }
}
