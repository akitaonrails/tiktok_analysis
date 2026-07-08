package ms.bd.o;

import X.C0WZX;
import X.C2204961BRm;
import X.C786410Ut5;
import android.app.Activity;
import android.content.Context;
import android.util.ArrayMap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class s2 {
    public static volatile int LIZ = -1;
    public static volatile String LIZIZ = "";

    public static int LIZ() {
        try {
            return LIZLLL() != null ? 1 : 0;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return -1;
        }
    }

    public static String LIZIZ(Context context) {
        try {
            if (LIZIZ == "") {
                LIZIZ = C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), 0).versionName;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return LIZIZ;
    }

    public static List<Activity> LIZJ() throws Throwable {
        ArrayList arrayList = new ArrayList();
        try {
            Class<?> cls = Class.forName((String) k.a(16777217, 0, 0L, "fe1104", new byte[]{118, 105, 70, 87, 0, 42, 97, 10, 97, 113, 103, 41, 99, 70, 27, 42, 115, 77, 116, 120, 67, 111, 80, 64, 14, 39}));
            Object objA0 = C2204961BRm.a0(cls.getMethod((String) k.a(16777217, 0, 0L, "3540da", new byte[]{33, 34, 85, 86, 94, 120, 36, 53, 102, 116, 43, 33, 78, 80, 66, 66, 56, 6, 96, 97, 38}), new Class[0]), null, new Object[0], new C0WZX("eSwwXgZ0UITPBw==", null));
            Field declaredField = cls.getDeclaredField((String) k.a(16777217, 0, 0L, "05b8ac", new byte[]{44, 22, 18, 88, 87, 98, 58, 0, 58, 109, 50}));
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(objA0);
            if (arrayMap == null) {
                return arrayList;
            }
            for (Object obj : arrayMap.values()) {
                Field declaredField2 = obj.getClass().getDeclaredField((String) k.a(16777217, 0, 0L, "d8a1b0", new byte[]{116, 57, 6, 76, 75, 46, 115, 0}));
                declaredField2.setAccessible(true);
                arrayList.add((Activity) declaredField2.get(obj));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            k.a(16777217, 0, 0L, "f4510b", new byte[]{118, 63, 121, 66});
        }
        return arrayList;
    }

    public static Activity LIZLLL() throws Throwable {
        try {
            Class<?> cls = Class.forName((String) k.a(16777217, 0, 0L, "e632e2", new byte[]{117, 58, 68, 84, 85, 44, 98, 89, 99, 114, 100, 122, 97, 69, 78, 44, 112, 30, 118, 123, 64, 60, 82, 67, 91, 33}));
            Object objA0 = C2204961BRm.a0(cls.getMethod((String) k.a(16777217, 0, 0L, "c67bf5", new byte[]{113, 33, 86, 4, 92, 44, 116, 54, 101, 38, 123, 34, 77, 2, 64, 22, 104, 5, 99, 51, 118}), new Class[0]), null, new Object[0], new C0WZX("eSwwXgZ0UITPBw==", null));
            Field declaredField = cls.getDeclaredField((String) k.a(16777217, 0, 0L, "00a0d9", new byte[]{44, 19, 17, 80, 82, 56, 58, 5, 57, 101, 50}));
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(objA0);
            if (arrayMap.size() < 1) {
                return null;
            }
            for (Object obj : arrayMap.values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField((String) k.a(16777217, 0, 0L, "b471fa", new byte[]{99, 55, 81, 86, 92, 114}));
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField((String) k.a(16777217, 0, 0L, "56ebf9", new byte[]{37, 55, 2, 31, 79, 39, 34, 14}));
                    declaredField3.setAccessible(true);
                    return (Activity) declaredField3.get(obj);
                }
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            k.a(16777217, 0, 0L, "b63b5b", new byte[]{114, 61, 127, 17});
            return null;
        }
    }
}
