package com.ss.android.ugc.aweme.setting.verification;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class MtCertStatusEnum {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ MtCertStatusEnum[] $VALUES;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final MtCertStatusEnum CS_EMPTY = new MtCertStatusEnum("CS_EMPTY", 0);

    @C09CT("1")
    public static final MtCertStatusEnum CS_CERTED = new MtCertStatusEnum("CS_CERTED", 1);

    @C09CT("2")
    public static final MtCertStatusEnum CS_CERTING = new MtCertStatusEnum("CS_CERTING", 2);

    @C09CT("3")
    public static final MtCertStatusEnum CS_DENIED = new MtCertStatusEnum("CS_DENIED", 3);

    public static final /* synthetic */ MtCertStatusEnum[] $values() {
        return new MtCertStatusEnum[]{CS_EMPTY, CS_CERTED, CS_CERTING, CS_DENIED};
    }

    public static InterfaceC2044707zh<MtCertStatusEnum> getEntries() {
        return $ENTRIES;
    }

    static {
        MtCertStatusEnum[] mtCertStatusEnumArr$values = $values();
        $VALUES = mtCertStatusEnumArr$values;
        $ENTRIES = new C2254308sP(mtCertStatusEnumArr$values);
    }

    public static MtCertStatusEnum[] values() {
        return (MtCertStatusEnum[]) $VALUES.clone();
    }

    public static MtCertStatusEnum valueOf(String str) {
        return (MtCertStatusEnum) C08FF.LIZ(MtCertStatusEnum.class, str);
    }

    public MtCertStatusEnum(String str, int i) {
    }
}
