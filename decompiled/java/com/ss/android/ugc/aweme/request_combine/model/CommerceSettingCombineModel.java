package com.ss.android.ugc.aweme.request_combine.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.commercialize.model.CommerceSettings;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CommerceSettingCombineModel extends BaseCombineMode {

    @C09CT("body")
    public CommerceSettings combineModel;

    public final CommerceSettingCombineModel copy(CommerceSettings commerceSettings) {
        return new CommerceSettingCombineModel(commerceSettings);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommerceSettingCombineModel) && Intrinsics.LJFF(this.combineModel, ((CommerceSettingCombineModel) obj).combineModel);
    }

    public int hashCode() {
        return this.combineModel.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommerceSettingCombineModel(combineModel=");
        sbLIZ.append(this.combineModel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final CommerceSettings getCombineModel() {
        return this.combineModel;
    }

    public CommerceSettingCombineModel(CommerceSettings commerceSettings) {
        this.combineModel = commerceSettings;
    }

    public final void setCombineModel(CommerceSettings commerceSettings) {
        this.combineModel = commerceSettings;
    }
}
