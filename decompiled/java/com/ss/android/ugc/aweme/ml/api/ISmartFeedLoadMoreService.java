package com.ss.android.ugc.aweme.ml.api;

import X.InterfaceC1511020pQK;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;

/* JADX INFO: loaded from: classes24.dex */
public interface ISmartFeedLoadMoreService {
    void addVideoPlayEndReportData(HashMap<String, Object> map, Aweme aweme, Integer num);

    void checkAndInit();

    boolean isSmartFeedLoadMoreScene(String str);

    boolean needCheckLoadMore(int i, int i2, Aweme aweme, Aweme aweme2);

    void startSmartFeedLoadMoreJudge(Aweme aweme, InterfaceC1511020pQK interfaceC1511020pQK);
}
