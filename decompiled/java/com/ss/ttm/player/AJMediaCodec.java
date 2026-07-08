package com.ss.ttm.player;

import X.C1285020jXo;
import X.C1285230jY9;
import X.C1285260jYC;
import X.C1285290jYF;
import X.C1285300jYG;
import X.C1285320jYI;
import X.C1471820oP6;
import X.C2188811AlT;
import X.C2280261ENc;
import X.C2280281ENe;
import X.C386801es;
import X.C786410Ut5;
import X.C807510Vm1;
import X.EnumC1153070g6z;
import X.InterfaceC1285250jYB;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS89S0200000_20;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaDrm;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttm.player.AJMediaCodec;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes21.dex */
public class AJMediaCodec {
    public static final ArrayList<MediaCodecInfo> LJJII = new ArrayList<>();
    public static final Object LJJIII = new Object();
    public static boolean LJJIIJ = false;
    public static boolean LJJIIJZLJL = false;
    public static boolean LJJIIZ = false;
    public static boolean LJJIIZI = false;
    public static int LJJIJ = 1;
    public static int LJJIJIIJI = 0;
    public static final Object LJJIJIIJIL = new Object();
    public static int LJJIJIL = 0;
    public static final ReentrantLock LJJIJL;
    public static final Condition LJJIJLIJ;
    public ByteBuffer[] LIZ;
    public ByteBuffer[] LIZIZ;
    public boolean LIZJ;
    public MediaCodec LIZLLL;
    public MediaCodec.BufferInfo LJ;
    public MediaFormat LJFF;
    public final C1285290jYF LJII;
    public DummySurface LJIIIIZZ;
    public Handler LJIIJJI;
    public HandlerThread LJIILIIL;
    public String LJIJJ;
    public C1285260jYC LJJ;
    public final int LJJI;
    public final int LJJIFFI;
    public final AJMediaFormat LJI = new AJMediaFormat();
    public int LJIIIZ = 0;
    public long LJIIJ = 0;
    public int LJIIL = 0;
    public boolean LJIILJJIL = false;
    public MediaCodecInfo LJIILL = null;
    public String LJIILLIIL = null;
    public int LJIIZILJ = -1;
    public int LJIJ = 0;
    public int LJIJI = 0;
    public boolean LJIJJLI = false;
    public boolean LJIL = false;

    public static final native void _clearBufferIndex(long j);

    public static final native void _onEmptyBuffer(long j, int i);

    public static final native void _onError(long j);

    public static final native void _onFilledBuffer(long j, int i, int i2, int i3, long j2, int i4);

    public static final native void _onFormatChanged(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9);

