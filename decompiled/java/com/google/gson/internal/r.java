package com.google.gson.internal;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends Number {
    public final String LL;

    private Object writeReplace() {
        return new BigDecimal(this.LL);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.LL);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.LL);
    }

    public int hashCode() {
        return this.LL.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            return Integer.parseInt(this.LL);
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                return (int) Long.parseLong(this.LL);
            } catch (NumberFormatException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return new BigDecimal(this.LL).intValue();
            }
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.LL);
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            return new BigDecimal(this.LL).longValue();
        }
    }

    public String toString() {
        return this.LL;
    }

    public r(String str) {
        this.LL = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        String str = this.LL;
        String str2 = ((r) obj).LL;
        if (str == str2 || str.equals(str2)) {
            return true;
        }
        return false;
    }
}
