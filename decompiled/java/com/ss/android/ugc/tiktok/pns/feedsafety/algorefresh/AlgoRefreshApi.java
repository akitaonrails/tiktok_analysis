package com.ss.android.ugc.tiktok.pns.feedsafety.algorefresh;

import X.C0X9S;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC1501310pAf;

/* JADX INFO: loaded from: classes3.dex */
public interface AlgoRefreshApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("tiktok/v1/refresh/")
    @InterfaceC1501310pAf({"Content-Type: application/x-www-form-urlencoded"})
    C0X9S<AlgoRefreshResponse> stopAlgoRefresh(@InterfaceC1501050pAF("cancel") Integer num);
}
