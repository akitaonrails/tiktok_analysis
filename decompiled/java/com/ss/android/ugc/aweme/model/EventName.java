package com.ss.android.ugc.aweme.model;

import X.C08FF;
import X.C09CT;
import X.C14SD;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes31.dex */
public final class EventName {
    public static final C14SD Companion;
    public static final /* synthetic */ EventName[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;

    @C09CT("onclick")
    public static final EventName ON_CLICK;

    @C09CT("onexposure")
    public static final EventName ON_EXPOSURE;

    @C09CT("onlongpress")
    public static final EventName ON_LONG_PRESS;
    public final String LL;

    public static InterfaceC2044707zh<EventName> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.14SD] */
    static {
        EventName eventName = new EventName("ON_CLICK", 0, "onclick");
        ON_CLICK = eventName;
        EventName eventName2 = new EventName("ON_LONG_PRESS", 1, "onlongpress");
        ON_LONG_PRESS = eventName2;
        EventName eventName3 = new EventName("ON_EXPOSURE", 2, "onexposure");
        ON_EXPOSURE = eventName3;
        EventName[] eventNameArr = {eventName, eventName2, eventName3};
        LLILLJJLI = eventNameArr;
        LLILLL = new C2254308sP(eventNameArr);
        Companion = new Object() { // from class: X.14SD
        };
    }

    public static EventName[] values() {
        return (EventName[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EventName valueOf(String str) {
        return (EventName) C08FF.LIZ(EventName.class, str);
    }

    public EventName(String str, int i, String str2) {
        this.LL = str2;
    }
}
