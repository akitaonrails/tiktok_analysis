package com.ss.android.ugc.tiktok.location.config;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class LocationCertSignalsConfigModel {

    @C09CT("cell")
    public final LocationCertSignalRuleConfig cell;

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("sensor")
    public final LocationCertSignalRuleConfig sensor;

    @C09CT("wifi")
    public final LocationCertSignalRuleConfig wifi;

    public LocationCertSignalsConfigModel() {
        this(true, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationCertSignalsConfigModel)) {
            return false;
        }
        LocationCertSignalsConfigModel locationCertSignalsConfigModel = (LocationCertSignalsConfigModel) obj;
        return this.enabled == locationCertSignalsConfigModel.enabled && Intrinsics.LJFF(this.wifi, locationCertSignalsConfigModel.wifi) && Intrinsics.LJFF(this.cell, locationCertSignalsConfigModel.cell) && Intrinsics.LJFF(this.sensor, locationCertSignalsConfigModel.sensor);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.enabled) * 31;
        LocationCertSignalRuleConfig locationCertSignalRuleConfig = this.wifi;
        int iHashCode = (iZ2 + (locationCertSignalRuleConfig == null ? 0 : locationCertSignalRuleConfig.hashCode())) * 31;
        LocationCertSignalRuleConfig locationCertSignalRuleConfig2 = this.cell;
        int iHashCode2 = (iHashCode + (locationCertSignalRuleConfig2 == null ? 0 : locationCertSignalRuleConfig2.hashCode())) * 31;
        LocationCertSignalRuleConfig locationCertSignalRuleConfig3 = this.sensor;
        return iHashCode2 + (locationCertSignalRuleConfig3 != null ? locationCertSignalRuleConfig3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocationCertSignalsConfigModel(enabled=");
        sbLIZ.append(this.enabled);
        sbLIZ.append(", wifi=");
        sbLIZ.append(this.wifi);
        sbLIZ.append(", cell=");
        sbLIZ.append(this.cell);
        sbLIZ.append(", sensor=");
        sbLIZ.append(this.sensor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LocationCertSignalsConfigModel(boolean z, LocationCertSignalRuleConfig locationCertSignalRuleConfig, LocationCertSignalRuleConfig locationCertSignalRuleConfig2, LocationCertSignalRuleConfig locationCertSignalRuleConfig3) {
        this.enabled = z;
        this.wifi = locationCertSignalRuleConfig;
        this.cell = locationCertSignalRuleConfig2;
        this.sensor = locationCertSignalRuleConfig3;
    }
}
