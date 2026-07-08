package com.ss.android.ugc.aweme.account.security;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class PhoneData implements Serializable {
    public static final int $stable = 0;

    @C09CT("bind_number")
    public final String bindNumber;

    @C09CT("bind_source")
    public final String bindSource;

    @C09CT("display_order")
    public final int displayOrder;

    @C09CT("last_updated_timestamp")
    public final long lastUpdatedTimestamp;

    @C09CT("number")
    public final String number;

    public PhoneData() {
        this("", 0L, "", "", -1);
    }

    public PhoneData(String str, long j, String str2, String str3, int i) {
        this.number = str;
        this.lastUpdatedTimestamp = j;
        this.bindNumber = str2;
        this.bindSource = str3;
        this.displayOrder = i;
    }
}
