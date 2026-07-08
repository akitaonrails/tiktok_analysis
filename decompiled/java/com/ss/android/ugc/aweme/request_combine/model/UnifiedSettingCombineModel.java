package com.ss.android.ugc.aweme.request_combine.model;

import X.C09CT;
import X.C2188811AlT;
import com.google.gson.k;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class UnifiedSettingCombineModel extends BaseCombineMode {

    @C09CT("body")
    public k setting;

    public final UnifiedSettingCombineModel copy(k kVar) {
        return new UnifiedSettingCombineModel(kVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UnifiedSettingCombineModel) && Intrinsics.LJFF(this.setting, ((UnifiedSettingCombineModel) obj).setting);
    }

    public int hashCode() {
        return this.setting.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UnifiedSettingCombineModel(setting=");
        sbLIZ.append(this.setting);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final k getSetting() {
        return this.setting;
    }

    public UnifiedSettingCombineModel(k kVar) {
        this.setting = kVar;
    }

    public final void setSetting(k kVar) {
        this.setting = kVar;
    }
}
