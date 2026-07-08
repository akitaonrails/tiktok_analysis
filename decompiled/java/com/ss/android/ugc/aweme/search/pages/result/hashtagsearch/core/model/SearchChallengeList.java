package com.ss.android.ugc.aweme.search.pages.result.hashtagsearch.core.model;

import X.C09CT;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchChallenge;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class SearchChallengeList extends SearchApiResult {

    @C09CT("challenge_list")
    public List<SearchChallenge> challengeList;

    @C09CT(alternate = {"min_cursor"}, value = "cursor")
    public int cursor;

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("is_match")
    public boolean isMatch;
}
