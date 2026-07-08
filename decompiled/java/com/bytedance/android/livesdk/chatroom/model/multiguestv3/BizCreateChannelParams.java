package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C09CT;

/* JADX INFO: loaded from: classes16.dex */
public final class BizCreateChannelParams {

    @C09CT("display_id")
    public int displayId;

    @C09CT("layout_style")
    public int layoutStyle;

    @C09CT("max_position")
    public int maxPosition;

    @C09CT("scene_version")
    public long sceneVersion;

    @C09CT("user_setting")
    public UserSetting userSetting;

    public static final class UserSetting {

        @C09CT("disable_layout_on_create")
        public boolean disableLayoutOnCreate;

        @C09CT("frame_setting")
        public String frameSetting = "";

        @C09CT("setting_allow_request_from_follower_only")
        public int settingAllowRequestFromFollowerOnly;

        @C09CT("setting_allow_request_from_user")
        public int settingAllowRequestFromUser;

        @C09CT("setting_fix_mic_num")
        public int settingFixMicNum;

        @C09CT("setting_layout")
        public int settingLayout;
    }
}
