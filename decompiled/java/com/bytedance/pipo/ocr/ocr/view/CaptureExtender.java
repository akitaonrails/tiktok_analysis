package com.bytedance.pipo.ocr.ocr.view;

import X.ActivityC2186501Ahk;
import X.C1C7U;
import X.C2186511Ahl;
import X.C2186771AiB;
import X.C786410Ut5;
import X.InterfaceC848130XOx;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: loaded from: classes34.dex */
public final class CaptureExtender implements InterfaceC848130XOx {
    public final ActivityC2186501Ahk LIZ;
    public C2186511Ahl LIZIZ;

    @Override // X.InterfaceC848130XOx
    public final void LIZ() {
    }

    public final boolean LIZIZ() {
        return this.LIZ != null;
    }

    public class GestureListener implements View.OnTouchListener {
        public final Handler LL = new BPEAHandler(Looper.getMainLooper()) { // from class: com.bytedance.pipo.ocr.ocr.view.CaptureExtender.GestureListener.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C2186771AiB c2186771AiB;
                C1C7U.LIZ("CaptureExtender$GestureListener@da0e.<field>$1");
                super.handleMessage(message);
                if (CaptureExtender.this.LIZIZ() && (c2186771AiB = CaptureExtender.this.LIZ.LLJI.LL) != null && !c2186771AiB.LJI && c2186771AiB.LIZ != null && c2186771AiB.LJFF) {
                    c2186771AiB.LIZ.LIZIZ(c2186771AiB.LJIIL);
                }
                C1C7U.LIZIZ("CaptureExtender$GestureListener@da0e.<field>$1");
            }
        };
        public long LLILLJJLI;
        public float LLILLL;

        public GestureListener() {
        }

        public static float LIZ(MotionEvent motionEvent) {
            if (motionEvent.getPointerCount() >= 2) {
                float x = motionEvent.getX(0);
                float y = motionEvent.getY(0);
                float x2 = x - motionEvent.getX(1);
                float y2 = y - motionEvent.getY(1);
                return (float) Math.sqrt((x2 * x2) + (y2 * y2));
            }
            return -1.0f;
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (CaptureExtender.this.LIZIZ()) {
                CaptureExtender.this.LIZ.getClass();
            }
            int pointerCount = motionEvent.getPointerCount();
            if (pointerCount == 1) {
                if (motionEvent.getAction() == 0) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    long j = jElapsedRealtime - this.LLILLJJLI;
                    long j2 = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
                    if (j < j2) {
                        this.LL.removeMessages(1);
                        CaptureExtender.this.LIZ.LLLLZIL(3);
                    } else {
                        C786410Ut5.LJLJJI(1, j2, this.LL);
                    }
                    this.LLILLJJLI = jElapsedRealtime;
                }
            } else if (pointerCount >= 2) {
                int action = motionEvent.getAction() & 255;
                if (action != 2) {
                    if (action == 5) {
                        this.LLILLL = LIZ(motionEvent);
                        return true;
                    }
                } else {
                    float fLIZ = LIZ(motionEvent);
                    if (fLIZ == -1.0f) {
                        return false;
                    }
                    float f = this.LLILLL;
                    float f2 = 5;
                    if (fLIZ > f + f2) {
                        CaptureExtender.this.LIZ.LLLLZIL(1);
                    } else {
                        if (fLIZ >= f - f2) {
                            return false;
                        }
                        CaptureExtender.this.LIZ.LLLLZIL(2);
                    }
                    this.LLILLL = fLIZ;
                    return true;
                }
            }
            return true;
        }
    }

    public CaptureExtender(ActivityC2186501Ahk activityC2186501Ahk) {
        this.LIZ = activityC2186501Ahk;
    }
}
