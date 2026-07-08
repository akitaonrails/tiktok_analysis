package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class RoomExtra {

    @C09CT("deprecated1")
    public EnterRegionMatch deprecated1;

    @C09CT("is_sandbox")
    public Boolean isSandbox;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.isSandbox != null) {
            sb.append(", is_sandbox=");
            sb.append(this.isSandbox);
        }
        if (this.deprecated1 != null) {
            sb.append(", deprecated1=");
            sb.append(this.deprecated1);
        }
        sb.replace(0, 2, "RoomExtra{");
        sb.append('}');
        return sb.toString();
    }
}
