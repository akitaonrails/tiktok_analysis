package com.ss.android.vesdk.algorithm;

import com.ss.android.vesdk.bachfaceinfo.VEFaceAttributeInfo;
import com.ss.android.vesdk.bachfaceinfo.VEFaceDetectInfo;

/* JADX INFO: loaded from: classes4.dex */
public class VEFaceExpressionDetectResult extends s {
    public final VEFaceAttributeInfo faceAttributeInfo;
    public final VEFaceDetectInfo faceDetectInfo;

    public VEFaceAttributeInfo getFaceAttributeInfo() {
        return this.faceAttributeInfo;
    }

    public VEFaceDetectInfo getFaceDetectInfo() {
        return this.faceDetectInfo;
    }

    public VEFaceExpressionDetectResult(VEFaceDetectInfo vEFaceDetectInfo, VEFaceAttributeInfo vEFaceAttributeInfo) {
        this.faceDetectInfo = vEFaceDetectInfo;
        this.faceAttributeInfo = vEFaceAttributeInfo;
    }
}
