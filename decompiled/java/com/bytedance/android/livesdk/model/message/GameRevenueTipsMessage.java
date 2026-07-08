package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GameRevenueTipsMessage extends AbstractC1136060ffY {

    @C09CT("action")
    public GameAction action;

    @C09CT("button_text")
    public Text buttonText;

    @C09CT("fillin_text")
    public List<String> fillinText;

    @C09CT("priority")
    public long priority;

    @C09CT("rule_id")
    public long ruleId;

    @C09CT("show_duration_inapp")
    public long showDurationInapp;

    @C09CT("show_duration_outapp")
    public long showDurationOutapp;

    @C09CT("tips_text")
    public Text tipsText;

    @C09CT("title_text")
    public Text titleText;

    public GameRevenueTipsMessage() {
        this.type = C001A.GAME_REVENUE_TIPS_MESSAGE;
        this.fillinText = new ArrayList();
    }
}
