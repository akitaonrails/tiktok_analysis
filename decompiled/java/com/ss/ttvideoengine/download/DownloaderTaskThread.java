package com.ss.ttvideoengine.download;

import X.C0V1E;
import X.C0VOH;
import X.C0VOT;
import X.C1C7U;
import X.C2187451AjH;
import X.C786410Ut5;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public final class DownloaderTaskThread {
    public final HandlerThread LIZ;
    public final AnonymousClass1 LIZIZ;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.ss.ttvideoengine.download.DownloaderTaskThread$1] */
    public DownloaderTaskThread() {
        try {
            HandlerThread handlerThread = new HandlerThread("vcloud.engine.download.tasks");
            this.LIZ = handlerThread;
            handlerThread.start();
            this.LIZIZ = new BPEAHandler(C786410Ut5.W2(handlerThread)) { // from class: com.ss.ttvideoengine.download.DownloaderTaskThread.1
                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    C0V1E c0v1e;
                    C1C7U.LIZ("DownloaderTaskThread@ae5b.<init>$1");
                    try {
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        int i = C2187451AjH.LIZ;
                        TTVideoEngineLog.d(th);
                    }
                    if (!(HandlerHook.getMessageObj(message.obj) instanceof ArrayList)) {
                        int i2 = C2187451AjH.LIZ;
                        TTVideoEngineLog.d("TTVideoEngine.Downloader", "[downloader] obj should instance of ArrayList");
                        C1C7U.LIZIZ("DownloaderTaskThread@ae5b.<init>$1");
                        return;
                    }
                    ArrayList arrayList = (ArrayList) HandlerHook.getMessageObj(message.obj);
                    C0VOT c0vot = (C0VOT) arrayList.get(0);
                    int i3 = message.what;
                    if (i3 != 10) {
                        if (i3 == 11 && arrayList.size() == 2 && (c0v1e = (C0V1E) arrayList.get(1)) != null) {
                            c0vot.LJFF(c0v1e.LIZ, c0v1e.LIZIZ);
                        }
                    } else {
                        c0vot.getClass();
                        C0VOH c0voh = new C0VOH(null, "TTVideoEngine_download_database_v01");
                        c0vot.LJI = c0voh;
                        if (!c0voh.LIZLLL) {
                            C1C7U.LIZIZ("DownloaderTaskThread@ae5b.<init>$1");
                            return;
                        } else {
                            int i4 = C2187451AjH.LIZ;
                            TTVideoEngineLog.d("TTVideoEngine.Downloader", "[downloader] open db success");
                            c0vot.LIZ();
                        }
                    }
                    C1C7U.LIZIZ("DownloaderTaskThread@ae5b.<init>$1");
                }
            };
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i = C2187451AjH.LIZ;
            TTVideoEngineLog.d(th);
            this.LIZ = null;
            this.LIZIZ = null;
        }
    }
}
