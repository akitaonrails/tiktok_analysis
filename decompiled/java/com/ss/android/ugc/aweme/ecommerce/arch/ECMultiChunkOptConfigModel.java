package com.ss.android.ugc.aweme.ecommerce.arch;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes3.dex */
public final class ECMultiChunkOptConfigModel {

    @C09CT("enable")
    public final int enable;

    @C09CT("opt_parse")
    public final int optParse;

    @C09CT("storage_delay")
    public final long storageDelay;

    @C09CT("storage_gap")
    public final long storageGap;

    public ECMultiChunkOptConfigModel() {
        this(0, 3000L, 300000L, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECMultiChunkOptConfigModel)) {
            return false;
        }
        ECMultiChunkOptConfigModel eCMultiChunkOptConfigModel = (ECMultiChunkOptConfigModel) obj;
        return this.enable == eCMultiChunkOptConfigModel.enable && this.storageDelay == eCMultiChunkOptConfigModel.storageDelay && this.storageGap == eCMultiChunkOptConfigModel.storageGap && this.optParse == eCMultiChunkOptConfigModel.optParse;
    }

    public final int hashCode() {
        return (((((this.enable * 31) + C786410Ut5.Y2(this.storageDelay)) * 31) + C786410Ut5.Y2(this.storageGap)) * 31) + this.optParse;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ECMultiChunkOptConfigModel(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", storageDelay=");
        sbLIZ.append(this.storageDelay);
        sbLIZ.append(", storageGap=");
        sbLIZ.append(this.storageGap);
        sbLIZ.append(", optParse=");
        sbLIZ.append(this.optParse);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ECMultiChunkOptConfigModel(int i, long j, long j2, int i2) {
        this.enable = i;
        this.storageDelay = j;
        this.storageGap = j2;
        this.optParse = i2;
    }
}
