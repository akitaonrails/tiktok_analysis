package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class RivalsResponse {

    @C09CT("data")
    public RivalsListsData data;

    @C09CT("extra")
    public RivalsListExtra extra;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        sb.replace(0, 2, "RivalsResponse{");
        sb.append('}');
        return sb.toString();
    }
}
