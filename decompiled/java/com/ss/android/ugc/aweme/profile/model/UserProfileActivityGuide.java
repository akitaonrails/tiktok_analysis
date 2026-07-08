package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class UserProfileActivityGuide implements Serializable {

    @C09CT("delivery_id")
    public Long deliveryId;

    @C09CT("description")
    public String description;

    @C09CT("icon")
    public IconImageModel imageUrl;

    @C09CT("title")
    public String title;

    public UserProfileActivityGuide() {
        this(null, null, null, null);
    }

    public final void setDeliveryId(Long l) {
        this.deliveryId = l;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setImageUrl(IconImageModel iconImageModel) {
        this.imageUrl = iconImageModel;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public UserProfileActivityGuide(String str, String str2, IconImageModel iconImageModel, Long l) {
        this.title = str;
        this.description = str2;
        this.imageUrl = iconImageModel;
        this.deliveryId = l;
    }
}
