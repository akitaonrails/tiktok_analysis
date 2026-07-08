package com.bytedance.bae.codec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.bytedance.realx.base.Logging;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class MediaCodecAACDecoder {
    public long input_ts;
    public MediaCodec mAACDecoder;
    public byte[] mAsc;
    public MediaCodec.BufferInfo mBufferInfo;
    public byte[] mDecodedData;
    public int mHasADTS;
    public ByteBuffer[] mInputBuffers;
    public ByteBuffer[] mOutputBuffers;
    public MediaFormat mOutputFormat;
    public long output_ts;
    public String mMimeType = "audio/mp4a-latm";
    public int mSampleRate = 44100;
    public int mChannels = 1;
    public int mProfile = 2;

    public boolean configAndStartDecoder() {
        try {
            MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(this.mMimeType, this.mSampleRate, this.mChannels);
            mediaFormatCreateAudioFormat.setInteger("aac-profile", this.mProfile);
            mediaFormatCreateAudioFormat.setInteger("is-adts", this.mHasADTS);
            mediaFormatCreateAudioFormat.setInteger("aac-max-output-channel_count", this.mChannels);
            genAsc();
            mediaFormatCreateAudioFormat.setByteBuffer("csd-0", ByteBuffer.wrap(this.mAsc));
            this.mAACDecoder.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 0);
            this.mAACDecoder.start();
            this.mBufferInfo = new MediaCodec.BufferInfo();
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            closeDecoder();
            Logging.e("MediaCodecAACDecoder", "Config and Start Decoder Error");
            return false;
        }
    }

    public boolean openEncoder() {
        try {
            MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(this.mMimeType);
            this.mAACDecoder = mediaCodecCreateDecoderByType;
            return mediaCodecCreateDecoderByType != null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.mAACDecoder = null;
            Logging.e("MediaCodecAACDecoder", "Open AAC Decoder failed");
            return false;
        }
    }

    private void genAsc() {
        int i;
        int i2 = this.mProfile;
        int i3 = 4;
        if (i2 == 2) {
            this.mAsc = new byte[2];
        } else {
            this.mAsc = new byte[4];
        }
        int i4 = this.mSampleRate;
        if (48000 == i4) {
            i = 6;
            i3 = 3;
        } else if (44100 == i4) {
            i = 7;
        } else if (32000 == i4) {
            i3 = 5;
            i = 8;
        } else {
            i3 = 0;
            i = 0;
        }
        int i5 = this.mChannels;
        int i6 = 1 == i5 ? 1 : 2 == i5 ? 2 : 0;
        byte b = (byte) i2;
        if (2 == i2) {
            byte[] bArr = this.mAsc;
            bArr[0] = (byte) ((b << 3) | (i3 >> 1));
            bArr[1] = (byte) ((i3 << 7) | (i6 << 3));
        } else {
            if (5 == i2) {
                byte[] bArr2 = this.mAsc;
                bArr2[0] = (byte) ((b << 3) | (i >> 1));
                bArr2[1] = (byte) ((i << 7) | (i6 << 3) | (i3 >> 1));
                bArr2[2] = (byte) ((i3 << 7) | 8);
                bArr2[3] = 0;
                return;
            }
            if (29 == i2) {
                byte[] bArr3 = this.mAsc;
                bArr3[0] = (byte) ((b << 3) | (i >> 1));
                bArr3[1] = (byte) ((i << 7) | 8 | (i3 >> 1));
                bArr3[2] = (byte) ((i3 << 7) | 8);
                bArr3[3] = 0;
            }
        }
    }

    public void closeDecoder() {
        try {
            MediaCodec mediaCodec = this.mAACDecoder;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.mAACDecoder.release();
                this.mAACDecoder = null;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Logging.e("MediaCodecAACDecoder", "close AAC decoder failed");
        }
    }

    public int getOutputChannels() {
        return this.mOutputFormat.getInteger("channel-count");
    }

    public int getOutputSampleRate() {
        return this.mOutputFormat.getInteger("sample-rate");
    }

    public MediaCodecAACDecoder() {
        Logging.e("MediaCodecAACDecoder", "MediaCodecAAC Decoder Created");
    }

    public byte[] getDecodedData() {
        return this.mDecodedData;
    }

    public long getOutputTs() {
        return this.output_ts;
    }

    public boolean decodeProcess(byte[] bArr) {
        try {
            MediaCodec mediaCodec = this.mAACDecoder;
            if (mediaCodec == null) {
                return false;
            }
            this.mDecodedData = null;
            int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(300L);
            if (iDequeueInputBuffer >= 0) {
                ByteBuffer inputBuffer = this.mAACDecoder.getInputBuffer(iDequeueInputBuffer);
                inputBuffer.clear();
                inputBuffer.put(bArr);
                this.mAACDecoder.queueInputBuffer(iDequeueInputBuffer, 0, bArr.length, (this.input_ts * 1000000) / ((long) this.mSampleRate), 0);
            }
            int iDequeueOutputBuffer = this.mAACDecoder.dequeueOutputBuffer(this.mBufferInfo, 0L);
            MediaCodec.BufferInfo bufferInfo = this.mBufferInfo;
            int i = bufferInfo.size;
            if (i > 0 && iDequeueOutputBuffer >= 0) {
                this.output_ts = (bufferInfo.presentationTimeUs * ((long) this.mSampleRate)) / 1000000;
                ByteBuffer outputBuffer = this.mAACDecoder.getOutputBuffer(iDequeueOutputBuffer);
                byte[] bArr2 = new byte[i];
                this.mDecodedData = bArr2;
                MediaCodec.BufferInfo bufferInfo2 = this.mBufferInfo;
                outputBuffer.get(bArr2, bufferInfo2.offset, bufferInfo2.size);
                outputBuffer.clear();
                this.mOutputFormat = this.mAACDecoder.getOutputFormat(iDequeueOutputBuffer);
                this.mAACDecoder.releaseOutputBuffer(iDequeueOutputBuffer, false);
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Logging.e("MediaCodecAACDecoder", "AAC Decoder Decode failed");
            return false;
        }
    }

    public void setADTSValue(int i) {
        this.mHasADTS = i;
    }

    public void setChannelsValue(int i) {
        this.mChannels = i;
    }

    public void setInputTs(long j) {
        this.input_ts = j;
    }

    public void setProfileValue(String str) {
        if (str.equals("he_aac")) {
            this.mProfile = 5;
        } else if (str.equals("he_aac_v2")) {
            this.mProfile = 29;
        } else {
            this.mProfile = 2;
        }
    }

    public void setSampleRateValue(int i) {
        this.mSampleRate = i;
    }
}
