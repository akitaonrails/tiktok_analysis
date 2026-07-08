package com.ss.android.ugc.aweme.legoImp.task.pumbaa.settings;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PnsRawWebViewTrackSettings {
    public static TrackConfig LIZIZ;
    public static final PnsRawWebViewTrackSettings LIZ = new PnsRawWebViewTrackSettings();
    public static long LIZJ = System.currentTimeMillis();

    public static final class TrackConfig {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("url_contains")
        public final List<String> urlContains;

        public TrackConfig() {
            this(false, null, 3, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TrackConfig)) {
                return false;
            }
            TrackConfig trackConfig = (TrackConfig) obj;
            return this.enable == trackConfig.enable && Intrinsics.LJFF(this.urlContains, trackConfig.urlContains);
        }

        public final int hashCode() {
            return (C786410Ut5.Z2(this.enable) * 31) + this.urlContains.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TrackConfig(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", urlContains=");
            sbLIZ.append(this.urlContains);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public TrackConfig(boolean z, List<String> list) {
            this.enable = z;
            this.urlContains = list;
        }

        public TrackConfig(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
