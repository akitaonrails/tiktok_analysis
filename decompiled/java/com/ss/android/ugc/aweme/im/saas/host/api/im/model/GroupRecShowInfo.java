package com.ss.android.ugc.aweme.im.saas.host.api.im.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupRecShowInfo implements Serializable {

    @C09CT("recom_id")
    public final String recomId;

    public GroupRecShowInfo() {
        this("");
    }

    public final String getRecomId() {
        return this.recomId;
    }

    public GroupRecShowInfo(String str) {
        this.recomId = str;
    }
}
