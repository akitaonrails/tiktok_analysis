package com.ss.android.ugc.aweme.request_combine.model;

import X.C09CT;
import X.C2188811AlT;
import com.google.gson.k;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AwemeSettingCombineModel extends BaseCombineMode {

    @C09CT("body")
    public k awemeSetting;

    public final AwemeSettingCombineModel copy(k kVar) {
        return new AwemeSettingCombineModel(kVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AwemeSettingCombineModel) && Intrinsics.LJFF(this.awemeSetting, ((AwemeSettingCombineModel) obj).awemeSetting);
    }

    public int hashCode() {
        return this.awemeSetting.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AwemeSettingCombineModel(awemeSetting=");
        sbLIZ.append(this.awemeSetting);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final k getAwemeSetting() {
        return this.awemeSetting;
    }

    public AwemeSettingCombineModel(k kVar) {
        this.awemeSetting = kVar;
    }

    public final void setAwemeSetting(k kVar) {
        this.awemeSetting = kVar;
    }
}
