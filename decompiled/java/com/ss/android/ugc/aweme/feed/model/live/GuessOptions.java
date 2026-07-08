package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class GuessOptions implements Serializable {

    @C09CT("guess_option_stats")
    public GuessOptionStats guessOptionStats;

    @C09CT("option_id_str")
    public String optionIdStr = "";

    @C09CT("serial_num")
    public long serialNum;

    @C09CT("text")
    public GuessText text;
}
