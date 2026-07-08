package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency;

import X.C1948707kD;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.utils.IECContextService;

/* JADX INFO: loaded from: classes4.dex */
public final class ECContextService implements IECContextService {
    @Override // com.ss.android.ugc.aweme.ecommerce.utils.IECContextService
    public final Context getContext() {
        return C1948707kD.LIZ().getApplicationContext();
    }
}
