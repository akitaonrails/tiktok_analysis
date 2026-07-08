package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class GameAiScriptMessage extends AbstractC1136060ffY {

    @C09CT("action")
    public GameAiScriptAction action;

    @C09CT("ai_content")
    public String aiContent;

    @C09CT("biz_id")
    public String bizId;

    @C09CT("button_text")
    public Text buttonText;

    @C09CT("cue_message")
    public CuesMessage cueMessage;

    @C09CT("is_show_cues")
    public boolean isShowCues;

    @C09CT("priority")
    public long priority;

    @C09CT("rule_id")
    public long ruleId;

    @C09CT("show_duration_inapp")
    public long showDurationInapp;

    @C09CT("show_duration_outapp")
    public long showDurationOutapp;

    @C09CT("title_text")
    public Text titleText;

    public GameAiScriptMessage() {
        this.type = C001A.GAME_AI_SCRIPT_MESSAGE;
        this.aiContent = "";
        this.bizId = "";
    }
}
