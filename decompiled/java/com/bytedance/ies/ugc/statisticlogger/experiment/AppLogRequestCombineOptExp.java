package com.bytedance.ies.ugc.statisticlogger.experiment;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AppLogRequestCombineOptExp {
    public static final AppLogRequestCombineOptExp INSTANCE = new AppLogRequestCombineOptExp();
    public static final ApplogRequestCombineConfig CONFIG = new ApplogRequestCombineConfig(false, 0, null, 7, null);
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(126));

    public final ApplogRequestCombineConfig getValue() {
        return (ApplogRequestCombineConfig) value$delegate.getValue();
    }

    public static final class ApplogRequestCombineConfig {

        @C09CT("combine_interval_ms")
        public final long combineIntervalMs;

        @C09CT("enable")
        public final boolean enable;

        @C09CT("trigger_events")
        public final List<String> triggerEvents;

        public ApplogRequestCombineConfig() {
            this(false, 0L, null, 7, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ApplogRequestCombineConfig)) {
                return false;
            }
            ApplogRequestCombineConfig applogRequestCombineConfig = (ApplogRequestCombineConfig) obj;
            return this.enable == applogRequestCombineConfig.enable && this.combineIntervalMs == applogRequestCombineConfig.combineIntervalMs && Intrinsics.LJFF(this.triggerEvents, applogRequestCombineConfig.triggerEvents);
        }

        public final int hashCode() {
            return (((C786410Ut5.Z2(this.enable) * 31) + C786410Ut5.Y2(this.combineIntervalMs)) * 31) + this.triggerEvents.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ApplogRequestCombineConfig(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", combineIntervalMs=");
            sbLIZ.append(this.combineIntervalMs);
            sbLIZ.append(", triggerEvents=");
            sbLIZ.append(this.triggerEvents);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public ApplogRequestCombineConfig(boolean z, long j, List<String> list) {
            this.enable = z;
            this.combineIntervalMs = j;
            this.triggerEvents = list;
        }

        public ApplogRequestCombineConfig(boolean z, long j, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 500L : j, (i & 4) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
