package com.bytedance.android.livesdk.media.ttlhadaptive.engine;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class StrategySettingConfig {

    @C09CT("enable_augur")
    public int enableAugur;

    @C09CT("enable_ignore_exp_nil")
    public int enableIgnoreExpNil;

    @C09CT("enable_skip_null_node")
    public int enableSkipNullNode;

    @C09CT("ttlh_adaptive_enable")
    public int enableTTLHAdaptive;

    @C09CT("event_interval_sec")
    public int eventInterval = 10;

    @C09CT("version_code")
    public int versionCode = -1;

    @C09CT("adaptive_version")
    public int adaptiveVersion = -1;

    @C09CT("enable_thread_safe")
    public int enableThreadSafe = -1;

    @C09CT("enable_starship")
    public int enableStarShip = -1;

    @C09CT("enable_new_starship")
    public int enableStarShipEngine = -1;

    @C09CT("short_long_ratio_tolerance_threshold")
    public float gameShortLongRatio = 1.0f;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StrategySettingConfig{enableTTLHAdaptive=");
        sbLIZ.append(this.enableTTLHAdaptive);
        sbLIZ.append(", eventInterval=");
        sbLIZ.append(this.eventInterval);
        sbLIZ.append(", versionCode=");
        sbLIZ.append(this.versionCode);
        sbLIZ.append(", adaptiveVersion=");
        sbLIZ.append(this.adaptiveVersion);
        sbLIZ.append(", enableStarShip=");
        sbLIZ.append(this.enableStarShip);
        sbLIZ.append(", gameShortLongRatio=");
        sbLIZ.append(this.gameShortLongRatio);
        sbLIZ.append(", enableIgnoreExpNil=");
        sbLIZ.append(this.enableIgnoreExpNil);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
