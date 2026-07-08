package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.match.CommunityHeartMeInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.SpecialEffectCardInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class UseSpecialEffectCard {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("card_info")
    public SpecialEffectCardInfo cardInfo;

    @C09CT("community_heart_me_info")
    public CommunityHeartMeInfo communityHeartMeInfo;

    @C09CT("display_content")
    public Text displayContent;

    @C09CT("effect_type")
    public int effectType;

    @C09CT("affected_anchor_pairs")
    public List<AnchorPair> affectedAnchorPairs = new ArrayList();

    @C09CT("community_heart_me_info_str")
    public String communityHeartMeInfoStr = "";
}
