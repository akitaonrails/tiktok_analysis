package com.bytedance.lynx.service.network;

import X.AbstractC1338850kwd;
import X.C1289470jez;
import X.C1320210kSZ;
import X.C1338870kwf;
import android.content.Context;
import com.lynx.jsbridge.network.HttpRequest;
import com.lynx.tasm.service.ILynxHttpService;

/* JADX INFO: loaded from: classes21.dex */
public class LynxHttpServiceProvider implements ILynxHttpService {
    @Override // com.lynx.tasm.service.ILynxHttpService, com.lynx.tasm.service.IServiceProvider
    public final /* synthetic */ Class getServiceClass() {
        return C1338870kwf.LIZ(this);
    }

    @Override // com.lynx.tasm.service.IServiceProvider
    public final /* synthetic */ void onInitialize(Context context) {
        C1289470jez.LIZ(this, context);
    }

    @Override // com.lynx.tasm.service.ILynxHttpService
    public void request(HttpRequest httpRequest, AbstractC1338850kwd abstractC1338850kwd) {
        LynxHttpService.getInstance().request(httpRequest, abstractC1338850kwd);
    }

    @Override // com.lynx.tasm.service.ILynxHttpService
    public void requestStreaming(HttpRequest httpRequest, AbstractC1338850kwd abstractC1338850kwd, C1320210kSZ c1320210kSZ) {
        LynxHttpService.getInstance().requestStreaming(httpRequest, abstractC1338850kwd, c1320210kSZ);
    }
}
