package com.bytedance.geckox.policy.loop;

import X.C1551510qTd;
import X.C1552980qW0;
import X.C1553130qWF;
import X.C1553260qWS;
import X.C1C7U;
import X.C786410Ut5;
import Y.ARunnableS92S0200000_23;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.geckox.model.DeploymentModelLoop;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes24.dex */
public final class LoopPolicy {
    public final Handler LIZ;
    public final String LIZIZ;
    public int LIZLLL;
    public C1553260qWS LJFF;
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public final Map<String, C1552980qW0> LJ = new ConcurrentHashMap();

    public final void LIZJ() {
        int i = this.LIZLLL;
        if (i == 0 || this.LIZ.hasMessages(i) || this.LIZJ.get()) {
            return;
        }
        C1553130qWF.LIZ("gecko-debug-tag", "[loop]start loop,interval level:", this.LIZIZ, ",combine deployments:", this.LJ);
        this.LIZJ.set(true);
        Message messageObtainMessage = this.LIZ.obtainMessage();
        messageObtainMessage.what = this.LIZLLL;
        messageObtainMessage.arg1 = 3;
        C786410Ut5.LJLJLJ(this.LIZ, messageObtainMessage, r0 * LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public final C1552980qW0 LIZ(String str) {
        C1552980qW0 c1552980qW0 = (C1552980qW0) ((ConcurrentHashMap) this.LJ).get(str);
        if (c1552980qW0 == null) {
            c1552980qW0 = new C1552980qW0(new HashMap(), new DeploymentModelLoop());
        }
        if (c1552980qW0.LIZIZ == null) {
            c1552980qW0.LIZIZ = new DeploymentModelLoop();
        }
        return c1552980qW0;
    }

    public final void LIZIZ(int i) {
        if (this.LIZLLL == i) {
            return;
        }
        if (this.LIZJ.get()) {
            this.LIZ.removeMessages(this.LIZLLL);
            this.LIZJ.set(false);
        }
        this.LIZLLL = i;
        LIZJ();
    }

    public LoopPolicy(String str, int i) {
        this.LIZIZ = str;
        this.LIZLLL = i;
        HandlerThread handlerThread = new HandlerThread("combine", 3);
        handlerThread.start();
        this.LIZ = new BPEAHandler(C786410Ut5.W2(handlerThread)) { // from class: com.bytedance.geckox.policy.loop.LoopPolicy.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("LoopPolicy@70b5.<init>$1");
                super.handleMessage(message);
                if (message.arg1 == 3) {
                    C1553130qWF.LIZ("gecko-debug-tag", "[loop]loop msg.what:", Integer.valueOf(message.what), "interval:", Integer.valueOf(LoopPolicy.this.LIZLLL), "time:", Long.valueOf(System.currentTimeMillis()));
                    Map<String, C1552980qW0> map = LoopPolicy.this.LJ;
                    if (map != null && !((ConcurrentHashMap) map).isEmpty()) {
                        LoopPolicy loopPolicy = LoopPolicy.this;
                        C1553260qWS c1553260qWS = loopPolicy.LJFF;
                        if (c1553260qWS != null) {
                            C1551510qTd.LIZ.LIZ().execute(new ARunnableS92S0200000_23(loopPolicy.LJ, c1553260qWS, 73));
                        }
                        LoopPolicy loopPolicy2 = LoopPolicy.this;
                        loopPolicy2.LIZJ.set(true);
                        Message messageObtainMessage = loopPolicy2.LIZ.obtainMessage();
                        messageObtainMessage.what = loopPolicy2.LIZLLL;
                        messageObtainMessage.arg1 = 3;
                        C786410Ut5.LJLJLJ(loopPolicy2.LIZ, messageObtainMessage, r0 * LSPassThroughRecordSizeConfig.DEFAULT);
                    } else {
                        C1C7U.LIZIZ("LoopPolicy@70b5.<init>$1");
                        return;
                    }
                }
                C1C7U.LIZIZ("LoopPolicy@70b5.<init>$1");
            }
        };
    }
}
