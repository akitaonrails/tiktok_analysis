package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorOneStepCheckoutConfig implements Serializable {

    @C09CT("bill_scene_type")
    public final Integer billSceneType;

    public AnchorOneStepCheckoutConfig() {
        this(0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnchorOneStepCheckoutConfig) && Intrinsics.LJFF(this.billSceneType, ((AnchorOneStepCheckoutConfig) obj).billSceneType);
    }

    public int hashCode() {
        Integer num = this.billSceneType;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnchorOneStepCheckoutConfig(billSceneType=");
        sbLIZ.append(this.billSceneType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnchorOneStepCheckoutConfig(Integer num) {
        this.billSceneType = num;
    }
}
