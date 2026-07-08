package com.bytedance.ies.smartmovie.jni;

import X.C08FF;
import X.C1418460n12;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes23.dex */
public enum SmartMovieErrorCode {
    ZIP_EMPTY(1),
    UPLOAD_TOS_FAILURE(2),
    MUSIC_REQUEST_FAILURE(3),
    COMPRESS_FAILURE(4),
    CONFIG_REQUEST_FAILURE(5),
    FETCH_NLEMODEL_FAILURE(6),
    INPUT_RESOURCE_EXCEPTION(7),
    HANDLE_TEMPLATE_FAILURE(8);

    public final int swigValue;

    public final int swigValue() {
        return this.swigValue;
    }

    public static SmartMovieErrorCode swigToEnum(int i) {
        SmartMovieErrorCode[] smartMovieErrorCodeArr = (SmartMovieErrorCode[]) SmartMovieErrorCode.class.getEnumConstants();
        if (i < smartMovieErrorCodeArr.length && i >= 0) {
            SmartMovieErrorCode smartMovieErrorCode = smartMovieErrorCodeArr[i];
            if (smartMovieErrorCode.swigValue == i) {
                return smartMovieErrorCode;
            }
        }
        for (SmartMovieErrorCode smartMovieErrorCode2 : smartMovieErrorCodeArr) {
            if (smartMovieErrorCode2.swigValue == i) {
                return smartMovieErrorCode2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(SmartMovieErrorCode.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static SmartMovieErrorCode valueOf(String str) {
        return (SmartMovieErrorCode) C08FF.LIZ(SmartMovieErrorCode.class, str);
    }

    SmartMovieErrorCode() {
        int i = C1418460n12.LIZ;
        C1418460n12.LIZ = i + 1;
        this.swigValue = i;
    }

    SmartMovieErrorCode(SmartMovieErrorCode smartMovieErrorCode) {
        int i = smartMovieErrorCode.swigValue;
        this.swigValue = i;
        C1418460n12.LIZ = i + 1;
    }

    SmartMovieErrorCode(int i) {
        this.swigValue = i;
        C1418460n12.LIZ = i + 1;
    }
}
