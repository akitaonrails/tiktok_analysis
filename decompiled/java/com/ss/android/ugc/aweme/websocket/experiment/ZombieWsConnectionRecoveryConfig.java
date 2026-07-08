package com.ss.android.ugc.aweme.websocket.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes14.dex */
public final class ZombieWsConnectionRecoveryConfig {
    public static final ZombieWsConnectionRecovery LIZ = new ZombieWsConnectionRecovery(false, 900000, 60000, false, true, true, true, true);

    public static final class ZombieWsConnectionRecovery {

        @C09CT("check_on_app_launch")
        public final boolean checkOnAppLaunch;

        @C09CT("check_on_foreground")
        public final boolean checkOnForeground;

        @C09CT("check_on_network_resume")
        public final boolean checkOnNetworkResume;

        @C09CT("check_on_network_type_change")
        public final boolean checkOnNetworkTypeChange;

        @C09CT("enabled")
        public final boolean enabled;

        @C09CT("min_reconnect_interval_ms")
        public final long minReconnectIntervalMs;

        @C09CT("skip_staleness_on_network_change")
        public final boolean skipStalenessOnNetworkChange;

        @C09CT("staleness_window_ms")
        public final long stalenessWindowMs;

        public ZombieWsConnectionRecovery() {
            this(false, 900000L, 60000L, false, true, true, true, true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ZombieWsConnectionRecovery)) {
                return false;
            }
            ZombieWsConnectionRecovery zombieWsConnectionRecovery = (ZombieWsConnectionRecovery) obj;
            return this.enabled == zombieWsConnectionRecovery.enabled && this.stalenessWindowMs == zombieWsConnectionRecovery.stalenessWindowMs && this.minReconnectIntervalMs == zombieWsConnectionRecovery.minReconnectIntervalMs && this.skipStalenessOnNetworkChange == zombieWsConnectionRecovery.skipStalenessOnNetworkChange && this.checkOnAppLaunch == zombieWsConnectionRecovery.checkOnAppLaunch && this.checkOnForeground == zombieWsConnectionRecovery.checkOnForeground && this.checkOnNetworkResume == zombieWsConnectionRecovery.checkOnNetworkResume && this.checkOnNetworkTypeChange == zombieWsConnectionRecovery.checkOnNetworkTypeChange;
        }

        public int hashCode() {
            return (((((((((((((C786410Ut5.Z2(this.enabled) * 31) + C786410Ut5.Y2(this.stalenessWindowMs)) * 31) + C786410Ut5.Y2(this.minReconnectIntervalMs)) * 31) + C786410Ut5.Z2(this.skipStalenessOnNetworkChange)) * 31) + C786410Ut5.Z2(this.checkOnAppLaunch)) * 31) + C786410Ut5.Z2(this.checkOnForeground)) * 31) + C786410Ut5.Z2(this.checkOnNetworkResume)) * 31) + C786410Ut5.Z2(this.checkOnNetworkTypeChange);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ZombieWsConnectionRecovery(enabled=");
            sbLIZ.append(this.enabled);
            sbLIZ.append(", stalenessWindowMs=");
            sbLIZ.append(this.stalenessWindowMs);
            sbLIZ.append(", minReconnectIntervalMs=");
            sbLIZ.append(this.minReconnectIntervalMs);
            sbLIZ.append(", skipStalenessOnNetworkChange=");
            sbLIZ.append(this.skipStalenessOnNetworkChange);
            sbLIZ.append(", checkOnAppLaunch=");
            sbLIZ.append(this.checkOnAppLaunch);
            sbLIZ.append(", checkOnForeground=");
            sbLIZ.append(this.checkOnForeground);
            sbLIZ.append(", checkOnNetworkResume=");
            sbLIZ.append(this.checkOnNetworkResume);
            sbLIZ.append(", checkOnNetworkTypeChange=");
            sbLIZ.append(this.checkOnNetworkTypeChange);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public ZombieWsConnectionRecovery(boolean z, long j, long j2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            this.enabled = z;
            this.stalenessWindowMs = j;
            this.minReconnectIntervalMs = j2;
            this.skipStalenessOnNetworkChange = z2;
            this.checkOnAppLaunch = z3;
            this.checkOnForeground = z4;
            this.checkOnNetworkResume = z5;
            this.checkOnNetworkTypeChange = z6;
        }
    }
}
