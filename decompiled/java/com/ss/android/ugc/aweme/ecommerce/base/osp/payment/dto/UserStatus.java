package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C02RR;
import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class UserStatus {
    public static final C02RR Companion;

    @C09CT("FROZEN")
    public static final UserStatus FROZEN;
    public static final /* synthetic */ UserStatus[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("NORMAL")
    public static final UserStatus NORMAL;

    public static InterfaceC2044707zh<UserStatus> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.02RR] */
    static {
        UserStatus userStatus = new UserStatus("NORMAL", 0);
        NORMAL = userStatus;
        UserStatus userStatus2 = new UserStatus("FROZEN", 1);
        FROZEN = userStatus2;
        UserStatus[] userStatusArr = {userStatus, userStatus2};
        LL = userStatusArr;
        LLILLJJLI = new C2254308sP(userStatusArr);
        Companion = new Object() { // from class: X.02RR
        };
    }

    public static UserStatus[] values() {
        return (UserStatus[]) LL.clone();
    }

    public static final UserStatus fromString(String str) {
        Companion.getClass();
        for (UserStatus userStatus : values()) {
            if (Intrinsics.LJFF(userStatus.name(), str)) {
                return userStatus;
            }
        }
        return null;
    }

    public static UserStatus valueOf(String str) {
        return (UserStatus) C08FF.LIZ(UserStatus.class, str);
    }

    public UserStatus(String str, int i) {
    }
}
