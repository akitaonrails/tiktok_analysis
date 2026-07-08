package com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm;

import X.InterfaceC1364105Vn;
import X.InterfaceC1485505rh;
import X.InterfaceC1501060pAG;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501190pAT;
import X.InterfaceC1501240pAY;
import com.ss.android.ugc.aweme.tako.detail.operator.BatchDetailList;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface TakoNimbleApi {
    @InterfaceC1501240pAY("{path}")
    @InterfaceC1485505rh
    Object loadMore(@InterfaceC1501060pAG(encode = false, value = "path") String str, @InterfaceC1501190pAT(encoded = true) Map<String, String> map, InterfaceC1364105Vn<? super LoadMoreResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/aweme/v1/multi/aweme/detail/")
    Object queryBatchAweme(@InterfaceC1501070pAH("aweme_ids") String str, @InterfaceC1501070pAH("request_source") int i, InterfaceC1364105Vn<? super BatchDetailList> interfaceC1364105Vn);
}
