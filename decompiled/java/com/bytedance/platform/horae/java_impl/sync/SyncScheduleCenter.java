package com.bytedance.platform.horae.java_impl.sync;

import X.AnonymousClass0888;
import X.C088A;
import X.C1C7U;
import X.C2188811AlT;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class SyncScheduleCenter extends BPEAHandler {
    public SyncScheduleCenter(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("SyncScheduleCenter@2a4.handleMessage");
        super.handleMessage(message);
        if (message.what == 100) {
            if (HandlerHook.getMessageObj(message.obj) instanceof WeakReference) {
                Message message2 = (Message) ((Reference) HandlerHook.getMessageObj(message.obj)).get();
                if (message2 != null && message2.arg2 == 9527) {
                    C088A c088aLIZJ = C088A.LIZJ();
                    if (c088aLIZJ.LL != null) {
                        synchronized (C088A.LLJIJIL) {
                            try {
                                if (!((ArrayList) c088aLIZJ.LLILLL).contains(message2)) {
                                    ((ArrayList) c088aLIZJ.LLILLL).add(message2);
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(message2.what);
                        sbLIZ.append(" is delayed 5 seconds and put it into emergency list!");
                        C2188811AlT.LIZIZ(sbLIZ);
                        AnonymousClass0888.LIZ();
                    } else {
                        throw new RuntimeException("Must call start(Application context) first!!!");
                    }
                } else {
                    AnonymousClass0888.LIZ();
                }
            }
            C1C7U.LIZIZ("SyncScheduleCenter@2a4.handleMessage");
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("UnSupport message is ");
        sbLIZ2.append(message.what);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
