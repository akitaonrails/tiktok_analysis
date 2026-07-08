package com.bytedance.router;

import com.bytedance.router.interceptor.IInterceptor;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface IInterceptorInitializer {
    void initAssignInterceptors(Map<String, IInterceptor> map);

    void initInterceptors(List<IInterceptor> list);
}
