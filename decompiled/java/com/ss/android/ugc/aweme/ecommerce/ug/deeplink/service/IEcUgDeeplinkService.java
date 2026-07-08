package com.ss.android.ugc.aweme.ecommerce.ug.deeplink.service;

import android.net.Uri;
import com.bytedance.router.interceptor.IInterceptor;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes25.dex */
public interface IEcUgDeeplinkService {
    List<IInterceptor> LIZ();

    Map<String, Object> LIZIZ(String str);

    void LIZJ(Uri.Builder builder, long j);
}
