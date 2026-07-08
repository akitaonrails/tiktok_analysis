package com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class PrivacyDisclosureConfigModel extends PrivacyItemInfoConfigModel {

    @C09CT("label_config")
    public final List<PrivacyLabelConfigModel> labelConfig;

    @C09CT("target_route")
    public final String targetRoute;

    public PrivacyDisclosureConfigModel() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyDisclosureConfigModel)) {
            return false;
        }
        PrivacyDisclosureConfigModel privacyDisclosureConfigModel = (PrivacyDisclosureConfigModel) obj;
        return Intrinsics.LJFF(this.targetRoute, privacyDisclosureConfigModel.targetRoute) && Intrinsics.LJFF(this.labelConfig, privacyDisclosureConfigModel.labelConfig);
    }

    public final int hashCode() {
        String str = this.targetRoute;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<PrivacyLabelConfigModel> list = this.labelConfig;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivacyDisclosureConfigModel(targetRoute=");
        sbLIZ.append(this.targetRoute);
        sbLIZ.append(", labelConfig=");
        sbLIZ.append(this.labelConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PrivacyDisclosureConfigModel(String str, List<PrivacyLabelConfigModel> list) {
        super(null, null, null, null, null);
        this.targetRoute = str;
        this.labelConfig = list;
    }
}
