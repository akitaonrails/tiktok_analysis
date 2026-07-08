package com.ss.android.ugc.nearby.settings;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyChunkOptExperiment {
    public static final NearbyChunkOptConfig LIZ = new NearbyChunkOptConfig(false, 0, 6, 6, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(638));

    public static boolean LIZ(String str) {
        List<String> list;
        C01GW c01gw = LIZIZ;
        if (!((NearbyChunkOptConfig) c01gw.getValue()).enable || (list = ((NearbyChunkOptConfig) c01gw.getValue()).loadScenes) == null || list.isEmpty() || str == null || !list.contains(str)) {
            return false;
        }
        return true;
    }

    public static final class NearbyChunkOptConfig {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("first_chunk_count")
        public final int firstChunkCount;

        @C09CT("load_scene")
        public final List<String> loadScenes;

        @C09CT("second_chunk_count")
        public final int secondChunkCount;

        @C09CT("third_chunk_count")
        public final int thirdChunkCount;

        public NearbyChunkOptConfig() {
            this(false, 0, 6, 6, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NearbyChunkOptConfig)) {
                return false;
            }
            NearbyChunkOptConfig nearbyChunkOptConfig = (NearbyChunkOptConfig) obj;
            return this.enable == nearbyChunkOptConfig.enable && this.firstChunkCount == nearbyChunkOptConfig.firstChunkCount && this.secondChunkCount == nearbyChunkOptConfig.secondChunkCount && this.thirdChunkCount == nearbyChunkOptConfig.thirdChunkCount && Intrinsics.LJFF(this.loadScenes, nearbyChunkOptConfig.loadScenes);
        }

        public final int hashCode() {
            int iZ2 = ((((((C786410Ut5.Z2(this.enable) * 31) + this.firstChunkCount) * 31) + this.secondChunkCount) * 31) + this.thirdChunkCount) * 31;
            List<String> list = this.loadScenes;
            return iZ2 + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NearbyChunkOptConfig(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", firstChunkCount=");
            sbLIZ.append(this.firstChunkCount);
            sbLIZ.append(", secondChunkCount=");
            sbLIZ.append(this.secondChunkCount);
            sbLIZ.append(", thirdChunkCount=");
            sbLIZ.append(this.thirdChunkCount);
            sbLIZ.append(", loadScenes=");
            sbLIZ.append(this.loadScenes);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public NearbyChunkOptConfig(boolean z, int i, int i2, int i3, List<String> list) {
            this.enable = z;
            this.firstChunkCount = i;
            this.secondChunkCount = i2;
            this.thirdChunkCount = i3;
            this.loadScenes = list;
        }
    }
}
