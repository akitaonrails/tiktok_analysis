package com.ss.android.ugc.aweme.im.prompts.api.experiments;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes.dex */
public final class WheeBubbleDiversionFcConfig {

    @C09CT("banner_cooldown_period_milliseconds")
    public final long bannerCooldownPeriodMs;

    @C09CT("banner_display_interval_milliseconds")
    public final long bannerDisplayIntervalMs;

    @C09CT("banner_max_consecutive_ignored")
    public final int bannerMaxConsecutiveIgnored;

    @C09CT("banner_max_cooldown_triggers")
    public final int bannerMaxCooldownTriggers;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WheeBubbleDiversionFcConfig)) {
            return false;
        }
        WheeBubbleDiversionFcConfig wheeBubbleDiversionFcConfig = (WheeBubbleDiversionFcConfig) obj;
        return this.bannerCooldownPeriodMs == wheeBubbleDiversionFcConfig.bannerCooldownPeriodMs && this.bannerDisplayIntervalMs == wheeBubbleDiversionFcConfig.bannerDisplayIntervalMs && this.bannerMaxConsecutiveIgnored == wheeBubbleDiversionFcConfig.bannerMaxConsecutiveIgnored && this.bannerMaxCooldownTriggers == wheeBubbleDiversionFcConfig.bannerMaxCooldownTriggers;
    }

    public int hashCode() {
        return (((((C786410Ut5.Y2(this.bannerCooldownPeriodMs) * 31) + C786410Ut5.Y2(this.bannerDisplayIntervalMs)) * 31) + this.bannerMaxConsecutiveIgnored) * 31) + this.bannerMaxCooldownTriggers;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WheeBubbleDiversionFcConfig(bannerCooldownPeriodMs=");
        sbLIZ.append(this.bannerCooldownPeriodMs);
        sbLIZ.append(", bannerDisplayIntervalMs=");
        sbLIZ.append(this.bannerDisplayIntervalMs);
        sbLIZ.append(", bannerMaxConsecutiveIgnored=");
        sbLIZ.append(this.bannerMaxConsecutiveIgnored);
        sbLIZ.append(", bannerMaxCooldownTriggers=");
        sbLIZ.append(this.bannerMaxCooldownTriggers);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public WheeBubbleDiversionFcConfig() {
        this(432000000L, 259200000L, 3, 5);
    }

    public WheeBubbleDiversionFcConfig(long j, long j2, int i, int i2) {
        this.bannerCooldownPeriodMs = j;
        this.bannerDisplayIntervalMs = j2;
        this.bannerMaxConsecutiveIgnored = i;
        this.bannerMaxCooldownTriggers = i2;
    }
}
