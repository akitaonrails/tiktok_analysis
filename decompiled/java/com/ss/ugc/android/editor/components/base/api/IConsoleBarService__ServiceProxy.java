package com.ss.ugc.android.editor.components.base.api;

import com.bytedance.news.common.service.manager.IServiceProxy;
import com.ss.ugc.android.editor.components.base.impl.ConsoleBarServiceImpl;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class IConsoleBarService__ServiceProxy implements IServiceProxy<IConsoleBarService> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IConsoleBarService newInstance() {
        return new ConsoleBarServiceImpl();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.ss.ugc.android.editor.components.base.api.IConsoleBarService", "com.ss.ugc.android.editor.components.base.impl.ConsoleBarServiceImpl");
    }
}
