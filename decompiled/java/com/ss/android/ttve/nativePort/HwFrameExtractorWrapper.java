package com.ss.android.ttve.nativePort;

import X.C1286190jZh;
import X.C1286230jZl;
import X.C1286250jZn;
import X.C1286290jZr;
import X.C2188811AlT;
import X.C2484209oO;
import X.C786410Ut5;
import X.EnumC2185621AgK;
import X.InterfaceC1286300jZs;
import Y.ARunnableS120S0100000_20;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.common.TEImageUtils;
import com.ss.android.ttve.model.VEFrame;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class HwFrameExtractorWrapper {
    public static final String TAG = "HwFrameExtractorWrapper";
    public C1286230jZl mExtractor;
    public C1286250jZn mExtractorRange;
    public long mNativeAddr;

    public native boolean nativeOnFrameAvailable(long j, ByteBuffer byteBuffer, int i, int i2, int i3);

    public void stop() {
        C1286230jZl c1286230jZl = this.mExtractor;
        if (c1286230jZl != null) {
            c1286230jZl.LJIL = true;
            if (c1286230jZl.LJIIZILJ != null) {
                try {
                    C786410Ut5.LJJZZIII(new BPEAHandler(C786410Ut5.W2(c1286230jZl.LJIIZILJ)), new ARunnableS120S0100000_20(c1286230jZl, 78));
                    synchronized (c1286230jZl.LJIILJJIL) {
                        try {
                            if (!c1286230jZl.LJIJJLI) {
                                c1286230jZl.LJIILJJIL.wait();
                            }
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                    c1286230jZl.LJIIZILJ.quitSafely();
                } catch (InterruptedException th) {
                }
            }
            this.mExtractor = null;
        }
        C1286250jZn c1286250jZn = this.mExtractorRange;
        if (c1286250jZn != null) {
            c1286250jZn.getClass();
            this.mExtractorRange = null;
        }
    }

    public HwFrameExtractorWrapper(long j) {
        this.mNativeAddr = j;
    }

    public static HwFrameExtractorWrapper create(long j) {
        return new HwFrameExtractorWrapper(j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0jZp] */
    public void startExtractFrame(String str, int[] iArr, int i, int i2, int i3, int i4) {
        boolean z;
        int iIntValue;
        final long j = this.mNativeAddr;
        final C1286230jZl c1286230jZl = new C1286230jZl(str, iArr, i, i2, i3, i4, new InterfaceC1286300jZs() { // from class: X.0jZp
            @Override // X.InterfaceC1286300jZs
            public final boolean processFrame(ByteBuffer byteBuffer, int i5, int i6, int i7) {
                return this.LIZIZ.nativeOnFrameAvailable(j, byteBuffer, i5, i6, i7);
            }
        });
        this.mExtractor = c1286230jZl;
        try {
            C2484209oO.LJI(c1286230jZl.LIZIZ, "method start begin");
            try {
                if (c1286230jZl.LIZLLL.length <= 0) {
                    String str2 = c1286230jZl.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ptsMs.length is wrong: ");
                    sbLIZ.append(c1286230jZl.LIZLLL.length);
                    C2484209oO.LJI(str2, C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                c1286230jZl.LJIL = false;
                C1286230jZl.LJ();
                System.currentTimeMillis();
                MediaExtractor mediaExtractor = new MediaExtractor();
                MediaFormat mediaFormat = null;
                if (c1286230jZl.LIZJ.startsWith("content:")) {
                    String str3 = c1286230jZl.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("strMediaFile is content uri, ");
                    sbLIZ2.append(c1286230jZl.LIZJ);
                    C2484209oO.LJI(str3, C2188811AlT.LIZIZ(sbLIZ2));
                    if (TEContentProviderUtils.getApplicationContext() != null) {
                        mediaExtractor.setDataSource(TEContentProviderUtils.getApplicationContext(), UriProtector.parse(c1286230jZl.LIZJ), (Map<String, String>) null);
                    } else {
                        C2484209oO.LJIIIIZZ(c1286230jZl.LIZIZ, "get application failed.");
                        mediaExtractor.setDataSource(c1286230jZl.LIZJ);
                    }
                } else {
                    mediaExtractor.setDataSource(c1286230jZl.LIZJ);
                }
                int i5 = c1286230jZl.LJ;
                int i6 = c1286230jZl.LJFF;
                for (int i7 = 0; i7 < mediaExtractor.getTrackCount(); i7++) {
                    MediaFormat trackFormat = mediaExtractor.getTrackFormat(i7);
                    String string = trackFormat.getString("mime");
                    if (string.startsWith("video")) {
                        c1286230jZl.LJJI = string.equals("video/avc");
                        c1286230jZl.LJJIFFI = string.equals("video/hevc");
                        c1286230jZl.LJIILL = trackFormat.getInteger("width");
                        c1286230jZl.LJIILLIIL = trackFormat.getInteger("height");
                        if (trackFormat.containsKey("rotation-degrees")) {
                            c1286230jZl.LJIILIIL = trackFormat.getInteger("rotation-degrees");
                        }
                        if (c1286230jZl.LJIILIIL != 0) {
                            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(((c1286230jZl.LJ * c1286230jZl.LJFF) * 3) / 2);
                            byteBufferAllocateDirect.clear();
                            c1286230jZl.LJIIJJI = VEFrame.createByteBufferFrame(byteBufferAllocateDirect, c1286230jZl.LJ, c1286230jZl.LJFF, 0, 0L, EnumC2185621AgK.TEPixFmt_YUV420P);
                            int i8 = c1286230jZl.LJIILIIL;
                            if (i8 == 90 || i8 == 270) {
                                i5 = c1286230jZl.LJFF;
                                i6 = c1286230jZl.LJ;
                            }
                        }
                        mediaExtractor.selectTrack(i7);
                        mediaFormat = trackFormat;
                    }
                }
                if (c1286230jZl.LJIIIZ == null) {
                    ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(((i5 * i6) * 3) / 2);
                    byteBufferAllocateDirect2.clear();
                    c1286230jZl.LJIIIZ = VEFrame.createByteBufferFrame(byteBufferAllocateDirect2, i5, i6, c1286230jZl.LJIILIIL, 0L, EnumC2185621AgK.TEPixFmt_YUV420P);
                }
                c1286230jZl.LJIIL = MediaCodec.createDecoderByType("video/avc");
                ArrayList arrayList = new ArrayList();
                mediaExtractor.seekTo(c1286230jZl.LIZLLL[0], 2);
                ArrayList arrayList2 = new ArrayList();
                int i9 = c1286230jZl.LJI;
                while (true) {
                    long sampleTime = mediaExtractor.getSampleTime();
                    if (sampleTime < 0 && mediaExtractor.advance()) {
                        c1286230jZl.LJJ = true;
                        break;
                    }
                    arrayList2.add(Long.valueOf(sampleTime));
                    if (mediaExtractor.getSampleFlags() == 1) {
                        z = true;
                        arrayList.add(Long.valueOf(sampleTime));
                    } else {
                        z = false;
                    }
                    int[] iArr2 = c1286230jZl.LIZLLL;
                    if (sampleTime > iArr2[iArr2.length - 1] && z) {
                        i9--;
                    }
                    try {
                        if (mediaExtractor.advance() && i9 > 0) {
                        }
                    } catch (Exception e) {
                        e = e;
                    } catch (OutOfMemoryError e2) {
                        e = e2;
                        TryCatchGuardChecker.doCheck(e);
                        C2484209oO.LJI(c1286230jZl.LIZIZ, "start crash oom");
                        Runtime.getRuntime().gc();
                        c1286230jZl.LIZJ();
                        c1286230jZl.LIZLLL();
                        return;
                    }
                }
                try {
                    if (c1286230jZl.LJJ) {
                        C2484209oO.LJI(c1286230jZl.LIZIZ, "start wrong");
                        c1286230jZl.LIZJ();
                        return;
                    }
                    Collections.sort(arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    int length = c1286230jZl.LIZLLL.length;
                    final List[] listArr = new List[length];
                    int size = arrayList2.size();
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < size && i11 < c1286230jZl.LIZLLL.length) {
                        if (((Long) arrayList2.get(i10)).longValue() < c1286230jZl.LIZLLL[i11]) {
                            i10++;
                        } else {
                            if (listArr[i11] == null) {
                                listArr[i11] = new ArrayList();
                            }
                            for (int i12 = 0; i12 < c1286230jZl.LJI; i12++) {
                                int i13 = i10 + i12;
                                if (i13 < size) {
                                    Long l = (Long) arrayList2.get(i13);
                                    listArr[i11].add(l);
                                    arrayList3.add(l);
                                }
                            }
                            i10++;
                            i11++;
                        }
                    }
                    int[] iArr3 = c1286230jZl.LIZLLL;
                    if (listArr[iArr3.length - 1] != null && listArr[iArr3.length - 1].size() == 1) {
                        int[] iArr4 = c1286230jZl.LIZLLL;
                        listArr[iArr4.length - 1].add(listArr[iArr4.length - 1].get(0));
                        listArr[c1286230jZl.LIZLLL.length - 1].set(0, arrayList2.get(arrayList2.size() - 2));
                        arrayList3.add((Long) arrayList3.get(arrayList3.size() - 1));
                    }
                    for (int i14 = 0; i14 < length; i14++) {
                        List list = listArr[i14];
                        for (int i15 = 0; i15 < list.size(); i15++) {
                            String str4 = c1286230jZl.LIZIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("sensArray i: ");
                            sbLIZ3.append(i15);
                            sbLIZ3.append(" value: ");
                            sbLIZ3.append(list.get(i15).toString());
                            C2484209oO.LJI(str4, C2188811AlT.LIZIZ(sbLIZ3));
                        }
                    }
                    mediaExtractor.seekTo(c1286230jZl.LIZLLL[0], 0);
                    c1286230jZl.LJIIZILJ = new HandlerThread("MediaCodec Callback");
                    String str5 = c1286230jZl.LIZIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("getVideoFramesHW: mCodecHandlerThread = ");
                    sbLIZ4.append(c1286230jZl.LJIIZILJ.getThreadId());
                    sbLIZ4.append(", curr-threadId = ");
                    sbLIZ4.append(c1286230jZl.LIZ);
                    C2484209oO.LJI(str5, C2188811AlT.LIZIZ(sbLIZ4));
                    c1286230jZl.LJIIZILJ.start();
                    c1286230jZl.LJIIL.setCallback(new C1286190jZh(c1286230jZl, mediaExtractor, arrayList3, listArr, arrayList), new BPEAHandler(C786410Ut5.W2(c1286230jZl.LJIIZILJ)));
                    c1286230jZl.LJIJ = new HandlerThread("ImageReader Callback");
                    String str6 = c1286230jZl.LIZIZ;
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("getVideoFramesHW: mReaderHandlerThread = ");
                    sbLIZ5.append(c1286230jZl.LJIJ.getThreadId());
                    sbLIZ5.append(", curr-threadId = ");
                    sbLIZ5.append(c1286230jZl.LIZ);
                    C2484209oO.LJI(str6, C2188811AlT.LIZIZ(sbLIZ5));
                    c1286230jZl.LJIJ.start();
                    BPEAHandler bPEAHandler = new BPEAHandler(C786410Ut5.W2(c1286230jZl.LJIJ));
                    ImageReader imageReaderNewInstance = ImageReader.newInstance(c1286230jZl.LJIILL, c1286230jZl.LJIILLIIL, 35, 2);
                    c1286230jZl.LJIJI = imageReaderNewInstance;
                    imageReaderNewInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: X.0jZj
                        public int LL;
                        public final List<Long> LLILLJJLI = new ArrayList();

                        @Override // android.media.ImageReader.OnImageAvailableListener
                        public final void onImageAvailable(ImageReader imageReader) {
                            VEFrame vEFrameCreateYUVPlanFrame;
                            VEFrame vEFrame;
                            try {
                                synchronized (c1286230jZl) {
                                    try {
                                        Image imageAcquireNextImage = imageReader.acquireNextImage();
                                        long timestamp = imageAcquireNextImage.getTimestamp() / 1000;
                                        if (listArr[this.LL].contains(Long.valueOf(timestamp))) {
                                            if (c1286230jZl.LJII != null) {
                                                if (imageAcquireNextImage.getFormat() == 35) {
                                                    if (imageAcquireNextImage.getPlanes() != null && imageAcquireNextImage.getPlanes()[1].getPixelStride() > 1) {
                                                        C1284350jWj c1284350jWj = new C1284350jWj(imageAcquireNextImage.getPlanes());
                                                        C1286230jZl c1286230jZl2 = c1286230jZl;
                                                        VEFrame vEFrameCreateYUVPlanFrame2 = VEFrame.createYUVPlanFrame(c1284350jWj, c1286230jZl2.LJIILL, c1286230jZl2.LJIILLIIL, c1286230jZl2.LJIILIIL, 0L, EnumC2185621AgK.TEPixFmt_NV12);
                                                        C1286230jZl c1286230jZl3 = c1286230jZl;
                                                        if (c1286230jZl3.LJIIJ == null) {
                                                            ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(((c1286230jZl3.LJIILL * c1286230jZl3.LJIILLIIL) * 3) / 2);
                                                            byteBufferAllocateDirect3.clear();
                                                            C1286230jZl c1286230jZl4 = c1286230jZl;
                                                            c1286230jZl4.LJIIJ = VEFrame.createByteBufferFrame(byteBufferAllocateDirect3, c1286230jZl4.LJIILL, c1286230jZl4.LJIILLIIL, c1286230jZl4.LJIILIIL, 0L, EnumC2185621AgK.TEPixFmt_YUV420P);
                                                        }
                                                        TEImageUtils.LIZ(vEFrameCreateYUVPlanFrame2, c1286230jZl.LJIIJ, EnumC1284340jWi.OP_CONVERT);
                                                        vEFrameCreateYUVPlanFrame = c1286230jZl.LJIIJ;
                                                    } else {
                                                        C1284350jWj c1284350jWj2 = new C1284350jWj(imageAcquireNextImage.getPlanes());
                                                        C1286230jZl c1286230jZl5 = c1286230jZl;
                                                        vEFrameCreateYUVPlanFrame = VEFrame.createYUVPlanFrame(c1284350jWj2, c1286230jZl5.LJIILL, c1286230jZl5.LJIILLIIL, c1286230jZl5.LJIILIIL, 0L, EnumC2185621AgK.TEPixFmt_YUV420P);
                                                    }
                                                    VEFrame vEFrame2 = c1286230jZl.LJIIIZ;
                                                    if (vEFrame2 != null) {
                                                        TEImageUtils.LIZ(vEFrameCreateYUVPlanFrame, vEFrame2, EnumC1284340jWi.OP_SCALE);
                                                    }
                                                    C1286230jZl c1286230jZl6 = c1286230jZl;
                                                    if (c1286230jZl6.LJIILIIL != 0) {
                                                        vEFrame = c1286230jZl6.LJIIJJI;
                                                        TEImageUtils.LIZ(c1286230jZl6.LJIIIZ, vEFrame, EnumC1284340jWi.OP_ROTATION);
                                                    } else {
                                                        vEFrame = c1286230jZl6.LJIIIZ;
                                                    }
                                                    TEImageUtils.LIZ(vEFrame, c1286230jZl.LJIIIIZZ, EnumC1284340jWi.OP_CONVERT);
                                                    ((VEFrame.ByteBufferFrame) c1286230jZl.LJIIIIZZ.getFrame()).getByteBuffer().clear();
                                                }
                                                C1286230jZl c1286230jZl7 = c1286230jZl;
                                                c1286230jZl7.LIZIZ(c1286230jZl.LJIIIIZZ.getWidth(), c1286230jZl.LJIIIIZZ.getHeight(), (int) (imageAcquireNextImage.getTimestamp() / 1000000.0d), ((VEFrame.ByteBufferFrame) c1286230jZl7.LJIIIIZZ.getFrame()).getByteBuffer());
                                            }
                                            ((ArrayList) this.LLILLJJLI).add(Long.valueOf(timestamp));
                                            if (this.LLILLJJLI.containsAll(listArr[this.LL])) {
                                                ((ArrayList) this.LLILLJJLI).clear();
                                                this.LL++;
                                            }
                                            c1286230jZl.notify();
                                        }
                                        imageAcquireNextImage.close();
                                    } finally {
                                    }
                                }
                            } catch (Exception e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                c1286230jZl.LIZJ();
                                c1286230jZl.notify();
                                c1286230jZl.LIZLLL();
                            } catch (OutOfMemoryError e4) {
                                TryCatchGuardChecker.doCheck(e4);
                                Runtime.getRuntime().gc();
                                c1286230jZl.LIZJ();
                                c1286230jZl.notify();
                                c1286230jZl.LIZLLL();
                            }
                        }
                    }, bPEAHandler);
                    mediaFormat.setInteger("color-format", 2135033992);
                    String str7 = C1286230jZl.LJJIII;
                    Map<String, Integer> map = C1286290jZr.LIZ;
                    if (((HashMap) map).containsKey(str7)) {
                        iIntValue = ((Integer) ((HashMap) map).get(str7)).intValue();
                    } else {
                        iIntValue = 0;
                    }
                    int i16 = (((iIntValue * 1080) * 1920) / c1286230jZl.LJIILL) / c1286230jZl.LJIILLIIL;
                    if (i16 > 0) {
                        String str8 = c1286230jZl.LIZIZ;
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("extract frame targetFps:");
                        sbLIZ6.append(i16);
                        C2484209oO.LJI(str8, C2188811AlT.LIZIZ(sbLIZ6));
                        mediaFormat.setInteger("operating-rate", i16);
                    }
                    c1286230jZl.LJIIL.configure(mediaFormat, c1286230jZl.LJIJI.getSurface(), (MediaCrypto) null, 0);
                    c1286230jZl.LJIIL.start();
                    return;
                } catch (Exception e3) {
                    e = e3;
                } catch (OutOfMemoryError e4) {
                    e = e4;
                    TryCatchGuardChecker.doCheck(e);
                    C2484209oO.LJI(c1286230jZl.LIZIZ, "start crash oom");
                    Runtime.getRuntime().gc();
                    c1286230jZl.LIZJ();
                    c1286230jZl.LIZLLL();
                    return;
                }
            } catch (Exception e5) {
                e = e5;
            } catch (OutOfMemoryError e6) {
                e = e6;
            }
        } catch (Exception e7) {
            e = e7;
        } catch (OutOfMemoryError e8) {
            e = e8;
        }
        TryCatchGuardChecker.doCheck(e);
        C2484209oO.LJI(c1286230jZl.LIZIZ, "start crash");
        c1286230jZl.LIZJ();
        c1286230jZl.LIZLLL();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0jZn] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0jZq] */
    public void startExtractFrameForRangeTime(String str, final int i, int i2, final int i3, final int i4, final int i5) {
        final long j = this.mNativeAddr;
        final ?? r7 = new InterfaceC1286300jZs() { // from class: X.0jZq
            @Override // X.InterfaceC1286300jZs
            public final boolean processFrame(ByteBuffer byteBuffer, int i6, int i7, int i8) {
                return this.LIZIZ.nativeOnFrameAvailable(j, byteBuffer, i6, i7, i8);
            }
        };
        this.mExtractorRange = new Object(i, i3, i4, i5, r7) { // from class: X.0jZn
            public final String LIZ;
            public final int LIZIZ;
            public final int LIZJ;
            public final InterfaceC1286300jZs LIZLLL;
            public final Object LJ;
            public boolean LJFF;

            {
                long id = C786410Ut5.u3().getId();
                this.LIZ = "HwFrameExtractorRange_";
                this.LJ = new Object();
                this.LJFF = false;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("HwFrameExtractorRange_");
                sbLIZ.append(i5);
                sbLIZ.append("_");
                sbLIZ.append(id);
                this.LIZ = C2188811AlT.LIZIZ(sbLIZ);
                Math.max(i, 0);
                this.LIZIZ = i3;
                this.LIZJ = i4;
                this.LIZLLL = r7;
                try {
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i3 * i4 * 4);
                    byteBufferAllocateDirect.clear();
                    VEFrame.createByteBufferFrame(byteBufferAllocateDirect, i3, i4, 0, 0L, EnumC2185621AgK.TEPixFmt_ARGB8);
                } catch (OutOfMemoryError e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2484209oO.LJIIIIZZ(this.LIZ, "init alloc oom");
                    Runtime.getRuntime().gc();
                    try {
                        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(this.LIZIZ * this.LIZJ * 4);
                        byteBufferAllocateDirect2.clear();
                        VEFrame.createByteBufferFrame(byteBufferAllocateDirect2, this.LIZIZ, this.LIZJ, 0, 0L, EnumC2185621AgK.TEPixFmt_ARGB8);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        if (!this.LJFF) {
                            String str2 = this.LIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("processFrameLast begin hasProcessCount:");
                            sbLIZ2.append(0);
                            C2484209oO.LJI(str2, C2188811AlT.LIZIZ(sbLIZ2));
                            if (!this.LIZLLL.processFrame(null, this.LIZIZ, this.LIZJ, 0)) {
                                String str3 = this.LIZ;
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("processFrameLast stop hasProcxessCount:");
                                sbLIZ3.append(0);
                                C2484209oO.LJI(str3, C2188811AlT.LIZIZ(sbLIZ3));
                            }
                        }
                    }
                }
            }
        };
    }
}
