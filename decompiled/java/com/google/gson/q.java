package com.google.gson;

import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends k {
    public static final Class<?>[] LLILLJJLI = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};
    public Object LL;

    @Override // com.google.gson.k
    public final k LIZJ() {
        return this;
    }

    @Override // com.google.gson.k
    public final boolean LJ() {
        Object obj = this.LL;
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(LJIL());
    }

    @Override // com.google.gson.k
    public final byte LJFF() {
        return this.LL instanceof Number ? LJIJ().byteValue() : Byte.parseByte(LJIL());
    }

    @Override // com.google.gson.k
    public final double LJIIIZ() {
        return this.LL instanceof Number ? LJIJ().doubleValue() : Double.parseDouble(LJIL());
    }

    @Override // com.google.gson.k
    public final float LJIIJ() {
        return this.LL instanceof Number ? LJIJ().floatValue() : Float.parseFloat(LJIL());
    }

    @Override // com.google.gson.k
    public final int LJIIJJI() {
        return this.LL instanceof Number ? LJIJ().intValue() : Integer.parseInt(LJIL());
    }

    @Override // com.google.gson.k
    public final long LJIIZILJ() {
        return this.LL instanceof Number ? LJIJ().longValue() : Long.parseLong(LJIL());
    }

    @Override // com.google.gson.k
    public final Number LJIJ() {
        Object obj = this.LL;
        return obj instanceof String ? new com.google.gson.internal.r((String) obj) : (Number) obj;
    }

    @Override // com.google.gson.k
    public final short LJIJI() {
        return this.LL instanceof Number ? LJIJ().shortValue() : Short.parseShort(LJIL());
    }

    @Override // com.google.gson.k
    public final String LJIL() {
        Object obj = this.LL;
        return obj instanceof Number ? LJIJ().toString() : obj instanceof Boolean ? ((Boolean) obj).toString() : (String) obj;
    }

    public final BigDecimal LJJIFFI() {
        Object obj = this.LL;
        return obj instanceof BigDecimal ? (BigDecimal) obj : new BigDecimal(this.LL.toString());
    }

    public final boolean LJJIII() {
        return this.LL instanceof String;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        if (this.LL == null) {
            return 31;
        }
        if (LJJII(this)) {
            jDoubleToLongBits = LJIJ().longValue();
        } else {
            Object obj = this.LL;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(LJIJ().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    @Override // com.google.gson.k
    public final char LJIIIIZZ() {
        return LJIL().charAt(0);
    }

    public q(Boolean bool) {
        LJJIIJ(bool);
    }

    public static boolean LJJII(q qVar) {
        Object obj = qVar.LL;
        if (!(obj instanceof Number)) {
            return false;
        }
        if (!(obj instanceof BigInteger) && !(obj instanceof Long) && !(obj instanceof Integer) && !(obj instanceof Short) && !(obj instanceof Byte)) {
            return false;
        }
        return true;
    }

    public final void LJJIIJ(Object obj) {
        if (obj instanceof Character) {
            this.LL = String.valueOf(((Character) obj).charValue());
            return;
        }
        boolean z = true;
        if (!(obj instanceof Number) && !(obj instanceof String)) {
            Class<?> cls = obj.getClass();
            Class<?>[] clsArr = LLILLJJLI;
            int i = 0;
            while (true) {
                if (clsArr[i].isAssignableFrom(cls)) {
                    break;
                }
                i++;
                if (i >= 16) {
                    z = false;
                    break;
                }
            }
        }
        com.google.gson.internal.a.LIZ(z);
        this.LL = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.LL == null) {
            if (qVar.LL == null) {
                return true;
            }
            return false;
        }
        if (LJJII(this) && LJJII(qVar)) {
            if (LJIJ().longValue() == qVar.LJIJ().longValue()) {
                return true;
            }
            return false;
        }
        Object obj2 = this.LL;
        if ((obj2 instanceof Number) && (qVar.LL instanceof Number)) {
            double dDoubleValue = LJIJ().doubleValue();
            double dDoubleValue2 = qVar.LJIJ().doubleValue();
            if (dDoubleValue == dDoubleValue2 || (Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2))) {
                return true;
            }
            return false;
        }
        return obj2.equals(qVar.LL);
    }

    public q(Number number) {
        LJJIIJ(number);
    }

    public q(Object obj) {
        LJJIIJ(obj);
    }

    public q(String str) {
        LJJIIJ(str);
    }
}
