package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class BonusModule {

    @C09CT("bonus_info")
    public BonusInfo bonusInfo;

    @C09CT("title")
    public String title;

    public BonusModule() {
    }

    public BonusModule(String str, BonusInfo bonusInfo) {
        this.title = str;
        this.bonusInfo = bonusInfo;
    }
}
