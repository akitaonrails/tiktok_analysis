package com.bytedance.android.livesdk.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class AttrUpdateRequestParams {

    @C09CT("attr_type")
    public Long attrType;

    @C09CT("value")
    public Long value;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.attrType != null) {
            sb.append(", attr_type=");
            sb.append(this.attrType);
        }
        if (this.value != null) {
            sb.append(", value=");
            sb.append(this.value);
        }
        sb.replace(0, 2, "AttrUpdateRequestParams{");
        sb.append('}');
        return sb.toString();
    }
}
