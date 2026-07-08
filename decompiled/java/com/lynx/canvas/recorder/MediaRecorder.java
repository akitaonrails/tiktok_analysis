package com.lynx.canvas.recorder;

import X.C1286000jZO;
import X.C1288370jdD;
import X.C2188811AlT;
import X.InterfaceC1286120jZa;
import X.InterfaceC1286130jZb;
import android.media.MediaCodec;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.view.Surface;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.canvas.KryptonApp;
import com.lynx.canvas.recorder.MediaRecorder;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class MediaRecorder implements InterfaceC1286130jZb {
    public volatile long LIZ;
    public final InterfaceC1286120jZa LIZIZ;
    public final KryptonApp LIZJ;

    private native void nativeNotifyClipEndWithError(long j, String str);

    private native void nativeNotifyClipEndWithResult(long j, String str, String str2, float f, long j2);

    private native void nativeNotifyFlushRecord(long j);

    private native void nativeNotifyStartError(long j, String str);

    private native void nativeNotifyStopWithError(long j, String str);

    private native void nativeNotifyStopWithResult(long j, String str, String str2, float f, long j2);

    public final synchronized void LIZJ() {
        if (this.LIZ != 0) {
            nativeNotifyFlushRecord(this.LIZ);
        }
    }

    public long lastPresentationTime() {
        long j;
        C1286000jZO c1286000jZO = (C1286000jZO) this.LIZIZ;
        synchronized (c1286000jZO) {
            j = c1286000jZO.LJJIJ;
        }
        return j;
    }

    public void pauseRecord() {
        C1288370jdD.LIZJ("KryptonMediaRecorder", "pause record");
        C1286000jZO c1286000jZO = (C1286000jZO) this.LIZIZ;
        synchronized (c1286000jZO) {
            c1286000jZO.LJJIIZ = C1286000jZO.LIZIZ();
            c1286000jZO.LJIJJLI = true;
        }
    }

    public void resumeRecord() {
        C1288370jdD.LIZJ("KryptonMediaRecorder", "resume record");
        C1286000jZO c1286000jZO = (C1286000jZO) this.LIZIZ;
        synchronized (c1286000jZO) {
            c1286000jZO.LJJIIZI += C1286000jZO.LIZIZ() - c1286000jZO.LJJIIZ;
            c1286000jZO.LJIJJLI = false;
        }
    }

    public Surface startRecord() {
        C1288370jdD.LIZJ("KryptonMediaRecorder", "start record");
        final C1286000jZO c1286000jZO = (C1286000jZO) this.LIZIZ;
        synchronized (c1286000jZO) {
            if (c1286000jZO.LIZJ <= 0 || c1286000jZO.LIZLLL <= 0) {
                InterfaceC1286130jZb interfaceC1286130jZb = c1286000jZO.LIZ;
                if (interfaceC1286130jZb != null) {
                    ((MediaRecorder) interfaceC1286130jZb).LIZLLL("init param error");
                }
                return null;
            }
            c1286000jZO.LJJIIZI = 0L;
            c1286000jZO.LJJIIZ = 0L;
            c1286000jZO.LJIJJ = false;
            c1286000jZO.LJJIJ = 0L;
            c1286000jZO.LJJIIJ = -1;
            c1286000jZO.LJJIIJZLJL = -1;
            c1286000jZO.LJJIII = 0;
            c1286000jZO.LJIJJLI = false;
            c1286000jZO.LJJI = 0L;
            c1286000jZO.LJJIFFI = 0L;
            try {
                c1286000jZO.LJIIL();
                if (c1286000jZO.LJJ) {
                    try {
                        c1286000jZO.LJIIJJI();
                        c1286000jZO.LJJII = 2;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("prepareAudioEncoder ");
                        sbLIZ.append(e.toString());
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        C1288370jdD.LIZIZ("KryptonMediaRecorder", strLIZIZ);
                        InterfaceC1286130jZb interfaceC1286130jZb2 = c1286000jZO.LIZ;
                        if (interfaceC1286130jZb2 == null) {
                            return null;
                        }
                        ((MediaRecorder) interfaceC1286130jZb2).LIZLLL(strLIZIZ);
                        return null;
                    }
                } else {
                    c1286000jZO.LJJII = 1;
                }
                try {
                    c1286000jZO.LJIIIIZZ();
                    c1286000jZO.LJIL = true;
                    new BPEAThread() { // from class: X.0jZQ
                        public final void LIZJ() {
                            boolean z;
                            C1286000jZO c1286000jZO2 = c1286000jZO;
                            c1286000jZO2.getClass();
                            try {
                                c1286000jZO2.LJJIJIIJI = C1286000jZO.LIZIZ();
                                while (true) {
                                    synchronized (c1286000jZO2) {
                                        z = c1286000jZO2.LJIL;
                                    }
                                    if (!z) {
                                        break;
                                    }
                                    InterfaceC1286130jZb interfaceC1286130jZb3 = c1286000jZO2.LIZ;
                                    if (interfaceC1286130jZb3 != null) {
                                        ((MediaRecorder) interfaceC1286130jZb3).LIZJ();
                                    }
                                    c1286000jZO2.LJFF(false);
                                    c1286000jZO2.LJ();
                                    int i = c1286000jZO2.LJI;
                                    if (i > 0 && c1286000jZO2.LJJIJ >= ((double) i) * 1000000.0d) {
                                        c1286000jZO2.LJIL = false;
                                        c1286000jZO2.LJIJJLI = false;
                                    }
                                }
                                c1286000jZO2.LJIIZILJ.signalEndOfInputStream();
                                c1286000jZO2.LJFF(true);
                                c1286000jZO2.LJ();
                                try {
                                    c1286000jZO2.LJIILL(false);
                                    c1286000jZO2.LJIILIIL(false);
                                    c1286000jZO2.LJIILJJIL(false);
                                    C0VSJ c0vsj = new C0VSJ(c1286000jZO2.LJIIL);
                                    if (!c0vsj.exists() || !c0vsj.isFile()) {
                                        c1286000jZO2.LJIIJ("create video file failed.");
                                        return;
                                    }
                                    long length = c0vsj.length();
                                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                                    try {
                                        mediaMetadataRetriever.setDataSource(c1286000jZO2.LJIIL);
                                        InterfaceC1286150jZd interfaceC1286150jZd = c1286000jZO2.LJJIJL;
                                        String strLJ = interfaceC1286150jZd != null ? ((C1286110jZZ) interfaceC1286150jZd).LIZ.LJ(mediaMetadataRetriever) : C2204961BRm.LJLJI(mediaMetadataRetriever, 9, new C0WZX("dzBzEg4jUdKSVlYvUxOXKMoyOAX9SowR8LBlUCEVvaXorHRsPJE3qorljrsnmKeB3R0/uw==", null));
                                        float f = strLJ != null ? CastFloatProtector.parseFloat(strLJ) : 0.0f;
                                        c1286000jZO2.LJJIJIL.add(c1286000jZO2.LJIIL);
                                        float f2 = f / 1000.0f;
                                        InterfaceC1286130jZb interfaceC1286130jZb4 = c1286000jZO2.LIZ;
                                        if (interfaceC1286130jZb4 != null) {
                                            ((MediaRecorder) interfaceC1286130jZb4).LJ(c1286000jZO2.LJIIL, c1286000jZO2.LJIILIIL, f2, length);
                                        }
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        c1286000jZO2.LJIIJ("result video file is empty");
                                    }
                                } catch (Exception e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("release Encoder error.");
                                    sbLIZ2.append(e2.toString());
                                    c1286000jZO2.LJIIJ(C2188811AlT.LIZIZ(sbLIZ2));
                                }
                            } catch (Exception e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("encode error ");
                                sbLIZ3.append(e3.toString());
                                c1286000jZO2.LJIIJ(C2188811AlT.LIZIZ(sbLIZ3));
                            }
                        }

                        @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
                        public final void run() {
                            C1C7U.LIZ("KryptonDefaultMediaRecorder@3ed.startRecord$1");
                            boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
                            try {
                                LIZJ();
                            } finally {
                            }
                            if (zLJ) {
                                C0W9U.LJFF();
                            }
                            C1C7U.LIZIZ("KryptonDefaultMediaRecorder@3ed.startRecord$1");
                        }

                        {
                            super("MediaRecorder");
                        }
                    }.start();
                    return c1286000jZO.LJIILJJIL;
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("initMediaMuxer ");
                    sbLIZ2.append(e2.toString());
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    C1288370jdD.LIZIZ("KryptonMediaRecorder", strLIZIZ2);
                    InterfaceC1286130jZb interfaceC1286130jZb3 = c1286000jZO.LIZ;
                    if (interfaceC1286130jZb3 == null) {
                        return null;
                    }
                    ((MediaRecorder) interfaceC1286130jZb3).LIZLLL(strLIZIZ2);
                    return null;
                }
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("prepareVideoEncoder ");
                sbLIZ3.append(e3.toString());
                sbLIZ3.append("model:");
                sbLIZ3.append(Build.MODEL);
                sbLIZ3.append(" width:");
                sbLIZ3.append(c1286000jZO.LIZJ);
                sbLIZ3.append(" height:");
                sbLIZ3.append(c1286000jZO.LIZLLL);
                sbLIZ3.append(" bps:");
                sbLIZ3.append(c1286000jZO.LJ);
                sbLIZ3.append("ranges: ");
                sbLIZ3.append(c1286000jZO.LJIIJJI);
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                C1288370jdD.LIZIZ("KryptonMediaRecorder", strLIZIZ3);
                InterfaceC1286130jZb interfaceC1286130jZb4 = c1286000jZO.LIZ;
                if (interfaceC1286130jZb4 == null) {
                    return null;
                }
                ((MediaRecorder) interfaceC1286130jZb4).LIZLLL(strLIZIZ3);
                return null;
            }
        }
    }

    public void stopRecord() {
        C1288370jdD.LIZJ("KryptonMediaRecorder", "stop record");
        ((C1286000jZO) this.LIZIZ).LJIIZILJ();
    }

    public final synchronized void LIZIZ(String str) {
        if (this.LIZ != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("on recorder clip end with error ");
            sbLIZ.append(str);
            C1288370jdD.LIZLLL("KryptonMediaRecorder", C2188811AlT.LIZIZ(sbLIZ));
            nativeNotifyClipEndWithError(this.LIZ, str);
        }
    }

    public final synchronized void LIZLLL(String str) {
        if (this.LIZ != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("on recorder start error ");
            sbLIZ.append(str);
            C1288370jdD.LIZLLL("KryptonMediaRecorder", C2188811AlT.LIZIZ(sbLIZ));
            nativeNotifyStartError(this.LIZ, str);
        }
    }

    public final synchronized void LJFF(String str) {
        if (this.LIZ != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("on recorder stop with error ");
            sbLIZ.append(str);
            C1288370jdD.LIZLLL("KryptonMediaRecorder", C2188811AlT.LIZIZ(sbLIZ));
            nativeNotifyStopWithError(this.LIZ, str);
        }
    }

    public boolean clipVideo(long[] jArr) {
        C1288370jdD.LIZJ("KryptonMediaRecorder", "clip video");
        final C1286000jZO c1286000jZO = (C1286000jZO) this.LIZIZ;
        c1286000jZO.LJJIJIIJIL = jArr;
        new BPEAThread() { // from class: X.0jZP
            /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
            /* JADX WARN: Removed duplicated region for block: B:75:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZJ() {
                /*
                    Method dump skipped, instruction units count: 419
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1286010jZP.LIZJ():void");
            }

            @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("KryptonDefaultMediaRecorder@3ed.clipVideo$1");
                boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
                try {
                    LIZJ();
                } finally {
                }
                if (zLJ) {
                    C0W9U.LJFF();
                }
                C1C7U.LIZIZ("KryptonDefaultMediaRecorder@3ed.clipVideo$1");
            }

            {
                super("MediaRecorderClop");
            }
        }.start();
        return true;
    }

    public synchronized void destroy(boolean z) {
        C1288370jdD.LIZJ("KryptonMediaRecorder", "destroy");
        this.LIZ = 0L;
        ((C1286000jZO) this.LIZIZ).LIZLLL(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MediaRecorder(long r4, com.lynx.canvas.KryptonApp r6) {
        /*
            r3 = this;
            r3.<init>()
            r3.LIZ = r4
            r3.LIZJ = r6
            java.lang.Class<X.0jZW> r0 = X.AbstractC1286080jZW.class
            a17.a0 r0 = r6.LJ(r0)
            X.0jZW r0 = (X.AbstractC1286080jZW) r0
            java.lang.String r2 = "KryptonMediaRecorder"
            if (r0 != 0) goto L1d
            java.lang.String r0 = "media recorder service not found"
            X.C1288370jdD.LIZIZ(r2, r0)
        L18:
            r1 = 0
        L19:
            r3.LIZIZ = r1
            monitor-enter(r1)
            goto L29
        L1d:
            X.0jZO r1 = r0.LIZ()
            if (r1 != 0) goto L19
            java.lang.String r0 = "service create media recorder return null"
            X.C1288370jdD.LIZIZ(r2, r0)
            goto L18
        L29:
            r1.LIZ = r3     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r1)
            return
        L2d:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.canvas.recorder.MediaRecorder.<init>(long, com.lynx.canvas.KryptonApp):void");
    }

    public static MediaRecorder create(long j, KryptonApp kryptonApp) {
        return new MediaRecorder(j, kryptonApp);
    }

    public void onAudioSample(ByteBuffer byteBuffer, int i) {
        C1286000jZO c1286000jZO = (C1286000jZO) this.LIZIZ;
        MediaCodec mediaCodec = c1286000jZO.LJIJ;
        if (mediaCodec != null) {
            try {
                int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
                if (iDequeueInputBuffer < 0) {
                    C1288370jdD.LIZLLL("KryptonMediaRecorder", "no input buffer, audio data dropped");
                    return;
                }
                ByteBuffer byteBuffer2 = c1286000jZO.LJIJ.getInputBuffers()[iDequeueInputBuffer];
                byteBuffer2.clear();
                byteBuffer.position(0).limit(i);
                byteBuffer2.put(byteBuffer);
                long j = c1286000jZO.LJJIFFI;
                long j2 = (1000000 * j) / ((long) c1286000jZO.LJIIIZ);
                c1286000jZO.LJJI = j2;
                c1286000jZO.LJJIFFI = j + ((long) (i >> 2));
                c1286000jZO.LJIJ.queueInputBuffer(iDequeueInputBuffer, 0, i, j2, 0);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onAudioSample exception ");
                sbLIZ.append(e.toString());
                C1288370jdD.LIZLLL("KryptonMediaRecorder", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public void configAudio(int i, int i2, int i3) {
        C1288370jdD.LIZJ("KryptonMediaRecorder", "use audio");
        C1286000jZO c1286000jZO = (C1286000jZO) this.LIZIZ;
        synchronized (c1286000jZO) {
            if (i < 0) {
                c1286000jZO.LJJ = false;
                return;
            }
            c1286000jZO.LJIIIIZZ = i;
            c1286000jZO.LJII = i2;
            c1286000jZO.LJIIIZ = i3;
            c1286000jZO.LJJ = true;
        }
    }

    public final synchronized void LIZ(String str, String str2, float f, long j) {
        if (this.LIZ != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("on recorder clip end with result. duration:");
            sbLIZ.append(f);
            sbLIZ.append(", size:");
            sbLIZ.append(j);
            C1288370jdD.LIZJ("KryptonMediaRecorder", C2188811AlT.LIZIZ(sbLIZ));
            nativeNotifyClipEndWithResult(this.LIZ, str, str2, f, j);
        }
    }

    public final synchronized void LJ(String str, String str2, float f, long j) {
        if (this.LIZ != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("on recorder stop with result. duration:");
            sbLIZ.append(f);
            sbLIZ.append(", size:");
            sbLIZ.append(j);
            C1288370jdD.LIZJ("KryptonMediaRecorder", C2188811AlT.LIZIZ(sbLIZ));
            nativeNotifyStopWithResult(this.LIZ, str, str2, f, j);
        }
    }

    public void configVideo(String str, int i, int i2, int i3, int i4, int i5) {
        C1286000jZO c1286000jZO = (C1286000jZO) this.LIZIZ;
        synchronized (c1286000jZO) {
            c1286000jZO.LIZIZ = str;
            c1286000jZO.LJI = i;
            c1286000jZO.LIZJ = i2;
            c1286000jZO.LIZLLL = i3;
            c1286000jZO.LJ = i4;
            c1286000jZO.LJFF = i5;
            c1286000jZO.LJIIJ = true;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("configVideo for ");
            sbLIZ.append(Build.MODEL);
            sbLIZ.append(", width: ");
            sbLIZ.append(c1286000jZO.LIZJ);
            sbLIZ.append(", height: ");
            sbLIZ.append(c1286000jZO.LIZLLL);
            sbLIZ.append(", bps: ");
            sbLIZ.append(c1286000jZO.LJ);
            sbLIZ.append(", fps: ");
            sbLIZ.append(c1286000jZO.LJFF);
            C1288370jdD.LIZJ("KryptonMediaRecorder", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
