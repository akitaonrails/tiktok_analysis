package com.ss.android.ugc.aweme.utils;

import X.C2200121B8w;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IDownloaderInitService;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloaderInitService implements IDownloaderInitService {
    @Override // com.ss.android.ugc.aweme.IDownloaderInitService
    public final void LIZ(Context context) {
        try {
            C2200121B8w.LIZ(context);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
