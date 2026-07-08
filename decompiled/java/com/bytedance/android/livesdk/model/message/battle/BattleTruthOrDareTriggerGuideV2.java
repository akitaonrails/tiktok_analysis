package com.bytedance.android.livesdk.model.message.battle;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class BattleTruthOrDareTriggerGuideV2 {

    @C09CT("guide_duration_second")
    public int guideDurationSecond;

    @C09CT("is_first_time")
    public boolean isFirstTime;

    @C09CT("lap_guide_duration_second")
    public int lapGuideDurationSecond;

    @C09CT("tip_duration_second")
    public int tipDurationSecond;

    @C09CT("tips")
    public List<TruthOrDareTip> tips;

    @C09CT("anchor_content_key")
    public String anchorContentKey = "";

    @C09CT("audience_content_key")
    public String audienceContentKey = "";

    @C09CT("rule_detail_url")
    public String ruleDetailUrl = "";

    @C09CT("lap_guide_key")
    public String lapGuideKey = "";

    public static final class TruthOrDareTip {

        @C09CT("tip_type_key")
        public String tipTypeKey = "";

        @C09CT("tip_content_key")
        public String tipContentKey = "";
    }
}
