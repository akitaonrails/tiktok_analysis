package com.ss.android.ugc.aweme.socialavatar.mixstudio.push;

import com.ss.android.ugc.aweme.socialavatar.api.mixstudio.MixStudioRouteService;

/* JADX INFO: loaded from: classes3.dex */
public final class MixStudioRouteServiceImpl implements MixStudioRouteService {
    @Override // com.ss.android.ugc.aweme.socialavatar.api.mixstudio.MixStudioRouteService
    public final MixStudioReadyInterceptor getInterceptor() {
        return new MixStudioReadyInterceptor();
    }
}
