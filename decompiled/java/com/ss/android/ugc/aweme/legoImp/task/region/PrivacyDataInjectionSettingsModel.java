package com.ss.android.ugc.aweme.legoImp.task.region;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PrivacyDataInjectionSettingsModel {

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("rules")
    public final List<PrivacyDataInjectionRuleSettingsModel> rules;

    public PrivacyDataInjectionSettingsModel() {
        this(false, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyDataInjectionSettingsModel)) {
            return false;
        }
        PrivacyDataInjectionSettingsModel privacyDataInjectionSettingsModel = (PrivacyDataInjectionSettingsModel) obj;
        return this.enabled == privacyDataInjectionSettingsModel.enabled && Intrinsics.LJFF(this.rules, privacyDataInjectionSettingsModel.rules);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.enabled) * 31) + this.rules.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivacyDataInjectionSettingsModel(enabled=");
        sbLIZ.append(this.enabled);
        sbLIZ.append(", rules=");
        sbLIZ.append(this.rules);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PrivacyDataInjectionSettingsModel(boolean z, List<PrivacyDataInjectionRuleSettingsModel> list) {
        this.enabled = z;
        this.rules = list;
    }

    public PrivacyDataInjectionSettingsModel(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
