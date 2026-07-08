package com.ss.android.ugc.aweme.services.interceptor;

import com.bytedance.retrofit2.client.Request;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public interface IInterceptor {
    Map<String, String> tryToIntercept(String str, Request request, String str2, int i, Map<String, String> map);
}
