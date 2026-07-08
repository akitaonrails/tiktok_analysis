package com.ss.android.ugc.aweme.compliance.api.model;

import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class FeedLynxOverlayConfig {
    public static final int $stable = 0;
    public final String lynxSchema;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeedLynxOverlayConfig) && Intrinsics.LJFF(this.lynxSchema, ((FeedLynxOverlayConfig) obj).lynxSchema);
    }

    public int hashCode() {
        return this.lynxSchema.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedLynxOverlayConfig(lynxSchema=");
        sbLIZ.append(this.lynxSchema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FeedLynxOverlayConfig(String str) {
        this.lynxSchema = str;
    }
}
