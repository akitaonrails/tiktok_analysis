package com.ss.android.ugc.aweme.search.pages.reinforceinterest.repo;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class InterestWordResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("recall_type")
    public final String recallType;

    @C09CT("suggest_reasons")
    public final List<SuggestReason> suggestReasons;

    @C09CT("word")
    public final String word;

    public InterestWordResponse() {
        this("", "", null, "");
    }

    public InterestWordResponse(String str, String str2, List<SuggestReason> list, String str3) {
        this.word = str;
        this.id = str2;
        this.suggestReasons = list;
        this.recallType = str3;
    }
}
