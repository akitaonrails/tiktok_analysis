package com.bytedance.geckox.settings.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class Priority {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ Priority[] $VALUES;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final Priority P0 = new Priority("P0", 0, 0);

    @C09CT("1")
    public static final Priority P1 = new Priority("P1", 1, 1);

    @C09CT("2")
    public static final Priority P2 = new Priority("P2", 2, 2);

    @C09CT("3")
    public static final Priority P3 = new Priority("P3", 3, 3);

    @C09CT("4")
    public static final Priority P4 = new Priority("P4", 4, 4);
    public final int number;

    public static final /* synthetic */ Priority[] $values() {
        return new Priority[]{P0, P1, P2, P3, P4};
    }

    public static InterfaceC2044707zh<Priority> getEntries() {
        return $ENTRIES;
    }

    static {
        Priority[] priorityArr$values = $values();
        $VALUES = priorityArr$values;
        $ENTRIES = new C2254308sP(priorityArr$values);
    }

    public static Priority[] values() {
        return (Priority[]) $VALUES.clone();
    }

    public final int getNumber() {
        return this.number;
    }

    public static Priority valueOf(String str) {
        return (Priority) C08FF.LIZ(Priority.class, str);
    }

    public Priority(String str, int i, int i2) {
        this.number = i2;
    }
}
