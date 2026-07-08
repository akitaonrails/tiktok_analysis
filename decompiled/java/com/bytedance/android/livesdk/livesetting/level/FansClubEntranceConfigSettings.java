package com.bytedance.android.livesdk.livesetting.level;

import X.C1697810uHb;
import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "fansclub_dynamic_trigger_configuration")
public final class FansClubEntranceConfigSettings {
    public static final FansClubEntranceConfigSettings INSTANCE = new FansClubEntranceConfigSettings();
    public static final ConfigData DEFAULT = new ConfigData(Collections.singletonList(new GuidanceConfig("milestone_updated", new DisplayConfiguration(0, 5, new ContentConfiguration(new TextConfig("ttlive_fanClub_relationMilestones_viewer_clubEntryBtn", "New milestone", new TextFormat("#F55D51", 600, 11)), null, 0, 0, 0, 0, null, null), new InteractionConfiguration(C2097608Jq.LJIIJ(new Pair("trigger_type", "milestone")), "aweme://roma_redirect/?spark_page=fan_club_celebrate_sticker_page_popup", -1, C2097608Jq.LJIIJ(new Pair("enter_from", "entrance")))), Collections.singletonList(new TriggerConfiguration(3, 1.0d, 0)), C1697810uHb.LJIIJJI(new BusinessDependency(2), new BusinessDependency(3)), null, null)), 0);

    public final ConfigData getFansClubEntranceConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        ConfigData configData = DEFAULT;
        ConfigData configData2 = (ConfigData) settingsManager.getValueSafely("fansclub_dynamic_trigger_configuration", configData);
        return configData2 != null ? configData2 : configData;
    }

    public final GuidanceConfig getConfigByKey(String str) {
        GuidanceConfig next;
        Iterator<GuidanceConfig> it2 = getFansClubEntranceConfig().configs.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.guidanceKey, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    private final Map<String, String> mergeInteractionParams(Map<String, String> map, Map<String, String> map2) {
        if (map != null && !map.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            if (map2 != null) {
                for (Map.Entry<String, String> entry : map2.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (key.length() > 0 && !linkedHashMap.containsKey(key)) {
                        linkedHashMap.put(key, value);
                    }
                }
            }
            return linkedHashMap;
        }
        if (map2 == null) {
            return new LinkedHashMap();
        }
        return map2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.android.livesdk.livesetting.level.GuidanceConfig buildDispatchConfig(com.bytedance.android.livesdk.livesetting.level.GuidanceConfig r18, java.lang.String r19, java.util.Map<java.lang.String, java.lang.String> r20) {
        /*
            r17 = this;
            r10 = r19
            r8 = r18
            com.bytedance.android.livesdk.livesetting.level.DisplayConfiguration r1 = r8.displayConfiguration
            r12 = 0
            if (r1 == 0) goto L5a
            com.bytedance.android.livesdk.livesetting.level.InteractionConfiguration r9 = r1.interactionConfiguration
            if (r9 == 0) goto L5b
            java.util.Map<java.lang.String, java.lang.String> r0 = r9.params
        Lf:
            r2 = r20
            r3 = r17
            java.util.Map r7 = r3.mergeInteractionParams(r2, r0)
            if (r9 == 0) goto L58
            java.util.Map<java.lang.String, java.lang.String> r0 = r9.eventParams
        L1b:
            java.util.Map r6 = r3.mergeInteractionParams(r2, r0)
            java.lang.String r11 = r8.guidanceKey
            if (r1 == 0) goto L48
            com.bytedance.android.livesdk.livesetting.level.DisplayConfiguration r12 = new com.bytedance.android.livesdk.livesetting.level.DisplayConfiguration
            int r5 = r1.templateType
            int r4 = r1.duration
            com.bytedance.android.livesdk.livesetting.level.ContentConfiguration r3 = r1.contentConfiguration
            com.bytedance.android.livesdk.livesetting.level.InteractionConfiguration r2 = new com.bytedance.android.livesdk.livesetting.level.InteractionConfiguration
            r1 = 0
            if (r10 == 0) goto L36
            int r0 = r10.length()
            if (r0 != 0) goto L3e
        L36:
            if (r9 == 0) goto L3c
            java.lang.String r10 = r9.schema
            if (r10 != 0) goto L3e
        L3c:
            java.lang.String r10 = ""
        L3e:
            if (r9 == 0) goto L42
            int r1 = r9.effectiveDelayTime
        L42:
            r2.<init>(r6, r10, r1, r7)
            r12.<init>(r5, r4, r3, r2)
        L48:
            java.util.List<com.bytedance.android.livesdk.livesetting.level.TriggerConfiguration> r13 = r8.triggerConfiguration
            java.util.List<com.bytedance.android.livesdk.livesetting.level.BusinessDependency> r14 = r8.businessDependencyConfiguration
            java.util.List<com.bytedance.android.livesdk.livesetting.level.PermissionConfiguration> r15 = r8.permissionConfiguration
            java.util.List<com.bytedance.android.livesdk.livesetting.level.FrequencyConfiguration> r0 = r8.frequencyConfiguration
            com.bytedance.android.livesdk.livesetting.level.GuidanceConfig r10 = new com.bytedance.android.livesdk.livesetting.level.GuidanceConfig
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            return r10
        L58:
            r0 = r12
            goto L1b
        L5a:
            r9 = r12
        L5b:
            r0 = r12
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.level.FansClubEntranceConfigSettings.buildDispatchConfig(com.bytedance.android.livesdk.livesetting.level.GuidanceConfig, java.lang.String, java.util.Map):com.bytedance.android.livesdk.livesetting.level.GuidanceConfig");
    }
}
