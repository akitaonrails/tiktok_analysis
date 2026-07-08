package com.lynx.canvas.player;

import X.C786410Ut5;
import X.InterfaceC1304230k2n;
import X.InterfaceC1304250k2p;
import Y.ARunnableS4S1101000_20;
import android.content.Context;
import android.os.Looper;
import android.view.Surface;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.lynx.canvas.KryptonApp;
import com.lynx.canvas.SurfaceTextureWrapper;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class PlayerContext implements InterfaceC1304230k2n {
    public InterfaceC1304250k2p LIZ;
    public long LIZIZ;
    public final KryptonApp LIZJ;
    public final Context LJFF;
    public Looper LJI;
    public Map<String, String> LJII;
    public volatile boolean LJ = false;
    public double LIZLLL = 0.0d;

    public static native void nativeNotifyPlayerState(long j, int i, int[] iArr, String str);

    public double getCurrentTime() {
        InterfaceC1304250k2p interfaceC1304250k2p = this.LIZ;
        if (interfaceC1304250k2p == null) {
            return 0.0d;
        }
        return interfaceC1304250k2p.LIZLLL();
    }

    public boolean getLoop() {
        InterfaceC1304250k2p interfaceC1304250k2p = this.LIZ;
        if (interfaceC1304250k2p == null) {
            return false;
        }
        return interfaceC1304250k2p.LJIILJJIL();
    }

    public double getPlaybackRate() {
        InterfaceC1304250k2p interfaceC1304250k2p = this.LIZ;
        if (interfaceC1304250k2p == null) {
            return 1.0d;
        }
        return interfaceC1304250k2p.LJIIJ();
    }

    public void pause() {
        InterfaceC1304250k2p interfaceC1304250k2p = this.LIZ;
        if (interfaceC1304250k2p == null || !interfaceC1304250k2p.isPlaying()) {
            return;
        }
        this.LIZ.pause();
    }

    public void play() {
        InterfaceC1304250k2p interfaceC1304250k2p = this.LIZ;
        if (interfaceC1304250k2p == null) {
            return;
        }
        interfaceC1304250k2p.play();
    }

    public void release() {
        InterfaceC1304250k2p interfaceC1304250k2p = this.LIZ;
        if (interfaceC1304250k2p != null) {
            interfaceC1304250k2p.LJIILLIIL(null);
            this.LIZ.release();
            this.LIZ = null;
        }
        this.LIZIZ = 0L;
    }

    public final void LIZIZ(Object obj) {
        if (obj != null) {
            LIZ(2, obj.toString());
        } else {
            LIZ(2, "Internal error");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071 A[Catch: all -> 0x0087, TryCatch #0 {all -> 0x0087, blocks: (B:21:0x0065, B:23:0x0071, B:25:0x007b), top: B:43:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void load(java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.canvas.player.PlayerContext.load(java.lang.String):void");
    }

    public void setCurrentTime(double d) {
        if (this.LIZ != null && this.LJ) {
            this.LIZ.LJIIZILJ(d);
        } else {
            this.LIZLLL = d;
        }
    }

    public void setLoop(boolean z) {
        InterfaceC1304250k2p interfaceC1304250k2p = this.LIZ;
        if (interfaceC1304250k2p == null) {
            return;
        }
        interfaceC1304250k2p.setLooping(z);
    }

    public void setPlaybackRate(double d) {
        InterfaceC1304250k2p interfaceC1304250k2p = this.LIZ;
        if (interfaceC1304250k2p == null) {
            return;
        }
        interfaceC1304250k2p.LJFF(d);
    }

    public void setVolume(double d) {
        InterfaceC1304250k2p interfaceC1304250k2p = this.LIZ;
        if (interfaceC1304250k2p == null) {
            return;
        }
        interfaceC1304250k2p.LIZ(d);
    }

    public void setupSurface(SurfaceTextureWrapper surfaceTextureWrapper) {
        InterfaceC1304250k2p interfaceC1304250k2p = this.LIZ;
        if (surfaceTextureWrapper.LIZIZ == null) {
            surfaceTextureWrapper.LIZIZ = new Surface(surfaceTextureWrapper.LIZ);
        }
        interfaceC1304250k2p.setSurface(surfaceTextureWrapper.LIZIZ);
    }

    public final void LIZ(int i, String str) {
        C786410Ut5.LJJZZIII(new BPEAHandler(this.LJI), new ARunnableS4S1101000_20(i, str, this, 1));
    }

    public PlayerContext(long j, KryptonApp kryptonApp, Map<String, String> map) {
        this.LIZIZ = j;
        this.LIZJ = kryptonApp;
        this.LJFF = kryptonApp.LIZIZ;
        this.LJII = map;
    }

    public static PlayerContext create(long j, KryptonApp kryptonApp, Object obj) {
        return new PlayerContext(j, kryptonApp, (Map) obj);
    }
}
