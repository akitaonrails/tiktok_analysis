package com.bytedance.codecx.video;

import com.bytedance.codecx.video.VideoEncoder;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class VideoEncoderWrapper {
    public static native void nativeOnEncodedEvent(long j, int i);

    public static native void nativeOnEncodedFrame(long j, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j2, int i5, int i6, int i7, long j3, int i8);

    public static VideoEncoder.Callback createEncoderCallback(final long j) {
        return new VideoEncoder.Callback() { // from class: com.bytedance.codecx.video.VideoEncoderWrapper.1
            @Override // com.bytedance.codecx.video.VideoEncoder.Callback
            public void onEncodedEvent(VideoEncoder.EncodeEvent encodeEvent) {
                VideoEncoderWrapper.nativeOnEncodedEvent(j, encodeEvent.getEventValue());
            }

            @Override // com.bytedance.codecx.video.VideoEncoder.Callback
            public void onEncodedFrame(EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
                VideoEncoderWrapper.nativeOnEncodedFrame(j, encodedImage.buffer, encodedImage.encodedWidth, encodedImage.encodedHeight, encodedImage.actualWidth, encodedImage.actualHeight, encodedImage.captureTimeNs, encodedImage.frameType.getNative(), codecSpecificInfo.codec_standard.toInt(), encodedImage.svcLayerNum, encodedImage.compositionTimeUs, encodedImage.qp.intValue());
            }
        };
    }
}
