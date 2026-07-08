package webcast.api.smb;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class SMBIndustryVerificationSubmitRequest {

    @C09CT("license_type")
    public int licenseType;

    @C09CT("type")
    public int type;

    @C09CT("file_uris")
    public List<String> fileUris = new ArrayList();

    @C09CT("appeal_reason")
    public String appealReason = "";
}
