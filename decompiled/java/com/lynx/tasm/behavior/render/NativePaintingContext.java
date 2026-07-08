package com.lynx.tasm.behavior.render;

import X.C1289430jev;
import X.C1310660kDA;
import X.InterfaceC1310280kCY;
import X.InterfaceC1312730kGV;
import android.view.MotionEvent;
import com.lynx.tasm.service.ILynxTextService;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public class NativePaintingContext implements InterfaceC1310280kCY {
    public long LIZ;
    public final PlatformRendererContext LIZIZ;
    public boolean LIZJ;
    public long LIZLLL;
    public s LJ;

    private native long nativeCreatePaintingContext(NativePaintingContext nativePaintingContext, long j, Object obj, long j2);

    public native void nativeDestroy(long j);

    public native boolean nativeDispatchPlatformInputEvent(long j, int[] iArr, float[] fArr);

    public native int[] nativeGetMeaningfulPaintingAreaRecords(long j);

    public native int nativeGetPlatformEventHandlerState(long j);

    public native void nativeSetLynxEngineActorForPlatformContextRef(long j, long j2);

    @Override // X.InterfaceC1310280kCY
    public final void destroy() {
        if (this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        long j = this.LIZ;
        if (j != 0) {
            nativeDestroy(j);
            this.LIZ = 0L;
        }
        PlatformRendererContext platformRendererContext = this.LIZIZ;
        if (!platformRendererContext.LJI) {
            platformRendererContext.LJI = true;
            long j2 = platformRendererContext.LJ;
            if (j2 != 0) {
                platformRendererContext.nativeDestroy(j2);
            }
            platformRendererContext.LJ = 0L;
            platformRendererContext.LIZIZ.clear();
            for (Object obj : platformRendererContext.LJII.values()) {
                if (obj instanceof InterfaceC1312730kGV) {
                    ((InterfaceC1312730kGV) obj).destroy();
                }
            }
            platformRendererContext.LJII.clear();
            platformRendererContext.LJIIIIZZ = null;
            platformRendererContext.LJFF = null;
            C1310660kDA c1310660kDA = platformRendererContext.LIZ.get();
            if (c1310660kDA != null) {
                c1310660kDA.clearNodeIndexImageMap();
            }
        }
        this.LIZLLL = 0L;
        this.LJ = null;
    }

    @Override // X.InterfaceC1310280kCY
    public final long LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1310280kCY
    public final void LIZIZ(long j) {
        long j2 = this.LIZ;
        if (j2 != 0 && !this.LIZJ) {
            nativeSetLynxEngineActorForPlatformContextRef(j2, j);
        }
    }

    @Override // X.InterfaceC1310280kCY
    public final boolean LIZJ(MotionEvent motionEvent) {
        if (this.LIZ == 0 || this.LIZJ) {
            return false;
        }
        int pointerCount = motionEvent.getPointerCount();
        int[] iArr = {0, motionEvent.getActionMasked(), motionEvent.getSource(), pointerCount};
        float[] fArr = new float[pointerCount * 3];
        for (int i = 0; i < pointerCount; i++) {
            int i2 = i * 3;
            fArr[i2] = motionEvent.getPointerId(i);
            fArr[i2 + 1] = motionEvent.getX(i);
            fArr[i2 + 2] = motionEvent.getY(i);
        }
        return nativeDispatchPlatformInputEvent(this.LIZ, iArr, fArr);
    }

    public NativePaintingContext(C1289430jev c1289430jev, s sVar, C1310660kDA c1310660kDA) {
        ILynxTextService iLynxTextService;
        PlatformRendererContext platformRendererContext = new PlatformRendererContext(c1289430jev, sVar, c1310660kDA);
        this.LIZIZ = platformRendererContext;
        this.LJ = sVar;
        if ((sVar.LLLIIIIL & 16) > 0 && (iLynxTextService = s.LLLILZ) != null) {
            this.LIZLLL = iLynxTextService.createTextLayoutAPI(sVar);
        }
        this.LIZ = nativeCreatePaintingContext(this, platformRendererContext.LJ, platformRendererContext.LJFF, this.LIZLLL);
    }
}
