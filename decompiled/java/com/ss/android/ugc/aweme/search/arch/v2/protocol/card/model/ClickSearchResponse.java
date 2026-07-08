package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class ClickSearchResponse {

    @C09CT("log_pb")
    public final LogPbBean logPbBean;

    @C09CT("qrec_virtual_enable")
    public String qrecVirtualEnable;

    @C09CT("sug_word_list")
    public final List<ClickSearchWord> wordsList;

    public ClickSearchResponse() {
        this(null, null, null);
    }

    public ClickSearchResponse(List<ClickSearchWord> list, LogPbBean logPbBean, String str) {
        this.wordsList = list;
        this.logPbBean = logPbBean;
        this.qrecVirtualEnable = str;
    }
}
