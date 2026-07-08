package com.ss.android.ugc.profile.business.ur.school.datasource;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class RelatedAwemeResponseInfo {

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("awemes")
    public final List<Aweme> awemeList;

    @C09CT("has_more")
    public final Integer hasMore;

    public RelatedAwemeResponseInfo() {
        this(null, null, null);
    }

    public RelatedAwemeResponseInfo(List<Aweme> list, String str, Integer num) {
        this.awemeList = list;
        this.awemeId = str;
        this.hasMore = num;
    }
}
