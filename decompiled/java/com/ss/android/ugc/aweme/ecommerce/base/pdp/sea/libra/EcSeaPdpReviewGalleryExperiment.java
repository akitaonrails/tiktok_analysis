package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.libra;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class EcSeaPdpReviewGalleryExperiment {
    public static final Config LIZ = new Config(0, 0);
    public static final C01GW LIZIZ;
    public static final boolean LIZJ;
    public static final boolean LIZLLL;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(148));
        LIZIZ = c01gwLIZIZ;
        LIZJ = ((Config) c01gwLIZIZ.getValue()).addToCartAndBuyNowEnable == 1;
        LIZLLL = ((Config) c01gwLIZIZ.getValue()).newUIStyleEnable == 1;
    }

    public static final class Config {

        @C09CT("add_to_cart_and_buy_now_enable")
        public final int addToCartAndBuyNowEnable;

        @C09CT("new_ui_style_enable")
        public final int newUIStyleEnable;

        public Config() {
            this(0, 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.addToCartAndBuyNowEnable == config.addToCartAndBuyNowEnable && this.newUIStyleEnable == config.newUIStyleEnable;
        }

        public final int hashCode() {
            return (this.addToCartAndBuyNowEnable * 31) + this.newUIStyleEnable;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Config(addToCartAndBuyNowEnable=");
            sbLIZ.append(this.addToCartAndBuyNowEnable);
            sbLIZ.append(", newUIStyleEnable=");
            sbLIZ.append(this.newUIStyleEnable);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Config(int i, int i2) {
            this.addToCartAndBuyNowEnable = i;
            this.newUIStyleEnable = i2;
        }
    }
}
