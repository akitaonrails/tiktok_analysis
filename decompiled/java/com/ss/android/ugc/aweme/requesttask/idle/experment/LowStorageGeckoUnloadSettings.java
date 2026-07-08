package com.ss.android.ugc.aweme.requesttask.idle.experment;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes4.dex */
public final class LowStorageGeckoUnloadSettings {
    public static final LowStorageGeckoUnloadModel LIZ = new LowStorageGeckoUnloadModel(5000000000L, true);

    public static class LowStorageGeckoUnloadModel {

        @C09CT("enable")
        public boolean enable;

        @C09CT("low_storage_size")
        public long lowStorageSize;

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LowStorageGeckoUnloadModel{lowStorageSize=");
            sbLIZ.append(this.lowStorageSize);
            sbLIZ.append(", enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public LowStorageGeckoUnloadModel(long j, boolean z) {
            this.lowStorageSize = j;
            this.enable = z;
        }
    }
}
