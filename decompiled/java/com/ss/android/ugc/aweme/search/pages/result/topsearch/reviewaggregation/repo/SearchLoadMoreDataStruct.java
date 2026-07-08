package com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo;

import X.C09CT;
import com.ss.android.ugc.aweme.search.pages.result.nimble.model.fusioncard.Top1SummaryCard;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.Top1MultiSummary;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchLoadMoreDataStruct {

    @C09CT("image_load_more_data")
    public final ImageLoadMoreData imageLoadMoreData;

    @C09CT("inspire_advice_load_more_data")
    public final InspireAdviceMoreData inspireAdviceMoreData;

    @C09CT("mini_game_load_more_data")
    public final MiniGameLoadMoreData miniGameLoadMoreData;

    @C09CT("top1_multi_summary")
    public final Top1MultiSummary top1MultiSummary;

    @C09CT("summary_card")
    public final Top1SummaryCard top1SummaryCard;

    public SearchLoadMoreDataStruct(Top1MultiSummary top1MultiSummary, Top1SummaryCard top1SummaryCard, InspireAdviceMoreData inspireAdviceMoreData, MiniGameLoadMoreData miniGameLoadMoreData, ImageLoadMoreData imageLoadMoreData) {
        this.top1MultiSummary = top1MultiSummary;
        this.top1SummaryCard = top1SummaryCard;
        this.inspireAdviceMoreData = inspireAdviceMoreData;
        this.miniGameLoadMoreData = miniGameLoadMoreData;
        this.imageLoadMoreData = imageLoadMoreData;
    }
}
