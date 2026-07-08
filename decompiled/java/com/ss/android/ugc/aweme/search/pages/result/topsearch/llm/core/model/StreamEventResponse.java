package com.ss.android.ugc.aweme.search.pages.result.topsearch.llm.core.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixCardActionBar;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.RelatedWord;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class StreamEventResponse {

    @C09CT("action_bar")
    public final SearchMixCardActionBar actionBar;

    @C09CT("chunk_index")
    public final Integer chunkIndex;

    @C09CT("event")
    public final Integer event;

    @C09CT("content_patch")
    public final ContentPatch patch;

    @C09CT("related_words")
    public final List<RelatedWord> relatedWords;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("stream_time")
    public final Long streamTime;

    @C09CT("top1_multi_summary_patch")
    public final Top1MultiSummaryPatch top1MultiSummaryPatch;

    public StreamEventResponse() {
        this(null, null, null, null, null, null, null, null);
    }

    public StreamEventResponse(Integer num, Integer num2, Integer num3, ContentPatch contentPatch, Long l, SearchMixCardActionBar searchMixCardActionBar, List<RelatedWord> list, Top1MultiSummaryPatch top1MultiSummaryPatch) {
        this.statusCode = num;
        this.event = num2;
        this.chunkIndex = num3;
        this.patch = contentPatch;
        this.streamTime = l;
        this.actionBar = searchMixCardActionBar;
        this.relatedWords = list;
        this.top1MultiSummaryPatch = top1MultiSummaryPatch;
    }
}
