package com.ss.android.ugc.aweme.task;

import X.AbstractC202127146z;
import X.AnonymousClass1464;
import X.C04V2;
import X.C0CCZ;
import X.C0CD2;
import X.C0VSJ;
import X.C0VZ0;
import X.C1215404pE;
import X.C1215704pH;
import X.C1220104pz;
import X.C13LP;
import X.C146A;
import X.C146C;
import X.C146T;
import X.C146W;
import X.C146X;
import X.C146Y;
import X.C1608310rxF;
import X.C1C7V;
import X.C202094145s;
import X.C202103146b;
import X.C202110146i;
import X.C2079708Ct;
import X.C2187451AjH;
import X.C307350C2z;
import X.C786410Ut5;
import X.C799570VYd;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC202113146l;
import X.InterfaceC202116146o;
import X.InterfaceC20234614Fk;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.bytedance.keva.Keva;
import com.bytedance.otis.attribution.JarvisDebugConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.experiment.ColdBootAppLogReportConfig;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.launcher.service.task.ITaskParams;
import com.ss.android.ugc.aweme.task.ScalpelBackgroundRunnableMonitorTask;
import com.ss.android.ugc.aweme.task.jarvis.JarvisInitTask;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Consumer;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC20234614Fk
public final class ScalpelBackgroundRunnableMonitorTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ScalpelBackgroundRunnableMonitorTask";
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
        return EnumC799870VZh.MAIN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.1467] */
    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        Application application;
        final boolean z;
        boolean z2;
        C146W c146w;
        ITaskParams iTaskParams = (ITaskParams) PluggableExtentionKt.pluggableSpi$default(ITaskParams.class, false, false, false, 14, null);
        if (iTaskParams != null && (application = iTaskParams.getApplication()) != null) {
            new JarvisInitTask(application).run(context);
            final int iIntValue = ((Number) C0CD2.LJJLIIIJLLLLLLLZ.getValue()).intValue();
            final long jLongValue = ((Number) C0CD2.LJJLIIIJLJLI.getValue()).longValue();
            boolean z3 = true;
            if (iIntValue != -1 && jLongValue != -1) {
                z = true;
            } else {
                z = false;
            }
            if ((((Boolean) C1215404pE.LIZIZ.getValue()).booleanValue() || ((Boolean) C1215704pH.LIZIZ.getValue()).booleanValue()) && !C1220104pz.LIZ()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z || z2) {
                if (C146Y.LIZ == null) {
                    C146Y.LIZ = new ArrayList(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getStringSet("coldboot_sleepthreadnamelist", new HashSet()));
                }
                final Regex regex = new Regex(C13LP.LJJLIIIJ(C146Y.LIZ, "|", null, null, 0, null, AFwS274S0000000_30.get$arr$(225), 30));
                if (C146Y.LIZIZ == null) {
                    C146Y.LIZIZ = new ArrayList(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getStringSet("coldboot_non_sleeprunnablenamelist", new HashSet()));
                }
                final Regex regex2 = new Regex(C13LP.LJJLIIIJ(C146Y.LIZIZ, "|", null, null, 0, null, AFwS274S0000000_30.get$arr$(224), 30));
                C1C7V.LIZLLL = true;
                C1C7V.LJ = new InterfaceC202113146l() { // from class: X.146S
                    @Override // X.InterfaceC202113146l
                    public final void LIZ(String str) {
                    }

                    @Override // X.InterfaceC202113146l
                    public final void LIZIZ(String str) {
                        try {
                            if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                                return;
                            }
                            if (C0CFK.LIZ) {
                                if ((!C1220104pz.LIZ() || !((Boolean) C2184831Af3.LIZLLL.getValue()).booleanValue()) && ((Boolean) C1867920yhy.LIZLLL.getValue()).booleanValue() && str != null && str.length() > 0 && C19297110eX.LIZJ(C786410Ut5.u3().getName(), str)) {
                                    C19297110eX.LIZLLL(str);
                                    return;
                                }
                                return;
                            }
                            if (z && !C0CN5.LJII()) {
                                int i = iIntValue;
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i != 3) {
                                            if (i != 4) {
                                                if (i != 5 || C08TN.LIZ().LJJJJZI.ordinal() >= EnumC1609850rzj.FEED_TOTAL.ordinal()) {
                                                    return;
                                                }
                                            } else {
                                                C202098145w c202098145wLIZ = C08TN.LIZ();
                                                if (c202098145wLIZ.LJJJJZI.ordinal() < EnumC1609850rzj.MAIN_CREATE.ordinal() || c202098145wLIZ.LJJJJZI.ordinal() > EnumC1609850rzj.BOOT_PLAY.ordinal()) {
                                                    return;
                                                }
                                            }
                                        } else if (C08TN.LIZ().LJJJJZI.ordinal() != EnumC1609850rzj.MAIN_CREATE.ordinal() && !C08TN.LIZ().LJIILJJIL()) {
                                            return;
                                        }
                                    } else if (!C08TN.LIZ().LJIILJJIL()) {
                                        return;
                                    }
                                } else if (C08TN.LIZ().LJJJJZI.ordinal() != EnumC1609850rzj.MAIN_CREATE.ordinal()) {
                                    return;
                                }
                                if (regex.containsMatchIn(C786410Ut5.u3().getName())) {
                                    if (str != null && regex2.containsMatchIn(str)) {
                                        return;
                                    }
                                    ScalpelBackgroundRunnableMonitorTask scalpelBackgroundRunnableMonitorTask = this;
                                    long j = jLongValue;
                                    scalpelBackgroundRunnableMonitorTask.getClass();
                                    Thread.sleep(j);
                                }
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                };
            }
            if (C146C.LIZ && C146C.LIZJ) {
                C146X c146x = new C146X();
                c146x.LIZ = C1608310rxF.LIZ;
                c146x.LIZIZ = 30000L;
                C2187451AjH.LJIIJ();
                C307350C2z.LIZ().LJIIJJI();
                c146x.LIZJ = true;
                c146x.LIZLLL = true;
                JarvisDebugConfig jarvisDebugConfig = (JarvisDebugConfig) C2079708Ct.LIZIZ.getValue();
                boolean z4 = C202110146i.LJII;
                c146x.LJ = z4 ? 1 : 0;
                if (jarvisDebugConfig != null) {
                    c146w = C146W.LJI;
                    c146w.LJ = jarvisDebugConfig;
                    c146w.LJFF = z4 ? 1 : 0;
                } else {
                    c146w = new C146W(c146x.LIZ, c146x.LIZIZ, c146x.LIZJ, c146x.LIZLLL, c146x.LJ);
                }
                C146T.LIZIZ = c146w;
                if ((c146w.LIZ & 1) == 0) {
                    z3 = false;
                }
                C1C7V.LIZJ = z3;
                C146T.LIZJ = new InterfaceC202116146o() { // from class: X.146V
                    @Override // X.InterfaceC202116146o
                    public final float LIZ() {
                        float f = C0VXC.LJ;
                        if (f <= 0.0f) {
                            return 60.0f;
                        }
                        return f;
                    }

                    @Override // X.InterfaceC202116146o
                    public final int LIZJ(String str) {
                        Keva repo = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("attribution_stage_count_");
                        sbLIZ.append(str);
                        return repo.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
                    }

                    @Override // X.InterfaceC202116146o
                    public final void LIZIZ(int i, String str) {
                        Keva repo = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("attribution_stage_count_");
                        sbLIZ.append(str);
                        repo.storeInt(C2188811AlT.LIZIZ(sbLIZ), i);
                    }
                };
                boolean z5 = C2079708Ct.LIZJ;
                if (z5) {
                    File externalFilesDir = application.getExternalFilesDir(null);
                    if (externalFilesDir == null && (externalFilesDir = application.getExternalCacheDir()) == null) {
                        externalFilesDir = application.getCacheDir();
                    }
                    C0VSJ c0vsj = new C0VSJ(externalFilesDir, "attribution");
                    c0vsj.mkdirs();
                    C146T.LJ = c0vsj;
                } else {
                    C146T.LJ = application.getFilesDir();
                }
                C146A c146aLIZ = C202103146b.LIZ(0, "feed_total");
                c146aLIZ.LIZLLL(new AbstractC202127146z() { // from class: X.1467
                    @Override // X.AbstractC202127146z
                    public final void LIZ(ConcurrentLinkedQueue concurrentLinkedQueue) throws JSONException {
                        n nVar;
                        if (C2079708Ct.LIZJ) {
                            this.LIZ.getClass();
                            if (Build.VERSION.SDK_INT < 24) {
                                nVar = new n();
                            } else {
                                nVar = new n();
                                try {
                                    HashMap map = new HashMap();
                                    Iterator it2 = concurrentLinkedQueue.iterator();
                                    while (it2.hasNext()) {
                                        C1869680yko c1869680yko = (C1869680yko) it2.next();
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append('(');
                                        String strSubstring = c1869680yko.LIZIZ;
                                        int length = strSubstring.length() - 1;
                                        while (true) {
                                            if (-1 >= length) {
                                                break;
                                            }
                                            if (!Character.isDigit(strSubstring.charAt(length))) {
                                                strSubstring = strSubstring.substring(0, length + 1);
                                                break;
                                            }
                                            length--;
                                        }
                                        sbLIZ.append(strSubstring);
                                        sbLIZ.append(')');
                                        sbLIZ.append(c1869680yko.LIZ);
                                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                        Integer num = (Integer) map.get(strLIZIZ);
                                        if (num == null) {
                                            map.put(strLIZIZ, Integer.valueOf(c1869680yko.LJ));
                                        } else {
                                            map.put(strLIZIZ, Integer.valueOf(c1869680yko.LJ + num.intValue()));
                                        }
                                    }
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    for (Map.Entry entry : map.entrySet()) {
                                        linkedHashMap.put((String) entry.getKey(), Integer.valueOf(((Number) entry.getValue()).intValue()));
                                    }
                                    final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    linkedHashMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(new Consumer() { // from class: X.0XFA
                                        @Override // java.util.function.Consumer
                                        public final void accept(Object obj) {
                                            Map.Entry entry2 = (Map.Entry) obj;
                                            linkedHashMap2.put((String) entry2.getKey(), (Integer) entry2.getValue());
                                        }
                                    });
                                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                                        nVar.LJJIII(Integer.valueOf(((Number) entry2.getValue()).intValue()), (String) entry2.getKey());
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }
                            Keva.getRepo("attribution_runnable").storeString("data", nVar.toString());
                        }
                        ColdBootAppLogReportConfig coldBootAppLogReportConfig = (ColdBootAppLogReportConfig) AnonymousClass1463.LIZIZ.getValue();
                        if (coldBootAppLogReportConfig != null && coldBootAppLogReportConfig.enable) {
                            JSONObject jSONObject = new JSONObject();
                            Iterator it3 = concurrentLinkedQueue.iterator();
                            while (it3.hasNext()) {
                                C1869680yko c1869680yko2 = (C1869680yko) it3.next();
                                for (String str : coldBootAppLogReportConfig.runableList) {
                                    String strReplace = new Regex("[^a-zA-Z0-9_]").replace(c1869680yko2.LIZ, "");
                                    if (Intrinsics.LJFF(str, c1869680yko2.LIZ)) {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append(strReplace);
                                        sbLIZ2.append("_cost");
                                        jSONObject.put(C2188811AlT.LIZIZ(sbLIZ2), c1869680yko2.LJ);
                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                        sbLIZ3.append(strReplace);
                                        sbLIZ3.append("_start_time");
                                        jSONObject.put(C2188811AlT.LIZIZ(sbLIZ3), c1869680yko2.LIZLLL);
                                    }
                                }
                            }
                            if (jSONObject.length() > 0) {
                                AppLogNewUtils.onEventV3("perf_cold_boot_runnable_info", jSONObject);
                            }
                        }
                    }

                    @Override // X.AbstractC202127146z
                    public final String LIZIZ(String str) {
                        if (((Boolean) C1150504el.LIZ().LJJIJIIJI.getValue()).booleanValue()) {
                            return "cold_boot_launch_background";
                        }
                        return str;
                    }
                });
                c146aLIZ.bm(C202094145s.LJIIIIZZ);
                c146aLIZ.LIZIZ(0.25f);
                C1C7V.LJFF = z5;
                C786410Ut5.LJLIIL(100L, C799570VYd.LIZIZ(), new Runnable() { // from class: X.146U
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("ScalpelBackgroundRunnableMonitorTask@bfd1.run$1$4");
                        try {
                            C146T.LIZ.LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("ScalpelBackgroundRunnableMonitorTask@bfd1.run$1$4");
                    }
                });
                AnonymousClass1464.LIZ().LJ = ((Boolean) C04V2.LIZ.getValue()).booleanValue();
            }
        }
    }
}
