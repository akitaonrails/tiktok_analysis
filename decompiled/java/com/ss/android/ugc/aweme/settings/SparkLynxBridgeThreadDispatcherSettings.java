package com.ss.android.ugc.aweme.settings;

import X.C08JS;
import X.C09CT;
import X.C1253204vK;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class SparkLynxBridgeThreadDispatcherSettings {
    public static final SparkLynxBridgeThreadDispatcherModel LIZ = new SparkLynxBridgeThreadDispatcherModel(new ArrayList(), new ArrayList(), new HashMap(), new HashMap(), new HashMap(), new HashMap(), new HashMap(), new HashMap(), false, false, new HashMap());

    /* JADX INFO: loaded from: classes24.dex */
    public static final class SparkLynxBridgeThreadDispatcherModel {

        @C09CT("allowChannelList")
        public final List<String> allowChannelList;

        @C09CT("allowList")
        public final Map<String, List<String>> allowList;

        @C09CT("backgroundThreadList")
        public final Map<String, List<String>> backgroundThreadList;

        @C09CT("cpuThreadList")
        public final Map<String, List<String>> cpuThreadList;

        @C09CT("denyChannelList")
        public final List<String> denyChannelList;

        @C09CT("enable")
        public final boolean enable;

        @C09CT("ioThreadList")
        public final Map<String, List<String>> ioThreadList;

        @C09CT("lynxThreadList")
        public final Map<String, List<String>> lynxThreadList;

        @C09CT("normalThreadList")
        public final Map<String, List<String>> normalThreadList;

        @C09CT("oldEnable")
        public final boolean oldEnable;

        @C09CT("serialThreadList")
        public final Map<String, List<String>> serialThreadList;

        public SparkLynxBridgeThreadDispatcherModel() {
            this(new ArrayList(), new ArrayList(), new HashMap(), new HashMap(), new HashMap(), new HashMap(), new HashMap(), new HashMap(), false, false, new HashMap());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SparkLynxBridgeThreadDispatcherModel(List<String> list, List<String> list2, Map<String, ? extends List<String>> map, Map<String, ? extends List<String>> map2, Map<String, ? extends List<String>> map3, Map<String, ? extends List<String>> map4, Map<String, ? extends List<String>> map5, Map<String, ? extends List<String>> map6, boolean z, boolean z2, Map<String, ? extends List<String>> map7) {
            this.allowChannelList = list;
            this.denyChannelList = list2;
            this.lynxThreadList = map;
            this.normalThreadList = map2;
            this.cpuThreadList = map3;
            this.ioThreadList = map4;
            this.serialThreadList = map5;
            this.backgroundThreadList = map6;
            this.enable = z;
            this.oldEnable = z2;
            this.allowList = map7;
        }
    }

    public static final SparkLynxBridgeThreadDispatcherModel LIZ() {
        SparkLynxBridgeThreadDispatcherModel sparkLynxBridgeThreadDispatcherModel;
        if (!C1253204vK.LIZ() || !Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).contains("spark_lynx_bridge_thread_dispatcher") || (sparkLynxBridgeThreadDispatcherModel = (SparkLynxBridgeThreadDispatcherModel) GsonProtectorUtils.fromJson(C08JS.LIZIZ(), Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("spark_lynx_bridge_thread_dispatcher", ""), SparkLynxBridgeThreadDispatcherModel.class)) == null) {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            SparkLynxBridgeThreadDispatcherModel sparkLynxBridgeThreadDispatcherModel2 = LIZ;
            sparkLynxBridgeThreadDispatcherModel = (SparkLynxBridgeThreadDispatcherModel) settingsManagerLIZLLL.LJIIIIZZ("spark_lynx_bridge_thread_dispatcher", SparkLynxBridgeThreadDispatcherModel.class, sparkLynxBridgeThreadDispatcherModel2);
            if (sparkLynxBridgeThreadDispatcherModel == null) {
                return sparkLynxBridgeThreadDispatcherModel2;
            }
        }
        return sparkLynxBridgeThreadDispatcherModel;
    }
}
