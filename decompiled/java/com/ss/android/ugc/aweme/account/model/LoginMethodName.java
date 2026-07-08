package com.ss.android.ugc.aweme.account.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class LoginMethodName {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ LoginMethodName[] $VALUES;
    public static final LoginMethodName UNKNOWN = new LoginMethodName("UNKNOWN", 0);
    public static final LoginMethodName DEFAULT = new LoginMethodName(LivePreviewCTASmartDisplayManager.DEFAULT, 1);
    public static final LoginMethodName EMAIL_PASS = new LoginMethodName("EMAIL_PASS", 2);
    public static final LoginMethodName USER_NAME_PASS = new LoginMethodName("USER_NAME_PASS", 3);
    public static final LoginMethodName PHONE_NUMBER_PASS = new LoginMethodName("PHONE_NUMBER_PASS", 4);
    public static final LoginMethodName PHONE_SMS = new LoginMethodName("PHONE_SMS", 5);
    public static final LoginMethodName THIRD_PARTY = new LoginMethodName("THIRD_PARTY", 6);
    public static final LoginMethodName PASSKEY = new LoginMethodName("PASSKEY", 7);

    public static final /* synthetic */ LoginMethodName[] $values() {
        return new LoginMethodName[]{UNKNOWN, DEFAULT, EMAIL_PASS, USER_NAME_PASS, PHONE_NUMBER_PASS, PHONE_SMS, THIRD_PARTY, PASSKEY};
    }

    public static InterfaceC2044707zh<LoginMethodName> getEntries() {
        return $ENTRIES;
    }

    static {
        LoginMethodName[] loginMethodNameArr$values = $values();
        $VALUES = loginMethodNameArr$values;
        $ENTRIES = new C2254308sP(loginMethodNameArr$values);
    }

    public static LoginMethodName[] values() {
        return (LoginMethodName[]) $VALUES.clone();
    }

    public static LoginMethodName valueOf(String str) {
        return (LoginMethodName) C08FF.LIZ(LoginMethodName.class, str);
    }

    public LoginMethodName(String str, int i) {
    }
}
