package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.C588202Rc;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class VerificationMode {
    public static final C588202Rc Companion;

    @C09CT("1")
    public static final VerificationMode LENIENT;
    public static final /* synthetic */ VerificationMode[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final VerificationMode OFF;

    @C09CT("2")
    public static final VerificationMode STRICT;
    public final int LL;

    public static InterfaceC2044707zh<VerificationMode> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.02Rc] */
    static {
        VerificationMode verificationMode = new VerificationMode("OFF", 0, 0);
        OFF = verificationMode;
        VerificationMode verificationMode2 = new VerificationMode("LENIENT", 1, 1);
        LENIENT = verificationMode2;
        VerificationMode verificationMode3 = new VerificationMode("STRICT", 2, 2);
        STRICT = verificationMode3;
        VerificationMode[] verificationModeArr = {verificationMode, verificationMode2, verificationMode3};
        LLILLJJLI = verificationModeArr;
        LLILLL = new C2254308sP(verificationModeArr);
        Companion = new Object() { // from class: X.02Rc
        };
    }

    public static VerificationMode[] values() {
        return (VerificationMode[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static VerificationMode valueOf(String str) {
        return (VerificationMode) C08FF.LIZ(VerificationMode.class, str);
    }

    public VerificationMode(String str, int i, int i2) {
        this.LL = i2;
    }
}
