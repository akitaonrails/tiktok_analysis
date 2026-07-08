package com.lynx.tasm.behavior;

import X.C1311440kEQ;
import X.C1C7U;
import X.C2188811AlT;
import X.InterfaceC1311480kEU;
import X.InterfaceC1311490kEV;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public final class GestureRecognizer {
    public static int LJIILIIL = ViewConfiguration.getLongPressTimeout();
    public static final int LJIILJJIL = ViewConfiguration.getTapTimeout();
    public int LIZ;
    public final Handler LIZIZ;
    public final InterfaceC1311490kEV LIZJ;
    public final InterfaceC1311480kEU LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public MotionEvent LJII;
    public MotionEvent LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;

    public final void LIZ() {
        this.LIZIZ.removeMessages(1);
        this.LIZIZ.removeMessages(2);
        this.LIZIZ.removeMessages(3);
        this.LJ = false;
        this.LJI = false;
        if (this.LJFF) {
            this.LJFF = false;
        }
    }

    public class GestureHandler extends BPEAHandler {
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("GestureRecognizer$GestureHandler@e4f2.handleMessage");
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        GestureRecognizer gestureRecognizer = GestureRecognizer.this;
                        InterfaceC1311480kEU interfaceC1311480kEU = gestureRecognizer.LIZLLL;
                        if (interfaceC1311480kEU != null && !gestureRecognizer.LJ) {
                            interfaceC1311480kEU.LIZIZ();
                        }
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Unknown message ");
                        sbLIZ.append(message);
                        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else {
                    GestureRecognizer gestureRecognizer2 = GestureRecognizer.this;
                    gestureRecognizer2.LIZIZ.removeMessages(3);
                    gestureRecognizer2.LJFF = true;
                    InterfaceC1311490kEV interfaceC1311490kEV = gestureRecognizer2.LIZJ;
                    ((C1311440kEQ) interfaceC1311490kEV).LIZ.LJIIJJI(gestureRecognizer2.LJII);
                }
            } else {
                GestureRecognizer.this.LIZJ.getClass();
            }
            C1C7U.LIZIZ("GestureRecognizer$GestureHandler@e4f2.handleMessage");
        }

        public GestureHandler(BPEAHandler bPEAHandler) {
            super(bPEAHandler.getLooper());
        }
    }

    public GestureRecognizer(s sVar, C1311440kEQ c1311440kEQ, BPEAHandler bPEAHandler) {
        boolean z;
        int scaledTouchSlop;
        if (sVar != null && sVar.getApplicationInfo().targetSdkVersion >= 8) {
            z = true;
        } else {
            z = false;
        }
        this.LIZIZ = new GestureHandler(bPEAHandler);
        this.LIZJ = c1311440kEQ;
        this.LIZLLL = c1311440kEQ;
        this.LJIIJJI = true;
        this.LJIIL = z;
        if (sVar == null) {
            scaledTouchSlop = ViewConfiguration.getTouchSlop();
        } else {
            scaledTouchSlop = ViewConfiguration.get(sVar).getScaledTouchSlop();
        }
        this.LIZ = scaledTouchSlop * scaledTouchSlop;
    }
}
