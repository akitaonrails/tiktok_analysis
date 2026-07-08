package com.bytedance.ies.safemode.SmartProtected.state;

import X.C08OH;
import X.C09CT;
import X.C09DE;
import X.C0WZX;
import X.C1BMX;
import X.C1BMY;
import X.C1BN3;
import X.C1BN4;
import X.C1C7U;
import X.C2188811AlT;
import X.C2200381B9w;
import X.C2200391B9x;
import X.C2203541BMa;
import X.C2203571BMd;
import X.C2204961BRm;
import X.C786410Ut5;
import X.C805560Vis;
import Y.ARunnableS134S0100000_34;
import android.app.ActivityManager;
import android.content.Context;
import com.bytedance.ies.safemode.SafeModeReporter;
import com.bytedance.ies.safemode.SmartProtected.state.ExceptionManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class QuietState extends BaseState {
    public volatile int LIZIZ;
    public volatile boolean LIZJ;
    public long LIZLLL;
    public long LJ;
    public volatile long LJFF;
    public volatile boolean LJI;
    public volatile long LJIIIIZZ;
    public ScheduledFuture<?> LJIIIZ;

    @C09CT("curForeQuietTime")
    @C09DE
    public volatile int curForeQuietTime;

    @C09CT("needReportBootProtectedResult")
    @C09DE
    public volatile boolean needReportBootProtectedResult = true;
    public volatile int LJII = -1;

    @Override // X.C1BN4
    public final String getName() {
        return "QuietState";
    }

    public static void LJIIIZ(QuietState quietState) {
        quietState.getClass();
        C1C7U.LIZ("QuietState@7726.onEnterState$1L");
        quietState.LJFF++;
        Context context = quietState.LIZ.LJ;
        Iterator it2 = C2204961BRm.LJII((ActivityManager) C786410Ut5.H2(context, "activity"), new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YtmpO5Tb/ePGxJ+UXBPJeRFBcsF75zoL/ZWDqG7X3H+wKzWdYvbTsNg==", null)).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it2.next();
            if (runningAppProcessInfo.processName.equals(context.getPackageName())) {
                if (runningAppProcessInfo.importance == 100) {
                    quietState.curForeQuietTime++;
                    quietState.LIZ.LJI();
                }
            }
        }
        if (!quietState.LJI) {
            C786410Ut5.j4("smartboot smartEnterTimeStamp: %d maxQuietTime: %d curdiff %d", new Object[]{Long.valueOf(quietState.LJIIIIZZ), Long.valueOf(quietState.LIZLLL), Long.valueOf(System.currentTimeMillis() - quietState.LJIIIIZZ)});
            if (System.currentTimeMillis() - quietState.LJIIIIZZ > quietState.LIZLLL) {
                C2200391B9x.LIZLLL("QuietState", "reach smartboot quiet time");
                quietState.LIZ.LJIIIIZZ();
            }
        } else if (!C2200381B9w.LIZ(quietState.LIZ.LJ)) {
            if (C1BMY.LIZIZ().LIZJ != null) {
                if (quietState.LJFF * 1000 < 60000) {
                    C2200391B9x.LIZLLL("QuietState", "wait bootprtect proccess");
                    C1C7U.LIZIZ("QuietState@7726.onEnterState$1L");
                    return;
                } else {
                    C1BMY c1bmyLIZIZ = C1BMY.LIZIZ();
                    c1bmyLIZIZ.LIZJ = null;
                    c1bmyLIZIZ.LIZLLL = -1;
                }
            } else if (quietState.LJ == 0 || System.currentTimeMillis() - quietState.LJ < 10000) {
                C2200391B9x.LIZLLL("QuietState", "skip dispose boot protected logic");
                C1C7U.LIZIZ("QuietState@7726.onEnterState$1L");
                return;
            }
            C1BMX c1bmxLIZ = C2203541BMa.LIZ();
            if (c1bmxLIZ != null) {
                quietState.LJIIJ(c1bmxLIZ);
            } else {
                SafeModeReporter.CrashInfo crashInfoLIZ = SafeModeReporter.CrashInfo.LIZ(quietState.LJ().LIZLLL());
                int i = quietState.LJII;
                Gson gson = SafeModeReporter.LIZ;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("reachType", i);
                    jSONObject.put("crash", crashInfoLIZ.LIZLLL());
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                SafeModeReporter.LIZLLL("safemode_kill_process_cancel_v2", jSONObject);
                C2200391B9x.LIZLLL("QuietState", "check kill bootprotect process");
                quietState.needReportBootProtectedResult = false;
                quietState.LIZ.LJIIIIZZ();
            }
        } else {
            C2200391B9x.LIZLLL("QuietState", "checking bootprotect process");
            if (quietState.LJFF * 1000 > C2203571BMd.LJIILLIIL.LIZ()) {
                C2200391B9x.LIZIZ("QuietState", "too long wait bootprotect time, so give up");
                quietState.needReportBootProtectedResult = false;
                quietState.LIZ.LJIIIIZZ();
            }
        }
        C1C7U.LIZIZ("QuietState@7726.onEnterState$1L");
    }

    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState
    public final void LJII(C1BN4 c1bn4) throws Throwable {
        if (!this.LIZJ) {
            if (c1bn4 instanceof C1BN3) {
                List<ExceptionManager.ExceptionRecord> listLIZ = LJ().LIZJ.LIZ();
                ExceptionManager.ExceptionRecord exceptionRecordLIZLLL = LJ().LIZLLL();
                if (listLIZ != null && listLIZ.size() != 0) {
                    if (this.LJI) {
                        if (this.needReportBootProtectedResult) {
                            Context context = this.LIZ.LJ;
                            SafeModeReporter.CrashInfo[] crashInfoArrLIZJ = SafeModeReporter.CrashInfo.LIZJ(listLIZ);
                            long j = this.curForeQuietTime;
                            int i = this.LJII;
                            Gson gson = SafeModeReporter.LIZ;
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("reachType", i);
                                jSONObject.put("realUseTime", j * 1000);
                                if (crashInfoArrLIZJ != null) {
                                    jSONObject.put("crash_times", crashInfoArrLIZJ.length);
                                    jSONObject.put("crashs", GsonProtectorUtils.toJson(SafeModeReporter.LIZ, crashInfoArrLIZJ));
                                }
                                SafeModeReporter.LIZIZ(context, jSONObject);
                            } catch (JSONException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            SafeModeReporter.LIZLLL("safemode_protect_success_v2_2", jSONObject);
                            this.LIZ.getClass();
                            if (exceptionRecordLIZLLL != null) {
                                SafeModeReporter.LJFF("reportProtectSuccessV22", exceptionRecordLIZLLL, "LOG_TYPE_SMART_PROTECTOR_SUCCESSFUL_EXCEPTION");
                            }
                        }
                    } else {
                        Context context2 = this.LIZ.LJ;
                        SafeModeReporter.CrashInfo[] crashInfoArrLIZJ2 = SafeModeReporter.CrashInfo.LIZJ(listLIZ);
                        int i2 = this.curForeQuietTime;
                        Gson gson2 = SafeModeReporter.LIZ;
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("realUseTime", i2 * LSPassThroughRecordSizeConfig.DEFAULT);
                            if (crashInfoArrLIZJ2 != null) {
                                jSONObject2.put("crash_times", crashInfoArrLIZJ2.length);
                                jSONObject2.put("crashs", GsonProtectorUtils.toJson(SafeModeReporter.LIZ, crashInfoArrLIZJ2));
                            }
                            SafeModeReporter.LIZIZ(context2, jSONObject2);
                        } catch (JSONException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        SafeModeReporter.LIZLLL("safemode_roll_back_protect_success_2", jSONObject2);
                        this.LIZ.getClass();
                        if (exceptionRecordLIZLLL != null) {
                            SafeModeReporter.LJFF("reportRollBackStartSuccess2", exceptionRecordLIZLLL, "LOG_TYPE_SMART_PROTECTOR_SUCCESSFUL_EXCEPTION");
                        }
                    }
                } else if (this.LJI) {
                    if (this.needReportBootProtectedResult) {
                        Context context3 = this.LIZ.LJ;
                        long j2 = this.curForeQuietTime;
                        int i3 = this.LJII;
                        Gson gson3 = SafeModeReporter.LIZ;
                        JSONObject jSONObject3 = new JSONObject();
                        try {
                            jSONObject3.put("reachType", i3);
                            jSONObject3.put("realUseTime", j2 * 1000);
                            SafeModeReporter.LIZIZ(context3, jSONObject3);
                        } catch (JSONException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                        }
                        SafeModeReporter.LIZLLL("safemode_protect_success_v2_1", jSONObject3);
                        this.LIZ.getClass();
                        if (exceptionRecordLIZLLL != null) {
                            SafeModeReporter.LJFF("reportProtectSuccessV21", exceptionRecordLIZLLL, "LOG_TYPE_SMART_PROTECTOR_SUCCESSFUL_EXCEPTION");
                        }
                    }
                } else {
                    Context context4 = this.LIZ.LJ;
                    int i4 = this.curForeQuietTime;
                    Gson gson4 = SafeModeReporter.LIZ;
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        jSONObject4.put("realUseTime", i4 * LSPassThroughRecordSizeConfig.DEFAULT);
                        SafeModeReporter.LIZIZ(context4, jSONObject4);
                    } catch (JSONException e4) {
                        TryCatchGuardChecker.doCheck(e4);
                    }
                    SafeModeReporter.LIZLLL("safemode_roll_back_protect_success", jSONObject4);
                    this.LIZ.getClass();
                    if (exceptionRecordLIZLLL != null) {
                        SafeModeReporter.LJFF("reportRollBackProtectSuccess", exceptionRecordLIZLLL, "LOG_TYPE_SMART_PROTECTOR_SUCCESSFUL_EXCEPTION");
                    }
                }
                if (this.LJI) {
                    C805560Vis c805560Vis = C2203541BMa.LIZ;
                    synchronized (C2203541BMa.class) {
                        C2203541BMa.LIZ.LIZ.edit().remove("protected_activity_result").apply();
                        C2200391B9x.LIZJ("clearSafeModeActivityResult");
                    }
                }
                LJ().LIZIZ();
            }
            ScheduledFuture<?> scheduledFuture = this.LJIIIZ;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ExceptionManager exceptionManagerLJ = LJ();
            exceptionManagerLJ.LIZJ.LIZ().clear();
            if (exceptionManagerLJ.LJIIJJI) {
                exceptionManagerLJ.LJII(exceptionManagerLJ.LJIIIZ, exceptionManagerLJ.LIZJ.LIZ());
            } else {
                exceptionManagerLJ.LJII(exceptionManagerLJ.LJIIJ, exceptionManagerLJ.LIZJ.LIZ());
            }
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("first enter quiet so skip onExitState logic pid ");
            sbLIZ.append(this.LIZIZ);
            C2200391B9x.LIZLLL("QuietState", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.curForeQuietTime = 0;
        this.LIZLLL = 0L;
        this.LJFF = 0L;
        this.LJI = false;
        this.needReportBootProtectedResult = true;
        C2200391B9x.LIZLLL("QuietState", "Exit QuietState");
    }

    public final boolean LJIIJ(C1BMX c1bmx) {
        long j;
        if (c1bmx == null) {
            return false;
        }
        if (System.currentTimeMillis() - c1bmx.LIZ > C2203571BMd.LJIILLIIL.LIZ() * 2) {
            C2200391B9x.LIZIZ("QuietState", "checking invalid bootprotect result");
            this.needReportBootProtectedResult = false;
            this.LIZ.LJIIIIZZ();
            return true;
        }
        if (c1bmx.LIZIZ == 1) {
            Object[] objArr = new Object[3];
            objArr[0] = Long.valueOf(System.currentTimeMillis());
            C08OH c08ohLIZ = C08OH.LIZ(this.LIZ.LJ);
            c08ohLIZ.getClass();
            long j2 = 0;
            try {
                j = CastLongProtector.parseLong(FileUtils.readFileToString(c08ohLIZ.LIZ, Charset.forName("UTF-8")));
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                j = 0;
            }
            objArr[1] = Long.valueOf(j);
            objArr[2] = Long.valueOf(this.LIZLLL);
            C2200391B9x.LIZLLL("QuietState", C786410Ut5.j4("curtime: %d starttime: %d maxQuietTime: %d", objArr));
            long jCurrentTimeMillis = System.currentTimeMillis();
            C08OH c08ohLIZ2 = C08OH.LIZ(this.LIZ.LJ);
            c08ohLIZ2.getClass();
            try {
                j2 = CastLongProtector.parseLong(FileUtils.readFileToString(c08ohLIZ2.LIZ, Charset.forName("UTF-8")));
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if (jCurrentTimeMillis - j2 <= this.LIZLLL) {
                return false;
            }
            C2200391B9x.LIZLLL("QuietState", "reach bootprotect quiet time");
            this.LIZ.LJIIIIZZ();
            return true;
        }
        this.needReportBootProtectedResult = false;
        this.LIZ.LJIIIIZZ();
        return true;
    }

    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState
    public final void LJI(C1BN4 c1bn4, StateParam stateParam) {
        if (stateParam instanceof QuietStateParam) {
            QuietStateParam quietStateParam = (QuietStateParam) stateParam;
            this.LIZLLL = quietStateParam.maxQuietTime;
            this.LJI = quietStateParam.fromBootProtected;
            this.LJII = quietStateParam.reachType;
            this.LJIIIIZZ = quietStateParam.smartEnterTimeStamp;
        }
        if (C1BMY.LIZIZ().LIZJ == null && this.LIZIZ != 0) {
            this.LIZJ = true;
        } else {
            this.LIZJ = false;
        }
        if (this.LIZJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("first enter quiet so skip enter logic pid ");
            sbLIZ.append(this.LIZIZ);
            C2200391B9x.LIZLLL("QuietState", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        this.LJ = System.currentTimeMillis();
        C2200391B9x.LIZLLL("QuietState", C786410Ut5.j4("Enter maxQuietTime: %d fromBootProtected: %b", new Object[]{Long.valueOf(this.LIZLLL), Boolean.valueOf(this.LJI)}));
        ExceptionManager exceptionManagerLIZJ = ExceptionManager.LIZJ(this.LIZ.LJ);
        boolean z = true ^ this.LJI;
        exceptionManagerLIZJ.getClass();
        synchronized (ExceptionManager.class) {
            try {
                if (z) {
                    ExceptionManager.LJIILL.LIZJ.LIZJ(exceptionManagerLIZJ.LJ(ExceptionManager.LJIILL.LJIIIZ));
                } else {
                    ExceptionManager.LJIILL.LIZJ.LIZJ(exceptionManagerLIZJ.LJ(ExceptionManager.LJIILL.LJIIJ));
                }
                exceptionManagerLIZJ.LJIIJJI = z;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (!this.LJI || !LJIIJ(C2203541BMa.LIZ())) {
            this.LJIIIZ = this.LIZ.LJI.scheduleWithFixedDelay(new ARunnableS134S0100000_34(this, 8), 10L, 1L, TimeUnit.SECONDS);
        }
    }

    public static class QuietStateDeserializer implements j<QuietState> {
        @Override // com.google.gson.j
        public final QuietState deserialize(k kVar, Type type, i iVar) {
            QuietState quietState = new QuietState();
            n nVarLJIILIIL = kVar.LJIILIIL();
            if (nVarLJIILIIL.LJJIJIIJIL("curForeQuietTime")) {
                quietState.curForeQuietTime = nVarLJIILIIL.LJJIIZ("curForeQuietTime").LJIIJJI();
            }
            if (nVarLJIILIIL.LJJIJIIJIL("stateParam")) {
                quietState.stateParam = (StateParam) GsonProtectorUtils.fromJson(SmartProtectedStateMachine.LJII, nVarLJIILIIL.LJJIIZ("stateParam").toString(), QuietStateParam.class);
                return quietState;
            }
            quietState.stateParam = null;
            return quietState;
        }
    }

    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState, X.C1BN4
    public final void LIZ(long j, String str, String str2) throws Throwable {
        ExceptionManager.ExceptionRecord exceptionRecordLJI;
        C2200391B9x.LIZLLL("QuietState", "doException: ");
        if (this.LIZJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("first enter quiet so skip doException logic pid ");
            sbLIZ.append(this.LIZIZ);
            C2200391B9x.LIZLLL("QuietState", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        ExceptionManager exceptionManagerLJ = LJ();
        if (exceptionManagerLJ.LJIIJJI) {
            exceptionRecordLJI = exceptionManagerLJ.LJI(str, str2, j, exceptionManagerLJ.LIZJ.LIZ(), exceptionManagerLJ.LJIIIZ, C2203571BMd.LJIILLIIL.LJIIJ.LIZ().longValue());
        } else {
            exceptionRecordLJI = exceptionManagerLJ.LJI(str, str2, j, exceptionManagerLJ.LIZJ.LIZ(), exceptionManagerLJ.LJIIJ, C2203571BMd.LJIILLIIL.LJIIJ.LIZ().longValue());
        }
        if (!this.LJI) {
            if (exceptionRecordLJI.isSameException(exceptionManagerLJ.LIZLLL())) {
                ExceptionManager exceptionManagerLIZJ = ExceptionManager.LIZJ(this.LIZ.LJ);
                exceptionManagerLIZJ.getClass();
                exceptionRecordLJI.white = true;
                exceptionManagerLIZJ.LIZIZ.LIZ().add(exceptionRecordLJI);
                while (exceptionManagerLIZJ.LIZIZ.LIZ().size() > 5) {
                    ListProtector.remove(exceptionManagerLIZJ.LIZIZ.LIZ(), 0);
                }
                exceptionManagerLIZJ.LJII(exceptionManagerLIZJ.LJIIIIZZ, exceptionManagerLIZJ.LIZIZ.LIZ());
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(exceptionRecordLJI.crashType);
                sbLIZ2.append(exceptionRecordLJI.crashReason);
                C786410Ut5.j4("add %s exception to white list", new Object[]{C2200381B9w.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2))});
                SafeModeReporter.CrashInfo crashInfoLIZ = SafeModeReporter.CrashInfo.LIZ(exceptionRecordLJI);
                long j2 = this.curForeQuietTime;
                long j3 = this.LJFF;
                Gson gson = SafeModeReporter.LIZ;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("frontTime", j2 * 1000);
                    jSONObject.put("liveTime", j3 * 1000);
                    jSONObject.put("crash", crashInfoLIZ.LIZLLL());
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                SafeModeReporter.LIZLLL("safemode_roll_back_protect_fail_same", jSONObject);
                SmartProtectedStateMachine smartProtectedStateMachine = this.LIZ;
                ExceptionManager.ExceptionRecord exceptionRecordLIZLLL = exceptionManagerLJ.LIZLLL();
                smartProtectedStateMachine.getClass();
                if (exceptionRecordLIZLLL != null) {
                    SafeModeReporter.LJFF("reportRollBackProtectFailSame", exceptionRecordLIZLLL, "LOG_TYPE_SMART_PROTECTOR_FAILED_EXCEPTION");
                }
                LJIIIIZZ(this.LIZ.mRollBackState, new StateParam(2, 1));
                return;
            }
            int iLJIIIIZZ = exceptionManagerLJ.LJIIIIZZ();
            if (iLJIIIIZZ != 0) {
                SafeModeReporter.CrashInfo[] crashInfoArrLIZJ = SafeModeReporter.CrashInfo.LIZJ(exceptionManagerLJ.LIZJ.LIZ());
                long j4 = this.curForeQuietTime;
                long j5 = this.LJFF;
                Gson gson2 = SafeModeReporter.LIZ;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("frontTime", j4 * 1000);
                    jSONObject2.put("liveTime", j5 * 1000);
                    jSONObject2.put("reasonType", iLJIIIIZZ);
                    if (crashInfoArrLIZJ != null) {
                        jSONObject2.put("crash_times", crashInfoArrLIZJ.length);
                        jSONObject2.put("crashs", GsonProtectorUtils.toJson(SafeModeReporter.LIZ, crashInfoArrLIZJ));
                    }
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                SafeModeReporter.LIZLLL("safemode_roll_back_protect_fail_other", jSONObject2);
                SmartProtectedStateMachine smartProtectedStateMachine2 = this.LIZ;
                ExceptionManager.ExceptionRecord exceptionRecordLIZLLL2 = exceptionManagerLJ.LIZLLL();
                smartProtectedStateMachine2.getClass();
                if (exceptionRecordLIZLLL2 != null) {
                    SafeModeReporter.LJFF("reportRollBackProtectFailOther", exceptionRecordLIZLLL2, "LOG_TYPE_SMART_PROTECTOR_FAILED_EXCEPTION");
                }
                LJIIIIZZ(this.LIZ.mRollBackState, new StateParam(2, 1));
                return;
            }
            return;
        }
        if (C2203541BMa.LIZ() == null && (this.LJ == 0 || System.currentTimeMillis() - this.LJ < 10000 || C2200381B9w.LIZ(this.LIZ.LJ))) {
            C2200391B9x.LIZLLL("QuietState", "skip dispose boot protected doException");
            return;
        }
        if (exceptionRecordLJI.isSameException(exceptionManagerLJ.LIZLLL())) {
            C2200391B9x.LIZLLL("QuietState", "boot protected to dispose exception(same exception)");
            SafeModeReporter.CrashInfo crashInfoLIZ2 = SafeModeReporter.CrashInfo.LIZ(exceptionRecordLJI);
            long j6 = this.curForeQuietTime;
            int i = this.LJII;
            Gson gson3 = SafeModeReporter.LIZ;
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("reachType", i);
                jSONObject3.put("frontTime", j6 * 1000);
                jSONObject3.put("crash", crashInfoLIZ2.LIZLLL());
            } catch (JSONException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            SafeModeReporter.LIZLLL("safemode_protect_fail_v2", jSONObject3);
            SmartProtectedStateMachine smartProtectedStateMachine3 = this.LIZ;
            ExceptionManager.ExceptionRecord exceptionRecordLIZLLL3 = exceptionManagerLJ.LIZLLL();
            smartProtectedStateMachine3.getClass();
            if (exceptionRecordLIZLLL3 != null) {
                SafeModeReporter.LJFF("reportProtectFail", exceptionRecordLIZLLL3, "LOG_TYPE_SMART_PROTECTOR_FAILED_EXCEPTION");
            }
            this.needReportBootProtectedResult = false;
            this.LIZ.LJIIIIZZ();
            return;
        }
        C2200391B9x.LIZLLL("QuietState", "boot protected to dispose exception(other exception)");
        int iLJIIIIZZ2 = exceptionManagerLJ.LJIIIIZZ();
        if (iLJIIIIZZ2 != 0) {
            SafeModeReporter.CrashInfo[] crashInfoArrLIZJ2 = SafeModeReporter.CrashInfo.LIZJ(exceptionManagerLJ.LIZJ.LIZ());
            long j7 = this.curForeQuietTime;
            long j8 = this.LJFF;
            int i2 = this.LJII;
            Gson gson4 = SafeModeReporter.LIZ;
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("reachType", i2);
                jSONObject4.put("frontTime", j7 * 1000);
                jSONObject4.put("liveTime", j8 * 1000);
                jSONObject4.put("reasonType", iLJIIIIZZ2);
                if (crashInfoArrLIZJ2 != null) {
                    jSONObject4.put("crash_times", crashInfoArrLIZJ2.length);
                    jSONObject4.put("crashs", GsonProtectorUtils.toJson(SafeModeReporter.LIZ, crashInfoArrLIZJ2));
                }
            } catch (JSONException e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            SafeModeReporter.LIZLLL("safemode_protect_other_crash_v2", jSONObject4);
            SmartProtectedStateMachine smartProtectedStateMachine4 = this.LIZ;
            ExceptionManager.ExceptionRecord exceptionRecordLIZLLL4 = exceptionManagerLJ.LIZLLL();
            smartProtectedStateMachine4.getClass();
            if (exceptionRecordLIZLLL4 != null) {
                SafeModeReporter.LJFF("reportProtectOtherCrash", exceptionRecordLIZLLL4, "LOG_TYPE_SMART_PROTECTOR_FAILED_EXCEPTION");
            }
            C2200391B9x.LIZLLL("QuietState", "exit boot protected quiet ahead of time");
            this.needReportBootProtectedResult = false;
            this.LIZ.LJIIIIZZ();
        }
    }

    public static class QuietStateParam extends StateParam {

        @C09CT("fromBootProtected")
        @C09DE
        public boolean fromBootProtected;

        @C09CT("maxQuietTime")
        @C09DE
        public long maxQuietTime;

        @C09CT("reachType")
        @C09DE
        public int reachType;

        @C09CT("smartEnterTimeStamp")
        @C09DE
        public long smartEnterTimeStamp;

        public QuietStateParam(long j, boolean z, int i, long j2) {
            this.maxQuietTime = j;
            this.fromBootProtected = z;
            this.reachType = i;
            this.smartEnterTimeStamp = j2;
        }
    }
}
