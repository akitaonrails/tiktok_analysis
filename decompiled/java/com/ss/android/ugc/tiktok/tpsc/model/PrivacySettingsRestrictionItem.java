package com.ss.android.ugc.tiktok.tpsc.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class PrivacySettingsRestrictionItem implements Serializable {

    @C09CT("default_value")
    public final int defaultValue;

    @C09CT("disabled_toast")
    public final String disabledToast;

    @C09CT("res_type")
    public final int resType;

    @C09CT("show_type")
    public final int showType;

    @C09CT("tips_type")
    public final int tipsType;

    @C09CT("values")
    public final List<PrivacySettingsRestrictionOption> values;

    public PrivacySettingsRestrictionItem() {
        this(0, 0, null, 0, -1, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacySettingsRestrictionItem)) {
            return false;
        }
        PrivacySettingsRestrictionItem privacySettingsRestrictionItem = (PrivacySettingsRestrictionItem) obj;
        return this.showType == privacySettingsRestrictionItem.showType && this.resType == privacySettingsRestrictionItem.resType && Intrinsics.LJFF(this.values, privacySettingsRestrictionItem.values) && this.tipsType == privacySettingsRestrictionItem.tipsType && this.defaultValue == privacySettingsRestrictionItem.defaultValue && Intrinsics.LJFF(this.disabledToast, privacySettingsRestrictionItem.disabledToast);
    }

    public PrivacySettingsRestrictionItem(int i, int i2, List<PrivacySettingsRestrictionOption> list, int i3, int i4, String str) {
        this.showType = i;
        this.resType = i2;
        this.values = list;
        this.tipsType = i3;
        this.defaultValue = i4;
        this.disabledToast = str;
    }
}
