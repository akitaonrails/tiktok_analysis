package com.ss.android.ugc.aweme.social.creation.api.mediapicker.exp;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes31.dex */
public final class SocialAlbumColorExtractionConfig implements Serializable {
    public static final int $stable = 8;

    @C09CT("main_color_config")
    public final MainColorConfig mainColorConfig;
    public final List<Range> ranges;

    public SocialAlbumColorExtractionConfig() {
        this(null, null, 3, null);
    }

    public SocialAlbumColorExtractionConfig(MainColorConfig mainColorConfig, List<Range> list) {
        this.mainColorConfig = mainColorConfig;
        this.ranges = list;
    }

    public static final class Range implements Serializable {
        public static final int $stable = 8;
        public final String mode;
        public final List<Rule> rules;
        public final float threshold;

        public Range() {
            this(null, 0.0f, null, 7, null);
        }

        public static final class Rule implements Serializable {
            public static final int $stable = 0;

            @C09CT("max_l")
            public final Float maxL;

            @C09CT("min_l")
            public final Float minL;

            @C09CT("offset_l")
            public final Float offsetL;

            public Rule() {
                this(null, null, null);
            }

            public Rule(Float f, Float f2, Float f3) {
                this.offsetL = f;
                this.maxL = f2;
                this.minL = f3;
            }
        }

        public Range(String str, float f, List<Rule> list) {
            this.mode = str;
            this.threshold = f;
            this.rules = list;
        }

        public Range(String str, float f, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? C13BV.INSTANCE : list);
        }
    }

    public SocialAlbumColorExtractionConfig(MainColorConfig mainColorConfig, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new MainColorConfig(0.0f, 0.0f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f) : mainColorConfig, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
