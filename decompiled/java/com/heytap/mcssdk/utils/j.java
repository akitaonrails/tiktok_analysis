package com.heytap.mcssdk.utils;

import X.C2188811AlT;
import android.os.Binder;
import android.os.UserHandle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes14.dex */
public class j {
    public static final String a = "PushService";

    public static int a() {
        int iIntValue = 0;
        try {
            UserHandle callingUserHandle = Binder.getCallingUserHandle();
            Method declaredMethod = callingUserHandle.getClass().getDeclaredMethod("getIdentifier", new Class[0]);
            declaredMethod.setAccessible(true);
            iIntValue = ((Integer) declaredMethod.invoke(callingUserHandle, new Object[0])).intValue();
            return iIntValue;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String str = a;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get userId exception,");
            sbLIZ.append(e);
            e.b(str, C2188811AlT.LIZIZ(sbLIZ));
            return iIntValue;
        }
    }

    public static int a(int i, int i2) {
        return (i2 * 100000) + (i % 100000);
    }
}
