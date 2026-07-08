package com.bytedance.android.livesdk.subscribe.model;

import X.C09CT;
import emotes.model.SubEmoteDetailResult;

/* JADX INFO: loaded from: classes.dex */
public final class GetSubEmoteDetailResponse {

    @C09CT("data")
    public SubEmoteDetailResult data;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        sb.replace(0, 2, "GetSubEmoteDetailResponse{");
        sb.append('}');
        return sb.toString();
    }
}
