package com.ss.android.ugc.aweme.analytics;

import X.C01GW;
import X.C09CT;
import X.C0C8B;
import X.C452501pT;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class AppLogDualReportSettings {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C0C8B());

    public static final class EventConfig {

        @C09CT("categories")
        public final Map<String, String> categories;

        @C09CT("extra")
        public final Map<String, String> extra;

        @C09CT("metrics")
        public final Map<String, String> metrics;

        @C09CT("sample_rate")
        public final float sampleRate;

        @C09CT("slardar_event")
        public final String slardarEvent;

        public EventConfig() {
            this(null, 0.05f, null, null, null);
        }

        public EventConfig(String str, float f, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
            this.slardarEvent = str;
            this.sampleRate = f;
            this.categories = map;
            this.metrics = map2;
            this.extra = map3;
        }
    }
}
