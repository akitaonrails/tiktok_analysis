package com.ss.android.ugc.aweme.service;

import X.C424280GkM;
import android.content.Context;
import com.ss.android.ugc.aweme.inteceptor.PhotoAnalyticsDetailInterceptor;

/* JADX INFO: loaded from: classes25.dex */
public final class PhotoAnalyticsDetailService implements IPhotoAnalyticsDetailService {
    @Override // com.ss.android.ugc.aweme.service.IPhotoAnalyticsDetailService
    public final PhotoAnalyticsDetailInterceptor LIZIZ() {
        return new PhotoAnalyticsDetailInterceptor();
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoAnalyticsDetailService
    public final C424280GkM LIZ(Context context) {
        return new C424280GkM(context);
    }
}
