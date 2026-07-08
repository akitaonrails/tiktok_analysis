package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleComponentBusinessAppearModel implements Serializable {

    @C09CT("animation")
    public final AnoleComponentAnimationModel animationModels;

    @C09CT("business_components")
    public final List<String> businessComponents;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnoleComponentBusinessAppearModel(businessComponents=");
        sbLIZ.append(this.businessComponents);
        sbLIZ.append(", animationModels=");
        sbLIZ.append(this.animationModels);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnoleComponentBusinessAppearModel(List<String> list, AnoleComponentAnimationModel anoleComponentAnimationModel) {
        this.businessComponents = list;
        this.animationModels = anoleComponentAnimationModel;
    }
}
