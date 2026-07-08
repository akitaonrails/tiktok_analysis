package com.sun.jna;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IntegerType extends Number implements NativeMapped {
    public static final long serialVersionUID = 1;
    public Number number;
    public int size;
    public boolean unsigned;
    public long value;

    public static final int compare(long j, long j2) {
        if (j == j2) {
            return 0;
        }
        return j < j2 ? -1 : 1;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.number.doubleValue();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.number.floatValue();
    }

    public int hashCode() {
        return this.number.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.value;
    }

    @Override // com.sun.jna.NativeMapped
    public Class<?> nativeType() {
        return this.number.getClass();
    }

    public String toString() {
        return this.number.toString();
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.value;
    }

    @Override // com.sun.jna.NativeMapped
    public Object toNative() {
        return this.number;
    }

    public IntegerType(int i) {
        this(i, 0L, false);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof IntegerType) && this.number.equals(((IntegerType) obj).number)) {
            return true;
        }
        return false;
    }

    public void setValue(long j) {
        long j2;
        this.value = j;
        int i = this.size;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        this.number = Long.valueOf(j);
                        j2 = j;
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Unsupported size: ");
                        sbLIZ.append(this.size);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else {
                    if (this.unsigned) {
                        this.value = 4294967295L & j;
                    }
                    int i2 = (int) j;
                    j2 = i2;
                    this.number = Integer.valueOf(i2);
                }
            } else {
                if (this.unsigned) {
                    this.value = 65535 & j;
                }
                short s = (short) j;
                j2 = s;
                this.number = Short.valueOf(s);
            }
        } else {
            if (this.unsigned) {
                this.value = 255 & j;
            }
            byte b = (byte) j;
            j2 = b;
            this.number = Byte.valueOf(b);
        }
        int i3 = this.size;
        if (i3 < 8) {
            long j3 = ~((1 << (i3 * 8)) - 1);
            if (j < 0) {
                if (j2 == j) {
                    return;
                }
            } else if ((j3 & j) == 0) {
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Argument value 0x");
            sbLIZ2.append(Long.toHexString(j));
            sbLIZ2.append(" exceeds native capacity (");
            sbLIZ2.append(this.size);
            sbLIZ2.append(" bytes) mask=0x");
            sbLIZ2.append(Long.toHexString(j3));
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public IntegerType(int i, boolean z) {
        this(i, 0L, z);
    }

    public static <T extends IntegerType> int compare(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return 1;
        }
        if (t2 == null) {
            return -1;
        }
        return compare(t.longValue(), t2.longValue());
    }

    @Override // com.sun.jna.NativeMapped
    public Object fromNative(Object obj, FromNativeContext fromNativeContext) {
        long jLongValue;
        if (obj == null) {
            jLongValue = 0;
        } else {
            jLongValue = ((Number) obj).longValue();
        }
        IntegerType integerType = (IntegerType) Klass.newInstance(getClass());
        integerType.setValue(jLongValue);
        return integerType;
    }

    public IntegerType(int i, long j) {
        this(i, j, false);
    }

    public static int compare(IntegerType integerType, long j) {
        if (integerType == null) {
            return 1;
        }
        return compare(integerType.longValue(), j);
    }

    public IntegerType(int i, long j, boolean z) {
        this.size = i;
        this.unsigned = z;
        setValue(j);
    }
}
