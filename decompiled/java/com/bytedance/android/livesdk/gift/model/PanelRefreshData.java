package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PanelRefreshData {

    @C09CT("gallery_data")
    public List<GalleryData> galleryData = new ArrayList();

    @C09CT("room_id")
    public long roomId;

    @C09CT("timestamp")
    public long timestamp;

    @C09CT("user_level")
    public UserLevel userLevel;

    @C09CT("vault_data")
    public EligibleVaultGifts vaultData;

    public static final class EligibleVaultGifts {

        @C09CT("gift_ids")
        public List<Long> giftIds = new ArrayList();
    }

    public static final class GalleryData {

        @C09CT("can_sponsor")
        public boolean canSponsor;

        @C09CT("gift_id")
        public long giftId;

        @C09CT("is_gallery_available")
        public boolean isGalleryAvailable;

        @C09CT("left_count_to_sponsor")
        public long leftCountToSponsor;

        @C09CT("own_progress")
        public long ownProgress;

        @C09CT("sponsor_id")
        public long sponsorId;
    }

    public static final class UserLevel {

        @C09CT("current_level")
        public long currentLevel;

        @C09CT("current_score")
        public long currentScore;

        @C09CT("did_user_opt_out")
        public boolean didUserOptOut;

        @C09CT("next_level_score")
        public long nextLevelScore;
    }
}
