package com.ss.ttm.player;

import X.C0WZX;
import X.C1285020jXo;
import X.C1701340uNI;
import X.C2204961BRm;
import X.C786410Ut5;
import X.ChoreographerFrameCallbackC1700350uLh;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Message;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes27.dex */
public final class VsyncTimeHelper {
    public final WindowManager LIZ;
    public final ChoreographerFrameCallbackC1700350uLh LIZIZ;
    public final C1701340uNI LIZJ;
    public long LIZLLL;

    public final void LIZ() {
        Display displayLLILZIL = C2204961BRm.LLILZIL(this.LIZ, new C0WZX("dzBzEhEpEd7IWBkxSROdY+z0MxNm2cnF01+fVvFWo5W7", null));
        if (displayLLILZIL != null) {
            this.LIZLLL = (long) (1.0E9d / ((double) displayLLILZIL.getRefreshRate()));
        } else {
            this.LIZLLL = 62500000L;
        }
        ChoreographerFrameCallbackC1700350uLh choreographerFrameCallbackC1700350uLh = this.LIZIZ;
        choreographerFrameCallbackC1700350uLh.LLIZLLLIL.putLong("vsync", this.LIZLLL);
        Message messageObtainMessage = choreographerFrameCallbackC1700350uLh.LLIZ.obtainMessage(4);
        messageObtainMessage.setData(choreographerFrameCallbackC1700350uLh.LLIZLLLIL);
        messageObtainMessage.sendToTarget();
    }

    public void disable() {
        if (this.LIZ != null) {
            C1701340uNI c1701340uNI = this.LIZJ;
            if (c1701340uNI != null) {
                c1701340uNI.LL.unregisterDisplayListener(c1701340uNI);
            }
            C786410Ut5.LJLILLLLZI(this.LIZIZ.LLIZ, 1);
        }
    }

    public void enable() {
        if (this.LIZ != null) {
            C786410Ut5.LJLILLLLZI(this.LIZIZ.LLIZ, 0);
            C1701340uNI c1701340uNI = this.LIZJ;
            if (c1701340uNI != null) {
                c1701340uNI.LL.registerDisplayListener(c1701340uNI, null);
            }
            LIZ();
        }
    }

    public int getLowestUIFps() {
        return this.LIZIZ.LLILZLL;
    }

    public int getUIFps() {
        return this.LIZIZ.LLILZIL;
    }

    public long getVsyncDurationNs() {
        return this.LIZLLL;
    }

    public VsyncTimeHelper(TTPlayer tTPlayer) {
        Context contextN3;
        DisplayManager displayManager;
        C1701340uNI c1701340uNI = null;
        if (tTPlayer != null) {
            contextN3 = tTPlayer.LIZLLL;
        } else {
            contextN3 = null;
        }
        if (contextN3 != null) {
            contextN3 = C786410Ut5.N3(contextN3);
            this.LIZ = (WindowManager) C786410Ut5.H2(contextN3, "window");
        } else {
            this.LIZ = null;
        }
        if (this.LIZ != null) {
            if (C1285020jXo.LIZ >= 17 && (displayManager = (DisplayManager) C786410Ut5.H2(contextN3, "display")) != null) {
                c1701340uNI = new C1701340uNI(this, displayManager);
            }
            this.LIZJ = c1701340uNI;
            this.LIZIZ = ChoreographerFrameCallbackC1700350uLh.LLJIJIL;
        } else {
            this.LIZJ = null;
            this.LIZIZ = null;
        }
        this.LIZLLL = -9223372036854775807L;
    }
}
