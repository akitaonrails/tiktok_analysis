package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.config;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class ManualDiffConfig {

    @C09CT("add_user_and_photo_card")
    public final int addUserAndPhotoCard;

    @C09CT("enable_manual_diff")
    public final int enableManualDiff;

    @C09CT("include_all_card")
    public final int includeAllCard;

    @C09CT("only_video_card")
    public final int onlyVideoCard;

    @C09CT("prepare_player")
    public final int preparePlayer;

    public ManualDiffConfig() {
        this(0, 0, 0, 0, 0);
    }

    public ManualDiffConfig(int i, int i2, int i3, int i4, int i5) {
        this.enableManualDiff = i;
        this.includeAllCard = i2;
        this.addUserAndPhotoCard = i3;
        this.preparePlayer = i4;
        this.onlyVideoCard = i5;
    }
}
