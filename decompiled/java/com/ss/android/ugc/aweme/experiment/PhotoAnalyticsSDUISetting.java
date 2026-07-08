package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class PhotoAnalyticsSDUISetting {
    public static final /* synthetic */ int LIZ = 0;

    public static final class H5AnalyticsInfoStructJsonModel {

        @C09CT("analytics_creator_tools_entrance_url_android")
        public final String creatorToolEntryURL;

        @C09CT("analytics_photo_detail_entrance_url_android")
        public final String detailEntryURL;

        @C09CT("query_params_android")
        public final String queryParams;

        public H5AnalyticsInfoStructJsonModel(String str, String str2, String str3) {
            this.creatorToolEntryURL = str;
            this.detailEntryURL = str2;
            this.queryParams = str3;
        }
    }
}
