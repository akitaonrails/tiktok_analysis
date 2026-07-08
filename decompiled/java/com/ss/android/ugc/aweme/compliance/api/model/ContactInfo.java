package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class ContactInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("police_number")
    public final String policeNumber;

    @C09CT("whatsapp_number")
    public final String whatsappNumber;

    public ContactInfo() {
        this("", "");
    }

    public ContactInfo(String str, String str2) {
        this.policeNumber = str;
        this.whatsappNumber = str2;
    }
}
