package com.ss.android.vesdk;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class VETimelineParams {
    public int[] aTrimIn;
    public int[] aTrimOut;
    public int[] audioFileIndex;
    public String[] audioFilePaths;
    public boolean[] enable;
    public ROTATE_DEGREE[] rotate;
    public double[] speed;
    public String[] transitions;
    public int[] vTrimIn;
    public int[] vTrimOut;
    public int[] videoFileIndex;
    public String[] videoFilePaths;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            String[] strArr = this.videoFilePaths;
            int length = strArr == null ? 0 : strArr.length;
            for (int i = 0; i < length; i++) {
                int[] iArr = this.videoFileIndex;
                if (iArr != null && iArr.length > i) {
                    sb.append(" videoFileIndex: ");
                    sb.append(this.videoFileIndex[i]);
                }
                String[] strArr2 = this.videoFilePaths;
                if (strArr2 != null && strArr2.length > i) {
                    sb.append(" videoFilePath: ");
                    sb.append(this.videoFilePaths[i]);
                }
                int[] iArr2 = this.vTrimIn;
                if (iArr2 != null && iArr2.length > i) {
                    sb.append(" vTrimIn: ");
                    sb.append(this.vTrimIn[i]);
                }
                int[] iArr3 = this.vTrimOut;
                if (iArr3 != null && iArr3.length > i) {
                    sb.append(" vTrimOut: ");
                    sb.append(this.vTrimOut[i]);
                }
                int[] iArr4 = this.aTrimIn;
                if (iArr4 != null && iArr4.length > i) {
                    sb.append(" aTrimIn: ");
                    sb.append(this.aTrimIn[i]);
                }
                int[] iArr5 = this.aTrimOut;
                if (iArr5 != null && iArr5.length > i) {
                    sb.append(" aTrimOut: ");
                    sb.append(this.aTrimOut[i]);
                }
                double[] dArr = this.speed;
                if (dArr != null && dArr.length > i) {
                    sb.append(" speed: ");
                    sb.append(this.speed[i]);
                }
                boolean[] zArr = this.enable;
                if (zArr != null && zArr.length > i) {
                    sb.append(" enable: ");
                    sb.append(this.enable[i]);
                }
                ROTATE_DEGREE[] rotate_degreeArr = this.rotate;
                if (rotate_degreeArr != null && rotate_degreeArr.length > i) {
                    sb.append(" rotate: ");
                    sb.append(this.rotate[i]);
                }
            }
            return sb.toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "Exception";
        }
    }

    public VETimelineParams(String[] strArr) {
        int length = strArr.length;
        this.videoFilePaths = (String[]) strArr.clone();
        int[] iArr = new int[length];
        this.vTrimIn = iArr;
        Arrays.fill(iArr, 0);
        int[] iArr2 = new int[length];
        this.vTrimOut = iArr2;
        Arrays.fill(iArr2, -1);
        int[] iArr3 = new int[length];
        this.aTrimIn = iArr3;
        Arrays.fill(iArr3, 0);
        int[] iArr4 = new int[length];
        this.aTrimOut = iArr4;
        Arrays.fill(iArr4, -1);
        double[] dArr = new double[length];
        this.speed = dArr;
        Arrays.fill(dArr, 1.0d);
        this.transitions = null;
        this.audioFilePaths = null;
        this.videoFileIndex = new int[length];
        this.audioFileIndex = new int[length];
        boolean[] zArr = new boolean[length];
        this.enable = zArr;
        Arrays.fill(zArr, true);
        ROTATE_DEGREE[] rotate_degreeArr = new ROTATE_DEGREE[length];
        this.rotate = rotate_degreeArr;
        Arrays.fill(rotate_degreeArr, ROTATE_DEGREE.ROTATE_NONE);
        for (int i = 0; i < length; i++) {
            this.videoFileIndex[i] = i;
            this.audioFileIndex[i] = i;
        }
    }
}
