package com.ss.android.vesdk.proxy;

import X.C1C7U;
import X.C1D40;
import X.C1DMH;
import X.C2188811AlT;
import X.C2254321DLi;
import X.C2254451DLv;
import X.C2484209oO;
import X.C786410Ut5;
import X.EnumC12975055x;
import X.InterfaceC2254511DMb;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.model.VETrackParams;
import com.ss.android.ttve.nativePort.TEBundle;
import com.ss.android.vesdk.VEDuetSettings;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import com.ss.android.vesdk.k;

/* JADX INFO: loaded from: classes36.dex */
public class TEDuetProxy implements C1DMH, InterfaceC2254511DMb {
    public Runnable LIZ;
    public k LIZIZ;
    public final VEDuetSettings LIZJ;
    public VESize LIZLLL;
    public VESize LJ = new VESize(0, 0);
    public int LJFF = -1;
    public int LJI = -1;
    public int LJII = -1;
    public int LJIIIIZZ = -1;
    public int LJIIIZ = -1;
    public int LJIIJ = -1;
    public final Handler LJIIJJI = new BPEAHandler(Looper.getMainLooper()) { // from class: com.ss.android.vesdk.proxy.TEDuetProxy.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("TEDuetProxy@c338.<field>$1");
            super.handleMessage(message);
            TEDuetProxy.this.LIZ(message);
            C1C7U.LIZIZ("TEDuetProxy@c338.<field>$1");
        }
    };

    @Override // X.C1DMH
    public final void LIZIZ() {
    }

    @Override // X.C1DMY
    public final void LJ(int i) {
    }

    public int[] LJFF() {
        return new int[]{0, 1, 2};
    }

    @Override // X.C1DMY
    public final void LJI(boolean z) {
    }

    public void LJIIIZ() {
        VEVideoTransformFilterParam vEVideoTransformFilterParam = new VEVideoTransformFilterParam();
        vEVideoTransformFilterParam.filterName = "canvas blend";
        vEVideoTransformFilterParam.scaleFactor = 1.0f;
        vEVideoTransformFilterParam.transX = -0.25f;
        vEVideoTransformFilterParam.alpha = 1.0f;
        this.LJIIIZ = this.LIZIZ.LJJIZ.addTrackFilter(0, 0, vEVideoTransformFilterParam, -1, -1);
    }

    public void LJIILIIL(EnumC12975055x enumC12975055x) {
    }

    @Override // X.C1DMH
    public final void LJJIJIIJIL() {
    }

    @Override // X.C1DMH
    public final void LIZLLL() {
        long jLJIILL = this.LIZIZ.LJIILL();
        this.LIZIZ.LJIIIIZZ(this.LJI, 1, -1, 0);
        this.LIZIZ.LJJIIJZLJL(this.LJI, 1, jLJIILL);
        this.LIZIZ.LJIIIIZZ(this.LJI, 1, 1, 0);
    }

    public void LJII() {
        this.LIZIZ.LIZ(this);
        VESize vESize = this.LIZLLL;
        int i = vESize.width;
        int i2 = vESize.height;
        int i3 = i2 / 2;
        VESize vESize2 = this.LJ;
        int iSqrt = (((int) (Math.sqrt(((double) (i2 * i)) / (((double) (i * i3)) * 1.0d)) * ((double) i))) >> 4) << 4;
        int i4 = (i3 * iSqrt) / i;
        int i5 = ((i4 >> 4) + ((i4 & 15) >> 3)) << 4;
        vESize2.width = iSqrt;
        vESize2.height = i5;
        if (i5 > 1088) {
            vESize2.width = (((iSqrt * 1088) / i5) >> 4) << 4;
            vESize2.height = 1088;
        }
        k kVar = this.LIZIZ;
        VESize vESize3 = this.LJ;
        kVar.LJIIJJI(vESize3.width, vESize3.height);
        String duetAudioPath = this.LIZJ.getDuetAudioPath();
        C2254451DLv c2254451DLv = new C2254451DLv();
        c2254451DLv.LIZ(duetAudioPath);
        c2254451DLv.LIZLLL();
        c2254451DLv.LJ(0);
        c2254451DLv.LJFF(-1);
        C1D40 c1d40 = C1D40.External;
        VETrackParams vETrackParams = c2254451DLv.LIZ;
        vETrackParams.trackPriority = c1d40;
        this.LJI = this.LIZIZ.LJII(1, vETrackParams, true);
        String duetVideoPath = this.LIZJ.getDuetVideoPath();
        C2254451DLv c2254451DLv2 = new C2254451DLv();
        c2254451DLv2.LIZ(duetVideoPath);
        c2254451DLv2.LIZLLL();
        c2254451DLv2.LJ(0);
        c2254451DLv2.LJFF(-1);
        int i6 = LJFF()[1];
        VETrackParams vETrackParams2 = c2254451DLv2.LIZ;
        vETrackParams2.layer = i6;
        vETrackParams2.trackPriority = c1d40;
        this.LJII = this.LIZIZ.LJII(0, vETrackParams2, true);
        long jLJIILL = this.LIZIZ.LJIILL();
        this.LIZIZ.LJJIIJZLJL(this.LJII, 0, jLJIILL);
        LJIIJ(this.LJII);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("add vTrack: ");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", seek time=");
        sbLIZ.append(jLJIILL);
        C2484209oO.LJI("TEDuetProxy", C2188811AlT.LIZIZ(sbLIZ));
        LJIIJJI();
        long jLJIILL2 = this.LIZIZ.LJIILL();
        this.LIZIZ.LJJIIJZLJL(this.LJI, 1, jLJIILL2);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("add aTrack: ");
        sbLIZ2.append(this.LJI);
        sbLIZ2.append(", seek time=");
        sbLIZ2.append(jLJIILL2);
        C2484209oO.LJI("TEDuetProxy", C2188811AlT.LIZIZ(sbLIZ2));
        LJIIL();
        LJIILIIL(this.LIZJ.getDuetLayout());
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Track bg=");
        sbLIZ3.append(this.LJFF);
        sbLIZ3.append(", left=");
        sbLIZ3.append(0);
        sbLIZ3.append(", right=");
        sbLIZ3.append(this.LJII);
        sbLIZ3.append(", src size=");
        sbLIZ3.append(this.LIZLLL.width);
        sbLIZ3.append("x");
        sbLIZ3.append(this.LIZLLL.height);
        sbLIZ3.append(", dst size=");
        sbLIZ3.append(this.LJ.width);
        sbLIZ3.append("x");
        sbLIZ3.append(this.LJ.height);
        C2484209oO.LJI("TEDuetProxy", C2188811AlT.LIZIZ(sbLIZ3));
    }

    public final void LJIIJJI() {
        int iLJIIIIZZ = this.LIZIZ.LJIIIIZZ(this.LJI, 1, 1, 0);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aTrack(");
        sbLIZ.append(this.LJI);
        sbLIZ.append(") alignTo camera track ret=");
        sbLIZ.append(iLJIIIIZZ);
        C2484209oO.LJI("TEDuetProxy", C2188811AlT.LIZIZ(sbLIZ));
        if (iLJIIIIZZ < 0) {
            int iLJIIIIZZ2 = this.LIZIZ.LJIIIIZZ(this.LJII, 0, 1, 0);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("vTrack(");
            sbLIZ2.append(this.LJII);
            sbLIZ2.append(") alignTo camera track ret=");
            sbLIZ2.append(iLJIIIIZZ2);
            C2484209oO.LJI("TEDuetProxy", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        int iLJIIIIZZ3 = this.LIZIZ.LJIIIIZZ(this.LJII, 0, this.LJI, 1);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("vTrack(");
        sbLIZ3.append(this.LJII);
        sbLIZ3.append(") alignTo aTrack(");
        sbLIZ3.append(this.LJI);
        sbLIZ3.append(") ret=");
        sbLIZ3.append(iLJIIIIZZ3);
        C2484209oO.LJI("TEDuetProxy", C2188811AlT.LIZIZ(sbLIZ3));
    }

    public final void LJIIL() {
        C2254451DLv c2254451DLv = new C2254451DLv();
        c2254451DLv.LIZ("camera_path");
        c2254451DLv.LIZLLL();
        c2254451DLv.LJ(0);
        c2254451DLv.LJFF(Integer.MAX_VALUE);
        c2254451DLv.LIZIZ(0);
        c2254451DLv.LIZJ(Integer.MAX_VALUE);
        int i = LJFF()[2];
        VETrackParams vETrackParams = c2254451DLv.LIZ;
        vETrackParams.layer = i;
        vETrackParams.trackPriority = C1D40.External;
        k kVar = this.LIZIZ;
        kVar.getClass();
        TEBundle tEBundleLIZ = C2254321DLi.LIZ(vETrackParams);
        tEBundleLIZ.setInt("TrackIndex", 0);
        tEBundleLIZ.setInt("TrackType", 0);
        tEBundleLIZ.setBool("UpdateTimeline", true);
        kVar.LJJJ.LJIL("UpdateTrack", tEBundleLIZ);
        C2484209oO.LJI("TEDuetProxy", "update camera Track");
        LJIIIZ();
    }

    @Override // X.C1DMH
    public void onDestroy() {
        int i = this.LJIIIZ;
        if (i >= 0) {
            this.LIZIZ.LJJIZ.removeTrackFilter(i);
            this.LJIIIZ = -1;
        }
        int i2 = this.LJIIIIZZ;
        if (i2 >= 0) {
            this.LIZIZ.LJJIZ.removeTrackFilter(i2);
            this.LJIIIIZZ = -1;
        }
        this.LIZIZ.LJJIIJ(1, this.LJI, true);
        this.LIZIZ.LJJIIJ(0, this.LJII, true);
        int i3 = this.LJFF;
        if (i3 >= 0) {
            this.LIZIZ.LJJIIJ(0, i3, true);
            this.LJFF = -1;
        }
        this.LIZIZ.LIZLLL(this);
        k kVar = this.LIZIZ;
        VESize vESize = this.LIZLLL;
        kVar.LJIIJJI(vESize.width, vESize.height);
        this.LIZIZ = null;
        synchronized (this) {
            try {
                this.LIZ = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C2484209oO.LJI("TEDuetProxy", "onDestroy");
    }

    public TEDuetProxy() {
    }

    public void LIZ(Message message) {
        int i = message.what;
        int i2 = message.arg2;
        if (i == VEInfo.TE_INFO_MULTIPLE_TRACK_EOF && Integer.MIN_VALUE == (i2 & Integer.MIN_VALUE)) {
            int i3 = i2 & Integer.MAX_VALUE;
            if (1 != 0) {
                synchronized (this) {
                    try {
                        Runnable runnable = this.LIZ;
                        if (runnable != null) {
                            runnable.run();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("timeInMS=");
                sbLIZ.append(i3);
                sbLIZ.append(", eof=");
                sbLIZ.append(true);
                C2484209oO.LJI("TEDuetProxy", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    @Override // X.C1DMH
    public final void LIZJ(float f) {
        float f2 = 1.0f / f;
        this.LIZIZ.LJJIJIIJI(f2, this.LJI, 1);
        this.LIZIZ.LJJIJIIJI(f2, this.LJII, 0);
    }

    public final void LJIIIIZZ(Runnable runnable) {
        synchronized (this) {
            try {
                this.LIZ = runnable;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void LJIIJ(int i) {
        VEVideoTransformFilterParam vEVideoTransformFilterParam = new VEVideoTransformFilterParam();
        vEVideoTransformFilterParam.filterName = "canvas blend";
        vEVideoTransformFilterParam.scaleFactor = 1.0f;
        vEVideoTransformFilterParam.transX = 0.25f;
        vEVideoTransformFilterParam.alpha = 1.0f;
        int i2 = this.LJIIJ;
        if (i2 >= 0) {
            this.LIZIZ.LJJIZ.updateTrackFilterParam(i2, vEVideoTransformFilterParam);
        } else {
            this.LJIIJ = this.LIZIZ.LJJIZ.addTrackFilter(0, i, vEVideoTransformFilterParam, -1, -1);
        }
    }

    public TEDuetProxy(k kVar, VEDuetSettings vEDuetSettings, VESize vESize) {
        this.LIZIZ = kVar;
        this.LIZJ = vEDuetSettings;
        this.LIZLLL = new VESize(vESize.width, vESize.height);
    }

    @Override // X.InterfaceC2254511DMb
    public final void onInfo(int i, int i2, String str) {
        Handler handler = this.LJIIJJI;
        C786410Ut5.LJLJJLL(handler, handler.obtainMessage(i, i, i2, str));
    }
}
