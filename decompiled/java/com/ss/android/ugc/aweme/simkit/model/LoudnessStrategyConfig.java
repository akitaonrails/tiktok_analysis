package com.ss.android.ugc.aweme.simkit.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class LoudnessStrategyConfig {

    @C09CT("apply_offset")
    public boolean applyOffset;

    @C09CT("enabled")
    public boolean enabled;

    @C09CT("default_vol")
    public float defaultVol = -10.0f;

    @C09CT("timeout_ms")
    public int timeoutMs = 30;

    @C09CT("conditions")
    public List<Condition> conditions = new ArrayList();

    public class Condition {

        @C09CT("adjust")
        public float adjust;

        @C09CT("label")
        public String label;

        @C09CT("threshold")
        public float threshold;

        public Condition(LoudnessStrategyConfig loudnessStrategyConfig) {
        }
    }
}
