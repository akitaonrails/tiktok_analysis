package com.ss.android.ugc.aweme.outreach.dispersion.data;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class RuleModel {

    @C09CT("limit")
    public final Integer limit;

    @C09CT("outreach_types")
    public final List<String> outreachTypes;

    @C09CT("rule_groups")
    public final List<String> ruleGroups;

    @C09CT("rule_id")
    public final String ruleId;

    @C09CT(com.bytedance.scene.Scene.SCENE_SERVICE)
    public final Scene scene;

    @C09CT("time_window")
    public final TimeWindow timeWindow;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RuleModel(ruleId=");
        sbLIZ.append(this.ruleId);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", timeWindow=");
        sbLIZ.append(this.timeWindow);
        sbLIZ.append(", outreachTypes=");
        sbLIZ.append(this.outreachTypes);
        sbLIZ.append(", ruleGroups=");
        sbLIZ.append(this.ruleGroups);
        sbLIZ.append(", limit=");
        sbLIZ.append(this.limit);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RuleModel(String str, Scene scene, TimeWindow timeWindow, List<String> list, List<String> list2, Integer num) {
        this.ruleId = str;
        this.scene = scene;
        this.timeWindow = timeWindow;
        this.outreachTypes = list;
        this.ruleGroups = list2;
        this.limit = num;
    }
}
