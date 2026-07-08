package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class EventStatusEnum {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ EventStatusEnum[] $VALUES;
    public final int status;
    public static final EventStatusEnum Event_Created = new EventStatusEnum("Event_Created", 0, 1);
    public static final EventStatusEnum Event_Reviewing = new EventStatusEnum("Event_Reviewing", 1, 2);
    public static final EventStatusEnum Event_Review_Failed = new EventStatusEnum("Event_Review_Failed", 2, 3);
    public static final EventStatusEnum Event_Upcoming = new EventStatusEnum("Event_Upcoming", 3, 4);
    public static final EventStatusEnum Event_Started = new EventStatusEnum("Event_Started", 4, 5);
    public static final EventStatusEnum Event_Deleted = new EventStatusEnum("Event_Deleted", 5, 6);
    public static final EventStatusEnum Event_Finished = new EventStatusEnum("Event_Finished", 6, 7);

    public static final /* synthetic */ EventStatusEnum[] $values() {
        return new EventStatusEnum[]{Event_Created, Event_Reviewing, Event_Review_Failed, Event_Upcoming, Event_Started, Event_Deleted, Event_Finished};
    }

    public static InterfaceC2044707zh<EventStatusEnum> getEntries() {
        return $ENTRIES;
    }

    static {
        EventStatusEnum[] eventStatusEnumArr$values = $values();
        $VALUES = eventStatusEnumArr$values;
        $ENTRIES = new C2254308sP(eventStatusEnumArr$values);
    }

    public static EventStatusEnum[] values() {
        return (EventStatusEnum[]) $VALUES.clone();
    }

    public final int getStatus() {
        return this.status;
    }

    public static EventStatusEnum valueOf(String str) {
        return (EventStatusEnum) C08FF.LIZ(EventStatusEnum.class, str);
    }

    public EventStatusEnum(String str, int i, int i2) {
        this.status = i2;
    }
}
