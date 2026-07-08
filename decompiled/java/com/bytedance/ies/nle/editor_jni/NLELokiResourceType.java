package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLELokiResourceType {
    EFFECT_ID,
    PANEL_RESOURCE_ID;

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLELokiResourceType swigToEnum(int i) {
        NLELokiResourceType[] nLELokiResourceTypeArr = (NLELokiResourceType[]) NLELokiResourceType.class.getEnumConstants();
        if (i < nLELokiResourceTypeArr.length && i >= 0) {
            NLELokiResourceType nLELokiResourceType = nLELokiResourceTypeArr[i];
            if (nLELokiResourceType.swigValue == i) {
                return nLELokiResourceType;
            }
        }
        for (NLELokiResourceType nLELokiResourceType2 : nLELokiResourceTypeArr) {
            if (nLELokiResourceType2.swigValue == i) {
                return nLELokiResourceType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLELokiResourceType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLELokiResourceType valueOf(String str) {
        return (NLELokiResourceType) C08FF.LIZ(NLELokiResourceType.class, str);
    }

    NLELokiResourceType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLELokiResourceType(NLELokiResourceType nLELokiResourceType) {
        int i = nLELokiResourceType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLELokiResourceType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
