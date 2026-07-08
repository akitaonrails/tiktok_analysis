package com.ss.android.ugc.aweme.notification.api;

import X.C09CT;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSetting;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinUpdateSettingsInfoRequest {

    @C09CT("channel_ids")
    public final List<String> channelIds;

    @C09CT("settings")
    public final List<BulletinSetting> settings;

    public BulletinUpdateSettingsInfoRequest() {
        this(null, null);
    }

    public BulletinUpdateSettingsInfoRequest(List<String> list, List<BulletinSetting> list2) {
        this.channelIds = list;
        this.settings = list2;
    }
}
