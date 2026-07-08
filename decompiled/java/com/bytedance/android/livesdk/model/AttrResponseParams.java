package com.bytedance.android.livesdk.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class AttrResponseParams {

    @C09CT("data")
    public UserAttrResponse data;

    @C09CT("extra")
    public Extra extra;

    public static final class Extra {
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.replace(0, 2, "Extra{");
            sb.append('}');
            return sb.toString();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        sb.replace(0, 2, "AttrResponseParams{");
        sb.append('}');
        return sb.toString();
    }
}
