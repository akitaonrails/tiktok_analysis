package com.ss.android.ugc.aweme.shortvideo.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class BehaviorType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ BehaviorType[] $VALUES;
    public final String simpleName;
    public static final BehaviorType START = new BehaviorType("START", 0, "ST");
    public static final BehaviorType SUCCESS = new BehaviorType("SUCCESS", 1, "SU");
    public static final BehaviorType FAILED = new BehaviorType("FAILED", 2, "FA");
    public static final BehaviorType CANCEL = new BehaviorType("CANCEL", 3, "CC");
    public static final BehaviorType EVENT = new BehaviorType("EVENT", 4, "EV");

    public static final /* synthetic */ BehaviorType[] $values() {
        return new BehaviorType[]{START, SUCCESS, FAILED, CANCEL, EVENT};
    }

    public static InterfaceC2044707zh<BehaviorType> getEntries() {
        return $ENTRIES;
    }

    static {
        BehaviorType[] behaviorTypeArr$values = $values();
        $VALUES = behaviorTypeArr$values;
        $ENTRIES = new C2254308sP(behaviorTypeArr$values);
    }

    public static BehaviorType[] values() {
        return (BehaviorType[]) $VALUES.clone();
    }

    public final String getSimpleName() {
        return this.simpleName;
    }

    public static BehaviorType valueOf(String str) {
        return (BehaviorType) C08FF.LIZ(BehaviorType.class, str);
    }

    public BehaviorType(String str, int i, String str2) {
        this.simpleName = str2;
    }
}
