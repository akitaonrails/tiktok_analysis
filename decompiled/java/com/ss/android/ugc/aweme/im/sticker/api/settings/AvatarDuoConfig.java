package com.ss.android.ugc.aweme.im.sticker.api.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class AvatarDuoConfig {

    @C09CT("banner_showing_day_limit")
    public final int bannerShowingDayLimit;

    @C09CT("default_avatar_match_expression")
    public final String defaultAvatarMatchExpression;

    @C09CT("input_red_dot_day_limit")
    public final int inputRedDotDayLimit;

    @C09CT("invitation_entrance_day_limit")
    public final int invitationEntranceShowingDayLimit;

    public AvatarDuoConfig() {
        this(7, "handwave", 7, 10);
    }

    public AvatarDuoConfig(int i, String str, int i2, int i3) {
        this.bannerShowingDayLimit = i;
        this.defaultAvatarMatchExpression = str;
        this.inputRedDotDayLimit = i2;
        this.invitationEntranceShowingDayLimit = i3;
    }
}
