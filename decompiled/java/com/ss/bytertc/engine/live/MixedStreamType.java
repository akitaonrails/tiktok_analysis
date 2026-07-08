package com.ss.bytertc.engine.live;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum MixedStreamType {
    MIXED_STREAM_TYPE_BY_SERVER(0),
    MIXED_STREAM_TYPE_BY_CLIENT(1);

    public int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.live.MixedStreamType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$live$MixedStreamType;

        static {
            int[] iArr = new int[MixedStreamType.values().length];
            $SwitchMap$com$ss$bytertc$engine$live$MixedStreamType = iArr;
            try {
                iArr[MixedStreamType.MIXED_STREAM_TYPE_BY_SERVER.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$MixedStreamType[MixedStreamType.MIXED_STREAM_TYPE_BY_CLIENT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$live$MixedStreamType[ordinal()];
        return i != 1 ? i != 2 ? "" : "MIXED_STREAM_TYPE_BY_CLIENT" : "MIXED_STREAM_TYPE_BY_SERVER";
    }

    public int value() {
        return this.value;
    }

    public static MixedStreamType fromId(int i) {
        for (MixedStreamType mixedStreamType : values()) {
            if (mixedStreamType.value() == i) {
                return mixedStreamType;
            }
        }
        return null;
    }

    public static MixedStreamType valueOf(String str) {
        return (MixedStreamType) C08FF.LIZ(MixedStreamType.class, str);
    }

    MixedStreamType(int i) {
        this.value = i;
    }
}
