package com.ss.android.ugc.aweme.app.services;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class HybridABInfoService implements IHybridABInfoService {
    public Boolean LIZ;

    @Override // com.ss.android.ugc.aweme.app.services.IHybridABInfoService
    public final Integer LIZIZ() {
        Boolean bool = this.LIZ;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            return 1;
        }
        return Intrinsics.LJFF(bool, Boolean.FALSE) ? 0 : null;
    }

    @Override // com.ss.android.ugc.aweme.app.services.IHybridABInfoService
    public final void LIZ(boolean z) {
        this.LIZ = Boolean.valueOf(z);
    }
}
