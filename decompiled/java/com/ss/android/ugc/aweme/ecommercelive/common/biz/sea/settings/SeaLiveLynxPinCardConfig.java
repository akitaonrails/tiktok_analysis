package com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.settings;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SeaLiveLynxPinCardConfig {

    @C09CT("schema")
    public final String schema;

    public SeaLiveLynxPinCardConfig() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SeaLiveLynxPinCardConfig) && Intrinsics.LJFF(this.schema, ((SeaLiveLynxPinCardConfig) obj).schema);
    }

    public final int hashCode() {
        String str = this.schema;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaLiveLynxPinCardConfig(schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeaLiveLynxPinCardConfig(String str) {
        this.schema = str;
    }
}
