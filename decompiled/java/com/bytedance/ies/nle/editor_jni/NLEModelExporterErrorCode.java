package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes23.dex */
public enum NLEModelExporterErrorCode {
    SUCCESS(0),
    TOP_GATEWAY_ERROR(1),
    NETWORK_ERROR(2),
    INVALID_MODEL(10001),
    INVALID_RESOURCE(10002),
    INVALID_NETWORKCLIENT(10003),
    REQUEST_TIMEOUT(10004),
    COMPILE_NOT_FINISHED(20001),
    COMPILE_FAIL(20002);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEModelExporterErrorCode swigToEnum(int i) {
        NLEModelExporterErrorCode[] nLEModelExporterErrorCodeArr = (NLEModelExporterErrorCode[]) NLEModelExporterErrorCode.class.getEnumConstants();
        if (i < nLEModelExporterErrorCodeArr.length && i >= 0) {
            NLEModelExporterErrorCode nLEModelExporterErrorCode = nLEModelExporterErrorCodeArr[i];
            if (nLEModelExporterErrorCode.swigValue == i) {
                return nLEModelExporterErrorCode;
            }
        }
        for (NLEModelExporterErrorCode nLEModelExporterErrorCode2 : nLEModelExporterErrorCodeArr) {
            if (nLEModelExporterErrorCode2.swigValue == i) {
                return nLEModelExporterErrorCode2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEModelExporterErrorCode.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEModelExporterErrorCode valueOf(String str) {
        return (NLEModelExporterErrorCode) C08FF.LIZ(NLEModelExporterErrorCode.class, str);
    }

    NLEModelExporterErrorCode() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEModelExporterErrorCode(NLEModelExporterErrorCode nLEModelExporterErrorCode) {
        int i = nLEModelExporterErrorCode.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEModelExporterErrorCode(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
