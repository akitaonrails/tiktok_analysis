package com.bytedance.goda.v2.model.dto;

import X.C09CT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class GodaV2EventGroup {

    @C09CT("event_list")
    public final List<GodaV2Event> eventList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GodaV2EventGroup) && Intrinsics.LJFF(this.eventList, ((GodaV2EventGroup) obj).eventList);
    }

    public GodaV2EventGroup(List<GodaV2Event> list) {
        this.eventList = list;
    }
}
