package com.ss.ugc.android.editor.components.base.api;

import com.bytedance.news.common.service.manager.IServiceProxy;
import com.ss.ugc.android.editor.components.magicprocessor.DefaultMagicProcessorService;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class IMagicProcessorService__ServiceProxy implements IServiceProxy<IMagicProcessorService> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IMagicProcessorService newInstance() {
        return new DefaultMagicProcessorService();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.ss.ugc.android.editor.components.base.api.IMagicProcessorService", "com.ss.ugc.android.editor.components.magicprocessor.DefaultMagicProcessorService");
    }
}
