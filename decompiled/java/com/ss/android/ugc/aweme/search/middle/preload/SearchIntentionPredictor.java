package com.ss.android.ugc.aweme.search.middle.preload;

import X.C09CT;
import X.C13BV;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchIntentionPredictor {
    public static List<PredictionRule> LIZ = C13BV.INSTANCE;
    public static final Map<String, PredictionRule> LIZIZ = new LinkedHashMap();
    public static boolean LIZJ;

    public static final class Config {

        @C09CT("rules")
        public final List<PredictionRule> predictionRules;

        public Config(List<PredictionRule> list) {
            this.predictionRules = list;
        }
    }

    public static final class PredictionRule {

        @C09CT("q")
        public final String targetQuery;

        @C09CT("t")
        public final String triggerWord;

        public PredictionRule(String str, String str2) {
            this.triggerWord = str;
            this.targetQuery = str2;
        }
    }
}
