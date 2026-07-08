package com.ss.ugc.android.editor.components.base.api;

import com.bytedance.news.common.service.manager.IServiceProxy;
import com.ss.ugc.android.editor.components.base.impl.PreviewServiceImpl;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class IPreviewService__ServiceProxy implements IServiceProxy<IPreviewService> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IPreviewService newInstance() {
        return new PreviewServiceImpl();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.ss.ugc.android.editor.components.base.api.IPreviewService", "com.ss.ugc.android.editor.components.base.impl.PreviewServiceImpl");
    }
}
