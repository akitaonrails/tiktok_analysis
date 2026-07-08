package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C13BV;
import X.C1697810uHb;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
public final class FromGroupIdScenarios {
    public static final FromGroupIdScenariosConfig LIZ;

    static {
        new FromGroupIdScenarios();
        LIZ = new FromGroupIdScenariosConfig(C1697810uHb.LJIIJJI("homepage_hot", "homepage_follow", "homepage_friends"), C1697810uHb.LJIIJJI("chat", "notification_page", "others_homepage", "collection_video"), 1800);
    }

    public static final FromGroupIdScenariosConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        FromGroupIdScenariosConfig fromGroupIdScenariosConfig = LIZ;
        FromGroupIdScenariosConfig fromGroupIdScenariosConfig2 = (FromGroupIdScenariosConfig) settingsManagerLIZLLL.LJIIIIZZ("im_from_group_id_config", FromGroupIdScenariosConfig.class, fromGroupIdScenariosConfig);
        return fromGroupIdScenariosConfig2 != null ? fromGroupIdScenariosConfig2 : fromGroupIdScenariosConfig;
    }

    public static final class FromGroupIdScenariosConfig {

        @C09CT("keep_scenarios")
        public final List<String> keepScenarioList;

        @C09CT("timegap_setting")
        public final int timeGapSetting;

        @C09CT("update_scenarios")
        public final List<String> updateScenarioList;

        public FromGroupIdScenariosConfig(List<String> list, List<String> list2, int i) {
            this.updateScenarioList = list;
            this.keepScenarioList = list2;
            this.timeGapSetting = i;
        }

        public FromGroupIdScenariosConfig(List list, List list2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? C13BV.INSTANCE : list, (i2 & 2) != 0 ? C13BV.INSTANCE : list2, i);
        }
    }
}
