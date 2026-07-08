package com.ss.android.ugc.aweme.sp;

import X.C08AP;
import X.C08RN;
import X.C0VSJ;
import X.C2113508Pt;
import X.C2188811AlT;
import X.C786450Ut9;
import X.InstrumentationC2411909cj;
import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.ss.android.ugc.aweme.sp.SharedPreferencesManager;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class SharedPreferencesManager {
    public Constructor constructor;
    public boolean hasObtained;
    public HashMap lockMap;
    public Map<String, File> mOrignalSharedPrefsPaths;
    public File mPreferencesDir;
    public Map<String, File> mSharedPrefsPaths;
    public Map<File, SharedPreferences> sSharedPrefsCache;
    public Class<?> sharedPreferencesImplClass;

    public static void hookInstrumentation() {
        Field declaredField;
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentActivityThread", new Class[0]);
            if (declaredMethod == null) {
                return;
            }
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            if (objInvoke == null || (declaredField = objInvoke.getClass().getDeclaredField("mInstrumentation")) == null) {
                return;
            }
            declaredField.setAccessible(true);
            final Instrumentation instrumentation = (Instrumentation) declaredField.get(objInvoke);
            if (instrumentation == null || (instrumentation instanceof InstrumentationC2411909cj)) {
                return;
            }
            declaredField.set(objInvoke, new Instrumentation(instrumentation) { // from class: X.09cj
                public final Instrumentation LIZ;

                {
                    this.LIZ = instrumentation;
                }

                @Override // android.app.Instrumentation
                public final void callActivityOnDestroy(Activity activity) {
                    Instrumentation instrumentation2 = this.LIZ;
                    if (instrumentation2 != null) {
                        instrumentation2.callActivityOnDestroy(activity);
                    } else {
                        super.callActivityOnDestroy(activity);
                    }
                }

                @Override // android.app.Instrumentation
                public final void callActivityOnPause(Activity activity) {
                    Instrumentation instrumentation2 = this.LIZ;
                    if (instrumentation2 != null) {
                        instrumentation2.callActivityOnPause(activity);
                    } else {
                        super.callActivityOnPause(activity);
                    }
                }

                @Override // android.app.Instrumentation
                public final void callActivityOnRestart(Activity activity) {
                    Instrumentation instrumentation2 = this.LIZ;
                    if (instrumentation2 != null) {
                        instrumentation2.callActivityOnRestart(activity);
                    } else {
                        super.callActivityOnRestart(activity);
                    }
                }

                @Override // android.app.Instrumentation
                public final void callActivityOnResume(Activity activity) {
                    Instrumentation instrumentation2 = this.LIZ;
                    if (instrumentation2 != null) {
                        instrumentation2.callActivityOnResume(activity);
                    } else {
                        super.callActivityOnResume(activity);
                    }
                }

                @Override // android.app.Instrumentation
                public final void callActivityOnStart(Activity activity) {
                    Instrumentation instrumentation2 = this.LIZ;
                    if (instrumentation2 != null) {
                        instrumentation2.callActivityOnStart(activity);
                    } else {
                        super.callActivityOnStart(activity);
                    }
                }

                @Override // android.app.Instrumentation
                public final void callActivityOnStop(Activity activity) {
                    Instrumentation instrumentation2 = this.LIZ;
                    if (instrumentation2 != null) {
                        instrumentation2.callActivityOnStop(activity);
                    } else {
                        super.callActivityOnStop(activity);
                    }
                }

                @Override // android.app.Instrumentation
                public final void callActivityOnUserLeaving(Activity activity) {
                    Instrumentation instrumentation2 = this.LIZ;
                    if (instrumentation2 != null) {
                        instrumentation2.callActivityOnUserLeaving(activity);
                    } else {
                        super.callActivityOnUserLeaving(activity);
                    }
                }

                @Override // android.app.Instrumentation
                public final void callApplicationOnCreate(Application application) {
                    Instrumentation instrumentation2 = this.LIZ;
                    if (instrumentation2 != null) {
                        instrumentation2.callApplicationOnCreate(application);
                    } else {
                        super.callApplicationOnCreate(application);
                    }
                }

                @Override // android.app.Instrumentation
                public final void callActivityOnCreate(Activity activity, Bundle bundle) {
                    try {
                        Field field = C2113408Ps.LIZ;
                        if (field != null && !(((Context) field.get(activity)) instanceof C2408809cE)) {
                            field.set(activity, new ContextWrapper(activity.getBaseContext()) { // from class: X.09cE
                                @Override // android.content.ContextWrapper
                                public final void attachBaseContext(Context context) {
                                    if (NxRewordManager.LJIILIIL) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("attachBaseContextWrapper: ");
                                        sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
                                        C2188811AlT.LIZIZ(sbLIZ);
                                        context = new C817700W5w(context, false);
                                    }
                                    super.attachBaseContext(context);
                                }

                                @Override // android.content.ContextWrapper, android.content.Context
                                public final SharedPreferences getSharedPreferences(String str, int i) {
                                    return SharedPreferencesManager.getInstance().getSharedPreferences(this, str);
                                }
                            });
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    Instrumentation instrumentation2 = this.LIZ;
                    if (instrumentation2 != null) {
                        instrumentation2.callActivityOnCreate(activity, bundle);
                    } else {
                        super.callActivityOnCreate(activity, bundle);
                    }
                }

                @Override // android.app.Instrumentation
                public final void callActivityOnNewIntent(Activity activity, Intent intent) {
                    Instrumentation instrumentation2 = this.LIZ;
                    if (instrumentation2 != null) {
                        instrumentation2.callActivityOnNewIntent(activity, intent);
                    } else {
                        super.callActivityOnNewIntent(activity, intent);
                    }
                }

                @Override // android.app.Instrumentation
                public final void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle) {
                    Instrumentation instrumentation2 = this.LIZ;
                    if (instrumentation2 != null) {
                        instrumentation2.callActivityOnRestoreInstanceState(activity, bundle);
                    } else {
                        super.callActivityOnRestoreInstanceState(activity, bundle);
                    }
                }

                @Override // android.app.Instrumentation
                public final void callActivityOnSaveInstanceState(Activity activity, Bundle bundle) {
                    Instrumentation instrumentation2 = this.LIZ;
                    if (instrumentation2 != null) {
                        instrumentation2.callActivityOnSaveInstanceState(activity, bundle);
                    } else {
                        super.callActivityOnSaveInstanceState(activity, bundle);
                    }
                }

                @Override // android.app.Instrumentation
                public final boolean onException(Object obj, Throwable th) {
                    Instrumentation instrumentation2 = this.LIZ;
                    if (instrumentation2 != null) {
                        return instrumentation2.onException(obj, th);
                    }
                    return super.onException(obj, th);
                }

                @Override // android.app.Instrumentation
                public final Activity newActivity(ClassLoader classLoader, String str, Intent intent) {
                    Instrumentation instrumentation2 = this.LIZ;
                    if (instrumentation2 == null) {
                        return super.newActivity(classLoader, str, intent);
                    }
                    return instrumentation2.newActivity(classLoader, str, intent);
                }

                @Override // android.app.Instrumentation
                public final Application newApplication(ClassLoader classLoader, String str, Context context) {
                    Instrumentation instrumentation2 = this.LIZ;
                    if (instrumentation2 != null) {
                        return instrumentation2.newApplication(classLoader, str, context);
                    }
                    return super.newApplication(classLoader, str, context);
                }

                @Override // android.app.Instrumentation
                public final Activity newActivity(Class<?> cls, Context context, IBinder iBinder, Application application, Intent intent, ActivityInfo activityInfo, CharSequence charSequence, Activity activity, String str, Object obj) {
                    Instrumentation instrumentation2 = this.LIZ;
                    if (instrumentation2 != null) {
                        return instrumentation2.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
                    }
                    return super.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public SharedPreferencesManager() {
        this.sSharedPrefsCache = Collections.synchronizedMap(new HashMap());
        this.mSharedPrefsPaths = Collections.synchronizedMap(new HashMap());
        this.lockMap = new HashMap();
    }

    public static SharedPreferencesManager getInstance() {
        return C2113508Pt.LIZ;
    }

    public static File INVOKEVIRTUAL_com_ss_android_ugc_aweme_sp_SharedPreferencesManager_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    public static File ensurePrivateDirExists(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private File getDataDir(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return getDataDirAbove24(context);
        }
        return INVOKEVIRTUAL_com_ss_android_ugc_aweme_sp_SharedPreferencesManager_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(context).getParentFile();
    }

    private File getDataDirAbove24(Context context) {
        return context.getDataDir();
    }

    private File getPreferencesDir(Context context) {
        if (this.mPreferencesDir == null) {
            this.mPreferencesDir = new C0VSJ(getDataDir(context), "shared_prefs");
        }
        File file = this.mPreferencesDir;
        ensurePrivateDirExists(file);
        return file;
    }

    private File getSharedPreferencesPath(Context context, String str) {
        File preferencesDir = getPreferencesDir(context);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(".xml");
        return makeFilename(preferencesDir, C2188811AlT.LIZIZ(sbLIZ));
    }

    private File makeFilename(File file, String str) {
        if (str.indexOf(File.separatorChar) < 0) {
            return new C0VSJ(file, str);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("File ");
        sbLIZ.append(str);
        sbLIZ.append(" contains a path separator");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.content.SharedPreferences getSharedPreferences(android.content.Context r9, java.lang.String r10) {
        /*
            r8 = this;
            r7 = 0
            if (r9 == 0) goto Lb6
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto Lb6
            java.util.Map<java.lang.String, java.io.File> r0 = r8.mSharedPrefsPaths
            java.lang.Object r5 = r0.get(r10)
            java.io.File r5 = (java.io.File) r5
            if (r5 != 0) goto Laf
            long r1 = android.os.SystemClock.uptimeMillis()
            java.util.HashMap r0 = r8.lockMap
            java.lang.Object r4 = r0.get(r10)
            if (r4 != 0) goto L3c
            java.util.HashMap r3 = r8.lockMap
            monitor-enter(r3)
            java.util.HashMap r0 = r8.lockMap     // Catch: java.lang.Throwable -> L36
            java.lang.Object r4 = r0.get(r10)     // Catch: java.lang.Throwable -> L36
            if (r4 != 0) goto L34
            java.lang.Object r4 = new java.lang.Object     // Catch: java.lang.Throwable -> L36
            r4.<init>()     // Catch: java.lang.Throwable -> L36
            java.util.HashMap r0 = r8.lockMap     // Catch: java.lang.Throwable -> L36
            r0.put(r10, r4)     // Catch: java.lang.Throwable -> L36
        L34:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            goto L3c
        L36:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            throw r0
        L3c:
            monitor-enter(r4)
            java.util.Map<java.lang.String, java.io.File> r0 = r8.mSharedPrefsPaths     // Catch: java.lang.Throwable -> La9
            java.lang.Object r5 = r0.get(r10)     // Catch: java.lang.Throwable -> La9
            java.io.File r5 = (java.io.File) r5     // Catch: java.lang.Throwable -> La9
            if (r5 != 0) goto La7
            java.io.File r5 = r8.getSharedPreferencesPath(r9, r10)     // Catch: java.lang.Throwable -> La9
            boolean r0 = r8.hasObtained     // Catch: java.lang.Throwable -> La9
            if (r0 != 0) goto L96
            java.util.Map<java.lang.String, java.io.File> r0 = r8.mOrignalSharedPrefsPaths     // Catch: java.lang.Throwable -> La9
            if (r0 != 0) goto L96
            java.lang.reflect.Field r3 = X.C2113408Ps.LIZ     // Catch: java.lang.Throwable -> La9
            if (r3 == 0) goto L66
            boolean r0 = r9 instanceof android.content.ContextWrapper     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L66
            java.lang.Object r6 = r3.get(r9)     // Catch: java.lang.Throwable -> L62
            android.content.Context r6 = (android.content.Context) r6     // Catch: java.lang.Throwable -> L62
            goto L67
        L62:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La9
        L66:
            r6 = r7
        L67:
            if (r6 != 0) goto L71
            java.lang.String r0 = "mBase"
            java.lang.Object r6 = X.C1965507mv.LIZJ(r9, r0)     // Catch: java.lang.Throwable -> La9
            android.content.Context r6 = (android.content.Context) r6     // Catch: java.lang.Throwable -> La9
        L71:
            if (r6 == 0) goto L93
            java.lang.reflect.Field r3 = X.C2113408Ps.LIZIZ     // Catch: java.lang.Throwable -> La9
            if (r3 == 0) goto L86
            boolean r0 = r6 instanceof android.content.ContextWrapper     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L86
            java.lang.Object r0 = r3.get(r6)     // Catch: java.lang.Throwable -> L82
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L82
            goto L87
        L82:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La9
        L86:
            r0 = r7
        L87:
            if (r0 != 0) goto L91
            java.lang.String r0 = "mSharedPrefsPaths"
            java.lang.Object r0 = X.C1965507mv.LIZJ(r6, r0)     // Catch: java.lang.Throwable -> La9
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> La9
        L91:
            r8.mOrignalSharedPrefsPaths = r0     // Catch: java.lang.Throwable -> La9
        L93:
            r0 = 1
            r8.hasObtained = r0     // Catch: java.lang.Throwable -> La9
        L96:
            java.util.Map<java.lang.String, java.io.File> r0 = r8.mOrignalSharedPrefsPaths     // Catch: java.lang.Throwable -> La9
            if (r0 == 0) goto La2
            boolean r0 = r0.containsValue(r5)     // Catch: java.lang.Throwable -> La9
            if (r0 == 0) goto La2
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La9
            return r7
        La2:
            java.util.Map<java.lang.String, java.io.File> r0 = r8.mSharedPrefsPaths     // Catch: java.lang.Throwable -> La9
            r0.put(r10, r5)     // Catch: java.lang.Throwable -> La9
        La7:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La9
            goto Lb1
        La9:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La9
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La9
            throw r0
        Laf:
            r1 = 0
        Lb1:
            android.content.SharedPreferences r0 = r8.getSharedPreferences(r10, r5, r1)
            return r0
        Lb6:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sp.SharedPreferencesManager.getSharedPreferences(android.content.Context, java.lang.String):android.content.SharedPreferences");
    }

    public SharedPreferences getSharedPreferences(String str, File file, long j) {
        SharedPreferences c08ap;
        SharedPreferences sharedPreferences = this.sSharedPrefsCache.get(file);
        if (sharedPreferences == null) {
            if (j == 0) {
                SystemClock.uptimeMillis();
            }
            synchronized (file) {
                try {
                    c08ap = this.sSharedPrefsCache.get(file);
                    if (c08ap == null) {
                        c08ap = new C08AP(str, file);
                        this.sSharedPrefsCache.put(file, c08ap);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return c08ap;
        }
        return sharedPreferences;
    }
}
