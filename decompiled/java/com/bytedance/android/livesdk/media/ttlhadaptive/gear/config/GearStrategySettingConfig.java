package com.bytedance.android.livesdk.media.ttlhadaptive.gear.config;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class GearStrategySettingConfig {

    @C09CT("enable_starship")
    public int enableStarShip;

    @C09CT("ttlh_gear_adaptive_enable")
    public int enableTTLHGearAdaptive;

    @C09CT("version_code")
    public int versionCode = -1;

    @C09CT("gear_adaptive_version")
    public int gearAdaptiveVersion = -1;

    @C09CT("enable_new_starship")
    public int enableStarShipEngine = -1;

    public final boolean LIZ() {
        return this.enableTTLHGearAdaptive == 1;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GearStrategySettingConfig{versionCode=");
        sbLIZ.append(this.versionCode);
        sbLIZ.append(", enableTTLHGearAdaptive=");
        sbLIZ.append(this.enableTTLHGearAdaptive);
        sbLIZ.append(", enableStarShip=");
        sbLIZ.append(this.enableStarShip);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
