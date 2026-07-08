package com.ss.avframework.livestreamv2.core.interact.video.render;

import X.C1274780jHI;
import X.C1274920jHW;
import X.C1275030jHh;
import X.C1275200jHy;
import X.C1275800jIw;
import X.C2188811AlT;
import X.InterfaceC1274490jGp;
import X.InterfaceC1275190jHx;
import X.InterfaceC1275840jJ0;
import X.RunnableC1275220jI0;
import android.content.Context;
import android.opengl.EGLContext;
import android.view.View;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.lyraxwrapper.LyraxVideoFrameWrapper;
import com.ss.lyrax.subscriber.LyraxVideoRenderConfig;
import com.ss.lyrax.video.ILyraxVideoRenderer;
import com.ss.ttlivestreamer.core.abnormal_detect.TTLHAbnormalDetectorJava;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxVideoRendererWrapper implements ILyraxVideoRenderer {
    public boolean LIZIZ;
    public final int LIZJ;
    public int LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final long LJI;
    public final boolean LJII;
    public long LJIIIIZZ;
    public float LJIIIZ;
    public final C1274780jHI LJIIJ;
    public final C1275030jHh LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;
    public final Context LJIILJJIL;
    public final boolean LJIILL;
    public boolean LJIILLIIL;
    public int LJIIZILJ;
    public InterfaceC1275190jHx LJIJ;
    public InterfaceC1275190jHx LJIJI;
    public volatile boolean LJIJJ;
    public volatile boolean LJIJJLI;
    public View LJIL;
    public LyraxVideoRenderConfig LJJ;
    public InterfaceC1275840jJ0 LJJI;
    public long LJJII;
    public long LJJIII;
    public int LJJIIJ;
    public int LJJIIJZLJL;
    public long LJJIIZ;
    public boolean LIZ = true;
    public final AtomicReference<TTLHAbnormalDetectorJava> LJJIFFI = new AtomicReference<>(null);
    public final Object LJJIIZI = new Object();
    public volatile boolean LJJIJ = true;
    public volatile boolean LJJIJIIJI = true;
    public volatile boolean LJJIJIIJIL = false;

    public static native void nativeOnRenderFrameCompleted(long j, int i, int i2, int i3, long j2);

    public final synchronized String LJ() {
        LyraxVideoRenderConfig lyraxVideoRenderConfig;
        lyraxVideoRenderConfig = this.LJJ;
        return lyraxVideoRenderConfig == null ? "null" : lyraxVideoRenderConfig.renderId;
    }

    public final synchronized InterfaceC1275190jHx LJIIIIZZ() {
        return LJIIJ() ? this.LJIJI : this.LJIJ;
    }

    @Override // com.ss.lyrax.video.ILyraxVideoRenderer
    public final synchronized LyraxVideoRenderConfig getConfig() {
        LyraxVideoRenderConfig lyraxVideoRenderConfig = this.LJJ;
        if (lyraxVideoRenderConfig == null) {
            return null;
        }
        return new LyraxVideoRenderConfig(lyraxVideoRenderConfig.renderId);
    }

    @Override // com.ss.lyrax.video.ILyraxVideoRenderer
    public final int getRenderElapse() {
        InterfaceC1275190jHx interfaceC1275190jHxLJIIIIZZ;
        synchronized (this) {
            interfaceC1275190jHxLJIIIIZZ = LJIIIIZZ();
        }
        if (interfaceC1275190jHxLJIIIIZZ != null) {
            return (int) interfaceC1275190jHxLJIIIIZZ.getLatestRenderCostMs();
        }
        return 0;
    }

    @Override // com.ss.lyrax.video.ILyraxVideoRenderer
    public final View getRenderTargetView() {
        View view;
        synchronized (this) {
            view = this.LJIL;
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e A[PHI: r5
      0x002e: PHI (r5v3 X.0jHx) = (r5v1 X.0jHx), (r5v0 X.0jHx) binds: [B:22:0x0038, B:16:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.lyrax.video.ILyraxVideoRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void release() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.LIZIZ     // Catch: java.lang.Throwable -> L41
            r5 = 0
            if (r0 != 0) goto L1a
            r0 = 1
            r6.LIZIZ = r0     // Catch: java.lang.Throwable -> L41
            r0 = 0
            r6.LIZ = r0     // Catch: java.lang.Throwable -> L41
            r6.LJJ = r5     // Catch: java.lang.Throwable -> L41
            r6.LJJI = r5     // Catch: java.lang.Throwable -> L41
            X.0jHx r4 = r6.LJIJ     // Catch: java.lang.Throwable -> L41
            X.0jHx r3 = r6.LJIJI     // Catch: java.lang.Throwable -> L41
            r6.LJIJ = r5     // Catch: java.lang.Throwable -> L41
            r6.LJIJI = r5     // Catch: java.lang.Throwable -> L41
        L18:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L41
            goto L1d
        L1a:
            r4 = r5
            r3 = r5
            goto L18
        L1d:
            java.lang.Object r2 = r6.LJJIIZI
            monitor-enter(r2)
            r0 = 0
            r6.LJJIIZ = r0     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3b
            java.util.concurrent.atomic.AtomicReference<com.ss.ttlivestreamer.core.abnormal_detect.TTLHAbnormalDetectorJava> r0 = r6.LJJIFFI
            r0.set(r5)
            if (r4 == 0) goto L37
            if (r4 != r3) goto L37
        L2e:
            r4.release()
        L31:
            if (r5 == 0) goto L36
            r5.release()
        L36:
            return
        L37:
            r5 = r3
            if (r4 == 0) goto L31
            goto L2e
        L3b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3b
            throw r0
        L41:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L41
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L41
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.core.interact.video.render.LyraxVideoRendererWrapper.release():void");
    }

    @Override // com.ss.lyrax.video.ILyraxVideoRenderer
    public final /* synthetic */ void setRenderTargetWindow(View view) {
        C1275800jIw.LJIIIIZZ(this, view);
    }

    public final boolean LJIIJ() {
        LyraxVideoRenderConfig lyraxVideoRenderConfig;
        String str;
        int iValue;
        if (!this.LJIJJ || (lyraxVideoRenderConfig = this.LJJ) == null || (str = lyraxVideoRenderConfig.renderId) == null || str.isEmpty()) {
            return false;
        }
        int iLastIndexOf = str.lastIndexOf(95);
        if (iLastIndexOf <= 0 || iLastIndexOf >= str.length() - 1) {
            iValue = StreamIndex.STREAM_INDEX_MAIN.value();
        } else {
            try {
                iValue = CastIntegerProtector.parseInt(str.substring(iLastIndexOf + 1));
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                iValue = StreamIndex.STREAM_INDEX_MAIN.value();
            }
        }
        if (iValue == StreamIndex.STREAM_INDEX_MAIN.value()) {
            return true;
        }
        return this.LJIJJLI;
    }

    public final void LJIIJJI() {
        InterfaceC1275190jHx interfaceC1275190jHx;
        InterfaceC1275190jHx interfaceC1275190jHx2;
        InterfaceC1274490jGp interfaceC1274490jGpLIZJ;
        InterfaceC1274490jGp interfaceC1274490jGpLIZJ2;
        boolean z = this.LJJIJIIJI;
        synchronized (this) {
            try {
                interfaceC1275190jHx = this.LJIJ;
                interfaceC1275190jHx2 = this.LJIJI;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (interfaceC1275190jHx != null && (interfaceC1274490jGpLIZJ2 = interfaceC1275190jHx.LIZJ()) != null) {
            interfaceC1274490jGpLIZJ2.setEnable(z);
        }
        if (interfaceC1275190jHx2 == null || (interfaceC1274490jGpLIZJ = interfaceC1275190jHx2.LIZJ()) == null) {
            return;
        }
        interfaceC1274490jGpLIZJ.setEnable(z);
    }

    public LyraxVideoRendererWrapper(C1275200jHy c1275200jHy) {
        this.LJIILJJIL = c1275200jHy.LIZ;
        boolean z = c1275200jHy.LIZIZ;
        this.LIZJ = 0;
        this.LJIILL = c1275200jHy.LIZJ;
        this.LJIIL = c1275200jHy.LIZLLL;
        this.LJIILIIL = c1275200jHy.LJ;
        this.LIZIZ = false;
        this.LIZLLL = 0;
        this.LJIIJ = c1275200jHy.LJIIIZ;
        this.LJIIJJI = c1275200jHy.LJIIJ;
        this.LJ = c1275200jHy.LJFF;
        this.LJFF = c1275200jHy.LJI;
        this.LJI = c1275200jHy.LJII;
        this.LJII = c1275200jHy.LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(" rtcDeliverType:");
        sbLIZ.append(0);
        sbLIZ.append(" useTextureView:");
        sbLIZ.append(z);
        AVLog.iow("LyraxVideoRendererWrapper", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static String LIZJ(EGLContext eGLContext) {
        if (eGLContext == null) {
            return "null";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(eGLContext);
        sbLIZ.append("/native=");
        sbLIZ.append(eGLContext.getNativeHandle());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZLLL(float[] fArr) {
        if (fArr == null) {
            return "null";
        }
        if (fArr.length < 16) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invalid_len_");
            sbLIZ.append(fArr.length);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("m0=");
        sbLIZ2.append(fArr[0]);
        sbLIZ2.append(",m5=");
        sbLIZ2.append(fArr[5]);
        sbLIZ2.append(",m12=");
        sbLIZ2.append(fArr[12]);
        sbLIZ2.append(",m13=");
        sbLIZ2.append(fArr[13]);
        sbLIZ2.append(",m15=");
        sbLIZ2.append(fArr[15]);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static String LJFF(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("0x");
        sbLIZ.append(Integer.toHexString(i));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final RunnableC1275220jI0 LIZ(LyraxVideoFrameWrapper lyraxVideoFrameWrapper) {
        return new RunnableC1275220jI0(this, lyraxVideoFrameWrapper.getWidth(), lyraxVideoFrameWrapper.getHeight(), lyraxVideoFrameWrapper.getRotation().value(), lyraxVideoFrameWrapper.getTimeStampUs() / 1000);
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x050e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.ss.bytertc.engine.lyraxwrapper.LyraxVideoFrameWrapper r34) {
        /*
            Method dump skipped, instruction units count: 1534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.core.interact.video.render.LyraxVideoRendererWrapper.LIZIZ(com.ss.bytertc.engine.lyraxwrapper.LyraxVideoFrameWrapper):void");
    }

    public final void LJI(LyraxVideoFrameWrapper lyraxVideoFrameWrapper) {
        InterfaceC1275840jJ0 interfaceC1275840jJ0;
        if (this.LIZ && !this.LIZIZ) {
            try {
                synchronized (this) {
                    interfaceC1275840jJ0 = this.LJJI;
                }
                if (interfaceC1275840jJ0 != null && !((C1274920jHW) interfaceC1275840jJ0).LIZ(this, lyraxVideoFrameWrapper)) {
                    return;
                }
                LIZIZ(lyraxVideoFrameWrapper);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                AVLog.ioe("LyraxVideoRendererWrapper", "onFrame error", th);
            }
        }
    }

    public final void LJII(InterfaceC1275190jHx interfaceC1275190jHx) {
        int i;
        InterfaceC1274490jGp interfaceC1274490jGpLIZJ;
        if (interfaceC1275190jHx != null && (interfaceC1274490jGpLIZJ = interfaceC1275190jHx.LIZJ()) != null && interfaceC1274490jGpLIZJ.LJJLIIIIJ()) {
            i = 1;
        } else {
            i = 0;
        }
        this.LJIIZILJ = i;
    }

    @Override // com.ss.lyrax.video.ILyraxVideoRenderer
    public final void initConfig(LyraxVideoRenderConfig lyraxVideoRenderConfig) {
        synchronized (this) {
            try {
                if (!this.LIZIZ && lyraxVideoRenderConfig != null) {
                    this.LJJ = new LyraxVideoRenderConfig(lyraxVideoRenderConfig.renderId);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0014  */
    @Override // com.ss.lyrax.video.ILyraxVideoRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void renderFrame(com.ss.lyrax.video.LyraxVideoFrame r2) {
        /*
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            monitor-enter(r1)
            com.ss.lyrax.subscriber.LyraxVideoRenderConfig r0 = r1.LJJ     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L14
            java.lang.String r0 = r0.renderId     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L14
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            monitor-exit(r1)
            if (r0 != 0) goto L19
            return
        L19:
            com.ss.bytertc.engine.lyraxwrapper.LyraxVideoFrameWrapper r0 = new com.ss.bytertc.engine.lyraxwrapper.LyraxVideoFrameWrapper
            r0.<init>(r2)
            r1.LJI(r0)
            return
        L22:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.core.interact.video.render.LyraxVideoRendererWrapper.renderFrame(com.ss.lyrax.video.LyraxVideoFrame):void");
    }

    @Override // com.ss.lyrax.video.ILyraxVideoRenderer
    public final void setEnableSingleView(boolean z) {
        this.LJIJJ = z;
        LJII(LJIIIIZZ());
        LJIIJJI();
    }

    @Override // com.ss.lyrax.video.ILyraxVideoRenderer
    public final void setRenderEventCallback(long j) {
        synchronized (this.LJJIIZI) {
            try {
                this.LJJIIZ = j;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.lyrax.video.ILyraxVideoRenderer
    public final void setRenderTargetView(View view) {
        View view2;
        InterfaceC1275190jHx interfaceC1275190jHx;
        InterfaceC1275190jHx interfaceC1275190jHx2;
        synchronized (this) {
            try {
                view2 = this.LJIL;
                this.LJIL = view;
                interfaceC1275190jHx = this.LJIJ;
                interfaceC1275190jHx2 = this.LJIJI;
                if (interfaceC1275190jHx != null) {
                    interfaceC1275190jHx.setRenderTargetWindow(view);
                }
                if (interfaceC1275190jHx2 != null) {
                    interfaceC1275190jHx2.setRenderTargetWindow(view);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setRenderTargetView targetView=");
        sbLIZ.append(view);
        sbLIZ.append(", oldTargetView=");
        sbLIZ.append(view2);
        sbLIZ.append(", normalProcessor=");
        sbLIZ.append(interfaceC1275190jHx);
        sbLIZ.append(", singleViewProcessor=");
        sbLIZ.append(interfaceC1275190jHx2);
        sbLIZ.append(", renderConfig=");
        sbLIZ.append(this.LJJ);
        AVLog.ioi("LyraxVideoRendererWrapper", C2188811AlT.LIZIZ(sbLIZ));
        LJII(LJIIIIZZ());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002b A[PHI: r6
      0x002b: PHI (r6v3 X.0jHx) = (r6v1 X.0jHx), (r6v0 X.0jHx) binds: [B:36:0x0088, B:20:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(X.InterfaceC1275190jHx r8, X.InterfaceC1275190jHx r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.LIZIZ     // Catch: java.lang.Throwable -> Lae
            r6 = 0
            r3 = 0
            if (r0 == 0) goto Lc
            r5 = r8
            r2 = r9
            r4 = r6
            r1 = 0
            goto L1f
        Lc:
            X.0jHx r5 = r7.LJIJ     // Catch: java.lang.Throwable -> Lae
            r1 = 1
            if (r5 == r8) goto L15
            r7.LJIJ = r8     // Catch: java.lang.Throwable -> Lae
            r0 = 1
            goto L17
        L15:
            r5 = r6
            r0 = 0
        L17:
            X.0jHx r2 = r7.LJIJI     // Catch: java.lang.Throwable -> Lae
            if (r2 == r9) goto L21
            r7.LJIJI = r9     // Catch: java.lang.Throwable -> Lae
        L1d:
            android.view.View r4 = r7.LJIL     // Catch: java.lang.Throwable -> Lae
        L1f:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lae
            goto L27
        L21:
            r2 = r6
            r1 = r0
            if (r0 != 0) goto L1d
            r4 = r6
            goto L1f
        L27:
            if (r5 == 0) goto L87
            if (r5 != r2) goto L87
        L2b:
            r5.release()
        L2e:
            if (r6 == 0) goto L33
            r6.release()
        L33:
            if (r1 == 0) goto Lad
            java.lang.String r2 = "LyraxVideoRendererWrapper"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "setFrameProcessors normalProcessor="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", singleViewProcessor="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ", oldNormal="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", oldSingleView="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", renderTargetView="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", renderConfig="
            r1.append(r0)
            com.ss.lyrax.subscriber.LyraxVideoRenderConfig r0 = r7.LJJ
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            com.ss.ttlivestreamer.core.utils.AVLog.ioi(r2, r0)
            if (r8 == 0) goto L7b
            if (r4 == 0) goto L7b
            r8.setRenderTargetWindow(r4)
        L7b:
            if (r9 == 0) goto L82
            if (r4 == 0) goto L82
            r9.setRenderTargetWindow(r4)
        L82:
            boolean r0 = r7.LJIILIIL
            if (r0 == 0) goto La3
            goto L8b
        L87:
            r6 = r2
            if (r5 == 0) goto L2e
            goto L2b
        L8b:
            android.content.Context r0 = r7.LJIILJJIL     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto La3
            boolean r0 = com.ss.ttlivestreamer.core.opengl.GlUtil.isGLES3Support(r0)     // Catch: java.lang.Throwable -> L96
            r7.LJIILLIIL = r0     // Catch: java.lang.Throwable -> L96
            goto La3
        L96:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.String r1 = "LyraxVideoRendererWrapper"
            java.lang.String r0 = "refreshGles3Support error"
            com.ss.ttlivestreamer.core.utils.AVLog.ioe(r1, r0, r2)
            r7.LJIILLIIL = r3
        La3:
            X.0jHx r0 = r7.LJIIIIZZ()
            r7.LJII(r0)
            r7.LJIIJJI()
        Lad:
            return
        Lae:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lae
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.core.interact.video.render.LyraxVideoRendererWrapper.LJIIIZ(X.0jHx, X.0jHx):void");
    }
}