    public static final native void _setSurfaceCompleted(long j);

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        LJJIJL = reentrantLock;
        LJJIJLIJ = reentrantLock.newCondition();
    }

    private int logTunnelSupport() {
        String str;
        MediaCodecInfo mediaCodecInfo = this.LJIILL;
        if (mediaCodecInfo == null || (str = this.LJIILLIIL) == null) {
            return -2;
        }
        try {
            return mediaCodecInfo.getCapabilitiesForType(str).isFeatureSupported("tunneled-playback") ? 1 : 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return -2;
        }
    }

    private boolean supportSetSurface() {
        return !LJJIIJZLJL;
    }

    public final boolean LIZLLL() {
        return this.LJJI == 0 && this.LJJIFFI == 2;
    }

    public final void LJII() {
        synchronized (LJJIJIIJIL) {
            try {
                if (this.LJIILJJIL) {
                    return;
                }
                _setSurfaceCompleted(this.LJIIJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void close() {
        if (this.LJJ != null) {
            stop();
            C1285260jYC c1285260jYC = this.LJJ;
            if (this.LJIIIZ != 1 || C1285020jXo.LIZ < 23) {
                this.LJJ = null;
            } else {
                synchronized (LJJIJIIJIL) {
                    try {
                        HandlerThread handlerThread = this.LJIILIIL;
                        if (handlerThread != null) {
                            handlerThread.quit();
                        }
                        _clearBufferIndex(this.LJIIJ);
                        this.LJIILJJIL = true;
                        this.LJJ = null;
                    } finally {
                    }
                }
            }
            try {
                C1471820oP6.LIZ(new ARunnableS89S0200000_20(this, c1285260jYC, 74));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1285320jYI.LIZLLL(this, "JAJMediaCodec", "new thread failed");
                LJIIIZ(c1285260jYC);
            }
        } else if (this.LIZLLL != null) {
            stop();
            final MediaCodec mediaCodec = this.LIZLLL;
            this.LIZIZ = null;
            this.LIZ = null;
            if (this.LJIIIZ != 1 || C1285020jXo.LIZ < 23) {
                this.LIZLLL = null;
            } else {
                synchronized (LJJIJIIJIL) {
                    try {
                        HandlerThread handlerThread2 = this.LJIILIIL;
                        if (handlerThread2 != null) {
                            handlerThread2.quit();
                        }
                        _clearBufferIndex(this.LJIIJ);
                        this.LJIILJJIL = true;
                        this.LIZLLL = null;
                    } finally {
                    }
                }
            }
            if (LJJIJIIJI > 0) {
                LJIIIIZZ(mediaCodec);
            } else {
                try {
                    C1471820oP6.LIZ(new Runnable() { // from class: X.0jYD
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("AJMediaCodec@bbc4.close$2");
                            try {
                                this.LLILLJJLI.LJIIIIZZ(mediaCodec);
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("AJMediaCodec@bbc4.close$2");
                        }
                    });
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C1285320jYI.LIZLLL(this, "JAJMediaCodec", "new thread failed");
                    LJIIIIZZ(mediaCodec);
                }
            }
        }
        C1285320jYI.LIZJ(this, "JAJMediaCodec", "~JAJMediaCodec#}");
    }

    public void disableCodecReuse() {
        InterfaceC1285250jYB interfaceC1285250jYB;
        C1285260jYC c1285260jYC = this.LJJ;
        if (c1285260jYC == null || (interfaceC1285250jYB = c1285260jYC.LIZIZ) == null) {
            return;
        }
        interfaceC1285250jYB.LIZJ();
    }

    public int flush() {
        try {
            C1285260jYC c1285260jYC = this.LJJ;
            if (c1285260jYC != null) {
                InterfaceC1285250jYB interfaceC1285250jYB = c1285260jYC.LIZIZ;
                if (interfaceC1285250jYB != null) {
                    interfaceC1285250jYB.flush();
                }
            } else {
                this.LIZLLL.flush();
            }
            if (this.LJIIIZ != 1) {
                return 0;
            }
            synchronized (LJJIJIIJIL) {
                try {
                    this.LJIIL++;
                    Handler handlerLIZLLL = this.LJIIJJI;
                    if (handlerLIZLLL == null) {
                        InterfaceC1285250jYB interfaceC1285250jYB2 = this.LJJ.LIZIZ;
                        handlerLIZLLL = interfaceC1285250jYB2 == null ? null : interfaceC1285250jYB2.LIZLLL();
                    }
                    C786410Ut5.LJJZZIII(handlerLIZLLL, new ARunnableS120S0100000_20(this, 139));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return -1;
        }
    }

    public int getChannelCount() {
        MediaFormat mediaFormat = this.LJFF;
        if (mediaFormat != null) {
            try {
                return mediaFormat.getInteger("channel-count");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return 0;
    }

    public int getColorFormat() {
        MediaFormat mediaFormat = this.LJFF;
        if (mediaFormat != null) {
            try {
                int integer = mediaFormat.getInteger("color-format");
                return (integer == 21 || integer == 2130706688 || integer == 2141391872) ? 3 : 0;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return 0;
    }

    public int getColorTransfer() {
        MediaFormat mediaFormat = this.LJFF;
        if (mediaFormat != null) {
            try {
                int integer = mediaFormat.getInteger("color-transfer");
                if (integer != 6) {
                    return integer != 7 ? 0 : 18;
                }
                return 16;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return 0;
    }

    public int getFormatHeight() {
        MediaFormat mediaFormat = this.LJFF;
        if (mediaFormat != null) {
            try {
                return (mediaFormat.containsKey("crop-right") && this.LJFF.containsKey("crop-left") && this.LJFF.containsKey("crop-bottom") && this.LJFF.containsKey("crop-top")) ? (this.LJFF.getInteger("crop-bottom") - this.LJFF.getInteger("crop-top")) + 1 : this.LJFF.getInteger("height");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return 0;
    }

    public int getFormatWidth() {
        MediaFormat mediaFormat = this.LJFF;
        if (mediaFormat != null) {
            try {
                return (mediaFormat.containsKey("crop-right") && this.LJFF.containsKey("crop-left") && this.LJFF.containsKey("crop-bottom") && this.LJFF.containsKey("crop-top")) ? (this.LJFF.getInteger("crop-right") - this.LJFF.getInteger("crop-left")) + 1 : this.LJFF.getInteger("width");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return 0;
    }

    public ByteBuffer[] getInputBuffers() {
        if (this.LIZJ) {
            return this.LIZIZ;
        }
        return null;
    }

    public int getSampleRate() {
        MediaFormat mediaFormat = this.LJFF;
        if (mediaFormat != null) {
            try {
                return mediaFormat.getInteger("sample-rate");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return 0;
    }

    public int getSliceHeight() {
        MediaFormat mediaFormat = this.LJFF;
        if (mediaFormat != null) {
            try {
                return mediaFormat.getInteger("slice-height");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return 0;
    }

    public int getStride() {
        MediaFormat mediaFormat = this.LJFF;
        if (mediaFormat != null) {
            try {
                return mediaFormat.getInteger("stride");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    public int isAdaptivePlayback() {
        ?? IsFeatureSupported;
        String str;
        int i = this.LJIIZILJ;
        if (i != -1) {
            return i;
        }
        MediaCodecInfo mediaCodecInfo = this.LJIILL;
        if (mediaCodecInfo == null || (str = this.LJIILLIIL) == null) {
            IsFeatureSupported = 1;
        } else {
            try {
                IsFeatureSupported = mediaCodecInfo.getCapabilitiesForType(str).isFeatureSupported("adaptive-playback");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                IsFeatureSupported = 1;
            }
        }
        this.LJIIZILJ = IsFeatureSupported;
        if ("Q7-G1".equals(Build.MODEL) && "kunlun".equals(Build.HARDWARE)) {
            "GK6323V100C".equals(Build.BOARD);
        }
        return this.LJIIZILJ;
    }

    public int start() {
        MediaCodec mediaCodecLIZIZ;
        try {
            if (this.LJIJJLI) {
                this.LJJ.LJ();
            } else {
                this.LIZLLL.start();
            }
            ByteBuffer[] inputBuffers = null;
            if (this.LJIIIZ == 0) {
                if (this.LJIJJLI) {
                    InterfaceC1285250jYB interfaceC1285250jYB = this.LJJ.LIZIZ;
                    if (interfaceC1285250jYB != null && (mediaCodecLIZIZ = interfaceC1285250jYB.LIZIZ()) != null) {
                        inputBuffers = mediaCodecLIZIZ.getInputBuffers();
                    }
                    this.LIZIZ = inputBuffers;
                } else {
                    this.LIZIZ = this.LIZLLL.getInputBuffers();
                }
                if (C1285020jXo.LIZ >= 21) {
                    C1285260jYC c1285260jYC = this.LJJ;
                    this.LIZ = c1285260jYC != null ? c1285260jYC.LIZJ() : this.LIZLLL.getOutputBuffers();
                }
            } else {
                this.LIZIZ = null;
                this.LIZ = null;
            }
            this.LIZJ = true;
            this.LJ = new MediaCodec.BufferInfo();
            return 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LIZJ(e);
            return -1;
        }
    }

    public int stop() {
        if (this.LIZJ) {
            try {
                this.LIZJ = false;
                C1285260jYC c1285260jYC = this.LJJ;
                if (c1285260jYC == null) {
                    this.LIZLLL.stop();
                    return 0;
                }
                InterfaceC1285250jYB interfaceC1285250jYB = c1285260jYC.LIZIZ;
                if (interfaceC1285250jYB != null) {
                    interfaceC1285250jYB.stop();
                    return 0;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return -1;
            }
        }
        return 0;
    }

    public int vendorOppoHWEnable() {
        if (!C1285020jXo.LJFF.equals("OPPO")) {
            return 1;
        }
        String strLIZIZ = LIZIZ("persist.sys.aweme.hdsupport", "1");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("oppo property = ");
        sbLIZ.append(strLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        try {
            return CastIntegerProtector.parseInt(strLIZIZ);
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            C1285320jYI.LIZLLL(this, "JAJMediaCodec", "vendor oppo property abnormal");
            return 1;
        }
    }

    public void closeDrm() {
        if (LIZLLL()) {
            C1285290jYF c1285290jYF = this.LJII;
            C1285300jYG c1285300jYG = c1285290jYF.LIZ;
            if (c1285300jYG != null) {
                C2280281ENe.LIZJ.LIZ(c1285300jYG);
                c1285290jYF.LIZ = null;
            }
            c1285290jYF.LIZIZ = null;
        }
    }

    public boolean drmSupportSecureDecoder() {
        C1285300jYG c1285300jYG;
        String propertyString;
        if (!LIZLLL() || (c1285300jYG = this.LJII.LIZ) == null) {
            return false;
        }
        if (TextUtils.isEmpty(c1285300jYG.LIZLLL)) {
            MediaDrm mediaDrm = c1285300jYG.LIZ;
            propertyString = mediaDrm != null ? mediaDrm.getPropertyString("securityLevel") : null;
        } else {
            propertyString = c1285300jYG.LIZLLL;
        }
        return !"L3".equals(propertyString);
    }

    public int getDrm() {
        if (LIZLLL()) {
            C1285290jYF c1285290jYF = this.LJII;
            c1285290jYF.getClass();
            C2280281ENe c2280281ENe = C2280281ENe.LIZJ;
            C1285300jYG c1285300jYG = c2280281ENe.LIZ;
            c1285290jYF.LIZ = c1285300jYG;
            if (c1285300jYG != null) {
                MediaCrypto mediaCrypto = c1285300jYG.LIZIZ;
                c1285290jYF.LIZIZ = mediaCrypto;
                if (mediaCrypto != null) {
                    return 0;
                }
                C1285320jYI.LIZ(c1285290jYF, "AJMediaCodecDrmHelper", "drm getDrm failed: MediaCrypto is null");
                c2280281ENe.LIZ(c1285290jYF.LIZ);
                c1285290jYF.LIZ = null;
                return -2;
            }
            C1285320jYI.LIZ(c1285290jYF, "AJMediaCodecDrmHelper", "drm getDrm failed: AJMediaDrm is null");
        }
        return -1;
    }

    public String getErrorInfo() {
        return this.LJIJJ;
    }

    public int getOSVerion() {
        return C1285020jXo.LIZ;
    }

    public final void LIZ(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create dummy surface secure=");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LJIIIIZZ = DummySurface.newInstanceV17(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (r2.getErrorCode() != 1101) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        return -10001;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
    
        if (r2.isRecoverable() == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZJ(java.lang.Exception r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.toString()
            r5.LJIJJ = r0
            int r4 = X.C1285020jXo.LIZ
            r0 = 21
            r3 = -10002(0xffffffffffffd8ee, float:NaN)
            r1 = -10000(0xffffffffffffd8f0, float:NaN)
            if (r4 < r0) goto L72
            boolean r0 = r6 instanceof android.media.MediaCodec.CodecException
            if (r0 == 0) goto L6b
            r2 = r6
            android.media.MediaCodec$CodecException r2 = (android.media.MediaCodec.CodecException) r2
            r1 = 23
            java.lang.String r0 = "exception codecExc isRecoverable: "
            if (r4 < r1) goto L53
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r0)
            boolean r0 = r2.isRecoverable()
            r1.append(r0)
            java.lang.String r0 = ", errorcode: "
            r1.append(r0)
            int r0 = r2.getErrorCode()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            boolean r0 = r2.isRecoverable()
            if (r0 != 0) goto L6b
            int r1 = r2.getErrorCode()
            r0 = 1100(0x44c, float:1.541E-42)
            if (r1 == r0) goto L6b
            int r1 = r2.getErrorCode()
            r0 = 1101(0x44d, float:1.543E-42)
            if (r1 == r0) goto L6b
        L50:
            r3 = -10001(0xffffffffffffd8ef, float:NaN)
        L52:
            return r3
        L53:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r0)
            boolean r0 = r2.isRecoverable()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            boolean r0 = r2.isRecoverable()
            if (r0 != 0) goto L6b
            goto L50
        L6b:
            boolean r0 = r6 instanceof java.lang.IllegalStateException
            if (r0 != 0) goto L52
            r3 = -10000(0xffffffffffffd8f0, float:NaN)
            return r3
        L72:
            boolean r0 = r6 instanceof java.lang.IllegalStateException
            if (r0 == 0) goto L77
            return r3
        L77:
            boolean r0 = r6 instanceof android.media.MediaCodec.CryptoException
            if (r0 == 0) goto La5
            android.media.MediaCodec$CryptoException r6 = (android.media.MediaCodec.CryptoException) r6
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "CryptoException errorCode="
            r1.append(r0)
            int r0 = r6.getErrorCode()
            r1.append(r0)
            java.lang.String r0 = ", message="
            r1.append(r0)
            java.lang.String r0 = r6.getMessage()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "JAJMediaCodec"
            X.C1285320jYI.LIZ(r5, r0, r1)
            r0 = -10004(0xffffffffffffd8ec, float:NaN)
            return r0
        La5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.AJMediaCodec.LIZJ(java.lang.Exception):int");
    }

    public final void LJI(ARunnableS120S0100000_20 aRunnableS120S0100000_20) {
        synchronized (LJJIJIIJIL) {
            try {
                if (this.LJIILJJIL) {
                    return;
                }
                int i = this.LJIIL - 1;
                this.LJIIL = i;
                if (i > 0) {
                    return;
                }
                if (i < 0) {
                    return;
                }
                _clearBufferIndex(this.LJIIJ);
                try {
                    aRunnableS120S0100000_20.run();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (e instanceof IllegalStateException) {
                        _onError(this.LJIIJ);
                    } else {
                        C1285320jYI.LIZLLL(this, "JAJMediaCodec", e.toString());
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIIIZZ(MediaCodec mediaCodec) {
        ReentrantLock reentrantLock;
        ReentrantLock reentrantLock2;
        if (mediaCodec == null) {
            return;
        }
        try {
            try {
                mediaCodec.release();
                DummySurface dummySurface = this.LJIIIIZZ;
                if (dummySurface != null) {
                    dummySurface.release();
                    this.LJIIIIZZ = null;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                reentrantLock2 = LJJIJL;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            if (this.LJIIIIZZ != null) {
                this.LJIIIIZZ.release();
                this.LJIIIIZZ = null;
            }
            if (this.LJIJI == 1) {
                try {
                    reentrantLock2 = LJJIJL;
                    reentrantLock2.lock();
                    LJJIJIL--;
                    LJJIJLIJ.signal();
                } finally {
                }
            } else {
                return;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            DummySurface dummySurface2 = this.LJIIIIZZ;
            if (dummySurface2 != null) {
                dummySurface2.release();
                this.LJIIIIZZ = null;
            }
            if (this.LJIJI == 1) {
                try {
                    try {
                        reentrantLock = LJJIJL;
                        reentrantLock.lock();
                        LJJIJIL--;
                        LJJIJLIJ.signal();
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        reentrantLock = LJJIJL;
                    }
                    reentrantLock.unlock();
                } finally {
                }
            }
            throw th;
        }
        if (this.LJIJI == 1) {
            try {
                reentrantLock2 = LJJIJL;
                reentrantLock2.lock();
                LJJIJIL--;
                LJJIJLIJ.signal();
                reentrantLock2.unlock();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                LJJIJL.unlock();
                throw th2;
            }
        }
    }

    public final void LJIIIZ(C1285260jYC c1285260jYC) {
        ReentrantLock reentrantLock;
        ReentrantLock reentrantLock2;
        if (c1285260jYC == null) {
            return;
        }
        try {
            try {
                InterfaceC1285250jYB interfaceC1285250jYB = c1285260jYC.LIZIZ;
                if (interfaceC1285250jYB != null) {
                    interfaceC1285250jYB.release();
                }
                DummySurface dummySurface = this.LJIIIIZZ;
                if (dummySurface != null) {
                    dummySurface.release();
                    this.LJIIIIZZ = null;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                reentrantLock2 = LJJIJL;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            DummySurface dummySurface2 = this.LJIIIIZZ;
            if (dummySurface2 != null) {
                dummySurface2.release();
                this.LJIIIIZZ = null;
            }
            if (this.LJIJI == 1) {
                try {
                    reentrantLock2 = LJJIJL;
                    reentrantLock2.lock();
                    LJJIJIL--;
                    LJJIJLIJ.signal();
                } finally {
                }
            } else {
                return;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            DummySurface dummySurface3 = this.LJIIIIZZ;
            if (dummySurface3 != null) {
                dummySurface3.release();
                this.LJIIIIZZ = null;
            }
            try {
                if (this.LJIJI == 1) {
                    try {
                        reentrantLock = LJJIJL;
                        reentrantLock.lock();
                        LJJIJIL--;
                        LJJIJLIJ.signal();
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        reentrantLock = LJJIJL;
                    }
                    reentrantLock.unlock();
                }
                throw th;
            } finally {
            }
        }
        if (this.LJIJI == 1) {
            try {
                reentrantLock2 = LJJIJL;
                reentrantLock2.lock();
                LJJIJIL--;
                LJJIJLIJ.signal();
                reentrantLock2.unlock();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                LJJIJL.unlock();
                throw th2;
            }
        }
    }

    public final int LJIIJ(int i) {
        BPEAHandler bPEAHandlerLIZLLL;
        if (i != 0) {
            try {
                C1285260jYC c1285260jYC = this.LJJ;
                if (c1285260jYC != null) {
                    C1285230jY9 c1285230jY9 = new C1285230jY9(this);
                    if (C1285020jXo.LIZ < 23) {
                        this.LJIIJJI = new BPEAHandler(Looper.getMainLooper());
                        return 0;
                    }
                    InterfaceC1285250jYB interfaceC1285250jYB = c1285260jYC.LIZIZ;
                    if (interfaceC1285250jYB != null) {
                        interfaceC1285250jYB.LJI(c1285260jYC, c1285230jY9);
                    }
                    InterfaceC1285250jYB interfaceC1285250jYB2 = this.LJJ.LIZIZ;
                    if (interfaceC1285250jYB2 == null) {
                        bPEAHandlerLIZLLL = null;
                    } else {
                        bPEAHandlerLIZLLL = interfaceC1285250jYB2.LIZLLL();
                    }
                    this.LJIIJJI = bPEAHandlerLIZLLL;
                    return 0;
                }
                MediaCodec.Callback callback = new MediaCodec.Callback() { // from class: X.0jY8
                    /* JADX WARN: Removed duplicated region for block: B:34:0x0090 A[Catch: Exception -> 0x011a, TryCatch #0 {Exception -> 0x011a, blocks: (B:4:0x0014, B:6:0x0022, B:9:0x002e, B:11:0x0034, B:13:0x003a, B:17:0x0043, B:19:0x0049, B:20:0x0054, B:22:0x005c, B:23:0x0067, B:25:0x006f, B:35:0x0098, B:36:0x009f, B:38:0x00a5, B:45:0x00c1, B:46:0x00c9, B:48:0x00d3, B:49:0x00d7, B:51:0x00e3, B:52:0x00e7, B:43:0x00b0, B:44:0x00b9, B:34:0x0090, B:26:0x0074, B:27:0x007b, B:53:0x00e9, B:55:0x00f1, B:57:0x00fb, B:58:0x00ff, B:60:0x010b, B:61:0x010f), top: B:71:0x0014 }] */
                    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9 A[Catch: Exception -> 0x011a, TryCatch #0 {Exception -> 0x011a, blocks: (B:4:0x0014, B:6:0x0022, B:9:0x002e, B:11:0x0034, B:13:0x003a, B:17:0x0043, B:19:0x0049, B:20:0x0054, B:22:0x005c, B:23:0x0067, B:25:0x006f, B:35:0x0098, B:36:0x009f, B:38:0x00a5, B:45:0x00c1, B:46:0x00c9, B:48:0x00d3, B:49:0x00d7, B:51:0x00e3, B:52:0x00e7, B:43:0x00b0, B:44:0x00b9, B:34:0x0090, B:26:0x0074, B:27:0x007b, B:53:0x00e9, B:55:0x00f1, B:57:0x00fb, B:58:0x00ff, B:60:0x010b, B:61:0x010f), top: B:71:0x0014 }] */
                    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3 A[Catch: Exception -> 0x011a, TryCatch #0 {Exception -> 0x011a, blocks: (B:4:0x0014, B:6:0x0022, B:9:0x002e, B:11:0x0034, B:13:0x003a, B:17:0x0043, B:19:0x0049, B:20:0x0054, B:22:0x005c, B:23:0x0067, B:25:0x006f, B:35:0x0098, B:36:0x009f, B:38:0x00a5, B:45:0x00c1, B:46:0x00c9, B:48:0x00d3, B:49:0x00d7, B:51:0x00e3, B:52:0x00e7, B:43:0x00b0, B:44:0x00b9, B:34:0x0090, B:26:0x0074, B:27:0x007b, B:53:0x00e9, B:55:0x00f1, B:57:0x00fb, B:58:0x00ff, B:60:0x010b, B:61:0x010f), top: B:71:0x0014 }] */
                    /* JADX WARN: Removed duplicated region for block: B:51:0x00e3 A[Catch: Exception -> 0x011a, TryCatch #0 {Exception -> 0x011a, blocks: (B:4:0x0014, B:6:0x0022, B:9:0x002e, B:11:0x0034, B:13:0x003a, B:17:0x0043, B:19:0x0049, B:20:0x0054, B:22:0x005c, B:23:0x0067, B:25:0x006f, B:35:0x0098, B:36:0x009f, B:38:0x00a5, B:45:0x00c1, B:46:0x00c9, B:48:0x00d3, B:49:0x00d7, B:51:0x00e3, B:52:0x00e7, B:43:0x00b0, B:44:0x00b9, B:34:0x0090, B:26:0x0074, B:27:0x007b, B:53:0x00e9, B:55:0x00f1, B:57:0x00fb, B:58:0x00ff, B:60:0x010b, B:61:0x010f), top: B:71:0x0014 }] */
                    /* JADX WARN: Removed duplicated region for block: B:64:0x0116  */
                    /* JADX WARN: Removed duplicated region for block: B:65:0x0118  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ(android.media.MediaFormat r15) {
                        /*
                            Method dump skipped, instruction units count: 349
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1285220jY8.LIZ(android.media.MediaFormat):void");
                    }

                    @Override // android.media.MediaCodec.Callback
                    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("ttmn: ");
                        sbLIZ.append(codecException);
                        C1285320jYI.LIZ(this, "JAJMediaCodec", C2188811AlT.LIZIZ(sbLIZ));
                        synchronized (AJMediaCodec.LJJIJIIJIL) {
                            try {
                                AJMediaCodec aJMediaCodec = this.LIZ;
                                if (aJMediaCodec.LJIILJJIL) {
                                    return;
                                }
                                AJMediaCodec._onError(aJMediaCodec.LJIIJ);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }

                    @Override // android.media.MediaCodec.Callback
                    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i2) {
                        if (mediaCodec == this.LIZ.LIZLLL) {
                            synchronized (AJMediaCodec.LJJIJIIJIL) {
                                try {
                                    AJMediaCodec aJMediaCodec = this.LIZ;
                                    if (aJMediaCodec.LJIILJJIL) {
                                        return;
                                    }
                                    AJMediaCodec._onEmptyBuffer(aJMediaCodec.LJIIJ, i2);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }
                    }

                    @Override // android.media.MediaCodec.Callback
                    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
                        synchronized (AJMediaCodec.LJJIJIIJIL) {
                            try {
                                if (this.LIZ.LJIILJJIL) {
                                    return;
                                }
                                LIZ(mediaFormat);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }

                    @Override // android.media.MediaCodec.Callback
                    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i2, MediaCodec.BufferInfo bufferInfo) {
                        if (mediaCodec == this.LIZ.LIZLLL) {
                            synchronized (AJMediaCodec.LJJIJIIJIL) {
                                try {
                                    AJMediaCodec aJMediaCodec = this.LIZ;
                                    if (aJMediaCodec.LJIILJJIL) {
                                        return;
                                    }
                                    AJMediaCodec._onFilledBuffer(aJMediaCodec.LJIIJ, i2, bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }
                    }
                };
                if (C1285020jXo.LIZ < 23) {
                    this.LIZLLL.setCallback(callback);
                    this.LJIIJJI = new BPEAHandler(Looper.getMainLooper());
                    return 0;
                }
                HandlerThread handlerThread = new HandlerThread("mc_async");
                this.LJIILIIL = handlerThread;
                handlerThread.start();
                BPEAHandler bPEAHandler = new BPEAHandler(C786410Ut5.W2(this.LJIILIIL));
                this.LJIIJJI = bPEAHandler;
                this.LIZLLL.setCallback(callback, bPEAHandler);
                return 0;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ttmn: failed to set callback = ");
                sbLIZ.append(e.toString());
                C1285320jYI.LIZ(this, "JAJMediaCodec", C2188811AlT.LIZIZ(sbLIZ));
                return -1;
            }
        }
        return 0;
    }

    public int createByCodecName(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createByCodecName = ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        try {
            if (this.LJIJI == 1) {
                try {
                    ReentrantLock reentrantLock = LJJIJL;
                    reentrantLock.lock();
                    if (LJJIJIL > 0) {
                        LJJIJLIJ.await(3000L, TimeUnit.MILLISECONDS);
                    }
                    if (LJJIJIL > 0) {
                        C1285320jYI.LIZLLL(this, "JAJMediaCodec", "already create a media codec");
                        reentrantLock.unlock();
                        return -1;
                    }
                    if (this.LJIJJLI) {
                        C1285260jYC c1285260jYC = new C1285260jYC(str, EnumC1153070g6z.CreateByName);
                        this.LJJ = c1285260jYC;
                        c1285260jYC.LJI = this.LJIL;
                        c1285260jYC.LIZIZ();
                    } else {
                        this.LIZLLL = MediaCodec.createByCodecName(str);
                    }
                    LJJIJIL++;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    LJJIJL.unlock();
                    throw th;
                }
            } else if (this.LJIJJLI) {
                C1285260jYC c1285260jYC2 = new C1285260jYC(str, EnumC1153070g6z.CreateByName);
                this.LJJ = c1285260jYC2;
                c1285260jYC2.LJI = this.LJIL;
                c1285260jYC2.LIZIZ();
            } else {
                this.LIZLLL = MediaCodec.createByCodecName(str);
            }
            this.LJIILJJIL = false;
            return 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LIZJ(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("createByCodecName fail = ");
            sbLIZ2.append(e.toString());
            C2188811AlT.LIZIZ(sbLIZ2);
            return -1;
        }
    }

    public void decodeFRC(int i) {
        if (this.LIZLLL != null && this.LIZJ && C1285020jXo.LIZ >= 23) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("frc level = ");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
            Bundle bundle = new Bundle();
            bundle.putInt("vivo.video-dec.dynamic-frc", i);
            try {
                this.LIZLLL.setParameters(bundle);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setParameters failed ret = ");
                sbLIZ2.append(e);
                C1285320jYI.LIZLLL(this, "JAJMediaCodec", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }

    public void decodeImportance(int i) {
        MediaCodec mediaCodecLIZIZ;
        if (this.LIZLLL != null && this.LIZJ && C1285020jXo.LIZ >= 35) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("importance value = ");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
            Bundle bundle = new Bundle();
            bundle.putInt("importance", i);
            try {
                this.LIZLLL.setParameters(bundle);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setParameters failed ret = ");
                sbLIZ2.append(e);
                C1285320jYI.LIZLLL(this, "JAJMediaCodec", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
        }
        if (this.LJJ != null && this.LIZJ && C1285020jXo.LIZ >= 35) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("importance value = ");
            sbLIZ3.append(i);
            C2188811AlT.LIZIZ(sbLIZ3);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("importance", i);
            try {
                InterfaceC1285250jYB interfaceC1285250jYB = this.LJJ.LIZIZ;
                if (interfaceC1285250jYB != null && (mediaCodecLIZIZ = interfaceC1285250jYB.LIZIZ()) != null) {
                    mediaCodecLIZIZ.setParameters(bundle2);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("setParameters failed ret = ");
                sbLIZ4.append(e2);
                C1285320jYI.LIZLLL(this, "JAJMediaCodec", C2188811AlT.LIZIZ(sbLIZ4));
            }
        }
    }

    public int dequeueInputBuffer(long j) {
        try {
            C1285260jYC c1285260jYC = this.LJJ;
            if (c1285260jYC != null) {
                InterfaceC1285250jYB interfaceC1285250jYB = c1285260jYC.LIZIZ;
                if (interfaceC1285250jYB != null) {
                    return interfaceC1285250jYB.dequeueInputBuffer(j);
                }
                return C386801es.DEFAULT;
            }
            return this.LIZLLL.dequeueInputBuffer(j);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dequeueInputBuffer failed, exception: ");
            sbLIZ.append(e);
            C2188811AlT.LIZIZ(sbLIZ);
            return LIZJ(e);
        }
    }

    public boolean drmNeedSecureDecoder(String str) {
        boolean zRequiresSecureDecoderComponent;
        if (LIZLLL()) {
            C1285290jYF c1285290jYF = this.LJII;
            MediaCrypto mediaCrypto = c1285290jYF.LIZIZ;
            if (mediaCrypto != null) {
                zRequiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
            } else {
                zRequiresSecureDecoderComponent = false;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("drm needSecureDecoder=");
            sbLIZ.append(false);
            sbLIZ.append(", cryptoRequireSecureDecoder=");
            sbLIZ.append(zRequiresSecureDecoderComponent);
            C1285320jYI.LIZIZ(c1285290jYF, "AJMediaCodecDrmHelper", C2188811AlT.LIZIZ(sbLIZ));
        }
        return false;
    }

    public ByteBuffer getInputBuffer(int i) {
        if (this.LIZJ) {
            try {
                C1285260jYC c1285260jYC = this.LJJ;
                if (c1285260jYC != null) {
                    InterfaceC1285250jYB interfaceC1285250jYB = c1285260jYC.LIZIZ;
                    if (interfaceC1285250jYB == null) {
                        return null;
                    }
                    return interfaceC1285250jYB.LIZIZ().getInputBuffer(i);
                }
                return this.LIZLLL.getInputBuffer(i);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getInputBuffer failed, exception: ");
                sbLIZ.append(e);
                C1285320jYI.LIZ(this, "JAJMediaCodec", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return null;
    }

    public void setEnableMediaCodecSyncClose(int i) {
        LJJIJIIJI = i;
    }

    public void setEnableVC1BlockList(int i) {
        LJJIJ = i;
    }

    public void setHandler(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ttmn: setHandler ");
        sbLIZ.append(j);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LJIIJ = j;
    }

    public void setOutputFormatWorkround(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ttmn: outputFormatWorkround ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public int setOutputSurface(Surface surface) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setoutput surface = ");
        sbLIZ.append(surface);
        C2188811AlT.LIZIZ(sbLIZ);
        if (LJJIIJZLJL || !this.LIZJ) {
            return -1;
        }
        int i = 1;
        if (surface == null) {
            if (this.LJIIIIZZ == null) {
                if (LIZLLL()) {
                    if (this.LJII.LIZIZ != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    LIZ(z);
                } else {
                    LIZ(false);
                }
            }
            surface = this.LJIIIIZZ;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("setoutputSurface = ");
        sbLIZ2.append(surface);
        C2188811AlT.LIZIZ(sbLIZ2);
        MediaCodec mediaCodec = this.LIZLLL;
        try {
            C1285260jYC c1285260jYC = this.LJJ;
            if (c1285260jYC != null) {
                InterfaceC1285250jYB interfaceC1285250jYB = c1285260jYC.LIZIZ;
                if (interfaceC1285250jYB != null) {
                    interfaceC1285250jYB.setOutputSurface(surface);
                }
            } else {
                mediaCodec.setOutputSurface(surface);
            }
            if (this.LJIIIZ == 1 && this.LJIJ == 1) {
                synchronized (LJJIJIIJIL) {
                    try {
                        C786410Ut5.LJJZZIII(this.LJIIJJI, new ARunnableS120S0100000_20(this, 140));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return 0;
            }
            return 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LIZJ(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("setoutputsurface failed = ");
            sbLIZ3.append(e);
            C1285320jYI.LIZLLL(this, "JAJMediaCodec", C2188811AlT.LIZIZ(sbLIZ3));
            DummySurface dummySurface = this.LJIIIIZZ;
            if (dummySurface != null) {
                if (surface != dummySurface) {
                    i = 2;
                }
                dummySurface.addEvent(i);
            }
            if (!(e instanceof IllegalArgumentException)) {
                return -1;
            }
            return -10003;
        }
    }

    public void setSingleCodec(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ttmn: EnableSingleCodec ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LJIJI = i;
    }

    public void speedEnhance(float f) {
        MediaCodec mediaCodecLIZIZ;
        if ((this.LIZLLL != null || this.LJJ != null) && this.LIZJ && C1285020jXo.LIZ >= 23 && f > 30.0f) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("rate ");
            sbLIZ.append(f);
            C2188811AlT.LIZIZ(sbLIZ);
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", f);
            try {
                C1285260jYC c1285260jYC = this.LJJ;
                if (c1285260jYC != null) {
                    InterfaceC1285250jYB interfaceC1285250jYB = c1285260jYC.LIZIZ;
                    if (interfaceC1285250jYB != null && (mediaCodecLIZIZ = interfaceC1285250jYB.LIZIZ()) != null) {
                        mediaCodecLIZIZ.setParameters(bundle);
                        return;
                    }
                    return;
                }
                this.LIZLLL.setParameters(bundle);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setParameters failed ret = ");
                sbLIZ2.append(e);
                C1285320jYI.LIZLLL(this, "JAJMediaCodec", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }

    public int write(AJMediaCodecFrame aJMediaCodecFrame) {
        if (aJMediaCodecFrame != null && aJMediaCodecFrame.data != null) {
            try {
                int iDequeueInputBuffer = this.LIZLLL.dequeueInputBuffer(30000L);
                if (iDequeueInputBuffer >= 0) {
                    this.LIZIZ[iDequeueInputBuffer].put(aJMediaCodecFrame.data);
                    this.LIZLLL.queueInputBuffer(iDequeueInputBuffer, 0, aJMediaCodecFrame.size, aJMediaCodecFrame.pts, 0);
                    return 0;
                }
                if (iDequeueInputBuffer != -1) {
                    return -1;
                }
                return 4;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("write meet exception =");
                sbLIZ.append(e);
                C1285320jYI.LIZ(this, "JAJMediaCodec", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010e A[Catch: all -> 0x0149, TryCatch #1 {all -> 0x0149, blocks: (B:31:0x00af, B:33:0x00b3, B:35:0x00b9, B:37:0x00c3, B:42:0x00cb, B:55:0x00f3, B:57:0x00fb, B:58:0x00fd, B:66:0x0117, B:68:0x011f, B:63:0x010e, B:49:0x00e1, B:52:0x00ea, B:38:0x00c5, B:39:0x00c7), top: B:80:0x00af }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AJMediaCodec(int r7, int r8) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.AJMediaCodec.<init>(int, int):void");
    }

    public static String LIZIZ(String str, String str2) {
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return str2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return str2;
        }
    }

    public int getDolbyVisionProfileAndLevel(int i, int i2) {
        String[] strArrSplit;
        String strLIZ = C807510Vm1.LIZ(i, i2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dv codecs = ");
        sbLIZ.append(strLIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (strLIZ != null) {
            strArrSplit = strLIZ.split("\\.");
        } else {
            strArrSplit = null;
        }
        return ((Integer) C807510Vm1.LIZIZ(strArrSplit).first).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0070 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(com.ss.ttm.player.AJMediaCodecFrame r5, long r6) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.AJMediaCodec.read(com.ss.ttm.player.AJMediaCodecFrame, long):int");
    }

    public void setEnableUnifiedCodec(boolean z, boolean z2) {
        this.LJIJJLI = z;
        this.LJIL = z2;
    }

    public void setMode(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ttmn: mode ");
        sbLIZ.append(i);
        sbLIZ.append(", memcpyCrash ");
        sbLIZ.append(i2);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LJIIIZ = i;
        this.LJIJ = i2;
    }

    public static void LJ(MediaFormat mediaFormat, ByteBuffer byteBuffer, int i) {
        if (byteBuffer == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("csd-");
        sbLIZ.append(i);
        mediaFormat.setByteBuffer(C2188811AlT.LIZIZ(sbLIZ), byteBuffer);
    }

    public static void LJFF(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public int releaseBuffer(int i, boolean z, long j) {
        if (C1285020jXo.LIZ >= 21 && z) {
            try {
                C1285260jYC c1285260jYC = this.LJJ;
                if (c1285260jYC != null) {
                    InterfaceC1285250jYB interfaceC1285250jYB = c1285260jYC.LIZIZ;
                    if (interfaceC1285250jYB == null) {
                        return 0;
                    }
                    interfaceC1285250jYB.releaseOutputBuffer(i, j);
                    return 0;
                }
                this.LIZLLL.releaseOutputBuffer(i, j);
                return 0;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return -10000;
            }
        }
        try {
            C1285260jYC c1285260jYC2 = this.LJJ;
            if (c1285260jYC2 != null) {
                InterfaceC1285250jYB interfaceC1285250jYB2 = c1285260jYC2.LIZIZ;
                if (interfaceC1285250jYB2 != null) {
                    interfaceC1285250jYB2.releaseOutputBuffer(i, z);
                    return 0;
                }
            } else {
                this.LIZLLL.releaseOutputBuffer(i, z);
            }
            return 0;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return LIZJ(e2);
        }
    }

    private int openDrm(String str, String str2, String str3, String str4) {
        if (LIZLLL()) {
            C1285290jYF c1285290jYF = this.LJII;
            c1285290jYF.getClass();
            C2280261ENc c2280261ENc = new C2280261ENc(str, str2, str3, str4);
            C2280281ENe c2280281ENe = C2280281ENe.LIZJ;
            C1285300jYG c1285300jYGLIZIZ = c2280281ENe.LIZIZ(c2280261ENc);
            c1285290jYF.LIZ = c1285300jYGLIZIZ;
            if (c1285300jYGLIZIZ == null) {
                C1285320jYI.LIZ(c1285290jYF, "AJMediaCodecDrmHelper", "drm openDrm failed: AJMediaDrm is null");
            } else {
                MediaCrypto mediaCrypto = c1285300jYGLIZIZ.LIZIZ;
                c1285290jYF.LIZIZ = mediaCrypto;
                if (mediaCrypto == null) {
                    C1285320jYI.LIZ(c1285290jYF, "AJMediaCodecDrmHelper", "drm openDrm failed: MediaCrypto is null");
                    c2280281ENe.LIZ(c1285290jYF.LIZ);
                    c1285290jYF.LIZ = null;
                    return -1;
                }
                return 0;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getBestCodecName(java.lang.String r15, boolean r16, int r17, int r18) {
        /*
            Method dump skipped, instruction units count: 906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.AJMediaCodec.getBestCodecName(java.lang.String, boolean, int, int):java.lang.String");
    }

    public int queueInputBuffer(int i, int i2, int i3, long j, int i4, boolean z) {
        try {
            C1285260jYC c1285260jYC = this.LJJ;
            if (c1285260jYC != null) {
                InterfaceC1285250jYB interfaceC1285250jYB = c1285260jYC.LIZIZ;
                if (interfaceC1285250jYB != null) {
                    interfaceC1285250jYB.queueInputBuffer(i, i2, i3, j, i4);
                    return 0;
                }
                return 0;
            }
            if (z) {
                if (LIZLLL()) {
                    this.LIZLLL.queueSecureInputBuffer(i, i2, this.LJII.LIZJ, j, i4);
                    return 0;
                }
                return 0;
            }
            this.LIZLLL.queueInputBuffer(i, i2, i3, j, i4);
            return 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("queueInputBuffer failed, exception: ");
            sbLIZ.append(e);
            C1285320jYI.LIZ(this, "JAJMediaCodec", C2188811AlT.LIZIZ(sbLIZ));
            return LIZJ(e);
        }
    }

    public void fillMediaCodecCryptoInfo(byte[] bArr, byte[] bArr2, int i, int i2, int[] iArr, int[] iArr2, int i3, int i4) {
        if (LIZLLL()) {
            C1285290jYF c1285290jYF = this.LJII;
            if (c1285290jYF.LIZJ == null) {
                c1285290jYF.LIZJ = new MediaCodec.CryptoInfo();
            }
            MediaCodec.CryptoInfo cryptoInfo = c1285290jYF.LIZJ;
            cryptoInfo.mode = i4;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.numSubSamples = i3;
            int[] iArr3 = cryptoInfo.numBytesOfClearData;
            if (iArr3 == null || iArr3.length < i3) {
                cryptoInfo.numBytesOfClearData = new int[i3];
            }
            int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
            if (iArr4 == null || iArr4.length < i3) {
                cryptoInfo.numBytesOfEncryptedData = new int[i3];
            }
            for (int i5 = 0; i5 < i3; i5++) {
                MediaCodec.CryptoInfo cryptoInfo2 = c1285290jYF.LIZJ;
                cryptoInfo2.numBytesOfClearData[i5] = iArr[i5];
                cryptoInfo2.numBytesOfEncryptedData[i5] = iArr2[i5];
            }
            c1285290jYF.LIZJ.setPattern(new MediaCodec.CryptoInfo.Pattern(i, i2));
        }
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    public int configure(int i, int i2, int i3, int i4, int i5, String str, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, Surface surface, boolean z, boolean z2, int i6, int i7, boolean z3, int i8, boolean z4, boolean z5, int i9, int i10, int i11) {
        int i12;
        String[] strArrSplit;
        MediaCodecInfo mediaCodecInfo;
        String str2;
        int i13;
        boolean z6;
        int i14;
        int i15;
        int i16 = i7;
        int i17 = i6;
        Surface surface2 = surface;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ttmn: configure =");
        sbLIZ.append(surface2);
        sbLIZ.append(", surfaceConfigure =");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        int i18 = C1285020jXo.LIZ;
        if (i18 >= 21 && this.LJJ == null && LJIIJ(this.LJIIIZ) == -1) {
            return -1;
        }
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        LJFF(mediaFormat, "width", i);
        LJFF(mediaFormat, "height", i2);
        if (i17 != -1 && i16 != -1) {
            if (i17 <= i) {
                i17 = i;
            }
            LJFF(mediaFormat, "max-width", i17);
            if (i16 <= i2) {
                i16 = i2;
            }
            LJFF(mediaFormat, "max-height", i16);
        }
        LJFF(mediaFormat, "sample-rate", i4);
        LJFF(mediaFormat, "channel-count", i5);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("format  = ");
        sbLIZ2.append(mediaFormat);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (i != -1 && i2 != -1) {
            if (!str.equals("video/3gpp") && !str.equals("video/mp4v-es")) {
                if (str.equals("video/avc")) {
                    if (!"BRAVIA 4K 2015".equals(C1285020jXo.LIZLLL)) {
                        i14 = (((i + 16) - 1) / 16) * (((i2 + 16) - 1) / 16) * 16 * 16;
                        i15 = 2;
                        i12 = (i14 * 3) / (i15 * 2);
                    }
                } else {
                    if (!str.equals("video/x-vnd.on2.vp8")) {
                        if (str.equals("video/hevc") || str.equals("video/x-vnd.on2.vp9")) {
                            i14 = i * i2;
                            i15 = 4;
                            i12 = (i14 * 3) / (i15 * 2);
                        }
                    }
                    i14 = i * i2;
                    i15 = 2;
                    i12 = (i14 * 3) / (i15 * 2);
                }
                i12 = -1;
            } else {
                i14 = i * i2;
                i15 = 2;
                i12 = (i14 * 3) / (i15 * 2);
            }
        } else {
            i12 = -1;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("max input = ");
        sbLIZ3.append(i12);
        C2188811AlT.LIZIZ(sbLIZ3);
        LJFF(mediaFormat, "max-input-size", i12);
        LJ(mediaFormat, byteBuffer, 0);
        LJ(mediaFormat, byteBuffer2, 1);
        LJ(mediaFormat, byteBuffer3, 2);
        if (z) {
            if (i18 >= 21) {
                LJFF(mediaFormat, "rotation-degrees", i3);
            }
            if (surface2 == null || !surface2.isValid()) {
                if (this.LJIIIIZZ == null && i18 >= 23 && !LJJIIJZLJL) {
                    if (LIZLLL()) {
                        if (this.LJII.LIZIZ != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        LIZ(z6);
                    } else {
                        LIZ(false);
                    }
                    surface2 = this.LJIIIIZZ;
                }
                if (surface2 == null) {
                    this.LJIJJ = "Error: configure with null surface";
                    return -10003;
                }
            }
        }
        if (i18 >= 23 && z2) {
            mediaFormat.setInteger("priority", 0);
        }
        if (z3) {
            mediaFormat.setString("vendor.qti-ext-vpp.mode", "HQV_MODE_MANUAL");
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        mediaFormat.setInteger("vendor.qti-ext-vpp-cade.cade-level", 15);
                        mediaFormat.setInteger("vendor.qti-ext-vpp-aie.ltm-sat-gain", 70);
                        mediaFormat.setInteger("vendor.qti-ext-vpp-aie.ltm-sat-offset", 70);
                        mediaFormat.setInteger("vendor.qti-ext-vpp-aie.ltm-ace-str", 50);
                        mediaFormat.setInteger("vendor.qti-ext-vpp-aie.ltm-ace-brightness-low", 20);
                        mediaFormat.setInteger("vendor.qti-ext-vpp-aie.ltm-ace-brightness-high", 20);
                    }
                } else {
                    i13 = 20;
                }
            } else {
                i13 = 10;
            }
            mediaFormat.setInteger("vendor.qti-ext-vpp-cade.cade-level", i13);
            mediaFormat.setInteger("vendor.qti-ext-vpp-aie.ltm-sat-gain", 65);
            mediaFormat.setInteger("vendor.qti-ext-vpp-aie.ltm-sat-offset", 60);
            mediaFormat.setInteger("vendor.qti-ext-vpp-aie.ltm-ace-str", 50);
            mediaFormat.setInteger("vendor.qti-ext-vpp-aie.ltm-ace-brightness-low", 20);
            mediaFormat.setInteger("vendor.qti-ext-vpp-aie.ltm-ace-brightness-high", 20);
        }
        if (z4) {
            mediaFormat.setInteger("vendor.qti-ext-vpp-demo.process-percent", 50);
        }
        if (z5) {
            mediaFormat.setInteger("vendor.qti-ext-dec-low-latency.enable", 1);
        }
        if (i11 > 0 && Build.VERSION.SDK_INT >= 30 && (mediaCodecInfo = this.LJIILL) != null && (str2 = this.LJIILLIIL) != null) {
            try {
                if (mediaCodecInfo.getCapabilitiesForType(str2).isFeatureSupported("low-latency") > 0) {
                    LJFF(mediaFormat, "low-latency", 1);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (i10 > 0 && i9 >= 0) {
            String strLIZ = C807510Vm1.LIZ(i9, i10);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("dv codecs = ");
            sbLIZ4.append(strLIZ);
            C2188811AlT.LIZIZ(sbLIZ4);
            if (strLIZ != null) {
                strArrSplit = strLIZ.split("\\.");
            } else {
                strArrSplit = null;
            }
            Pair pairLIZIZ = C807510Vm1.LIZIZ(strArrSplit);
            if (pairLIZIZ != null) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("dv profile & level  = ");
                sbLIZ5.append(pairLIZIZ.toString());
                C2188811AlT.LIZIZ(sbLIZ5);
                LJFF(mediaFormat, "profile", ((Integer) pairLIZIZ.first).intValue());
            }
        }
        try {
            if (this.LJIJJLI) {
                this.LJJ.LIZ(mediaFormat, surface2);
            } else if (LIZLLL()) {
                this.LIZLLL.configure(mediaFormat, surface2, this.LJII.LIZIZ, 0);
            } else {
                this.LIZLLL.configure(mediaFormat, surface2, (MediaCrypto) null, 0);
            }
            if (C1285020jXo.LIZ >= 21 && this.LJJ != null && LJIIJ(this.LJIIIZ) == -1) {
                return -1;
            }
            return 0;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            LIZJ(e2);
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("configure failed = ");
            sbLIZ6.append(this.LIZLLL);
            sbLIZ6.append(", ex=");
            sbLIZ6.append(e2.toString());
            C2188811AlT.LIZIZ(sbLIZ6);
            if (!(e2 instanceof IllegalArgumentException)) {
                return -1;
            }
            return -10003;
        }
    }
}
