package com.service.middleware.applog;

import com.bytedance.news.common.service.manager.IServiceProxy;
import com.ss.android.common.applog.ApplogServiceImpl;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class ApplogService__ServiceProxy implements IServiceProxy<ApplogService> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public ApplogService newInstance() {
        return new ApplogServiceImpl();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.service.middleware.applog.ApplogService", "com.ss.android.common.applog.ApplogServiceImpl");
    }
}
