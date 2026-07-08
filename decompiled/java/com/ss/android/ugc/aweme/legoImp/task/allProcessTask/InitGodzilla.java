package com.ss.android.ugc.aweme.legoImp.task.allProcessTask;

import X.AbstractC20698088y;
import X.AnonymousClass0892;
import X.AnonymousClass0893;
import X.AnonymousClass0894;
import X.AnonymousClass0895;
import X.AnonymousClass0896;
import X.C089D;
import X.C089N;
import X.C0CCZ;
import X.C0VZ0;
import X.C1150504el;
import X.C1211204oY;
import X.C1211304oZ;
import X.C13WZ;
import X.C1BWL;
import X.C20674088a;
import X.C20675088b;
import X.C20692088s;
import X.C20693088t;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InstrumentationC20695088v;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.database.CursorWindow;
import android.os.Build;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.platform.godzilla.sysopt.UbsanOpt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.settings.LooperProtectEnhanceSetting$ExceptionInfo;
import com.ss.android.ugc.aweme.settings.LooperProtectEnhanceSetting$LooperProtectEnhanceConfig;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.LooperProtectEnhanceThrowable;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class InitGodzilla implements C0CCZ {
    public static final InitGodzilla LL = new InitGodzilla();

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitGodzilla";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 16777215;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        final Application applicationLIZ = C1BWL.LIZ();
        C1150504el.LIZ().LIZLLL("method_init_godzilla", false);
        C20692088s c20692088s = new C20692088s(applicationLIZ);
        c20692088s.LIZ(new AbstractC20698088y() { // from class: X.088x
            @Override // X.AnonymousClass0894
            public final String LIZIZ() {
                return "FinalizeTimeoutPlugin";
            }

            @Override // X.AbstractC20698088y
            public final boolean LJFF() {
                return true;
            }

            @Override // X.AbstractC20698088y, X.AnonymousClass0894
            public final void LIZLLL() {
                super.LIZLLL();
            }

            @Override // X.AnonymousClass0897
            public final boolean LIZ(Thread thread, Throwable th) {
                if (thread != null && th != null && thread.getName().equals("FinalizerWatchdogDaemon") && (th instanceof TimeoutException)) {
                    AnonymousClass0892.LIZ("FinalizeTimeoutPlugin", "Hint FinalizeTimeout case ,fix it.");
                    return true;
                }
                return false;
            }
        });
        c20692088s.LIZ(new AnonymousClass0894() { // from class: X.088q
            @Override // X.AnonymousClass0894
            public final String LIZIZ() {
                return "ProviderInstalledFailedPlugin";
            }

            @Override // X.AnonymousClass0894
            public final void LIZLLL() {
                if (!InstrumentationC20695088v.LIZIZ) {
                    try {
                        Object objLIZ = C083E.LIZ();
                        Field declaredField = objLIZ.getClass().getDeclaredField("mInstrumentation");
                        declaredField.setAccessible(true);
                        if (!(declaredField.get(objLIZ) instanceof InstrumentationC20695088v)) {
                            declaredField.set(objLIZ, new InstrumentationC20695088v());
                            AnonymousClass0892.LIZIZ("InstrumentationWrapper", "Fix success.", AnonymousClass0891.DEBUG);
                            InstrumentationC20695088v.LIZIZ = true;
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        AnonymousClass0892.LIZIZ("InstrumentationWrapper", e.getMessage(), AnonymousClass0891.DEBUG);
                    }
                }
                AnonymousClass0892.LIZ("ProviderInstalledFailedPlugin", "start");
            }

            @Override // X.AnonymousClass0894
            public final void LIZJ(Application application) {
                InstrumentationC20695088v.LIZ(new AnonymousClass0896() { // from class: X.088r
                    public static final List<String> LIZ;

                    @Override // X.AnonymousClass0896
                    public final void registerCondition() {
                    }

                    static {
                        ArrayList arrayList = new ArrayList();
                        LIZ = arrayList;
                        arrayList.add("FILE_PROVIDER_PATHS");
                        arrayList.add("NullPointerException");
                        arrayList.add("Failed to resolve canonical path");
                        arrayList.add("android.os.DeadSystemException");
                        arrayList.add("Package manager has died");
                    }

                    @Override // X.AnonymousClass0896
                    public final boolean LIZ(Object obj, Throwable th) {
                        for (StackTraceElement stackTraceElement : ThreadMethodProxy.getStackTrace(C786410Ut5.u3())) {
                            if (stackTraceElement.getMethodName().contains("installProvider") && th != null) {
                                String string = th.toString();
                                for (String str : (ArrayList) LIZ) {
                                    if (string.contains(str)) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("Hint the crash ");
                                        sbLIZ.append(str);
                                        AnonymousClass0892.LIZIZ("ProviderInstallFailed", C2188811AlT.LIZIZ(sbLIZ), AnonymousClass0891.DEBUG);
                                        return true;
                                    }
                                }
                            }
                        }
                        return false;
                    }
                });
                InstrumentationC20695088v.LIZ(new AnonymousClass0896() { // from class: X.088u
                    @Override // X.AnonymousClass0896
                    public final void registerCondition() {
                    }

                    @Override // X.AnonymousClass0896
                    public final boolean LIZ(Object obj, Throwable th) {
                        StackTraceElement[] stackTrace = ThreadMethodProxy.getStackTrace(C786410Ut5.u3());
                        if (th instanceof ClassNotFoundException) {
                            for (StackTraceElement stackTraceElement : stackTrace) {
                                if (stackTraceElement.getMethodName().contains("installProvider")) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                });
            }
        });
        c20692088s.LIZ(new AbstractC20698088y() { // from class: X.088e
            @Override // X.AnonymousClass0894
            public final String LIZIZ() {
                return "OppoMessageNPEPlugin";
            }

            @Override // X.AbstractC20698088y
            public final boolean LJFF() {
                return false;
            }

            @Override // X.AnonymousClass0897
            public final boolean LIZ(Thread thread, Throwable th) {
                if (!(th instanceof NullPointerException)) {
                    return false;
                }
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    if ("android.os.Message".equals(stackTraceElement.getClassName()) && "toString".equals(stackTraceElement.getMethodName())) {
                        AnonymousClass0892.LIZ("OppoMessageNPEPlugin", "Hint OppoMessageNPE case ,fix it.");
                        return true;
                    }
                }
                return false;
            }
        });
        c20692088s.LIZ(new AbstractC20698088y() { // from class: X.088f
            @Override // X.AnonymousClass0894
            public final String LIZIZ() {
                return "BadTokenAndResourceNotFoundCrashPlugin";
            }

            @Override // X.AbstractC20698088y
            public final boolean LJFF() {
                return true;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
            /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
            @Override // X.AnonymousClass0897
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LIZ(java.lang.Thread r9, java.lang.Throwable r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof android.view.WindowManager.BadTokenException
                    java.lang.String r6 = "BadTokenAndResourceNotFoundCrashPlugin"
                    r7 = 0
                    if (r0 == 0) goto L33
                    java.lang.StackTraceElement[] r5 = r10.getStackTrace()
                    int r4 = r5.length
                    r3 = 0
                Ld:
                    if (r3 >= r4) goto L33
                    r2 = r5[r3]
                    java.lang.String r1 = r2.getClassName()
                    java.lang.String r0 = "android.view.ViewRootImpl"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L30
                    java.lang.String r1 = "setView"
                    java.lang.String r0 = r2.getMethodName()
                    boolean r0 = r1.equals(r0)
                    if (r0 == 0) goto L30
                    java.lang.String r0 = "badToken exception case"
                    X.AnonymousClass0892.LIZ(r6, r0)
                L2e:
                    r7 = 1
                L2f:
                    return r7
                L30:
                    int r3 = r3 + 1
                    goto Ld
                L33:
                    boolean r0 = r10 instanceof android.content.res.Resources.NotFoundException
                    if (r0 == 0) goto L2f
                    java.lang.StackTraceElement[] r5 = r10.getStackTrace()
                    int r4 = r5.length
                    r3 = 0
                L3d:
                    if (r3 >= r4) goto L2f
                    r2 = r5[r3]
                    java.lang.String r1 = r2.getClassName()
                    java.lang.String r0 = "org.chromium.ui.base.DeviceFormFactor"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L5f
                    java.lang.String r1 = "isTablet"
                    java.lang.String r0 = r2.getMethodName()
                    boolean r0 = r1.equals(r0)
                    if (r0 == 0) goto L5f
                    java.lang.String r0 = "android.content.res.Resources$NotFoundException case"
                    X.AnonymousClass0892.LIZ(r6, r0)
                    goto L2e
                L5f:
                    int r3 = r3 + 1
                    goto L3d
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C20679088f.LIZ(java.lang.Thread, java.lang.Throwable):boolean");
            }
        });
        c20692088s.LIZ(new AnonymousClass0894() { // from class: X.089B
            @Override // X.AnonymousClass0894
            public final String LIZIZ() {
                return "UbsanOptPlugin";
            }

            @Override // X.AnonymousClass0894
            public final void LIZJ(Application application) {
            }

            @Override // X.AnonymousClass0894
            public final void LIZLLL() {
                AnonymousClass0892.LIZ("UbsanOptPlugin", "start");
                String hexString = Long.toHexString(79531005658441L);
                if (hexString == null || hexString.equals("")) {
                    return;
                }
                String strReplace = hexString.replace(" ", "");
                int length = strReplace.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    try {
                        bArr[i] = (byte) (CastIntegerProtector.parseInt(strReplace.substring(i2, i2 + 2), 16) & 255);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                try {
                    strReplace = new String(bArr, "UTF-8");
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                if (Build.MANUFACTURER.toUpperCase().contains(strReplace) && Build.VERSION.SDK_INT == 29) {
                    UbsanOpt.start();
                }
            }
        });
        c20692088s.LIZ(new AbstractC20698088y() { // from class: X.088d
            @Override // X.AnonymousClass0894
            public final String LIZIZ() {
                return "ActivityTopPositionAlreadySetPlugin";
            }

            @Override // X.AbstractC20698088y
            public final boolean LJFF() {
                return true;
            }

            @Override // X.AnonymousClass0897
            public final boolean LIZ(Thread thread, Throwable th) {
                if (!(th instanceof IllegalStateException)) {
                    return false;
                }
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    if ("android.app.ActivityThread".equals(stackTraceElement.getClassName()) && "handleTopResumedActivityChanged".equals(stackTraceElement.getMethodName())) {
                        return true;
                    }
                }
                return false;
            }
        });
        c20692088s.LIZ(new AbstractC20698088y() { // from class: X.088g
            @Override // X.AnonymousClass0894
            public final String LIZIZ() {
                return "PerformanceFinalizeFix";
            }

            @Override // X.AbstractC20698088y
            public final boolean LJFF() {
                return true;
            }

            @Override // X.AnonymousClass0897
            public final boolean LIZ(Thread thread, Throwable th) {
                if (!(th instanceof TimeoutException)) {
                    return false;
                }
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    if (stackTraceElement.getClassName().startsWith("java.lang.Daemons") && "doFinalize".equals(stackTraceElement.getMethodName())) {
                        AnonymousClass0892.LIZ("PerformanceFinalizeFix", "org.codeaurora.Performance.finalize() TimeoutException case");
                        return true;
                    }
                }
                return false;
            }
        });
        c20692088s.LIZ(new AbstractC20698088y() { // from class: X.088c
            @Override // X.AnonymousClass0894
            public final String LIZIZ() {
                return "SecurityExceptionPlugin";
            }

            @Override // X.AbstractC20698088y
            public final boolean LJFF() {
                return true;
            }

            @Override // X.AnonymousClass0897
            public final boolean LIZ(Thread thread, Throwable th) {
                if (th instanceof SecurityException) {
                    for (StackTraceElement stackTraceElement : ThreadMethodProxy.getStackTrace(thread)) {
                        if ("com.google.android.gms.common.internal.BaseGmsClient".equals(stackTraceElement.getClassName()) && "a".equals(stackTraceElement.getMethodName())) {
                            return true;
                        }
                    }
                }
                return false;
            }
        });
        if (((Boolean) C1211304oZ.LIZ.getValue()).booleanValue()) {
            c20692088s.LIZ(new AnonymousClass0894(applicationLIZ) { // from class: X.085R
                public final Application LIZ;

                @Override // X.AnonymousClass0894
                public final String LIZIZ() {
                    return "DeadSystemExceptionPlugin";
                }

                @Override // X.AnonymousClass0894
                public final void LIZLLL() {
                    if (Build.VERSION.SDK_INT == 29) {
                        C20597085b c20597085b = new C20597085b();
                        Application application = this.LIZ;
                        try {
                            Field fieldLIZ = C1963207mY.LIZ(View.class);
                            c20597085b.LL = fieldLIZ;
                            if (fieldLIZ != null) {
                                fieldLIZ.setAccessible(true);
                                application.registerActivityLifecycleCallbacks(c20597085b);
                                AnonymousClass0892.LIZ("ViewRootImplHandlerHook", "Hook success ");
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        new AnonymousClass0839().LIZLLL();
                    }
                }

                {
                    this.LIZ = applicationLIZ;
                }
            });
        }
        c20692088s.LIZ(new C20675088b());
        c20692088s.LIZ(new AbstractC20698088y() { // from class: X.1ATi
            @Override // X.AnonymousClass0894
            public final String LIZIZ() {
                return "LooperProtectEnhancePlugin";
            }

            @Override // X.AbstractC20698088y
            public final boolean LJFF() {
                return true;
            }

            @Override // X.AnonymousClass0897
            public final boolean LIZ(Thread thread, Throwable th) {
                StackTraceElement[] stackTrace;
                if (((Boolean) C0ADI.LIZ.getValue()).booleanValue() && (th instanceof ClassCastException) && "android.view.ViewGroup$LayoutParams cannot be cast to android.view.ViewGroup$MarginLayoutParams".equals(th.getMessage())) {
                    Activity topActivity = ActivityStack.getTopActivity();
                    if (topActivity != null) {
                        PrintStream printStream = System.err;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("activity info:");
                        sbLIZ.append(topActivity.toString());
                        printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                        PrintStream printStream2 = System.err;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("ViewTree info:");
                        StringBuilder sb = new StringBuilder();
                        C485800J3i.LIZ((ViewGroup) topActivity.getWindow().getDecorView(), sb);
                        sbLIZ2.append(sb.toString());
                        printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
                    } else {
                        System.err.println("activity is null");
                    }
                }
                if (th == null || (stackTrace = th.getStackTrace()) == null) {
                    return false;
                }
                LooperProtectEnhanceSetting$LooperProtectEnhanceConfig looperProtectEnhanceSetting$LooperProtectEnhanceConfigLIZ = C1865380yds.LIZ();
                if (!LooperProtectEnhanceSetting$LooperProtectEnhanceConfig.LIZ(looperProtectEnhanceSetting$LooperProtectEnhanceConfigLIZ)) {
                    return false;
                }
                for (LooperProtectEnhanceSetting$ExceptionInfo looperProtectEnhanceSetting$ExceptionInfo : looperProtectEnhanceSetting$LooperProtectEnhanceConfigLIZ.ignoreList) {
                    if (looperProtectEnhanceSetting$ExceptionInfo.LIZ() && th.getClass().getName().equals(looperProtectEnhanceSetting$ExceptionInfo.exceptionType) && th.getMessage() != null && th.getMessage().contains(looperProtectEnhanceSetting$ExceptionInfo.exceptionMessage)) {
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            if (looperProtectEnhanceSetting$ExceptionInfo.stackClassName.equals(stackTraceElement.getClassName()) && looperProtectEnhanceSetting$ExceptionInfo.stackMethodName.equals(stackTraceElement.getMethodName())) {
                                C814290Vwx.LIZIZ.ensureNotReachHere(new LooperProtectEnhanceThrowable("LOOPER_PROTECT_ENHANCE_SUCCESS", th), "LOOPER_PROTECT_ENHANCE_SUCCESS");
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
        });
        if (((Boolean) C1211204oY.LIZ.getValue()).booleanValue()) {
            c20692088s.LIZ(new AnonymousClass0894() { // from class: X.083D
                public static int LIZ = -1;
                public static Field LIZIZ;

                @Override // X.AnonymousClass0894
                public final String LIZIZ() {
                    return "CursorWindowPlugin";
                }

                @Override // X.AnonymousClass0894
                public final void LIZLLL() {
                    Field fieldLIZ = C1962907mV.LIZ(CursorWindow.class, "sCursorWindowSize");
                    LIZIZ = fieldLIZ;
                    if (fieldLIZ != null) {
                        fieldLIZ.setAccessible(true);
                        try {
                            Field field = LIZIZ;
                            C1963107mX.LIZ(field, "The field must not be null");
                            int iIntValue = ((Integer) C1962907mV.LIZIZ(field, null)).intValue();
                            LIZ = iIntValue;
                            if (iIntValue != 1048576) {
                                Field field2 = LIZIZ;
                                C1963107mX.LIZ(field2, "The field must not be null");
                                if (!field2.isAccessible()) {
                                    field2.setAccessible(true);
                                }
                                field2.set(null, 1048576);
                            }
                            Field field3 = LIZIZ;
                            C1963107mX.LIZ(field3, "The field must not be null");
                            int iIntValue2 = ((Integer) C1962907mV.LIZIZ(field3, null)).intValue();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Resize cursor window size successful! Resize form :");
                            sbLIZ.append(LIZ);
                            sbLIZ.append("to ");
                            sbLIZ.append(iIntValue2);
                            AnonymousClass0892.LIZ("CursorWindowPlugin", C2188811AlT.LIZIZ(sbLIZ));
                        } catch (IllegalAccessException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }

                @Override // X.AnonymousClass0894
                public final void LIZJ(Application application) {
                }
            });
        }
        C1150504el.LIZ().LIZLLL("method_godzilla_pthread", false);
        if (!Process.is64Bit()) {
            c20692088s.LIZ(new C089D());
        }
        C1150504el.LIZ().LJI("method_godzilla_pthread", false);
        C20693088t c20693088t = new C20693088t(c20692088s.LIZ, c20692088s.LIZIZ, null, null);
        synchronized (C20693088t.class) {
            try {
                if (C20693088t.LIZJ == null) {
                    C20693088t.LIZJ = c20693088t;
                } else {
                    AnonymousClass0892.LIZ("Godzilla", "Godzilla instance is already set. this invoking will be ignored");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C20693088t c20693088t2 = C20693088t.LIZJ;
        c20693088t2.getClass();
        c20693088t2.LIZ(AnonymousClass0893.IMMEDIATE);
        C20674088a.LIZ = true;
        if (AnonymousClass0895.LIZ) {
            C089N.LIZ.getClass();
            C13WZ.LIZIZ();
        }
        C1150504el.LIZ().LJI("method_init_godzilla", false);
        C1150504el.LIZ().LIZLLL("method_register_godzilla", false);
        InstrumentationC20695088v.LIZ(new AnonymousClass0896() { // from class: X.089A
            @Override // X.AnonymousClass0896
            public final void registerCondition() {
            }

            @Override // X.AnonymousClass0896
            public final boolean LIZ(Object obj, Throwable th2) {
                StackTraceElement[] stackTrace;
                String message;
                Thread threadU3 = C786410Ut5.u3();
                if (obj != null && th2 != null && threadU3 != null && (stackTrace = ThreadMethodProxy.getStackTrace(threadU3)) != null && stackTrace.length != 0) {
                    C089E c089e = new C089E(stackTrace);
                    while (c089e.hasNext()) {
                        StackTraceElement stackTraceElement = (StackTraceElement) c089e.next();
                        if (stackTraceElement != null && Intrinsics.LJFF("android.app.ActivityThread", stackTraceElement.getClassName()) && (message = th2.getMessage()) != null && a0.LJJIIZI(message, "android.os.DeadSystemException", false) && (Intrinsics.LJFF("handleCreateService", stackTraceElement.getMethodName()) || Intrinsics.LJFF("handleStopService", stackTraceElement.getMethodName()) || Intrinsics.LJFF("handleBindService", stackTraceElement.getMethodName()) || Intrinsics.LJFF("handleUnbindService", stackTraceElement.getMethodName()) || Intrinsics.LJFF("handleServiceArgs", stackTraceElement.getMethodName()))) {
                            C1AF0.LJFF(th2, "binderlog");
                            return true;
                        }
                    }
                }
                return false;
            }
        });
        C1150504el.LIZ().LJI("method_register_godzilla", false);
    }
}
