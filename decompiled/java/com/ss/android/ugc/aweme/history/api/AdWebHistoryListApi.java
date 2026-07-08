package com.ss.android.ugc.aweme.history.api;

import X.C313240CPq;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.history.model.AdWebHistoryDeleteRequest;
import com.ss.android.ugc.aweme.history.model.AdWebHistoryDeleteResponse;
import com.ss.android.ugc.aweme.history.model.AdWebHistoryListCommonResponse;
import com.ss.android.ugc.aweme.history.model.AdWebHistorySaveRequest;

/* JADX INFO: loaded from: classes17.dex */
public interface AdWebHistoryListApi {
    public static final C313240CPq LIZ = C313240CPq.LIZ;

    @InterfaceC1501170pAR("/aweme/v1/ad/iab/history/delete/")
    Object deleteHistoryList(@InterfaceC1485405rg AdWebHistoryDeleteRequest adWebHistoryDeleteRequest, InterfaceC1364105Vn<? super AdWebHistoryDeleteResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/aweme/v1/ad/iab/history/query/")
    Object queryHistoryList(@InterfaceC1501070pAH("cursor") Long l, @InterfaceC1501070pAH("count") Long l2, InterfaceC1364105Vn<? super AdWebHistoryListCommonResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/aweme/v1/ad/iab/history/save/")
    Object saveHistoryList(@InterfaceC1485405rg AdWebHistorySaveRequest adWebHistorySaveRequest, InterfaceC1364105Vn<? super AdWebHistoryListCommonResponse> interfaceC1364105Vn);
}
