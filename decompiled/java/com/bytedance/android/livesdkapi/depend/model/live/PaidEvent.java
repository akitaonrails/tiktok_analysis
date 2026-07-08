package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class PaidEvent {

    @C09CT("event_id")
    public Long eventId = 0L;

    @C09CT("paid_type")
    public int paidType;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.eventId != null) {
            sb.append(", event_id=");
            sb.append(this.eventId);
        }
        sb.append(", paid_type=");
        sb.append(this.paidType);
        sb.replace(0, 2, "PaidEvent{");
        sb.append('}');
        return sb.toString();
    }
}
