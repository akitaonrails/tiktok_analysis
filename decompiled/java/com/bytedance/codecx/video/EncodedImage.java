package com.bytedance.codecx.video;

import X.C08FF;
import X.C2188811AlT;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes21.dex */
public class EncodedImage {
    public final int actualHeight;
    public final int actualWidth;
    public final ByteBuffer buffer;
    public final long captureTimeMs;
    public final long captureTimeNs;
    public final boolean completeFrame;
    public final long compositionTimeUs;
    public final int encodedHeight;
    public final int encodedWidth;
    public final FrameType frameType;
    public final Integer qp;
    public final int rotation;
    public final int svcLayerNum;

    public static class Builder {
        public int actualHeight;
        public int actualWidth;
        public ByteBuffer buffer;
        public long captureTimeNs;
        public boolean completeFrame;
        public long compositionTimeUs;
        public int encodedHeight;
        public int encodedWidth;
        public FrameType frameType;
        public Integer qp;
        public int rotation;
        public int svcLayerNum;

        public EncodedImage createEncodedImage() {
            return new EncodedImage(this.buffer, this.encodedWidth, this.encodedHeight, this.actualWidth, this.actualHeight, this.captureTimeNs, this.frameType, this.rotation, this.completeFrame, this.qp, this.svcLayerNum, this.compositionTimeUs);
        }

        public Builder() {
            this.qp = -1;
        }

        public Builder setActualHeight(int i) {
            this.actualHeight = i;
            return this;
        }

        public Builder setActualWidth(int i) {
            this.actualWidth = i;
            return this;
        }

        public Builder setBuffer(ByteBuffer byteBuffer) {
            this.buffer = byteBuffer;
            return this;
        }

        public Builder setCaptureTimeMs(long j) {
            this.captureTimeNs = TimeUnit.MILLISECONDS.toNanos(j);
            return this;
        }

        public Builder setCaptureTimeNs(long j) {
            this.captureTimeNs = j;
            return this;
        }

        public Builder setCompleteFrame(boolean z) {
            this.completeFrame = z;
            return this;
        }

        public Builder setCompositionTimeUs(long j) {
            this.compositionTimeUs = j;
            return this;
        }

        public Builder setEncodedHeight(int i) {
            this.encodedHeight = i;
            return this;
        }

        public Builder setEncodedWidth(int i) {
            this.encodedWidth = i;
            return this;
        }

        public Builder setFrameType(FrameType frameType) {
            this.frameType = frameType;
            return this;
        }

        public Builder setQp(Integer num) {
            this.qp = num;
            return this;
        }

        public Builder setRotation(int i) {
            this.rotation = i;
            return this;
        }

        public Builder setSvcLayerNum(int i) {
            this.svcLayerNum = i;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private int getFrameType() {
        return this.frameType.getNative();
    }

    public enum FrameType {
        kUnknow(0),
        kIntra(1),
        kPredicted(2),
        kBiPredicted(3),
        kEmpty(4),
        kLtrRecovery(5);

        public final int nativeIndex;

        public int getNative() {
            return this.nativeIndex;
        }

        public static FrameType fromNativeIndex(int i) {
            for (FrameType frameType : values()) {
                if (frameType.getNative() == i) {
                    return frameType;
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unknown native frame type: ");
            sbLIZ.append(i);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }

        public static FrameType valueOf(int i) {
            for (FrameType frameType : values()) {
                if (frameType.nativeIndex == i) {
                    return frameType;
                }
            }
            return kUnknow;
        }

        public static FrameType valueOf(String str) {
            return (FrameType) C08FF.LIZ(FrameType.class, str);
        }

        FrameType(int i) {
            this.nativeIndex = i;
        }
    }

    private ByteBuffer getBuffer() {
        return this.buffer;
    }

    private long getCaptureTimeNs() {
        return this.captureTimeNs;
    }

    private boolean getCompleteFrame() {
        return this.completeFrame;
    }

    private long getCompositionTimeUs() {
        return this.compositionTimeUs;
    }

    private int getEncodedHeight() {
        return this.encodedHeight;
    }

    private int getEncodedWidth() {
        return this.encodedWidth;
    }

    private Integer getQp() {
        return this.qp;
    }

    private int getRotation() {
        return this.rotation;
    }

    private int getSvcLayerNum() {
        return this.svcLayerNum;
    }

    public EncodedImage(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j, FrameType frameType, int i5, boolean z, Integer num, int i6, long j2) {
        this.buffer = byteBuffer;
        this.encodedWidth = i;
        this.encodedHeight = i2;
        this.actualWidth = i3;
        this.actualHeight = i4;
        this.captureTimeMs = TimeUnit.NANOSECONDS.toMillis(j);
        this.captureTimeNs = j;
        this.frameType = frameType;
        this.rotation = i5;
        this.completeFrame = z;
        this.qp = num;
        this.svcLayerNum = i6;
        this.compositionTimeUs = j2;
    }
}
