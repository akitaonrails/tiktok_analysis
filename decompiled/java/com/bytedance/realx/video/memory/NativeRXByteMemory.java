package com.bytedance.realx.video.memory;

import com.bytedance.realx.video.RXPixelFormat;
import com.bytedance.realx.video.RXVideoMemoryType;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class NativeRXByteMemory extends RXVideoMemory implements RXVideoByteMemoryInterface {
    public final int height;
    public final RXPixelFormat pixelFormat;
    public final ByteBuffer[] planeData;
    public final int[] planeLineSize;
    public final int width;

    public static native NativeRXByteMemory nativeCreateRXByteMemory(int i, int i2, RXPixelFormat rXPixelFormat, long j);

    /* JADX INFO: renamed from: com.bytedance.realx.video.memory.NativeRXByteMemory$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$bytedance$realx$video$RXPixelFormat;

        static {
            int[] iArr = new int[RXPixelFormat.values().length];
            $SwitchMap$com$bytedance$realx$video$RXPixelFormat = iArr;
            try {
                iArr[RXPixelFormat.kArgb.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kBgra.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kI420.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kIYUV.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kNv12.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kNv21.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kRgb.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kRgba.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kRGB565.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
                TryCatchGuardChecker.doCheck(e9);
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kUYVY.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
                TryCatchGuardChecker.doCheck(e10);
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kYUY2.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
                TryCatchGuardChecker.doCheck(e11);
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kYV12.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
                TryCatchGuardChecker.doCheck(e12);
            }
        }
    }

    @Override // com.bytedance.realx.video.memory.RXVideoByteMemoryInterface
    public int getNumberOfPlanes() {
        ByteBuffer[] byteBufferArr = this.planeData;
        if (byteBufferArr == null) {
            return 0;
        }
        return byteBufferArr.length;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemoryInterface
    public int getHeight() {
        return this.height;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemoryInterface
    public RXVideoMemoryType getMemoryType() {
        return RXVideoMemoryType.kBYTE_MEMORY;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemoryInterface
    public RXPixelFormat getPixelFormat() {
        return this.pixelFormat;
    }

    public ByteBuffer[] getPlaneDataArray() {
        return this.planeData;
    }

    public int[] getPlaneLineSizeArray() {
        return this.planeLineSize;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemoryInterface
    public int getWidth() {
        return this.width;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoByteMemoryInterface
    public ByteBuffer getPlaneData(int i) {
        ByteBuffer[] byteBufferArr = this.planeData;
        if (byteBufferArr == null || i > byteBufferArr.length) {
            return null;
        }
        return byteBufferArr[i].slice();
    }

    @Override // com.bytedance.realx.video.memory.RXVideoByteMemoryInterface
    public int getPlaneLineSize(int i) {
        int[] iArr = this.planeLineSize;
        if (iArr == null || i > iArr.length) {
            return 0;
        }
        return iArr[i];
    }

    public static NativeRXByteMemory createRXByteMemory(int i, int i2, RXPixelFormat rXPixelFormat, long j) {
        switch (AnonymousClass1.$SwitchMap$com$bytedance$realx$video$RXPixelFormat[rXPixelFormat.ordinal()]) {
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
                return nativeCreateRXByteMemory(i, i2, rXPixelFormat, j);
            default:
                return null;
        }
    }

    public NativeRXByteMemory(int i, int i2, long j, ByteBuffer[] byteBufferArr, int[] iArr, RXPixelFormat rXPixelFormat) {
        super(j);
        this.width = i;
        this.height = i2;
        this.nativeHandle = j;
        this.planeData = byteBufferArr;
        this.planeLineSize = iArr;
        this.pixelFormat = rXPixelFormat;
    }
}
