package com.ss.android.legoimpl;

import X.C08RN;
import X.C0CCZ;
import X.C0VZ0;
import X.C1304550k3J;
import X.C2188811AlT;
import X.C2418109dj;
import X.C2421309eF;
import X.C2421409eG;
import X.C2421609eI;
import X.C2421709eJ;
import X.C2422509eR;
import X.C786410Ut5;
import X.C786450Ut9;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class DecompressTask implements C0CCZ {
    public static volatile boolean LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "DecompressTask";
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
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    public static File LIZ(Context context) throws Throwable {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.09di] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void LJ(final Application application) {
        if (!LL) {
            synchronized (DecompressTask.class) {
                try {
                    if (!LL) {
                        int i = 3;
                        int i2 = 3;
                        while (LIZ(C786410Ut5.M3(application)) == null) {
                            int i3 = i2 - 1;
                            if (i2 <= 0) {
                                break;
                            }
                            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("ZOIN", "null files dir");
                            i2 = i3;
                        }
                        C2421309eF.LIZ.LIZIZ(application, new C2418109dj() { // from class: X.09di
                            public static File LJII(Context context) throws Throwable {
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

                            @Override // X.C2418109dj
                            public final void LIZ(String str) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("decompress end ");
                                sbLIZ.append(str);
                                LJFF(C2188811AlT.LIZIZ(sbLIZ));
                            }

                            @Override // X.C2418109dj
                            public final void LIZIZ(String str) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("decompress start ");
                                sbLIZ.append(str);
                                LJFF(C2188811AlT.LIZIZ(sbLIZ));
                                try {
                                    if (LJII(C786410Ut5.M3(application)).getUsableSpace() < C0C64.LJIILLIIL().LJIJ(31744, 120, "enable_decode_try_force_clean", false) * 1024 * 1024) {
                                        C2426709f7.LIZIZ(C786410Ut5.M3(application));
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }

                            @Override // X.C2418109dj
                            public final void LJFF(String str) {
                                super.LJFF(str);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("zoin log ");
                                sbLIZ.append(str);
                                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("ZOIN", C2188811AlT.LIZIZ(sbLIZ));
                            }

                            @Override // X.C2418109dj
                            public final void LJI(String str, Map map) {
                                int iIntValue;
                                long freeSpace;
                                Object obj;
                                super.LJI(str, map);
                                if (C2162308dZ.LJI(C786410Ut5.M3(application))) {
                                    try {
                                        JSONObject jSONObject = new JSONObject(map);
                                        JSONObject jSONObject2 = new JSONObject();
                                        try {
                                            jSONObject2.put("lib_decode_duration", jSONObject.get("lib_decode_duration"));
                                            jSONObject.remove("lib_decode_duration");
                                        } catch (JSONException e) {
                                            TryCatchGuardChecker.doCheck(e);
                                        }
                                        try {
                                            jSONObject2.put("lib_install_duration", jSONObject.get("lib_install_duration"));
                                            jSONObject.remove("lib_install_duration");
                                        } catch (JSONException e2) {
                                            TryCatchGuardChecker.doCheck(e2);
                                        }
                                        try {
                                            jSONObject2.put("lib_init_duration", jSONObject.get("lib_init_duration"));
                                            jSONObject.remove("lib_init_duration");
                                        } catch (JSONException e3) {
                                            TryCatchGuardChecker.doCheck(e3);
                                        }
                                        try {
                                            jSONObject2.put("lib_lock_duration", jSONObject.get("lib_lock_duration"));
                                            jSONObject.remove("lib_lock_duration");
                                        } catch (JSONException e4) {
                                            TryCatchGuardChecker.doCheck(e4);
                                        }
                                        try {
                                            obj = jSONObject.get("key_status");
                                            jSONObject2.put("key_status", obj);
                                            jSONObject.remove("key_status");
                                        } catch (Exception e5) {
                                            TryCatchGuardChecker.doCheck(e5);
                                        }
                                        if (obj != null) {
                                            iIntValue = ((Integer) obj).intValue();
                                        } else {
                                            iIntValue = 0;
                                        }
                                        try {
                                            jSONObject2.put("key_decode_status", jSONObject.get("key_decode_status"));
                                            jSONObject.remove("key_decode_status");
                                        } catch (JSONException e6) {
                                            TryCatchGuardChecker.doCheck(e6);
                                        }
                                        try {
                                            jSONObject2.put("is_first_load", jSONObject.get("is_first_load"));
                                            jSONObject.remove("is_first_load");
                                        } catch (JSONException e7) {
                                            TryCatchGuardChecker.doCheck(e7);
                                        }
                                        try {
                                            jSONObject2.put("lib_from_dlopen", jSONObject.get("lib_from_dlopen"));
                                            jSONObject.remove("lib_from_dlopen");
                                        } catch (JSONException e8) {
                                            TryCatchGuardChecker.doCheck(e8);
                                        }
                                        try {
                                            jSONObject2.put("duration", jSONObject.get("duration"));
                                            jSONObject.remove("duration");
                                        } catch (JSONException e9) {
                                            TryCatchGuardChecker.doCheck(e9);
                                        }
                                        try {
                                            jSONObject2.put("lib_name_from_dlopen", jSONObject.get("lib_name_from_dlopen"));
                                            jSONObject.remove("lib_name_from_dlopen");
                                        } catch (JSONException e10) {
                                            TryCatchGuardChecker.doCheck(e10);
                                        }
                                        C793770VBv.LJ("zoin_so_load", jSONObject2);
                                        if (iIntValue != 0) {
                                            File fileLJII = LJII(C786410Ut5.M3(application));
                                            if (fileLJII != null) {
                                                freeSpace = (fileLJII.getFreeSpace() / 1024) / 1024;
                                            } else {
                                                freeSpace = 0;
                                            }
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("decode failed freeSpace:");
                                            sbLIZ.append(freeSpace);
                                            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("ZOIN", C2188811AlT.LIZIZ(sbLIZ));
                                        }
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                    }
                                }
                            }
                        });
                        File fileLIZIZ = C2421709eJ.LIZIZ();
                        while (!fileLIZIZ.exists()) {
                            int i4 = i - 1;
                            if (i <= 0) {
                                break;
                            }
                            fileLIZIZ = C2421709eJ.LIZIZ();
                            i = i4;
                        }
                        C2421609eI c2421609eI = new C2421609eI("media");
                        C2421409eG c2421409eG = C2421309eF.LIZ;
                        c2421409eG.LIZJ(c2421609eI);
                        c2421409eG.LIZJ(new C2421609eI("lynxsuit2"));
                        c2421409eG.LIZJ(new C2421609eI("ttc2pa"));
                        LL = true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C1304550k3J.LIZ = Boolean.valueOf(((Boolean) C2422509eR.LIZ.getValue()).booleanValue());
        if (context != null) {
            LJ((Application) context);
        } else {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("ZOIN", "null context when boot");
        }
    }
}
