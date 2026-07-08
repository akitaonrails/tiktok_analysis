package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class DeclarationPayload implements Serializable {

    @C09CT("create_time")
    public Long date;

    @C09CT("short_address")
    public String location;

    @C09CT("term_link")
    public String termLink;

    public DeclarationPayload() {
        this(null, null, null);
    }

    public DeclarationPayload(Long l, String str, String str2) {
        this.date = l;
        this.location = str;
        this.termLink = str2;
    }
}
