package com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.service;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest;
import com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertData;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface IFeedEcCardService {
    List<CardTypeRequest> LIZ(FeedCardInsertData feedCardInsertData, List<CardInsertResultInfo> list, Object obj);

    List<Object> LIZIZ();

    void LIZJ(int i, List list);

    void LIZLLL(Aweme aweme, Integer num, Integer num2, boolean z);
}
