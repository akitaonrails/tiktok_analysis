package com.ss.android.ugc.aweme.ad.recording.settings;

import X.C09CT;
import X.C13LQ;
import java.io.Serializable;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class AdLandPagePreClickRuleModel implements Serializable {
    public static final int $stable = 8;

    @C09CT("rule_id")
    public final String ruleId;

    @C09CT("rules")
    public final Set<String> rules;

    public AdLandPagePreClickRuleModel() {
        this(null, null, 3, null);
    }

    public final String getRuleId() {
        return this.ruleId;
    }

    public final Set<String> getRules() {
        return this.rules;
    }

    public AdLandPagePreClickRuleModel(String str, Set<String> set) {
        this.ruleId = str;
        this.rules = set;
    }

    public AdLandPagePreClickRuleModel(String str, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "001" : str, (i & 2) != 0 ? C13LQ.LJLIIL(new String[]{"click_source+draw_ad+photo", "follow+draw_ad", "follow+homepage_ad", "message_click+homepage_ad+button", "like+draw_ad", "otherclick+draw_ad+comment_sign", "comment+draw_ad", "close+comment_ad", "otherclick+draw_ad+share_sign", "share+draw_ad", "click_source+draw_ad+name", "otherclick+draw_ad+sponsored", "slide+draw_ad", "click_button+draw_ad", "play_6s+draw_ad", "play_15s+draw_ad", "copy+landing_ad", "open_url_h5+landing_ad"}) : set);
    }
}
