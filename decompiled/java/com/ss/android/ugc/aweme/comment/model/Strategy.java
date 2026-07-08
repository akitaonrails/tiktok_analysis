package com.ss.android.ugc.aweme.comment.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class Strategy {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ Strategy[] $VALUES;
    public static final Companion Companion;
    public final int value;
    public static final Strategy ONLINE = new Strategy("ONLINE", 0, 0);
    public static final Strategy VIOLATING = new Strategy("VIOLATING", 1, 1);
    public static final Strategy WARNING = new Strategy("WARNING", 2, 2);
    public static final Strategy REMINDERING = new Strategy("REMINDERING", 3, 3);

    public static final /* synthetic */ Strategy[] $values() {
        return new Strategy[]{ONLINE, VIOLATING, WARNING, REMINDERING};
    }

    public static InterfaceC2044707zh<Strategy> getEntries() {
        return $ENTRIES;
    }

    static {
        Strategy[] strategyArr$values = $values();
        $VALUES = strategyArr$values;
        $ENTRIES = new C2254308sP(strategyArr$values);
        Companion = new Companion();
    }

    public static Strategy[] values() {
        return (Strategy[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static final class Companion {
        public final Strategy fromInt(int i) {
            for (Strategy strategy : Strategy.values()) {
                if (strategy.getValue() == i) {
                    return strategy;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    public static Strategy valueOf(String str) {
        return (Strategy) C08FF.LIZ(Strategy.class, str);
    }

    public Strategy(String str, int i, int i2) {
        this.value = i2;
    }
}
