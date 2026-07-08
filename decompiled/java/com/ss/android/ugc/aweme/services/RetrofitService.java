package com.ss.android.ugc.aweme.services;

import X.C09S2;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;

/* JADX INFO: loaded from: classes30.dex */
public class RetrofitService implements IRetrofitService {
    @Override // com.ss.android.ugc.aweme.framework.services.IRetrofitService
    public IRetrofit createNewRetrofit(final String str) {
        return new IRetrofit() { // from class: com.ss.android.ugc.aweme.services.RetrofitService.1
            @Override // com.ss.android.ugc.aweme.framework.services.IRetrofit
            public <T> T create(Class<T> cls) {
                return (T) C09S2.LIZ(str).create(cls);
            }
        };
    }
}
