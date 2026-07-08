package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class IncidentInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("city")
    public final String city;

    @C09CT("full_address")
    public final String fullAddress;

    @C09CT("last_seen_date")
    public final String lastSeenDate;

    @C09CT("last_seen_time")
    public final String lastSeenTime;

    @C09CT("short_address")
    public final String shortAddress;

    @C09CT("state")
    public final String state;

    public IncidentInfo() {
        this("", "", "", "", "", "");
    }

    public IncidentInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        this.fullAddress = str;
        this.shortAddress = str2;
        this.state = str3;
        this.city = str4;
        this.lastSeenDate = str5;
        this.lastSeenTime = str6;
    }
}
