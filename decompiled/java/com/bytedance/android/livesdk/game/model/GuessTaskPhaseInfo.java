package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class GuessTaskPhaseInfo {

    @C09CT("task_status")
    public int taskStatus;

    @C09CT("task_subtitle")
    public Text taskSubtitle;

    @C09CT("task_id")
    public String taskId = "";

    @C09CT("subtitle_starling_key")
    public String subtitleStarlingKey = "";

    @C09CT("emote_url")
    public String emoteUrl = "";

    @C09CT("target_score_str")
    public String targetScoreStr = "";
}
