package com.ss.android.vesdk.bachfaceinfo;

import com.ss.android.ttve.nativePort.TEParcelWrapper;

/* JADX INFO: loaded from: classes34.dex */
public class VEFaceAttributeInfo {
    public int faceCount;
    public VEFaceAttribute[] info;
    public TEParcelWrapper parcelWrapper;

    public void readFromParcel() {
        TEParcelWrapper tEParcelWrapper = this.parcelWrapper;
        if (tEParcelWrapper == null) {
            return;
        }
        int i = tEParcelWrapper.readInt();
        this.faceCount = i;
        if (i == 0) {
            return;
        }
        this.info = new VEFaceAttribute[i];
        for (int i2 = 0; i2 < this.faceCount; i2++) {
            VEFaceAttribute vEFaceAttribute = new VEFaceAttribute();
            vEFaceAttribute.setParcelWrapper(this.parcelWrapper);
            vEFaceAttribute.readFromParcel();
            this.info[i2] = vEFaceAttribute;
        }
    }

    public VEFaceAttribute[] getInfo() {
        return this.info;
    }

    public void setInfo(VEFaceAttribute[] vEFaceAttributeArr) {
        this.info = vEFaceAttributeArr;
    }

    public void setParcelWrapper(TEParcelWrapper tEParcelWrapper) {
        this.parcelWrapper = tEParcelWrapper;
    }
}
