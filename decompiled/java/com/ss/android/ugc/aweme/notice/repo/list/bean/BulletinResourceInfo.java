package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinResourceInfo {

    @C09CT("aweme_map")
    public final Map<String, Aweme> awemeMap;

    @C09CT("business_type")
    public final String businessType;

    @C09CT("event_params")
    public final List<BulletinCardKV> eventParams;

    @C09CT("card_ui_info")
    public final List<BulletinCardUIInfo> hybridCardUIInfo;

    @C09CT("config_info")
    public final BulletinHybridCardConfigStruct hybridConfigInfo;

    @C09CT("interaction_type")
    public final int interactionType;

    @C09CT("resource_type")
    public final long resourceType;

    public BulletinResourceInfo() {
        this(0L, "", null, null, 0, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BulletinResourceInfo(long j, String str, List<BulletinCardUIInfo> list, BulletinHybridCardConfigStruct bulletinHybridCardConfigStruct, int i, List<BulletinCardKV> list2, Map<String, ? extends Aweme> map) {
        this.resourceType = j;
        this.businessType = str;
        this.hybridCardUIInfo = list;
        this.hybridConfigInfo = bulletinHybridCardConfigStruct;
        this.interactionType = i;
        this.eventParams = list2;
        this.awemeMap = map;
    }
}
