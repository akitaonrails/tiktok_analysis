package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorBuyButton implements Serializable {

    @C09CT("default_desc")
    public final String defaultDesc;

    @C09CT("desc")
    public final String desc;

    @C09CT("checkout_config")
    public final AnchorOneStepCheckoutConfig oneStepCheckoutConfig;

    public AnchorBuyButton() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchorBuyButton)) {
            return false;
        }
        AnchorBuyButton anchorBuyButton = (AnchorBuyButton) obj;
        return Intrinsics.LJFF(this.desc, anchorBuyButton.desc) && Intrinsics.LJFF(this.defaultDesc, anchorBuyButton.defaultDesc) && Intrinsics.LJFF(this.oneStepCheckoutConfig, anchorBuyButton.oneStepCheckoutConfig);
    }

    public int hashCode() {
        String str = this.desc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.defaultDesc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AnchorOneStepCheckoutConfig anchorOneStepCheckoutConfig = this.oneStepCheckoutConfig;
        return iHashCode2 + (anchorOneStepCheckoutConfig != null ? anchorOneStepCheckoutConfig.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnchorBuyButton(desc=");
        sbLIZ.append(this.desc);
        sbLIZ.append(", defaultDesc=");
        sbLIZ.append(this.defaultDesc);
        sbLIZ.append(", oneStepCheckoutConfig=");
        sbLIZ.append(this.oneStepCheckoutConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnchorBuyButton(String str, String str2, AnchorOneStepCheckoutConfig anchorOneStepCheckoutConfig) {
        this.desc = str;
        this.defaultDesc = str2;
        this.oneStepCheckoutConfig = anchorOneStepCheckoutConfig;
    }
}
