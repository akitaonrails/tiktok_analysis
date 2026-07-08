package com.ss.ugc.android.editor.components.base.impl;

import X.InterfaceC361710EGb;
import com.ss.ugc.android.editor.components.base.api.IPreviewService;

/* JADX INFO: loaded from: classes6.dex */
public final class PreviewServiceImpl implements IPreviewService {
    public InterfaceC361710EGb previewPanelApi;

    @Override // com.ss.ugc.android.editor.components.base.api.IPreviewService
    public void onDestroy() {
        this.previewPanelApi = null;
    }

    @Override // com.ss.ugc.android.editor.components.base.api.IPreviewService
    public InterfaceC361710EGb getPreviewPanelApi() {
        return this.previewPanelApi;
    }

    @Override // com.ss.ugc.android.editor.components.base.api.IPreviewService
    public void init(InterfaceC361710EGb interfaceC361710EGb) {
        this.previewPanelApi = interfaceC361710EGb;
    }
}
