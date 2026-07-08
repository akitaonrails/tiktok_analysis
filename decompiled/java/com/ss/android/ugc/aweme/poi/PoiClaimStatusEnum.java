package com.ss.android.ugc.aweme.poi;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class PoiClaimStatusEnum {
    public static final /* synthetic */ PoiClaimStatusEnum[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;

    @C09CT("2")
    public static final PoiClaimStatusEnum REJECTED;

    @C09CT("1")
    public static final PoiClaimStatusEnum UNDER_REVIEW;
    public final int LL;

    public static InterfaceC2044707zh<PoiClaimStatusEnum> getEntries() {
        return LLILLL;
    }

    static {
        PoiClaimStatusEnum poiClaimStatusEnum = new PoiClaimStatusEnum("UNDER_REVIEW", 0, 1);
        UNDER_REVIEW = poiClaimStatusEnum;
        PoiClaimStatusEnum poiClaimStatusEnum2 = new PoiClaimStatusEnum("REJECTED", 1, 2);
        REJECTED = poiClaimStatusEnum2;
        PoiClaimStatusEnum[] poiClaimStatusEnumArr = {poiClaimStatusEnum, poiClaimStatusEnum2};
        LLILLJJLI = poiClaimStatusEnumArr;
        LLILLL = new C2254308sP(poiClaimStatusEnumArr);
    }

    public static PoiClaimStatusEnum[] values() {
        return (PoiClaimStatusEnum[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static PoiClaimStatusEnum valueOf(String str) {
        return (PoiClaimStatusEnum) C08FF.LIZ(PoiClaimStatusEnum.class, str);
    }

    public PoiClaimStatusEnum(String str, int i, int i2) {
        this.LL = i2;
    }
}
