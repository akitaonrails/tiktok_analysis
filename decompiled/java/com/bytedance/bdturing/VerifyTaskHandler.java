package com.bytedance.bdturing;

import X.C145P;
import X.C14AD;
import X.C14AH;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
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

    public final void LIZ() {
        if (this.LIZ == null) {
            synchronized (VerifyTaskHandler.class) {
                try {
                    if (this.LIZ == null) {
                        HandlerThread handlerThread = new HandlerThread("TuringVerifyThread");
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
            C1C7U.LIZ("VerifyTaskHandler$MessageHandler@a39a.handleMessage");
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        try {
                            reentrantLock2 = C145P.LIZ;
                            reentrantLock2.lockInterruptibly();
                            ((LinkedList) C145P.LIZIZ).clear();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            reentrantLock2 = C145P.LIZ;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C145P.LIZ.unlock();
                            throw th;
                        }
                        reentrantLock2.unlock();
                    }
                } else {
                    C14AH c14ah = (C14AH) HandlerHook.getMessageObj(message.obj);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("os_name", "android");
                        reentrantLock = C145P.LIZ;
                        reentrantLock.lockInterruptibly();
                        List<JSONObject> list = C145P.LIZIZ;
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
                        reentrantLock = C145P.LIZ;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C145P.LIZ.unlock();
                        throw th2;
                    }
                    reentrantLock.unlock();
                    try {
                        c14ah.LIZLLL(1, jSONObject, null);
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                    }
                }
            } else {
                VerifyTaskHandler.this.getClass();
                if (HandlerHook.getMessageObj(message.obj) != null) {
                    ((C14AD) HandlerHook.getMessageObj(message.obj)).LJJLIIIJLLLLLLLZ();
                }
            }
            C1C7U.LIZIZ("VerifyTaskHandler$MessageHandler@a39a.handleMessage");
        }

        public MessageHandler(Looper looper) {
            super(looper);
        }
    }
}
