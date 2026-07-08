package com.bytedance.codecx.video.memory;

import com.bytedance.codecx.video.CodecXPixelFormat;
import com.bytedance.codecx.video.CodecXVideoMemoryType;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class NativeCodecXByteMemory extends CodecXVideoMemory implements CodecXVideoByteMemoryInterface {
    public final int height;
    public final CodecXPixelFormat pixelFormat;
    public final ByteBuffer[] planeData;
    public final int[] planeLineSize;
    public final int width;

    public static native NativeCodecXByteMemory nativeCreateCodecXByteMemory(int i, int i2, CodecXPixelFormat codecXPixelFormat, long j);

    /* JADX INFO: renamed from: com.bytedance.codecx.video.memory.NativeCodecXByteMemory$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat;

        static {
            int[] iArr = new int[CodecXPixelFormat.values().length];
            $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat = iArr;
            try {
                iArr[CodecXPixelFormat.kArgb.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat[CodecXPixelFormat.kBgra.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat[CodecXPixelFormat.kI420.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat[CodecXPixelFormat.kIYUV.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat[CodecXPixelFormat.kNv12.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat[CodecXPixelFormat.kNv21.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat[CodecXPixelFormat.kRgb.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat[CodecXPixelFormat.kRgba.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat[CodecXPixelFormat.kRGB565.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
                TryCatchGuardChecker.doCheck(e9);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat[CodecXPixelFormat.kUYVY.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
                TryCatchGuardChecker.doCheck(e10);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat[CodecXPixelFormat.kYUY2.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
                TryCatchGuardChecker.doCheck(e11);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat[CodecXPixelFormat.kYV12.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
                TryCatchGuardChecker.doCheck(e12);
            }
        }
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoByteMemoryInterface
    public int getNumberOfPlanes() {
        ByteBuffer[] byteBufferArr = this.planeData;
        if (byteBufferArr == null) {
            return 0;
        }
        return byteBufferArr.length;
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoMemoryInterface
    public int getHeight() {
        return this.height;
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoMemoryInterface
    public CodecXVideoMemoryType getMemoryType() {
        return CodecXVideoMemoryType.kBYTE_MEMORY;
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoMemoryInterface
    public CodecXPixelFormat getPixelFormat() {
        return this.pixelFormat;
    }

    public ByteBuffer[] getPlaneDataArray() {
        return this.planeData;
    }

    public int[] getPlaneLineSizeArray() {
        return this.planeLineSize;
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoMemoryInterface
    public int getWidth() {
        return this.width;
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoByteMemoryInterface
    public ByteBuffer getPlaneData(int i) {
        ByteBuffer[] byteBufferArr = this.planeData;
        if (byteBufferArr == null || i > byteBufferArr.length) {
            return null;
        }
        return byteBufferArr[i].slice();
    }

    @Override // com.bytedance.codecx.video.memory.CodecXVideoByteMemoryInterface
    public int getPlaneLineSize(int i) {
        int[] iArr = this.planeLineSize;
        if (iArr == null || i > iArr.length) {
            return 0;
        }
        return iArr[i];
    }

    public static NativeCodecXByteMemory createCodecXByteMemory(int i, int i2, CodecXPixelFormat codecXPixelFormat, long j) {
        switch (AnonymousClass1.$SwitchMap$com$bytedance$codecx$video$CodecXPixelFormat[codecXPixelFormat.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return nativeCreateCodecXByteMemory(i, i2, codecXPixelFormat, j);
            default:
                return null;
        }
    }

    public NativeCodecXByteMemory(int i, int i2, long j, ByteBuffer[] byteBufferArr, int[] iArr, CodecXPixelFormat codecXPixelFormat) {
        super(j);
        this.width = i;
        this.height = i2;
        this.nativeHandle = j;
        this.planeData = byteBufferArr;
        this.planeLineSize = iArr;
        this.pixelFormat = codecXPixelFormat;
    }
}
