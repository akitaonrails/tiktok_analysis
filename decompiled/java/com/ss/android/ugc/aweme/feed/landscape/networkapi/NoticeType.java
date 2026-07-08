package com.ss.android.ugc.aweme.feed.landscape.networkapi;

import X.C08FF;
import X.C1260700iua;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class NoticeType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ NoticeType[] $VALUES;
    public static final C1260700iua Companion;
    public static final NoticeType GENERIC = new NoticeType("GENERIC", 0);
    public static final NoticeType GOOD_PERF = new NoticeType("GOOD_PERF", 1);
    public static final NoticeType BAD_PERF = new NoticeType("BAD_PERF", 2);

    public static final /* synthetic */ NoticeType[] $values() {
        return new NoticeType[]{GENERIC, GOOD_PERF, BAD_PERF};
    }

    public static InterfaceC2044707zh<NoticeType> getEntries() {
        return $ENTRIES;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0iua] */
    static {
        NoticeType[] noticeTypeArr$values = $values();
        $VALUES = noticeTypeArr$values;
        $ENTRIES = new C2254308sP(noticeTypeArr$values);
        Companion = new Object() { // from class: X.0iua
        };
    }

    public static NoticeType[] values() {
        return (NoticeType[]) $VALUES.clone();
    }

    public static NoticeType valueOf(String str) {
        return (NoticeType) C08FF.LIZ(NoticeType.class, str);
    }

    public NoticeType(String str, int i) {
    }
}
