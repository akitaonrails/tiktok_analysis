package com.ss.android.vesdk.algorithm;

import X.C2188811AlT;
import com.ss.android.ttve.nativePort.TEParcelWrapper;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes34.dex */
public class VEBachQRCodeResult extends s {
    public int mCodeType;
    public float zoomRefactor;
    public String mResult = "";
    public float[][] mLocation = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 4, 2);

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEBachQRCodeResult{mResult='");
        sbLIZ.append(this.mResult);
        sbLIZ.append('\'');
        sbLIZ.append(", mCodeType=");
        sbLIZ.append(this.mCodeType);
        sbLIZ.append(", zoomRefactor=");
        sbLIZ.append(this.zoomRefactor);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int getCodeType() {
        return this.mCodeType;
    }

    public float[][] getLocation() {
        return this.mLocation;
    }

    public String getResult() {
        return this.mResult;
    }

    public float getZoomRefactor() {
        return this.zoomRefactor;
    }

    public static VEBachQRCodeResult fromCameraParcel(byte[] bArr) {
        TEParcelWrapper tEParcelWrapper = new TEParcelWrapper(bArr);
        VEBachQRCodeResult vEBachQRCodeResult = new VEBachQRCodeResult();
        vEBachQRCodeResult.retCode = tEParcelWrapper.readInt();
        vEBachQRCodeResult.setCodeType(tEParcelWrapper.readInt());
        vEBachQRCodeResult.setZoomRefactor(tEParcelWrapper.readFloat());
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 4, 2);
        int i = 0;
        do {
            fArr[i][0] = tEParcelWrapper.readFloat();
            fArr[i][1] = tEParcelWrapper.readFloat();
            i++;
        } while (i < 4);
        vEBachQRCodeResult.setResult(tEParcelWrapper.readString());
        vEBachQRCodeResult.setLocation(fArr);
        return vEBachQRCodeResult;
    }

    public void setCodeType(int i) {
        this.mCodeType = i;
    }

    public void setLocation(float[][] fArr) {
        this.mLocation = fArr;
    }

    public void setResult(String str) {
        this.mResult = str;
    }

    public void setZoomRefactor(float f) {
        this.zoomRefactor = f;
    }
}
