package com.ss.android.ugc.aweme.relation.auth.model;

import X.C09CT;
import X.C09DE;

/* JADX INFO: loaded from: classes17.dex */
public final class ContactBookEmail {

    @C09CT("hashed_email")
    @C09DE
    public final String hashedEmail;

    public ContactBookEmail() {
        this(null);
    }

    public ContactBookEmail(String str) {
        this.hashedEmail = str;
    }
}
