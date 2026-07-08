package com.ss.android.ugc.aweme.dynamicfeature;

import X.C0CCZ;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.RunnableC823120WQs;
import android.app.Application;
import android.content.Context;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class AddInstalledModulesInfoTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AddInstalledModulesInfoTask";
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
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(final Context context) {
        RunnableC823120WQs.LIZIZ(new Runnable() { // from class: X.08Od
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AddInstalledModulesInfoTask@2f63.run$1");
                try {
                    final Context context2 = context;
                    Npth.addAttachUserData(new AttachUserData() { // from class: X.08Oc
                        public static File LIZ(Context context3) throws Throwable {
                            File file = C786450Ut9.LIZJ;
                            if (file != null && C786450Ut9.LJ) {
                                return file;
                            }
                            try {
                                C786450Ut9.LIZJ = context3.getFilesDir();
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

                        @Override // com.bytedance.crash.AttachUserData
                        public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                            ArrayList<String> arrayList;
                            boolean z;
                            Iterable<String> iterableLJLIIL;
                            boolean z2;
                            boolean z3;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                String string = C786410Ut5.V3(context2.getPackageManager(), context2.getPackageName(), 128).metaData.getString("com.tiktok.dynamic.apk.fused.modules");
                                if (string == null || string.length() == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (!z2) {
                                    for (String str : a0.LJJLIIIJILLIZJL(string, new String[]{","}, 0, 6)) {
                                        if (str.length() <= 0) {
                                            z3 = false;
                                        } else {
                                            z3 = true;
                                        }
                                        if (z3) {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append(str);
                                            sbLIZ.append(" : fused");
                                            arrayList2.add(C2188811AlT.LIZIZ(sbLIZ));
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("error-fused : ");
                                sbLIZ2.append(th.getMessage());
                                arrayList2.add(C2188811AlT.LIZIZ(sbLIZ2));
                            }
                            try {
                                String[] strArr = C786410Ut5.Y3(context2.getPackageManager(), context2.getPackageName(), 0).splitNames;
                                if (strArr == null || (iterableLJLIIL = C13LQ.LJLIIL(strArr)) == null) {
                                    iterableLJLIIL = C08CX.INSTANCE;
                                }
                                for (String str2 : iterableLJLIIL) {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append(str2);
                                    sbLIZ3.append(" : install-time");
                                    arrayList2.add(C2188811AlT.LIZIZ(sbLIZ3));
                                }
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("error-install-time : ");
                                sbLIZ4.append(th2.getMessage());
                                arrayList2.add(C2188811AlT.LIZIZ(sbLIZ4));
                            }
                            List<String> listLJFF = null;
                            try {
                                C844470XAv.LIZ.getClass();
                                long jLJ = C844470XAv.LJ();
                                File fileLIZ = LIZ(context2);
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("splitcompat/");
                                sbLIZ5.append(jLJ);
                                sbLIZ5.append("/verified-splits");
                                C0VSJ c0vsj = new C0VSJ(fileLIZ, C2188811AlT.LIZIZ(sbLIZ5));
                                if (c0vsj.exists() && c0vsj.isDirectory()) {
                                    File[] fileArrListFiles = c0vsj.listFiles();
                                    if (fileArrListFiles != null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (File file : fileArrListFiles) {
                                            if (!file.isFile() || !Intrinsics.LJFF(C08QA.LJIJ(file), "apk")) {
                                                z = false;
                                            } else {
                                                z = true;
                                            }
                                            if (z) {
                                                arrayList3.add(file);
                                            }
                                        }
                                        arrayList = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                                        Iterator it2 = arrayList3.iterator();
                                        while (it2.hasNext()) {
                                            arrayList.add(C08QA.LJIJI((File) it2.next()));
                                        }
                                    } else {
                                        arrayList = null;
                                    }
                                    if (arrayList != null) {
                                        for (String str3 : arrayList) {
                                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                            sbLIZ6.append(str3);
                                            sbLIZ6.append(" : on-demand");
                                            arrayList2.add(C2188811AlT.LIZIZ(sbLIZ6));
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                TryCatchGuardChecker.doCheck(th3);
                                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                sbLIZ7.append("error-on-demand : ");
                                sbLIZ7.append(th3.getMessage());
                                arrayList2.add(C2188811AlT.LIZIZ(sbLIZ7));
                            }
                            try {
                                IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
                                if (iPluginService != null) {
                                    listLJFF = iPluginService.LJFF();
                                }
                                if (listLJFF != null) {
                                    for (String str4 : listLJFF) {
                                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                        sbLIZ8.append(str4);
                                        sbLIZ8.append(" : plugin");
                                        arrayList2.add(C2188811AlT.LIZIZ(sbLIZ8));
                                    }
                                }
                            } catch (Throwable th4) {
                                TryCatchGuardChecker.doCheck(th4);
                                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                sbLIZ9.append("error-morpheus : ");
                                sbLIZ9.append(th4.getMessage());
                                arrayList2.add(C2188811AlT.LIZIZ(sbLIZ9));
                            }
                            return C2097908Jt.LIZJ(new Pair("Installed_Dynamic_Features", C13LP.LJJLIIIJ(arrayList2, "\n", null, null, 0, null, null, 62)));
                        }
                    }, CrashType.ALL);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AddInstalledModulesInfoTask@2f63.run$1");
            }
        });
    }
}
