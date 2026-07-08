package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.game.model.GuessText;

/* JADX INFO: loaded from: classes.dex */
public final class GameRecommendCreateGuessMessage extends AbstractC1136060ffY {

    @C09CT("bet_duration_in_second")
    public long betDurationInSecond;

    @C09CT("diss_miss_duration")
    public long dissMissDuration;

    @C09CT("expire_time")
    public String expireTime;

    @C09CT("guess_opt1")
    public GuessText guessOpt1;

    @C09CT("guess_opt2")
    public GuessText guessOpt2;

    @C09CT("guess_title")
    public GuessText guessTitle;

    @C09CT("server_timestamp_str")
    public String serverTimestampStr;

    @C09CT("template_id_str")
    public String templateIdStr;

    @C09CT("tips_limit")
    public long tipsLimit;

    @C09CT("tips_type")
    public long tipsType;

    public GameRecommendCreateGuessMessage() {
        this.type = C001A.GAME_RECOMMEND_CREATE_GUESS_MESSAGE;
        this.templateIdStr = "";
        this.serverTimestampStr = "";
        this.expireTime = "";
    }
}
