package com.ss.android.ugc.aweme.ad.feed.experiment;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import java.io.Serializable;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class VSAProductIdRecordSetting {
    public static final VSAProductIdRecordParam LIZ = new VSAProductIdRecordParam(false, 50);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(86));

    public static final class VSAProductIdRecordParam implements Serializable {

        @C09CT("record_enable")
        public final boolean enable;

        @C09CT("record_max_count")
        public final int maxCount;

        public VSAProductIdRecordParam() {
            this(false, 50);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VSAProductIdRecordParam)) {
                return false;
            }
            VSAProductIdRecordParam vSAProductIdRecordParam = (VSAProductIdRecordParam) obj;
            return this.enable == vSAProductIdRecordParam.enable && this.maxCount == vSAProductIdRecordParam.maxCount;
        }

        public int hashCode() {
            return (C786410Ut5.Z2(this.enable) * 31) + this.maxCount;
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VSAProductIdRecordParam(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", maxCount=");
            sbLIZ.append(this.maxCount);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public VSAProductIdRecordParam(boolean z, int i) {
            this.enable = z;
            this.maxCount = i;
        }
    }
}
