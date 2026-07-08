package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes5.dex */
public class AwemeFeEliteItem {

    @C09CT("edit_contact_link")
    public String editContactLink;

    @C09CT("edit_service_center_link")
    public String editServiceCenterLink;

    public String getEditContactLink() throws C316660CbA {
        String str = this.editContactLink;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public String getEditServiceCenterLink() throws C316660CbA {
        String str = this.editServiceCenterLink;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }
}
