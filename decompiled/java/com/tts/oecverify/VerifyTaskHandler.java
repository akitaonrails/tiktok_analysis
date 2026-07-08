package com.tts.oecverify;

import X.C145Q;
import X.C14AC;
import X.C14AL;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import Y.ARunnableS119S0100000_19;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class VerifyTaskHandler {
    public HandlerThread LIZ;
    public MessageHandler LIZIZ;
    public BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());

    public final void LIZIZ() {
        if (this.LIZ == null) {
            synchronized (VerifyTaskHandler.class) {
                try {
                    if (this.LIZ == null) {
                        HandlerThread handlerThread = new HandlerThread("OECTuringVerifyThread");
                        this.LIZ = handlerThread;
                        handlerThread.start();
                        this.LIZIZ = new MessageHandler(C786410Ut5.W2(this.LIZ));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public class MessageHandler extends BPEAHandler {
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            ReentrantLock reentrantLock;
            ReentrantLock reentrantLock2;
            C1C7U.LIZ("VerifyTaskHandler$MessageHandler@ee3b.handleMessage");
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        try {
                            reentrantLock2 = C145Q.LIZ;
                            reentrantLock2.lockInterruptibly();
                            ((LinkedList) C145Q.LIZIZ).clear();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            reentrantLock2 = C145Q.LIZ;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C145Q.LIZ.unlock();
                            throw th;
                        }
                        reentrantLock2.unlock();
                    }
                } else {
                    C14AL c14al = (C14AL) HandlerHook.getMessageObj(message.obj);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("os_name", "android");
                        reentrantLock = C145Q.LIZ;
                        reentrantLock.lockInterruptibly();
                        List<JSONObject> list = C145Q.LIZIZ;
                        jSONObject.put("touch", new JSONArray((Collection) list));
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("responseGetTouchToJs motion list size ");
                        sbLIZ.append(((LinkedList) list).size());
                        C2188811AlT.LIZIZ(sbLIZ);
                        ((LinkedList) list).clear();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("responseGetTouchToJs end motion list size ");
                        sbLIZ2.append(((LinkedList) list).size());
                        C2188811AlT.LIZIZ(sbLIZ2);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        reentrantLock = C145Q.LIZ;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C145Q.LIZ.unlock();
                        throw th2;
                    }
                    reentrantLock.unlock();
                    try {
                        c14al.LIZLLL(1, jSONObject);
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                    }
                }
            } else {
                VerifyTaskHandler verifyTaskHandler = VerifyTaskHandler.this;
                verifyTaskHandler.getClass();
                if (HandlerHook.getMessageObj(message.obj) != null) {
                    C14AC c14ac = (C14AC) HandlerHook.getMessageObj(message.obj);
                    if (verifyTaskHandler.LIZJ == null) {
                        verifyTaskHandler.LIZJ = new BPEAHandler(Looper.getMainLooper());
                    }
                    C786410Ut5.LJJZZIII(verifyTaskHandler.LIZJ, new ARunnableS119S0100000_19(c14ac, 126));
                }
            }
            C1C7U.LIZIZ("VerifyTaskHandler$MessageHandler@ee3b.handleMessage");
        }

        public MessageHandler(Looper looper) {
            super(looper);
        }
    }

    public final void LIZ(Runnable runnable) {
        MessageHandler messageHandler = this.LIZIZ;
        if (messageHandler != null) {
            messageHandler.post(runnable);
        }
    }
}
