package com.ss.ugc.android.davinciresource.jni;

import X.C08FF;
import X.C1778580wNs;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes28.dex */
public enum HttpClientCallbackAction {
    SUCCESS(0),
    RECEIVING_DATA(1),
    CANCELED(2),
    FAIL(3);

    public final int swigValue;

    public final int swigValue() {
        return this.swigValue;
    }

    public static HttpClientCallbackAction swigToEnum(int i) {
        HttpClientCallbackAction[] httpClientCallbackActionArr = (HttpClientCallbackAction[]) HttpClientCallbackAction.class.getEnumConstants();
        if (i < httpClientCallbackActionArr.length && i >= 0) {
            HttpClientCallbackAction httpClientCallbackAction = httpClientCallbackActionArr[i];
            if (httpClientCallbackAction.swigValue == i) {
                return httpClientCallbackAction;
            }
        }
        for (HttpClientCallbackAction httpClientCallbackAction2 : httpClientCallbackActionArr) {
            if (httpClientCallbackAction2.swigValue == i) {
                return httpClientCallbackAction2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(HttpClientCallbackAction.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static HttpClientCallbackAction valueOf(String str) {
        return (HttpClientCallbackAction) C08FF.LIZ(HttpClientCallbackAction.class, str);
    }

    HttpClientCallbackAction() {
        int i = C1778580wNs.LIZ;
        C1778580wNs.LIZ = i + 1;
        this.swigValue = i;
    }

    HttpClientCallbackAction(HttpClientCallbackAction httpClientCallbackAction) {
        int i = httpClientCallbackAction.swigValue;
        this.swigValue = i;
        C1778580wNs.LIZ = i + 1;
    }

    HttpClientCallbackAction(int i) {
        this.swigValue = i;
        C1778580wNs.LIZ = i + 1;
    }
}
