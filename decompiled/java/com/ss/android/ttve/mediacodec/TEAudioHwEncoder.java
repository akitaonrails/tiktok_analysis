package com.ss.android.ttve.mediacodec;

import X.C1284590jX7;
import X.C1284600jX8;
import X.C2188811AlT;
import X.C2484209oO;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes21.dex */
public class TEAudioHwEncoder {
    public static long INPUT_DEQUEUE_TIMEOUT_US = 10000;
    public static int TRY_AGAIN_LATER_COUNT_LIMIT = 5;
    public MediaCodec audioEncoder;
    public String curMimeType;
    public volatile boolean encoderStarted;
    public volatile long inputCountDequeued;
    public volatile boolean inputEof;
    public MediaFormat inputFormat;
    public byte[] outputAsc;
    public volatile long outputCountDequeued;
    public volatile boolean outputEof;
    public MediaFormat outputFormat;
    public int curSampleRate = -1;
    public int curChannelCount = -1;
    public int curCodecInfoAACProfile = -1;
    public int curBitrate = -1;
    public int curSampleNumPerChannel = -1;
    public int recordInputBufferSize = -1;
    public LinkedBlockingQueue<C1284600jX8> remainingPcmQueue = new LinkedBlockingQueue<>();
    public C1284590jX7 theOldestAudioData = null;
    public LinkedBlockingQueue<C1284590jX7> audioQueue = new LinkedBlockingQueue<>();
    public MediaCodec.BufferInfo outputBufferInfo = new MediaCodec.BufferInfo();

    private byte[] getAudioData() {
        C1284590jX7 c1284590jX7 = this.theOldestAudioData;
        if (c1284590jX7 != null) {
            return c1284590jX7.LIZ;
        }
        return null;
    }

