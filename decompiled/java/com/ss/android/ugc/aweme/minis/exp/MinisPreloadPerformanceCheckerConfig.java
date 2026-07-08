package com.ss.android.ugc.aweme.minis.exp;

import X.C09CT;
import X.C2097608Jq;
import X.EnumC1006810cJ5;
import X.EnumC2196771AyJ;
import java.io.Serializable;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes35.dex */
public final class MinisPreloadPerformanceCheckerConfig implements Serializable {

    @C09CT("performance_checker_config_by_scene")
    public final Map<String, MinisPreloadPerformanceData> requiredPerformanceConfigByScene;

    public MinisPreloadPerformanceCheckerConfig() {
        this(null, 1, null);
    }

    public MinisPreloadPerformanceCheckerConfig(Map<String, MinisPreloadPerformanceData> map) {
        this.requiredPerformanceConfigByScene = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MinisPreloadPerformanceCheckerConfig(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            String scene = EnumC2196771AyJ.UNKNOWN.getScene();
            EnumC1006810cJ5 enumC1006810cJ5 = EnumC1006810cJ5.High;
            String scene2 = EnumC2196771AyJ.ADS.getScene();
            EnumC1006810cJ5 enumC1006810cJ52 = EnumC1006810cJ5.Low;
            String scene3 = EnumC2196771AyJ.SEARCH.getScene();
            EnumC1006810cJ5 enumC1006810cJ53 = EnumC1006810cJ5.Medium;
            map = C2097608Jq.LJIIIIZZ(new Pair(scene, new MinisPreloadPerformanceData(Integer.valueOf(enumC1006810cJ5.getScore()), Integer.valueOf(enumC1006810cJ5.getScore()))), new Pair(scene2, new MinisPreloadPerformanceData(Integer.valueOf(enumC1006810cJ52.getScore()), Integer.valueOf(enumC1006810cJ52.getScore()))), new Pair(EnumC2196771AyJ.ANCHOR.getScene(), new MinisPreloadPerformanceData(Integer.valueOf(enumC1006810cJ52.getScore()), Integer.valueOf(enumC1006810cJ52.getScore()))), new Pair(scene3, new MinisPreloadPerformanceData(Integer.valueOf(enumC1006810cJ53.getScore()), Integer.valueOf(enumC1006810cJ5.getScore()))), new Pair(EnumC2196771AyJ.DEBUG.getScene(), null), new Pair(EnumC2196771AyJ.FYF_LYNX.getScene(), new MinisPreloadPerformanceData(Integer.valueOf(enumC1006810cJ52.getScore()), Integer.valueOf(enumC1006810cJ53.getScore()))), new Pair(EnumC2196771AyJ.CENTER.getScene(), new MinisPreloadPerformanceData(Integer.valueOf(enumC1006810cJ5.getScore()), Integer.valueOf(enumC1006810cJ5.getScore()))), new Pair(EnumC2196771AyJ.FEED_SIDEBAR.getScene(), new MinisPreloadPerformanceData(Integer.valueOf(enumC1006810cJ52.getScore()), Integer.valueOf(enumC1006810cJ52.getScore()))), new Pair(EnumC2196771AyJ.DM_PLAYGROUND.getScene(), new MinisPreloadPerformanceData(Integer.valueOf(enumC1006810cJ52.getScore()), Integer.valueOf(enumC1006810cJ52.getScore()))));
        }
        this(map);
    }
}
