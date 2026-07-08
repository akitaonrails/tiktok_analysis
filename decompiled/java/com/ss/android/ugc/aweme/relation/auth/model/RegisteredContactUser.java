package com.ss.android.ugc.aweme.relation.auth.model;

import X.C09CT;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes17.dex */
public final class RegisteredContactUser extends User {

    @C09CT("social_name")
    public final String hashContactName;

    @C09CT("phone_number")
    public final String hashNationalNumber;

    public RegisteredContactUser() {
        this(null, null);
    }

    public final String getHashContactName() {
        return this.hashContactName;
    }

    public final String getHashNationalNumber() {
        return this.hashNationalNumber;
    }

    public RegisteredContactUser(String str, String str2) {
        this.hashContactName = str;
        this.hashNationalNumber = str2;
    }
}