    private long getAudioPts() {
        C1284590jX7 c1284590jX7 = this.theOldestAudioData;
        if (c1284590jX7 != null) {
            return c1284590jX7.LIZIZ;
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0065, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.media.MediaCodecInfo getGoogleEncoderCodecInfo() {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEAudioHwEncoder.getGoogleEncoderCodecInfo():android.media.MediaCodecInfo");
    }

    private void releaseEncoder() {
        try {
            if (this.audioEncoder == null) {
                return;
            }
            try {
                if (this.encoderStarted) {
                    try {
                        this.audioEncoder.stop();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("MediaCodec stop exception: ");
                        sbLIZ.append(e.getMessage());
                        C2484209oO.LIZJ("TEAudioHwEncoder", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    this.encoderStarted = false;
                }
                this.audioEncoder.release();
                this.audioEncoder = null;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("releaseEncoder: ");
                sbLIZ2.append(e2.getMessage());
                C2484209oO.LIZJ("TEAudioHwEncoder", C2188811AlT.LIZIZ(sbLIZ2));
            }
            resetCodecInfo();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            resetCodecInfo();
            throw th;
        }
    }

    private void resetCodecInfo() {
        this.inputCountDequeued = 0L;
        this.outputCountDequeued = 0L;
        this.inputEof = false;
        this.outputEof = false;
        this.remainingPcmQueue.clear();
        this.audioQueue.clear();
    }

    private MediaCodec selectMediaCodec() {
        MediaCodec mediaCodecCreateByCodecName;
        MediaCodec mediaCodecCreateEncoderByType = null;
        if (TextUtils.isEmpty(this.curMimeType)) {
            return null;
        }
        MediaCodecInfo googleEncoderCodecInfo = getGoogleEncoderCodecInfo();
        if (googleEncoderCodecInfo != null) {
            try {
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(googleEncoderCodecInfo.getName());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("createByCodecName error: ");
                sbLIZ.append(e.getMessage());
                C2484209oO.LIZJ("TEAudioHwEncoder", C2188811AlT.LIZIZ(sbLIZ));
                mediaCodecCreateByCodecName = null;
            }
        } else {
            mediaCodecCreateByCodecName = null;
        }
        if (mediaCodecCreateByCodecName == null) {
            try {
                mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(this.curMimeType);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("createEncoderByType error: ");
                sbLIZ2.append(e2.getMessage());
                C2484209oO.LIZJ("TEAudioHwEncoder", C2188811AlT.LIZIZ(sbLIZ2));
            }
        } else {
            mediaCodecCreateEncoderByType = mediaCodecCreateByCodecName;
        }
        if (mediaCodecCreateEncoderByType != null) {
            C2484209oO.LJI("TEAudioHwEncoder", "selectMediaCodec, encoder name: " + mediaCodecCreateEncoderByType.getName());
            if (this.inputFormat != null) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = mediaCodecCreateEncoderByType.getCodecInfo().getCapabilitiesForType(this.curMimeType).profileLevels;
                boolean z = false;
                if (codecProfileLevelArr != null) {
                    int length = codecProfileLevelArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        if (codecProfileLevelArr[i].profile == this.curCodecInfoAACProfile) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                }
                if (z) {
                    this.inputFormat.setInteger("aac-profile", this.curCodecInfoAACProfile);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("final profile: ");
                    sbLIZ3.append(this.curCodecInfoAACProfile);
                    C2484209oO.LJI("TEAudioHwEncoder", C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
        }
        return mediaCodecCreateEncoderByType;
    }

    private int startEncoder() {
        try {
            MediaCodec mediaCodecSelectMediaCodec = selectMediaCodec();
            this.audioEncoder = mediaCodecSelectMediaCodec;
            if (mediaCodecSelectMediaCodec != null) {
                mediaCodecSelectMediaCodec.configure(this.inputFormat, (Surface) null, (MediaCrypto) null, 1);
                this.audioEncoder.start();
                this.encoderStarted = true;
                return 0;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("create encoder failure, mime: ");
            sbLIZ.append(this.curMimeType);
            C2484209oO.LIZJ("TEAudioHwEncoder", C2188811AlT.LIZIZ(sbLIZ));
            return -201;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("startEncoder: ");
            sbLIZ2.append(e.getMessage());
            C2484209oO.LIZJ("TEAudioHwEncoder", C2188811AlT.LIZIZ(sbLIZ2));
            return -203;
        }
    }

    private int closeEncoder() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("closeEncoder, remainingPcmQueue size: ");
        sbLIZ.append(this.remainingPcmQueue.size());
        sbLIZ.append(", audioQueue size: ");
        sbLIZ.append(this.audioQueue.size());
        sbLIZ.append(", inputCountDequeued: ");
        sbLIZ.append(this.inputCountDequeued);
        sbLIZ.append(", outputCountDequeued: ");
        sbLIZ.append(this.outputCountDequeued);
        C2484209oO.LJI("TEAudioHwEncoder", C2188811AlT.LIZIZ(sbLIZ));
        releaseEncoder();
        this.curMimeType = null;
        this.curChannelCount = -1;
        this.curSampleRate = -1;
        this.curCodecInfoAACProfile = -1;
        this.curSampleNumPerChannel = -1;
        this.outputAsc = null;
        return 0;
    }

    private int restartEncoder() {
        releaseEncoder();
        return startEncoder();
    }

    private byte[] getOutputAsc() {
        return this.outputAsc;
    }

    private void addAudioData(byte[] bArr) {
        C1284590jX7 c1284590jX7 = new C1284590jX7();
        c1284590jX7.LIZ = bArr;
        c1284590jX7.LIZIZ = this.outputBufferInfo.presentationTimeUs;
        this.audioQueue.add(c1284590jX7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x017a, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int drainOutputBuffer(boolean r11) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEAudioHwEncoder.drainOutputBuffer(boolean):int");
    }

    private ByteBuffer geOutputBufferByIndex(int i) {
        return this.audioEncoder.getOutputBuffer(i);
    }

    private ByteBuffer getInputBufferByIndex(int i) {
        return this.audioEncoder.getInputBuffer(i);
    }

    private void addPcmData(byte[] bArr, long j) {
        C1284600jX8 c1284600jX8 = new C1284600jX8();
        c1284600jX8.LIZ = bArr;
        c1284600jX8.LIZIZ = j;
        this.remainingPcmQueue.add(c1284600jX8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b6, code lost:
    
        r17.audioEncoder.queueInputBuffer(r11, r12 ? 1 : 0, (r12 ? 1 : 0) == true ? 1 : 0, r7.LIZIZ, 4);
        r17.inputEof = true;
        r2 = X.C2188811AlT.LIZ();
        r2.append("input buffer eof, remainingPcmQueue size: ");
        r2.append(r17.remainingPcmQueue.size());
        X.C2484209oO.LJI("TEAudioHwEncoder", X.C2188811AlT.LIZIZ(r2));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int encodeFrame(byte[] r18, long r19) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEAudioHwEncoder.encodeFrame(byte[], long):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int initEncoder(java.lang.String r15, int r16, int r17, int r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEAudioHwEncoder.initEncoder(java.lang.String, int, int, int, int, int):int");
    }
}
