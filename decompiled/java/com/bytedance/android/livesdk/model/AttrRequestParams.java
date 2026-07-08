package com.bytedance.android.livesdk.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class AttrRequestParams {

    @C09CT("attr_types")
    public String attrTypes;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.attrTypes != null) {
            sb.append(", attr_types=");
            sb.append(this.attrTypes);
        }
        sb.replace(0, 2, "AttrRequestParams{");
        sb.append('}');
        return sb.toString();
    }
}
