package com.ss.android.vesdk.bean;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public class VEStickerEditRichTextParam {
    public int iOpCode;
    public float iParam1;
    public float iParam2;
    public float iParam3;
    public float iParam4;
    public String pParam5;

    public VEStickerEditRichTextParam() {
        this.iOpCode = -1;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEStickerEditRichTextParam{iOpCode=");
        sbLIZ.append(this.iOpCode);
        sbLIZ.append(", iParam1=");
        sbLIZ.append(this.iParam1);
        sbLIZ.append(", iParam2=");
        sbLIZ.append(this.iParam2);
        sbLIZ.append(", iParam3=");
        sbLIZ.append(this.iParam3);
        sbLIZ.append(", iParam4=");
        sbLIZ.append(this.iParam4);
        sbLIZ.append(", pParam5='");
        sbLIZ.append(this.pParam5);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int getiOpCode() {
        return this.iOpCode;
    }

    public float getiParam1() {
        return this.iParam1;
    }

    public float getiParam2() {
        return this.iParam2;
    }

    public float getiParam3() {
        return this.iParam3;
    }

    public float getiParam4() {
        return this.iParam4;
    }

    public String getpParam5() {
        return this.pParam5;
    }

    public void setiOpCode(int i) {
        this.iOpCode = i;
    }

    public void setiParam1(float f) {
        this.iParam1 = f;
    }

    public void setiParam2(float f) {
        this.iParam2 = f;
    }

    public void setiParam3(float f) {
        this.iParam3 = f;
    }

    public void setiParam4(float f) {
        this.iParam4 = f;
    }

    public void setpParam5(String str) {
        this.pParam5 = str;
    }

    public VEStickerEditRichTextParam(int i, float f, float f2, float f3, float f4, String str) {
        this.iOpCode = i;
        this.iParam1 = f;
        this.iParam2 = f2;
        this.iParam3 = f3;
        this.iParam4 = f4;
        this.pParam5 = str;
    }
}
