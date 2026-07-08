package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class DeclarationOption {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ DeclarationOption[] $VALUES;
    public static final Companion Companion;
    public final int serverValue;
    public static final DeclarationOption UNSPECIFIED = new DeclarationOption("UNSPECIFIED", 0, 0);
    public static final DeclarationOption AIGC = new DeclarationOption("AIGC", 1, 1);
    public static final DeclarationOption AUDIENCE_CONTROL = new DeclarationOption("AUDIENCE_CONTROL", 2, 2);
    public static final DeclarationOption DATE_LOC = new DeclarationOption("DATE_LOC", 3, 3);

    public static final /* synthetic */ DeclarationOption[] $values() {
        return new DeclarationOption[]{UNSPECIFIED, AIGC, AUDIENCE_CONTROL, DATE_LOC};
    }

    public static InterfaceC2044707zh<DeclarationOption> getEntries() {
        return $ENTRIES;
    }

    static {
        DeclarationOption[] declarationOptionArr$values = $values();
        $VALUES = declarationOptionArr$values;
        $ENTRIES = new C2254308sP(declarationOptionArr$values);
        Companion = new Companion();
    }

    public static DeclarationOption[] values() {
        return (DeclarationOption[]) $VALUES.clone();
    }

    public final int getServerValue() {
        return this.serverValue;
    }

    public static final class Companion {
        public final DeclarationOption parseFrom(Integer num) {
            for (DeclarationOption declarationOption : DeclarationOption.values()) {
                int serverValue = declarationOption.getServerValue();
                if (num != null && serverValue == num.intValue()) {
                    return declarationOption;
                }
            }
            return DeclarationOption.UNSPECIFIED;
        }
    }

    public static DeclarationOption valueOf(String str) {
        return (DeclarationOption) C08FF.LIZ(DeclarationOption.class, str);
    }

    public DeclarationOption(String str, int i, int i2) {
        this.serverValue = i2;
    }
}
