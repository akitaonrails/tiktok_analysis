package com.ss.ugc.android.editor.components.base.api;

import com.bytedance.news.common.service.manager.IServiceProxy;
import com.ss.ugc.android.editor.components.base.impl.StickerServiceImpl;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class IStickerPreviewService__ServiceProxy implements IServiceProxy<IStickerPreviewService> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IStickerPreviewService newInstance() {
        return new StickerServiceImpl();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.ss.ugc.android.editor.components.base.api.IStickerPreviewService", "com.ss.ugc.android.editor.components.base.impl.StickerServiceImpl");
    }
}
