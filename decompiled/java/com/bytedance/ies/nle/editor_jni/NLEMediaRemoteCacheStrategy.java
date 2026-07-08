package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes28.dex */
public enum NLEMediaRemoteCacheStrategy {
    NONE(0),
    MEMORY(1),
    DISK(2);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEMediaRemoteCacheStrategy swigToEnum(int i) {
        NLEMediaRemoteCacheStrategy[] nLEMediaRemoteCacheStrategyArr = (NLEMediaRemoteCacheStrategy[]) NLEMediaRemoteCacheStrategy.class.getEnumConstants();
        if (i < nLEMediaRemoteCacheStrategyArr.length && i >= 0) {
            NLEMediaRemoteCacheStrategy nLEMediaRemoteCacheStrategy = nLEMediaRemoteCacheStrategyArr[i];
            if (nLEMediaRemoteCacheStrategy.swigValue == i) {
                return nLEMediaRemoteCacheStrategy;
            }
        }
        for (NLEMediaRemoteCacheStrategy nLEMediaRemoteCacheStrategy2 : nLEMediaRemoteCacheStrategyArr) {
            if (nLEMediaRemoteCacheStrategy2.swigValue == i) {
                return nLEMediaRemoteCacheStrategy2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEMediaRemoteCacheStrategy.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEMediaRemoteCacheStrategy valueOf(String str) {
        return (NLEMediaRemoteCacheStrategy) C08FF.LIZ(NLEMediaRemoteCacheStrategy.class, str);
    }

    NLEMediaRemoteCacheStrategy() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEMediaRemoteCacheStrategy(NLEMediaRemoteCacheStrategy nLEMediaRemoteCacheStrategy) {
        int i = nLEMediaRemoteCacheStrategy.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEMediaRemoteCacheStrategy(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
