package com.ss.ttlivestreamer.core.buffer;

import X.C1269470j8j;
import X.C1269610j8x;
import X.C1271730jCN;
import X.C1271790jCT;
import X.C1271840jCY;
import X.C1271900jCe;
import X.C1C7U;
import X.InterfaceC1269490j8l;
import X.InterfaceC1271560jC6;
import X.InterfaceC1271760jCQ;
import X.InterfaceC1271920jCg;
import X.InterfaceC1272490jDb;
import Y.ARunnableS120S0100000_20;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.opengl.UVRange;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class VideoFrame implements InterfaceC1272490jDb {
    public Buffer buffer;
    public InterfaceC1271920jCg onFrameReleaseListener;
    public int rotation;
    public long timestampNs;
    public List<C1269610j8x> mEvents = new LinkedList();
    public long renderStartServerNtpMs = 0;
    public int finalWidth = 0;
    public int finalHeight = 0;

    public interface Buffer {
        void addOnBufferReleaseListener(InterfaceC1271760jCQ interfaceC1271760jCQ);

        VideoFrame createVideoFrame(int i, long j);

        Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6);

        void cropAndScaleV2(int i, int i2, int i3, int i4, int i5, int i6);

        void destroy();

        int getBufferType();

        long getCaptureMs();

        long getCaptureServerNtpMs();

        long getEffectServerNtpMs();

        IExtraData getExtData();

        int getHeight();

        RoiInfo getROIInfo();

        int getRefCount();

        int getRenderType();

        int getTextureId();

        int getWidth();

        boolean isTexture();

        void release();

        void release(String str);

        void retain();

        void retain(String str);

        void setOnBufferReleaseListener(InterfaceC1271760jCQ interfaceC1271760jCQ);

        void setROIInfo(RoiInfo roiInfo);

        void setRenderType(int i);

        void setVideoFrameCreator(InterfaceC1269490j8l interfaceC1269490j8l);

        I420Buffer toI420();

        void updateCaptureMs(long j);

        void updateCaptureServerNtpMs(long j);

        void updateEffectServerNtpMs(long j);
    }

    public interface I420Buffer extends Buffer {
        int getBufferType();

        ByteBuffer getDataU();

        ByteBuffer getDataV();

        ByteBuffer getDataY();

        int getStrideU();

        int getStrideV();

        int getStrideY();
    }

    public interface IExtraData {
        long getExtraDataFlag();

        int peekParcelSize();

        int readParcel(ByteBuffer byteBuffer);

        void releaseExtraData(Object obj);
    }

    public static abstract class a implements Buffer {
        public InterfaceC1269490j8l creator;
        public InterfaceC1271760jCQ onBufferReleaseListener;
        public final List<InterfaceC1271760jCQ> listeners = new ArrayList();
        public int renderType = 0;

        @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
        public /* synthetic */ void cropAndScaleV2(int i, int i2, int i3, int i4, int i5, int i6) {
            C1271730jCN.LIZ(this, i, i2, i3, i4, i5, i6);
        }

        @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
        public /* synthetic */ void destroy() {
            C1271730jCN.LIZIZ(this);
        }

        @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
        public /* synthetic */ int getRefCount() {
            return C1271730jCN.LIZJ(this);
        }

        @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
        public /* synthetic */ int getTextureId() {
            return C1271730jCN.LIZLLL(this);
        }

        @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
        public /* synthetic */ void release(String str) {
            C1271730jCN.LJ(this, str);
        }

        @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
        public /* synthetic */ void retain(String str) {
            C1271730jCN.LJFF(this, str);
        }

        public void reuseBuffer() {
            this.renderType = 0;
            this.listeners.clear();
        }

        public final void onBufferReleased() {
            Iterator<InterfaceC1271760jCQ> it2 = this.listeners.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(this);
            }
            InterfaceC1271760jCQ interfaceC1271760jCQ = this.onBufferReleaseListener;
            if (interfaceC1271760jCQ != null) {
                interfaceC1271760jCQ.LIZ(this);
            }
        }

        @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
        public int getRenderType() {
            return this.renderType;
        }

        @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
        public final void addOnBufferReleaseListener(InterfaceC1271760jCQ interfaceC1271760jCQ) {
            this.listeners.add(interfaceC1271760jCQ);
        }

        @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
        public final void setOnBufferReleaseListener(InterfaceC1271760jCQ interfaceC1271760jCQ) {
            this.onBufferReleaseListener = interfaceC1271760jCQ;
        }

        @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
        public void setRenderType(int i) {
            this.renderType = i;
        }

        @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
        public final void setVideoFrameCreator(InterfaceC1269490j8l interfaceC1269490j8l) {
            this.creator = interfaceC1269490j8l;
        }

        @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
        public final VideoFrame createVideoFrame(int i, long j) {
            VideoFrame videoFrameLIZLLL;
            InterfaceC1269490j8l interfaceC1269490j8l = this.creator;
            if (interfaceC1269490j8l != null) {
                C1271790jCT c1271790jCT = ((C1269470j8j) interfaceC1269490j8l).LIZ.LLILLL;
                if (c1271790jCT == null || (videoFrameLIZLLL = c1271790jCT.LIZLLL(this, i, j)) == null) {
                    return new VideoFrame(this, i, j);
                }
                return videoFrameLIZLLL;
            }
            return new VideoFrame(this, i, j);
        }
    }

    public static native void nativeCropAndScaleI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, ByteBuffer byteBuffer4, int i8, ByteBuffer byteBuffer5, int i9, ByteBuffer byteBuffer6, int i10, int i11, int i12);

    public void clearSerializedEvents() {
        List<C1269610j8x> list = this.mEvents;
        if (list != null) {
            list.clear();
        }
    }

    public IExtraData getExtraData() {
        return this.buffer.getExtData();
    }

    public int getRotatedHeight() {
        return this.rotation % 180 == 0 ? this.buffer.getHeight() : this.buffer.getWidth();
    }

    public int getRotatedWidth() {
        return this.rotation % 180 == 0 ? this.buffer.getWidth() : this.buffer.getHeight();
    }

    public int getTextureId() {
        return this.buffer.getTextureId();
    }

    public int getUVHeight() {
        if (!(this.buffer instanceof k)) {
            return getRotatedHeight();
        }
        float rotatedHeight = getRotatedHeight();
        UVRange uVRange = ((k) this.buffer).mUVRange;
        return (int) (rotatedHeight * (uVRange.vMax - uVRange.vMin));
    }

    public int getUVWidth() {
        if (!(this.buffer instanceof k)) {
            return getRotatedWidth();
        }
        float rotatedWidth = getRotatedWidth();
        UVRange uVRange = ((k) this.buffer).mUVRange;
        return (int) (rotatedWidth * (uVRange.uMax - uVRange.uMin));
    }

    public boolean isTexture() {
        return this.buffer instanceof InterfaceC1271560jC6;
    }

    @Override // X.InterfaceC1272490jDb
    public void release() {
        this.buffer.release();
        if (this.buffer.getRefCount() <= 0) {
            clearSerializedEvents();
        }
    }

    @Override // X.InterfaceC1272490jDb
    public void retain() {
        this.buffer.retain();
    }

    public VideoFrame() {
    }

    public Buffer getBuffer() {
        return this.buffer;
    }

    public List<C1269610j8x> getEvents() {
        return this.mEvents;
    }

    public long getRenderStartServerNtpMS() {
        return this.renderStartServerNtpMs;
    }

    public int getRotation() {
        return this.rotation;
    }

    public long getTimestampNs() {
        return this.timestampNs;
    }

    public static /* synthetic */ void lambda$cropAndScaleI420$1(I420Buffer i420Buffer) {
        C1C7U.LIZ("VideoFrame@7d7c.cropAndScaleI420$1L");
        i420Buffer.release();
        C1C7U.LIZIZ("VideoFrame@7d7c.cropAndScaleI420$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$reuseVideoFrame$0(Buffer buffer) {
        C1271840jCY c1271840jCY = (C1271840jCY) this.onFrameReleaseListener;
        c1271840jCY.LIZ.LIZJ(c1271840jCY.LIZIZ);
    }

    public void appendSerializedEvents(List<C1269610j8x> list) {
        if (this.mEvents != null && list != null && list.size() != 0) {
            this.mEvents.addAll(list);
        }
    }

    @Override // X.InterfaceC1272490jDb
    public void release(String str) {
        this.buffer.release(str);
        if (this.buffer.getRefCount() <= 0) {
            clearSerializedEvents();
        }
    }

    @Override // X.InterfaceC1272490jDb
    public void retain(String str) {
        this.buffer.retain(str);
    }

    public void setOnFrameReleaseListener(InterfaceC1271920jCg interfaceC1271920jCg) {
        this.onFrameReleaseListener = interfaceC1271920jCg;
    }

    public void setRenderStartServerNtpMs(long j) {
        this.renderStartServerNtpMs = j;
    }

    public void setTimestampNs(long j) {
        this.timestampNs = j;
    }

    public VideoFrame(Buffer buffer, int i, long j) {
        if (buffer != null) {
            if (i % 90 == 0) {
                this.buffer = buffer;
                this.rotation = i;
                this.timestampNs = j;
                return;
            }
            throw new IllegalArgumentException("rotation must be a multiple of 90");
        }
        throw new IllegalArgumentException("buffer not allowed to be null");
    }

    public void reuseVideoFrame(Buffer buffer, int i, long j) {
        this.buffer = buffer;
        if (buffer != null && this.onFrameReleaseListener != null) {
            buffer.addOnBufferReleaseListener(new InterfaceC1271760jCQ() { // from class: X.0jCZ
                @Override // X.InterfaceC1271760jCQ
                public final void LIZ(VideoFrame.Buffer buffer2) {
                    this.LIZ.lambda$reuseVideoFrame$0(buffer2);
                }
            });
        }
        this.rotation = i;
        this.timestampNs = j;
        this.mEvents.clear();
        this.renderStartServerNtpMs = 0L;
    }

    public static Buffer cropAndScaleI420(I420Buffer i420Buffer, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 == i5 && i4 == i6 && i == 0 && i2 == 0) {
            ByteBuffer dataY = i420Buffer.getDataY();
            ByteBuffer dataU = i420Buffer.getDataU();
            ByteBuffer dataV = i420Buffer.getDataV();
            i420Buffer.getStrideY();
            dataY.position(0);
            i420Buffer.getStrideU();
            dataU.position(0);
            dataV.position(0 + (i420Buffer.getStrideV() * 0));
            i420Buffer.retain();
            return C1271900jCe.LIZJ(i420Buffer.getWidth(), i420Buffer.getHeight(), dataY.slice(), i420Buffer.getStrideY(), dataU.slice(), i420Buffer.getStrideU(), dataV.slice(), i420Buffer.getStrideV(), i420Buffer.getCaptureMs(), new ARunnableS120S0100000_20(i420Buffer, 107), 0L, 0L);
        }
        C1271900jCe c1271900jCeLIZ = C1271900jCe.LIZ(i5, i6, null);
        nativeCropAndScaleI420(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), i, i2, i3, i4, c1271900jCeLIZ.getDataY(), c1271900jCeLIZ.LJFF, c1271900jCeLIZ.getDataU(), c1271900jCeLIZ.LJI, c1271900jCeLIZ.getDataV(), c1271900jCeLIZ.LJII, i5, i6);
        c1271900jCeLIZ.LJIIL = i420Buffer.getCaptureMs();
        return c1271900jCeLIZ;
    }
}
