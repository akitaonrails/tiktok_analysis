package com.ss.android.ugc.aweme.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class LiveFYPWindowForCountryModel {

    @C09CT("avatar_type")
    public final int avatarType;

    @C09CT("go_live_avatar")
    public final boolean goLiveAvatar;

    @C09CT("guide_auto_open_max_duration")
    public final long guideAutoOpenMaxDuration;

    @C09CT("guide_type")
    public final int guideType;

    public LiveFYPWindowForCountryModel() {
        this(0, 0, false, 10000L);
    }

    public LiveFYPWindowForCountryModel(int i, int i2, boolean z, long j) {
        this.avatarType = i;
        this.guideType = i2;
        this.goLiveAvatar = z;
        this.guideAutoOpenMaxDuration = j;
    }
}
