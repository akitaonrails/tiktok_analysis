package com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class TrendingWord implements Serializable {
    public static final int $stable = 0;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("word")
    public final String word;

    public TrendingWord() {
        this(null, null);
    }

    public TrendingWord(String str, String str2) {
        this.word = str;
        this.id = str2;
    }
}
