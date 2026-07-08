package com.ss.android.ugc.aweme.account.login.passkey.api;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class PasskeyCredentialsData implements Serializable {
    public static final int $stable = 8;

    @C09CT("credentials")
    public final List<PasskeyCredential> credentials;

    public PasskeyCredentialsData() {
        this(null, 1, null);
    }

    public PasskeyCredentialsData(List<PasskeyCredential> list) {
        this.credentials = list;
    }

    public PasskeyCredentialsData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
