package com.ss.android.ugc.tiktok.pns.activitycenter.searchhistory;

import X.C0CQM;
import X.C11NZ;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface PnSSearchHistoryApi {
    public static final C0CQM LIZ = C0CQM.LIZ;

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/search/history/delete/keywords/v1")
    C11NZ<BaseResponse> deleteSearchItem(@InterfaceC1501050pAF("deleted_keywords") String str);
}
