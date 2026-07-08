package com.ss.android.ugc.aweme.config;

import X.C01GW;
import X.C09CT;
import X.C0CIY;
import X.C0CIZ;
import X.C452501pT;
import X.C7740030o;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.internal.s;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.discover.abtest.SearchSecurityControlValue;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchSecurityControlConfig {
    public static final SearchSecurityControlConfig LIZ = new SearchSecurityControlConfig();
    public static final HashMap<String, SearchSecurityControlValue> LIZIZ = new HashMap<>();
    public static final Gson LIZJ = C7740030o.LIZ().getGson();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C0CIY());
    public static final C01GW LJ = C452501pT.LIZIZ(new C0CIZ());

    public static Integer LIZ() {
        Integer ageInterval = null;
        try {
            Gson gson = LIZJ;
            HashMap map = (HashMap) LJ.getValue();
            FeelGoodConfig feelGoodConfig = (FeelGoodConfig) gson.LJIIIIZZ(gson.LJIILL(map != null ? (s) map.get("feel_good") : null), new TypeToken<FeelGoodConfig>() { // from class: X.0Bwg
            }.getType());
            if (feelGoodConfig != null) {
                ageInterval = feelGoodConfig.getAgeInterval();
                return ageInterval;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return ageInterval;
    }

    public static Integer LIZLLL() {
        Integer visualLevel = null;
        try {
            Gson gson = LIZJ;
            HashMap map = (HashMap) LJ.getValue();
            VisualSearchConfig visualSearchConfig = (VisualSearchConfig) gson.LJIIIIZZ(gson.LJIILL(map != null ? (s) map.get("tiktok_visual_search_control") : null), new TypeToken<VisualSearchConfig>() { // from class: X.0C4H
            }.getType());
            if (visualSearchConfig != null) {
                visualLevel = visualSearchConfig.getVisualLevel();
                return visualLevel;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return visualLevel;
    }

    public static SearchSecurityControlValue LIZIZ() {
        return (SearchSecurityControlValue) LIZLLL.getValue();
    }

    public static int LIZJ() {
        int iIntValue = 1;
        try {
            HashMap map = (HashMap) SettingsManager.LIZLLL().LJIIIIZZ("tiktok_search", HashMap.class, LIZIZ);
            if (map == null || !map.containsKey("demotion_config")) {
                return 1;
            }
            s sVar = (s) map.get("demotion_config");
            Gson gson = LIZJ;
            Integer prefetchDegradeLevel = ((DemotionConfig) gson.LJIIIIZZ(gson.LJIILL(sVar), new TypeToken<DemotionConfig>() { // from class: X.0CIa
            }.getType())).getPrefetchDegradeLevel();
            if (prefetchDegradeLevel == null) {
                return 1;
            }
            iIntValue = prefetchDegradeLevel.intValue();
            return iIntValue;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return iIntValue;
        }
    }

    public static boolean LJ() {
        Integer numLIZ = LIZ();
        return numLIZ != null && numLIZ.intValue() == 4;
    }

    public static final class DemotionConfig implements Serializable {

        @C09CT("prefetch_degrade_level")
        public Integer prefetchDegradeLevel;

        public final Integer getPrefetchDegradeLevel() {
            return this.prefetchDegradeLevel;
        }

        public final void setPrefetchDegradeLevel(Integer num) {
            this.prefetchDegradeLevel = num;
        }
    }

    public static final class FeelGoodConfig implements Serializable {

        @C09CT("ai")
        public Integer ageInterval;

        public final Integer getAgeInterval() {
            return this.ageInterval;
        }

        public final void setAgeInterval(Integer num) {
            this.ageInterval = num;
        }
    }

    public static final class VisualSearchConfig implements Serializable {

        @C09CT("visual_level")
        public Integer visualLevel;

        public final Integer getVisualLevel() {
            return this.visualLevel;
        }

        public final void setVisualLevel(Integer num) {
            this.visualLevel = num;
        }
    }
}
