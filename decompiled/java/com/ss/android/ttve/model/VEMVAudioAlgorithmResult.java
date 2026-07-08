package com.ss.android.ttve.model;

import X.C2188811AlT;
import X.C2484209oO;

/* JADX INFO: loaded from: classes28.dex */
public class VEMVAudioAlgorithmResult {
    public float[] bitsTime;
    public int[] bitsValue;
    public int size;

    public int resizeBeatTrackingNum(int i, int i2) {
        if (i >= i2) {
            return 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("need to transForm beat num... musicTime = ");
        sbLIZ.append(i);
        sbLIZ.append(", mvTime = ");
        sbLIZ.append(i2);
        C2484209oO.LJI("VEMVAudioAlgorithmResult", C2188811AlT.LIZIZ(sbLIZ));
        int i3 = i2 / i;
        float f = i;
        int i4 = this.size;
        int i5 = ((int) (((i2 - (i * i3)) / f) * i4)) + 1;
        int i6 = (i4 * i3) + i5;
        int[] iArr = new int[i6];
        float[] fArr = new float[i6];
        float[] fArr2 = new float[this.bitsTime.length];
        for (int i7 = 0; i7 < i3; i7++) {
            int[] iArr2 = this.bitsValue;
            int i8 = this.size;
            System.arraycopy(iArr2, 0, iArr, i8 * i7, i8);
            int i9 = 0;
            while (true) {
                float[] fArr3 = this.bitsTime;
                if (i9 < fArr3.length) {
                    fArr2[i9] = fArr3[i9] + ((f / 1000.0f) * i7);
                    i9++;
                }
            }
            int i10 = this.size;
            System.arraycopy(fArr2, 0, fArr, i10 * i7, i10);
        }
        int i11 = 0;
        while (true) {
            float[] fArr4 = this.bitsTime;
            if (i11 < fArr4.length) {
                fArr2[i11] = fArr4[i11] + ((f / 1000.0f) * i3);
                i11++;
            } else {
                System.arraycopy(this.bitsValue, 0, iArr, this.size * i3, i5);
                System.arraycopy(fArr2, 0, fArr, this.size * i3, i5);
                this.bitsValue = iArr;
                this.bitsTime = fArr;
                this.size = i6;
                return 0;
            }
        }
    }
}
