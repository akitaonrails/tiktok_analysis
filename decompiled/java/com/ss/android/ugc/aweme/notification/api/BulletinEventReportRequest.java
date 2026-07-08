package com.ss.android.ugc.aweme.notification.api;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinEventReportRequest implements Serializable {
    public static final int $stable = 8;

    @C09CT("events")
    public final List<EventInfo> events;

    public BulletinEventReportRequest() {
        this(null);
    }

    public BulletinEventReportRequest(List<EventInfo> list) {
        this.events = list;
    }
}
