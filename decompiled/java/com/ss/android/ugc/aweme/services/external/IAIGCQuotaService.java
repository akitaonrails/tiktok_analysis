package com.ss.android.ugc.aweme.services.external;

import X.InterfaceC1364105Vn;
import kotlin.Pair;

/* JADX INFO: loaded from: classes9.dex */
public interface IAIGCQuotaService {

    public static final class DefaultImpls {
    }

    void cacheQuota(String str, Integer num, Integer num2);

    Object checkQuotaBeforeGenerate(String str, RefreshQuotaScene refreshQuotaScene, InterfaceC1364105Vn<? super Pair<Integer, String>> interfaceC1364105Vn);

    CacheQuota getQuotaCache(String str, boolean z);

    void refreshQuotaCache(String str, RefreshQuotaScene refreshQuotaScene);

    void refreshQuotaCacheIfNeed(String str, RefreshQuotaScene refreshQuotaScene);
}
