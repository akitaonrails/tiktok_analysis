package com.ss.android.ugc.aweme.ad.recording.settings;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class RecordingBOCRulesModel {

    @C09CT("enable_effect_type")
    public final Integer enableEffectType;

    @C09CT("rules")
    public final List<RecordingBOCRuleModel> rules;

    public RecordingBOCRulesModel() {
        this(0, null);
    }

    public RecordingBOCRulesModel(Integer num, List<RecordingBOCRuleModel> list) {
        this.enableEffectType = num;
        this.rules = list;
    }
}
