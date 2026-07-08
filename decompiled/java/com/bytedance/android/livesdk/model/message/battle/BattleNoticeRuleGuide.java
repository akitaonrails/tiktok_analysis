package com.bytedance.android.livesdk.model.message.battle;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public class BattleNoticeRuleGuide {

    @C09CT("button_content")
    public BattleNoticeText buttonContent;

    @C09CT("button_content_text")
    public Text buttonContentText;

    @C09CT("content")
    public BattleNoticeText content;

    @C09CT("content_text")
    public Text contentText;

    @C09CT("except_anchor")
    public boolean exceptAnchor;

    @C09CT("rule_detail_url")
    public String ruleUrl;
}
