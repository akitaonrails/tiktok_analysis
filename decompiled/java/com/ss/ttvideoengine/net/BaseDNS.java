package com.ss.ttvideoengine.net;

import X.AbstractC1468760oKA;
import X.C1469810oLr;
import X.C1C7U;
import X.C786410Ut5;
import X.C795730VJj;
import X.InterfaceC1468560oJq;
import android.os.Handler;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import fyo.e;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class BaseDNS {
    public final Handler LIZ = new MyHandler(this);
    public boolean LIZIZ;
    public final String LIZJ;
    public InterfaceC1468560oJq LIZLLL;
    public final AbstractC1468760oKA LJ;

    public void LIZJ() {
    }

    public void LIZLLL() {
    }

    public void LJFF() {
    }

    public static class MyHandler extends BPEAHandler {
        public final WeakReference<BaseDNS> LL;

        public MyHandler(BaseDNS baseDNS) {
            super(C795730VJj.LJII());
            this.LL = new WeakReference<>(baseDNS);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("BaseDNS$MyHandler@2c6d.handleMessage");
            BaseDNS baseDNS = this.LL.get();
            if (baseDNS == null) {
                C1C7U.LIZIZ("BaseDNS$MyHandler@2c6d.handleMessage");
                return;
            }
            InterfaceC1468560oJq interfaceC1468560oJq = baseDNS.LIZLLL;
            if (interfaceC1468560oJq == null) {
                C1C7U.LIZIZ("BaseDNS$MyHandler@2c6d.handleMessage");
                return;
            }
            if (baseDNS.LIZIZ) {
                C1C7U.LIZIZ("BaseDNS$MyHandler@2c6d.handleMessage");
                return;
            }
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            baseDNS.LIZLLL();
                            interfaceC1468560oJq.LIZIZ((JSONObject) HandlerHook.getMessageObj(message.obj), null);
                        }
                    } else {
                        baseDNS.LIZLLL();
                        interfaceC1468560oJq.LIZIZ(null, (e) HandlerHook.getMessageObj(message.obj));
                    }
                } else {
                    baseDNS.LIZLLL();
                    interfaceC1468560oJq.LIZ((e) HandlerHook.getMessageObj(message.obj));
                }
            } else {
                interfaceC1468560oJq.onCancelled();
            }
            C1C7U.LIZIZ("BaseDNS$MyHandler@2c6d.handleMessage");
        }
    }

    public BaseDNS(String str) {
        this.LIZJ = str;
    }

    public final void LJ(e eVar) {
        C786410Ut5.LJLJJL(this.LIZ, this.LIZ.obtainMessage(2, eVar));
    }

    public BaseDNS(String str, AbstractC1468760oKA abstractC1468760oKA) {
        this.LIZJ = str;
        this.LJ = abstractC1468760oKA == null ? new C1469810oLr() : abstractC1468760oKA;
    }
}
