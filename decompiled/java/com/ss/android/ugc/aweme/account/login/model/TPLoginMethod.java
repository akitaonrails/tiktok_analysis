package com.ss.android.ugc.aweme.account.login.model;

import X.C0XTZ;
import X.C0XUS;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.model.CommonUserInfo;
import com.ss.android.ugc.aweme.account.model.LoginMethodName;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class TPLoginMethod extends BaseLoginMethod {
    public static final int $stable = 8;
    public boolean loginFromFeedPage;
    public final String platform;
    public TPUserInfo userInfo;

    @Override // com.ss.android.ugc.aweme.account.model.BaseLoginMethod
    public boolean isHistoryLogin() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.account.model.BaseLoginMethod
    public String findPlatform() {
        return this.platform;
    }

    public final boolean getLoginFromFeedPage() {
        return this.loginFromFeedPage;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final TPUserInfo getUserInfo() {
        return this.userInfo;
    }

    public final void setLoginFromFeedPage(boolean z) {
        this.loginFromFeedPage = z;
    }

    public final void setUserInfo(TPUserInfo tPUserInfo) {
        this.userInfo = tPUserInfo;
    }

    @Override // com.ss.android.ugc.aweme.account.model.BaseLoginMethod
    public void updateUserInfo(User user) {
        super.updateUserInfo(user);
        if (!Intrinsics.LJFF(user.getUid(), getUid())) {
            return;
        }
        TPUserInfo.Companion.getClass();
        this.userInfo = C0XUS.LIZ(user);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TPLoginMethod(String str, String str2, TPUserInfo tPUserInfo) {
        this(str, str2, tPUserInfo, false, C0XTZ.LIZ(), -1L, -1L, null, null, null);
        CommonUserInfo.Companion.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TPLoginMethod(String str, String str2, TPUserInfo tPUserInfo, boolean z) {
        this(str, str2, tPUserInfo, z, C0XTZ.LIZ(), -1L, -1L, null, null, null);
        CommonUserInfo.Companion.getClass();
    }

    public TPLoginMethod(String str, String str2, TPUserInfo tPUserInfo, boolean z, CommonUserInfo commonUserInfo) {
        this(str, str2, tPUserInfo, z, commonUserInfo, -1L, -1L, null, null, null);
    }

    public TPLoginMethod(String str, String str2, TPUserInfo tPUserInfo, boolean z, CommonUserInfo commonUserInfo, Long l) {
        this(str, str2, tPUserInfo, z, commonUserInfo, l, -1L, null, null, null);
    }

    public TPLoginMethod(String str, String str2, TPUserInfo tPUserInfo, boolean z, CommonUserInfo commonUserInfo, Long l, Long l2) {
        this(str, str2, tPUserInfo, z, commonUserInfo, l, l2, null, null, null);
    }

    public TPLoginMethod(String str, String str2, TPUserInfo tPUserInfo, boolean z, CommonUserInfo commonUserInfo, Long l, Long l2, String str3) {
        this(str, str2, tPUserInfo, z, commonUserInfo, l, l2, str3, null, null);
    }

    public TPLoginMethod(String str, String str2, TPUserInfo tPUserInfo, boolean z, CommonUserInfo commonUserInfo, Long l, Long l2, String str3, String str4) {
        this(str, str2, tPUserInfo, z, commonUserInfo, l, l2, str3, str4, null);
    }

    public TPLoginMethod(String str, String str2, TPUserInfo tPUserInfo, boolean z, CommonUserInfo commonUserInfo, Long l, Long l2, String str3, String str4, String str5) {
        super(str, LoginMethodName.THIRD_PARTY, commonUserInfo, new Date(System.currentTimeMillis() + 31536000000L), l, l2, Boolean.FALSE, Boolean.FALSE, null, null, Boolean.FALSE, str3, str4, str5);
        this.platform = str2;
        this.userInfo = tPUserInfo;
        this.loginFromFeedPage = z;
    }
}
