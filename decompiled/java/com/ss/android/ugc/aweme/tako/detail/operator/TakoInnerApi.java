package com.ss.android.ugc.aweme.tako.detail.operator;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;

/* JADX INFO: loaded from: classes5.dex */
public interface TakoInnerApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/tako/innerflow/fetch")
    Object innerFlow(@InterfaceC1501050pAF("tako_out_search_id") String str, @InterfaceC1501050pAF("enter_from_doc_id") String str2, @InterfaceC1501050pAF("inherit_outer_doc_ids") String str3, @InterfaceC1501050pAF("conversation_id") String str4, @InterfaceC1501050pAF("msg_id") String str5, @InterfaceC1501050pAF("cursor") String str6, @InterfaceC1501050pAF("innerflow_consume_info") String str7, InterfaceC1364105Vn<? super BatchDetailList> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/aweme/v1/multi/aweme/detail/")
    Object queryBatchAweme(@InterfaceC1501070pAH("aweme_ids") String str, @InterfaceC1501070pAH("request_source") int i, InterfaceC1364105Vn<? super BatchDetailList> interfaceC1364105Vn);
}
