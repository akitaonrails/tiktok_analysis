package com.bytedance.ies.effecteditor.swig;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes28.dex */
public enum UIAnnotationUIType {
    UIAnnotationUIType_Unknown(0),
    UIAnnotationUIType_Asset,
    UIAnnotationUIType_Slider,
    UIAnnotationUIType_TextInput,
    UIAnnotationUIType_OptionList,
    UIAnnotationUIType_Cache,
    UIAnnotationUIType_AssetTexture,
    UIAnnotationUIType_Transform2D,
    UIAnnotationUIType_ScriptTransform2D,
    UIAnnotationUIType_AnchorAlignment,
    UIAnnotationUIType_Color,
    UIAnnotationUIType_FacePoints,
    UIAnnotationUIType_Float,
    UIAnnotationUIType_Transform3D,
    UIAnnotationUIType_Bool,
    UIAnnotationUIType_Pulse,
    UIAnnotationUIType_AssetAudio,
    UIAnnotationUIType_TimeSegment,
    UIAnnotationUIType_TextEdit,
    UIAnnotationUIType_AssetFont,
    UIAnnotationUIType_Rect,
    UIAnnotationUIType_AssetItem,
    UIAnnotationUIType_Int,
    UIAnnotationUIType_AssetSpeech,
    UIAnnotationUIType_FaceMesh,
    UIAnnotationUIType_Any,
    UIAnnotationUIType_AssetTextureArray,
    UIAnnotationUIType_StringArray;

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static UIAnnotationUIType swigToEnum(int i) {
        UIAnnotationUIType[] uIAnnotationUITypeArr = (UIAnnotationUIType[]) UIAnnotationUIType.class.getEnumConstants();
        if (i < uIAnnotationUITypeArr.length && i >= 0) {
            UIAnnotationUIType uIAnnotationUIType = uIAnnotationUITypeArr[i];
            if (uIAnnotationUIType.swigValue == i) {
                return uIAnnotationUIType;
            }
        }
        for (UIAnnotationUIType uIAnnotationUIType2 : uIAnnotationUITypeArr) {
            if (uIAnnotationUIType2.swigValue == i) {
                return uIAnnotationUIType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(UIAnnotationUIType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static UIAnnotationUIType valueOf(String str) {
        return (UIAnnotationUIType) C08FF.LIZ(UIAnnotationUIType.class, str);
    }

    UIAnnotationUIType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    UIAnnotationUIType(UIAnnotationUIType uIAnnotationUIType) {
        int i = uIAnnotationUIType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    UIAnnotationUIType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
