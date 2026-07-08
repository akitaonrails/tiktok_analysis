package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinActivityStruct {

    @C09CT("activity_id")
    public final String activityId;

    @C09CT("item_edit_page")
    public final BulletinItemEditPageConfig itemEditPage;

    @C09CT("item_list_page")
    public final BulletinItemListPageConfig itemListPage;

    public BulletinActivityStruct() {
        this(null, null, null);
    }

    public BulletinActivityStruct(String str, BulletinItemEditPageConfig bulletinItemEditPageConfig, BulletinItemListPageConfig bulletinItemListPageConfig) {
        this.activityId = str;
        this.itemEditPage = bulletinItemEditPageConfig;
        this.itemListPage = bulletinItemListPageConfig;
    }
}
