package com.ss.android.ugc.aweme.property;

import X.C09CT;
import X.C0C64;
import X.C13BV;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class CreativeToolsCachingDurationValidity {
    public static final PanelCachingConfig LIZ;
    public static final Map<String, Long> LIZIZ;

    public static final class PanelCachingConfigEntry {

        @C09CT("panel_name")
        public final String panel;

        @C09CT("validity")
        public final long validityDuration;

        public PanelCachingConfigEntry() {
            this("", 0L);
        }

        public PanelCachingConfigEntry(String str, long j) {
            this.panel = str;
            this.validityDuration = j;
        }
    }

    static {
        new CreativeToolsCachingDurationValidity();
        LIZ = new PanelCachingConfig(null, 1, null);
        LIZIZ = new LinkedHashMap();
    }

    public static final Map<String, Long> LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        PanelCachingConfig panelCachingConfig = LIZ;
        PanelCachingConfig panelCachingConfig2 = (PanelCachingConfig) c0c64LJIILLIIL.LJJII(PanelCachingConfig.class, panelCachingConfig, "creative_tools_caching_duration_validity_seconds", true);
        if (panelCachingConfig2 != null) {
            panelCachingConfig = panelCachingConfig2;
        }
        for (PanelCachingConfigEntry panelCachingConfigEntry : panelCachingConfig.entries) {
            LIZIZ.put(panelCachingConfigEntry.panel, Long.valueOf(panelCachingConfigEntry.validityDuration));
        }
        return LIZIZ;
    }

    public static final class PanelCachingConfig {

        @C09CT("entries")
        public final List<PanelCachingConfigEntry> entries;

        public PanelCachingConfig() {
            this(null, 1, null);
        }

        public PanelCachingConfig(List<PanelCachingConfigEntry> list) {
            this.entries = list;
        }

        public PanelCachingConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
