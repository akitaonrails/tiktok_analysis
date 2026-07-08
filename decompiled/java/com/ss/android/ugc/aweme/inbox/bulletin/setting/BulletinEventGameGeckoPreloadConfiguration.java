package com.ss.android.ugc.aweme.inbox.bulletin.setting;

import X.C09CT;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinGeckoResourceModel;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinEventGameGeckoPreloadConfiguration {
    public static final int $stable = 8;

    @C09CT("preload_gecko_resource_model_list")
    public final List<BulletinGeckoResourceModel> preloadGeckoResourceModelList;

    public BulletinEventGameGeckoPreloadConfiguration() {
        this(null);
    }

    public BulletinEventGameGeckoPreloadConfiguration(List<BulletinGeckoResourceModel> list) {
        this.preloadGeckoResourceModelList = list;
    }
}
