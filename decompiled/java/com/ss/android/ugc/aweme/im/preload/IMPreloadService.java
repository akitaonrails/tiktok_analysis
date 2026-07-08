package com.ss.android.ugc.aweme.im.preload;

import X.C05GH;
import X.C05GN;
import X.C1329305Id;
import X.C1790390wgv;
import X.InterfaceC1335505Kn;
import X.InterfaceC1335605Ko;
import com.ss.android.ugc.aweme.preload.api.IIMPreloadService;

/* JADX INFO: loaded from: classes3.dex */
public final class IMPreloadService implements IIMPreloadService {
    public final C1329305Id LIZ = C1329305Id.LIZ;
    public final C05GN LIZIZ;
    public final C1790390wgv LIZJ;

    public IMPreloadService() {
        boolean z = C05GH.LIZ;
        this.LIZIZ = C05GN.LIZ;
        this.LIZJ = C1790390wgv.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.preload.api.IIMPreloadService
    public final C1329305Id LIZ() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.preload.api.IIMPreloadService
    public final InterfaceC1335605Ko LIZIZ() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.preload.api.IIMPreloadService
    public final InterfaceC1335505Kn getEventCenter() {
        return this.LIZIZ;
    }
}
