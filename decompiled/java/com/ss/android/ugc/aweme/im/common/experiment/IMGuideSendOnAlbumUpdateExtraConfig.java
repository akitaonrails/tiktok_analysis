package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class IMGuideSendOnAlbumUpdateExtraConfig {

    @C09CT("new_media_expire_seconds")
    public final int newMediaExpireSeconds;

    public IMGuideSendOnAlbumUpdateExtraConfig() {
        this(30);
    }

    public IMGuideSendOnAlbumUpdateExtraConfig(int i) {
        this.newMediaExpireSeconds = i;
    }
}
