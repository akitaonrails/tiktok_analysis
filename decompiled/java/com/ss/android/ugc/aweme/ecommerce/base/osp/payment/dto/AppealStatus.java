package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C02RM;
import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class AppealStatus {
    public static final C02RM Companion;

    @C09CT("INIT")
    public static final AppealStatus INIT;
    public static final /* synthetic */ AppealStatus[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;

    @C09CT("PASSED")
    public static final AppealStatus PASSED;

    @C09CT("PENDING")
    public static final AppealStatus PENDING;

    @C09CT("REJECT")
    public static final AppealStatus REJECT;

    @C09CT("RETURN")
    public static final AppealStatus RETURN;
    public final String LL;

    public static InterfaceC2044707zh<AppealStatus> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.02RM] */
    static {
        AppealStatus appealStatus = new AppealStatus("INIT", 0, "INIT");
        INIT = appealStatus;
        AppealStatus appealStatus2 = new AppealStatus("PENDING", 1, "PENDING");
        PENDING = appealStatus2;
        AppealStatus appealStatus3 = new AppealStatus("PASSED", 2, "PASSED");
        PASSED = appealStatus3;
        AppealStatus appealStatus4 = new AppealStatus("RETURN", 3, "RETURN");
        RETURN = appealStatus4;
        AppealStatus appealStatus5 = new AppealStatus("REJECT", 4, "REJECT");
        REJECT = appealStatus5;
        AppealStatus[] appealStatusArr = {appealStatus, appealStatus2, appealStatus3, appealStatus4, appealStatus5};
        LLILLJJLI = appealStatusArr;
        LLILLL = new C2254308sP(appealStatusArr);
        Companion = new Object() { // from class: X.02RM
        };
    }

    public static AppealStatus[] values() {
        return (AppealStatus[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static final AppealStatus fromString(String str) {
        Companion.getClass();
        for (AppealStatus appealStatus : values()) {
            if (Intrinsics.LJFF(appealStatus.getValue(), str)) {
                return appealStatus;
            }
        }
        return null;
    }

    public static AppealStatus valueOf(String str) {
        return (AppealStatus) C08FF.LIZ(AppealStatus.class, str);
    }

    public AppealStatus(String str, int i, String str2) {
        this.LL = str2;
    }
}
