package com.ss.android.vesdk.bachfaceinfo;

import com.ss.android.ttve.nativePort.TEParcelWrapper;

/* JADX INFO: loaded from: classes34.dex */
public class VEFaceDetectInfo {
    public VEFaceDetect[] info;
    public TEParcelWrapper parcelWrapper;

    public void readFromParcel() {
        int i = this.parcelWrapper.readInt();
        this.info = new VEFaceDetect[i];
        for (int i2 = 0; i2 < i; i2++) {
            VEFaceDetect vEFaceDetect = new VEFaceDetect();
            vEFaceDetect.setParcelWrapper(this.parcelWrapper);
            vEFaceDetect.readFromParcel();
            this.info[i2] = vEFaceDetect;
        }
    }

    public VEFaceDetect[] getInfo() {
        return this.info;
    }

    public void setInfo(VEFaceDetect[] vEFaceDetectArr) {
        this.info = vEFaceDetectArr;
    }

    public void setParcelWrapper(TEParcelWrapper tEParcelWrapper) {
        this.parcelWrapper = tEParcelWrapper;
    }
}
