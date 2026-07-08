package com.ss.android.vesdk.faceinfo;

import X.C2188811AlT;
import android.graphics.PointF;
import android.graphics.RectF;
import com.ss.android.medialib.model.Skeleton;
import com.ss.android.medialib.model.SkeletonInfo;
import com.ss.android.ttve.nativePort.TEParcelWrapper;
import java.util.Arrays;

/* JADX INFO: loaded from: classes34.dex */
public class VESkeletonInfo {
    public VESkeleton[] info;
    public int orient;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VESkeletonInfo{orient=");
        sbLIZ.append(this.orient);
        sbLIZ.append(", info=");
        sbLIZ.append(Arrays.toString(this.info));
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VESkeleton[] getInfo() {
        return this.info;
    }

    public int getOrient() {
        return this.orient;
    }

    public static VESkeletonInfo convert(byte[][] bArr) {
        VESkeleton[] vESkeletonArr = null;
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        TEParcelWrapper tEParcelWrapper = new TEParcelWrapper(bArr[0]);
        VESkeletonInfo vESkeletonInfo = new VESkeletonInfo();
        vESkeletonInfo.setOrient(tEParcelWrapper.readInt());
        int i = tEParcelWrapper.readInt();
        if (i > 0) {
            vESkeletonArr = new VESkeleton[i];
            for (int i2 = 0; i2 < i; i2++) {
                VESkeleton vESkeleton = new VESkeleton();
                vESkeleton.setID(tEParcelWrapper.readInt());
                vESkeleton.setRect(new RectF(tEParcelWrapper.readFloat(), tEParcelWrapper.readFloat(), tEParcelWrapper.readFloat(), tEParcelWrapper.readFloat()));
                int i3 = tEParcelWrapper.readInt();
                if (i3 > 0) {
                    PointF[] pointFArr = new PointF[i3];
                    int i4 = 0;
                    do {
                        pointFArr[i4] = new PointF(tEParcelWrapper.readInt(), tEParcelWrapper.readInt());
                        tEParcelWrapper.readBoolean();
                        tEParcelWrapper.readFloat();
                        i4++;
                    } while (i4 < i3);
                    vESkeleton.setPoints(pointFArr);
                }
                vESkeletonArr[i2] = vESkeleton;
            }
        }
        vESkeletonInfo.setInfo(vESkeletonArr);
        return vESkeletonInfo;
    }

    public void setInfo(VESkeleton[] vESkeletonArr) {
        this.info = vESkeletonArr;
    }

    public void setOrient(int i) {
        this.orient = i;
    }

    public static VESkeletonInfo convert(SkeletonInfo skeletonInfo) {
        if (skeletonInfo == null) {
            return null;
        }
        VESkeletonInfo vESkeletonInfo = new VESkeletonInfo();
        VESkeleton[] vESkeletonArr = new VESkeleton[skeletonInfo.getInfo().length];
        Skeleton[] info = skeletonInfo.getInfo();
        int length = info.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Skeleton skeleton = info[i];
            VESkeleton vESkeleton = new VESkeleton();
            vESkeleton.setID(skeleton.getID());
            vESkeleton.setRect(skeleton.getRect());
            vESkeleton.setPoints(skeleton.getPoints());
            vESkeletonArr[i2] = vESkeleton;
            i++;
            i2++;
        }
        vESkeletonInfo.setInfo(vESkeletonArr);
        return vESkeletonInfo;
    }
}
