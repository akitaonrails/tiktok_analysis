package com.ss.android.ugc.aweme.account.model;

import X.C0XTZ;
import X.C0XUM;
import X.C2188811AlT;
import X.C846430XIj;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public class BaseLoginMethod {
    public static final C0XUM Companion = new Object() { // from class: X.0XUM
    };
    public CommonUserInfo commonUserInfo;
    public transient String displayPlatform;
    public Date expires;
    public Boolean hasOIDC;
    public Boolean historyRemoved;
    public Boolean isOneClickLogin;
    public Long lastActiveTime;
    public LoginMethodName loginMethodName;
    public Long loginTime;
    public String maskedEmail;
    public String maskedPhone;
    public transient String oneClickLoginToken;
    public String successfulLoginToken;
    public String uid;

    /* JADX WARN: Illegal instructions before constructor call */
    public BaseLoginMethod() {
        LoginMethodName loginMethodName = LoginMethodName.DEFAULT;
        CommonUserInfo.Companion.getClass();
        this("", loginMethodName, C0XTZ.LIZ(), new Date(System.currentTimeMillis() + 31536000000L), -1L, -1L, Boolean.FALSE, Boolean.FALSE, null, null, Boolean.FALSE, null, null, null);
    }

    public String findPlatform() {
        String str = this.displayPlatform;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: isOneClickLogin, reason: collision with other method in class */
    public boolean m157isOneClickLogin() {
        return Intrinsics.LJFF(this.isOneClickLogin, Boolean.TRUE);
    }

    public final boolean isExpired() {
        return System.currentTimeMillis() > safeExpires().getTime();
    }

    public boolean isHistoryLogin() {
        String str;
        return C846430XIj.LIZIZ() ? !m157isOneClickLogin() : !m157isOneClickLogin() && ((str = this.oneClickLoginToken) == null || str.length() == 0);
    }

    public final Date safeExpires() {
        Date expires = getExpires();
        return expires == null ? new Date(-1L) : expires;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseLoginMethod(uid = '");
        sbLIZ.append(this.uid);
        sbLIZ.append("', loginMethodName = '");
        sbLIZ.append(getLoginMethodName());
        sbLIZ.append("', isOneClickLogin = '");
        sbLIZ.append(this.isOneClickLogin);
        sbLIZ.append("', oclTokenIsNull = '");
        String str = this.oneClickLoginToken;
        sbLIZ.append(str == null || str.length() == 0);
        sbLIZ.append("')");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final CommonUserInfo getCommonUserInfo() {
        return this.commonUserInfo;
    }

    public final String getDisplayPlatform() {
        return this.displayPlatform;
    }

    public Date getExpires() {
        return this.expires;
    }

    public final Boolean getHasOIDC() {
        return this.hasOIDC;
    }

    public final Boolean getHistoryRemoved() {
        return this.historyRemoved;
    }

    public final Long getLastActiveTime() {
        return this.lastActiveTime;
    }

    public LoginMethodName getLoginMethodName() {
        return this.loginMethodName;
    }

    public final Long getLoginTime() {
        return this.loginTime;
    }

    public final String getMaskedEmail() {
        return this.maskedEmail;
    }

    public final String getMaskedPhone() {
        return this.maskedPhone;
    }

    public final String getOneClickLoginToken() {
        return this.oneClickLoginToken;
    }

    public final String getSuccessfulLoginToken() {
        return this.successfulLoginToken;
    }

    public final String getUid() {
        return this.uid;
    }

    public final Boolean isOneClickLogin() {
        return this.isOneClickLogin;
    }

    public final void setCommonUserInfo(CommonUserInfo commonUserInfo) {
        this.commonUserInfo = commonUserInfo;
    }

    public final void setDisplayPlatform(String str) {
        this.displayPlatform = str;
    }

    public void setExpires(Date date) {
        this.expires = date;
    }

    public final void setHasOIDC(Boolean bool) {
        this.hasOIDC = bool;
    }

    public final void setHistoryRemoved(Boolean bool) {
        this.historyRemoved = bool;
    }

    public final void setLastActiveTime(Long l) {
        this.lastActiveTime = l;
    }

    public void setLoginMethodName(LoginMethodName loginMethodName) {
        this.loginMethodName = loginMethodName;
    }

    public final void setLoginTime(Long l) {
        this.loginTime = l;
    }

    public final void setMaskedEmail(String str) {
        this.maskedEmail = str;
    }

    public final void setMaskedPhone(String str) {
        this.maskedPhone = str;
    }

    public final void setOneClickLogin(Boolean bool) {
        this.isOneClickLogin = bool;
    }

    public final void setOneClickLoginToken(String str) {
        this.oneClickLoginToken = str;
    }

    public final void setSuccessfulLoginToken(String str) {
        this.successfulLoginToken = str;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public void updateUserInfo(SignificantUserInfo significantUserInfo) {
        String str;
        String str2;
        Integer num;
        if (!Intrinsics.LJFF(significantUserInfo.uid, this.uid)) {
            return;
        }
        String strLIZIZ = significantUserInfo.LIZIZ();
        CommonUserInfo commonUserInfo = this.commonUserInfo;
        String str3 = null;
        if (commonUserInfo != null && commonUserInfo.avatarExpires != null) {
            if (commonUserInfo != null) {
                str = commonUserInfo.avatarUrl;
            } else {
                str = null;
            }
        } else {
            str = significantUserInfo.avatarUrl;
        }
        if (str == null) {
            str = significantUserInfo.avatarUrl;
        }
        CommonUserInfo commonUserInfo2 = this.commonUserInfo;
        if (commonUserInfo2 != null) {
            str2 = commonUserInfo2.secUid;
        } else {
            str2 = null;
        }
        String str4 = significantUserInfo.nickname;
        if (commonUserInfo2 != null) {
            str3 = commonUserInfo2.avatarUri;
            num = commonUserInfo2.avatarExpires;
        } else {
            num = null;
        }
        this.commonUserInfo = new CommonUserInfo(strLIZIZ, str, str2, str4, str3, num);
    }

    public void updateUserInfo(User user) {
        if (!Intrinsics.LJFF(user.getUid(), this.uid)) {
            return;
        }
        C0XTZ c0xtz = CommonUserInfo.Companion;
        CommonUserInfo commonUserInfo = this.commonUserInfo;
        c0xtz.getClass();
        this.commonUserInfo = C0XTZ.LIZIZ(user, commonUserInfo);
    }

    public BaseLoginMethod(String str, LoginMethodName loginMethodName, CommonUserInfo commonUserInfo, Date date, Long l, Long l2, Boolean bool, Boolean bool2, String str2, String str3, Boolean bool3, String str4, String str5, String str6) {
        this.uid = str;
        this.loginMethodName = loginMethodName;
        this.commonUserInfo = commonUserInfo;
        this.expires = date;
        this.loginTime = l;
        this.lastActiveTime = l2;
        this.isOneClickLogin = bool;
        this.historyRemoved = bool2;
        this.oneClickLoginToken = str2;
        this.displayPlatform = str3;
        this.hasOIDC = bool3;
        this.successfulLoginToken = str4;
        this.maskedPhone = str5;
        this.maskedEmail = str6;
    }
}
