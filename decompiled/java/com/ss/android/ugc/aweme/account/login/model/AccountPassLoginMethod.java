package com.ss.android.ugc.aweme.account.login.model;

import X.C0XTZ;
import X.InterfaceC1294060jmO;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.model.CommonUserInfo;
import com.ss.android.ugc.aweme.account.model.LoginMethodName;
import com.ss.android.ugc.aweme.account.model.OrgUserInfo;
import java.util.Date;

/* JADX INFO: loaded from: classes14.dex */
public final class AccountPassLoginMethod extends BaseLoginMethod {
    public static final int $stable = 8;
    public final Boolean isMasked;
    public final Boolean isOrgAccount;
    public final Boolean isOrgOtp;
    public String name;
    public final OrgUserInfo orgUserInfo;

    @InterfaceC1294060jmO
    public static /* synthetic */ void getOrgUserInfo$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void isOrgOtp$annotations() {
    }

    @Override // com.ss.android.ugc.aweme.account.model.BaseLoginMethod
    public boolean isHistoryLogin() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.account.model.BaseLoginMethod
    public String findPlatform() {
        return getLoginMethodName().name();
    }

    public final String getName() {
        return this.name;
    }

    public final OrgUserInfo getOrgUserInfo() {
        return this.orgUserInfo;
    }

    public final Boolean isMasked() {
        return this.isMasked;
    }

    public final Boolean isOrgAccount() {
        return this.isOrgAccount;
    }

    public final Boolean isOrgOtp() {
        return this.isOrgOtp;
    }

    public final void setName(String str) {
        this.name = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AccountPassLoginMethod(String str, String str2) {
        LoginMethodName loginMethodName = LoginMethodName.EMAIL_PASS;
        CommonUserInfo.Companion.getClass();
        this(str, loginMethodName, str2, C0XTZ.LIZ(), -1L, -1L, null, null, null, null, null, null, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccountPassLoginMethod(String str, LoginMethodName loginMethodName, String str2) {
        this(str, loginMethodName, str2, C0XTZ.LIZ(), -1L, -1L, null, null, null, null, null, null, null);
        CommonUserInfo.Companion.getClass();
    }

    public AccountPassLoginMethod(String str, LoginMethodName loginMethodName, String str2, CommonUserInfo commonUserInfo) {
        this(str, loginMethodName, str2, commonUserInfo, -1L, -1L, null, null, null, null, null, null, null);
    }

    public AccountPassLoginMethod(String str, LoginMethodName loginMethodName, String str2, CommonUserInfo commonUserInfo, Long l) {
        this(str, loginMethodName, str2, commonUserInfo, l, -1L, null, null, null, null, null, null, null);
    }

    public AccountPassLoginMethod(String str, LoginMethodName loginMethodName, String str2, CommonUserInfo commonUserInfo, Long l, Long l2) {
        this(str, loginMethodName, str2, commonUserInfo, l, l2, null, null, null, null, null, null, null);
    }

    public AccountPassLoginMethod(String str, LoginMethodName loginMethodName, String str2, CommonUserInfo commonUserInfo, Long l, Long l2, Boolean bool) {
        this(str, loginMethodName, str2, commonUserInfo, l, l2, bool, null, null, null, null, null, null);
    }

    public AccountPassLoginMethod(String str, LoginMethodName loginMethodName, String str2, CommonUserInfo commonUserInfo, Long l, Long l2, Boolean bool, OrgUserInfo orgUserInfo) {
        this(str, loginMethodName, str2, commonUserInfo, l, l2, bool, orgUserInfo, null, null, null, null, null);
    }

    public AccountPassLoginMethod(String str, LoginMethodName loginMethodName, String str2, CommonUserInfo commonUserInfo, Long l, Long l2, Boolean bool, OrgUserInfo orgUserInfo, Boolean bool2) {
        this(str, loginMethodName, str2, commonUserInfo, l, l2, bool, orgUserInfo, bool2, null, null, null, null);
    }

    public AccountPassLoginMethod(String str, LoginMethodName loginMethodName, String str2, CommonUserInfo commonUserInfo, Long l, Long l2, Boolean bool, OrgUserInfo orgUserInfo, Boolean bool2, Boolean bool3) {
        this(str, loginMethodName, str2, commonUserInfo, l, l2, bool, orgUserInfo, bool2, bool3, null, null, null);
    }

    public AccountPassLoginMethod(String str, LoginMethodName loginMethodName, String str2, CommonUserInfo commonUserInfo, Long l, Long l2, Boolean bool, OrgUserInfo orgUserInfo, Boolean bool2, Boolean bool3, String str3) {
        this(str, loginMethodName, str2, commonUserInfo, l, l2, bool, orgUserInfo, bool2, bool3, str3, null, null);
    }

    public AccountPassLoginMethod(String str, LoginMethodName loginMethodName, String str2, CommonUserInfo commonUserInfo, Long l, Long l2, Boolean bool, OrgUserInfo orgUserInfo, Boolean bool2, Boolean bool3, String str3, String str4) {
        this(str, loginMethodName, str2, commonUserInfo, l, l2, bool, orgUserInfo, bool2, bool3, str3, str4, null);
    }

    public AccountPassLoginMethod(String str, LoginMethodName loginMethodName, String str2, CommonUserInfo commonUserInfo, Long l, Long l2, Boolean bool, OrgUserInfo orgUserInfo, Boolean bool2, Boolean bool3, String str3, String str4, String str5) {
        super(str, loginMethodName, commonUserInfo, new Date(System.currentTimeMillis() + 31536000000L), l, l2, Boolean.FALSE, Boolean.FALSE, null, null, Boolean.FALSE, str3, str4, str5);
        this.name = str2;
        this.isOrgOtp = bool;
        this.orgUserInfo = orgUserInfo;
        this.isOrgAccount = bool2;
        this.isMasked = bool3;
    }
}
