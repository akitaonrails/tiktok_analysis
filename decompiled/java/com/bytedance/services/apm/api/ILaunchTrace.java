package com.bytedance.services.apm.api;

import com.bytedance.news.common.service.manager.IService;

/* JADX INFO: loaded from: classes14.dex */
public interface ILaunchTrace extends IService {
    void cancelTrace();

    void endSpan(String str, String str2);

    void endTrace(int i, String str, long j);

    void startSpan(String str, String str2);

    void startTrace();
}
