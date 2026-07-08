package com.ss.android.ugc.aweme.account.security;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class SecurityCheckUpInfoData implements Serializable {
    public static final int $stable = 8;

    @C09CT("activity")
    public final ActivityData activity;

    @C09CT("adaptive_illustrations")
    public final boolean adaptiveIllustrations;

    @C09CT("devices")
    public final DevicesData devices;

    @C09CT("email")
    public final EmailData email;

    @C09CT("passkey")
    public final PasskeyData passkey;

    @C09CT("password")
    public final PasswordData password;

    @C09CT("phone")
    public final PhoneData phone;

    @C09CT("2sv")
    public final TwoStepData twoStepData;

    public SecurityCheckUpInfoData() {
        this(false, null, null, null, null, null, null, null);
    }

    public SecurityCheckUpInfoData(boolean z, PhoneData phoneData, EmailData emailData, TwoStepData twoStepData, DevicesData devicesData, ActivityData activityData, PasskeyData passkeyData, PasswordData passwordData) {
        this.adaptiveIllustrations = z;
        this.phone = phoneData;
        this.email = emailData;
        this.twoStepData = twoStepData;
        this.devices = devicesData;
        this.activity = activityData;
        this.passkey = passkeyData;
        this.password = passwordData;
    }
}
