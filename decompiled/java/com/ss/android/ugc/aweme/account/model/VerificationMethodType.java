package com.ss.android.ugc.aweme.account.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class VerificationMethodType {

    @C09CT("1")
    public static final VerificationMethodType EMAIL;
    public static final /* synthetic */ VerificationMethodType[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("2")
    public static final VerificationMethodType MOBILE;

    @C09CT("3")
    public static final VerificationMethodType PASSWORD;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final VerificationMethodType UNKNOWN;

    public static InterfaceC2044707zh<VerificationMethodType> getEntries() {
        return LLILLJJLI;
    }

    static {
        VerificationMethodType verificationMethodType = new VerificationMethodType("UNKNOWN", 0, 0);
        UNKNOWN = verificationMethodType;
        VerificationMethodType verificationMethodType2 = new VerificationMethodType("EMAIL", 1, 1);
        EMAIL = verificationMethodType2;
        VerificationMethodType verificationMethodType3 = new VerificationMethodType("MOBILE", 2, 2);
        MOBILE = verificationMethodType3;
        VerificationMethodType verificationMethodType4 = new VerificationMethodType("PASSWORD", 3, 3);
        PASSWORD = verificationMethodType4;
        VerificationMethodType[] verificationMethodTypeArr = {verificationMethodType, verificationMethodType2, verificationMethodType3, verificationMethodType4};
        LL = verificationMethodTypeArr;
        LLILLJJLI = new C2254308sP(verificationMethodTypeArr);
    }

    public static VerificationMethodType[] values() {
        return (VerificationMethodType[]) LL.clone();
    }

    public static VerificationMethodType valueOf(String str) {
        return (VerificationMethodType) C08FF.LIZ(VerificationMethodType.class, str);
    }

    public VerificationMethodType(String str, int i, int i2) {
    }
}
