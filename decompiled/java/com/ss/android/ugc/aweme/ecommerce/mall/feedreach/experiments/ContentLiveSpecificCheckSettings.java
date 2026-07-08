package com.ss.android.ugc.aweme.ecommerce.mall.feedreach.experiments;

import X.C01GW;
import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class ContentLiveSpecificCheckSettings {
    public static final Config LIZ = new Config(false, C2097608Jq.LJ(), "", "");
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(164));

    public static final class Config {

        @C09CT("android_event")
        public final String androidEvent;

        @C09CT("enable")
        public final boolean enable;

        @C09CT("event_params")
        public final String eventParams;

        @C09CT("targets")
        public final Map<String, List<String>> targets;

        public Config() {
            this(false, C2097608Jq.LJ(), "", "");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.enable == config.enable && Intrinsics.LJFF(this.targets, config.targets) && Intrinsics.LJFF(this.androidEvent, config.androidEvent) && Intrinsics.LJFF(this.eventParams, config.eventParams);
        }

        public final int hashCode() {
            return (((((C786410Ut5.Z2(this.enable) * 31) + this.targets.hashCode()) * 31) + this.androidEvent.hashCode()) * 31) + this.eventParams.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Config(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", targets=");
            sbLIZ.append(this.targets);
            sbLIZ.append(", androidEvent=");
            sbLIZ.append(this.androidEvent);
            sbLIZ.append(", eventParams=");
            sbLIZ.append(this.eventParams);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Config(boolean z, Map<String, ? extends List<String>> map, String str, String str2) {
            this.enable = z;
            this.targets = map;
            this.androidEvent = str;
            this.eventParams = str2;
        }
    }
}
