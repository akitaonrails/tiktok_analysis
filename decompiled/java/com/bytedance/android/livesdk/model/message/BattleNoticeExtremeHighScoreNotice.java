package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class BattleNoticeExtremeHighScoreNotice {

    @C09CT("battle_id")
    public long battleId;

    @C09CT("display_text_origin_viewers")
    public Text displayTextOriginViewers;

    @C09CT("display_text_unrelated_viewers")
    public Text displayTextUnrelatedViewers;

    @C09CT("extreme_high_score_threshold")
    public long extremeHighScoreThreshold;
}
