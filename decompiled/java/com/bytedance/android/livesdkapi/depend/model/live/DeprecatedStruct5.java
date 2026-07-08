package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class DeprecatedStruct5 {

    @C09CT("deprecated1")
    public DeprecatedStruct6 deprecated1;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.deprecated1 != null) {
            sb.append(", deprecated1=");
            sb.append(this.deprecated1);
        }
        sb.replace(0, 2, "DeprecatedStruct5{");
        sb.append('}');
        return sb.toString();
    }
}
