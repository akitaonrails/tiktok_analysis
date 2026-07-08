package com.ss.android.ugc.aweme.ecommercelive.audience.sea.feed.taskcard.data;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class LogTaskEventRequest {

    @C09CT("task_events")
    public final List<TaskEvent> taskEvents;

    public LogTaskEventRequest() {
        this(null);
    }

    public LogTaskEventRequest(List<TaskEvent> list) {
        this.taskEvents = list;
    }
}
