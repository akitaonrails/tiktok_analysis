package com.ss.android.vesdk.bachfaceinfo;

import com.ss.android.ttve.nativePort.TEParcelWrapper;

/* JADX INFO: loaded from: classes34.dex */
public class VEFaceAttribute {
    public float age;
    public float attractive;
    public float boyProb;
    public float[] expProbs;
    public int expType;
    public float happyScore;
    public TEParcelWrapper parcelWrapper;
    public float quality;
    public float realFaceProb;

    public static int getExpressionCount() {
        return 7;
    }

    public void readFromParcel() {
        TEParcelWrapper tEParcelWrapper = this.parcelWrapper;
        if (tEParcelWrapper == null) {
            return;
        }
        this.age = tEParcelWrapper.readFloat();
        this.boyProb = this.parcelWrapper.readFloat();
        this.attractive = this.parcelWrapper.readFloat();
        this.happyScore = this.parcelWrapper.readFloat();
        this.expType = this.parcelWrapper.readInt();
        this.expProbs = this.parcelWrapper.readFloatArray(7);
        this.realFaceProb = this.parcelWrapper.readFloat();
        this.quality = this.parcelWrapper.readFloat();
    }

    public float getAge() {
        return this.age;
    }

    public float getAttractive() {
        return this.attractive;
    }

    public float getBoyProb() {
        return this.boyProb;
    }

    public float[] getExpProbs() {
        return this.expProbs;
    }

    public int getExpType() {
        return this.expType;
    }

    public float getHappyScore() {
        return this.happyScore;
    }

    public float getQuality() {
        return this.quality;
    }

    public float getRealFaceProb() {
        return this.realFaceProb;
    }

    public void setAge(float f) {
        this.age = f;
    }

    public void setAttractive(float f) {
        this.attractive = f;
    }

    public void setBoyProb(float f) {
        this.boyProb = f;
    }

    public void setExpProbs(float[] fArr) {
        this.expProbs = fArr;
    }

    public void setExpType(int i) {
        this.expType = i;
    }

    public void setHappyScore(float f) {
        this.happyScore = f;
    }

    public void setParcelWrapper(TEParcelWrapper tEParcelWrapper) {
        this.parcelWrapper = tEParcelWrapper;
    }

    public void setQuality(float f) {
        this.quality = f;
    }

    public void setRealFaceProb(float f) {
        this.realFaceProb = f;
    }
}
