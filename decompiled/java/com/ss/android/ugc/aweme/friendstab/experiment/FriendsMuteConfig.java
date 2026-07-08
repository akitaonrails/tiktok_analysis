package com.ss.android.ugc.aweme.friendstab.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsMuteConfig {

    @C09CT("fi_avatar_long_press_mute")
    public final int fiAvatarLongPressMute;

    @C09CT("fi_mute_all_include_lives")
    public final int fiMuteAllIncludeLives;

    @C09CT("fi_mute_split_enable")
    public final int fiMuteSplitEnable;

    @C09CT("fi_mute_split_ui_type")
    public final int fiMuteSplitUiType;

    public FriendsMuteConfig() {
        this(0, 0, 0, 0);
    }

    public FriendsMuteConfig(int i, int i2, int i3, int i4) {
        this.fiAvatarLongPressMute = i;
        this.fiMuteAllIncludeLives = i2;
        this.fiMuteSplitEnable = i3;
        this.fiMuteSplitUiType = i4;
    }
}
