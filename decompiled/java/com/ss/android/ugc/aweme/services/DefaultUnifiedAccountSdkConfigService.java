package com.ss.android.ugc.aweme.services;

import X.C1868540yiy;
import X.C1868550yiz;
import android.content.Context;
import com.ss.android.ugc.aweme.IUnifiedAccountSdkConfigService;

/* JADX INFO: loaded from: classes29.dex */
public final class DefaultUnifiedAccountSdkConfigService implements IUnifiedAccountSdkConfigService {
    public static final int $stable = 0;

    @Override // com.ss.android.ugc.aweme.IUnifiedAccountSdkConfigService
    public C1868550yiz getUnifiedLoginPanelConfig(Context context) {
        return new C1868550yiz(new C1868540yiy("aweme://roma_redirect/?spark_page=TT_CSP_Login_login_page_front", 5), 6);
    }
}
