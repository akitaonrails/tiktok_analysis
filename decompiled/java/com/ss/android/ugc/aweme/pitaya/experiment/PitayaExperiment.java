package com.ss.android.ugc.aweme.pitaya.experiment;

import X.C005F;
import X.C005G;
import X.C09CT;
import X.C0C64;
import X.InterfaceC304970BxP;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class PitayaExperiment {
    public static Config LIZ = LIZIZ();
    public static JSONObject LIZIZ;
    public static volatile boolean LIZJ;
    public static volatile boolean LIZLLL;

    static {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(String.valueOf(LIZ.content));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            jSONObject = new JSONObject();
        }
        LIZIZ = jSONObject;
        try {
            new JSONObject(String.valueOf(LIZ.magi));
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject = LIZIZ.optJSONObject("pitaya_global");
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.optBoolean("enable_cep");
        }
        JSONObject jSONObjectOptJSONObject2 = LIZIZ.optJSONObject("pitaya_global");
        LIZJ = jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.optBoolean("enable_resource_policy_check");
        JSONObject jSONObjectOptJSONObject3 = LIZIZ.optJSONObject("pitaya_global");
        LIZLLL = jSONObjectOptJSONObject3 != null && jSONObjectOptJSONObject3.optBoolean("enable_plugin_install_fix");
        SettingsManager.LIZLLL().LJIIIZ(new InterfaceC304970BxP() { // from class: X.145A
            /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
            @Override // X.InterfaceC304970BxP
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    r3 = this;
                    com.ss.android.ugc.aweme.pitaya.experiment.PitayaExperiment$Config r0 = com.ss.android.ugc.aweme.pitaya.experiment.PitayaExperiment.LIZIZ()
                    com.ss.android.ugc.aweme.pitaya.experiment.PitayaExperiment.LIZ = r0
                    org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L14
                    com.ss.android.ugc.aweme.pitaya.experiment.PitayaExperiment$Config r0 = com.ss.android.ugc.aweme.pitaya.experiment.PitayaExperiment.LIZ     // Catch: java.lang.Exception -> L14
                    com.google.gson.n r0 = r0.content     // Catch: java.lang.Exception -> L14
                    java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L14
                    r1.<init>(r0)     // Catch: java.lang.Exception -> L14
                    goto L1d
                L14:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    org.json.JSONObject r1 = new org.json.JSONObject
                    r1.<init>()
                L1d:
                    com.ss.android.ugc.aweme.pitaya.experiment.PitayaExperiment.LIZIZ = r1
                    org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L2d
                    com.ss.android.ugc.aweme.pitaya.experiment.PitayaExperiment$Config r0 = com.ss.android.ugc.aweme.pitaya.experiment.PitayaExperiment.LIZ     // Catch: java.lang.Exception -> L2d
                    com.google.gson.n r0 = r0.magi     // Catch: java.lang.Exception -> L2d
                    java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L2d
                    r1.<init>(r0)     // Catch: java.lang.Exception -> L2d
                    goto L36
                L2d:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    org.json.JSONObject r0 = new org.json.JSONObject
                    r0.<init>()
                L36:
                    org.json.JSONObject r0 = com.ss.android.ugc.aweme.pitaya.experiment.PitayaExperiment.LIZIZ
                    java.lang.String r2 = "pitaya_global"
                    org.json.JSONObject r1 = r0.optJSONObject(r2)
                    if (r1 == 0) goto L45
                    java.lang.String r0 = "enable_cep"
                    r1.optBoolean(r0)
                L45:
                    org.json.JSONObject r0 = com.ss.android.ugc.aweme.pitaya.experiment.PitayaExperiment.LIZIZ
                    org.json.JSONObject r1 = r0.optJSONObject(r2)
                    if (r1 == 0) goto L59
                    java.lang.String r0 = "enable_resource_policy_check"
                    boolean r1 = r1.optBoolean(r0)
                    r0 = 1
                    if (r1 != r0) goto L59
                L56:
                    com.ss.android.ugc.aweme.pitaya.experiment.PitayaExperiment.LIZJ = r0
                    return
                L59:
                    r0 = 0
                    goto L56
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C145A.LIZ():void");
            }
        });
    }

    public static Config LIZIZ() {
        Config config = (Config) SettingsManager.LIZLLL().LJIIIIZZ("pitaya_general_settings", Config.class, null);
        if (config == null) {
            config = new Config(0, null, null);
        }
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        PitayaAbSettingsPsmConfig pitayaAbSettingsPsmConfig = C005F.LIZ;
        PitayaAbSettingsPsmConfig pitayaAbSettingsPsmConfig2 = (PitayaAbSettingsPsmConfig) c0c64LJIILLIIL.LJJII(PitayaAbSettingsPsmConfig.class, pitayaAbSettingsPsmConfig, "pitaya_ab_settings_psm", false);
        if (pitayaAbSettingsPsmConfig2 != null) {
            pitayaAbSettingsPsmConfig = pitayaAbSettingsPsmConfig2;
        }
        n nVar = pitayaAbSettingsPsmConfig.pitayaAbSettings;
        C0C64 c0c64LJIILLIIL2 = C0C64.LJIILLIIL();
        PitayaBusinessSettingsPsmConfig pitayaBusinessSettingsPsmConfig = C005G.LIZ;
        PitayaBusinessSettingsPsmConfig pitayaBusinessSettingsPsmConfig2 = (PitayaBusinessSettingsPsmConfig) c0c64LJIILLIIL2.LJJII(PitayaBusinessSettingsPsmConfig.class, pitayaBusinessSettingsPsmConfig, "pitaya_business_settings_psm", false);
        if (pitayaBusinessSettingsPsmConfig2 != null) {
            pitayaBusinessSettingsPsmConfig = pitayaBusinessSettingsPsmConfig2;
        }
        n nVar2 = pitayaBusinessSettingsPsmConfig.content;
        if (nVar == null && nVar2 == null) {
            return config;
        }
        n nVar3 = config.content;
        n nVarLIZJ = nVar3 != null ? nVar3.LIZJ() : new n();
        if (nVar != null) {
            k kVarLJJIIZ = nVarLIZJ.LJJIIZ("pitaya_ab_settings");
            n nVar4 = (kVarLJJIIZ == null || !(kVarLJJIIZ instanceof n)) ? new n() : kVarLJJIIZ.LJIILIIL();
            for (Map.Entry<String, k> entry : nVar.entrySet()) {
                String key = entry.getKey();
                k value = entry.getValue();
                nVar4.LJJIFFI(key, value != null ? value.LIZJ() : null);
            }
            nVarLIZJ.LJJIFFI("pitaya_ab_settings", nVar4);
        }
        if (nVar2 != null) {
            LIZ(nVarLIZJ, nVar2);
        }
        return new Config(config.enable, nVarLIZJ, config.magi);
    }

    public static void LIZ(n nVar, n nVar2) {
        k kVarLIZJ;
        for (Map.Entry<String, k> entry : nVar2.entrySet()) {
            String key = entry.getKey();
            k value = entry.getValue();
            k kVarLJJIIZ = nVar.LJJIIZ(key);
            if (kVarLJJIIZ != null && (kVarLJJIIZ instanceof n)) {
                if (value != null) {
                    if (value instanceof n) {
                        LIZ(kVarLJJIIZ.LJIILIIL(), value.LJIILIIL());
                    } else {
                        kVarLIZJ = value.LIZJ();
                        nVar.LJJIFFI(key, kVarLIZJ);
                    }
                } else {
                    kVarLIZJ = null;
                    nVar.LJJIFFI(key, kVarLIZJ);
                }
            } else {
                if (value != null) {
                    kVarLIZJ = value.LIZJ();
                } else {
                    kVarLIZJ = null;
                }
                nVar.LJJIFFI(key, kVarLIZJ);
            }
        }
    }

    public static final class Config {

        @C09CT("content")
        public final n content;

        @C09CT("enable")
        public final int enable;

        @C09CT("magi")
        public final n magi;

        public Config() {
            this(0, null, null);
        }

        public Config(int i, n nVar, n nVar2) {
            this.enable = i;
            this.content = nVar;
            this.magi = nVar2;
        }
    }
}
