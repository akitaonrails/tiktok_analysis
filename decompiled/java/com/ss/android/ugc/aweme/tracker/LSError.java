package com.ss.android.ugc.aweme.tracker;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX INFO: loaded from: classes19.dex */
public interface LSError {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes33.dex */
    public static final class Priority {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ Priority[] $VALUES;

        @C09CT("P0")
        public static final Priority P0 = new Priority("P0", 0, "P0");

        @C09CT("P1")
        public static final Priority P1 = new Priority("P1", 1, "P1");

        @C09CT("P2")
        public static final Priority P2 = new Priority("P2", 2, "P2");

        @C09CT("P3")
        public static final Priority P3 = new Priority("P3", 3, "P3");
        public final String value;

        public static final /* synthetic */ Priority[] $values() {
            return new Priority[]{P0, P1, P2, P3};
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

        public final String getValue() {
            return this.value;
        }

        public static Priority valueOf(String str) {
            return (Priority) C08FF.LIZ(Priority.class, str);
        }

        public Priority(String str, int i, String str2) {
            this.value = str2;
        }
    }

    String message();

    Priority priority();

    String toUniqueString();
}
