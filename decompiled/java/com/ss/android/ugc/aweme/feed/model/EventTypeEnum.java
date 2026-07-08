package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class EventTypeEnum {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ EventTypeEnum[] $VALUES;
    public static final EventTypeEnum Live_Event = new EventTypeEnum("Live_Event", 0, 1);
    public final int type;

    public static final /* synthetic */ EventTypeEnum[] $values() {
        return new EventTypeEnum[]{Live_Event};
    }

    public static InterfaceC2044707zh<EventTypeEnum> getEntries() {
        return $ENTRIES;
    }

    static {
        EventTypeEnum[] eventTypeEnumArr$values = $values();
        $VALUES = eventTypeEnumArr$values;
        $ENTRIES = new C2254308sP(eventTypeEnumArr$values);
    }

    public static EventTypeEnum[] values() {
        return (EventTypeEnum[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }

    public static EventTypeEnum valueOf(String str) {
        return (EventTypeEnum) C08FF.LIZ(EventTypeEnum.class, str);
    }

    public EventTypeEnum(String str, int i, int i2) {
        this.type = i2;
    }
}
