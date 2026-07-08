package com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1121530fI7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class BeaconBubbleEntryData implements InterfaceC1121530fI7 {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("conditions")
    public final Conditions conditions;

    @C09CT("entry_type")
    public final long entryPoint;

    @C09CT("schema_url")
    public final String schemaUrl;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeaconBubbleEntryData)) {
            return false;
        }
        BeaconBubbleEntryData beaconBubbleEntryData = (BeaconBubbleEntryData) obj;
        return this.entryPoint == beaconBubbleEntryData.entryPoint && Intrinsics.LJFF(this.conditions, beaconBubbleEntryData.conditions) && Intrinsics.LJFF(this.schemaUrl, beaconBubbleEntryData.schemaUrl);
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.entryPoint) * 31) + this.conditions.hashCode()) * 31) + this.schemaUrl.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BeaconBubbleEntryData(entryPoint=");
        sbLIZ.append(this.entryPoint);
        sbLIZ.append(", conditions=");
        sbLIZ.append(this.conditions);
        sbLIZ.append(", schemaUrl=");
        sbLIZ.append(this.schemaUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BeaconBubbleEntryData(long j, Conditions conditions, String str) {
        this.entryPoint = j;
        this.conditions = conditions;
        this.schemaUrl = str;
    }
}
