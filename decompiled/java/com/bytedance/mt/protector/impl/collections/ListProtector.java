package com.bytedance.mt.protector.impl.collections;

import X.C08FH;
import X.C09EU;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ListProtector extends C08FH {
    public static <T> T get(List<T> list, int i) {
        Integer num;
        try {
            return list.get(i);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (C09EU.LIZIZ() && (num = (Integer) C08FH.tryProtect(th, Integer.class)) != null) {
                if (!list.isEmpty()) {
                    return list.get(num.intValue());
                }
                return null;
            }
            throw th;
        }
    }

    public static <T> T remove(List<T> list, int i) {
        Integer num;
        try {
            return list.remove(i);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (C09EU.LIZIZ() && (num = (Integer) C08FH.tryProtect(th, Integer.class)) != null) {
                if (!list.isEmpty()) {
                    return list.remove(num.intValue());
                }
                return null;
            }
            throw th;
        }
    }

    public static <T> void add(List<T> list, int i, T t) {
        Integer num;
        try {
            list.add(i, t);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (C09EU.LIZIZ() && (num = (Integer) C08FH.tryProtect(th, Integer.class)) != null) {
                list.add(num.intValue(), t);
                return;
            }
            throw th;
        }
    }

    public static <T> T set(List<T> list, int i, T t) {
        Integer num;
        try {
            return list.set(i, t);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (C09EU.LIZIZ() && (num = (Integer) C08FH.tryProtect(th, Integer.class)) != null) {
                if (!list.isEmpty()) {
                    return list.set(num.intValue(), t);
                }
                return null;
            }
            throw th;
        }
    }
}
