package com.bytedance.ies.effecteditor.swig;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum UIAnnotationAssetType {
    UIAnnotationAssetType_Unknown(0),
    UIAnnotationAssetType_Texture,
    UIAnnotationAssetType_Sequence,
    UIAnnotationAssetType_Video;

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static UIAnnotationAssetType swigToEnum(int i) {
        UIAnnotationAssetType[] uIAnnotationAssetTypeArr = (UIAnnotationAssetType[]) UIAnnotationAssetType.class.getEnumConstants();
        if (i < uIAnnotationAssetTypeArr.length && i >= 0) {
            UIAnnotationAssetType uIAnnotationAssetType = uIAnnotationAssetTypeArr[i];
            if (uIAnnotationAssetType.swigValue == i) {
                return uIAnnotationAssetType;
            }
        }
        for (UIAnnotationAssetType uIAnnotationAssetType2 : uIAnnotationAssetTypeArr) {
            if (uIAnnotationAssetType2.swigValue == i) {
                return uIAnnotationAssetType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(UIAnnotationAssetType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static UIAnnotationAssetType valueOf(String str) {
        return (UIAnnotationAssetType) C08FF.LIZ(UIAnnotationAssetType.class, str);
    }

    UIAnnotationAssetType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    UIAnnotationAssetType(UIAnnotationAssetType uIAnnotationAssetType) {
        int i = uIAnnotationAssetType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    UIAnnotationAssetType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
