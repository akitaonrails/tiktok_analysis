package com.tiktok.ef.absettings.api;

import X.C0CJ4;
import X.C0CJ5;
import X.C311720CJu;
import X.InterfaceC800130Va7;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface IABSettingFetcherConfig {
    InterfaceC800130Va7 createABCDNConfigFetcher(List<C0CJ5> list, C0CJ4 c0cj4);

    String getExtendFetchingRequestString();

    C311720CJu getPlatformInfo();

    boolean isForceDisableGroupUpdate();

    void onRetryFetching();
}
