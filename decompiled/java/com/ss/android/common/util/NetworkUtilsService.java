package com.ss.android.common.util;

import X.C036E;
import X.C786410Ut5;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.INetWorkUtilsService;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkUtilsService implements INetWorkUtilsService {
    @Override // com.ss.android.ugc.aweme.api.INetWorkUtilsService
    public final boolean isNetworkAvailable() {
        try {
            return C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.api.INetWorkUtilsService
    public final String LIZ(Context context) {
        return C786410Ut5.c3(context);
    }
}
