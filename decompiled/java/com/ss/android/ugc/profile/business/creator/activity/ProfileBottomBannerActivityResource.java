package com.ss.android.ugc.profile.business.creator.activity;

import X.C09CT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileBottomBannerActivityResource {

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("delivery_id")
    public final Long deliveryID;

    @C09CT("description")
    public final String description;

    @C09CT("description_extra_list")
    public final List<StringExtra> descriptionExtras;

    @C09CT("scheme")
    public final String scheme;

    @C09CT("show_max_count")
    public final int showMaxCount;

    @C09CT("show_interval")
    public final int timeInterval;

    @C09CT("title")
    public final String title;

    public ProfileBottomBannerActivityResource() {
        this(null, null, null, null, 3, 72, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileBottomBannerActivityResource)) {
            return false;
        }
        ProfileBottomBannerActivityResource profileBottomBannerActivityResource = (ProfileBottomBannerActivityResource) obj;
        return Intrinsics.LJFF(this.title, profileBottomBannerActivityResource.title) && Intrinsics.LJFF(this.description, profileBottomBannerActivityResource.description) && Intrinsics.LJFF(this.buttonText, profileBottomBannerActivityResource.buttonText) && Intrinsics.LJFF(this.scheme, profileBottomBannerActivityResource.scheme) && this.showMaxCount == profileBottomBannerActivityResource.showMaxCount && this.timeInterval == profileBottomBannerActivityResource.timeInterval && Intrinsics.LJFF(this.descriptionExtras, profileBottomBannerActivityResource.descriptionExtras) && Intrinsics.LJFF(this.deliveryID, profileBottomBannerActivityResource.deliveryID);
    }

    public ProfileBottomBannerActivityResource(String str, String str2, String str3, String str4, int i, int i2, List<StringExtra> list, Long l) {
        this.title = str;
        this.description = str2;
        this.buttonText = str3;
        this.scheme = str4;
        this.showMaxCount = i;
        this.timeInterval = i2;
        this.descriptionExtras = list;
        this.deliveryID = l;
    }
}
