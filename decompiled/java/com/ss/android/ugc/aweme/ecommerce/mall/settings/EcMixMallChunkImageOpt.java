package com.ss.android.ugc.aweme.ecommerce.mall.settings;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class EcMixMallChunkImageOpt {
    public static final EcMixMallChunkImageOptConfig LIZ = new EcMixMallChunkImageOptConfig(0, 0, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(979));

    public static final class EcMixMallChunkImageOptConfig {

        @C09CT("chunk1_image")
        public final int chunk1Image;

        @C09CT("chunk2_image")
        public final int chunk2Image;

        @C09CT("pdp")
        public final int pdp;

        public EcMixMallChunkImageOptConfig() {
            this(0, 0, 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EcMixMallChunkImageOptConfig)) {
                return false;
            }
            EcMixMallChunkImageOptConfig ecMixMallChunkImageOptConfig = (EcMixMallChunkImageOptConfig) obj;
            return this.chunk1Image == ecMixMallChunkImageOptConfig.chunk1Image && this.chunk2Image == ecMixMallChunkImageOptConfig.chunk2Image && this.pdp == ecMixMallChunkImageOptConfig.pdp;
        }

        public final int hashCode() {
            return (((this.chunk1Image * 31) + this.chunk2Image) * 31) + this.pdp;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EcMixMallChunkImageOptConfig(chunk1Image=");
            sbLIZ.append(this.chunk1Image);
            sbLIZ.append(", chunk2Image=");
            sbLIZ.append(this.chunk2Image);
            sbLIZ.append(", pdp=");
            sbLIZ.append(this.pdp);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public EcMixMallChunkImageOptConfig(int i, int i2, int i3) {
            this.chunk1Image = i;
            this.chunk2Image = i2;
            this.pdp = i3;
        }
    }
}
