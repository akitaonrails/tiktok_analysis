package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class TagBAUser implements Serializable {

    @C09CT("handle_name")
    public final String handleName;

    @C09CT("uid")
    public final String uid;

    public final String getHandleName() {
        return this.handleName;
    }

    public final String getUid() {
        return this.uid;
    }
}
