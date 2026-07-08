package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes5.dex */
public class BioSettings {

    @C09CT("enable_bio_email")
    public Boolean enableBioEmail;

    @C09CT("enable_bio_url")
    public Boolean enableBioUrl;

    public Boolean getEnableBioEmail() throws C316660CbA {
        Boolean bool = this.enableBioEmail;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }

    public Boolean getEnableBioUrl() throws C316660CbA {
        Boolean bool = this.enableBioUrl;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }
}
