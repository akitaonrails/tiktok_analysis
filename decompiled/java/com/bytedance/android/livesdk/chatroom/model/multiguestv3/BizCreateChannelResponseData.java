package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.interact.LastLayoutSetting;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkmicShareRevenueSettingStruct;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.AnchorLayoutSetting;
import webcast.data.RechargeCustomError;

/* JADX INFO: loaded from: classes.dex */
public final class BizCreateChannelResponseData {

    @C09CT("anchor_layout_setting")
    public AnchorLayoutSetting anchorLayoutSetting;

    @C09CT("background_sticker_id")
    public String backgroundStickerId;

    @C09CT("custom_error")
    public RechargeCustomError customError;

    @C09CT("display_empty_seat")
    public int displayEmptySeat;

    @C09CT("last_layout_settings")
    public List<LastLayoutSetting> lastLayoutSettings;

    @C09CT("memory_flag")
    public int memoryFlag;

    @C09CT("user_setting_info")
    public MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;

    @C09CT("reset_point_after_leave")
    public int resetPointAfterLeave;

    @C09CT("share_revenue_setting")
    public int shareRevenueSetting;

    @C09CT("share_revenue_setting_new")
    public LinkmicShareRevenueSettingStruct shareRevenueSettingNew;

    @C09CT("share_revenue_setting_version")
    public long shareRevenueSettingVersion;

    @C09CT("social_game_available")
    public List<Integer> socialGameAvailable;

    public BizCreateChannelResponseData() {
        this(null, new ArrayList(), "", 0, 0, null, 0L, 0, null, new ArrayList(), null, 0);
    }

    public final String toString() {
        return "BizCreateChannelResponseData(multiLiveAnchorPanelSettings=" + this.multiLiveAnchorPanelSettings + ", lastLayoutSettings=" + this.lastLayoutSettings + ", backgroundStickerId=" + this.backgroundStickerId + ", shareRevenueSetting=" + this.shareRevenueSetting + ", displayEmptySeat=" + this.displayEmptySeat + ", anchorLayoutSetting=" + this.anchorLayoutSetting + ", shareRevenueSettingVersion=" + this.shareRevenueSettingVersion + ", resetPointAfterLeave=" + this.resetPointAfterLeave + ", customError=" + this.customError + ", socialGameAvailable=" + this.socialGameAvailable + ", shareRevenueSettingNew=" + this.shareRevenueSettingNew + ", memoryFlag=" + this.memoryFlag + ')';
    }

    public BizCreateChannelResponseData(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, List<LastLayoutSetting> list, String str, int i, int i2, AnchorLayoutSetting anchorLayoutSetting, long j, int i3, RechargeCustomError rechargeCustomError, List<Integer> list2, LinkmicShareRevenueSettingStruct linkmicShareRevenueSettingStruct, int i4) {
        this.multiLiveAnchorPanelSettings = multiLiveAnchorPanelSettings;
        this.lastLayoutSettings = list;
        this.backgroundStickerId = str;
        this.shareRevenueSetting = i;
        this.displayEmptySeat = i2;
        this.anchorLayoutSetting = anchorLayoutSetting;
        this.shareRevenueSettingVersion = j;
        this.resetPointAfterLeave = i3;
        this.customError = rechargeCustomError;
        this.socialGameAvailable = list2;
        this.shareRevenueSettingNew = linkmicShareRevenueSettingStruct;
        this.memoryFlag = i4;
    }
}
