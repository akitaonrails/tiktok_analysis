package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class DisplayCondition implements Serializable {

    @C09CT(alternate = {"each_config"}, value = "eachConfig")
    public final List<EachConfig> eachConfig;

    @C09CT("enable")
    public final Boolean enable;

    @C09CT(alternate = {"logic_type"}, value = "logicType")
    public final Integer logicType;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DisplayCondition(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", logicType=");
        sbLIZ.append(this.logicType);
        sbLIZ.append(", eachConfig=");
        sbLIZ.append(this.eachConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DisplayCondition(Boolean bool, Integer num, List<EachConfig> list) {
        this.enable = bool;
        this.logicType = num;
        this.eachConfig = list;
    }
}
