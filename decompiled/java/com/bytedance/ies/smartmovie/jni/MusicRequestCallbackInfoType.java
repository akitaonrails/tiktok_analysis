package com.bytedance.ies.smartmovie.jni;

import X.C08FF;
import X.C1418450n11;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes23.dex */
public enum MusicRequestCallbackInfoType {
    BEFORE_EXTRACTOR(0),
    AFTER_EXTRACTOR(1),
    ZIP_GENERATE_SUCCESS(2),
    ZIP_UPLOAD_TOS_SUCCESS(3),
    RESPONSE_SUCCESS(4),
    REQUEST_ERROR(5),
    EXTRACTOR_CLIP128(6);

    public final int swigValue;

    public final int swigValue() {
        return this.swigValue;
    }

    public static MusicRequestCallbackInfoType swigToEnum(int i) {
        MusicRequestCallbackInfoType[] musicRequestCallbackInfoTypeArr = (MusicRequestCallbackInfoType[]) MusicRequestCallbackInfoType.class.getEnumConstants();
        if (i < musicRequestCallbackInfoTypeArr.length && i >= 0) {
            MusicRequestCallbackInfoType musicRequestCallbackInfoType = musicRequestCallbackInfoTypeArr[i];
            if (musicRequestCallbackInfoType.swigValue == i) {
                return musicRequestCallbackInfoType;
            }
        }
        for (MusicRequestCallbackInfoType musicRequestCallbackInfoType2 : musicRequestCallbackInfoTypeArr) {
            if (musicRequestCallbackInfoType2.swigValue == i) {
                return musicRequestCallbackInfoType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(MusicRequestCallbackInfoType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static MusicRequestCallbackInfoType valueOf(String str) {
        return (MusicRequestCallbackInfoType) C08FF.LIZ(MusicRequestCallbackInfoType.class, str);
    }

    MusicRequestCallbackInfoType() {
        int i = C1418450n11.LIZ;
        C1418450n11.LIZ = i + 1;
        this.swigValue = i;
    }

    MusicRequestCallbackInfoType(MusicRequestCallbackInfoType musicRequestCallbackInfoType) {
        int i = musicRequestCallbackInfoType.swigValue;
        this.swigValue = i;
        C1418450n11.LIZ = i + 1;
    }

    MusicRequestCallbackInfoType(int i) {
        this.swigValue = i;
        C1418450n11.LIZ = i + 1;
    }
}
