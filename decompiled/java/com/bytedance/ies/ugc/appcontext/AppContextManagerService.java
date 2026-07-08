package com.bytedance.ies.ugc.appcontext;

import X.C844470XAv;
import android.content.Context;
import com.ss.android.ugc.aweme.api.IAppContextManagerService;

/* JADX INFO: loaded from: classes3.dex */
public final class AppContextManagerService implements IAppContextManagerService {
    @Override // com.ss.android.ugc.aweme.api.IAppContextManagerService
    public final int getAppId() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LJIIJ;
    }

    @Override // com.ss.android.ugc.aweme.api.IAppContextManagerService
    public final Context getApplicationContext() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.api.IAppContextManagerService
    public final boolean isDebug() {
        return false;
    }
}
