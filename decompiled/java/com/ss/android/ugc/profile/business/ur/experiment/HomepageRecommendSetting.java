package com.ss.android.ugc.profile.business.ur.experiment;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes20.dex */
public final class HomepageRecommendSetting {
    public static final HomepageRecommendConfigModel LIZ = new HomepageRecommendConfigModel(1000, 14, 3, 5);

    public static final HomepageRecommendConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        HomepageRecommendConfigModel homepageRecommendConfigModel = LIZ;
        HomepageRecommendConfigModel homepageRecommendConfigModel2 = (HomepageRecommendConfigModel) settingsManagerLIZLLL.LJIIIIZZ("my_profile_recommend_card_config", HomepageRecommendConfigModel.class, homepageRecommendConfigModel);
        return homepageRecommendConfigModel2 != null ? homepageRecommendConfigModel2 : homepageRecommendConfigModel;
    }

    public static final class HomepageRecommendConfigModel {

        @C09CT("low_follower_bound")
        public final long lowFollowerBound;

        @C09CT("low_muf_bound")
        public final long lowMufBound;

        @C09CT("x_days")
        public final long xDays;

        @C09CT("y_hide")
        public final long yHide;

        public HomepageRecommendConfigModel(long j, long j2, long j3, long j4) {
            this.lowFollowerBound = j;
            this.xDays = j2;
            this.yHide = j3;
            this.lowMufBound = j4;
        }
    }
}
