package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class MtcertSettings {

    @C09CT("cert_url_schema")
    public String certUrlSchema;

    @C09CT("enable_change_handle_notice")
    public Boolean enableChangeHandleNotice;

    @C09CT("enable_change_mobile_notice")
    public Boolean enableChangeMobileNotice;

    @C09CT("enable_change_nickname_notice")
    public Boolean enableChangeNicknameNotice;

    @C09CT("enable_private_account_notice")
    public Boolean enablePrivateAccountNotice;

    @C09CT("show_cert_entry")
    public Boolean showCertEntry;

    @C09CT("verification_badge_type")
    public List<VerificationBadgeType> verificationBadgeType;

    public MtcertSettings() {
        Boolean bool = Boolean.FALSE;
        this.showCertEntry = bool;
        this.enablePrivateAccountNotice = bool;
        this.enableChangeMobileNotice = bool;
        this.enableChangeHandleNotice = bool;
        this.enableChangeNicknameNotice = bool;
        this.verificationBadgeType = new ArrayList();
        this.certUrlSchema = "";
    }

    public String getCertUrlSchema() {
        return this.certUrlSchema;
    }

    public Boolean getEnableChangeHandleNotice() {
        return this.enableChangeHandleNotice;
    }

    public Boolean getEnableChangeMobileNotice() {
        return this.enableChangeMobileNotice;
    }

    public Boolean getEnableChangeNicknameNotice() {
        return this.enableChangeNicknameNotice;
    }

    public Boolean getEnablePrivateAccountNotice() {
        return this.enablePrivateAccountNotice;
    }

    public Boolean getShowCertEntry() {
        return this.showCertEntry;
    }

    public List<VerificationBadgeType> getVerificationBadgeType() {
        return this.verificationBadgeType;
    }
}
