package com.bytedance.android.livesdk.model.linksetting;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import tikcast.linkmic.common.AnchorLayoutSetting;

/* JADX INFO: loaded from: classes.dex */
public final class MultiLiveUpdateUserSettingContent {

    @C09CT("anchor_layout_setting")
    public AnchorLayoutSetting anchorLayoutSetting;

    @C09CT("update_user_setting_info")
    public MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;

    @C09CT("reset_point_after_leave")
    public int resetPointAfterLeave;

    public MultiLiveUpdateUserSettingContent() {
        this(null, null, 0);
    }

    public MultiLiveUpdateUserSettingContent(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, AnchorLayoutSetting anchorLayoutSetting, int i) {
        this.multiLiveAnchorPanelSettings = multiLiveAnchorPanelSettings;
        this.anchorLayoutSetting = anchorLayoutSetting;
        this.resetPointAfterLeave = i;
    }
}
