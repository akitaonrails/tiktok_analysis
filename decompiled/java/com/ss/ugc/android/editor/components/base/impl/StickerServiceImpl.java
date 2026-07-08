package com.ss.ugc.android.editor.components.base.impl;

import X.InterfaceC372990Ejp;
import com.ss.ugc.android.editor.components.base.api.IStickerPreviewService;

/* JADX INFO: loaded from: classes6.dex */
public final class StickerServiceImpl implements IStickerPreviewService {
    public InterfaceC372990Ejp stickerApi;

    @Override // com.ss.ugc.android.editor.components.base.api.IStickerPreviewService
    public void onDestroy() {
        this.stickerApi = null;
    }

    @Override // com.ss.ugc.android.editor.components.base.api.IStickerPreviewService
    public InterfaceC372990Ejp getStickerPreviewApi() {
        return this.stickerApi;
    }

    @Override // com.ss.ugc.android.editor.components.base.api.IStickerPreviewService
    public void initComponent(InterfaceC372990Ejp interfaceC372990Ejp) {
        this.stickerApi = interfaceC372990Ejp;
    }
}
