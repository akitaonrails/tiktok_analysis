package com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class PrivacySwitchConfigModel extends PrivacyItemInfoConfigModel {

    @C09CT("checked_value")
    public final Integer checkedValue;

    @C09CT("unchecked_value")
    public final Integer unCheckedValue;

    public PrivacySwitchConfigModel() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacySwitchConfigModel)) {
            return false;
        }
        PrivacySwitchConfigModel privacySwitchConfigModel = (PrivacySwitchConfigModel) obj;
        return Intrinsics.LJFF(this.checkedValue, privacySwitchConfigModel.checkedValue) && Intrinsics.LJFF(this.unCheckedValue, privacySwitchConfigModel.unCheckedValue);
    }

    public final int hashCode() {
        Integer num = this.checkedValue;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.unCheckedValue;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivacySwitchConfigModel(checkedValue=");
        sbLIZ.append(this.checkedValue);
        sbLIZ.append(", unCheckedValue=");
        sbLIZ.append(this.unCheckedValue);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PrivacySwitchConfigModel(Integer num, Integer num2) {
        super(null, null, null, null, null);
        this.checkedValue = num;
        this.unCheckedValue = num2;
    }
}
