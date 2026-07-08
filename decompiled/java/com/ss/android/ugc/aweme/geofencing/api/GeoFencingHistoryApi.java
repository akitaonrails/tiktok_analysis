package com.ss.android.ugc.aweme.geofencing.api;

import X.AbstractC19484711Kz;
import X.C010E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.geofencing.data.HistoryListResponse;
import com.ss.android.ugc.aweme.geofencing.data.HistoryUpdateRequest;
import com.ss.android.ugc.aweme.geofencing.data.HistoryUpdateResponse;

/* JADX INFO: loaded from: classes.dex */
public interface GeoFencingHistoryApi {
    public static final C010E LIZ = C010E.LIZ;

    @InterfaceC1501170pAR("/tiktok/v1/creator/geofencing/history/list/")
    AbstractC19484711Kz<HistoryListResponse> listHistory();

    @InterfaceC1501170pAR("/tiktok/v1/creator/geofencing/history/update/")
    AbstractC19484711Kz<HistoryUpdateResponse> updateHistory(@InterfaceC1485405rg HistoryUpdateRequest historyUpdateRequest);
}
