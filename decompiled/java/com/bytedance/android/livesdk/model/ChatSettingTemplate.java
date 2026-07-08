package com.bytedance.android.livesdk.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ChatSettingTemplate {

    @C09CT("config_type")
    public int configType;

    @C09CT("user_level_config_list")
    public List<UserLevelConfig> userLevelConfigList = new ArrayList();

    @C09CT("subscription_config_list")
    public List<SubscriptionConfig> subscriptionConfigList = new ArrayList();

    @C09CT("gift_config_list")
    public List<GiftConfig> giftConfigList = new ArrayList();

    @C09CT("follower_config_list")
    public List<FollowerConfig> followerConfigList = new ArrayList();

    @C09CT("fans_club_config_list")
    public List<FansClubConfig> fansClubConfigList = new ArrayList();

    @C09CT("top_viewer_config_list")
    public List<TopViewerConfig> topViewerConfigList = new ArrayList();
}
