package com.ss.android.ttve.mediacodec;

import X.C1284430jWr;
import X.C1284450jWt;
import X.C2188811AlT;
import X.C2484209oO;
import X.C2484309oP;
import X.C786410Ut5;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VEConfigCenter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class TEMediaCodecWrapper {
    public String TAG = "TEMediaCodecWrapper";
    public MediaCodec infoCodec;
    public boolean mIsCodecStarted;
    public TEMediaEncodeConst m_EncodeConst;
    public MediaCodecInfo.CodecCapabilities m_codecCapabilities;
    public String m_codecInfoName;
    public String m_encoderName;
    public Surface m_inputSurface;
    public int m_maxFPS;
    public MediaCodecInfo m_mediaCodecInfo;
    public String m_mimeType;
    public MediaFormat m_outputFormat;
    public MediaCodec m_pCodec;
    public MediaFormat m_pFormat;
    public MediaCodecInfo.CodecProfileLevel m_profileLevel;
    public boolean m_useHDR10Bit;
    public Bundle updateParams;

    public static class TEMediaCodecBufferInfo {
        public int flags;
        public int offset;
        public long presentationTimeUs;
        public int retVal;
        public int size;
    }

    public static class TEMediaEncodeConst {
        public String CODEC_KEY_VIDEO_BITRATE;
        public String FORMAT_KEY_BITRATE_MODE;
        public String FORMAT_KEY_BIT_RATE;
        public String FORMAT_KEY_COLOR_FORMAT;
        public String FORMAT_KEY_COLOR_RANGE;
        public String FORMAT_KEY_COLOR_STANDARD;
        public String FORMAT_KEY_COLOR_TRANSFER;
        public String FORMAT_KEY_FRAME_RATE;
        public String FORMAT_KEY_HEIGHT;
        public String FORMAT_KEY_I_FRAME_INTERVAL;
        public String FORMAT_KEY_LEVEL;
        public String FORMAT_KEY_MIME;
        public String FORMAT_KEY_OPERATING_RATE;
        public String FORMAT_KEY_PROFILE;
        public String FORMAT_KEY_WIDTH;
    }

    public void deleteCodec() {
        this.mIsCodecStarted = false;
        this.updateParams = null;
        this.m_pCodec.release();
        this.m_pCodec = null;
    }

    public static TEMediaCodecWrapper createCodecObject() {
        return new TEMediaCodecWrapper();
    }

    public void configureCodec() {
        this.m_pCodec.configure(this.m_pFormat, (Surface) null, (MediaCrypto) null, 1);
    }

    public Surface createInputSurface() {
        Surface surfaceCreateInputSurface = this.m_pCodec.createInputSurface();
        this.m_inputSurface = surfaceCreateInputSurface;
        return surfaceCreateInputSurface;
    }

    public TEMediaEncodeConst getMediaCodecConst() {
        TEMediaEncodeConst tEMediaEncodeConst = new TEMediaEncodeConst();
        this.m_EncodeConst = tEMediaEncodeConst;
        tEMediaEncodeConst.CODEC_KEY_VIDEO_BITRATE = "video-bitrate";
        tEMediaEncodeConst.FORMAT_KEY_COLOR_RANGE = "color-range";
        tEMediaEncodeConst.FORMAT_KEY_BIT_RATE = "bitrate";
        tEMediaEncodeConst.FORMAT_KEY_BITRATE_MODE = "bitrate-mode";
        tEMediaEncodeConst.FORMAT_KEY_COLOR_FORMAT = "color-format";
        tEMediaEncodeConst.FORMAT_KEY_COLOR_STANDARD = "color-standard";
        tEMediaEncodeConst.FORMAT_KEY_COLOR_TRANSFER = "color-transfer";
        tEMediaEncodeConst.FORMAT_KEY_FRAME_RATE = "frame-rate";
        tEMediaEncodeConst.FORMAT_KEY_HEIGHT = "height";
        tEMediaEncodeConst.FORMAT_KEY_WIDTH = "width";
        tEMediaEncodeConst.FORMAT_KEY_LEVEL = "level";
        tEMediaEncodeConst.FORMAT_KEY_PROFILE = "profile";
        tEMediaEncodeConst.FORMAT_KEY_I_FRAME_INTERVAL = "i-frame-interval";
        tEMediaEncodeConst.FORMAT_KEY_MIME = "mime";
        tEMediaEncodeConst.FORMAT_KEY_OPERATING_RATE = "operating-rate";
        return tEMediaEncodeConst;
    }

    public void getOutputFormat() {
        this.m_outputFormat = this.m_pCodec.getOutputFormat();
    }

    public void setParameters() {
        Bundle bundle;
        if (!this.mIsCodecStarted || (bundle = this.updateParams) == null) {
            return;
        }
        this.m_pCodec.setParameters(bundle);
        this.updateParams = null;
    }

    public void signalEndOfInputStream() {
        this.m_pCodec.signalEndOfInputStream();
    }

    public void startCodec() {
        this.m_pCodec.start();
        this.mIsCodecStarted = true;
    }

    public void stopCodec() {
        this.m_pCodec.stop();
        this.updateParams = null;
        this.mIsCodecStarted = false;
    }

    public boolean getHDR10BitSupport() {
        return this.m_useHDR10Bit;
    }

    public int getHWEncodeFallbackConfig() {
        return C1284450jWt.LIZLLL;
    }

    public int getMaxFPS() {
        return this.m_maxFPS;
    }

    public int createCodec(String str) {
        try {
            this.m_pCodec = MediaCodec.createEncoderByType(str);
            return 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            String str2 = this.TAG;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MediaCodec configEncode Exception");
            sbLIZ.append(stringWriter);
            C2484209oO.LJIIIIZZ(this.TAG, C2484209oO.LJ(str2, C2188811AlT.LIZIZ(sbLIZ), new C2484309oP[0]));
            return -4;
        }
    }

    public int dequeueInputBuffer(long j) {
        return this.m_pCodec.dequeueInputBuffer(j);
    }

    public TEMediaCodecBufferInfo dequeueOutputBuffer(int i) {
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int iDequeueOutputBuffer = this.m_pCodec.dequeueOutputBuffer(bufferInfo, i);
        TEMediaCodecBufferInfo tEMediaCodecBufferInfo = new TEMediaCodecBufferInfo();
        tEMediaCodecBufferInfo.presentationTimeUs = bufferInfo.presentationTimeUs;
        tEMediaCodecBufferInfo.flags = bufferInfo.flags;
        tEMediaCodecBufferInfo.offset = bufferInfo.offset;
        tEMediaCodecBufferInfo.size = bufferInfo.size;
        tEMediaCodecBufferInfo.retVal = iDequeueOutputBuffer;
        return tEMediaCodecBufferInfo;
    }

    public ByteBuffer getBuffer(String str) {
        MediaFormat mediaFormat = this.m_outputFormat;
        if (mediaFormat != null) {
            return mediaFormat.getByteBuffer(str);
        }
        return null;
    }

    public ByteBuffer getInputBuffer(int i) {
        return this.m_pCodec.getInputBuffer(i);
    }

    public ByteBuffer getOutputBuffer(int i) {
        return this.m_pCodec.getOutputBuffer(i);
    }

    public int getProfile(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevelLIZIZ = C1284430jWr.LIZIZ(this.m_codecCapabilities, i, i2);
        this.m_profileLevel = codecProfileLevelLIZIZ;
        if (codecProfileLevelLIZIZ == null) {
            C2484209oO.LIZJ("NDKEncoder", "Profile level not found");
        }
        return this.m_profileLevel.profile;
    }

    public int releaseOutputBuffer(int i, boolean z) {
        this.m_pCodec.releaseOutputBuffer(i, z);
        return 0;
    }

    public void setFloat(String str, float f) {
        if (this.mIsCodecStarted) {
            if (this.updateParams == null) {
                this.updateParams = new Bundle();
            }
            this.updateParams.putFloat(str, f);
            return;
        }
        this.m_pFormat.setFloat(str, f);
    }

    public void setInt32(String str, int i) {
        if (this.mIsCodecStarted) {
            if (this.updateParams == null) {
                this.updateParams = new Bundle();
            }
            this.updateParams.putInt(str, i);
            return;
        }
        this.m_pFormat.setInteger(str, i);
    }

    public void setString(String str, String str2) {
        if (this.mIsCodecStarted) {
            if (this.updateParams == null) {
                this.updateParams = new Bundle();
            }
            C786410Ut5.LJJJI(str, str2, this.updateParams);
            return;
        }
        this.m_pFormat.setString(str, str2);
    }

    public void createFormat(String str, int i, int i2) {
        this.m_pFormat = MediaFormat.createVideoFormat(str, i, i2);
    }

    public String getCodecInfo(String str, int i, int i2) {
        try {
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(str);
            this.infoCodec = mediaCodecCreateEncoderByType;
            MediaCodecInfo codecInfo = mediaCodecCreateEncoderByType.getCodecInfo();
            this.m_mediaCodecInfo = codecInfo;
            MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfo.getCapabilitiesForType(str);
            this.m_codecCapabilities = capabilitiesForType;
            this.m_mimeType = str;
            boolean z = false;
            for (int i3 : capabilitiesForType.colorFormats) {
                if (i3 == 54) {
                    C2484209oO.LJI(this.TAG, "HDR 10 bit encoding supported");
                    z = true;
                }
            }
            this.m_useHDR10Bit = z;
            this.m_codecInfoName = this.m_mediaCodecInfo.getName().toLowerCase();
            String str2 = this.TAG;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Codec name: ");
            sbLIZ.append(this.m_codecInfoName);
            C2484209oO.LIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
            MediaCodecInfo.VideoCapabilities videoCapabilities = this.m_codecCapabilities.getVideoCapabilities();
            this.m_maxFPS = Integer.MAX_VALUE;
            try {
                this.m_maxFPS = ((Double) videoCapabilities.getSupportedFrameRatesFor(i2, i).getUpper()).intValue();
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                C2484209oO.LJIIIIZZ(this.TAG, "getSupportedFrameRate unsupported size");
            }
            return this.m_codecInfoName;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringWriter stringWriter = new StringWriter();
            e2.printStackTrace(new PrintWriter(stringWriter));
            String str3 = this.TAG;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("MediaCodecInfoProvider getCodecInfo Exception");
            sbLIZ2.append(stringWriter);
            C2484209oO.LJIIIIZZ(this.TAG, C2484209oO.LJ(str3, C2188811AlT.LIZIZ(sbLIZ2), new C2484309oP[0]));
            return null;
        }
    }

    public int getLevel(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT < 24) {
            return 0;
        }
        MediaCodec mediaCodec = this.infoCodec;
        if (mediaCodec != null) {
            mediaCodec.release();
            this.infoCodec = null;
        }
        if (this.m_mimeType.equals("video/avc") && VEConfigCenter.getInstance().getValue("ve_enable_adaptive_encode_level", false).booleanValue()) {
            return C1284430jWr.LIZ(this.m_profileLevel, i, i2, i3, i4);
        }
        return this.m_profileLevel.level;
    }

    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        this.m_pCodec.queueInputBuffer(i, i2, i3, j, i4);
    }
}
