package com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar;

import X.C09CT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class BTMModel {

    @C09CT("bcm")
    public Map<String, ?> bcm;

    @C09CT("btm")
    public String btm;

    @C09CT("btm_unit_params")
    public Map<String, ?> btmUnitParams;

    public BTMModel() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BTMModel)) {
            return false;
        }
        BTMModel bTMModel = (BTMModel) obj;
        return Intrinsics.LJFF(this.btm, bTMModel.btm) && Intrinsics.LJFF(this.bcm, bTMModel.bcm) && Intrinsics.LJFF(this.btmUnitParams, bTMModel.btmUnitParams);
    }

    public BTMModel(String str, Map<String, ?> map, Map<String, ?> map2) {
        this.btm = str;
        this.bcm = map;
        this.btmUnitParams = map2;
    }
}
