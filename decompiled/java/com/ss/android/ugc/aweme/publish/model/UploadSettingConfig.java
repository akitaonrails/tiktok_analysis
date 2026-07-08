package com.ss.android.ugc.aweme.publish.model;

import X.AbstractC2126608Uu;
import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes35.dex */
public class UploadSettingConfig extends AbstractC2126608Uu {

    @C09CT("dns_back_type")
    public int dnsBackType;

    @C09CT("dns_main_type")
    public int dnsMainType;

    @C09CT("enable_pre_upload")
    public int enablePreUpload;

    @C09CT("pre_upload_encryption_mode")
    public int preUploadEncryptionMode;

    @C09CT("publish_close_client_watermark")
    public int publishCloseClientWatermark = 1;

    @C09CT("sw_encode_score")
    public float swEncodeScore = -1.0f;

    @C09CT("hw_encode_score")
    public float hwEncodeScore = -1.0f;

    @C09CT("dns_version")
    public int dnsVersion = -1;

    @C09CT("dns_backup_used_delay_time")
    public int dnsBackupUsedDelayTime = 2;

    @C09CT("dns_expired_time")
    public int dnsExpiredTime = 60;

    @C09CT("dns_own_server")
    public String dnsOwnServer = "";

    @C09CT("dns_google_server")
    public String dnsGoogleServer = "dns.google.com";

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadSettingConfig{publishCloseClientWatermark(server)=");
        sbLIZ.append(this.publishCloseClientWatermark);
        sbLIZ.append(", enablePreUpload=");
        sbLIZ.append(this.enablePreUpload);
        sbLIZ.append(", preUploadEncryptionMode=");
        sbLIZ.append(this.preUploadEncryptionMode);
        sbLIZ.append(", swEncodeScore=");
        sbLIZ.append(this.swEncodeScore);
        sbLIZ.append(", hwEncodeScore=");
        sbLIZ.append(this.hwEncodeScore);
        sbLIZ.append(", dnsVersion=");
        sbLIZ.append(this.dnsVersion);
        sbLIZ.append(", dnsMainType=");
        sbLIZ.append(this.dnsMainType);
        sbLIZ.append(", dnsBackType=");
        sbLIZ.append(this.dnsBackType);
        sbLIZ.append(", dnsBackupUsedDelayTime=");
        sbLIZ.append(this.dnsBackupUsedDelayTime);
        sbLIZ.append(", dnsExpiredTime=");
        sbLIZ.append(this.dnsExpiredTime);
        sbLIZ.append(", dnsOwnServer='");
        sbLIZ.append(this.dnsOwnServer);
        sbLIZ.append('\'');
        sbLIZ.append(", dnsGoogleServer='");
        sbLIZ.append(this.dnsGoogleServer);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
