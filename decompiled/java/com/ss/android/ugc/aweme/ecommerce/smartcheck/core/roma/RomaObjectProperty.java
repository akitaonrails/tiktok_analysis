package com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class RomaObjectProperty {

    @C09CT("description")
    public final String description;

    @C09CT("key")
    public String key;

    @C09CT("required")
    public boolean required;

    @C09CT("type")
    public final String type;

    public final String getDescription() {
        return this.description;
    }

    public final String getKey() {
        return this.key;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public final String getType() {
        return this.type;
    }

    public final void setKey(String str) {
        this.key = str;
    }

    public final void setRequired(boolean z) {
        this.required = z;
    }
}
