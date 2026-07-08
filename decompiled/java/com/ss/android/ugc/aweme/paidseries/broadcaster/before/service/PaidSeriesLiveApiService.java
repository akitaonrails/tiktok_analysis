package com.ss.android.ugc.aweme.paidseries.broadcaster.before.service;

import X.AbstractC19484711Kz;
import X.C01GW;
import X.C04TD;
import X.C452501pT;
import com.ss.android.ugc.aweme.api.IPaidSeriesLiveApiService;
import com.ss.android.ugc.aweme.api.PaidSeriesLiveApi;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.model.PaidSeriesLiveNumResponse;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PaidSeriesLiveApiService implements IPaidSeriesLiveApiService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(229));

    public static IPaidSeriesLiveApiService LIZJ() {
        Object objLIZ = C04TD.LIZ(IPaidSeriesLiveApiService.class, false);
        if (objLIZ != null) {
            return (IPaidSeriesLiveApiService) objLIZ;
        }
        if (C04TD.Z2 == null) {
            synchronized (IPaidSeriesLiveApiService.class) {
                if (C04TD.Z2 == null) {
                    C04TD.Z2 = new PaidSeriesLiveApiService();
                }
            }
        }
        return C04TD.Z2;
    }

    public final PaidSeriesLiveApi LIZLLL() {
        return (PaidSeriesLiveApi) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.api.IPaidSeriesLiveApiService
    public final AbstractC19484711Kz<BaseResponse> LIZ(long j) {
        return LIZLLL().deleteSeries(0L, j, 1);
    }

    @Override // com.ss.android.ugc.aweme.api.IPaidSeriesLiveApiService
    public final AbstractC19484711Kz<PaidSeriesLiveNumResponse> getSeriesNum(long j) {
        return LIZLLL().getSeriesNum(j);
    }

    @Override // com.ss.android.ugc.aweme.api.IPaidSeriesLiveApiService
    public final AbstractC19484711Kz LIZIZ(long j, long j2) {
        return LIZLLL().removeSeriesFromLive(j, j2, 0);
    }

    @Override // com.ss.android.ugc.aweme.api.IPaidSeriesLiveApiService
    public final AbstractC19484711Kz<BaseResponse> addSeriesToLive(long j, long j2) {
        return LIZLLL().addSeriesToLive(j, j2);
    }
}
