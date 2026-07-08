package com.ss.android.ugc.aweme.notification.api;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinFetchSettingsInfoRequest {

    @C09CT("channel_ids")
    public final List<String> channelIds;

    public BulletinFetchSettingsInfoRequest() {
        this(null);
    }

    public BulletinFetchSettingsInfoRequest(List<String> list) {
        this.channelIds = list;
    }
}
