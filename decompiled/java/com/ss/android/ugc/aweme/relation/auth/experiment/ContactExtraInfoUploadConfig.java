package com.ss.android.ugc.aweme.relation.auth.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class ContactExtraInfoUploadConfig {

    @C09CT("change_registered_contact_ui")
    public final boolean enableChangeUI;

    @C09CT("upload_more_info")
    public final boolean enableUploadMoreInfo;

    public ContactExtraInfoUploadConfig() {
        this(false, false);
    }

    public ContactExtraInfoUploadConfig(boolean z, boolean z2) {
        this.enableUploadMoreInfo = z;
        this.enableChangeUI = z2;
    }
}
