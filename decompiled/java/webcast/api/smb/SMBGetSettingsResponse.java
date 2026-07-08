package webcast.api.smb;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class SMBGetSettingsResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("verification_settings")
        public VerificationSetting verificationSettings;
    }
}
