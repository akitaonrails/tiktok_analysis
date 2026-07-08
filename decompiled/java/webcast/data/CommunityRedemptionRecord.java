package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes.dex */
public final class CommunityRedemptionRecord {

    @C09CT("anchor_info")
    public User anchorInfo;

    @C09CT("decoration_info")
    public CommunityDecorationInfo decorationInfo;

    @C09CT("expire_at")
    public long expireAt;

    @C09CT("protect_util")
    public long protectUtil;

    @C09CT("redeem_at")
    public long redeemAt;

    @C09CT("room_id")
    public long roomId;

    @C09CT("user_info")
    public MiniUser userInfo;
}
