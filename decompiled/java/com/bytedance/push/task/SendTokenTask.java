package com.bytedance.push.task;

import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C808510Vnd;
import X.C808850VoB;
import X.InterfaceC808860VoC;
import Y.ARunnableS103S0100000_3;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class SendTokenTask implements Runnable {
    public static final Object LLILZLL = new Object();
    public final InterfaceC808860VoC LL;
    public int LLILLJJLI = 10;
    public final Context LLILLL;
    public final Handler LLILZ;
    public int LLILZIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SendTokenTask@395f.run");
        boolean zLJI = MethodIDManager.LJI(196641);
        try {
            if (this.LLILLL != null && this.LL != null) {
                synchronized (LLILZLL) {
                    try {
                        LIZIZ(this.LL);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
        C1C7U.LIZIZ("SendTokenTask@395f.run");
    }

    public final void LIZ(String str) {
        try {
            int i = this.LLILZIL + 1;
            this.LLILZIL = i;
            if (i <= 3 && !TextUtils.isEmpty(str)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("token fail, token = ");
                sbLIZ.append(str);
                sbLIZ.append(". retry = ");
                sbLIZ.append(this.LLILZIL);
                C2188811AlT.LIZIZ(sbLIZ);
                C808510Vnd.LIZ().LIZIZ(TimeUnit.SECONDS.toMillis(4L) * ((long) this.LLILZIL), new ARunnableS103S0100000_3((Object) this, 24));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.InterfaceC808860VoC r26) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.task.SendTokenTask.LIZIZ(X.0VoC):void");
    }

    public SendTokenTask(Context context, C808850VoB c808850VoB) {
        C808510Vnd.LIZ().getClass();
        this.LLILZ = new BPEAHandler(C786410Ut5.W2(C808510Vnd.LLILLL)) { // from class: com.bytedance.push.task.SendTokenTask.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                String str;
                C1C7U.LIZ("SendTokenTask@395f.<field>$1");
                super.handleMessage(message);
                SendTokenTask sendTokenTask = SendTokenTask.this;
                sendTokenTask.getClass();
                boolean z = true;
                if (message.what == 1) {
                    try {
                        int i = message.arg1;
                        if (i == 10 || i != 11) {
                            z = false;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Send token ");
                        if (z) {
                            str = "success";
                        } else {
                            str = "fail";
                        }
                        sbLIZ.append(str);
                        C2188811AlT.LIZIZ(sbLIZ);
                        if (!z) {
                            sendTokenTask.LIZ((String) HandlerHook.getMessageObj(message.obj));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                C1C7U.LIZIZ("SendTokenTask@395f.<field>$1");
            }
        };
        this.LLILZIL = 0;
        this.LLILLL = context;
        this.LL = c808850VoB;
    }
}
