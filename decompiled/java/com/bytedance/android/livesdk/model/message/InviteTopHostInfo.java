package com.bytedance.android.livesdk.model.message;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class InviteTopHostInfo {

    @C09CT("rank_type")
    public String rankType;

    @C09CT("top_index")
    public Long topIndex;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.rankType != null) {
            sb.append(", rank_type=");
            sb.append(this.rankType);
        }
        if (this.topIndex != null) {
            sb.append(", top_index=");
            sb.append(this.topIndex);
        }
        sb.replace(0, 2, "InviteTopHostInfo{");
        sb.append('}');
        return sb.toString();
    }
}
