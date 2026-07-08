package com.bytedance.news.common.service.manager;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface IServiceProxy<T> {
    void collectService(Map<String, String> map);

    T newInstance();
}
