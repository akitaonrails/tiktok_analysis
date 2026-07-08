package com.bytedance.frameworks.baselib.netx.partner;

import X.C09AY;
import X.C786410Ut5;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes14.dex */
public final class NetworkPartnerGroup$PartnerInterceptor$Companion$globalBystanderHandler$2 extends C09AY implements Function0<AnonymousClass1> {
    public NetworkPartnerGroup$PartnerInterceptor$Companion$globalBystanderHandler$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.frameworks.baselib.netx.partner.NetworkPartnerGroup$PartnerInterceptor$Companion$globalBystanderHandler$2$1] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ AnonymousClass1 invoke() {
        HandlerThread handlerThread = new HandlerThread("PartnerBystanderThread");
        handlerThread.start();
        return new BPEAHandler(C786410Ut5.W2(handlerThread)) { // from class: com.bytedance.frameworks.baselib.netx.partner.NetworkPartnerGroup$PartnerInterceptor$Companion$globalBystanderHandler$2.1
            @Override // com.bytedance.bpea.transmit.delegate.BPEAHandler, android.os.Handler
            public final void dispatchMessage(Message message) {
                try {
                    super.dispatchMessage(message);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        };
    }
}
