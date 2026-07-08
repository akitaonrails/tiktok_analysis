package com.bytedance.services.apm.api;

import X.InterfaceC792700V7s;
import com.bytedance.news.common.service.manager.IService;

/* JADX INFO: loaded from: classes14.dex */
public interface IActivityLifeManager extends IService {
    boolean isForeground();

    void register(InterfaceC792700V7s interfaceC792700V7s);

    void unregister(InterfaceC792700V7s interfaceC792700V7s);
}
