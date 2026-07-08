package com.ss.bytertc.engine.live;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum ByteRTCStreamMixingType {
    STREAM_MIXING_BY_SERVER(0),
    STREAM_MIXING_BY_CLIENT(1);

    public int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.live.ByteRTCStreamMixingType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$live$ByteRTCStreamMixingType;

        static {
            int[] iArr = new int[ByteRTCStreamMixingType.values().length];
            $SwitchMap$com$ss$bytertc$engine$live$ByteRTCStreamMixingType = iArr;
            try {
                iArr[ByteRTCStreamMixingType.STREAM_MIXING_BY_SERVER.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCStreamMixingType[ByteRTCStreamMixingType.STREAM_MIXING_BY_CLIENT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$live$ByteRTCStreamMixingType[ordinal()];
        return i != 1 ? i != 2 ? "" : "STREAM_MIXING_BY_CLIENT" : "STREAM_MIXING_BY_SERVER";
    }

    public int value() {
        return this.value;
    }

    public static ByteRTCStreamMixingType fromId(int i) {
        for (ByteRTCStreamMixingType byteRTCStreamMixingType : values()) {
            if (byteRTCStreamMixingType.value() == i) {
                return byteRTCStreamMixingType;
            }
        }
        return null;
    }

    public static ByteRTCStreamMixingType valueOf(String str) {
        return (ByteRTCStreamMixingType) C08FF.LIZ(ByteRTCStreamMixingType.class, str);
    }

    ByteRTCStreamMixingType(int i) {
        this.value = i;
    }
}
