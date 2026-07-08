package com.ss.ttvideoengine.download;

import X.C0VOT;
import X.C0VOV;
import X.C1C7U;
import X.C2188811AlT;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import fyo.e;

/* JADX INFO: loaded from: classes14.dex */
public class DownloadTask$2 extends BPEAHandler {
    public final /* synthetic */ C0VOV LL;
    public final /* synthetic */ C0VOV LLILLJJLI;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("DownloadTask@c80e.initHandle$1");
        if (message == null) {
            C1C7U.LIZIZ("DownloadTask@c80e.initHandle$1");
            return;
        }
        if (this.LL == null) {
            C1C7U.LIZIZ("DownloadTask@c80e.initHandle$1");
            return;
        }
        super.handleMessage(message);
        int i = message.what;
        if (i == 111) {
            this.LL.LJIIIIZZ(0);
            C0VOV c0vov = this.LL;
            C0VOT c0vot = c0vov.LJIILJJIL;
            if (c0vot != null) {
                c0vot.LIZJ.remove(c0vov);
                c0vot.LJFF.remove(Long.valueOf(c0vov.LIZIZ));
                c0vot.LIZLLL.remove(c0vov);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("task info: ");
                sbLIZ.append(c0vov.toString());
                c0vov.LJI(new e("kTTVideoErrorDomainDownload", -9995, 0, C2188811AlT.LIZIZ(sbLIZ)));
            }
        } else if (i == 112) {
            this.LL.LJI = (e) HandlerHook.getMessageObj(message.obj);
            if (!this.LLILLJJLI.LIZ(this.LL.LJI)) {
                this.LL.LJIIIIZZ(5);
            }
            C0VOV c0vov2 = this.LL;
            C0VOT c0vot2 = c0vov2.LJIILJJIL;
            if (c0vot2 != null) {
                c0vot2.LIZIZ(c0vov2, c0vov2.LJI);
            }
        } else if (i == 113) {
            C0VOV c0vov3 = this.LL;
            c0vov3.LJI = null;
            c0vov3.LJIIIIZZ(5);
            C0VOV c0vov4 = this.LL;
            C0VOT c0vot3 = c0vov4.LJIILJJIL;
            if (c0vot3 != null) {
                c0vot3.LIZIZ(c0vov4, null);
            }
        }
        C1C7U.LIZIZ("DownloadTask@c80e.initHandle$1");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadTask$2(C0VOV c0vov, Looper looper, C0VOV c0vov2) {
        super(looper);
        this.LLILLJJLI = c0vov;
        this.LL = c0vov2;
    }
}
