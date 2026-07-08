package com.bytedance.android.livesdk.envelope.model;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class EnvelopeListResponse {

    @C09CT("data")
    public RedEnvelopeListResponse data;

    public static final class ExtraInfo {

        @C09CT("room_operation_region")
        public String roomOperationRegion = "";

        @C09CT("anchor_priority_region")
        public String anchorPriorityRegion = "";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        sb.replace(0, 2, "EnvelopeListResponse{");
        sb.append('}');
        return sb.toString();
    }
}
