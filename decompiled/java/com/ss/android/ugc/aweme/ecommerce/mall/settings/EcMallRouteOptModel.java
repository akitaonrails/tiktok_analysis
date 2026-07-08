package com.ss.android.ugc.aweme.ecommerce.mall.settings;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes4.dex */
public final class EcMallRouteOptModel {

    @C09CT("disable_when_main_not_resume")
    public final int disableWhenMainNotResume;

    @C09CT("enable")
    public final int enable;

    public EcMallRouteOptModel() {
        this(0, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcMallRouteOptModel)) {
            return false;
        }
        EcMallRouteOptModel ecMallRouteOptModel = (EcMallRouteOptModel) obj;
        return this.enable == ecMallRouteOptModel.enable && this.disableWhenMainNotResume == ecMallRouteOptModel.disableWhenMainNotResume;
    }

    public final int hashCode() {
        return (this.enable * 31) + this.disableWhenMainNotResume;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcMallRouteOptModel(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", disableWhenMainNotResume=");
        sbLIZ.append(this.disableWhenMainNotResume);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EcMallRouteOptModel(int i, int i2) {
        this.enable = i;
        this.disableWhenMainNotResume = i2;
    }
}
