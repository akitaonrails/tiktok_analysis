package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FeelgoodShowConfig implements Serializable {

    @C09CT(alternate = {"page_config"}, value = "pageConfig")
    public final List<FeelgoodPageConfig> pageConfig;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeelgoodShowConfig(pageConfig=");
        sbLIZ.append(this.pageConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FeelgoodShowConfig(List<FeelgoodPageConfig> list) {
        this.pageConfig = list;
    }
}
