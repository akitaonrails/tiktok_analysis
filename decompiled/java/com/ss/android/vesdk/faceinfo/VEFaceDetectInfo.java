package com.ss.android.vesdk.faceinfo;

import X.C1684910twn;
import X.C2186361AhW;
import X.C2188811AlT;
import X.C2484209oO;
import com.ss.android.medialib.model.FaceDetect;
import com.ss.android.medialib.model.FaceDetectInfo;
import com.ss.android.ttve.nativePort.TEParcelWrapper;

/* JADX INFO: loaded from: classes34.dex */
public class VEFaceDetectInfo {
    public int faceCount;
    public C1684910twn[] info;
    public TEParcelWrapper parcelWrapper;

    public void readFromParcel() {
        this.faceCount = this.parcelWrapper.readInt();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("face count = ");
        sbLIZ.append(this.faceCount);
        C2484209oO.LIZ("VEFaceDetectInfo", C2188811AlT.LIZIZ(sbLIZ));
        this.info = new C1684910twn[this.faceCount];
        for (int i = 0; i < this.faceCount; i++) {
            C1684910twn c1684910twn = new C1684910twn();
            TEParcelWrapper tEParcelWrapper = this.parcelWrapper;
            c1684910twn.LJ = tEParcelWrapper;
            if (tEParcelWrapper != null) {
                c1684910twn.LIZ = tEParcelWrapper.readRect();
                c1684910twn.LJ.readFloat();
                c1684910twn.LJ.readPointFArray(106);
                c1684910twn.LJ.readFloatArray(106);
                c1684910twn.LIZIZ = c1684910twn.LJ.readFloat();
                c1684910twn.LIZJ = c1684910twn.LJ.readFloat();
                c1684910twn.LIZLLL = c1684910twn.LJ.readFloat();
                c1684910twn.LJ.readFloat();
                c1684910twn.LJ.readInt();
                c1684910twn.LJ.readInt();
                c1684910twn.LJ.readInt();
            }
            this.info[i] = c1684910twn;
        }
        int i2 = this.parcelWrapper.readInt();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("faceExtFlag = ");
        sbLIZ2.append(i2);
        C2484209oO.LIZ("VEFaceDetectInfo", C2188811AlT.LIZIZ(sbLIZ2));
        if (i2 == 0) {
            return;
        }
        for (int i3 = 0; i3 < this.faceCount; i3++) {
            C2186361AhW c2186361AhW = new C2186361AhW();
            TEParcelWrapper tEParcelWrapper2 = this.parcelWrapper;
            c2186361AhW.LJ = tEParcelWrapper2;
            c2186361AhW.LJFF = i2;
            if (tEParcelWrapper2 != null) {
                if ((i2 & 1) != 0) {
                    tEParcelWrapper2.readInt();
                    c2186361AhW.LIZ = c2186361AhW.LJ.readPointFArray(22);
                    c2186361AhW.LJ.readPointFArray(22);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("first left eye point = ");
                    sbLIZ3.append(c2186361AhW.LIZ[0].x);
                    sbLIZ3.append(" X ");
                    sbLIZ3.append(c2186361AhW.LIZ[0].y);
                    C2484209oO.LIZ("FaceExtInfo", C2188811AlT.LIZIZ(sbLIZ3));
                }
                if ((c2186361AhW.LJFF & 2) != 0) {
                    c2186361AhW.LJ.readInt();
                    c2186361AhW.LIZIZ = c2186361AhW.LJ.readPointFArray(13);
                    c2186361AhW.LJ.readPointFArray(13);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("first left eyebrow point = ");
                    sbLIZ4.append(c2186361AhW.LIZIZ[0].x);
                    sbLIZ4.append(" X ");
                    sbLIZ4.append(c2186361AhW.LIZIZ[0].y);
                    C2484209oO.LIZ("FaceExtInfo", C2188811AlT.LIZIZ(sbLIZ4));
                }
                if ((c2186361AhW.LJFF & 4) != 0) {
                    c2186361AhW.LJ.readInt();
                    c2186361AhW.LIZJ = c2186361AhW.LJ.readPointFArray(64);
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("first lip point = ");
                    sbLIZ5.append(c2186361AhW.LIZJ[0].x);
                    sbLIZ5.append(" X ");
                    sbLIZ5.append(c2186361AhW.LIZJ[0].y);
                    C2484209oO.LIZ("FaceExtInfo", C2188811AlT.LIZIZ(sbLIZ5));
                }
                if ((c2186361AhW.LJFF & 8) != 0) {
                    c2186361AhW.LJ.readInt();
                    c2186361AhW.LIZLLL = c2186361AhW.LJ.readPointFArray(20);
                    c2186361AhW.LJ.readPointFArray(20);
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("first left iris point = ");
                    sbLIZ6.append(c2186361AhW.LIZLLL[0].x);
                    sbLIZ6.append(" X ");
                    sbLIZ6.append(c2186361AhW.LIZLLL[0].y);
                    C2484209oO.LIZ("FaceExtInfo", C2188811AlT.LIZIZ(sbLIZ6));
                }
            }
            this.info[i3].getClass();
        }
    }

    public C1684910twn[] getInfo() {
        return this.info;
    }

    public static VEFaceDetectInfo covert(FaceDetectInfo faceDetectInfo) {
        if (faceDetectInfo != null && faceDetectInfo.getInfo() != null) {
            VEFaceDetectInfo vEFaceDetectInfo = new VEFaceDetectInfo();
            C1684910twn[] c1684910twnArr = new C1684910twn[faceDetectInfo.getInfo().length];
            FaceDetect[] info = faceDetectInfo.getInfo();
            int length = info.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                FaceDetect faceDetect = info[i];
                C1684910twn c1684910twn = new C1684910twn();
                c1684910twn.LIZ = faceDetect.getRect();
                faceDetect.getPoints();
                faceDetect.getAction();
                faceDetect.getEyeDistance();
                if (faceDetect.getFaceExtInfo() != null) {
                    new C2186361AhW();
                    faceDetect.getFaceExtInfo();
                    faceDetect.getFaceExtInfo();
                    faceDetect.getFaceExtInfo();
                    faceDetect.getFaceExtInfo();
                    faceDetect.getFaceExtInfo();
                    faceDetect.getFaceExtInfo();
                    faceDetect.getFaceExtInfo();
                    faceDetect.getFaceExtInfo();
                    faceDetect.getFaceExtInfo();
                    faceDetect.getFaceExtInfo();
                }
                faceDetect.getFaceID();
                c1684910twn.LIZJ = faceDetect.getPitch();
                faceDetect.getPointVisibility();
                c1684910twn.LIZLLL = faceDetect.getRoll();
                c1684910twn.LIZIZ = faceDetect.getYaw();
                faceDetect.getScore();
                faceDetect.getTrackCount();
                c1684910twnArr[i2] = c1684910twn;
                i++;
                i2++;
            }
            vEFaceDetectInfo.setInfo(c1684910twnArr);
            return vEFaceDetectInfo;
        }
        return null;
    }

    public void setInfo(C1684910twn[] c1684910twnArr) {
        this.info = c1684910twnArr;
    }

    public void setParcelWrapper(TEParcelWrapper tEParcelWrapper) {
        this.parcelWrapper = tEParcelWrapper;
    }
}
