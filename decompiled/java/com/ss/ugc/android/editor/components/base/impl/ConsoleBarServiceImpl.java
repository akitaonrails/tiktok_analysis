package com.ss.ugc.android.editor.components.base.impl;

import X.InterfaceC360800ECo;
import com.ss.ugc.android.editor.components.base.api.IConsoleBarService;

/* JADX INFO: loaded from: classes6.dex */
public final class ConsoleBarServiceImpl implements IConsoleBarService {
    public InterfaceC360800ECo consoleBar;

    @Override // com.ss.ugc.android.editor.components.base.api.IConsoleBarService
    public void onDestroy() {
        this.consoleBar = null;
    }

    @Override // com.ss.ugc.android.editor.components.base.api.IConsoleBarService
    public InterfaceC360800ECo getConsoleBar() {
        return this.consoleBar;
    }

    @Override // com.ss.ugc.android.editor.components.base.api.IConsoleBarService
    public void init(InterfaceC360800ECo interfaceC360800ECo) {
        this.consoleBar = interfaceC360800ECo;
    }
}
