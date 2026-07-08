package com.ss.android.ugc.aweme.legoImp.task;

import X.C08N2;
import X.C0CCZ;
import X.C0VSJ;
import X.C0VZ0;
import X.C10EU;
import X.C202077145b;
import X.C202078145c;
import X.C202079145d;
import X.C202080145e;
import X.C202083145h;
import X.C202084145i;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C794210VDn;
import X.C795800VJq;
import X.C844470XAv;
import X.C890330YwJ;
import X.C890510Ywb;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import Y.ARunnableS4S0001000_13;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes31.dex */
public class ProfileEditorTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ProfileEditorTask";
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

    public static int LIZ() throws Throwable {
        int i;
        int i2;
        C202080145e c202080145e;
        BufferedWriter bufferedWriter;
        IMChatListApi.LJJIII.getClass();
        C890510Ywb c890510YwbLJIJJLI = C890330YwJ.LIZ().LJIJJLI();
        if (!c890510YwbLJIJJLI.LIZIZ) {
            return 0;
        }
        C202084145i c202084145i = new C202084145i();
        c202084145i.LIZ = "tiktok_profile";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str = "";
        sbLIZ.append("");
        C844470XAv.LIZ.getClass();
        sbLIZ.append(C844470XAv.LIZLLL());
        c202084145i.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c202084145i.LIZJ = false;
        C202077145b c202077145b = new C202077145b();
        List<String> listLIZIZ = null;
        c202077145b.LJ = null;
        c202077145b.LIZJ = c202084145i.LIZ;
        c202077145b.LIZLLL = c202084145i.LIZIZ;
        c202077145b.LJFF = c202084145i.LIZJ;
        if (c890510YwbLJIJJLI.LIZIZ) {
            ((ArrayList) c202077145b.LJI).add(C202079145d.LIZ("snapboost_list_inbox.txt"));
        }
        if (!C202079145d.LIZIZ()) {
            return 0;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 != 28 && i3 != 29 && i3 != 30) {
            return 101;
        }
        if (C08N2.LIZ(new C0VSJ(C202078145c.LIZLLL(), c202077145b.LIZ()))) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(new C0VSJ(C202078145c.LIZJ()).getParentFile().getAbsolutePath());
            sbLIZ2.append("/oat/");
            if (C202078145c.LIZIZ == null) {
                try {
                    Method declaredMethod = Class.forName("dalvik.system.VMRuntime").getDeclaredMethod("getCurrentInstructionSet", new Class[0]);
                    declaredMethod.setAccessible(true);
                    C202078145c.LIZIZ = (String) declaredMethod.invoke(null, new Object[0]);
                    str = C202078145c.LIZIZ;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else {
                str = C202078145c.LIZIZ;
            }
            sbLIZ2.append(str);
            sbLIZ2.append("/base.art");
            return new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2)).exists() ? 3 : 4;
        }
        Iterator it2 = ((ArrayList) c202077145b.LIZ).iterator();
        while (true) {
            i = 42;
            if (!it2.hasNext()) {
                break;
            }
            String str2 = (String) it2.next();
            if (str2.endsWith("*")) {
                if (listLIZIZ == null) {
                    listLIZIZ = C202078145c.LIZIZ();
                }
                String strSubstring = str2.substring(0, str2.lastIndexOf(42));
                int i4 = 0;
                for (String str3 : listLIZIZ) {
                    if (str3.startsWith(strSubstring)) {
                        ((HashSet) c202077145b.LIZIZ).add(str3);
                        i4++;
                    }
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("CheckClasses: ");
                sbLIZ3.append(str2);
                sbLIZ3.append(" match ");
                sbLIZ3.append(i4);
                C2188811AlT.LIZIZ(sbLIZ3);
            } else {
                ((HashSet) c202077145b.LIZIZ).add(str2);
            }
        }
        for (C202080145e c202080145e2 : (ArrayList) c202077145b.LJI) {
            if (C202079145d.LIZIZ()) {
                c202080145e2.getClass();
                if ((!new C0VSJ(C202078145c.LIZLLL(), c202080145e2.LIZ).exists()) && C202079145d.LIZIZ()) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    ArrayList<String> arrayList = new ArrayList();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(C202078145c.LIZ().getAssets().open(c202080145e2.LIZ)));
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                arrayList.add(line);
                            } finally {
                                th = th;
                            }
                        }
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("ClassList: process ");
                        sbLIZ4.append(c202080145e2.LIZ);
                        sbLIZ4.append(" from assets");
                        C2188811AlT.LIZIZ(sbLIZ4);
                        bufferedReader.close();
                    } catch (FileNotFoundException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    } catch (IOException e3) {
                        TryCatchGuardChecker.doCheck(e3);
                    }
                    List<String> listLIZIZ2 = null;
                    int i5 = 0;
                    for (String str4 : arrayList) {
                        if (str4.endsWith("*")) {
                            if (listLIZIZ2 == null) {
                                listLIZIZ2 = C202078145c.LIZIZ();
                            }
                            String strSubstring2 = str4.substring(0, str4.lastIndexOf(i));
                            int i6 = 0;
                            for (String str5 : listLIZIZ2) {
                                if (str5.startsWith(strSubstring2)) {
                                    ((ArrayList) c202080145e2.LIZIZ).add(str5);
                                    i5++;
                                    i6++;
                                }
                            }
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("ClassList: process ");
                            sbLIZ5.append(str4);
                            sbLIZ5.append(" match ");
                            sbLIZ5.append(i6);
                            C2188811AlT.LIZIZ(sbLIZ5);
                        } else {
                            ((ArrayList) c202080145e2.LIZIZ).add(str4);
                        }
                        i = 42;
                    }
                    if (((ArrayList) c202080145e2.LIZIZ).isEmpty()) {
                        c202080145e = c202080145e2;
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("ClassList: process ");
                        sbLIZ6.append(arrayList.size());
                        sbLIZ6.append(" line, found ");
                        sbLIZ6.append(((ArrayList) c202080145e2.LIZIZ).size());
                        sbLIZ6.append(e3.h);
                        sbLIZ6.append(i5);
                        sbLIZ6.append("), took ");
                        sbLIZ6.append(System.currentTimeMillis() - jCurrentTimeMillis);
                        sbLIZ6.append("ms, save to ");
                        c202080145e.getClass();
                        sbLIZ6.append(new C0VSJ(C202078145c.LIZLLL(), c202080145e.LIZ).getAbsolutePath());
                        C2188811AlT.LIZIZ(sbLIZ6);
                    } else {
                        try {
                            bufferedWriter = new BufferedWriter(new C794210VDn((File) new C0VSJ(C202078145c.LIZLLL(), c202080145e2.LIZ), false));
                        } catch (IOException e4) {
                            e = e4;
                        }
                        try {
                            Iterator it3 = ((ArrayList) c202080145e2.LIZIZ).iterator();
                            while (it3.hasNext()) {
                                bufferedWriter.write((String) it3.next());
                                bufferedWriter.newLine();
                            }
                            bufferedWriter.close();
                            c202080145e = c202080145e2;
                            StringBuilder sbLIZ62 = C2188811AlT.LIZ();
                            sbLIZ62.append("ClassList: process ");
                            sbLIZ62.append(arrayList.size());
                            sbLIZ62.append(" line, found ");
                            sbLIZ62.append(((ArrayList) c202080145e2.LIZIZ).size());
                            sbLIZ62.append(e3.h);
                            sbLIZ62.append(i5);
                            sbLIZ62.append("), took ");
                            sbLIZ62.append(System.currentTimeMillis() - jCurrentTimeMillis);
                            sbLIZ62.append("ms, save to ");
                            c202080145e.getClass();
                            sbLIZ62.append(new C0VSJ(C202078145c.LIZLLL(), c202080145e.LIZ).getAbsolutePath());
                            C2188811AlT.LIZIZ(sbLIZ62);
                        } catch (Throwable th) {
                            th = th;
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                    while (true) {
                                        try {
                                            TryCatchGuardChecker.doCheck(th);
                                            break;
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    }
                                    if (th != null) {
                                        try {
                                            try {
                                                bufferedWriter.close();
                                            } catch (Throwable th4) {
                                                TryCatchGuardChecker.doCheck(th4);
                                                th.addSuppressed(th4);
                                            }
                                        } catch (IOException e5) {
                                            e = e5;
                                            TryCatchGuardChecker.doCheck(e);
                                            c202080145e = c202080145e2;
                                            StringBuilder sbLIZ622 = C2188811AlT.LIZ();
                                            sbLIZ622.append("ClassList: process ");
                                            sbLIZ622.append(arrayList.size());
                                            sbLIZ622.append(" line, found ");
                                            sbLIZ622.append(((ArrayList) c202080145e2.LIZIZ).size());
                                            sbLIZ622.append(e3.h);
                                            sbLIZ622.append(i5);
                                            sbLIZ622.append("), took ");
                                            sbLIZ622.append(System.currentTimeMillis() - jCurrentTimeMillis);
                                            sbLIZ622.append("ms, save to ");
                                            c202080145e.getClass();
                                            sbLIZ622.append(new C0VSJ(C202078145c.LIZLLL(), c202080145e.LIZ).getAbsolutePath());
                                            C2188811AlT.LIZIZ(sbLIZ622);
                                            c202077145b.LIZIZ.addAll(c202080145e2.LIZ());
                                            i = 42;
                                        }
                                    } else {
                                        bufferedWriter.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                th = null;
                            }
                        }
                    }
                }
            } else {
                c202080145e2.getClass();
            }
            c202077145b.LIZIZ.addAll(c202080145e2.LIZ());
            i = 42;
        }
        if (((HashSet) c202077145b.LIZIZ).isEmpty()) {
            return 5;
        }
        SystemClock.uptimeMillis();
        C0VSJ c0vsj = new C0VSJ(C202078145c.LIZLLL(), c202077145b.LIZ());
        C0VSJ c0vsj2 = new C0VSJ(C202078145c.LIZLLL(), "cart.list");
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new C794210VDn((File) c0vsj2, false));
            try {
                for (String str6 : (HashSet) c202077145b.LIZIZ) {
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("L");
                    sbLIZ7.append(str6.replace('.', '/'));
                    sbLIZ7.append(c202077145b.LJFF ? ";->*" : ";");
                    bufferedWriter2.write(C2188811AlT.LIZIZ(sbLIZ7));
                    bufferedWriter2.newLine();
                }
                bufferedWriter2.flush();
                bufferedWriter2.close();
            } catch (Throwable th6) {
                th = th6;
                try {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    } catch (Throwable th7) {
                        th = th7;
                        th = null;
                        TryCatchGuardChecker.doCheck(th);
                        if (th != null) {
                            try {
                                bufferedWriter2.close();
                            } catch (Throwable th8) {
                                TryCatchGuardChecker.doCheck(th8);
                                th.addSuppressed(th8);
                            }
                        } else {
                            bufferedWriter2.close();
                        }
                        throw th;
                    }
                } catch (Throwable th9) {
                    th = th9;
                }
            }
        } catch (IOException e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        if (C08N2.LIZ(c0vsj2)) {
            if (c202077145b.LJ == null) {
                c202077145b.LJ = C202078145c.LIZ().getPackageCodePath();
            }
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("Target dex: ");
            sbLIZ8.append(c202077145b.LJ);
            C2188811AlT.LIZIZ(sbLIZ8);
            String str7 = c202077145b.LJ;
            if (C08N2.LIZ(c0vsj2) && !TextUtils.isEmpty(str7)) {
                C0VSJ c0vsj3 = new C0VSJ(str7);
                if (c0vsj3.exists()) {
                    C202083145h c202083145h = new C202083145h();
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append("--create-profile-from=");
                    sbLIZ9.append(c0vsj2.toString());
                    ((ArrayList) c202083145h.LIZ).add(C2188811AlT.LIZIZ(sbLIZ9));
                    StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                    sbLIZ10.append("--apk=");
                    sbLIZ10.append(c0vsj3.toString());
                    ((ArrayList) c202083145h.LIZ).add(C2188811AlT.LIZIZ(sbLIZ10));
                    StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                    sbLIZ11.append("--dex-location=");
                    sbLIZ11.append(c0vsj3.getName());
                    ((ArrayList) c202083145h.LIZ).add(C2188811AlT.LIZIZ(sbLIZ11));
                    StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                    sbLIZ12.append("--reference-profile-file=");
                    sbLIZ12.append(c0vsj.toString());
                    ((ArrayList) c202083145h.LIZ).add(C2188811AlT.LIZIZ(sbLIZ12));
                    new Object() { // from class: X.145k
                        public List<String> LIZ;
                    };
                }
            }
            i2 = 103;
        } else {
            i2 = 102;
        }
        SystemClock.uptimeMillis();
        C795800VJq.LIZ.execute(new ARunnableS4S0001000_13(i2, 1));
        return i2;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.APP_BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        int iLIZ;
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            C202079145d.LIZJ(context);
            iLIZ = LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            iLIZ = 0;
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
        if (((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin() && !C10EU.LJIILIIL()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZLLL(jUptimeMillis2, "commit_took");
            c2344009Gk.LIZJ(2, "commit_id");
            c2344009Gk.LIZJ(iLIZ, "commit_result");
            C20684815ws.LJIILLIIL("tool_performance_profile_editor", c2344009Gk.LIZ);
        }
    }
}
