package com.ss.android.ugc.aweme.series.seriesdetail.serviceimpl;

import X.C01GW;
import X.C04TD;
import X.C452501pT;
import com.ss.android.ugc.aweme.api.series.ICommerceFeedSeriesService;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.ISeriesAdsETService;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class SeriesAdsETServiceImpl implements ISeriesAdsETService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(628));

    public static ISeriesAdsETService LIZIZ() {
        Object objLIZ = C04TD.LIZ(ISeriesAdsETService.class, false);
        if (objLIZ != null) {
            return (ISeriesAdsETService) objLIZ;
        }
        if (C04TD.V3 == null) {
            synchronized (ISeriesAdsETService.class) {
                if (C04TD.V3 == null) {
                    C04TD.V3 = new SeriesAdsETServiceImpl();
                }
            }
        }
        return C04TD.V3;
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesAdsETService
    public final String getCurrentUserId() {
        return ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesAdsETService
    public final Map<String, Object> LIZ(String str) {
        return ((ICommerceFeedSeriesService) this.LIZ.getValue()).K90(str);
    }
}
