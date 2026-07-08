package com.bytedance.android.livesdk.model.message.battle;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class BattleTruthOrDareTriggerGuide {

    @C09CT("anchor_content_key")
    public String anchorContentKey;

    @C09CT("audience_content_key")
    public String audienceContentKey;

    @C09CT("guide_duration_second")
    public int guideDurationSecond;

    @C09CT("rule_detail_url")
    public String ruleDetailUrl;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BattleTruthOrDareTriggerGuide(anchorContentKey=");
        sbLIZ.append(this.anchorContentKey);
        sbLIZ.append(", audienceContentKey=");
        sbLIZ.append(this.audienceContentKey);
        sbLIZ.append(", guideDurationSecond=");
        sbLIZ.append(this.guideDurationSecond);
        sbLIZ.append(", ruleDetailUrl=");
        sbLIZ.append(this.ruleDetailUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
