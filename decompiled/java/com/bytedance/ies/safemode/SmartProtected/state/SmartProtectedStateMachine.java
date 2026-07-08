package com.bytedance.ies.safemode.SmartProtected.state;

import X.C08RN;
import X.C09CT;
import X.C09DE;
import X.C0VSJ;
import X.C1BMY;
import X.C1BN3;
import X.C1BN4;
import X.C1BN6;
import X.C2188811AlT;
import X.C2200381B9w;
import X.C2200391B9x;
import X.C2203551BMb;
import X.C2203561BMc;
import X.C2203581BMe;
import X.C2203611BMh;
import X.C2260008tK;
import X.C786410Ut5;
import X.C786450Ut9;
import X.C807400Vlq;
import Y.ARunnableS134S0100000_34;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.ies.safemode.SafeModeReporter;
import com.bytedance.ies.safemode.SmartProtected.state.ExceptionManager;
import com.bytedance.ies.safemode.SmartProtected.state.QuietState;
import com.bytedance.ies.safemode.SmartProtected.state.StateParam;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.e;
import com.google.gson.i;
import com.google.gson.internal.Excluder;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class SmartProtectedStateMachine {
    public static final Gson LJII;
    public volatile C1BN4 LIZ;
    public C0VSJ LIZIZ;
    public volatile boolean LIZJ;
    public Context LJ;

    @C09CT("mBuildingState")
    @C09DE
    public C1BN4 mBuildingState;

    @C09CT("mCheckingState")
    @C09DE
    public C1BN4 mCheckingState;

    @C09CT("mQuietState")
    @C09DE
    public C1BN4 mQuietState;

    @C09CT("mRollBackState")
    @C09DE
    public C1BN4 mRollBackState;

    @C09CT("mStopState")
    @C09DE
    public C1BN4 mStopState;
    public final List<C1BN6> LIZLLL = new ArrayList();
    public final ScheduledExecutorService LJI = C807400Vlq.LJ();

    @C09CT("lastStateName")
    @C09DE
    public String lastStateName = "";
    public boolean LJFF = false;

    public final synchronized C1BN4 LIZ() {
        return this.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0085 A[Catch: all -> 0x00d8, TryCatch #1 {all -> 0x00d8, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x000a, B:8:0x000c, B:10:0x0049, B:12:0x0057, B:13:0x005e, B:15:0x0085, B:16:0x0089, B:17:0x008c, B:19:0x008e, B:21:0x009c, B:22:0x00a4, B:24:0x00b2, B:25:0x00ba, B:27:0x00c8, B:28:0x00d0), top: B:39:0x0001, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII() {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.safemode.SmartProtected.state.SmartProtectedStateMachine.LJII():void");
    }

    public final void LJIIIIZZ() {
        try {
            synchronized (this) {
                try {
                    LJIIIZ(this.mStopState, new StateParam());
                    this.LIZ.LIZJ(this.mStopState);
                    Iterator it2 = ((ArrayList) this.LIZLLL).iterator();
                    while (it2.hasNext()) {
                        ((C1BN6) it2.next()).LIZ();
                    }
                    this.LIZ = null;
                    LJI();
                    if (!this.LJI.isShutdown()) {
                        this.LJI.shutdownNow();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C2200391B9x.LIZJ(C786410Ut5.j4("machine stop", new Object[0]));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJ(6, e);
        }
    }

    static {
        e eVar = new e();
        eVar.LJIILL = true;
        Excluder excluderClone = eVar.LIZ.clone();
        excluderClone.LLILZ = true;
        eVar.LIZ = excluderClone;
        StateMachineDeserializer stateMachineDeserializer = new StateMachineDeserializer();
        QuietState.QuietStateDeserializer quietStateDeserializer = new QuietState.QuietStateDeserializer();
        eVar.LIZJ(stateMachineDeserializer, SmartProtectedStateMachine.class);
        eVar.LIZJ(quietStateDeserializer, QuietState.class);
        LJII = eVar.LIZ();
    }

    public final void LJFF() {
        try {
            this.LIZ = new C2203611BMh();
            this.LIZ.LIZIZ(this);
            C2200391B9x.LIZJ(C786410Ut5.j4("machine restart %s", new Object[]{this.LIZ.getName()}));
            this.LIZ.LIZLLL(null, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJ(5, e);
        }
    }

    public final void LJI() throws Throwable {
        try {
            FileUtils.writeStringToFile(this.LIZIZ, GsonProtectorUtils.toJson(LJII, this), Charset.forName("UTF-8"));
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            LJ(9, e);
            C2200391B9x.LIZ("saveState", e);
        }
    }

    public static C0VSJ LIZIZ(Context context) throws Throwable {
        Object obj;
        File file = C786450Ut9.LIZJ;
        if (file == null || !C786450Ut9.LJ) {
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
                    obj = declaredField.get(objInvoke);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Error: ");
                    sbLIZ.append(e.getMessage());
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                }
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream2 = System.out;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Application context obtained through ActivityThread: ");
                    sbLIZ2.append(applicationContext);
                    printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
                    if (applicationContext != null) {
                        C786450Ut9.LIZJ = applicationContext.getFilesDir();
                        C08RN.LIZ(applicationContext);
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(th.getMessage());
                    sbLIZ3.append(":");
                    sbLIZ3.append(C08RN.LIZJ());
                    sbLIZ3.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
                }
                System.out.println("Error: mInitialApplication is not an instance of Application");
                StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                sbLIZ32.append(th.getMessage());
                sbLIZ32.append(":");
                sbLIZ32.append(C08RN.LIZJ());
                sbLIZ32.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ32));
            }
            file = C786450Ut9.LIZJ;
        }
        return new C0VSJ(new C0VSJ(file.getAbsolutePath(), "machine"), "machine.json");
    }

    public static SmartProtectedStateMachine LIZLLL(Context context) throws Throwable {
        String fileToString;
        try {
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            C2200381B9w.LIZJ(8, e);
            C2200391B9x.LIZ("loadState", e);
        }
        if (LIZIZ(context).exists()) {
            fileToString = FileUtils.readFileToString(LIZIZ(context), Charset.forName("UTF-8"));
        } else {
            fileToString = "{}";
        }
        try {
            SmartProtectedStateMachine smartProtectedStateMachine = (SmartProtectedStateMachine) LJII.LJII(fileToString, SmartProtectedStateMachine.class);
            C2200391B9x.LIZJ(C786410Ut5.j4("machine json %s", new Object[]{fileToString}));
            if (smartProtectedStateMachine != null) {
                smartProtectedStateMachine.LJ = context;
            }
            return smartProtectedStateMachine;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2200381B9w.LIZJ(8, th);
            C2200391B9x.LIZ("loadState", th);
            return null;
        }
    }

    public final void LJ(int i, Exception exc) {
        C2200381B9w.LIZJ(i, exc);
        C2200391B9x.LIZ(C786410Ut5.j4("onExceptionInStage %d", new Object[]{Integer.valueOf(i)}), exc);
        this.LIZ = this.mStopState;
        if (this.LJFF) {
            C2200391B9x.LIZIZ("SmartProtectedStateMachine", "onExceptionInStage skipResetMachineStateOnException");
            return;
        }
        try {
            C2260008tK.LIZLLL(LIZIZ(this.LJ).getAbsolutePath());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJIIIZ(C1BN4 c1bn4, StateParam stateParam) {
        if (c1bn4 == null) {
            return;
        }
        try {
            synchronized (this) {
                try {
                    C1BN4 c1bn42 = this.LIZ;
                    LJI();
                    this.LIZ.LIZJ(c1bn4);
                    Iterator it2 = ((ArrayList) this.LIZLLL).iterator();
                    while (it2.hasNext()) {
                        ((C1BN6) it2.next()).LIZ();
                    }
                    LJI();
                    this.LIZ = c1bn4;
                    C2200391B9x.LIZJ(C786410Ut5.j4("machine switchState %s -> %s ", new Object[]{c1bn42.getName(), this.LIZ.getName()}));
                    this.lastStateName = c1bn4.getName();
                    LJI();
                    this.LIZ.LIZLLL(c1bn42, stateParam);
                    Iterator it3 = ((ArrayList) this.LIZLLL).iterator();
                    while (it3.hasNext()) {
                        ((C1BN6) it3.next()).LIZIZ();
                    }
                    LJI();
                } finally {
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJ(7, e);
        }
    }

    public static class StateMachineDeserializer implements j<SmartProtectedStateMachine> {
        @Override // com.google.gson.j
        public final SmartProtectedStateMachine deserialize(k kVar, Type type, i iVar) {
            SmartProtectedStateMachine smartProtectedStateMachine = new SmartProtectedStateMachine();
            n nVarLJIILIIL = kVar.LJIILIIL();
            if (nVarLJIILIIL.LJJIJIIJIL("lastStateName")) {
                smartProtectedStateMachine.lastStateName = nVarLJIILIIL.LJJIIZ("lastStateName").LJIL();
            }
            if (nVarLJIILIIL.LJJIJIIJIL("mBuildingState")) {
                smartProtectedStateMachine.mBuildingState = (C1BN4) GsonProtectorUtils.fromJson(SmartProtectedStateMachine.LJII, nVarLJIILIIL.LJJIIZ("mBuildingState").toString(), C2203581BMe.class);
            } else {
                smartProtectedStateMachine.mBuildingState = new BaseState() { // from class: X.1BMe
                    public final List<InterfaceC2203751BMv> LIZIZ = new ArrayList();

                    @Override // X.C1BN4
                    public final String getName() {
                        return "BuildingState";
                    }

                    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState
                    public final void LJFF() {
                        ((ArrayList) this.LIZIZ).add(C2200401B9y.LJI(this.LIZ.LJ));
                        for (InterfaceC2203751BMv interfaceC2203751BMv : (ArrayList) this.LIZIZ) {
                            C2203571BMd.LJIILLIIL.getClass();
                            interfaceC2203751BMv.LIZIZ();
                        }
                    }

                    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState, X.C1BN4
                    public final void LIZJ(C1BN4 c1bn4) {
                        C2200391B9x.LIZLLL("BuildingState", "exitState: ");
                    }

                    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState
                    public final void LJI(C1BN4 c1bn4, StateParam stateParam) {
                        if (c1bn4.getClass() == C2203611BMh.class) {
                            C2200391B9x.LIZIZ("BuildingState", "find last building abnormal exit");
                            Iterator it2 = ((ArrayList) this.LIZIZ).iterator();
                            while (it2.hasNext()) {
                                ((InterfaceC2203751BMv) it2.next()).clearAll();
                            }
                            C2200391B9x.LIZLLL("BuildingState", "cleanAllSnapshot: ");
                            this.LIZ.LJFF();
                            return;
                        }
                        StringBuffer stringBuffer = new StringBuffer();
                        for (InterfaceC2203751BMv interfaceC2203751BMv : (ArrayList) this.LIZIZ) {
                            Boolean boolValueOf = Boolean.valueOf(interfaceC2203751BMv.LIZJ());
                            if (!boolValueOf.booleanValue()) {
                                stringBuffer.append(",SettingAndAB");
                                interfaceC2203751BMv.getName();
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            interfaceC2203751BMv.getName();
                            sbLIZ.append("SettingAndAB");
                            sbLIZ.append(" makeSnapshot ");
                            sbLIZ.append(boolValueOf);
                            C2200391B9x.LIZLLL("BuildingState", C2188811AlT.LIZIZ(sbLIZ));
                        }
                        if (stringBuffer.length() > 0) {
                            String strSubstring = stringBuffer.substring(1);
                            Gson gson = SafeModeReporter.LIZ;
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("cf_names", strSubstring);
                            } catch (JSONException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            SafeModeReporter.LIZLLL("safemode_make_snapshot_fail", jSONObject);
                        }
                        this.LIZ.LJIIIIZZ();
                    }

                    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState, X.C1BN4
                    public final void LIZ(long j, String str, String str2) {
                        C2200391B9x.LIZIZ("BuildingState", "find exception in building");
                    }
                };
            }
            if (nVarLJIILIIL.LJJIJIIJIL("mCheckingState")) {
                smartProtectedStateMachine.mCheckingState = (C1BN4) GsonProtectorUtils.fromJson(SmartProtectedStateMachine.LJII, nVarLJIILIIL.LJJIIZ("mCheckingState").toString(), C2203561BMc.class);
            } else {
                smartProtectedStateMachine.mCheckingState = new BaseState() { // from class: X.1BMc
                    public ScheduledFuture<?> LIZIZ;

                    @Override // X.C1BN4
                    public final String getName() {
                        return "CheckingState";
                    }

                    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState, X.C1BN4
                    public final void LIZJ(C1BN4 c1bn4) {
                        this.LIZIZ.cancel(false);
                    }

                    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState
                    public final void LJI(C1BN4 c1bn4, StateParam stateParam) {
                        C2200391B9x.LIZLLL("CheckingState", C786410Ut5.j4("enterState maxCrashCount: %d", new Object[]{Integer.valueOf(C2203571BMd.LJIILLIIL.LJ.LIZ().intValue())}));
                        this.LIZIZ = this.LIZ.LJI.scheduleWithFixedDelay(new ARunnableS134S0100000_34(this, 7), 1L, 1L, TimeUnit.SECONDS);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:13:0x00a5  */
                    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
                    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState, X.C1BN4
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ(long r21, java.lang.String r23, java.lang.String r24) throws java.lang.Throwable {
                        /*
                            Method dump skipped, instruction units count: 368
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C2203561BMc.LIZ(long, java.lang.String, java.lang.String):void");
                    }
                };
            }
            if (nVarLJIILIIL.LJJIJIIJIL("mRollBackState")) {
                smartProtectedStateMachine.mRollBackState = (C1BN4) GsonProtectorUtils.fromJson(SmartProtectedStateMachine.LJII, nVarLJIILIIL.LJJIIZ("mRollBackState").toString(), C2203551BMb.class);
            } else {
                smartProtectedStateMachine.mRollBackState = new BaseState() { // from class: X.1BMb
                    public final List<InterfaceC2203751BMv> LIZIZ = new ArrayList();

                    @Override // X.C1BN4
                    public final String getName() {
                        return "RollBackState";
                    }

                    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState
                    public final void LJFF() {
                        ((ArrayList) this.LIZIZ).add(C2200401B9y.LJI(this.LIZ.LJ));
                    }

                    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState
                    public final void LJII(C1BN4 c1bn4) {
                        C2200391B9x.LIZLLL("RollBackState", "onExitState: ");
                        StateParam stateParam = this.stateParam;
                        if (stateParam != null) {
                            stateParam.flags = 0;
                        }
                    }

                    public final void LJIIIZ(int i) throws Throwable {
                        long jLIZIZ;
                        int i2;
                        C2200391B9x.LIZLLL("RollBackState", C786410Ut5.j4("bootProtected protectedPeriod: %d", new Object[]{Long.valueOf(C2203571BMd.LJIILLIIL.LIZ())}));
                        ExceptionManager.ExceptionRecord exceptionRecordLIZLLL = LJ().LIZLLL();
                        if (exceptionRecordLIZLLL != null) {
                            ExceptionManager exceptionManagerLIZJ = ExceptionManager.LIZJ(this.LIZ.LJ);
                            String crashType = exceptionRecordLIZLLL.getCrashType();
                            String crashReason = exceptionRecordLIZLLL.getCrashReason();
                            exceptionManagerLIZJ.getClass();
                            if (!TextUtils.isEmpty(crashType) && !TextUtils.isEmpty(crashReason)) {
                                for (C1BN5 c1bn5 : (ArrayList) exceptionManagerLIZJ.LJI) {
                                    if (c1bn5.isSameException(crashType, crashReason)) {
                                        if (c1bn5 instanceof ExceptionManager.CloudException) {
                                            SafeModeReporter.CrashInfo crashInfoLIZIZ = SafeModeReporter.CrashInfo.LIZIZ(crashType, crashReason);
                                            int i3 = ((ExceptionManager.CloudException) c1bn5).configType;
                                            Gson gson = SafeModeReporter.LIZ;
                                            JSONObject jSONObject = new JSONObject();
                                            try {
                                                jSONObject.put("reachType", i3);
                                                jSONObject.put("crash", crashInfoLIZIZ.LIZLLL());
                                            } catch (JSONException e) {
                                                TryCatchGuardChecker.doCheck(e);
                                            }
                                            SafeModeReporter.LIZLLL("safemode_skip_crash", jSONObject);
                                            C786410Ut5.j4("reportSkipCrash reachType:%d", new Object[]{Integer.valueOf(i3)});
                                        }
                                        C2200391B9x.LIZLLL("ExceptionManager", C786410Ut5.j4("cloudSkipBootProtected crashType(%s) stack(%s)", new Object[]{crashType, crashReason}));
                                    }
                                }
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                C805560Vis c805560Vis = C2203541BMa.LIZ;
                                synchronized (C2203541BMa.class) {
                                    jLIZIZ = C2203541BMa.LIZ.LIZIZ(0L, "boot_protected_time_stamp");
                                }
                                if (jCurrentTimeMillis - jLIZIZ < C2203571BMd.LJIILLIIL.LIZ()) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("Skip Enter: bootProtected ");
                                    sbLIZ.append(i);
                                    C2200391B9x.LIZLLL("RollBackState", C2188811AlT.LIZIZ(sbLIZ));
                                    Gson gson2 = SafeModeReporter.LIZ;
                                    JSONObject jSONObject2 = new JSONObject();
                                    try {
                                        jSONObject2.put("reachType", i);
                                    } catch (JSONException e2) {
                                        TryCatchGuardChecker.doCheck(e2);
                                    }
                                    SafeModeReporter.LIZLLL("safemode_in_protect_period", jSONObject2);
                                    this.LIZ.LJIIIIZZ();
                                    return;
                                }
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("Enter: bootProtected ");
                                sbLIZ2.append(i);
                                C2200391B9x.LIZLLL("RollBackState", C2188811AlT.LIZIZ(sbLIZ2));
                                Context context = this.LIZ.LJ;
                                int iMyPid = Process.myPid();
                                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : C2204961BRm.LJII((ActivityManager) C786410Ut5.H2(context, "activity"), new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YtmpO5Tb/ePGxJ+UXBPJeRFBcsF75zoL/ZWDqG7X3H+wKzWdYvbTsNg==", null))) {
                                    if (runningAppProcessInfo.processName.startsWith(context.getPackageName()) && (i2 = runningAppProcessInfo.pid) != iMyPid) {
                                        Process.killProcess(i2);
                                    }
                                }
                                SafeModeReporter.CrashInfo crashInfoLIZ = SafeModeReporter.CrashInfo.LIZ(exceptionRecordLIZLLL);
                                Gson gson3 = SafeModeReporter.LIZ;
                                JSONObject jSONObject3 = new JSONObject();
                                try {
                                    jSONObject3.put("reachType", i);
                                    jSONObject3.put("crash", crashInfoLIZ.LIZLLL());
                                } catch (JSONException e3) {
                                    TryCatchGuardChecker.doCheck(e3);
                                }
                                SafeModeReporter.LIZLLL("safemode_reach_boot_protect", jSONObject3);
                                C786410Ut5.j4("%s reachType:%d", new Object[]{"safemode_reach_boot_protect", Integer.valueOf(i)});
                                C1BMY.LIZIZ().getClass();
                                C1BMY.LIZIZ().LJ(exceptionRecordLIZLLL, i);
                                C1BN4 c1bn4 = this.LIZ.mQuietState;
                                if (c1bn4 instanceof QuietState) {
                                    ((QuietState) c1bn4).LIZIZ = Process.myPid();
                                    C2200391B9x.LIZLLL("RollBackState", "setEnterQuietStatePid");
                                }
                                LJIIIIZZ(this.LIZ.mQuietState, new QuietState.QuietStateParam(C2203571BMd.LJIILLIIL.LJII.LIZ().longValue(), true, i, -1L));
                                C1BMY.LIZIZ().getClass();
                                try {
                                    Thread.sleep(120000L);
                                    C2200391B9x.LIZLLL("RollBackState", "bootProtected: sleep");
                                    return;
                                } catch (InterruptedException e4) {
                                    TryCatchGuardChecker.doCheck(e4);
                                    return;
                                }
                            }
                        }
                        C2200391B9x.LIZLLL("RollBackState", "Skip Enter: shouldSkipBootProtected ");
                        this.LIZ.LJFF();
                    }

                    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState
                    public final void LJI(C1BN4 c1bn4, StateParam stateParam) throws Throwable {
                        int i;
                        boolean z;
                        int i2;
                        if (c1bn4 instanceof C2203611BMh) {
                            Gson gson = SafeModeReporter.LIZ;
                            SafeModeReporter.LIZLLL("safemode_abort_roll_back", new JSONObject());
                            C2200391B9x.LIZIZ("RollBackState", "find last RollBackState abnormal exit");
                            for (InterfaceC2203751BMv interfaceC2203751BMv : (ArrayList) this.LIZIZ) {
                                interfaceC2203751BMv.clearAll();
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("cleanAllSnapshot ");
                                interfaceC2203751BMv.getName();
                                sbLIZ.append("SettingAndAB");
                                C2200391B9x.LIZLLL("RollBackState", C2188811AlT.LIZIZ(sbLIZ));
                            }
                            this.LIZ.LJFF();
                            return;
                        }
                        C2200391B9x.LIZLLL("RollBackState", "onEnterState ");
                        int i3 = -1;
                        if (stateParam != null && (stateParam.flags & 2) == 2 && (i2 = stateParam.payload) > -1) {
                            LJIIIZ(i2);
                            return;
                        }
                        C2203571BMd.LJIILLIIL.getClass();
                        Iterator it2 = ((ArrayList) this.LIZIZ).iterator();
                        while (true) {
                            i = 0;
                            if (it2.hasNext()) {
                                if (((InterfaceC2203751BMv) it2.next()).LIZ().size() >= 2) {
                                    z = true;
                                    break;
                                }
                            } else {
                                z = false;
                                break;
                            }
                        }
                        if (stateParam != null) {
                            i3 = stateParam.payload;
                        }
                        if (z) {
                            this.LIZ.LJFF = true;
                            C2200391B9x.LIZLLL("RollBackState", "Begin smart rollback");
                            ArrayList<String> arrayList = new ArrayList();
                            ExceptionManager.ExceptionRecord exceptionRecordLIZLLL = LJ().LIZLLL();
                            if (exceptionRecordLIZLLL == null) {
                                Gson gson2 = SafeModeReporter.LIZ;
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("cf_names", "can't find enter rollback record");
                                } catch (JSONException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                                SafeModeReporter.LIZLLL("safemode_roll_back_fail", jSONObject);
                                C2200391B9x.LIZLLL("RollBackState", "can't find enter rollback record");
                            } else {
                                SafeModeReporter.CrashInfo crashInfoLIZ = SafeModeReporter.CrashInfo.LIZ(exceptionRecordLIZLLL);
                                Gson gson3 = SafeModeReporter.LIZ;
                                JSONObject jSONObject2 = new JSONObject();
                                try {
                                    jSONObject2.put("crash", crashInfoLIZ.LIZLLL());
                                    jSONObject2.put("reachType", i3);
                                } catch (JSONException e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                }
                                SafeModeReporter.LIZLLL("safemode_reach_roll_back", jSONObject2);
                                C786410Ut5.j4("%s reachType:%d", new Object[]{"safemode_reach_roll_back", Integer.valueOf(i3)});
                                C2203571BMd.LJIILLIIL.getClass();
                                StringBuffer stringBuffer = new StringBuffer();
                                boolean z2 = false;
                                for (InterfaceC2203751BMv interfaceC2203751BMv2 : (ArrayList) this.LIZIZ) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("Begin rollBack: ");
                                    sbLIZ2.append(interfaceC2203751BMv2.toString());
                                    C2188811AlT.LIZIZ(sbLIZ2);
                                    List<C1BA1> listLIZ = interfaceC2203751BMv2.LIZ();
                                    if (listLIZ.size() >= 2) {
                                        if (interfaceC2203751BMv2.LIZLLL((C1BA1) ListProtector.get(listLIZ, listLIZ.size() - 2))) {
                                            for (List<C1BA1> listLIZ2 = interfaceC2203751BMv2.LIZ(); listLIZ2.size() != 0; listLIZ2 = interfaceC2203751BMv2.LIZ()) {
                                                interfaceC2203751BMv2.LJ((C1BA1) ListProtector.get(listLIZ2, 0));
                                            }
                                            interfaceC2203751BMv2.getName();
                                            arrayList.add("SettingAndAB");
                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                            sbLIZ3.append("rollBack: ");
                                            sbLIZ3.append(interfaceC2203751BMv2.toString());
                                            sbLIZ3.append(" successfully");
                                            C2200391B9x.LIZLLL("RollBackState", C2188811AlT.LIZIZ(sbLIZ3));
                                            z2 = true;
                                        } else {
                                            stringBuffer.append(",SettingAndAB");
                                            interfaceC2203751BMv2.getName();
                                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                            sbLIZ4.append("rollBack: ");
                                            sbLIZ4.append(interfaceC2203751BMv2.toString());
                                            sbLIZ4.append(" failed");
                                            C2200391B9x.LIZIZ("RollBackState", C2188811AlT.LIZIZ(sbLIZ4));
                                        }
                                    } else {
                                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                        sbLIZ5.append("rollBack: can't find ");
                                        sbLIZ5.append(interfaceC2203751BMv2.toString());
                                        sbLIZ5.append(" stable snapshot");
                                        C2200391B9x.LIZIZ("RollBackState", C2188811AlT.LIZIZ(sbLIZ5));
                                    }
                                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                    sbLIZ6.append("End rollBack: ");
                                    sbLIZ6.append(interfaceC2203751BMv2.toString());
                                    C2188811AlT.LIZIZ(sbLIZ6);
                                }
                                if (z2) {
                                    StringBuffer stringBuffer2 = new StringBuffer();
                                    for (String str : arrayList) {
                                        stringBuffer2.append(',');
                                        stringBuffer2.append(str);
                                    }
                                    C2200401B9y c2200401B9yLJI = C2200401B9y.LJI(this.LIZ.LJ);
                                    c2200401B9yLJI.getClass();
                                    JSONObject jSONObject3 = null;
                                    try {
                                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                        sbLIZ7.append(c2200401B9yLJI.LIZJ.getAbsolutePath());
                                        sbLIZ7.append("-tmp");
                                        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ7));
                                        if (c2200401B9yLJI.LIZJ.exists()) {
                                            C2200401B9y.LJFF(c0vsj);
                                        } else if (c0vsj.exists()) {
                                            c0vsj.renameTo(c2200401B9yLJI.LIZJ);
                                        }
                                        if (c2200401B9yLJI.LIZJ.exists()) {
                                            String fileToString = FileUtils.readFileToString(c2200401B9yLJI.LIZJ, Charset.forName("UTF-8"));
                                            C1BA0 c1ba0 = new C1BA0();
                                            c1ba0.LIZIZ = fileToString;
                                            c1ba0.LIZ = 0L;
                                            jSONObject3 = new JSONObject();
                                            try {
                                                jSONObject3.put("settingsAndAB", c1ba0.LIZIZ);
                                            } catch (JSONException e3) {
                                                TryCatchGuardChecker.doCheck(e3);
                                            }
                                        }
                                    } catch (Exception e4) {
                                        TryCatchGuardChecker.doCheck(e4);
                                        C2200401B9y.LJIIIIZZ(e4);
                                    }
                                    SafeModeReporter.CrashInfo crashInfoLIZ2 = SafeModeReporter.CrashInfo.LIZ(exceptionRecordLIZLLL);
                                    String strSubstring = stringBuffer2.substring(1);
                                    JSONObject jSONObject4 = new JSONObject();
                                    try {
                                        jSONObject4.put("cf_names", strSubstring);
                                        jSONObject4.put("crash", crashInfoLIZ2.LIZLLL());
                                        if (jSONObject3 != null) {
                                            jSONObject4.put("payload", jSONObject3);
                                        }
                                    } catch (JSONException e5) {
                                        TryCatchGuardChecker.doCheck(e5);
                                    }
                                    SafeModeReporter.LIZLLL("safemode_done_roll_back", jSONObject4);
                                }
                                if (stringBuffer.length() > 0) {
                                    String strSubstring2 = stringBuffer.substring(1);
                                    JSONObject jSONObject5 = new JSONObject();
                                    try {
                                        jSONObject5.put("cf_names", strSubstring2);
                                    } catch (JSONException e6) {
                                        TryCatchGuardChecker.doCheck(e6);
                                    }
                                    SafeModeReporter.LIZLLL("safemode_roll_back_fail", jSONObject5);
                                }
                                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                sbLIZ8.append("End smart rollback result ");
                                sbLIZ8.append(z2);
                                C2200391B9x.LIZLLL("RollBackState", C2188811AlT.LIZIZ(sbLIZ8));
                                this.LIZ.LJFF = false;
                                if (z2) {
                                    C2203571BMd c2203571BMd = C2203571BMd.LJIILLIIL;
                                    C2200391B9x.LIZLLL("RollBackState", C786410Ut5.j4("try to enter mQuietState QuietPeriod: %d", new Object[]{Long.valueOf(c2203571BMd.LJIIJJI.LIZ().longValue())}));
                                    C1BN4 c1bn42 = this.LIZ.mQuietState;
                                    if (c1bn42 instanceof QuietState) {
                                        ((QuietState) c1bn42).LIZIZ = Process.myPid();
                                        C2200391B9x.LIZLLL("RollBackState", "setEnterQuietStatePid");
                                    }
                                    LJIIIIZZ(this.LIZ.mQuietState, new QuietState.QuietStateParam(c2203571BMd.LJIIJJI.LIZ().longValue(), false, -1, System.currentTimeMillis()));
                                    return;
                                }
                            }
                            i = 3;
                        }
                        LJIIIZ(i);
                    }

                    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState, X.C1BN4
                    public final void LIZ(long j, String str, String str2) {
                        C2200391B9x.LIZIZ("RollBackState", "find exception in Rolling Back");
                    }
                };
            }
            if (nVarLJIILIIL.LJJIJIIJIL("mQuietState")) {
                smartProtectedStateMachine.mQuietState = (C1BN4) GsonProtectorUtils.fromJson(SmartProtectedStateMachine.LJII, nVarLJIILIIL.LJJIIZ("mQuietState").toString(), QuietState.class);
            } else {
                smartProtectedStateMachine.mQuietState = new QuietState();
            }
            if (nVarLJIILIIL.LJJIJIIJIL("mStopState")) {
                smartProtectedStateMachine.mStopState = (C1BN4) GsonProtectorUtils.fromJson(SmartProtectedStateMachine.LJII, nVarLJIILIIL.LJJIIZ("mStopState").toString(), C1BN3.class);
                return smartProtectedStateMachine;
            }
            smartProtectedStateMachine.mStopState = new BaseState() { // from class: X.1BN3
                @Override // X.C1BN4
                public final String getName() {
                    return "StopState";
                }

                @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState
                public final void LJII(C1BN4 c1bn4) {
                    C2200391B9x.LIZLLL("StopState", "onExitState: ");
                }

                @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState
                public final void LJI(C1BN4 c1bn4, StateParam stateParam) {
                    if (stateParam instanceof StateParam) {
                        this.stateParam = stateParam;
                    }
                    C2200391B9x.LIZLLL("StopState", "onEnterState: ");
                }
            };
            return smartProtectedStateMachine;
        }
    }

    public final synchronized void LIZJ(long j, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            C2200391B9x.LIZIZ("SmartProtectedStateMachine", C786410Ut5.j4("skip handleException crashReason is null", new Object[0]));
            SafeModeReporter.LIZJ(SafeModeReporter.CrashInfo.LIZIZ(str, str2), 1);
            return;
        }
        if (C2200381B9w.LIZ(this.LJ)) {
            C2200391B9x.LIZLLL("SmartProtectedStateMachine", C786410Ut5.j4("has safe mode process so skip this crash", new Object[0]));
            SafeModeReporter.LIZJ(SafeModeReporter.CrashInfo.LIZIZ(str, str2), 2);
            return;
        }
        C2200391B9x.LIZLLL("SmartProtectedStateMachine", C786410Ut5.j4("crash type: %s reason: %s", new Object[]{str, str2}));
        if (!this.LIZJ && this.LIZ == null) {
            C2200391B9x.LIZLLL("SmartProtectedStateMachine", C786410Ut5.j4("try start immediately", new Object[0]));
            LJII();
        }
        if (this.LIZ != null) {
            this.LIZ.LIZ(j, str, str2);
            C1BMY.LIZIZ().getClass();
            ExceptionManager.LIZJ(this.LJ).LJFF();
            return;
        }
        SafeModeReporter.LIZJ(SafeModeReporter.CrashInfo.LIZIZ(str, str2), 3);
    }
}
