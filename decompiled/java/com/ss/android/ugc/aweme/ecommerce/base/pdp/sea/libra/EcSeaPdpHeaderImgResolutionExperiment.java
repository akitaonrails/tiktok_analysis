package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.libra;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class EcSeaPdpHeaderImgResolutionExperiment {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(976));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(977));

    public static final class Resolution {

        @C09CT("height")
        public final int height;

        @C09CT("width")
        public final int width;

        public Resolution() {
            this(0, 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Resolution)) {
                return false;
            }
            Resolution resolution = (Resolution) obj;
            return this.width == resolution.width && this.height == resolution.height;
        }

        public final int hashCode() {
            return (this.width * 31) + this.height;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Resolution(width=");
            sbLIZ.append(this.width);
            sbLIZ.append(", height=");
            sbLIZ.append(this.height);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Resolution(int i, int i2) {
            this.width = i;
            this.height = i2;
        }
    }
}
