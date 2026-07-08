package com.tiktok.strategycenter.bytedt;

import X.C2188811AlT;
import java.util.Arrays;

/* JADX INFO: loaded from: classes19.dex */
public final class TTMStrategyCenterByteDTPredictResult {
    public final int[] classList;
    public final int errorCode;
    public final int[] leafIdxs;
    public final float[] probList;
    public final float[] scoreList;
    public final int ttmStrategyCenterByteDTModelType;

    public TTMStrategyCenterByteDTPredictResult() {
        this(0, -1, null, null, null, null);
    }

    public final TTMStrategyCenterByteDTModelType getTTMStrategyCenterByteDTModelType() {
        return TTMStrategyCenterByteDTModelType.parseFromIntVal(this.ttmStrategyCenterByteDTModelType);
    }

    public final boolean isSuccess() {
        return this.errorCode == 0;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTMStrategyCenterByteDTPredictResult(errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(", ttmStrategyCenterByteDTModelType=");
        sbLIZ.append(getTTMStrategyCenterByteDTModelType());
        sbLIZ.append(", scoreList=");
        float[] fArr = this.scoreList;
        sbLIZ.append(fArr != null ? Arrays.toString(fArr) : null);
        sbLIZ.append(", probList=");
        float[] fArr2 = this.probList;
        sbLIZ.append(fArr2 != null ? Arrays.toString(fArr2) : null);
        sbLIZ.append(", leafIdxs=");
        int[] iArr = this.leafIdxs;
        sbLIZ.append(iArr != null ? Arrays.toString(iArr) : null);
        sbLIZ.append(", classList=");
        int[] iArr2 = this.classList;
        sbLIZ.append(iArr2 != null ? Arrays.toString(iArr2) : null);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int[] getClassList() {
        return this.classList;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final int[] getLeafIdxs() {
        return this.leafIdxs;
    }

    public final float[] getProbList() {
        return this.probList;
    }

    public final float[] getScoreList() {
        return this.scoreList;
    }

    public TTMStrategyCenterByteDTPredictResult(int i, int i2, float[] fArr, float[] fArr2, int[] iArr, int[] iArr2) {
        this.errorCode = i;
        this.ttmStrategyCenterByteDTModelType = i2;
        this.scoreList = fArr;
        this.probList = fArr2;
        this.leafIdxs = iArr;
        this.classList = iArr2;
    }
}
