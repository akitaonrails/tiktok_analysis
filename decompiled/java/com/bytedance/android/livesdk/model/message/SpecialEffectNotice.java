package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.match.CommunityHeartMeInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SpecialEffectNotice {

    @C09CT("community_heart_me_info")
    public CommunityHeartMeInfo communityHeartMeInfo;

    @C09CT("effect_type")
    public int effectType;

    @C09CT("from_user_id")
    public long fromUserId;

    @C09CT("score")
    public long score;

    @C09CT("to_anchor_id")
    public long toAnchorId;

    @C09CT("affected_anchor_pairs")
    public List<AnchorPair> affectedAnchorPairs = new ArrayList();

    @C09CT("community_heart_me_info_str")
    public String communityHeartMeInfoStr = "";
}
