package com.ss.android.ugc.aweme.account.security;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class EmailData implements Serializable {
    public static final int $stable = 0;

    @C09CT("bind_email")
    public final String bindEmail;

    @C09CT("bind_source")
    public final String bindSource;

    @C09CT("display_order")
    public final int displayOrder;

    @C09CT("email")
    public final String email;

    @C09CT("is_verified")
    public final boolean isVerified;

    @C09CT("last_updated_timestamp")
    public final long lastUpdatedTimestamp;

    public EmailData() {
        this("", false, 0L, "", "", -1);
    }

    public final boolean isVerified() {
        return this.isVerified;
    }

    public EmailData(String str, boolean z, long j, String str2, String str3, int i) {
        this.email = str;
        this.isVerified = z;
        this.lastUpdatedTimestamp = j;
        this.bindEmail = str2;
        this.bindSource = str3;
        this.displayOrder = i;
    }
}
