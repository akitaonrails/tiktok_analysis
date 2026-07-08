package com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class PrivacyRadioGroupConfigModel extends PrivacyItemInfoConfigModel {

    @C09CT("options")
    public final List<PrivacyRadioOptionConfigModel> options;

    public PrivacyRadioGroupConfigModel() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrivacyRadioGroupConfigModel) && Intrinsics.LJFF(this.options, ((PrivacyRadioGroupConfigModel) obj).options);
    }

    public final int hashCode() {
        List<PrivacyRadioOptionConfigModel> list = this.options;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivacyRadioGroupConfigModel(options=");
        sbLIZ.append(this.options);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PrivacyRadioGroupConfigModel(List<PrivacyRadioOptionConfigModel> list) {
        super(null, null, null, null, null);
        this.options = list;
    }
}
