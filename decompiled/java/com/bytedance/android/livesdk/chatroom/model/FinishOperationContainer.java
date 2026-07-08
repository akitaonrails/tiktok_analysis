package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.BannerInRoomCollection;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FinishOperationContainer {

    @C09CT("activity_center_ux_ab")
    public int activityCenterUxAb;

    @C09CT("banner")
    public BannerInRoomCollection.BannerInfo banner;

    @C09CT("campaign_ab")
    public long campaignAb;

    @C09CT("operation_type")
    public int operationType;

    @C09CT("question")
    public AnchorQuestion question;

    @C09CT("show_campaign_component")
    public boolean showCampaignComponent;

    @C09CT("still_in_game")
    public boolean stillInGame;

    @C09CT("url")
    public String url = "";

    @C09CT("new_banner")
    public List<CampaignInfo> newBanner = new ArrayList();

    @C09CT("pop_link")
    public String popLink = "";
}
