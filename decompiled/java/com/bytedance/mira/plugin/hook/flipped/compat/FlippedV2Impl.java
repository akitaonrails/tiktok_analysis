package com.bytedance.mira.plugin.hook.flipped.compat;

import X.InterfaceC20130013pa;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes31.dex */
public class FlippedV2Impl implements InterfaceC20130013pa {
    private native Method getDeclaredMethod(Object obj, String str, Class<?>[] clsArr);

    static {
        System.loadLibrary("flipped");
    }

    @Override // X.InterfaceC20130013pa
    public final void LIZ() {
        try {
            Class<?> cls = Class.forName("dalvik.system.VMRuntime");
            Method declaredMethod = getDeclaredMethod(cls, "getRuntime", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            Method declaredMethod2 = getDeclaredMethod(cls, "setHiddenApiExemptions", new Class[]{String[].class});
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(objInvoke, new String[]{"L"});
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
