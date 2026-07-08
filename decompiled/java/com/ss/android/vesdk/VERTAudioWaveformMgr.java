package com.ss.android.vesdk;

import X.C2188811AlT;
import X.C2484209oO;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes35.dex */
public class VERTAudioWaveformMgr {
    public final int mAudioFormat;
    public final int mChannelNum;
    public long mNative;

    public int destroy() {
        long j = this.mNative;
        if (j == 0) {
            C2484209oO.LIZJ("VERTAudioWaveformMgr", "destroy, mNative == 0");
            return -112;
        }
        int iNativeDeleteRTAudioWaveformMgr = TEVideoUtils.nativeDeleteRTAudioWaveformMgr(j);
        this.mNative = 0L;
        return iNativeDeleteRTAudioWaveformMgr;
    }

    public int finish() {
        long j = this.mNative;
        if (j != 0) {
            return TEVideoUtils.nativeRTAudioWaveformFinish(j);
        }
        C2484209oO.LIZJ("VERTAudioWaveformMgr", "finish, mNative == 0");
        return -112;
    }

    public int reset() {
        long j = this.mNative;
        if (j != 0) {
            return TEVideoUtils.nativeRTAudioWaveformReset(j);
        }
        C2484209oO.LIZJ("VERTAudioWaveformMgr", "reset, mNative == 0");
        return -112;
    }

    public int getRemainedPoints(float[] fArr, int i, int i2) {
        long j = this.mNative;
        if (j == 0) {
            C2484209oO.LIZJ("VERTAudioWaveformMgr", "getRemainedPoints, mNative == 0");
            return -112;
        }
        return TEVideoUtils.nativeRTAudioWaveformGetPoints(j, fArr, i, i2);
    }

    public int process(short[] sArr, int i, int i2) {
        if (this.mNative == 0) {
            C2484209oO.LIZJ("VERTAudioWaveformMgr", "process, mNative == 0");
            return -112;
        }
        int i3 = this.mChannelNum;
        if (i3 >= 0 && i2 >= 0 && i2 * i3 <= sArr.length - i && this.mAudioFormat == 2) {
            float[][] fArr = (float[][]) Array.newInstance((Class<?>) Float.TYPE, i3, i2);
            int i4 = 0;
            while (true) {
                int i5 = this.mChannelNum;
                if (i4 < i5) {
                    for (int i6 = 0; i6 < i2; i6++) {
                        fArr[i4][i6] = sArr[((this.mChannelNum * i6) + i4) + i] / 32767.0f;
                    }
                    i4++;
                } else {
                    return TEVideoUtils.nativeRTAudioWaveformProcess(this.mNative, fArr, i5, i2);
                }
            }
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("process param error mChannelNum ");
            sbLIZ.append(this.mChannelNum);
            sbLIZ.append(", bufSize ");
            sbLIZ.append(sArr.length);
            sbLIZ.append(", offset ");
            sbLIZ.append(i);
            sbLIZ.append(", frameNum ");
            sbLIZ.append(i2);
            sbLIZ.append(", mAudioFormat ");
            sbLIZ.append(this.mAudioFormat);
            C2484209oO.LIZJ("VERTAudioWaveformMgr", C2188811AlT.LIZIZ(sbLIZ));
            return -100;
        }
    }

    public int process(float[] fArr, int i, int i2) {
        if (this.mNative == 0) {
            C2484209oO.LIZJ("VERTAudioWaveformMgr", "process, mNative == 0");
            return -112;
        }
        int i3 = this.mChannelNum;
        if (i3 >= 0 && i2 >= 0 && i2 * i3 <= fArr.length - i && this.mAudioFormat == 4) {
            float[][] fArr2 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, i3, i2);
            int i4 = 0;
            while (true) {
                int i5 = this.mChannelNum;
                if (i4 < i5) {
                    for (int i6 = 0; i6 < i2; i6++) {
                        fArr2[i4][i6] = fArr[(this.mChannelNum * i6) + i4 + i];
                    }
                    i4++;
                } else {
                    return TEVideoUtils.nativeRTAudioWaveformProcess(this.mNative, fArr2, i5, i2);
                }
            }
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("process param error mChannelNum ");
            sbLIZ.append(this.mChannelNum);
            sbLIZ.append(", bufSize ");
            sbLIZ.append(fArr.length);
            sbLIZ.append(", offset ");
            sbLIZ.append(i);
            sbLIZ.append(", frameNum ");
            sbLIZ.append(i2);
            sbLIZ.append(", mAudioFormat ");
            sbLIZ.append(this.mAudioFormat);
            C2484209oO.LIZJ("VERTAudioWaveformMgr", C2188811AlT.LIZIZ(sbLIZ));
            return -100;
        }
    }

    public VERTAudioWaveformMgr(int i, int i2, int i3, float f, int i4) {
        this.mNative = TEVideoUtils.nativeCreateRTAudioWaveformMgr(i2, i3, f, i4);
        this.mChannelNum = i2;
        this.mAudioFormat = i;
    }
}
