package com.bytedance.bae.codec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.bytedance.realx.base.Logging;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class MediaCodecAACEncoder {
    public MediaCodec mAACEncoder;
    public MediaCodec.BufferInfo mBufferInfo;
    public byte[] mEncodedData;
    public ByteBuffer[] mInputBuffers;
    public ByteBuffer[] mOutputBuffers;
    public String mMimeType = "audio/mp4a-latm";
    public int mSampleRate = 44100;
    public int mChannels = 1;
    public int mProfile = 2;
    public int mBitrate = 64000;
    public int mFrameSize = 1024;

    public void closeEncoder() {
        try {
            MediaCodec mediaCodec = this.mAACEncoder;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.mAACEncoder.release();
                this.mAACEncoder = null;
                Logging.e("MediaCodecAACEncoder", "close AAC encoder success");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Logging.e("MediaCodecAACEncoder", "close AAC encoder failed");
        }
    }

    public boolean configAndStartEncoder() {
        try {
            MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(this.mMimeType, this.mSampleRate, this.mChannels);
            mediaFormatCreateAudioFormat.setInteger("bitrate", this.mBitrate);
            mediaFormatCreateAudioFormat.setInteger("aac-profile", this.mProfile);
            mediaFormatCreateAudioFormat.setInteger("profile", this.mProfile);
            mediaFormatCreateAudioFormat.setInteger("max-input-size", this.mChannels * this.mFrameSize * 100);
            this.mAACEncoder.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            this.mAACEncoder.start();
            this.mBufferInfo = new MediaCodec.BufferInfo();
            Logging.e("MediaCodecAACEncoder", "config AAC encoder success");
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Logging.e("MediaCodecAACEncoder", "Config and Start Encoder Error");
            return false;
        }
    }

    public boolean openEncoder() {
        try {
            this.mAACEncoder = MediaCodec.createEncoderByType(this.mMimeType);
            Logging.e("MediaCodecAACEncoder", "open AAC encoder success");
            return this.mAACEncoder != null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.mAACEncoder = null;
            Logging.e("MediaCodecAACEncoder", "Open AAC encoder failed");
            return false;
        }
    }

    public MediaCodecAACEncoder() {
        Logging.e("MediaCodecAACEncoder", "MediaCodecAAC Encoder Created");
    }

    public byte[] getEncodedData() {
        return this.mEncodedData;
    }

    public int getFrameSize() {
        return this.mFrameSize;
    }

    public boolean encodeProcess(byte[] bArr) {
        try {
            MediaCodec mediaCodec = this.mAACEncoder;
            if (mediaCodec == null) {
                return false;
            }
            this.mEncodedData = null;
            int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(300L);
            if (iDequeueInputBuffer >= 0) {
                ByteBuffer inputBuffer = this.mAACEncoder.getInputBuffer(iDequeueInputBuffer);
                inputBuffer.clear();
                inputBuffer.put(bArr);
                this.mAACEncoder.queueInputBuffer(iDequeueInputBuffer, 0, bArr.length, 0L, 0);
            }
            int iDequeueOutputBuffer = this.mAACEncoder.dequeueOutputBuffer(this.mBufferInfo, 0L);
            MediaCodec.BufferInfo bufferInfo = this.mBufferInfo;
            int i = bufferInfo.size;
            int i2 = bufferInfo.flags & 2;
            if (i > 0 && iDequeueOutputBuffer >= 0) {
                if (i2 == 2) {
                    this.mAACEncoder.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    return true;
                }
                ByteBuffer outputBuffer = this.mAACEncoder.getOutputBuffer(iDequeueOutputBuffer);
                byte[] bArr2 = new byte[i];
                this.mEncodedData = bArr2;
                outputBuffer.get(bArr2, this.mBufferInfo.offset, i);
                outputBuffer.clear();
                this.mAACEncoder.releaseOutputBuffer(iDequeueOutputBuffer, false);
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Logging.e("MediaCodecAACEncoder", "AAC Encoder Encode failed");
            return false;
        }
    }

    public void setBitRateValue(int i) {
        this.mBitrate = i;
    }

    public boolean setBitrate(int i) {
        try {
            MediaCodec mediaCodec = this.mAACEncoder;
            if (mediaCodec == null) {
                return false;
            }
            mediaCodec.stop();
            MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(this.mMimeType, this.mSampleRate, this.mChannels);
            mediaFormatCreateAudioFormat.setInteger("bitrate", i);
            mediaFormatCreateAudioFormat.setInteger("aac-profile", this.mProfile);
            this.mAACEncoder.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            this.mAACEncoder.start();
            this.mBitrate = i;
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Logging.e("MediaCodecAACEncoder", "Config and Start Encoder Error");
            return false;
        }
    }

    public void setChannelsValue(int i) {
        this.mChannels = i;
    }

    public void setProfileValue(String str) {
        if (str.equals("he_aac")) {
            this.mProfile = 5;
            this.mFrameSize = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
        } else if (str.equals("he_aac_v2")) {
            this.mProfile = 29;
            this.mFrameSize = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
        } else {
            this.mProfile = 2;
            this.mFrameSize = 1024;
        }
    }

    public void setSampleRateValue(int i) {
        this.mSampleRate = i;
    }
}
