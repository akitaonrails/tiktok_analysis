package webcast.api.fans;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import webcast.data.AnchorCustomizedGift;
import webcast.data.AnchorHighlight;
import webcast.data.CommunityGiftInfo;
import webcast.data.FanCustomBenefit;

/* JADX INFO: loaded from: classes8.dex */
public final class AnchorZoneItem {

    @C09CT("anchor_highlight")
    public AnchorHighlight anchorHighlight;

    @C09CT("badge")
    public AnchorFansBadge badge;

    @C09CT("community_gift")
    public CommunityGiftInfo communityGift;

    @C09CT("customized_benefit")
    public FanCustomBenefit customizedBenefit;

    @C09CT("customized_gift")
    public AnchorCustomizedGift customizedGift;

    @C09CT("emote")
    public AnchorFansEmote emote;

    @C09CT("icon")
    public ImageModel icon;

    @C09CT("red_dot")
    public RedDot redDot;

    @C09CT("type")
    public int type;

    @C09CT("icon_bg")
    public String iconBg = "";

    @C09CT("title")
    public String title = "";

    @C09CT("sub_title")
    public String subTitle = "";

    @C09CT("schema")
    public String schema = "";
}
