package com.bytedance.common.meteor.control;

import X.C1C7U;
import X.InterfaceC1384330m7z;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class BaseHandler extends BPEAHandler {
    public final Function0<InterfaceC1384330m7z> LL;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("BaseHandler@d81f.handleMessage");
        InterfaceC1384330m7z interfaceC1384330m7zInvoke = this.LL.invoke();
        if (interfaceC1384330m7zInvoke != null) {
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    interfaceC1384330m7zInvoke.LJJIIZI();
                }
            } else {
                interfaceC1384330m7zInvoke.LJJ();
            }
            C1C7U.LIZIZ("BaseHandler@d81f.handleMessage");
            return;
        }
        C1C7U.LIZIZ("BaseHandler@d81f.handleMessage");
    }

    public BaseHandler(Looper looper, AwS565S0100000_21 awS565S0100000_21) {
        super(looper);
        this.LL = awS565S0100000_21;
    }
}
