package com.ss.android.ugc.aweme.account.login.model;

import X.C0XTZ;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.model.CommonUserInfo;
import com.ss.android.ugc.aweme.account.model.LoginMethodName;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Date;

/* JADX INFO: loaded from: classes14.dex */
public final class PhoneLoginMethod extends BaseLoginMethod {
    public static final int $stable = 8;
    public final boolean isOrgAccount;
    public PhoneNumberUtil.PhoneNumber phoneNumber;

    @Override // com.ss.android.ugc.aweme.account.model.BaseLoginMethod
    public boolean isHistoryLogin() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.account.model.BaseLoginMethod
    public String findPlatform() {
        return getLoginMethodName().name();
    }

    public final PhoneNumberUtil.PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    public final boolean isOrgAccount() {
        return this.isOrgAccount;
    }

    private final String parseNumber(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                int iDigit = Character.digit(str.charAt(i), 10);
                if (iDigit != -1) {
                    sb.append(iDigit);
                }
            }
        }
        if (sb.length() == 0) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return sb.toString();
    }

    public final void setPhoneNumber(PhoneNumberUtil.PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PhoneLoginMethod(String str, PhoneNumberUtil.PhoneNumber phoneNumber) {
        LoginMethodName loginMethodName = LoginMethodName.PHONE_SMS;
        CommonUserInfo.Companion.getClass();
        this(str, loginMethodName, phoneNumber, C0XTZ.LIZ(), -1L, -1L, false, null, null, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PhoneLoginMethod(String str, LoginMethodName loginMethodName, PhoneNumberUtil.PhoneNumber phoneNumber) {
        this(str, loginMethodName, phoneNumber, C0XTZ.LIZ(), -1L, -1L, false, null, null, null);
        CommonUserInfo.Companion.getClass();
    }

    public PhoneLoginMethod(String str, LoginMethodName loginMethodName, PhoneNumberUtil.PhoneNumber phoneNumber, CommonUserInfo commonUserInfo) {
        this(str, loginMethodName, phoneNumber, commonUserInfo, -1L, -1L, false, null, null, null);
    }

    public PhoneLoginMethod(String str, LoginMethodName loginMethodName, PhoneNumberUtil.PhoneNumber phoneNumber, CommonUserInfo commonUserInfo, Long l) {
        this(str, loginMethodName, phoneNumber, commonUserInfo, l, -1L, false, null, null, null);
    }

    public PhoneLoginMethod(String str, LoginMethodName loginMethodName, PhoneNumberUtil.PhoneNumber phoneNumber, CommonUserInfo commonUserInfo, Long l, Long l2) {
        this(str, loginMethodName, phoneNumber, commonUserInfo, l, l2, false, null, null, null);
    }

    public PhoneLoginMethod(String str, LoginMethodName loginMethodName, String str2, String str3, String str4, Long l, String str5) {
        PhoneNumberUtil.PhoneNumber phoneNumber = new PhoneNumberUtil.PhoneNumber();
        CommonUserInfo.Companion.getClass();
        this(str, loginMethodName, phoneNumber, C0XTZ.LIZ(), l, -1L, false, str5, null, null);
        this.phoneNumber.setCountryIso(str2);
        this.phoneNumber.setCountryCode(CastIntegerProtector.parseInt(parseNumber(str3)));
        this.phoneNumber.setNationalNumber(str4);
    }

    public PhoneLoginMethod(String str, LoginMethodName loginMethodName, PhoneNumberUtil.PhoneNumber phoneNumber, CommonUserInfo commonUserInfo, Long l, Long l2, boolean z) {
        this(str, loginMethodName, phoneNumber, commonUserInfo, l, l2, z, null, null, null);
    }

    public PhoneLoginMethod(String str, LoginMethodName loginMethodName, PhoneNumberUtil.PhoneNumber phoneNumber, CommonUserInfo commonUserInfo, Long l, Long l2, boolean z, String str2) {
        this(str, loginMethodName, phoneNumber, commonUserInfo, l, l2, z, str2, null, null);
    }

    public PhoneLoginMethod(String str, LoginMethodName loginMethodName, PhoneNumberUtil.PhoneNumber phoneNumber, CommonUserInfo commonUserInfo, Long l, Long l2, boolean z, String str2, String str3) {
        this(str, loginMethodName, phoneNumber, commonUserInfo, l, l2, z, str2, str3, null);
    }

    public PhoneLoginMethod(String str, LoginMethodName loginMethodName, PhoneNumberUtil.PhoneNumber phoneNumber, CommonUserInfo commonUserInfo, Long l, Long l2, boolean z, String str2, String str3, String str4) {
        super(str, loginMethodName, commonUserInfo, new Date(System.currentTimeMillis() + 31536000000L), l, l2, Boolean.FALSE, Boolean.FALSE, null, null, Boolean.FALSE, str2, str3, str4);
        this.phoneNumber = phoneNumber;
        this.isOrgAccount = z;
    }
}
