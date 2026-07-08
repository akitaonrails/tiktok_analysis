package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes4.dex */
public final class AnalyticsSDUISetting {
    public static final H5AnalyticsInfoStructJsonModel LIZ() {
        return (H5AnalyticsInfoStructJsonModel) SettingsManager.LIZLLL().LJIIIIZZ("h5_analytics_info_struct_json", H5AnalyticsInfoStructJsonModel.class, null);
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class H5AnalyticsInfoStructJsonModel {

        @C09CT("analytics_creator_tools_entrance_url_android")
        public final String creatorToolEntryURL;

        @C09CT("analytics_video_detail_entrance_url_android")
        public final String detailEntryURL;

        @C09CT("query_params_android")
        public final String queryParams;

        @C09CT("query_params_comment_header")
        public final String queryParamsCommentHeader;

        public H5AnalyticsInfoStructJsonModel(String str, String str2, String str3, String str4) {
            this.creatorToolEntryURL = str;
            this.detailEntryURL = str2;
            this.queryParams = str3;
            this.queryParamsCommentHeader = str4;
        }
    }
}
