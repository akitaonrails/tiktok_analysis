package com.ss.android.ugc.aweme.hybridkit.experiment;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class SparkIframeInjectionAllowListConfigSettings {
    public static final SparkIframeInjectionAllowListConfigModel LIZ = new SparkIframeInjectionAllowListConfigModel(null);

    public static final SparkIframeInjectionAllowListConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        SparkIframeInjectionAllowListConfigModel sparkIframeInjectionAllowListConfigModel = LIZ;
        SparkIframeInjectionAllowListConfigModel sparkIframeInjectionAllowListConfigModel2 = (SparkIframeInjectionAllowListConfigModel) settingsManagerLIZLLL.LJIIIIZZ("spark_iframe_injection_allow_list_config", SparkIframeInjectionAllowListConfigModel.class, sparkIframeInjectionAllowListConfigModel);
        return sparkIframeInjectionAllowListConfigModel2 != null ? sparkIframeInjectionAllowListConfigModel2 : sparkIframeInjectionAllowListConfigModel;
    }

    public static final class IframeInnerConfigModel {
        public final List<String> LIZ;

        @C09CT("allow_business")
        public final List<String> allowBusinessList;

        @C09CT("jsName")
        public final List<String> jsName;

        @C09CT("mainFrameAllowList")
        public final List<String> mainFrameAllowList;

        @C09CT("main_frame_inject")
        public final int mainFrameInject;

        public IframeInnerConfigModel(List<String> list) {
            this.LIZ = list;
            this.jsName = list;
            this.mainFrameAllowList = list;
            this.allowBusinessList = list;
        }
    }

    public static final class SparkIframeInjectionAllowListConfigModel {

        @C09CT("config")
        public final ArrayList<IframeInnerConfigModel> config;

        public SparkIframeInjectionAllowListConfigModel(ArrayList<IframeInnerConfigModel> arrayList) {
            this.config = arrayList;
        }
    }
}
