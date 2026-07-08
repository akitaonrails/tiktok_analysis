package com.ss.android.ugc.awemepushlib.experiments;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class PushUIOptimizationExp {
    public static final Config LIZ = new Config(false, false, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(189));

    public static final class Config {

        @C09CT("center_icons_vertically")
        public final boolean centerIconsVertically;

        @C09CT("remove_horizontal_padding")
        public final boolean removeHorizontalPadding;

        @C09CT("remove_null_img_placeholder")
        public final boolean removeNullImgPlaceholder;

        public Config() {
            this(false, false, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.removeNullImgPlaceholder == config.removeNullImgPlaceholder && this.centerIconsVertically == config.centerIconsVertically && this.removeHorizontalPadding == config.removeHorizontalPadding;
        }

        public final int hashCode() {
            return (((C786410Ut5.Z2(this.removeNullImgPlaceholder) * 31) + C786410Ut5.Z2(this.centerIconsVertically)) * 31) + C786410Ut5.Z2(this.removeHorizontalPadding);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Config(removeNullImgPlaceholder=");
            sbLIZ.append(this.removeNullImgPlaceholder);
            sbLIZ.append(", centerIconsVertically=");
            sbLIZ.append(this.centerIconsVertically);
            sbLIZ.append(", removeHorizontalPadding=");
            sbLIZ.append(this.removeHorizontalPadding);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Config(boolean z, boolean z2, boolean z3) {
            this.removeNullImgPlaceholder = z;
            this.centerIconsVertically = z2;
            this.removeHorizontalPadding = z3;
        }
    }
}
