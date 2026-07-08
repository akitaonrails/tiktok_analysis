package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public class RelatedAweme {

    @C09CT("awemes")
    public List<Aweme> awemeList;

    @C09CT("has_more")
    public int hasMore;

    @C09CT("aweme_id")
    public String relatedAid;

    public List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public String getRelatedAid() {
        return this.relatedAid;
    }

    public void setAwemeList(List<Aweme> list) {
        this.awemeList = list;
    }

    public void setHasMore(int i) {
        this.hasMore = i;
    }

    public void setRelatedAid(String str) {
        this.relatedAid = str;
    }
}
