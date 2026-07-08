package com.ss.bytertc.engine.data;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public enum StreamIndex {
    STREAM_INDEX_MAIN(0),
    STREAM_INDEX_2ND(1),
    STREAM_INDEX_3RD(2),
    STREAM_INDEX_4TH(3),
    STREAM_INDEX_5TH(4),
    STREAM_INDEX_6TH(5),
    STREAM_INDEX_7TH(6),
    STREAM_INDEX_MAX(7);

    public static final StreamIndex[] Values = values();
    public int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.StreamIndex$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$StreamIndex;

        static {
            int[] iArr = new int[StreamIndex.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$StreamIndex = iArr;
            try {
                iArr[StreamIndex.STREAM_INDEX_MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$StreamIndex[StreamIndex.STREAM_INDEX_2ND.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$StreamIndex[StreamIndex.STREAM_INDEX_3RD.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$StreamIndex[StreamIndex.STREAM_INDEX_4TH.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$StreamIndex[StreamIndex.STREAM_INDEX_5TH.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$StreamIndex[StreamIndex.STREAM_INDEX_6TH.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$StreamIndex[StreamIndex.STREAM_INDEX_7TH.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$StreamIndex[StreamIndex.STREAM_INDEX_MAX.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$StreamIndex[ordinal()]) {
            case 1:
                return "kStreamIndexMain";
            case 2:
                return "kStreamIndex2nd";
            case 3:
                return "kStreamIndex3rd";
            case 4:
                return "kStreamIndex4th";
            case 5:
                return "kStreamIndex5th";
            case 6:
                return "kStreamIndex6th";
            case 7:
                return "kStreamIndex7th";
            case 8:
                return "kStreamIndexMax";
            default:
                return "unknown";
        }
    }

    public int value() {
        return this.value;
    }

    public static StreamIndex fromId(int i) {
        for (StreamIndex streamIndex : Values) {
            if (streamIndex.value() == i) {
                return streamIndex;
            }
        }
        return null;
    }

    public static StreamIndex valueOf(String str) {
        return (StreamIndex) C08FF.LIZ(StreamIndex.class, str);
    }

    StreamIndex(int i) {
        this.value = i;
    }
}
