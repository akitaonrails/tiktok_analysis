package com.ss.android.ugc.aweme.legoimpl.service;

import X.C098200Yq;
import X.C0CCZ;
import X.C0VZ0;
import X.C0W9I;
import X.C1514430pVp;
import X.C189200o6;
import X.C202094145s;
import X.C202120146s;
import X.C2124808Uc;
import X.C2188811AlT;
import X.C260540AIy;
import X.C260550AIz;
import X.C278650Aw3;
import X.C786410Ut5;
import X.C793770VBv;
import X.C813020Vuu;
import X.C844300XAe;
import X.EnumC202118146q;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.EnumC846610XJb;
import X.FileObserverC202119146r;
import android.content.Context;
import android.os.FileObserver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.legoimpl.service.Dex2OatTask;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.AwS64S0001000_30;
import kotlin.jvm.internal.AwS65S0010000_30;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class Dex2OatTask implements C0CCZ {
    public static FileObserverC202119146r LLILLL;
    public FileObserverC202119146r LL;
    public boolean LLILLJJLI;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "Dex2OatTask";
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
        return C1514430pVp.LIZLLL().booleanValue() ? EnumC799870VZh.BOOT_FINISH : EnumC799870VZh.APP_BACKGROUND;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0100, code lost:
    
        if (((java.lang.Number) r3.getValue()).intValue() >= r6) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(android.content.Context r9) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoimpl.service.Dex2OatTask.LIZ(android.content.Context):boolean");
    }

    public static void LJ(Context context) throws JSONException {
        Object c098200Yq;
        C202120146s.LIZIZ(new AwS65S0010000_30(0));
        C202120146s.LIZJ(EnumC202118146q.SUCCESS.getCode());
        C202120146s.LIZIZ(new AwS64S0001000_30(EnumC846610XJb.ORIGIN.getCode(), 2));
        C844300XAe.LIZ.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            String str = C844300XAe.LIZIZ;
            if (str != null) {
                C813020Vuu.LJIIL().LJIIJJI(context, "aot_release_build_version", C0W9I.LIZIZ(context).LIZ("release_build", "default_version"));
                Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeLong("key_dex2oat_execute_timestamp", System.currentTimeMillis());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cmd package compile -m everything-profile -f ");
                sbLIZ.append(str);
                Process processExec = Runtime.getRuntime().exec(C2188811AlT.LIZIZ(sbLIZ));
                processExec.waitFor();
                int iExitValue = processExec.exitValue();
                C202120146s.LIZIZ(new AwS64S0001000_30(iExitValue, 1));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("exec original command , result is ");
                sbLIZ2.append(iExitValue);
                c098200Yq = Integer.valueOf(Log.d("Dex2OatCmd", C2188811AlT.LIZIZ(sbLIZ2)));
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 >= 100) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cost", jCurrentTimeMillis2);
            C793770VBv.LJII("force_dex2oat_report", jSONObject, null, null);
        }
        if (((Boolean) C260540AIy.LIZ.getValue()).booleanValue()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("cost", jCurrentTimeMillis2);
            jSONObject2.put("trigger_duration", SystemClock.elapsedRealtime() - C202094145s.LIZIZ);
            AppLogNewUtils.onEventV3("force_dex2oat_report", jSONObject2);
        }
        C202120146s.LIZJ(EnumC202118146q.SUCCESS_AND_BE_MONITORED.getCode());
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.146r, android.os.FileObserver] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.146r, android.os.FileObserver] */
    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        Object c098200Yq;
        C202120146s.LIZIZ(new AwS65S0010000_30(1));
        if (context != null && !this.LLILLJJLI && LLILLL == null && this.LL == null) {
            try {
                if (!LIZ(context)) {
                    return;
                }
                C844300XAe.LIZ.getClass();
                C844300XAe.LIZIZ = context.getPackageName();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("/data/misc/profiles/cur/0/");
                sbLIZ.append(context.getPackageName());
                sbLIZ.append("/primary.prof");
                final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (!TextUtils.isEmpty(strLIZIZ)) {
                    C202120146s.LIZJ(EnumC202118146q.PROFILE_ON_EVENT.getCode());
                    if (((Boolean) C260550AIz.LIZ.getValue()).booleanValue()) {
                        final Context contextN3 = C786410Ut5.N3(context);
                        ?? r1 = new FileObserver(contextN3, strLIZIZ) { // from class: X.146r
                            public final Context LIZ;

                            @Override // android.os.FileObserver
                            public final void onEvent(int i, String str) {
                                if (i == 2) {
                                    C202120146s.LIZJ(EnumC202118146q.WAIT_FOR_DELAY_TIME.getCode());
                                    Dex2OatTask dex2OatTask = this.LIZIZ;
                                    if (!dex2OatTask.LLILLJJLI) {
                                        dex2OatTask.LLILLJJLI = true;
                                        try {
                                            stopWatching();
                                            Dex2OatTask.LLILLL = null;
                                            this.LIZIZ.LL = null;
                                            Dex2OatTask.LJ(this.LIZ);
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                        }
                                    }
                                }
                            }

                            {
                                super(strLIZIZ);
                                this.LIZ = contextN3;
                            }
                        };
                        LLILLL = r1;
                        r1.startWatching();
                    } else {
                        final Context contextN32 = C786410Ut5.N3(context);
                        ?? r12 = new FileObserver(contextN32, strLIZIZ) { // from class: X.146r
                            public final Context LIZ;

                            @Override // android.os.FileObserver
                            public final void onEvent(int i, String str) {
                                if (i == 2) {
                                    C202120146s.LIZJ(EnumC202118146q.WAIT_FOR_DELAY_TIME.getCode());
                                    Dex2OatTask dex2OatTask = this.LIZIZ;
                                    if (!dex2OatTask.LLILLJJLI) {
                                        dex2OatTask.LLILLJJLI = true;
                                        try {
                                            stopWatching();
                                            Dex2OatTask.LLILLL = null;
                                            this.LIZIZ.LL = null;
                                            Dex2OatTask.LJ(this.LIZ);
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                        }
                                    }
                                }
                            }

                            {
                                super(strLIZIZ);
                                this.LIZ = contextN32;
                            }
                        };
                        this.LL = r12;
                        r12.startWatching();
                    }
                    if (C278650Aw3.LIZ()) {
                        C2124808Uc.LIZ(context, new Executor() { // from class: X.146w
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, C2124808Uc.LIZ);
                    }
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
    }
}
