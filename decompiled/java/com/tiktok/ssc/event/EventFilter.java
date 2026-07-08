package com.tiktok.ssc.event;

import X.EnumC993910byH;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class EventFilter {
    public final List<String> eventNames;
    public final List<EnumC993910byH> eventTypes;

    /* JADX WARN: Multi-variable type inference failed */
    public EventFilter(List<String> list, List<? extends EnumC993910byH> list2) {
        this.eventNames = list;
        this.eventTypes = list2;
    }
}
