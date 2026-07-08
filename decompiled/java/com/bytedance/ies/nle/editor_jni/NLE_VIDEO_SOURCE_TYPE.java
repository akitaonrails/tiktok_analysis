package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLE_VIDEO_SOURCE_TYPE {
    VIDEO_SOURCE_UNKNOWN,
    VIDEO_SOURCE_RECORD,
    VIDEO_SOURCE_IMPORT,
    VIDEO_SOURCE_PHOTOMOVIE,
    VIDEO_SOURCE_MV,
    VIDEO_SOURCE_FASTIMPORT;

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLE_VIDEO_SOURCE_TYPE swigToEnum(int i) {
        NLE_VIDEO_SOURCE_TYPE[] nle_video_source_typeArr = (NLE_VIDEO_SOURCE_TYPE[]) NLE_VIDEO_SOURCE_TYPE.class.getEnumConstants();
        if (i < nle_video_source_typeArr.length && i >= 0) {
            NLE_VIDEO_SOURCE_TYPE nle_video_source_type = nle_video_source_typeArr[i];
            if (nle_video_source_type.swigValue == i) {
                return nle_video_source_type;
            }
        }
        for (NLE_VIDEO_SOURCE_TYPE nle_video_source_type2 : nle_video_source_typeArr) {
            if (nle_video_source_type2.swigValue == i) {
                return nle_video_source_type2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLE_VIDEO_SOURCE_TYPE.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLE_VIDEO_SOURCE_TYPE valueOf(String str) {
        return (NLE_VIDEO_SOURCE_TYPE) C08FF.LIZ(NLE_VIDEO_SOURCE_TYPE.class, str);
    }

    NLE_VIDEO_SOURCE_TYPE() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLE_VIDEO_SOURCE_TYPE(NLE_VIDEO_SOURCE_TYPE nle_video_source_type) {
        int i = nle_video_source_type.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLE_VIDEO_SOURCE_TYPE(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
