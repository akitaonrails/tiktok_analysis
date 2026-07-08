package com.ss.android.ugc.aweme.feed.model.upvote;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class CarrierType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ CarrierType[] $VALUES;
    public static final Companion Companion;
    public final int value;
    public static final CarrierType ITEM = new CarrierType("ITEM", 0, 0);
    public static final CarrierType COMMENT = new CarrierType("COMMENT", 1, 1);

    public static final /* synthetic */ CarrierType[] $values() {
        return new CarrierType[]{ITEM, COMMENT};
    }

    public static InterfaceC2044707zh<CarrierType> getEntries() {
        return $ENTRIES;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.feed.model.upvote.CarrierType$Companion] */
    static {
        CarrierType[] carrierTypeArr$values = $values();
        $VALUES = carrierTypeArr$values;
        $ENTRIES = new C2254308sP(carrierTypeArr$values);
        Companion = new Object() { // from class: com.ss.android.ugc.aweme.feed.model.upvote.CarrierType.Companion
            public final CarrierType fromValue(int i) {
                for (CarrierType carrierType : CarrierType.values()) {
                    if (carrierType.getValue() == i) {
                        return carrierType;
                    }
                }
                return null;
            }
        };
    }

    public static CarrierType[] values() {
        return (CarrierType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static CarrierType valueOf(String str) {
        return (CarrierType) C08FF.LIZ(CarrierType.class, str);
    }

    public CarrierType(String str, int i, int i2) {
        this.value = i2;
    }
}
