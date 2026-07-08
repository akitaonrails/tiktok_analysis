package com.bytedance.crash.looper;

import X.C08SE;
import X.C0VSJ;
import X.C786410Ut5;
import X.C802640VeA;
import X.InterfaceC803550Vfd;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class SimpleMessageObserver implements MessageObserver, InterfaceC803550Vfd {
    public HistoryMessage LLILLL;
    public final HistoryMessage LL = new HistoryMessage();
    public final HistoryMessage LLILLJJLI = new HistoryMessage();
    public volatile boolean LLILZ = false;

    @Override // X.InterfaceC803550Vfd
    public final synchronized void LIZ() {
        if (this.LLILZ) {
            HistoryMessage historyMessage = new HistoryMessage();
            this.LLILLL = historyMessage;
            this.LLILLJJLI.LIZ(historyMessage);
            this.LLILLJJLI.LIZLLL();
            this.LLILZ = false;
        }
    }

    @Override // X.InterfaceC803550Vfd
    public final synchronized void LIZIZ() {
        this.LLILZ = this.LLILLJJLI.LIZIZ <= 0;
        if (this.LLILZ) {
            this.LL.LIZ(this.LLILLJJLI);
        }
    }

    @Override // com.bytedance.crash.looper.MessageObserver
    public final void stop() {
    }

    @Override // com.bytedance.crash.looper.MessageObserver
    public final void start() {
        ((ArrayList) C802640VeA.LJJJIL).add(this);
    }

    public static class HistoryMessage {
        public long LIZ;
        public long LIZIZ;
        public long LIZJ;
        public long LIZLLL;

        public final synchronized void LIZIZ() {
            this.LIZIZ = System.currentTimeMillis();
            this.LIZLLL = SystemClock.currentThreadTimeMillis();
        }

        public final synchronized void LIZJ() {
            this.LIZ = System.currentTimeMillis();
            this.LIZJ = SystemClock.currentThreadTimeMillis();
            this.LIZLLL = 0L;
            this.LIZIZ = 0L;
        }

        public final synchronized void LIZLLL() {
            this.LIZ = 0L;
            this.LIZIZ = 0L;
            this.LIZJ = 0L;
            this.LIZLLL = 0L;
        }

        public final synchronized void LIZ(HistoryMessage historyMessage) {
            historyMessage.LIZ = this.LIZ;
            historyMessage.LIZIZ = this.LIZIZ;
            historyMessage.LIZJ = this.LIZJ;
            historyMessage.LIZLLL = this.LIZLLL;
        }
    }

    @Override // com.bytedance.crash.looper.MessageObserver
    public final void dumpMessages(File file) {
        HistoryMessage historyMessage = this.LLILLL;
        if (historyMessage == null) {
            return;
        }
        historyMessage.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            long j = historyMessage.LIZ;
            if (j > 0) {
                jSONObject.put("startTime", j);
            }
            long j2 = historyMessage.LIZIZ;
            if (j2 > 0) {
                jSONObject.put("endTime", j2);
            }
            long j3 = historyMessage.LIZJ;
            if (j3 > 0) {
                jSONObject.put("startCpuTime", j3);
            }
            long j4 = historyMessage.LIZLLL;
            if (j4 > 0) {
                jSONObject.put("endCpuTime", j4);
            }
            try {
                C08SE.LJIIIIZZ(new C0VSJ(file, "sample_message.txt"), C786410Ut5.J3(jSONObject), false);
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            this.LLILLL = null;
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    @Override // com.bytedance.crash.looper.MessageObserver, X.InterfaceC20666087s
    public final synchronized void messageDispatchStarting(String str) {
        this.LL.LIZJ();
    }

    @Override // com.bytedance.crash.looper.MessageObserver, X.InterfaceC20666087s
    public final synchronized void messageDispatched(String str, Message message) {
        this.LL.LIZIZ();
        if (this.LLILZ) {
            HistoryMessage historyMessage = this.LLILLJJLI;
            if (historyMessage.LIZIZ == 0) {
                historyMessage.LIZIZ();
            }
        }
    }
}
