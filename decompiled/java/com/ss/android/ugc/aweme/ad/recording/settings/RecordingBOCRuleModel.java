package com.ss.android.ugc.aweme.ad.recording.settings;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class RecordingBOCRuleModel {

    @C09CT("black_list")
    public final List<String> blackList;

    @C09CT("jump_url_type")
    public final Integer jumpUrlType;

    @C09CT("reco_times")
    public final Integer recoTimes;

    @C09CT("rule_match_list")
    public final List<RecordingBOCRule> ruleMatchList;

    @C09CT("rule_text_type")
    public final Integer ruleTextType;

    @C09CT("rule_type")
    public final String ruleType;

    public RecordingBOCRuleModel() {
        this("", null, 0, -1, 0, null);
    }

    public RecordingBOCRuleModel(String str, List<RecordingBOCRule> list, Integer num, Integer num2, Integer num3, List<String> list2) {
        this.ruleType = str;
        this.ruleMatchList = list;
        this.ruleTextType = num;
        this.recoTimes = num2;
        this.jumpUrlType = num3;
        this.blackList = list2;
    }
}
