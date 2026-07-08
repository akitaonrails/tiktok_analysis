package com.ss.android.ugc.aweme.commercialize.live.leadgen.api;

import X.AbstractC19484711Kz;
import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commercialize.live.leadgen.BALeadsGenCountResponse;

/* JADX INFO: loaded from: classes.dex */
public interface BALeadsGenLiveApi {
    @InterfaceC1501170pAR("/aweme/v1/ad/ba/leadsgen/live/clear/")
    AbstractC19484711Kz<BaseResponse> clearLeadsGen();

    @InterfaceC1501160pAQ("/aweme/v1/ad/ba/leadsgen/live/count/")
    C11NZ<BALeadsGenCountResponse> getLeadsGenAddCount(@InterfaceC1501070pAH("room_id") long j);
}
