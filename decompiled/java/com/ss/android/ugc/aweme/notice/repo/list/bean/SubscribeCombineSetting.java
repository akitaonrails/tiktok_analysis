package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class SubscribeCombineSetting {

    @C09CT("category_settings")
    public final List<CategorySetting> categorySettings;

    @C09CT("channel_setting")
    public final ChannelSetting channelSetting;

    public final int hashCode() {
        ChannelSetting channelSetting = this.channelSetting;
        int iHashCode = (channelSetting == null ? 0 : channelSetting.hashCode()) * 31;
        List<CategorySetting> list = this.categorySettings;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public SubscribeCombineSetting(ChannelSetting channelSetting, List<CategorySetting> list) {
        this.channelSetting = channelSetting;
        this.categorySettings = list;
    }
}
