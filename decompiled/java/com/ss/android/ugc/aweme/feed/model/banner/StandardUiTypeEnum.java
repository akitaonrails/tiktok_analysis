package com.ss.android.ugc.aweme.feed.model.banner;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class StandardUiTypeEnum {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ StandardUiTypeEnum[] $VALUES;
    public static final Companion Companion;
    public final int type;
    public static final StandardUiTypeEnum CUSTOMIZED = new StandardUiTypeEnum("CUSTOMIZED", 0, -1);
    public static final StandardUiTypeEnum STANDARD = new StandardUiTypeEnum("STANDARD", 1, 2);

    public static final /* synthetic */ StandardUiTypeEnum[] $values() {
        return new StandardUiTypeEnum[]{CUSTOMIZED, STANDARD};
    }

    public static final StandardUiTypeEnum fromValue(int i) {
        return Companion.fromValue(i);
    }

    public static InterfaceC2044707zh<StandardUiTypeEnum> getEntries() {
        return $ENTRIES;
    }

    static {
        StandardUiTypeEnum[] standardUiTypeEnumArr$values = $values();
        $VALUES = standardUiTypeEnumArr$values;
        $ENTRIES = new C2254308sP(standardUiTypeEnumArr$values);
        Companion = new Companion();
    }

    public static StandardUiTypeEnum[] values() {
        return (StandardUiTypeEnum[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }

    public static final class Companion {
        public final StandardUiTypeEnum fromValue(int i) {
            for (StandardUiTypeEnum standardUiTypeEnum : StandardUiTypeEnum.values()) {
                if (standardUiTypeEnum.getType() == i) {
                    return standardUiTypeEnum;
                }
            }
            return StandardUiTypeEnum.CUSTOMIZED;
        }
    }

    public static StandardUiTypeEnum valueOf(String str) {
        return (StandardUiTypeEnum) C08FF.LIZ(StandardUiTypeEnum.class, str);
    }

    public StandardUiTypeEnum(String str, int i, int i2) {
        this.type = i2;
    }
}
