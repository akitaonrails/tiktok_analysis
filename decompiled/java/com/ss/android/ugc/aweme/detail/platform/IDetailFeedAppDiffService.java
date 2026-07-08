package com.ss.android.ugc.aweme.detail.platform;

import X.C1606430ruD;
import kotlin.jvm.internal.AwS108S1000000_24;

/* JADX INFO: loaded from: classes25.dex */
public interface IDetailFeedAppDiffService {
    public static final C1606430ruD LIZ = C1606430ruD.LIZ;

    void LIZ();

    boolean LIZIZ(AwS108S1000000_24 awS108S1000000_24);

    public static final class DowngradeInstance implements IDetailFeedAppDiffService {
        @Override // com.ss.android.ugc.aweme.detail.platform.IDetailFeedAppDiffService
        public final void LIZ() {
        }

        @Override // com.ss.android.ugc.aweme.detail.platform.IDetailFeedAppDiffService
        public final boolean LIZIZ(AwS108S1000000_24 awS108S1000000_24) {
            return ((Boolean) awS108S1000000_24.invoke()).booleanValue();
        }
    }
}
