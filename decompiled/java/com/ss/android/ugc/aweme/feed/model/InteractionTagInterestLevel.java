package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class InteractionTagInterestLevel {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ InteractionTagInterestLevel[] $VALUES;
    public final int level;
    public static final InteractionTagInterestLevel UNDEFINED = new InteractionTagInterestLevel("UNDEFINED", 0, 0);
    public static final InteractionTagInterestLevel LOW = new InteractionTagInterestLevel("LOW", 1, 1);
    public static final InteractionTagInterestLevel HIGH = new InteractionTagInterestLevel("HIGH", 2, 2);

    public static final /* synthetic */ InteractionTagInterestLevel[] $values() {
        return new InteractionTagInterestLevel[]{UNDEFINED, LOW, HIGH};
    }

    public static InterfaceC2044707zh<InteractionTagInterestLevel> getEntries() {
        return $ENTRIES;
    }

    static {
        InteractionTagInterestLevel[] interactionTagInterestLevelArr$values = $values();
        $VALUES = interactionTagInterestLevelArr$values;
        $ENTRIES = new C2254308sP(interactionTagInterestLevelArr$values);
    }

    public static InteractionTagInterestLevel[] values() {
        return (InteractionTagInterestLevel[]) $VALUES.clone();
    }

    public final int getLevel() {
        return this.level;
    }

    public static InteractionTagInterestLevel valueOf(String str) {
        return (InteractionTagInterestLevel) C08FF.LIZ(InteractionTagInterestLevel.class, str);
    }

    public InteractionTagInterestLevel(String str, int i, int i2) {
        this.level = i2;
    }
}
