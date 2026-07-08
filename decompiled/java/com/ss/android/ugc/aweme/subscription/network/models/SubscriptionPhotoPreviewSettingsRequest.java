package com.ss.android.ugc.aweme.subscription.network.models;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class SubscriptionPhotoPreviewSettingsRequest implements Serializable {
    public static final int $stable = 8;

    @C09CT("item_id")
    public final Long awemeId;

    @C09CT("creator_id")
    public final Long creatorId;

    @C09CT("image_post")
    public final ImagePost imagePost;

    @C09CT("is_preview_on")
    public final Boolean isPreviewOn;

    public SubscriptionPhotoPreviewSettingsRequest() {
        this(Boolean.FALSE, null, 0L, 0L);
    }

    public final Boolean isPreviewOn() {
        return this.isPreviewOn;
    }

    public SubscriptionPhotoPreviewSettingsRequest(Boolean bool, ImagePost imagePost, Long l, Long l2) {
        this.isPreviewOn = bool;
        this.imagePost = imagePost;
        this.awemeId = l;
        this.creatorId = l2;
    }
}
