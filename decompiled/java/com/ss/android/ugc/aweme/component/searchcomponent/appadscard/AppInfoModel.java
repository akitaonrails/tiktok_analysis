package com.ss.android.ugc.aweme.component.searchcomponent.appadscard;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AppInfoModel implements Serializable {
    public static final int $stable = 0;

    @C09CT("app_name")
    public final String appName;

    @C09CT("app_short_desc")
    public final String appShortDesc;

    @C09CT("category_label")
    public final String categoryLabel;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("rating")
    public final Float rating;

    @C09CT("size")
    public final String size;

    @C09CT("total_ratings_reviews_num_str")
    public final String totalRatingsReviewsNumStr;

    public final String getAppName() {
        return this.appName;
    }

    public final String getAppShortDesc() {
        return this.appShortDesc;
    }

    public final String getCategoryLabel() {
        return this.categoryLabel;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final Float getRating() {
        return this.rating;
    }

    public final String getSize() {
        return this.size;
    }

    public final String getTotalRatingsReviewsNumStr() {
        return this.totalRatingsReviewsNumStr;
    }

    public AppInfoModel(String str, String str2, String str3, String str4, Float f, String str5, String str6) {
        this.appName = str;
        this.appShortDesc = str2;
        this.categoryLabel = str3;
        this.totalRatingsReviewsNumStr = str4;
        this.rating = f;
        this.iconUrl = str5;
        this.size = str6;
    }
}
