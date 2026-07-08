package com.ss.android.ugc.aweme.commercialize.router.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class CRouterPhoneModel implements Serializable {

    @C09CT("phone_number")
    public String phoneNumber;

    public CRouterPhoneModel() {
        this(null);
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public CRouterPhoneModel(String str) {
        this.phoneNumber = str;
    }

    public final void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }
}
