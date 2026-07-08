package com.ss.android.ugc.aweme.search.entry.eventcard.utils;

import X.C09CT;
import X.C1227904rF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class LynxQueryProcessor {
    public static final LynxQueryProcessor LIZ = new LynxQueryProcessor();

    public static final class InterventionGuideInfoWords implements Serializable {

        @C09CT("words")
        public final Object words;

        public InterventionGuideInfoWords(Object obj) {
            this.words = obj;
        }
    }

    public static String LIZ(String str) {
        try {
            C1227904rF.LIZ.getClass();
            Gson gsonLIZLLL = C1227904rF.LIZLLL();
            Object obj = ((Map) gsonLIZLLL.LJII(str, Map.class)).get("search_hot_card_queries");
            if (obj == null) {
                return null;
            }
            return gsonLIZLLL.LJIILL(new InterventionGuideInfoWords(obj));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
