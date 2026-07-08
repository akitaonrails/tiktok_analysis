package com.ss.ugc.android.davinciresource.jni;

import X.C08FF;
import X.C1778430wNd;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes28.dex */
public enum HTTP_TYPE {
    HTTP_GET(0),
    HTTP_POST(1);

    public final int swigValue;

    public final int swigValue() {
        return this.swigValue;
    }

    public static HTTP_TYPE swigToEnum(int i) {
        HTTP_TYPE[] http_typeArr = (HTTP_TYPE[]) HTTP_TYPE.class.getEnumConstants();
        if (i < http_typeArr.length && i >= 0) {
            HTTP_TYPE http_type = http_typeArr[i];
            if (http_type.swigValue == i) {
                return http_type;
            }
        }
        for (HTTP_TYPE http_type2 : http_typeArr) {
            if (http_type2.swigValue == i) {
                return http_type2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(HTTP_TYPE.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static HTTP_TYPE valueOf(String str) {
        return (HTTP_TYPE) C08FF.LIZ(HTTP_TYPE.class, str);
    }

    HTTP_TYPE() {
        int i = C1778430wNd.LIZ;
        C1778430wNd.LIZ = i + 1;
        this.swigValue = i;
    }

    HTTP_TYPE(HTTP_TYPE http_type) {
        int i = http_type.swigValue;
        this.swigValue = i;
        C1778430wNd.LIZ = i + 1;
    }

    HTTP_TYPE(int i) {
        this.swigValue = i;
        C1778430wNd.LIZ = i + 1;
    }
}
