package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class EcClickSearchResponse {

    @C09CT("log_pb")
    public final LogPbBean logPbBean;

    @C09CT("qrec_virtual_enable")
    public String qrecVirtualEnable;

    @C09CT("sug_word_list")
    public final List<EcClickSearchWord> wordsList;

    public EcClickSearchResponse() {
        this(null, null, null);
    }

    public EcClickSearchResponse(List<EcClickSearchWord> list, LogPbBean logPbBean, String str) {
        this.wordsList = list;
        this.logPbBean = logPbBean;
        this.qrecVirtualEnable = str;
    }
}
