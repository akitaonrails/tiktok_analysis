package com.ss.android.ugc.aweme.inbox.bulletin.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinBoardDatabaseConfig {

    @C09CT("delay_time")
    public final Long delayTime;

    @C09CT("enable")
    public final Integer enable;

    @C09CT("first_fetch_item_count")
    public final Integer firstFetchCount;

    @C09CT("prepare_scene")
    public final Integer prepareScene;

    public BulletinBoardDatabaseConfig() {
        this(null, null, null, null);
    }

    public BulletinBoardDatabaseConfig(Integer num, Integer num2, Integer num3, Long l) {
        this.enable = num;
        this.prepareScene = num2;
        this.firstFetchCount = num3;
        this.delayTime = l;
    }
}
