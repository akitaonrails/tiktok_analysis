package com.ss.ttlivestreamer.core.codec;

import X.C1280080jPq;
import X.C2188811AlT;
import X.InterfaceC1272820jE8;
import com.ss.ttlivestreamer.core.engine.VideoEncoder;
import com.ss.ttlivestreamer.core.engine.VideoEncoderFactory;

/* JADX INFO: loaded from: classes21.dex */
public class DefaultVideoEncoderFactory extends VideoEncoderFactory {
    public final C1280080jPq mHWFacotry = new C1280080jPq();

    private native VideoEncoder nativeDefaultCreateVideoEncoder(String str, boolean z);

    private native String nativeDefaultGetSupportedFormats();

    @Override // com.ss.ttlivestreamer.core.engine.VideoEncoderFactory, com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        super.release();
        this.mHWFacotry.release();
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoEncoderFactory
    public String GetSupportedFormats() {
        this.mHWFacotry.getClass();
        String strNativeDefaultGetSupportedFormats = nativeDefaultGetSupportedFormats();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("video_type=video/avc,video_enable_accelera=true,oes_texture_frame=true:video_type=video/bytevc1,video_enable_accelera=true,oes_texture_frame=true");
        sbLIZ.append(":");
        sbLIZ.append(strNativeDefaultGetSupportedFormats);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public void setServiceManager(InterfaceC1272820jE8 interfaceC1272820jE8) {
        this.mHWFacotry.LLILLL = interfaceC1272820jE8;
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoEncoderFactory
    public VideoEncoder CreateVideoEncoder(String str, boolean z) {
        VideoEncoder videoEncoderCreateVideoEncoder = this.mHWFacotry.CreateVideoEncoder(str, z);
        if (videoEncoderCreateVideoEncoder == null) {
            return nativeDefaultCreateVideoEncoder(str, z);
        }
        return videoEncoderCreateVideoEncoder;
    }
}
