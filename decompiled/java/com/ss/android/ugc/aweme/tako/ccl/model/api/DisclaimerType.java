package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C08FF;
import X.C09CS;
import X.C1859820yUu;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.tako.ccl.utils.IntEnumAdapter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes28.dex */
@C09CS(Adapter.class)
public final class DisclaimerType {
    public static final DisclaimerType DISCLAIMER_TYPE_DEFAULT;
    public static final DisclaimerType DISCLAIMER_TYPE_TEXT_IMAGE;
    public static final /* synthetic */ DisclaimerType[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static final class Adapter extends IntEnumAdapter<DisclaimerType> {
        public Adapter() {
            super(DisclaimerType.DISCLAIMER_TYPE_DEFAULT, C1859820yUu.LL);
        }
    }

    public static InterfaceC2044707zh<DisclaimerType> getEntries() {
        return LLILLL;
    }

    static {
        DisclaimerType disclaimerType = new DisclaimerType("DISCLAIMER_TYPE_DEFAULT", 0, 0);
        DISCLAIMER_TYPE_DEFAULT = disclaimerType;
        DisclaimerType disclaimerType2 = new DisclaimerType("DISCLAIMER_TYPE_TEXT_IMAGE", 1, 1);
        DISCLAIMER_TYPE_TEXT_IMAGE = disclaimerType2;
        DisclaimerType[] disclaimerTypeArr = {disclaimerType, disclaimerType2};
        LLILLJJLI = disclaimerTypeArr;
        LLILLL = new C2254308sP(disclaimerTypeArr);
    }

    public static DisclaimerType[] values() {
        return (DisclaimerType[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static DisclaimerType valueOf(String str) {
        return (DisclaimerType) C08FF.LIZ(DisclaimerType.class, str);
    }

    public DisclaimerType(String str, int i, int i2) {
        this.LL = i2;
    }
}
