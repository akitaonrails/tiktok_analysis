package com.bytedance.ies.ugc.aweme.commwecialize.ba.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class ExpandEmailAndPhone implements Serializable {

    @C09CT("enable")
    public final Boolean enable;

    @C09CT("schema")
    public final String schema;

    public final Boolean getEnable() {
        return this.enable;
    }

    public final String getSchema() {
        return this.schema;
    }

    public ExpandEmailAndPhone(Boolean bool, String str) {
        this.enable = bool;
        this.schema = str;
    }
}
