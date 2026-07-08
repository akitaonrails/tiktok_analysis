package com.ss.android.ugc.aweme.search.model;

import X.C0C8S;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class VisualSearchEnterModel implements Serializable {
    public final ApiRequestParams apiRequestModel;
    public final VisualSearchContextModel contextModel;
    public final List<ECProductEntityModel> ecProductEntityModel;
    public final C0C8S entrySource;
    public final VisualSearchFeedAwemeModel feedAwemeModel;
    public final VisualSearchFeedVideoViewModel feedVideoViewModel;
    public final VisualHistorySearchEnterModel historyEnterModel;
    public final VisualSearchResultPageModel resultPageSettings;
    public final SmartSearchEnterModel smartSearchEnterModel;
    public final VisualSearchTagModel tagModel;
    public final VisualSearchVideoPlayModel videoPlayModel;

    public final VisualSearchEnterModel copy(C0C8S c0c8s, ApiRequestParams apiRequestParams, VisualSearchContextModel visualSearchContextModel, VisualSearchResultPageModel visualSearchResultPageModel, VisualSearchTagModel visualSearchTagModel, VisualSearchFeedAwemeModel visualSearchFeedAwemeModel, VisualSearchVideoPlayModel visualSearchVideoPlayModel, VisualSearchFeedVideoViewModel visualSearchFeedVideoViewModel, SmartSearchEnterModel smartSearchEnterModel, VisualHistorySearchEnterModel visualHistorySearchEnterModel, List<ECProductEntityModel> list) {
        return new VisualSearchEnterModel(c0c8s, apiRequestParams, visualSearchContextModel, visualSearchResultPageModel, visualSearchTagModel, visualSearchFeedAwemeModel, visualSearchVideoPlayModel, visualSearchFeedVideoViewModel, smartSearchEnterModel, visualHistorySearchEnterModel, list);
    }

    public VisualSearchEnterModel(C0C8S c0c8s, ApiRequestParams apiRequestParams, VisualSearchContextModel visualSearchContextModel, VisualSearchResultPageModel visualSearchResultPageModel, VisualSearchTagModel visualSearchTagModel, VisualSearchFeedAwemeModel visualSearchFeedAwemeModel, VisualSearchVideoPlayModel visualSearchVideoPlayModel, VisualSearchFeedVideoViewModel visualSearchFeedVideoViewModel, SmartSearchEnterModel smartSearchEnterModel, VisualHistorySearchEnterModel visualHistorySearchEnterModel, List<ECProductEntityModel> list) {
        this.entrySource = c0c8s;
        this.apiRequestModel = apiRequestParams;
        this.contextModel = visualSearchContextModel;
        this.resultPageSettings = visualSearchResultPageModel;
        this.tagModel = visualSearchTagModel;
        this.feedAwemeModel = visualSearchFeedAwemeModel;
        this.videoPlayModel = visualSearchVideoPlayModel;
        this.feedVideoViewModel = visualSearchFeedVideoViewModel;
        this.smartSearchEnterModel = smartSearchEnterModel;
        this.historyEnterModel = visualHistorySearchEnterModel;
        this.ecProductEntityModel = list;
    }
}
