package com.ss.android.legoimpl;

import X.C08Q0;
import X.C0CCZ;
import X.C0VZ0;
import X.C1223504qX;
import X.C1225404qq;
import X.C557050Lt1;
import X.C823050WQl;
import X.C848140XOy;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import Y.ARunnableS103S0100000_3;
import Y.ARunnableS83S0000000_3;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.AppBuildConfig;
import com.bytedance.librarian.Librarian;
import com.bytedance.librarian.LibrarianMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes35.dex */
@InterfaceC20234614Fk
public class LibrarianTask implements C0CCZ {
    public static final C557050Lt1 LLILLJJLI = new C557050Lt1(false);
    public final AppBuildConfig LL = C848140XOy.LIZ.LIZ;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "LibrarianTask";
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
        LIZ(context, this.LL);
    }

    public static void LIZ(final Context context, AppBuildConfig appBuildConfig) {
        synchronized (LibrarianTask.class) {
            try {
                if (LLILLJJLI.LIZ(false, true)) {
                    appBuildConfig.LJIIIIZZ();
                    Librarian.LJ(context, "46.0.1", C1225404qq.LIZ(), C1223504qX.LIZ(), new LibrarianMonitor(context) { // from class: X.145u
                        @Override // com.bytedance.librarian.LibrarianMonitor
                        public final void LIZ(String str) {
                            C202098145w c202098145wLIZ = C08TN.LIZ();
                            if (!c202098145wLIZ.LJJJJZ && !((ConcurrentHashMap) c202098145wLIZ.LJ).containsKey(str)) {
                                Map<String, Long> map = c202098145wLIZ.LJJIII;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("coordinate:");
                                sbLIZ.append(str);
                                ((ConcurrentHashMap) map).put(C2188811AlT.LIZIZ(sbLIZ), Long.valueOf(SystemClock.uptimeMillis() - C202094145s.LJIILL));
                                Map<String, Long> map2 = c202098145wLIZ.LJ;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("(cpu)");
                                sbLIZ2.append(str);
                                ((ConcurrentHashMap) map2).put(C2188811AlT.LIZIZ(sbLIZ2), Long.valueOf(SystemClock.currentThreadTimeMillis()));
                                ((ConcurrentHashMap) c202098145wLIZ.LJ).put(str, Long.valueOf(SystemClock.uptimeMillis()));
                            }
                            TextUtils.isEmpty(str);
                            System.loadLibrary(str);
                            TextUtils.isEmpty(str);
                            C202098145w c202098145wLIZ2 = C08TN.LIZ();
                            if (!c202098145wLIZ2.LJJJJZ && ((ConcurrentHashMap) c202098145wLIZ2.LJ).containsKey(str)) {
                                Map<String, Long> map3 = c202098145wLIZ2.LJ;
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("(cpu)");
                                sbLIZ3.append(str);
                                Long l = (Long) ((ConcurrentHashMap) map3).get(C2188811AlT.LIZIZ(sbLIZ3));
                                if (l != null) {
                                    Map<String, Long> map4 = c202098145wLIZ2.LJJIII;
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("(cpu)");
                                    sbLIZ4.append(str);
                                    if (((ConcurrentHashMap) map4).get(C2188811AlT.LIZIZ(sbLIZ4)) == null) {
                                        Map<String, Long> map5 = c202098145wLIZ2.LJJIII;
                                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                        sbLIZ5.append("(cpu)");
                                        sbLIZ5.append(str);
                                        ((ConcurrentHashMap) map5).put(C2188811AlT.LIZIZ(sbLIZ5), Long.valueOf(SystemClock.currentThreadTimeMillis() - l.longValue()));
                                    }
                                }
                                Long l2 = (Long) ((ConcurrentHashMap) c202098145wLIZ2.LJ).get(str);
                                if (l2 != null && ((ConcurrentHashMap) c202098145wLIZ2.LJJIII).get(str) == null) {
                                    ((ConcurrentHashMap) c202098145wLIZ2.LJJIII).put(str, Long.valueOf(SystemClock.uptimeMillis() - l2.longValue()));
                                }
                            }
                        }
                    });
                    if (C08Q0.LIZIZ(context, 0, "fix_librarian_empty_apks") == 1) {
                        C823050WQl.LIZLLL().execute(new ARunnableS83S0000000_3(9));
                    }
                    C823050WQl.LIZLLL().execute(new ARunnableS103S0100000_3(context, 25));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
