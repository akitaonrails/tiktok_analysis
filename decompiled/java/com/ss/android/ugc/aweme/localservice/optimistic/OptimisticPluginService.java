package com.ss.android.ugc.aweme.localservice.optimistic;

import X.C0O3D;
import X.C735220Ssi;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.localservice.service.optimistic.IOptimisticPluginService;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class OptimisticPluginService implements IOptimisticPluginService {
    @Override // com.ss.android.ugc.aweme.localservice.service.optimistic.IOptimisticPluginService
    public final C0O3D LIZ(Context context, String str, Bundle bundle, AFwS198S0000000_11 aFwS198S0000000_11, AFwS243S0000000_11 aFwS243S0000000_11) {
        return new C735220Ssi(context, str, bundle, aFwS198S0000000_11, aFwS243S0000000_11);
    }
}
