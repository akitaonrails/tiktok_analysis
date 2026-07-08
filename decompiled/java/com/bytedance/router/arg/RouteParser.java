package com.bytedance.router.arg;

import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.mt.protector.impl.string2number.CastShortProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class RouteParser {
    public static final RouteParser INSTANCE = new RouteParser();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.Object] */
    public final <T> T parse(Object obj, Class<T> cls) {
        Number number;
        String str;
        if (obj == 0) {
            return null;
        }
        try {
            if (obj instanceof Number) {
                number = (Number) obj;
            } else {
                number = null;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (number != null) {
            if (Intrinsics.LJFF(cls, String.class)) {
                return (T) ((Number) obj);
            }
            if (Intrinsics.LJFF(cls, Integer.class)) {
                return (T) Integer.valueOf(((Number) obj).intValue());
            }
            if (Intrinsics.LJFF(cls, Short.class)) {
                return (T) Short.valueOf(((Number) obj).shortValue());
            }
            if (Intrinsics.LJFF(cls, Long.class)) {
                return (T) Long.valueOf(((Number) obj).longValue());
            }
            if (Intrinsics.LJFF(cls, Float.class)) {
                return (T) Float.valueOf(((Number) obj).floatValue());
            }
            if (Intrinsics.LJFF(cls, Double.class)) {
                return (T) Double.valueOf(((Number) obj).doubleValue());
            }
            if (Intrinsics.LJFF(cls, Byte.class)) {
                return (T) Byte.valueOf(((Number) obj).byteValue());
            }
            return (T) ((Number) obj);
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (str != null) {
            if (!Intrinsics.LJFF(cls, String.class)) {
                if (Intrinsics.LJFF(cls, Integer.class)) {
                    return (T) Integer.valueOf(CastIntegerProtector.parseInt((String) obj));
                }
                if (Intrinsics.LJFF(cls, Boolean.class)) {
                    return (T) Boolean.valueOf(Boolean.parseBoolean((String) obj));
                }
                if (Intrinsics.LJFF(cls, Short.class)) {
                    return (T) Short.valueOf(CastShortProtector.parseShort((String) obj));
                }
                if (Intrinsics.LJFF(cls, Long.class)) {
                    return (T) Long.valueOf(CastLongProtector.parseLong((String) obj));
                }
                if (Intrinsics.LJFF(cls, Float.class)) {
                    return (T) Float.valueOf(CastFloatProtector.parseFloat((String) obj));
                }
                if (Intrinsics.LJFF(cls, Double.class)) {
                    return (T) Double.valueOf(CastDoubleProtector.parseDouble((String) obj));
                }
                if (Intrinsics.LJFF(cls, Byte.class)) {
                    return (T) Byte.valueOf(Byte.parseByte((String) obj));
                }
                try {
                    obj = (T) new Gson().LJII((String) obj, cls);
                    return obj;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return null;
                }
            }
            return obj;
        }
        if (cls.isAssignableFrom(((Object) obj).getClass())) {
            return (T) obj;
        }
        return null;
    }
}
