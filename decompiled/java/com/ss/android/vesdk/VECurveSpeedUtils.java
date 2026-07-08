package com.ss.android.vesdk;

import X.C2188811AlT;
import X.C2484209oO;
import com.ss.android.ttve.nativePort.TEVideoUtils;

/* JADX INFO: loaded from: classes4.dex */
public class VECurveSpeedUtils {
    public double mAveSpeed;
    public float[] mCurveSpeedPointX;
    public float[] mCurveSpeedPointY;
    public volatile long mNative;

    public synchronized void destroy() {
        C2484209oO.LJI("VECurveSpeedUtils", "destroy...");
        if (this.mNative == 0) {
            C2484209oO.LIZJ("VECurveSpeedUtils", "destroy, mNative == 0");
        } else {
            TEVideoUtils.nativeCurveSpeedDestroy(this.mNative);
            this.mNative = 0L;
        }
    }

    public double getAveCurveSpeed() {
        if (this.mNative == 0) {
            C2484209oO.LIZJ("VECurveSpeedUtils", "getAveCurveSpeed, mNative == 0");
            return -112.0d;
        }
        double dNativeGetAveCurveSpeed = TEVideoUtils.nativeGetAveCurveSpeed(this.mNative);
        this.mAveSpeed = dNativeGetAveCurveSpeed;
        return dNativeGetAveCurveSpeed;
    }

    public double getCurveSpeedWithSeqDelta(long j) {
        if (this.mNative == 0) {
            C2484209oO.LIZJ("VECurveSpeedUtils", "getCurveSpeedWithSeqDelta, mNative == 0");
            return -112.0d;
        }
        return TEVideoUtils.nativeGetCurveSpeedWithSeqDelta(this.mNative, j * 1000);
    }

    public long mapSeqDeltaToTrimDelta(long j) {
        if (this.mNative == 0) {
            C2484209oO.LIZJ("VECurveSpeedUtils", "mapSeqDeltaToTrimDelta, mNative == 0");
            return -112L;
        }
        return TEVideoUtils.nativeMapSeqDeltaToTrimDelta(this.mNative, j * 1000) / 1000;
    }

    public long mapTrimDeltaToSeqDelta(long j) {
        if (this.mNative == 0) {
            C2484209oO.LIZJ("VECurveSpeedUtils", "mapTrimDeltaToSeqDelta, mNative == 0");
            return -112L;
        }
        return TEVideoUtils.nativeMapTrimDeltaToSeqDelta(this.mNative, j * 1000) / 1000;
    }

    public void setSeqDuration(long j) {
        if (this.mNative == 0) {
            C2484209oO.LIZJ("VECurveSpeedUtils", "setSeqDuration, mNative == 0");
        } else {
            TEVideoUtils.nativeSetSeqDuration(this.mNative, j * 1000);
        }
    }

    public VECurveSpeedUtils(float[] fArr, float[] fArr2) {
        if (fArr != null && fArr2 != null && fArr.length == fArr2.length && fArr.length >= 2) {
            this.mNative = TEVideoUtils.nativeCreateCurveSpeedUtils(fArr, fArr2);
            this.mCurveSpeedPointX = fArr;
            this.mCurveSpeedPointY = fArr2;
            int curveSpeed = setCurveSpeed(fArr, fArr2);
            double aveCurveSpeed = getAveCurveSpeed();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VECurveSpeedUtils ret1 ");
            sbLIZ.append(curveSpeed);
            sbLIZ.append(" ret2 ");
            sbLIZ.append(aveCurveSpeed);
            C2484209oO.LIZ("VECurveSpeedUtils", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        this.mNative = 0L;
        C2484209oO.LIZJ("VECurveSpeedUtils", "incorrect curve anchors, mNative == 0");
    }

    public static float[] transferTrimPointXtoSeqPointX(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float[] fArr3 = new float[length];
        int i = 0;
        float f = 0.0f;
        fArr3[0] = 0.0f;
        while (i < length - 1) {
            int i2 = i + 1;
            f += (fArr[i2] - fArr[i]) / ((fArr2[i2] + fArr2[i]) * 0.5f);
            fArr3[i2] = f;
            i = i2;
        }
        for (int i3 = 1; i3 < length; i3++) {
            fArr3[i3] = fArr3[i3] / f;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("transferTrimPointXtoSeqPointX SeqPointX[");
            sbLIZ.append(i3);
            sbLIZ.append("]= ");
            sbLIZ.append(fArr3[i3]);
            C2484209oO.LIZ("TAG", C2188811AlT.LIZIZ(sbLIZ));
        }
        return fArr3;
    }

    public int setCurveSpeed(float[] fArr, float[] fArr2) {
        if (fArr != null && fArr2 != null && fArr.length == fArr2.length && fArr.length >= 2) {
            if (this.mNative == 0) {
                C2484209oO.LIZJ("VECurveSpeedUtils", "setCurveSpeed, mNative == 0");
                return -112;
            }
            return TEVideoUtils.nativeSetCurveSpeedData(this.mNative, fArr, fArr2);
        }
        C2484209oO.LIZJ("VECurveSpeedUtils", "setCurveSpeed,incorrect curve anchors, mNative == 0");
        return -100;
    }
}
