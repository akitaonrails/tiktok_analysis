package com.ss.android.ttve.nativePort;

import X.C1C7U;
import X.C2188811AlT;
import X.C2484209oO;
import X.C2490909pT;
import X.C2491009pU;
import X.C2491109pV;
import X.C786410Ut5;
import X.InterfaceC1286300jZs;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class VEBingoManager {
    public static int Bingo_TransBlack;
    public static int Bingo_TransDissolve;
    public static int Bingo_TransNull;
    public static int Bingo_TransWhite;
    public static int Bingo_TransZoomIn;
    public static int Bingo_TransZoomOut;
    public Handler imageHandler;
    public HandlerThread imageHandlerThread;
    public Map<Integer, HandlerThread> workThreadMap = new HashMap();
    public Map<Integer, Handler> workThreadHandlerMap = new HashMap();
    public volatile long mNative = 0;

    private native int[] addVideoClipsByNative(long j, String[] strArr, int i);

    private native VETransitionResult[] getBingoTransitionResultsByNative(long j);

    private native long init(int i);

    private native int processBingoImageFrameByNative(long j, Bitmap bitmap, float f, String str);

    private native int processBingoVideoFrameByNative(long j, ByteBuffer byteBuffer, int i, int i2, float f, String str);

    public native int destroy(long j);

    private void reset() {
        for (HandlerThread handlerThread : this.workThreadMap.values()) {
            if (handlerThread != null) {
                handlerThread.quit();
            }
        }
        this.workThreadMap.clear();
        this.workThreadHandlerMap.clear();
        HandlerThread handlerThread2 = this.imageHandlerThread;
        if (handlerThread2 != null) {
            handlerThread2.quit();
        }
        this.imageHandlerThread = null;
        this.imageHandler = null;
    }

    public VETransitionResult[] getBingoTransitionResults() {
        if (this.mNative <= 0) {
            return null;
        }
        return getBingoTransitionResultsByNative(this.mNative);
    }

    static {
        TENativeLibsLoader.loadLibrary();
        Bingo_TransNull = 0;
        Bingo_TransDissolve = 1;
        Bingo_TransBlack = 2;
        Bingo_TransWhite = 3;
        Bingo_TransZoomOut = 4;
        Bingo_TransZoomIn = 5;
    }

    public void destroy() {
        reset();
        if (this.mNative > 0) {
            destroy(this.mNative);
            this.mNative = 0L;
        }
    }

    public long initBingoWithTransition() {
        reset();
        if (this.mNative > 0) {
            return this.mNative;
        }
        this.mNative = init(1);
        return this.mNative;
    }

    public class GetImageFrameToProcessHandler extends BPEAHandler {
        public final String[] LL;
        public final List<Integer> LLILLJJLI;
        public final C2491109pV LLILLL;
        public final AtomicInteger LLILZ;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            boolean z;
            C1C7U.LIZ("VEBingoManager$GetImageFrameToProcessHandler@a61c.handleMessage");
            super.handleMessage(message);
            if (message.what == 1 && !this.LLILLL.LIZIZ && this.LLILZ.get() < this.LLILLJJLI.size()) {
                String str = this.LL[((Integer) ListProtector.get(this.LLILLJJLI, this.LLILZ.getAndIncrement())).intValue()];
                Bitmap bitmapDecodeBitmap = VEBingoManager.this.decodeBitmap(str);
                if (bitmapDecodeBitmap != null && !bitmapDecodeBitmap.isRecycled()) {
                    int iProcessBingoImageFrame = VEBingoManager.this.processBingoImageFrame(bitmapDecodeBitmap, 0.0f, str);
                    bitmapDecodeBitmap.recycle();
                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmapDecodeBitmap);
                    if (iProcessBingoImageFrame < 0) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("processBingoImageFrame fail, path: ");
                        sbLIZ.append(str);
                        C2484209oO.LIZJ("VEBingoManager", C2188811AlT.LIZIZ(sbLIZ));
                        C2491109pV c2491109pV = this.LLILLL;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("processBingoImageFrame fail, path: ");
                        sbLIZ2.append(str);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        c2491109pV.LIZ();
                    } else {
                        C2491109pV c2491109pV2 = this.LLILLL;
                        synchronized (c2491109pV2) {
                            c2491109pV2.LIZ.incrementAndGet();
                            if (c2491109pV2.LIZIZ) {
                                z = c2491109pV2.LIZIZ;
                            } else {
                                throw null;
                            }
                        }
                        if (!z) {
                            Message.obtain(this, 1).sendToTarget();
                        }
                    }
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("decodeBitmap fail, path: ");
                    sbLIZ3.append(str);
                    C2484209oO.LIZJ("VEBingoManager", C2188811AlT.LIZIZ(sbLIZ3));
                    C2491109pV c2491109pV3 = this.LLILLL;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("decodeBitmap fail, path: ");
                    sbLIZ4.append(str);
                    C2188811AlT.LIZIZ(sbLIZ4);
                    c2491109pV3.LIZ();
                }
            }
            C1C7U.LIZIZ("VEBingoManager$GetImageFrameToProcessHandler@a61c.handleMessage");
        }

        public GetImageFrameToProcessHandler(Looper looper, String[] strArr, List<Integer> list, C2491109pV c2491109pV) {
            super(looper);
            new TEVideoUtilsCallback();
            this.LLILZ = new AtomicInteger(0);
            this.LL = strArr;
            this.LLILLJJLI = list;
            this.LLILLL = c2491109pV;
        }
    }

    public class GetVideoFrameToProcessHandler extends BPEAHandler {
        public final Map<Integer, int[]> LL;
        public final String[] LLILLJJLI;
        public final Map<Integer, C2490909pT> LLILLL;
        public final List<Integer> LLILZ;
        public final C2491109pV LLILZIL;
        public final TEVideoUtilsCallback LLILZLL;
        public final AtomicInteger LLIZ;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("VEBingoManager$GetVideoFrameToProcessHandler@cae6.handleMessage");
            super.handleMessage(message);
            if (message.what == 1 && !this.LLILZIL.LIZIZ && this.LLIZ.get() < this.LLILZ.size()) {
                final int iIntValue = ((Integer) ListProtector.get(this.LLILZ, this.LLIZ.getAndIncrement())).intValue();
                final String str = this.LLILLJJLI[iIntValue];
                int[] iArr = this.LL.get(Integer.valueOf(iIntValue));
                C2490909pT c2490909pT = this.LLILLL.get(Integer.valueOf(iIntValue));
                TEVideoUtilsCallback tEVideoUtilsCallback = this.LLILZLL;
                final VEBingoManager vEBingoManager = VEBingoManager.this;
                final int length = iArr.length;
                final C2491009pU c2491009pU = new C2491009pU(this, iIntValue, str);
                tEVideoUtilsCallback.setListener(new InterfaceC1286300jZs(iIntValue, str, length, c2491009pU) { // from class: X.09pS
                    public final int LIZ;
                    public final String LIZIZ;
                    public volatile int LIZJ;
                    public final AtomicInteger LIZLLL = new AtomicInteger(0);
                    public final InterfaceC2491309pX LJ;

                    /* JADX WARN: Removed duplicated region for block: B:19:0x00de A[RETURN] */
                    @Override // X.InterfaceC1286300jZs
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final boolean processFrame(java.nio.ByteBuffer r12, int r13, int r14, int r15) {
                        /*
                            Method dump skipped, instruction units count: 232
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C2490809pS.processFrame(java.nio.ByteBuffer, int, int, int):boolean");
                    }

                    {
                        this.LIZ = iIntValue;
                        this.LIZIZ = str;
                        this.LIZJ = length;
                        this.LJ = c2491009pU;
                    }
                });
                int iNativeGetVideoFrameMore = TEVideoUtils.nativeGetVideoFrameMore(str, iArr, c2490909pT.LIZ, c2490909pT.LIZIZ, false, false, 1, true, this.LLILZLL);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getVideoFramesMore result: ");
                sbLIZ.append(iNativeGetVideoFrameMore);
                sbLIZ.append(" , index: ");
                sbLIZ.append(iIntValue);
                sbLIZ.append(", videoPath: ");
                sbLIZ.append(str);
                sbLIZ.append(", thread: ");
                sbLIZ.append(C786410Ut5.u3().getName());
                C2484209oO.LJI("VEBingoManager", C2188811AlT.LIZIZ(sbLIZ));
                if (iNativeGetVideoFrameMore != 0) {
                    removeCallbacksAndMessages(null);
                    this.LLILZIL.LIZ();
                }
            }
            C1C7U.LIZIZ("VEBingoManager$GetVideoFrameToProcessHandler@cae6.handleMessage");
        }

        public GetVideoFrameToProcessHandler(Looper looper, Map<Integer, int[]> map, String[] strArr, Map<Integer, C2490909pT> map2, List<Integer> list, C2491109pV c2491109pV) {
            super(looper);
            this.LLILZLL = new TEVideoUtilsCallback();
            this.LLIZ = new AtomicInteger(0);
            this.LL = map;
            this.LLILLJJLI = strArr;
            this.LLILLL = map2;
            this.LLILZ = list;
            this.LLILZIL = c2491109pV;
        }
    }

    public Bitmap decodeBitmap(String str) {
        int i;
        int i2;
        int i3;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int i4 = options.outWidth;
            if (i4 > 0 && (i = options.outHeight) > 0) {
                int i5 = 320;
                if (i4 > i) {
                    float f = (i4 * 1.0f) / 320.0f;
                    i2 = (int) f;
                    int i6 = (int) (i / f);
                    int i7 = i6 % 16;
                    if (i7 >= 8) {
                        i6 += 16;
                    }
                    i3 = i6 - i7;
                } else {
                    float f2 = (i * 1.0f) / 320.0f;
                    i2 = (int) f2;
                    int i8 = (int) (i4 / f2);
                    int i9 = i8 % 16;
                    if (i9 >= 8) {
                        i8 += 16;
                    }
                    i5 = i8 - i9;
                    i3 = 320;
                }
                if (i5 > 0 && i3 > 0) {
                    if (i2 > 1) {
                        options.inSampleSize = i2;
                    }
                    options.inJustDecodeBounds = false;
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
                    if (bitmapDecodeFile == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("BitmapFactory.decodeFile(inJustDecodeBounds false) failed: ");
                        sbLIZ.append(str);
                        C2484209oO.LIZJ("VEBingoManager", C2188811AlT.LIZIZ(sbLIZ));
                        return null;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("imagePath: ");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", origin size: ");
                    sbLIZ2.append(i4);
                    sbLIZ2.append("*");
                    sbLIZ2.append(i);
                    sbLIZ2.append(", scale size: ");
                    sbLIZ2.append(i5);
                    sbLIZ2.append("*");
                    sbLIZ2.append(i3);
                    sbLIZ2.append(", inSampleSize: ");
                    sbLIZ2.append(i2);
                    sbLIZ2.append(", final size: ");
                    sbLIZ2.append(bitmapDecodeFile.getWidth());
                    sbLIZ2.append("*");
                    sbLIZ2.append(bitmapDecodeFile.getHeight());
                    sbLIZ2.append(", thread: ");
                    sbLIZ2.append(C786410Ut5.u3().getName());
                    C2484209oO.LJI("VEBingoManager", C2188811AlT.LIZIZ(sbLIZ2));
                    if (bitmapDecodeFile.getConfig() != Bitmap.Config.ARGB_8888 || bitmapDecodeFile.getWidth() != i5 || bitmapDecodeFile.getHeight() != i3) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("switch bitmap, config from ");
                        sbLIZ3.append(bitmapDecodeFile.getConfig().name());
                        sbLIZ3.append(" to ");
                        sbLIZ3.append(Bitmap.Config.ARGB_8888.name());
                        sbLIZ3.append(", size from ");
                        sbLIZ3.append(bitmapDecodeFile.getWidth());
                        sbLIZ3.append("*");
                        sbLIZ3.append(bitmapDecodeFile.getHeight());
                        sbLIZ3.append(" to ");
                        sbLIZ3.append(i5);
                        sbLIZ3.append("*");
                        sbLIZ3.append(i3);
                        C2484209oO.LJI("VEBingoManager", C2188811AlT.LIZIZ(sbLIZ3));
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i5, i3, Bitmap.Config.ARGB_8888);
                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeFile, (Rect) null, new RectF(0.0f, 0.0f, i5, i3), (Paint) null);
                        bitmapDecodeFile.recycle();
                        BitmapCrashChecker.recordBitmapRecyclePoint(bitmapDecodeFile);
                        return bitmapCreateBitmap;
                    }
                    return bitmapDecodeFile;
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("imagePath: ");
                sbLIZ4.append(str);
                sbLIZ4.append(" invalid scale size, scaleWidth: ");
                sbLIZ4.append(i5);
                sbLIZ4.append(", scaleHeight: ");
                sbLIZ4.append(i3);
                sbLIZ4.append(", bitmap origin width: ");
                sbLIZ4.append(i4);
                sbLIZ4.append(", height: ");
                sbLIZ4.append(i);
                C2484209oO.LIZJ("VEBingoManager", C2188811AlT.LIZIZ(sbLIZ4));
                return null;
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("inJustDecodeBounds true, invalid out size, outWidth: ");
            sbLIZ5.append(options.outWidth);
            sbLIZ5.append(", outHeight: ");
            sbLIZ5.append(options.outHeight);
            C2484209oO.LIZJ("VEBingoManager", C2188811AlT.LIZIZ(sbLIZ5));
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("decodeBitmap, imagePath: ");
            sbLIZ6.append(str);
            sbLIZ6.append(", exception: ");
            sbLIZ6.append(e.toString());
            C2484209oO.LIZJ("VEBingoManager", C2188811AlT.LIZIZ(sbLIZ6));
            return null;
        }
    }

    private int[] addVideoClips(String[] strArr, int i) {
        if (this.mNative <= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("addVideoClips, invalid mNative: ");
            sbLIZ.append(this.mNative);
            C2484209oO.LIZJ("VEBingoManager", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        return addVideoClipsByNative(this.mNative, strArr, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void saveBitmap(java.lang.String r5, android.graphics.Bitmap r6) throws java.lang.Throwable {
        /*
            r4 = this;
            X.0VSJ r1 = new X.0VSJ
            r1.<init>(r5)
            java.io.File r0 = r1.getParentFile()
            boolean r0 = r0.exists()
            if (r0 != 0) goto L16
            java.io.File r0 = r1.getParentFile()
            r0.mkdir()
        L16:
            r3 = 0
            X.0VSV r2 = new X.0VSV     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L42
            r0 = 100
            r6.compress(r1, r0, r2)     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L42
            r2.flush()     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L42
            r2.close()     // Catch: java.io.IOException -> L2a
            goto L2c
        L2a:
            r0 = move-exception
            goto L3e
        L2c:
            return
        L2d:
            r0 = move-exception
            goto L34
        L2f:
            r1 = move-exception
            r2 = r3
            goto L43
        L32:
            r0 = move-exception
            r2 = r3
        L34:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L41
            r2.close()     // Catch: java.io.IOException -> L3d
            return
        L3d:
            r0 = move-exception
        L3e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L41:
            return
        L42:
            r1 = move-exception
        L43:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L50
            r2.close()     // Catch: java.io.IOException -> L4c
            throw r1
        L4c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L50:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.nativePort.VEBingoManager.saveBitmap(java.lang.String, android.graphics.Bitmap):void");
    }

    public int processBingoImageFrame(Bitmap bitmap, float f, String str) {
        if (this.mNative <= 0) {
            return -112;
        }
        return processBingoImageFrameByNative(this.mNative, bitmap, f, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017c A[LOOP:2: B:80:0x0175->B:82:0x017c, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void detectTransition(java.lang.String[] r30, int r31, int r32, X.InterfaceC2491209pW r33) {
        /*
            Method dump skipped, instruction units count: 1064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.nativePort.VEBingoManager.detectTransition(java.lang.String[], int, int, X.09pW):void");
    }

    public int processBingoVideoFrame(ByteBuffer byteBuffer, int i, int i2, float f, String str) {
        if (this.mNative <= 0) {
            return -112;
        }
        return processBingoVideoFrameByNative(this.mNative, byteBuffer, i, i2, f, str);
    }
}
