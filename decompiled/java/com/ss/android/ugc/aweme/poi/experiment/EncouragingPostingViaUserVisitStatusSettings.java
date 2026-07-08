package com.ss.android.ugc.aweme.poi.experiment;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes35.dex */
public final class EncouragingPostingViaUserVisitStatusSettings {
    public static final EncouragingPostingViaUserVisitStatusModel LIZ = new EncouragingPostingViaUserVisitStatusModel(20, 100, 3, 7, 14, 3);

    public static final class EncouragingPostingViaUserVisitStatusModel {

        @C09CT("encourage_posted_poi_cache_maximum")
        public final int encouragePostedPoiCacheMaximum;

        @C09CT("encourage_shown_poi_cache_maximum")
        public final int encourageShowPoiCacheMaximum;

        @C09CT("noClickImpressionThreshold")
        public final int noClickImpressionThreshold;

        @C09CT("noShowDurationDays")
        public final int noShowDurationDays;

        @C09CT("show_interval_with_same_poi_and_did")
        public final int showIntervalWithSamePoiAndDid;

        @C09CT("show_maximum_in_one_day")
        public final int showMaximumInOneDay;

        public EncouragingPostingViaUserVisitStatusModel() {
            this(20, 100, 3, 7, 14, 3);
        }

        public EncouragingPostingViaUserVisitStatusModel(int i, int i2, int i3, int i4, int i5, int i6) {
            this.encouragePostedPoiCacheMaximum = i;
            this.encourageShowPoiCacheMaximum = i2;
            this.noClickImpressionThreshold = i3;
            this.noShowDurationDays = i4;
            this.showIntervalWithSamePoiAndDid = i5;
            this.showMaximumInOneDay = i6;
        }
    }

    public static final EncouragingPostingViaUserVisitStatusModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EncouragingPostingViaUserVisitStatusModel encouragingPostingViaUserVisitStatusModel = LIZ;
        EncouragingPostingViaUserVisitStatusModel encouragingPostingViaUserVisitStatusModel2 = (EncouragingPostingViaUserVisitStatusModel) settingsManagerLIZLLL.LJIIIIZZ("encouraging_posting_via_user_visit_status", EncouragingPostingViaUserVisitStatusModel.class, encouragingPostingViaUserVisitStatusModel);
        return encouragingPostingViaUserVisitStatusModel2 != null ? encouragingPostingViaUserVisitStatusModel2 : encouragingPostingViaUserVisitStatusModel;
    }
}
