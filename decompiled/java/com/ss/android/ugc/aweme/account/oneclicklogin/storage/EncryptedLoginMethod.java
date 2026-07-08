package com.ss.android.ugc.aweme.account.oneclicklogin.storage;

import X.C09CT;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.account.model.LoginMethodName;

/* JADX INFO: loaded from: classes14.dex */
public final class EncryptedLoginMethod {

    @C09CT("at")
    public final String accountType;

    @C09CT("x")
    public final Integer avatarExpires;

    @C09CT("r")
    public final String avatarUri;

    @C09CT("a")
    public final String avatarUrl;

    @C09CT("c")
    public final Integer countryCode;

    @C09CT("i")
    public final String countryIso;

    @C09CT("b")
    public final String emailOrUsername;

    @C09CT("e")
    public final Long expirationDate;

    @C09CT("g")
    public final Boolean hasOIDC;

    @C09CT("ma")
    public final Boolean isMasked;

    @C09CT("f")
    public final Boolean isOcl;

    @C09CT("h")
    public final Boolean isOrgAccount;

    @C09CT("op")
    public final String isOrgPeriod;

    @C09CT("l")
    public final Long lastActiveTime;

    @C09CT("m")
    public final LoginMethodName loginMethodName;

    @C09CT("v")
    public final String maskedEmail;

    @C09CT("q")
    public final String maskedPhone;

    @C09CT("t")
    public final String oneClickLoginToken;

    @C09CT("o")
    public final String orgName;

    @C09CT("d")
    public final String phoneNumber;

    @C09CT("p")
    public final String platform;

    @C09CT("s")
    public final String screenName;

    @C09CT("j")
    public final String successfulLoginToken;

    @C09CT("u")
    public final String uid;

    @C09CT("n")
    public final String userName;

    public static EncryptedLoginMethod LIZ(EncryptedLoginMethod encryptedLoginMethod, String str, String str2, Boolean bool, int i) {
        String str3;
        LoginMethodName loginMethodName;
        String str4;
        String str5;
        Long l;
        Long l2;
        String str6;
        Integer num;
        String str7;
        String str8;
        String str9;
        String str10;
        Integer num2;
        String str11;
        String str12;
        String str13;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        String str14;
        String str15;
        String str16 = str2;
        Boolean bool5 = bool;
        String str17 = str;
        String str18 = null;
        if ((i & 1) != 0) {
            str3 = encryptedLoginMethod.uid;
        } else {
            str3 = null;
        }
        if ((i & 2) != 0) {
            loginMethodName = encryptedLoginMethod.loginMethodName;
        } else {
            loginMethodName = null;
        }
        if ((i & 4) != 0) {
            str4 = encryptedLoginMethod.userName;
        } else {
            str4 = null;
        }
        if ((i & 8) != 0) {
            str5 = encryptedLoginMethod.avatarUrl;
        } else {
            str5 = null;
        }
        if ((i & 16) != 0) {
            l = encryptedLoginMethod.expirationDate;
        } else {
            l = null;
        }
        if ((i & 32) != 0) {
            l2 = encryptedLoginMethod.lastActiveTime;
        } else {
            l2 = null;
        }
        if ((i & 64) != 0) {
            str17 = encryptedLoginMethod.oneClickLoginToken;
        }
        if ((i & 128) != 0) {
            str16 = encryptedLoginMethod.platform;
        }
        if ((i & 256) != 0) {
            str6 = encryptedLoginMethod.emailOrUsername;
        } else {
            str6 = null;
        }
        if ((i & 512) != 0) {
            num = encryptedLoginMethod.countryCode;
        } else {
            num = null;
        }
        if ((i & 1024) != 0) {
            str7 = encryptedLoginMethod.countryIso;
        } else {
            str7 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str8 = encryptedLoginMethod.phoneNumber;
        } else {
            str8 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str9 = encryptedLoginMethod.screenName;
        } else {
            str9 = null;
        }
        if ((i & 8192) != 0) {
            str10 = encryptedLoginMethod.avatarUri;
        } else {
            str10 = null;
        }
        if ((i & 16384) != 0) {
            num2 = encryptedLoginMethod.avatarExpires;
        } else {
            num2 = null;
        }
        if ((32768 & i) != 0) {
            str11 = encryptedLoginMethod.orgName;
        } else {
            str11 = null;
        }
        if ((65536 & i) != 0) {
            str12 = encryptedLoginMethod.accountType;
        } else {
            str12 = null;
        }
        if ((131072 & i) != 0) {
            str13 = encryptedLoginMethod.isOrgPeriod;
        } else {
            str13 = null;
        }
        if ((262144 & i) != 0) {
            bool5 = encryptedLoginMethod.isOcl;
        }
        if ((524288 & i) != 0) {
            bool2 = encryptedLoginMethod.hasOIDC;
        } else {
            bool2 = null;
        }
        if ((1048576 & i) != 0) {
            bool3 = encryptedLoginMethod.isOrgAccount;
        } else {
            bool3 = null;
        }
        if ((2097152 & i) != 0) {
            bool4 = encryptedLoginMethod.isMasked;
        } else {
            bool4 = null;
        }
        if ((4194304 & i) != 0) {
            str14 = encryptedLoginMethod.successfulLoginToken;
        } else {
            str14 = null;
        }
        if ((8388608 & i) != 0) {
            str15 = encryptedLoginMethod.maskedPhone;
        } else {
            str15 = null;
        }
        if ((i & 16777216) != 0) {
            str18 = encryptedLoginMethod.maskedEmail;
        }
        return new EncryptedLoginMethod(str3, loginMethodName, str4, str5, l, l2, str17, str16, str6, num, str7, str8, str9, str10, num2, str11, str12, str13, bool5, bool2, bool3, bool4, str14, str15, str18);
    }

    public EncryptedLoginMethod(String str, LoginMethodName loginMethodName, String str2, String str3, Long l, Long l2, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, String str10, Integer num2, String str11, String str12, String str13, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str14, String str15, String str16) {
        this.uid = str;
        this.loginMethodName = loginMethodName;
        this.userName = str2;
        this.avatarUrl = str3;
        this.expirationDate = l;
        this.lastActiveTime = l2;
        this.oneClickLoginToken = str4;
        this.platform = str5;
        this.emailOrUsername = str6;
        this.countryCode = num;
        this.countryIso = str7;
        this.phoneNumber = str8;
        this.screenName = str9;
        this.avatarUri = str10;
        this.avatarExpires = num2;
        this.orgName = str11;
        this.accountType = str12;
        this.isOrgPeriod = str13;
        this.isOcl = bool;
        this.hasOIDC = bool2;
        this.isOrgAccount = bool3;
        this.isMasked = bool4;
        this.successfulLoginToken = str14;
        this.maskedPhone = str15;
        this.maskedEmail = str16;
    }
}
