package com.bytedance.lynx.service.log;

import X.C01GW;
import X.C1289470jez;
import X.C1292380jjg;
import X.C1292390jjh;
import X.C1292400jji;
import X.C2188811AlT;
import X.C452501pT;
import X.EnumC1292370jjf;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.service.ILynxLogService;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxLogService implements ILynxLogService {
    public static final C1292390jjh Companion = new Object() { // from class: X.0jjh
    };
    public static final C01GW<LynxLogService> INSTANCE$delegate = C452501pT.LIZIZ(new C1292380jjg());
    public EnumC1292370jjf logOutputChannel = EnumC1292370jjf.Native;

    @Override // com.lynx.tasm.service.ILynxLogService, com.lynx.tasm.service.IServiceProvider
    public final /* synthetic */ Class getServiceClass() {
        return C1292400jji.LIZ(this);
    }

    @Override // com.lynx.tasm.service.ILynxLogService
    public void logByPlatform(int i, String str, String str2) {
    }

    @Override // com.lynx.tasm.service.IServiceProvider
    public final /* synthetic */ void onInitialize(Context context) {
        C1289470jez.LIZ(this, context);
    }

    @Override // com.lynx.tasm.service.ILynxLogService
    public long getDefaultWriteFunction() {
        return getALogNativeFunctionAddress("getALogSimpleWriteFuncAddr");
    }

    @Override // com.lynx.tasm.service.ILynxLogService
    public boolean getLogToSystemStatus() throws NoSuchFieldException {
        try {
            Class<?> cls = Class.forName("com.ss.android.agilelogger.ALog");
            Field declaredField = cls.getDeclaredField("sDebug");
            declaredField.setAccessible(true);
            return declaredField.getBoolean(cls);
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        } catch (IllegalAccessException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return false;
        } catch (NoSuchMethodException e3) {
            TryCatchGuardChecker.doCheck(e3);
            return false;
        }
    }

    @Override // com.lynx.tasm.service.ILynxLogService
    public boolean isLogOutputByPlatform() {
        return this.logOutputChannel == EnumC1292370jjf.Platform;
    }

    private final long getALogNativeFunctionAddress(String str) {
        try {
            Method declaredMethod = Class.forName("com.ss.android.agilelogger.ALog").getDeclaredMethod(str, new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            if (objInvoke != null) {
                return ((Long) objInvoke).longValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("The ALog ");
            sbLIZ.append(str);
            sbLIZ.append(" function was not successfully retrieved [ ");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
            return 0L;
        }
    }

    @Override // com.lynx.tasm.service.ILynxLogService
    public void switchLogToSystem(boolean z) {
        try {
            Class.forName("com.ss.android.agilelogger.ALog").getMethod("setDebug", Boolean.TYPE).invoke(null, Boolean.valueOf(z));
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (IllegalAccessException e2) {
            TryCatchGuardChecker.doCheck(e2);
        } catch (NoSuchMethodException e3) {
            TryCatchGuardChecker.doCheck(e3);
        } catch (InvocationTargetException e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
    }
}
