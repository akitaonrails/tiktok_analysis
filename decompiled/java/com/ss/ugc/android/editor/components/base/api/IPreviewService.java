package com.ss.ugc.android.editor.components.base.api;

import X.InterfaceC361710EGb;
import com.bytedance.news.common.service.manager.IService;

/* JADX INFO: loaded from: classes6.dex */
public interface IPreviewService extends IService {
    InterfaceC361710EGb getPreviewPanelApi();

    void init(InterfaceC361710EGb interfaceC361710EGb);

    void onDestroy();
}
