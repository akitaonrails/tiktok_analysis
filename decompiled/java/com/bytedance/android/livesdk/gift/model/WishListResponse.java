package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class WishListResponse {

    @C09CT("list")
    public WishList wishList;

    public static class Wish {

        @C09CT("gift")
        public GiftWishExtra giftWishExtra;

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public long id;

        @C09CT("progress")
        public int progress;

        @C09CT("target")
        public int target;

        @C09CT("type")
        public int wishType;

        public static class GiftWishExtra {

            @C09CT("diamond_count")
            public int giftDiamondCount;

            @C09CT("icon")
            public ImageModel giftIcon;

            @C09CT("name")
            public String giftName;

            @C09CT("type")
            public int giftType;
        }
    }

    public static class WishContributor {

        @C09CT("avatar")
        public ImageModel avatar;

        @C09CT("display_id")
        public String displayId;

        @C09CT("score")
        public Long score;

        @C09CT("sec_user_id")
        public String secUserId;

        @C09CT("user_id")
        public Long userId;

        @C09CT("user_id_str")
        public String userIdStr;
    }

    public static class WishList {

        @C09CT("audit_status")
        public Integer auditStatus;

        @C09CT("contributors")
        public List<WishContributor> contributors;

        @C09CT("contributors_length")
        public int contributorsLength;

        @C09CT("description")
        public String description;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;

        @C09CT("wishes")
        public List<Wish> wishes;
    }
}
