package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes9.dex */
public enum VideoSourceType {
    MEDIA(1),
    CAMERA(2);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static VideoSourceType swigToEnum(int i) {
        VideoSourceType[] videoSourceTypeArr = (VideoSourceType[]) VideoSourceType.class.getEnumConstants();
        if (i < videoSourceTypeArr.length && i >= 0) {
            VideoSourceType videoSourceType = videoSourceTypeArr[i];
            if (videoSourceType.swigValue == i) {
                return videoSourceType;
            }
        }
        for (VideoSourceType videoSourceType2 : videoSourceTypeArr) {
            if (videoSourceType2.swigValue == i) {
                return videoSourceType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(VideoSourceType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static VideoSourceType valueOf(String str) {
        return (VideoSourceType) C08FF.LIZ(VideoSourceType.class, str);
    }

    VideoSourceType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    VideoSourceType(VideoSourceType videoSourceType) {
        int i = videoSourceType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    VideoSourceType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
