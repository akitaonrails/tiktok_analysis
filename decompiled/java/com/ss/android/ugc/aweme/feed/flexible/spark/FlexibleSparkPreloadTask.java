package com.ss.android.ugc.aweme.feed.flexible.spark;

import X.AbstractC718630SGv;
import X.C01GW;
import X.C0CF8;
import X.C1097680efe;
import X.C13LP;
import X.C1529590puH;
import X.C1537060q6K;
import X.C1546500qLY;
import X.C1546510qLZ;
import X.C1546560qLe;
import X.C1552630qVR;
import X.C1932107hX;
import X.C2097608Jq;
import X.C212378189g;
import X.C2367709Pn;
import X.C700380Rdc;
import X.EnumC919040a1W;
import com.bytedance.geckox.settings.model.MatchRule;
import com.ss.android.ugc.aweme.feed.experiment.FlexiblePanelPerformanceSettings;
import com.ss.android.ugc.aweme.feed.experiment.PrerenderConfig;
import com.ss.android.ugc.aweme.feed.experiment.ReuseConfig;
import com.tiktok.geckox.ng.model.Event;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS326S0000000_1;

/* JADX INFO: loaded from: classes33.dex */
public final class FlexibleSparkPreloadTask extends AbstractC718630SGv {
    @Override // X.AbstractC718630SGv
    public final void LIZ(C700380Rdc c700380Rdc) {
        Iterator<T> it2 = c700380Rdc.LIZIZ.values().iterator();
        while (it2.hasNext()) {
            for (String str : (List) it2.next()) {
                C01GW c01gw = FlexiblePanelPerformanceSettings.LIZIZ;
                if (((FlexiblePanelPerformanceSettings.FlexiblePanelPerformanceConfig) c01gw.getValue()).prerenderConfig.enablePrerender) {
                    C212378189g c212378189g = new C212378189g();
                    c212378189g.LIZ = ((FlexiblePanelPerformanceSettings.FlexiblePanelPerformanceConfig) c01gw.getValue()).memoryLimit;
                    c212378189g.LIZIZ = ((FlexiblePanelPerformanceSettings.FlexiblePanelPerformanceConfig) c01gw.getValue()).deviceScoreLimit;
                    float f = c212378189g.LIZ;
                    float f2 = c212378189g.LIZIZ;
                    if (((double) 1) - C2367709Pn.LIZJ() > f) {
                        C0CF8.LIZ.getClass();
                        if (C0CF8.LIZ() > f2) {
                            C1537060q6K c1537060q6K = C1529590puH.LIZ;
                            C1537060q6K.LJIIL(new C1097680efe() { // from class: X.189f
                                {
                                    this.LIZ = "feed_component_spark_preload";
                                    PrerenderConfig prerenderConfig = ((FlexiblePanelPerformanceSettings.FlexiblePanelPerformanceConfig) FlexiblePanelPerformanceSettings.LIZIZ.getValue()).prerenderConfig;
                                    this.LJIJI = prerenderConfig.expiredTimeInSeconds;
                                    this.LJIJJLI = prerenderConfig.allowSchemaList;
                                    this.LJIL = prerenderConfig.denySchemaList;
                                    this.LJIJ = (int) prerenderConfig.volume;
                                    this.LJIJJ = AFwS326S0000000_1.get$arr$(8);
                                    this.LJIIIIZZ = C1932007hW.LL;
                                }
                            }, Boolean.FALSE);
                            C1537060q6K.LJIIJJI(c1537060q6K, str, "feed_component_spark_preload", null, null, true, null, 40);
                        }
                    }
                }
                if (((FlexiblePanelPerformanceSettings.FlexiblePanelPerformanceConfig) c01gw.getValue()).reuseConfig.enableSparkStayAlive) {
                    C212378189g c212378189g2 = new C212378189g();
                    c212378189g2.LIZ = ((FlexiblePanelPerformanceSettings.FlexiblePanelPerformanceConfig) c01gw.getValue()).memoryLimit;
                    c212378189g2.LIZIZ = ((FlexiblePanelPerformanceSettings.FlexiblePanelPerformanceConfig) c01gw.getValue()).deviceScoreLimit;
                    float f3 = c212378189g2.LIZ;
                    float f4 = c212378189g2.LIZIZ;
                    if (((double) 1) - C2367709Pn.LIZJ() > f3) {
                        C0CF8.LIZ.getClass();
                        if (C0CF8.LIZ() > f4 && ((FlexiblePanelPerformanceSettings.FlexiblePanelPerformanceConfig) c01gw.getValue()).reuseConfig.enableSparkStayAlive) {
                            C1546510qLZ c1546510qLZ = new C1546510qLZ();
                            c1546510qLZ.LJFF = "feed_component_spark_preload";
                            ReuseConfig reuseConfig = ((FlexiblePanelPerformanceSettings.FlexiblePanelPerformanceConfig) c01gw.getValue()).reuseConfig;
                            c1546510qLZ.LJI = reuseConfig.expiredTimeInSeconds;
                            c1546510qLZ.LJIIL = reuseConfig.allowSchemaList;
                            c1546510qLZ.LJIILIIL = reuseConfig.denySchemaList;
                            c1546510qLZ.LIZLLL = (int) reuseConfig.volume;
                            c1546510qLZ.LJIIIZ = C1932107hX.LL;
                            C1546500qLY c1546500qLY = C1546560qLe.LIZ;
                            Boolean bool = Boolean.FALSE;
                            c1546500qLY.getClass();
                            C1546500qLY.LJI(c1546510qLZ, bool);
                        }
                    }
                }
            }
        }
        C1552630qVR.LIZ.onEventTrigger(new Event("feed_component_anchor_spark_preload", C2097608Jq.LJIIJ(new Pair("component_key", C13LP.LJJLIIIJ(c700380Rdc.LIZIZ.keySet(), null, null, null, 0, null, null, 63))), null, MatchRule.MATCH_ALL, null, EnumC919040a1W.NORMAL));
    }
}
