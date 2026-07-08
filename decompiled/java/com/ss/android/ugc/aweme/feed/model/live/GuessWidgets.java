package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GuessWidgets implements Serializable {

    @C09CT("guess_widgets")
    public List<GuessWidget> guessWidgets = new ArrayList();

    @C09CT("user_rank")
    public List<GuessRankUserInfo> userRank = new ArrayList();
}
