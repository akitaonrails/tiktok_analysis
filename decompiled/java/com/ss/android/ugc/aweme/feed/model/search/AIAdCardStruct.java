package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class AIAdCardStruct implements Serializable {

    @C09CT("aweme_list")
    public List<? extends Aweme> awemeList;

    @C09CT("footer")
    public final AIAdCardFooter footer;

    @C09CT("header")
    public final AIAdCardHeader header;

    @C09CT("section_list")
    public final List<AIAdCardSection> sectionList;

    public AIAdCardStruct() {
        this(null, null, null, null);
    }

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final AIAdCardFooter getFooter() {
        return this.footer;
    }

    public final AIAdCardHeader getHeader() {
        return this.header;
    }

    public final List<AIAdCardSection> getSectionList() {
        return this.sectionList;
    }

    public final void setAwemeList(List<? extends Aweme> list) {
        this.awemeList = list;
    }

    public AIAdCardStruct(AIAdCardHeader aIAdCardHeader, AIAdCardFooter aIAdCardFooter, List<AIAdCardSection> list, List<? extends Aweme> list2) {
        this.header = aIAdCardHeader;
        this.footer = aIAdCardFooter;
        this.sectionList = list;
        this.awemeList = list2;
    }
}
