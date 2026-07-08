package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GameGuessToastMessage extends AbstractC1136060ffY {

    @C09CT("diss_miss_seconds")
    public long dissMissSeconds;

    @C09CT("option_id_str")
    public String optionIdStr;

    @C09CT("result_starling_key")
    public String resultStarlingKey;

    @C09CT("round_id_str")
    public String roundIdStr;

    @C09CT("show_option_idx_str")
    public String showOptionIdxStr;

    @C09CT("show_rank_str")
    public String showRankStr;

    @C09CT("show_type")
    public boolean showType;

    @C09CT("title_starling_key")
    public String titleStarlingKey;

    public GameGuessToastMessage() {
        this.type = C001A.GAME_GUESS_TOAST_MESSAGE;
        this.roundIdStr = "";
        this.showOptionIdxStr = "";
        this.titleStarlingKey = "";
        this.resultStarlingKey = "";
        this.showRankStr = "";
        this.optionIdStr = "";
    }
}
