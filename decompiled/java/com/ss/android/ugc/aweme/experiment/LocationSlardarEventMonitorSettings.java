package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class LocationSlardarEventMonitorSettings {
    public static final EventConfig[] LIZ = new EventConfig[0];
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(116));

    public static final class EventConfig {
        public static final int $stable = 8;

        @C09CT("categories")
        public final List<String> categories;

        @C09CT("event_name")
        public final String eventName;

        @C09CT("metrics")
        public final List<String> metrics;

        @C09CT("sample_rate")
        public final float sampleRate;

        public EventConfig() {
            this(null, null, null, 0.0f);
        }

        public EventConfig(String str, List<String> list, List<String> list2, float f) {
            this.eventName = str;
            this.metrics = list;
            this.categories = list2;
            this.sampleRate = f;
        }
    }
}
