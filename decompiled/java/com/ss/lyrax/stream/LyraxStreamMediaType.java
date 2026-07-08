package com.ss.lyrax.stream;

import X.C08FF;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'BOTH' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes21.dex */
public final class LyraxStreamMediaType {
    public static final /* synthetic */ LyraxStreamMediaType[] $VALUES;
    public static final LyraxStreamMediaType AUDIO;
    public static final LyraxStreamMediaType BOTH;
    public static final LyraxStreamMediaType VIDEO;
    public final int val;

    static {
        LyraxStreamMediaType lyraxStreamMediaType = new LyraxStreamMediaType("AUDIO", 0, 1);
        AUDIO = lyraxStreamMediaType;
        LyraxStreamMediaType lyraxStreamMediaType2 = new LyraxStreamMediaType("VIDEO", 1, 2);
        VIDEO = lyraxStreamMediaType2;
        LyraxStreamMediaType lyraxStreamMediaType3 = new LyraxStreamMediaType("BOTH", 2, lyraxStreamMediaType.value() | lyraxStreamMediaType2.value());
        BOTH = lyraxStreamMediaType3;
        $VALUES = new LyraxStreamMediaType[]{lyraxStreamMediaType, lyraxStreamMediaType2, lyraxStreamMediaType3};
    }

    public static LyraxStreamMediaType[] values() {
        return (LyraxStreamMediaType[]) $VALUES.clone();
    }

    public int value() {
        return this.val;
    }

    public static LyraxStreamMediaType fromId(int i) {
        for (LyraxStreamMediaType lyraxStreamMediaType : values()) {
            if (lyraxStreamMediaType.value() == i) {
                return lyraxStreamMediaType;
            }
        }
        return BOTH;
    }

    public static LyraxStreamMediaType valueOf(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return BOTH;
                }
                return BOTH;
            }
            return VIDEO;
        }
        return AUDIO;
    }

    public static LyraxStreamMediaType valueOf(String str) {
        return (LyraxStreamMediaType) C08FF.LIZ(LyraxStreamMediaType.class, str);
    }

    public LyraxStreamMediaType(String str, int i, int i2) {
        this.val = i2;
    }
}
