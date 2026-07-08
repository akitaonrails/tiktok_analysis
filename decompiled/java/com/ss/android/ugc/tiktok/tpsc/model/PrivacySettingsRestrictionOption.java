package com.ss.android.ugc.tiktok.tpsc.model;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class PrivacySettingsRestrictionOption implements Serializable {

    @C09CT("disabled_toast")
    public final String disabledToast;

    @C09CT("res_type")
    public final int resType;

    @C09CT("show_type")
    public final int showType;

    @C09CT("value")
    public final int value;

    public PrivacySettingsRestrictionOption() {
        this(0, 0, 0, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacySettingsRestrictionOption)) {
            return false;
        }
        PrivacySettingsRestrictionOption privacySettingsRestrictionOption = (PrivacySettingsRestrictionOption) obj;
        return this.value == privacySettingsRestrictionOption.value && this.showType == privacySettingsRestrictionOption.showType && this.resType == privacySettingsRestrictionOption.resType && Intrinsics.LJFF(this.disabledToast, privacySettingsRestrictionOption.disabledToast);
    }

    public PrivacySettingsRestrictionOption(int i, int i2, int i3, String str) {
        this.value = i;
        this.showType = i2;
        this.resType = i3;
        this.disabledToast = str;
    }
}
