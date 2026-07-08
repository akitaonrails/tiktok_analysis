package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class UserIntentExtra implements Serializable {

    @C09CT("sug_user_id")
    public final String sugUserId;

    public UserIntentExtra() {
        this(null);
    }

    public UserIntentExtra(String str) {
        this.sugUserId = str;
    }
}
