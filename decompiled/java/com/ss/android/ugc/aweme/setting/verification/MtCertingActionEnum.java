package com.ss.android.ugc.aweme.setting.verification;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class MtCertingActionEnum {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ MtCertingActionEnum[] $VALUES;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final MtCertingActionEnum CA_EMPTY = new MtCertingActionEnum("CA_EMPTY", 0);

    @C09CT("1")
    public static final MtCertingActionEnum CA_CERTING = new MtCertingActionEnum("CA_CERTING", 1);

    @C09CT("2")
    public static final MtCertingActionEnum CA_UPDATING = new MtCertingActionEnum("CA_UPDATING", 2);

    public static final /* synthetic */ MtCertingActionEnum[] $values() {
        return new MtCertingActionEnum[]{CA_EMPTY, CA_CERTING, CA_UPDATING};
    }

    public static InterfaceC2044707zh<MtCertingActionEnum> getEntries() {
        return $ENTRIES;
    }

    static {
        MtCertingActionEnum[] mtCertingActionEnumArr$values = $values();
        $VALUES = mtCertingActionEnumArr$values;
        $ENTRIES = new C2254308sP(mtCertingActionEnumArr$values);
    }

    public static MtCertingActionEnum[] values() {
        return (MtCertingActionEnum[]) $VALUES.clone();
    }

    public static MtCertingActionEnum valueOf(String str) {
        return (MtCertingActionEnum) C08FF.LIZ(MtCertingActionEnum.class, str);
    }

    public MtCertingActionEnum(String str, int i) {
    }
}
