package com.bytedance.lynx.service.network;

import X.AbstractC1338850kwd;
import X.C1289470jez;
import X.C1320210kSZ;
import X.C1338870kwf;
import X.C1338940kwm;
import X.C2188811AlT;
import X.RunnableC1338900kwi;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.jsbridge.network.HttpRequest;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.service.ILynxHttpService;

/* JADX INFO: loaded from: classes21.dex */
public class LynxHttpService implements ILynxHttpService {
    public static volatile LynxHttpService mInstance;

    @Override // com.lynx.tasm.service.ILynxHttpService, com.lynx.tasm.service.IServiceProvider
    public final /* synthetic */ Class getServiceClass() {
        return C1338870kwf.LIZ(this);
    }

    @Override // com.lynx.tasm.service.IServiceProvider
    public final /* synthetic */ void onInitialize(Context context) {
        C1289470jez.LIZ(this, context);
    }

    public static LynxHttpService getInstance() {
        if (mInstance == null) {
            synchronized (LynxHttpService.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new LynxHttpService();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return mInstance;
    }

    @Override // com.lynx.tasm.service.ILynxHttpService
    public void request(HttpRequest httpRequest, AbstractC1338850kwd abstractC1338850kwd) {
        doRequest(httpRequest, abstractC1338850kwd, null);
    }

    private void doRequest(HttpRequest httpRequest, AbstractC1338850kwd abstractC1338850kwd, C1320210kSZ c1320210kSZ) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("call http request with url: ");
        sbLIZ.append(httpRequest.LIZIZ);
        LynxLog.i("NetworkModule", C2188811AlT.LIZIZ(sbLIZ));
        TraceEvent.LIZLLL("NetworkModule.call");
        C1338940kwm.LIZIZ.LIZJ();
        new RunnableC1338900kwi(httpRequest, abstractC1338850kwd, c1320210kSZ).run();
        TraceEvent.LJII("NetworkModule.call");
    }

    @Override // com.lynx.tasm.service.ILynxHttpService
    public void requestStreaming(HttpRequest httpRequest, AbstractC1338850kwd abstractC1338850kwd, C1320210kSZ c1320210kSZ) {
        doRequest(httpRequest, abstractC1338850kwd, c1320210kSZ);
    }
}
