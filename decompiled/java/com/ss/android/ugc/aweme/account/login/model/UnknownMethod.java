package com.ss.android.ugc.aweme.account.login.model;

import X.C0XTZ;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.model.CommonUserInfo;
import com.ss.android.ugc.aweme.account.model.LoginMethodName;
import java.util.Date;

/* JADX INFO: loaded from: classes14.dex */
public final class UnknownMethod extends BaseLoginMethod {
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.account.model.BaseLoginMethod
    public boolean isHistoryLogin() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.account.model.BaseLoginMethod
    public String findPlatform() {
        return getLoginMethodName().name();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UnknownMethod(String str) {
        LoginMethodName loginMethodName = LoginMethodName.UNKNOWN;
        CommonUserInfo.Companion.getClass();
        this(str, loginMethodName, C0XTZ.LIZ(), -1L, -1L, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UnknownMethod(String str, LoginMethodName loginMethodName) {
        this(str, loginMethodName, C0XTZ.LIZ(), -1L, -1L, null);
        CommonUserInfo.Companion.getClass();
    }

    public UnknownMethod(String str, LoginMethodName loginMethodName, CommonUserInfo commonUserInfo) {
        this(str, loginMethodName, commonUserInfo, -1L, -1L, null);
    }

    public UnknownMethod(String str, LoginMethodName loginMethodName, CommonUserInfo commonUserInfo, Long l) {
        this(str, loginMethodName, commonUserInfo, l, -1L, null);
    }

    public UnknownMethod(String str, LoginMethodName loginMethodName, CommonUserInfo commonUserInfo, Long l, Long l2) {
        this(str, loginMethodName, commonUserInfo, l, l2, null);
    }

    public UnknownMethod(String str, LoginMethodName loginMethodName, CommonUserInfo commonUserInfo, Long l, Long l2, String str2) {
        super(str, loginMethodName, commonUserInfo, new Date(System.currentTimeMillis() + 31536000000L), l, l2, Boolean.FALSE, Boolean.FALSE, null, null, Boolean.FALSE, str2, null, null);
    }
}
