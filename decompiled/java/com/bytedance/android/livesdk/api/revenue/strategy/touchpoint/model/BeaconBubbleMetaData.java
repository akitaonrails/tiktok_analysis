package com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1992207rE;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class BeaconBubbleMetaData implements InterfaceC1992207rE {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("schema_url")
    public final String schemaUrl;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BeaconBubbleMetaData) && Intrinsics.LJFF(this.schemaUrl, ((BeaconBubbleMetaData) obj).schemaUrl);
    }

    public final int hashCode() {
        return this.schemaUrl.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BeaconBubbleMetaData(schemaUrl=");
        sbLIZ.append(this.schemaUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BeaconBubbleMetaData(String str) {
        this.schemaUrl = str;
    }
}
