package com.lynx.jsbridge;

import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public class LynxContextModule extends LynxModule {
    public s mLynxContext;

    @Override // com.lynx.jsbridge.LynxModule
    public void destroy() {
        super.destroy();
    }

    public LynxContextModule(s sVar) {
        super(sVar);
        this.mLynxContext = sVar;
    }

    public LynxContextModule(s sVar, Object obj) {
        super(sVar, obj);
        this.mLynxContext = sVar;
    }
}
