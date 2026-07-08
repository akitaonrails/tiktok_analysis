package com.ss.android.ugc.aweme.ml.infra;

import X.C09CT;
import X.C2188811AlT;
import com.ss.ugc.clientai.core.api.meta.FeatureGroup;
import com.ss.ugc.clientai.core.api.meta.FlattenConfig;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class TTMFeatureConfig {

    @C09CT("enable")
    public boolean enable;

    @C09CT("flatten_config")
    public final FlattenConfig flattenConfig;

    @C09CT("groups")
    public final List<FeatureGroup> groups;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTMFeatureConfig{=");
        sbLIZ.append(super.toString());
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final FlattenConfig getFlattenConfig() {
        return this.flattenConfig;
    }

    public final List<FeatureGroup> getGroups() {
        return this.groups;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }
}
