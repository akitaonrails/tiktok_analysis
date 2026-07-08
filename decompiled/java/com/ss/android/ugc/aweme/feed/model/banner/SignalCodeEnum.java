package com.ss.android.ugc.aweme.feed.model.banner;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class SignalCodeEnum {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ SignalCodeEnum[] $VALUES;
    public static final Companion Companion;
    public final int type;
    public static final SignalCodeEnum CUSTOMIZED = new SignalCodeEnum("CUSTOMIZED", 0, -1);
    public static final SignalCodeEnum NONE = new SignalCodeEnum("NONE", 1, 0);
    public static final SignalCodeEnum OUTREACH = new SignalCodeEnum("OUTREACH", 2, 1);

    public static final /* synthetic */ SignalCodeEnum[] $values() {
        return new SignalCodeEnum[]{CUSTOMIZED, NONE, OUTREACH};
    }

    public static final SignalCodeEnum fromValue(int i) {
        return Companion.fromValue(i);
    }

    public static InterfaceC2044707zh<SignalCodeEnum> getEntries() {
        return $ENTRIES;
    }

    static {
        SignalCodeEnum[] signalCodeEnumArr$values = $values();
        $VALUES = signalCodeEnumArr$values;
        $ENTRIES = new C2254308sP(signalCodeEnumArr$values);
        Companion = new Companion();
    }

    public static SignalCodeEnum[] values() {
        return (SignalCodeEnum[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }

    public static final class Companion {
        public final SignalCodeEnum fromValue(int i) {
            for (SignalCodeEnum signalCodeEnum : SignalCodeEnum.values()) {
                if (signalCodeEnum.getType() == i) {
                    return signalCodeEnum;
                }
            }
            return SignalCodeEnum.NONE;
        }
    }

    public static SignalCodeEnum valueOf(String str) {
        return (SignalCodeEnum) C08FF.LIZ(SignalCodeEnum.class, str);
    }

    public SignalCodeEnum(String str, int i, int i2) {
        this.type = i2;
    }
}
