package com.ss.android.ttve.mediacodec;

import X.C1284580jX6;
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
public class TEAudioHwDecoder {
    public static long INPUT_DEQUEUE_TIMEOUT_US = 10000;
    public MediaCodec audioDecoder;
    public byte[] curAsc;
    public String curMimeType;
    public volatile boolean decoderStarted;
    public volatile long inputCountQueued;
    public volatile boolean inputEof;
    public MediaFormat inputFormat;
    public volatile long outputCountDequeued;
    public volatile boolean outputEof;
    public MediaFormat outputFormat;
    public C1284580jX6 theOldestPcmData;
    public int curSampleRate = -1;
    public int curChannelCount = -1;
    public LinkedBlockingQueue<C1284580jX6> pcmQueue = new LinkedBlockingQueue<>();
    public MediaCodec.BufferInfo outputBufferInfo = new MediaCodec.BufferInfo();

    private int drainOutputBuffer() {
        while (true) {
            try {
                if (this.outputEof) {
                    break;
                }
                int iDequeueOutputBuffer = this.audioDecoder.dequeueOutputBuffer(this.outputBufferInfo, 0L);
                if (iDequeueOutputBuffer >= 0) {
                    if (this.outputBufferInfo.size > 0) {
                        ByteBuffer byteBufferGeOutputBufferByIndex = geOutputBufferByIndex(iDequeueOutputBuffer);
                        byteBufferGeOutputBufferByIndex.position(this.outputBufferInfo.offset);
                        MediaCodec.BufferInfo bufferInfo = this.outputBufferInfo;
                        byteBufferGeOutputBufferByIndex.limit(bufferInfo.offset + bufferInfo.size);
                        byte[] bArr = new byte[this.outputBufferInfo.size];
                        byteBufferGeOutputBufferByIndex.get(bArr);
                        addPcmData(bArr);
                        this.outputCountDequeued++;
                    }
                    this.audioDecoder.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    if ((this.outputBufferInfo.flags & 4) != 0) {
                        C2484209oO.LJI("TEAudioHwDecoder", "output buffer eof");
                        this.outputEof = true;
                        return 0;
                    }
                } else if (iDequeueOutputBuffer == -3) {
                    C2484209oO.LJI("TEAudioHwDecoder", "output buffer changed, need to getOutputBuffers again");
                } else if (iDequeueOutputBuffer == -2) {
                    this.outputFormat = this.audioDecoder.getOutputFormat();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("output buffer format changed: ");
                    sbLIZ.append(this.outputFormat);
                    C2484209oO.LJI("TEAudioHwDecoder", C2188811AlT.LIZIZ(sbLIZ));
                    int integer = this.outputFormat.getInteger("sample-rate");
                    int integer2 = this.outputFormat.getInteger("channel-count");
                    if (this.curSampleRate != integer || this.curChannelCount != integer2) {
                        C2484209oO.LIZJ("TEAudioHwDecoder", "audio meta info changed, error error error !!!");
                    }
                } else if (iDequeueOutputBuffer != -1) {
                    C2484209oO.LIZ("TEAudioHwDecoder", "not available output buffer");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("drainOutputBuffer error: ");
                sbLIZ2.append(th.getMessage());
                C2484209oO.LIZJ("TEAudioHwDecoder", C2188811AlT.LIZIZ(sbLIZ2));
                return -6000;
            }
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x006e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.media.MediaCodecInfo getGoogleMediaCodecInfo() {
        /*
            r10 = this;
            java.lang.String r0 = r10.curMimeType
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r9 = 0
            if (r0 == 0) goto La
            return r9
        La:
            android.media.MediaCodecList r1 = new android.media.MediaCodecList     // Catch: java.lang.Throwable -> La7
            r0 = 1
            r1.<init>(r0)     // Catch: java.lang.Throwable -> La7
            android.media.MediaCodecInfo[] r5 = r1.getCodecInfos()
            int r4 = r5.length
            r3 = 0
        L16:
            if (r3 >= r4) goto La6
            r7 = r5[r3]
            boolean r0 = r7.isEncoder()
            if (r0 != 0) goto L6e
            java.lang.String r1 = r7.getName()
            java.lang.String r0 = "OMX.google"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L6e
            java.lang.String[] r8 = r7.getSupportedTypes()
            int r6 = r8.length
            r2 = 0
        L32:
            if (r2 >= r6) goto L6e
            r1 = r8[r2]
            java.lang.String r0 = r10.curMimeType
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto La2
            java.lang.String r0 = r10.curMimeType
            android.media.MediaCodecInfo$CodecCapabilities r0 = r7.getCapabilitiesForType(r0)
            android.media.MediaCodecInfo$AudioCapabilities r6 = r0.getAudioCapabilities()
            int r0 = r10.curSampleRate
            boolean r0 = r6.isSampleRateSupported(r0)
            java.lang.String r2 = "TEAudioHwDecoder"
            if (r0 != 0) goto L71
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = r7.getName()
            r1.append(r0)
            java.lang.String r0 = " not support SampleRate: "
            r1.append(r0)
            int r0 = r10.curSampleRate
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C2484209oO.LIZJ(r2, r0)
        L6e:
            int r3 = r3 + 1
            goto L16
        L71:
            int r1 = r10.curChannelCount
            int r0 = r6.getMaxInputChannelCount()
            if (r1 <= r0) goto La5
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = r7.getName()
            r1.append(r0)
            java.lang.String r0 = " not support ChannelCount: "
            r1.append(r0)
            int r0 = r10.curChannelCount
            r1.append(r0)
            java.lang.String r0 = ", max channel count is "
            r1.append(r0)
            int r0 = r6.getMaxInputChannelCount()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C2484209oO.LIZJ(r2, r0)
            goto L6e
        La2:
            int r2 = r2 + 1
            goto L32
        La5:
            return r7
        La6:
            return r9
        La7:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEAudioHwDecoder.getGoogleMediaCodecInfo():android.media.MediaCodecInfo");
    }

    private byte[] getPcmData() {
        C1284580jX6 c1284580jX6 = this.theOldestPcmData;
        if (c1284580jX6 != null) {
            return c1284580jX6.LIZ;
        }
        return null;
    }

    private long getPcmPts() {
        C1284580jX6 c1284580jX6 = this.theOldestPcmData;
        if (c1284580jX6 != null) {
            return c1284580jX6.LIZIZ;
        }
        return -1L;
    }

    private void releaseDecoder() {
        if (this.audioDecoder == null) {
            return;
        }
        if (this.decoderStarted) {
            try {
                this.audioDecoder.stop();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MediaCodec stop exception: ");
                sbLIZ.append(e.getMessage());
                C2484209oO.LIZJ("TEAudioHwDecoder", C2188811AlT.LIZIZ(sbLIZ));
            }
            this.decoderStarted = false;
        }
        this.audioDecoder.release();
        this.audioDecoder = null;
        resetCodecInfo();
    }

    private void resetCodecInfo() {
        this.inputCountQueued = 0L;
        this.outputCountDequeued = 0L;
        this.inputEof = false;
        this.outputEof = false;
    }

    private MediaCodec selectMediaCodec() {
        MediaCodec mediaCodecCreateByCodecName;
        MediaCodec mediaCodecCreateDecoderByType = null;
        if (TextUtils.isEmpty(this.curMimeType)) {
            return null;
        }
        MediaCodecInfo googleMediaCodecInfo = getGoogleMediaCodecInfo();
        if (googleMediaCodecInfo != null) {
            try {
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(googleMediaCodecInfo.getName());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("createByCodecName error: ");
                sbLIZ.append(e.getMessage());
                C2484209oO.LIZJ("TEAudioHwDecoder", C2188811AlT.LIZIZ(sbLIZ));
                mediaCodecCreateByCodecName = null;
            }
        } else {
            mediaCodecCreateByCodecName = null;
        }
        if (mediaCodecCreateByCodecName == null) {
            try {
                mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(this.curMimeType);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("createDecoderByType error: ");
                sbLIZ2.append(e2.getMessage());
                C2484209oO.LIZJ("TEAudioHwDecoder", C2188811AlT.LIZIZ(sbLIZ2));
            }
        } else {
            mediaCodecCreateDecoderByType = mediaCodecCreateByCodecName;
        }
        if (mediaCodecCreateDecoderByType != null) {
            C2484209oO.LJI("TEAudioHwDecoder", "selectMediaCodec, decoder name: " + mediaCodecCreateDecoderByType.getName());
        }
        return mediaCodecCreateDecoderByType;
    }

    private int startDecoder() {
        try {
            MediaCodec mediaCodecSelectMediaCodec = selectMediaCodec();
            this.audioDecoder = mediaCodecSelectMediaCodec;
            if (mediaCodecSelectMediaCodec != null) {
                mediaCodecSelectMediaCodec.configure(this.inputFormat, (Surface) null, (MediaCrypto) null, 0);
                this.audioDecoder.start();
                this.decoderStarted = true;
                return 0;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("create decoder failure, mime: ");
            sbLIZ.append(this.curMimeType);
            C2484209oO.LIZJ("TEAudioHwDecoder", C2188811AlT.LIZIZ(sbLIZ));
            return -201;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("startDecoder: ");
            sbLIZ2.append(e.getMessage());
            C2484209oO.LIZJ("TEAudioHwDecoder", C2188811AlT.LIZIZ(sbLIZ2));
            return -203;
        }
    }

    private int closeDecoder() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("closeDecoder, ");
        sbLIZ.append(hashCode());
        C2484209oO.LJI("TEAudioHwDecoder", C2188811AlT.LIZIZ(sbLIZ));
        releaseDecoder();
        this.curMimeType = null;
        this.curSampleRate = -1;
        this.curChannelCount = -1;
        this.curAsc = null;
        return 0;
    }

    private int flushDecoder() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("flushDecoder, inputEof: ");
        sbLIZ.append(this.inputEof);
        sbLIZ.append(", outputEof: ");
        sbLIZ.append(this.outputEof);
        sbLIZ.append(", inputCountQueued: ");
        sbLIZ.append(this.inputCountQueued);
        sbLIZ.append(", ");
        sbLIZ.append(hashCode());
        C2484209oO.LJI("TEAudioHwDecoder", C2188811AlT.LIZIZ(sbLIZ));
        if (this.audioDecoder == null) {
            return -204;
        }
        try {
            if (this.inputEof || this.outputEof) {
                int iRestartDecoder = restartDecoder();
                this.pcmQueue.clear();
                this.theOldestPcmData = null;
                return iRestartDecoder;
            }
            if (this.inputCountQueued > 0) {
                this.audioDecoder.flush();
                this.inputCountQueued = 0L;
                this.outputCountDequeued = 0L;
            }
            this.pcmQueue.clear();
            this.theOldestPcmData = null;
            return 0;
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("flushDecoder error: ");
                sbLIZ2.append(th.getMessage());
                C2484209oO.LIZJ("TEAudioHwDecoder", C2188811AlT.LIZIZ(sbLIZ2));
                this.pcmQueue.clear();
                this.theOldestPcmData = null;
                return -211;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                this.pcmQueue.clear();
                this.theOldestPcmData = null;
                throw th2;
            }
        }
    }

    private int restartDecoder() {
        releaseDecoder();
        return startDecoder();
    }

    private void addPcmData(byte[] bArr) {
        C1284580jX6 c1284580jX6 = new C1284580jX6();
        c1284580jX6.LIZ = bArr;
        c1284580jX6.LIZIZ = this.outputBufferInfo.presentationTimeUs;
        this.pcmQueue.add(c1284580jX6);
    }

    private ByteBuffer geOutputBufferByIndex(int i) {
        return this.audioDecoder.getOutputBuffer(i);
    }

    private ByteBuffer getInputBufferByIndex(int i) {
        return this.audioDecoder.getInputBuffer(i);
    }

    private boolean sameAsc(byte[] bArr) {
        byte[] bArr2 = this.curAsc;
        if (bArr2 == null && bArr == null) {
            return true;
        }
        if (bArr2 == null || bArr == null || bArr2.length != bArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            byte[] bArr3 = this.curAsc;
            if (i >= bArr3.length) {
                return true;
            }
            if (bArr3[i] != bArr[i]) {
                return false;
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    /* JADX WARN: Type inference failed for: r5v5 */
    private int[] decodeFrame(byte[] bArr, long j) {
        boolean z;
        int length;
        int i;
        ?? r5;
        int length2;
        ?? DrainOutputBuffer = "TEAudioHwDecoder";
        if (bArr != null && bArr.length > 0) {
            length = bArr.length;
            i = 0;
            z = false;
        } else {
            z = true;
            length = 0;
            i = 0;
        }
        while (true) {
            try {
                if (this.inputEof || (i >= length && !z)) {
                    break;
                }
                int iDequeueInputBuffer = this.audioDecoder.dequeueInputBuffer(INPUT_DEQUEUE_TIMEOUT_US);
                if (iDequeueInputBuffer >= 0) {
                    if (!z) {
                        ByteBuffer inputBufferByIndex = getInputBufferByIndex(iDequeueInputBuffer);
                        inputBufferByIndex.clear();
                        int iMin = Math.min(length - i, inputBufferByIndex.remaining());
                        inputBufferByIndex.put(bArr, i, iMin);
                        i += iMin;
                        this.audioDecoder.queueInputBuffer(iDequeueInputBuffer, 0, iMin, j, 0);
                        this.inputCountQueued++;
                    } else {
                        this.audioDecoder.queueInputBuffer(iDequeueInputBuffer, 0, 0, j, 4);
                        this.inputEof = true;
                        C2484209oO.LJI("TEAudioHwDecoder", "input buffer eof");
                        break;
                    }
                } else if (iDequeueInputBuffer == -1) {
                    C2484209oO.LIZ("TEAudioHwDecoder", "dequeue input buffer timeout, try again later");
                } else {
                    C2484209oO.LIZ("TEAudioHwDecoder", "not available input buffer");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("drainOutputBuffer error: ");
                sbLIZ.append(th.getMessage());
                C2484209oO.LIZJ(DrainOutputBuffer, C2188811AlT.LIZIZ(sbLIZ));
                r5 = -5000;
            }
        }
        DrainOutputBuffer = drainOutputBuffer();
        r5 = DrainOutputBuffer;
        C1284580jX6 c1284580jX6Poll = this.pcmQueue.poll();
        this.theOldestPcmData = c1284580jX6Poll;
        if (c1284580jX6Poll != null) {
            length2 = c1284580jX6Poll.LIZ.length;
        } else {
            length2 = 0;
        }
        return new int[]{r5, i, length2};
    }

    private int initDecoder(String str, int i, int i2, byte[] bArr) {
        boolean z;
        int length;
        if (!TextUtils.isEmpty(str) && i > 0 && i2 > 0) {
            if (str.equals(this.curMimeType) && this.curSampleRate == i && this.curChannelCount == i2 && sameAsc(bArr)) {
                z = false;
            } else {
                z = true;
            }
            this.curMimeType = str;
            this.curSampleRate = i;
            this.curChannelCount = i2;
            this.curAsc = bArr;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initDecoder, mimeType: ");
            sbLIZ.append(str);
            sbLIZ.append(", sampleRate: ");
            sbLIZ.append(i);
            sbLIZ.append(", channelCount: ");
            sbLIZ.append(i2);
            sbLIZ.append(", asc size: ");
            if (bArr != null) {
                length = bArr.length;
            } else {
                length = -1;
            }
            sbLIZ.append(length);
            sbLIZ.append(", this: ");
            sbLIZ.append(hashCode());
            C2484209oO.LJI("TEAudioHwDecoder", C2188811AlT.LIZIZ(sbLIZ));
            if (!z && this.decoderStarted) {
                return 0;
            }
            MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(str, i, i2);
            this.inputFormat = mediaFormatCreateAudioFormat;
            if (bArr != null && bArr.length > 0) {
                mediaFormatCreateAudioFormat.setByteBuffer("csd-0", ByteBuffer.wrap(bArr));
            } else {
                mediaFormatCreateAudioFormat.setInteger("is-adts", 1);
            }
            return restartDecoder();
        }
        return -101;
    }
}
