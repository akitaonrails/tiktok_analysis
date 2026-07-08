package com.ss.lyrax.utils;

import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxValue {
    public Object data;
    public int size;
    public String stringData;
    public LyraxValueType type;

    /* JADX INFO: renamed from: com.ss.lyrax.utils.LyraxValue$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$utils$LyraxValueType;

        static {
            int[] iArr = new int[LyraxValueType.values().length];
            $SwitchMap$com$ss$lyrax$utils$LyraxValueType = iArr;
            try {
                iArr[LyraxValueType.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$utils$LyraxValueType[LyraxValueType.INT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$utils$LyraxValueType[LyraxValueType.BOOL.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$lyrax$utils$LyraxValueType[LyraxValueType.INT64.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$ss$lyrax$utils$LyraxValueType[LyraxValueType.DOUBLE.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$ss$lyrax$utils$LyraxValueType[LyraxValueType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
        }
    }

    public boolean boolValue() {
        if (this.type == LyraxValueType.BOOL) {
            return ((Boolean) this.data).booleanValue();
        }
        throw new IllegalStateException("Not a bool value");
    }

    public double doubleValue() {
        if (this.type == LyraxValueType.DOUBLE) {
            return ((Double) this.data).doubleValue();
        }
        throw new IllegalStateException("Not a double value");
    }

    public boolean hasValue() {
        return this.type != LyraxValueType.NULL;
    }

    public long int64Value() {
        if (this.type == LyraxValueType.INT64) {
            return ((Long) this.data).longValue();
        }
        throw new IllegalStateException("Not a long value");
    }

    public int intValue() {
        if (this.type == LyraxValueType.INT) {
            return ((Integer) this.data).intValue();
        }
        throw new IllegalStateException("Not an int value");
    }

    public String stringValue() {
        if (this.type == LyraxValueType.STRING) {
            return this.stringData;
        }
        throw new IllegalStateException("Not a string value");
    }

    public String toString() {
        switch (AnonymousClass1.$SwitchMap$com$ss$lyrax$utils$LyraxValueType[this.type.ordinal()]) {
            case 1:
                return "";
            case 2:
                return Integer.toString(((Integer) this.data).intValue());
            case 3:
                return Boolean.toString(((Boolean) this.data).booleanValue());
            case 4:
                return Long.toString(((Long) this.data).longValue());
            case 5:
                return Double.toString(((Double) this.data).doubleValue());
            case 6:
                return this.stringData;
            default:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unknown_type:");
                sbLIZ.append(this.type);
                return C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public LyraxValue() {
        this.type = LyraxValueType.NULL;
    }

    public int getSize() {
        return this.size;
    }

    public LyraxValueType getType() {
        return this.type;
    }

    public LyraxValue(LyraxValue lyraxValue) {
        this.type = lyraxValue.type;
        this.data = lyraxValue.data;
        this.size = lyraxValue.size;
        this.stringData = lyraxValue.stringData;
    }

    public static LyraxValue create(double d) {
        return new LyraxValue(d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof LyraxValue)) {
            LyraxValue lyraxValue = (LyraxValue) obj;
            LyraxValueType lyraxValueType = this.type;
            if (lyraxValueType != lyraxValue.type) {
                return false;
            }
            if (lyraxValueType == LyraxValueType.BOOL) {
                return this.data.equals(lyraxValue.data);
            }
            if (lyraxValueType == LyraxValueType.INT) {
                return this.data.equals(lyraxValue.data);
            }
            if (lyraxValueType == LyraxValueType.INT64) {
                return this.data.equals(lyraxValue.data);
            }
            if (lyraxValueType == LyraxValueType.DOUBLE) {
                return this.data.equals(lyraxValue.data);
            }
            if (lyraxValueType == LyraxValueType.STRING) {
                return this.stringData.equals(lyraxValue.stringData);
            }
        }
        return false;
    }

    public LyraxValue(double d) {
        this.type = LyraxValueType.DOUBLE;
        this.data = Double.valueOf(d);
        this.size = 8;
    }

    public static LyraxValue create(int i) {
        return new LyraxValue(i);
    }

    public LyraxValue(long j) {
        this.type = LyraxValueType.INT64;
        this.data = Long.valueOf(j);
        this.size = 8;
    }

    public static LyraxValue create(long j) {
        return new LyraxValue(j);
    }

    public LyraxValue(int i) {
        this.type = LyraxValueType.INT;
        this.data = Integer.valueOf(i);
        this.size = 4;
    }

    public static LyraxValue create(String str) {
        return new LyraxValue(str);
    }

    public LyraxValue(boolean z) {
        this.type = LyraxValueType.BOOL;
        this.data = Boolean.valueOf(z);
        this.size = 1;
    }

    public static LyraxValue create(boolean z) {
        return new LyraxValue(z);
    }

    public LyraxValue(String str) {
        this.type = LyraxValueType.STRING;
        this.stringData = str;
        this.size = str.length();
    }
}
