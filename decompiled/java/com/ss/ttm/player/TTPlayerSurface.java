package com.ss.ttm.player;

import X.C1285330jYJ;
import X.C1471100oNw;
import X.C2188811AlT;
import X.InterfaceC1471080oNu;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceControl;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes24.dex */
public class TTPlayerSurface {
    public static final AtomicLong LJI = new AtomicLong(0);
    public SurfaceControl LIZ;
    public Object LIZIZ;
    public long LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public int LJFF;
    public Surface mSurface;

    public final void LIZ() {
        if (Build.VERSION.SDK_INT < 29) {
            C1285330jYJ.LIZ(6, "sfc", this.LIZJ, "release surface not supported");
            return;
        }
        if (this.mSurface != null) {
            long j = this.LIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.mSurface);
            sbLIZ.append(" will release");
            C1285330jYJ.LIZ(4, "sfc", j, C2188811AlT.LIZIZ(sbLIZ));
            this.mSurface.release();
            this.mSurface = null;
        }
        if (this.LIZ != null) {
            long j2 = this.LIZJ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.LIZ);
            sbLIZ2.append(" will release");
            C1285330jYJ.LIZ(4, "sfc", j2, C2188811AlT.LIZIZ(sbLIZ2));
            this.LIZ.release();
            this.LIZ = null;
        }
    }

    public TTPlayerSurface() {
        if (Build.VERSION.SDK_INT >= 29) {
            SurfaceControl.Builder builder = new SurfaceControl.Builder();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TTPlayerVideoLayer-");
            sbLIZ.append(LJI.getAndIncrement());
            this.LIZ = builder.setName(C2188811AlT.LIZIZ(sbLIZ)).setBufferSize(0, 0).setFormat(1).build();
            this.mSurface = new Surface(this.LIZ);
            this.LIZLLL = true;
        } else {
            this.LIZ = null;
            this.mSurface = null;
            this.LIZLLL = false;
        }
        long j = this.LIZJ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this);
        sbLIZ2.append(" created.");
        C1285330jYJ.LIZ(3, "sfc", j, C2188811AlT.LIZIZ(sbLIZ2));
        this.LJ = 0;
        this.LJFF = 0;
    }

    public Surface getSurface() {
        return this.mSurface;
    }

    public boolean isValid() {
        return this.LIZLLL;
    }

    public final void LIZIZ(Object obj) {
        this.LIZIZ = obj;
        if (obj instanceof InterfaceC1471080oNu) {
            this.LIZJ = ((InterfaceC1471080oNu) obj).getNativeHandle();
        } else {
            this.LIZJ = 0L;
        }
    }

    public int nativeReparent(SurfaceControl surfaceControl, int i, int i2, boolean z) {
        return C1471100oNw.LIZIZ(this, surfaceControl, i, i2, z, this.LIZJ);
    }
}
