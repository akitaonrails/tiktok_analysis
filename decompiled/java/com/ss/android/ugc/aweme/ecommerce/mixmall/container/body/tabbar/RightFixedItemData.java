package com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class RightFixedItemData {

    @C09CT("biz_key")
    public String bizKey;

    @C09CT("icon")
    public RightFixedItemIconData icon;

    @C09CT("module_name")
    public String moduleName;

    @C09CT("onboarding")
    public RightFixedItemOnboardingData onboarding;

    @C09CT("schema")
    public String schema;

    public RightFixedItemData() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RightFixedItemData)) {
            return false;
        }
        RightFixedItemData rightFixedItemData = (RightFixedItemData) obj;
        return Intrinsics.LJFF(this.bizKey, rightFixedItemData.bizKey) && Intrinsics.LJFF(this.moduleName, rightFixedItemData.moduleName) && Intrinsics.LJFF(this.schema, rightFixedItemData.schema) && Intrinsics.LJFF(this.icon, rightFixedItemData.icon) && Intrinsics.LJFF(this.onboarding, rightFixedItemData.onboarding);
    }

    public final int hashCode() {
        String str = this.bizKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.moduleName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.schema;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        RightFixedItemIconData rightFixedItemIconData = this.icon;
        int iHashCode4 = (iHashCode3 + (rightFixedItemIconData == null ? 0 : rightFixedItemIconData.hashCode())) * 31;
        RightFixedItemOnboardingData rightFixedItemOnboardingData = this.onboarding;
        return iHashCode4 + (rightFixedItemOnboardingData != null ? rightFixedItemOnboardingData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RightFixedItemData(bizKey=");
        sbLIZ.append(this.bizKey);
        sbLIZ.append(", moduleName=");
        sbLIZ.append(this.moduleName);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", onboarding=");
        sbLIZ.append(this.onboarding);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RightFixedItemData(String str, String str2, String str3, RightFixedItemIconData rightFixedItemIconData, RightFixedItemOnboardingData rightFixedItemOnboardingData) {
        this.bizKey = str;
        this.moduleName = str2;
        this.schema = str3;
        this.icon = rightFixedItemIconData;
        this.onboarding = rightFixedItemOnboardingData;
    }
}
