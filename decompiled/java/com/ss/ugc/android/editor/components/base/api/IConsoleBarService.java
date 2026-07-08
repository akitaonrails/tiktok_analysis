package com.ss.ugc.android.editor.components.base.api;

import X.InterfaceC1294060jmO;
import X.InterfaceC360800ECo;
import com.bytedance.news.common.service.manager.IService;

/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1294060jmO
public interface IConsoleBarService extends IService {
    InterfaceC360800ECo getConsoleBar();

    void init(InterfaceC360800ECo interfaceC360800ECo);

    void onDestroy();
}
