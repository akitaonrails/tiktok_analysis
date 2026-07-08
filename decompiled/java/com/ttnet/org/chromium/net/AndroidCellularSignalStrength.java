package com.ttnet.org.chromium.net;

import J.N;
import X.C786410Ut5;
import X.C789940Uym;
import Y.ARunnableS113S0100000_13;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: loaded from: classes14.dex */
public class AndroidCellularSignalStrength {
    public static final AndroidCellularSignalStrength LIZIZ = new AndroidCellularSignalStrength();
    public volatile int LIZ = Integer.MIN_VALUE;

    public static int getSignalStrengthLevel() {
        return LIZIZ.LIZ;
    }

    public AndroidCellularSignalStrength() {
        C789940Uym.LIZ().getClass();
        if (N.MaSRwBiO()) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("AndroidCellularSignalStrength");
        handlerThread.start();
        C786410Ut5.LJJZZIII(new BPEAHandler(C786410Ut5.W2(handlerThread)), new ARunnableS113S0100000_13(this, 138));
    }
}
