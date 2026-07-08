package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class InitParams {

    @C09CT("layout")
    public Long layout;

    @C09CT("linkmic_layout")
    public Long linkmicLayout;

    @C09CT("linkmic_vendor")
    public Long linkmicVendor;

    @C09CT("room_id")
    public Long roomId;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.roomId != null) {
            sb.append(", room_id=");
            sb.append(this.roomId);
        }
        if (this.linkmicVendor != null) {
            sb.append(", linkmic_vendor=");
            sb.append(this.linkmicVendor);
        }
        if (this.linkmicLayout != null) {
            sb.append(", linkmic_layout=");
            sb.append(this.linkmicLayout);
        }
        if (this.layout != null) {
            sb.append(", layout=");
            sb.append(this.layout);
        }
        sb.replace(0, 2, "InitParams{");
        sb.append('}');
        return sb.toString();
    }
}
