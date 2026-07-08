package com.bytedance.pitaya.api;

import X.C1344305Nx;
import X.C145N;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC2222921BzO;
import X.InterfaceC2222931BzP;
import Y.ARunnableS107S0000000_34;
import Y.ARunnableS134S0100000_34;
import com.bytedance.pitaya.api.PitayaBootLoader;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class PitayaBootLoader implements ReflectionCall {
    public static InterfaceC2222931BzP bootExecutor;
    public static BootTask coldStartFinishBootTask;
    public static boolean forceWaitBootFinish;
    public static boolean init;
    public static InterfaceC2222921BzO mAppAbilityProvider;
    public static final PitayaBootLoader INSTANCE = new PitayaBootLoader();
    public static final ExecutorService bootQueue = C786410Ut5.h4();
    public static final Map<Long, BootTask> delayBootTasks = new LinkedHashMap();

    public static final class BootTask implements Runnable, ReflectionCall {
        public final C1344305Nx bootAbilityBuilder;
        public String bootFeaturePreloadModuleTypes;
        public long pluginLoadDuration;

        @Override // java.lang.Runnable
        public void run() {
            C1C7U.LIZ("PitayaBootLoader$BootTask@f904.run");
            com_bytedance_pitaya_api_PitayaBootLoader$BootTask_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            C1C7U.LIZIZ("PitayaBootLoader$BootTask@f904.run");
        }

        public final void addCepModule() {
            this.bootAbilityBuilder.LIZ |= 4;
        }

        public final void addPackageModule() {
            this.bootAbilityBuilder.LIZ |= 32;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [X.1BzN] */
        public void com_bytedance_pitaya_api_PitayaBootLoader$BootTask__run$___twin___() {
            PitayaBootLoader pitayaBootLoader = PitayaBootLoader.INSTANCE;
            if (pitayaBootLoader.getBootExecutor() != null) {
                pitayaBootLoader.getBootExecutor().executeTask(this);
                return;
            }
            final long jCurrentTimeMillis = System.currentTimeMillis();
            InterfaceC2222921BzO interfaceC2222921BzO = PitayaBootLoader.mAppAbilityProvider;
            InterfaceC2222921BzO interfaceC2222921BzO2 = interfaceC2222921BzO;
            if (interfaceC2222921BzO == null) {
                interfaceC2222921BzO2 = 0;
            }
            interfaceC2222921BzO2.LIZ(new C145N() { // from class: X.1BzN
                @Override // X.C145N
                public final void onFinish(boolean z) {
                    this.LIZ.setPluginLoadDuration(System.currentTimeMillis() - jCurrentTimeMillis);
                    if (z) {
                        PitayaBootLoader pitayaBootLoader2 = PitayaBootLoader.INSTANCE;
                        if (pitayaBootLoader2.getBootExecutor() != null) {
                            pitayaBootLoader2.getBootExecutor().executeTask(this.LIZ);
                        }
                    }
                }
            });
        }

        public final void runInQueue() {
            PitayaBootLoader.bootQueue.submit(this);
        }

        public final C1344305Nx getBootAbilityBuilder() {
            return this.bootAbilityBuilder;
        }

        public final String getBootFeaturePreloadModuleTypes() {
            return this.bootFeaturePreloadModuleTypes;
        }

        public final long getPluginLoadDuration() {
            return this.pluginLoadDuration;
        }

        public BootTask(boolean z) {
            C1344305Nx c1344305Nx = new C1344305Nx();
            this.bootAbilityBuilder = c1344305Nx;
            this.bootFeaturePreloadModuleTypes = "";
            this.pluginLoadDuration = -1L;
            if (z) {
                c1344305Nx.LIZ = 32767;
            }
        }

        public static void com_bytedance_pitaya_api_PitayaBootLoader$BootTask_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(BootTask bootTask) {
            try {
                bootTask.com_bytedance_pitaya_api_PitayaBootLoader$BootTask__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }

        public final void addFeatureModule(JSONArray jSONArray) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String strOptString = jSONArray.optString(i);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.bootFeaturePreloadModuleTypes);
                sbLIZ.append(',');
                sbLIZ.append((Object) strOptString);
                this.bootFeaturePreloadModuleTypes = C2188811AlT.LIZIZ(sbLIZ);
            }
            this.bootAbilityBuilder.LIZ |= 8;
        }

        public final void setBootFeaturePreloadModuleTypes(String str) {
            this.bootFeaturePreloadModuleTypes = str;
        }

        public final void setPluginLoadDuration(long j) {
            this.pluginLoadDuration = j;
        }
    }

    public static /* synthetic */ void lambda$semisugar$commitBootTaskBySettings$lambda$0$0() {
        C1C7U.LIZ("PitayaBootLoader@f59d.commitBootTaskBySettings$1L");
        commitBootTaskBySettings$lambda$0();
        C1C7U.LIZIZ("PitayaBootLoader@f59d.commitBootTaskBySettings$1L");
    }

    public static /* synthetic */ void lambda$semisugar$commitBootTaskBySettings$lambda$2$0(BootTask bootTask) {
        C1C7U.LIZ("PitayaBootLoader@f59d.commitBootTaskBySettings$2L");
        commitBootTaskBySettings$lambda$2(bootTask);
        C1C7U.LIZIZ("PitayaBootLoader@f59d.commitBootTaskBySettings$2L");
    }

    public static /* synthetic */ void lambda$semisugar$commitBootTaskBySettings$lambda$2$lambda$1$0(BootTask bootTask) {
        C1C7U.LIZ("PitayaBootLoader@f59d.commitBootTaskBySettings$lambda$2$1L");
        commitBootTaskBySettings$lambda$2$lambda$1(bootTask);
        C1C7U.LIZIZ("PitayaBootLoader@f59d.commitBootTaskBySettings$lambda$2$1L");
    }

    public static /* synthetic */ void lambda$semisugar$commitBootTaskBySettings$lambda$3$0() {
        C1C7U.LIZ("PitayaBootLoader@f59d.commitBootTaskBySettings$3L");
        commitBootTaskBySettings$lambda$3();
        C1C7U.LIZIZ("PitayaBootLoader@f59d.commitBootTaskBySettings$3L");
    }

    public static final void commitBootTaskBySettings$lambda$0() {
        bootQueue.submit(coldStartFinishBootTask);
    }

    public static final void commitBootTaskBySettings$lambda$3() {
        bootQueue.submit(new BootTask(true));
    }

    private final BootTask getOrCreateColdStartFinishTask() {
        if (coldStartFinishBootTask == null) {
            coldStartFinishBootTask = new BootTask(false);
        }
        return coldStartFinishBootTask;
    }

    public final InterfaceC2222931BzP getBootExecutor() {
        return bootExecutor;
    }

    private final void collectCepBootTask(JSONObject jSONObject) {
        long jOptLong = jSONObject.optLong("cep", -2L);
        if (jOptLong >= 0) {
            getOrCreateDelayTask(jOptLong).addCepModule();
        } else {
            if (jOptLong != -1) {
                return;
            }
            getOrCreateColdStartFinishTask().addCepModule();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001d A[PHI: r6
      0x001d: PHI (r6v1 java.lang.Long) = (r6v0 java.lang.Long), (r6v3 java.lang.Long) binds: [B:3:0x0007, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void collectFeatureBootTask(org.json.JSONObject r8) {
        /*
            r7 = this;
            java.lang.String r0 = "feature"
            org.json.JSONObject r3 = r8.optJSONObject(r0)
            r6 = 0
            if (r3 == 0) goto L1d
            java.lang.String r2 = "delay"
            r0 = -2
            long r0 = r3.optLong(r2, r0)
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "preload_modules"
            org.json.JSONArray r5 = r3.optJSONArray(r0)
            if (r5 != 0) goto L22
        L1d:
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
        L22:
            if (r6 == 0) goto L39
            long r3 = r6.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L3a
            long r0 = r6.longValue()
            com.bytedance.pitaya.api.PitayaBootLoader$BootTask r0 = r7.getOrCreateDelayTask(r0)
            r0.addFeatureModule(r5)
        L39:
            return
        L3a:
            long r3 = r6.longValue()
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L39
            com.bytedance.pitaya.api.PitayaBootLoader$BootTask r0 = r7.getOrCreateColdStartFinishTask()
            r0.addFeatureModule(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pitaya.api.PitayaBootLoader.collectFeatureBootTask(org.json.JSONObject):void");
    }

    private final void collectPackageBootTask(JSONObject jSONObject) {
        long jOptLong = jSONObject.optLong("package", -2L);
        if (jOptLong >= 0) {
            getOrCreateDelayTask(jOptLong).addPackageModule();
        } else {
            if (jOptLong != -1) {
                return;
            }
            getOrCreateColdStartFinishTask().addPackageModule();
        }
    }

    private final void commitBootTaskBySettings(JSONObject jSONObject) {
        if (jSONObject.optBoolean("manual_boot")) {
            return;
        }
        long jOptLong = jSONObject.optLong("all", 70000L);
        collectCepBootTask(jSONObject);
        collectFeatureBootTask(jSONObject);
        collectPackageBootTask(jSONObject);
        forceWaitBootFinish = jSONObject.optBoolean("force_wait_boot_finish", false);
        InterfaceC2222921BzO interfaceC2222921BzO = null;
        if (coldStartFinishBootTask != null) {
            InterfaceC2222921BzO interfaceC2222921BzO2 = mAppAbilityProvider;
            if (interfaceC2222921BzO2 == null) {
                interfaceC2222921BzO2 = null;
            }
            interfaceC2222921BzO2.LIZJ(new ARunnableS107S0000000_34(0));
        }
        for (Map.Entry<Long, BootTask> entry : delayBootTasks.entrySet()) {
            long jLongValue = entry.getKey().longValue();
            BootTask value = entry.getValue();
            InterfaceC2222921BzO interfaceC2222921BzO3 = mAppAbilityProvider;
            if (interfaceC2222921BzO3 == null) {
                interfaceC2222921BzO3 = null;
            }
            interfaceC2222921BzO3.LIZIZ(jLongValue, new ARunnableS134S0100000_34(value, 12));
        }
        InterfaceC2222921BzO interfaceC2222921BzO4 = mAppAbilityProvider;
        if (interfaceC2222921BzO4 != null) {
            interfaceC2222921BzO = interfaceC2222921BzO4;
        }
        interfaceC2222921BzO.LIZIZ(jOptLong, new ARunnableS107S0000000_34(1));
    }

    public static final void commitBootTaskBySettings$lambda$2(BootTask bootTask) {
        if (forceWaitBootFinish) {
            InterfaceC2222921BzO interfaceC2222921BzO = mAppAbilityProvider;
            if (interfaceC2222921BzO == null) {
                interfaceC2222921BzO = null;
            }
            interfaceC2222921BzO.LIZJ(new ARunnableS134S0100000_34(bootTask, 13));
            return;
        }
        bootQueue.submit(bootTask);
    }

    public static final void commitBootTaskBySettings$lambda$2$lambda$1(BootTask bootTask) {
        bootQueue.submit(bootTask);
    }

    private final BootTask getOrCreateDelayTask(long j) {
        Map<Long, BootTask> map = delayBootTasks;
        if (map.get(Long.valueOf(j)) == null) {
            map.put(Long.valueOf(j), new BootTask(false));
        }
        return map.get(Long.valueOf(j));
    }

    public final void setBootExecutor(InterfaceC2222931BzP interfaceC2222931BzP) {
        bootExecutor = interfaceC2222931BzP;
    }

    public final synchronized void setup(JSONObject jSONObject, InterfaceC2222921BzO interfaceC2222921BzO) {
        if (init) {
            return;
        }
        init = true;
        mAppAbilityProvider = interfaceC2222921BzO;
        commitBootTaskBySettings(jSONObject);
    }
}
