package com.bytedance.codecx.video;

import com.bytedance.codecx.video.VideoDecoder;
import com.bytedance.codecx.video.memory.CodecXVideoFrameInterface;

/* JADX INFO: loaded from: classes36.dex */
public class VideoDecoderWrapper {
    public static native void nativeOnDecodedFrame(long j, CodecXVideoFrameInterface codecXVideoFrameInterface);

    public static native void nativeOnMediaCodecStatus(long j, CodecXVideoCodecStatus codecXVideoCodecStatus, String str);

    public static VideoDecoder.Callback createDecoderCallback(final long j) {
        return new VideoDecoder.Callback() { // from class: com.bytedance.codecx.video.VideoDecoderWrapper.1
            @Override // com.bytedance.codecx.video.VideoDecoder.Callback
            public void onDecodedFrame(CodecXVideoFrameInterface codecXVideoFrameInterface) {
                long j2 = j;
                if (j2 != 0) {
                    VideoDecoderWrapper.nativeOnDecodedFrame(j2, codecXVideoFrameInterface);
                }
            }

            @Override // com.bytedance.codecx.video.VideoDecoder.Callback
            public void onMediaCodecStatus(CodecXVideoCodecStatus codecXVideoCodecStatus, String str) {
                if (j != 0 && str != null && str.length() != 0) {
                    VideoDecoderWrapper.nativeOnMediaCodecStatus(j, codecXVideoCodecStatus, str);
                }
            }
        };
    }
}
