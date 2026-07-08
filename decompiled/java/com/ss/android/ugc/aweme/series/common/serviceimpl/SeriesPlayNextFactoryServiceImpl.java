package com.ss.android.ugc.aweme.series.common.serviceimpl;

import X.C1612470s3x;
import com.ss.android.ugc.aweme.service.ISeriesPlayNextFactoryService;
import com.ss.android.ugc.aweme.service.ISeriesPlayNextService;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class SeriesPlayNextFactoryServiceImpl implements ISeriesPlayNextFactoryService {
    public final HashMap<String, ISeriesPlayNextService> LIZ = new HashMap<>();

    @Override // com.ss.android.ugc.aweme.service.ISeriesPlayNextFactoryService
    public final ISeriesPlayNextService LIZ(String str) {
        if (str != null && str.length() != 0) {
            ISeriesPlayNextService iSeriesPlayNextService = this.LIZ.get(str);
            if (iSeriesPlayNextService != null) {
                return iSeriesPlayNextService;
            }
            C1612470s3x c1612470s3x = new C1612470s3x(str);
            this.LIZ.put(str, c1612470s3x);
            return c1612470s3x;
        }
        return null;
    }
}
