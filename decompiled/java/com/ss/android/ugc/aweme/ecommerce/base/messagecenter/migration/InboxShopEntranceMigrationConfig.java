package com.ss.android.ugc.aweme.ecommerce.base.messagecenter.migration;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class InboxShopEntranceMigrationConfig {

    @C09CT("display_duration_days")
    public final Integer displayDurationDays;

    @C09CT("max_click_button_count")
    public final Integer maxClickButtonCount;

    @C09CT("migration_type")
    public final Integer migrationType;

    @C09CT("reshow_delay_days")
    public final Integer reshowDelayDays;

    @C09CT("version")
    public final Integer version;

    public InboxShopEntranceMigrationConfig(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.version = num;
        this.migrationType = num2;
        this.displayDurationDays = num3;
        this.reshowDelayDays = num4;
        this.maxClickButtonCount = num5;
    }
}
