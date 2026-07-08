package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinItemListPageConfig {

    @C09CT("emojis")
    public final List<String> emojis;

    @C09CT("style_struct")
    public final BulletinStyleStruct styleStruct;

    public BulletinItemListPageConfig() {
        this(null, null);
    }

    public BulletinItemListPageConfig(List<String> list, BulletinStyleStruct bulletinStyleStruct) {
        this.emojis = list;
        this.styleStruct = bulletinStyleStruct;
    }
}
