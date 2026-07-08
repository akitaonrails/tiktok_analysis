package com.bytedance.android.livesdk.chatroom.model.interact.audience;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GetSettingsParams {

    @C09CT("get_ab_params")
    public Boolean getAbParams;

    @C09CT("owner_id")
    public Long ownerId;

    @C09CT("room_id")
    public Long roomId;

    @C09CT("sec_owner_id")
    public String secOwnerId;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.roomId != null) {
            sb.append(", room_id=");
            sb.append(this.roomId);
        }
        if (this.secOwnerId != null) {
            sb.append(", sec_owner_id=");
            sb.append(this.secOwnerId);
        }
        if (this.ownerId != null) {
            sb.append(", owner_id=");
            sb.append(this.ownerId);
        }
        if (this.getAbParams != null) {
            sb.append(", get_ab_params=");
            sb.append(this.getAbParams);
        }
        sb.replace(0, 2, "GetSettingsParams{");
        sb.append('}');
        return sb.toString();
    }
}
