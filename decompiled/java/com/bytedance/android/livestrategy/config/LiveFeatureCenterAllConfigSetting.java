package com.bytedance.android.livestrategy.config;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_feature_center_all_config")
public final class LiveFeatureCenterAllConfigSetting {
    public static final LiveFeatureCenterAllConfigSetting INSTANCE = new LiveFeatureCenterAllConfigSetting();
    public static final LiveFeatureCenterAllConfig DEFAULT = new LiveFeatureCenterAllConfig(new FeatureAllCenter(C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ()), new FeatureAllCenter(C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ()), new FeatureAllCenter(C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ()), new FeatureAllCenter(C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ()));
    public static LiveFeatureCenterConfig config = new LiveFeatureCenterConfig(new FeatureCenter(null, null, null, null, 15, null), new FeatureCenter(null, null, null, null, 15, null), new FeatureCenter(null, null, null, null, 15, null), new FeatureCenter(null, null, null, null, 15, null));

    public final LiveFeatureCenterAllConfig value() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveFeatureCenterAllConfig liveFeatureCenterAllConfig = DEFAULT;
        LiveFeatureCenterAllConfig liveFeatureCenterAllConfig2 = (LiveFeatureCenterAllConfig) settingsManager.getValueSafely("live_feature_center_all_config", liveFeatureCenterAllConfig);
        return liveFeatureCenterAllConfig2 != null ? liveFeatureCenterAllConfig2 : liveFeatureCenterAllConfig;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0104 A[PHI: r3
      0x0104: PHI (r3v11 java.util.List) = (r3v10 java.util.List), (r3v26 java.util.List), (r3v26 java.util.List), (r3v26 java.util.List), (r3v26 java.util.List) binds: [B:97:0x00ee, B:99:0x00f2, B:101:0x00f6, B:103:0x00fc, B:105:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0108 A[PHI: r2 r3
      0x0108: PHI (r2v20 java.util.List) = (r2v8 java.util.List), (r2v21 java.util.List) binds: [B:107:0x0106, B:105:0x0102] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r3v25 java.util.List) = (r3v11 java.util.List), (r3v26 java.util.List) binds: [B:107:0x0106, B:105:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x011c A[PHI: r2 r3
      0x011c: PHI (r2v9 java.util.List) = (r2v8 java.util.List), (r2v20 java.util.List), (r2v20 java.util.List), (r2v20 java.util.List), (r2v20 java.util.List) binds: [B:107:0x0106, B:109:0x010a, B:111:0x010e, B:113:0x0114, B:115:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x011c: PHI (r3v12 java.util.List) = (r3v11 java.util.List), (r3v25 java.util.List), (r3v25 java.util.List), (r3v25 java.util.List), (r3v25 java.util.List) binds: [B:107:0x0106, B:109:0x010a, B:111:0x010e, B:113:0x0114, B:115:0x011a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0120 A[PHI: r1 r2 r3
      0x0120: PHI (r1v14 java.util.List) = (r1v6 java.util.List), (r1v15 java.util.List) binds: [B:117:0x011e, B:115:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x0120: PHI (r2v19 java.util.List) = (r2v9 java.util.List), (r2v20 java.util.List) binds: [B:117:0x011e, B:115:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x0120: PHI (r3v24 java.util.List) = (r3v12 java.util.List), (r3v25 java.util.List) binds: [B:117:0x011e, B:115:0x011a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0134 A[PHI: r1 r2 r3
      0x0134: PHI (r1v7 java.util.List) = (r1v6 java.util.List), (r1v14 java.util.List), (r1v14 java.util.List), (r1v14 java.util.List), (r1v14 java.util.List) binds: [B:117:0x011e, B:119:0x0122, B:121:0x0126, B:123:0x012c, B:125:0x0132] A[DONT_GENERATE, DONT_INLINE]
      0x0134: PHI (r2v10 java.util.List) = (r2v9 java.util.List), (r2v19 java.util.List), (r2v19 java.util.List), (r2v19 java.util.List), (r2v19 java.util.List) binds: [B:117:0x011e, B:119:0x0122, B:121:0x0126, B:123:0x012c, B:125:0x0132] A[DONT_GENERATE, DONT_INLINE]
      0x0134: PHI (r3v13 java.util.List) = (r3v12 java.util.List), (r3v24 java.util.List), (r3v24 java.util.List), (r3v24 java.util.List), (r3v24 java.util.List) binds: [B:117:0x011e, B:119:0x0122, B:121:0x0126, B:123:0x012c, B:125:0x0132] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0155 A[PHI: r3
      0x0155: PHI (r3v22 java.util.List) = (r3v15 java.util.List), (r3v23 java.util.List) binds: [B:138:0x0153, B:136:0x014f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0169 A[PHI: r3
      0x0169: PHI (r3v16 java.util.List) = (r3v15 java.util.List), (r3v22 java.util.List), (r3v22 java.util.List), (r3v22 java.util.List), (r3v22 java.util.List) binds: [B:138:0x0153, B:140:0x0157, B:142:0x015b, B:144:0x0161, B:146:0x0167] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x016d A[PHI: r2 r3
      0x016d: PHI (r2v17 java.util.List) = (r2v12 java.util.List), (r2v18 java.util.List) binds: [B:148:0x016b, B:146:0x0167] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r3v21 java.util.List) = (r3v16 java.util.List), (r3v22 java.util.List) binds: [B:148:0x016b, B:146:0x0167] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0181 A[PHI: r2 r3
      0x0181: PHI (r2v13 java.util.List) = (r2v12 java.util.List), (r2v17 java.util.List), (r2v17 java.util.List), (r2v17 java.util.List), (r2v17 java.util.List) binds: [B:148:0x016b, B:150:0x016f, B:152:0x0173, B:154:0x0179, B:156:0x017f] A[DONT_GENERATE, DONT_INLINE]
      0x0181: PHI (r3v17 java.util.List) = (r3v16 java.util.List), (r3v21 java.util.List), (r3v21 java.util.List), (r3v21 java.util.List), (r3v21 java.util.List) binds: [B:148:0x016b, B:150:0x016f, B:152:0x0173, B:154:0x0179, B:156:0x017f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0185 A[PHI: r1 r2 r3
      0x0185: PHI (r1v12 java.util.List) = (r1v9 java.util.List), (r1v13 java.util.List) binds: [B:158:0x0183, B:156:0x017f] A[DONT_GENERATE, DONT_INLINE]
      0x0185: PHI (r2v16 java.util.List) = (r2v13 java.util.List), (r2v17 java.util.List) binds: [B:158:0x0183, B:156:0x017f] A[DONT_GENERATE, DONT_INLINE]
      0x0185: PHI (r3v20 java.util.List) = (r3v17 java.util.List), (r3v21 java.util.List) binds: [B:158:0x0183, B:156:0x017f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0199 A[PHI: r1 r2 r3
      0x0199: PHI (r1v10 java.util.List) = (r1v9 java.util.List), (r1v12 java.util.List), (r1v12 java.util.List), (r1v12 java.util.List), (r1v12 java.util.List) binds: [B:158:0x0183, B:160:0x0187, B:162:0x018b, B:164:0x0191, B:166:0x0197] A[DONT_GENERATE, DONT_INLINE]
      0x0199: PHI (r2v14 java.util.List) = (r2v13 java.util.List), (r2v16 java.util.List), (r2v16 java.util.List), (r2v16 java.util.List), (r2v16 java.util.List) binds: [B:158:0x0183, B:160:0x0187, B:162:0x018b, B:164:0x0191, B:166:0x0197] A[DONT_GENERATE, DONT_INLINE]
      0x0199: PHI (r3v18 java.util.List) = (r3v17 java.util.List), (r3v20 java.util.List), (r3v20 java.util.List), (r3v20 java.util.List), (r3v20 java.util.List) binds: [B:158:0x0183, B:160:0x0187, B:162:0x018b, B:164:0x0191, B:166:0x0197] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0026 A[PHI: r3
      0x0026: PHI (r3v34 java.util.List) = (r3v0 java.util.List), (r3v35 java.util.List) binds: [B:15:0x0024, B:13:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a A[PHI: r3
      0x003a: PHI (r3v1 java.util.List) = (r3v0 java.util.List), (r3v34 java.util.List), (r3v34 java.util.List), (r3v34 java.util.List), (r3v34 java.util.List) binds: [B:15:0x0024, B:17:0x0028, B:19:0x002c, B:21:0x0032, B:23:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e A[PHI: r2 r3
      0x003e: PHI (r2v26 java.util.List) = (r2v0 java.util.List), (r2v27 java.util.List) binds: [B:25:0x003c, B:23:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x003e: PHI (r3v33 java.util.List) = (r3v1 java.util.List), (r3v34 java.util.List) binds: [B:25:0x003c, B:23:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0052 A[PHI: r2 r3
      0x0052: PHI (r2v1 java.util.List) = (r2v0 java.util.List), (r2v26 java.util.List), (r2v26 java.util.List), (r2v26 java.util.List), (r2v26 java.util.List) binds: [B:25:0x003c, B:27:0x0040, B:29:0x0044, B:31:0x004a, B:33:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r3v2 java.util.List) = (r3v1 java.util.List), (r3v33 java.util.List), (r3v33 java.util.List), (r3v33 java.util.List), (r3v33 java.util.List) binds: [B:25:0x003c, B:27:0x0040, B:29:0x0044, B:31:0x004a, B:33:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0056 A[PHI: r1 r2 r3
      0x0056: PHI (r1v18 java.util.List) = (r1v0 java.util.List), (r1v19 java.util.List) binds: [B:35:0x0054, B:33:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0056: PHI (r2v25 java.util.List) = (r2v1 java.util.List), (r2v26 java.util.List) binds: [B:35:0x0054, B:33:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0056: PHI (r3v32 java.util.List) = (r3v2 java.util.List), (r3v33 java.util.List) binds: [B:35:0x0054, B:33:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006a A[PHI: r1 r2 r3
      0x006a: PHI (r1v1 java.util.List) = (r1v0 java.util.List), (r1v18 java.util.List), (r1v18 java.util.List), (r1v18 java.util.List), (r1v18 java.util.List) binds: [B:35:0x0054, B:37:0x0058, B:39:0x005c, B:41:0x0062, B:43:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x006a: PHI (r2v2 java.util.List) = (r2v1 java.util.List), (r2v25 java.util.List), (r2v25 java.util.List), (r2v25 java.util.List), (r2v25 java.util.List) binds: [B:35:0x0054, B:37:0x0058, B:39:0x005c, B:41:0x0062, B:43:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x006a: PHI (r3v3 java.util.List) = (r3v2 java.util.List), (r3v32 java.util.List), (r3v32 java.util.List), (r3v32 java.util.List), (r3v32 java.util.List) binds: [B:35:0x0054, B:37:0x0058, B:39:0x005c, B:41:0x0062, B:43:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008b A[PHI: r3
      0x008b: PHI (r3v30 java.util.List) = (r3v5 java.util.List), (r3v31 java.util.List) binds: [B:56:0x0089, B:54:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x009f A[PHI: r3
      0x009f: PHI (r3v6 java.util.List) = (r3v5 java.util.List), (r3v30 java.util.List), (r3v30 java.util.List), (r3v30 java.util.List), (r3v30 java.util.List) binds: [B:56:0x0089, B:58:0x008d, B:60:0x0091, B:62:0x0097, B:64:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a3 A[PHI: r2 r3
      0x00a3: PHI (r2v23 java.util.List) = (r2v4 java.util.List), (r2v24 java.util.List) binds: [B:66:0x00a1, B:64:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r3v29 java.util.List) = (r3v6 java.util.List), (r3v30 java.util.List) binds: [B:66:0x00a1, B:64:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b7 A[PHI: r2 r3
      0x00b7: PHI (r2v5 java.util.List) = (r2v4 java.util.List), (r2v23 java.util.List), (r2v23 java.util.List), (r2v23 java.util.List), (r2v23 java.util.List) binds: [B:66:0x00a1, B:68:0x00a5, B:70:0x00a9, B:72:0x00af, B:74:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r3v7 java.util.List) = (r3v6 java.util.List), (r3v29 java.util.List), (r3v29 java.util.List), (r3v29 java.util.List), (r3v29 java.util.List) binds: [B:66:0x00a1, B:68:0x00a5, B:70:0x00a9, B:72:0x00af, B:74:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00bb A[PHI: r1 r2 r3
      0x00bb: PHI (r1v16 java.util.List) = (r1v3 java.util.List), (r1v17 java.util.List) binds: [B:76:0x00b9, B:74:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00bb: PHI (r2v22 java.util.List) = (r2v5 java.util.List), (r2v23 java.util.List) binds: [B:76:0x00b9, B:74:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00bb: PHI (r3v28 java.util.List) = (r3v7 java.util.List), (r3v29 java.util.List) binds: [B:76:0x00b9, B:74:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00cf A[PHI: r1 r2 r3
      0x00cf: PHI (r1v4 java.util.List) = (r1v3 java.util.List), (r1v16 java.util.List), (r1v16 java.util.List), (r1v16 java.util.List), (r1v16 java.util.List) binds: [B:76:0x00b9, B:78:0x00bd, B:80:0x00c1, B:82:0x00c7, B:84:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r2v6 java.util.List) = (r2v5 java.util.List), (r2v22 java.util.List), (r2v22 java.util.List), (r2v22 java.util.List), (r2v22 java.util.List) binds: [B:76:0x00b9, B:78:0x00bd, B:80:0x00c1, B:82:0x00c7, B:84:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r3v8 java.util.List) = (r3v7 java.util.List), (r3v28 java.util.List), (r3v28 java.util.List), (r3v28 java.util.List), (r3v28 java.util.List) binds: [B:76:0x00b9, B:78:0x00bd, B:80:0x00c1, B:82:0x00c7, B:84:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f0 A[PHI: r3
      0x00f0: PHI (r3v26 java.util.List) = (r3v10 java.util.List), (r3v27 java.util.List) binds: [B:97:0x00ee, B:95:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.android.livestrategy.config.LiveFeatureCenterConfig getValue() {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livestrategy.config.LiveFeatureCenterAllConfigSetting.getValue():com.bytedance.android.livestrategy.config.LiveFeatureCenterConfig");
    }

    public final boolean isNotEmpty() {
        FeatureAllCenter featureAllCenter;
        Map<String, ? extends Object> map;
        FeatureAllCenter featureAllCenter2;
        Map<String, ? extends Object> map2;
        LiveFeatureCenterAllConfig liveFeatureCenterAllConfigValue = value();
        return liveFeatureCenterAllConfigValue == null || (featureAllCenter = liveFeatureCenterAllConfigValue.appFeatureCenter) == null || (map = featureAllCenter.portraitConfig) == null || !map.isEmpty() || (featureAllCenter2 = liveFeatureCenterAllConfigValue.appFeatureCenter) == null || (map2 = featureAllCenter2.pitayaPythonBusiness) == null || !map2.isEmpty();
    }
}
