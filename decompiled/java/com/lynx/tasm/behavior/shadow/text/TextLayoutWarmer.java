package com.lynx.tasm.behavior.shadow.text;

import X.C0W9U;
import X.C1C7U;
import android.graphics.Picture;
import android.os.Looper;
import android.os.Message;
import android.text.Layout;
import ci3.a;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes14.dex */
public final class TextLayoutWarmer extends a {
    public TextLayoutWarmer() {
        super("TextLayoutWarmer", 10);
        start();
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
        try {
            super.onLooperPrepared();
            new WarmerHandler(Looper.myLooper());
            if (zLJ) {
                C0W9U.LJFF();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (zLJ) {
                C0W9U.LJFF();
            }
            throw th;
        }
    }

    public static final class WarmerHandler extends BPEAHandler {
        public final Picture LL;

        public WarmerHandler(Looper looper) {
            Picture picture;
            super(looper);
            try {
                picture = new Picture();
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                picture = null;
            }
            this.LL = picture;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("TextLayoutWarmer$WarmerHandler@a90c.handleMessage");
            if (this.LL == null) {
                C1C7U.LIZIZ("TextLayoutWarmer$WarmerHandler@a90c.handleMessage");
                return;
            }
            try {
                if (message.what == 0) {
                    Layout layout = (Layout) ((WeakReference) HandlerHook.getMessageObj(message.obj)).get();
                    if (layout == null) {
                        C1C7U.LIZIZ("TextLayoutWarmer$WarmerHandler@a90c.handleMessage");
                        return;
                    } else {
                        layout.draw(this.LL.beginRecording(layout.getWidth(), layout.getHeight()));
                        this.LL.endRecording();
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C1C7U.LIZIZ("TextLayoutWarmer$WarmerHandler@a90c.handleMessage");
        }
    }
}
