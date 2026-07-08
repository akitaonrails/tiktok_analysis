package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes5.dex */
public class AdFeSettings {

    @C09CT("legal_page")
    public String legalPage;

    @C09CT("music_legal")
    public String musicLegal;

    @C09CT("revenue_share")
    public RevenueShare revenueShare;

    public String getLegalPage() throws C316660CbA {
        String str = this.legalPage;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public String getMusicLegalPage() throws C316660CbA {
        String str = this.musicLegal;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public RevenueShare getRevenueShare() throws C316660CbA {
        RevenueShare revenueShare = this.revenueShare;
        if (revenueShare != null) {
            return revenueShare;
        }
        throw new C316660CbA();
    }
}
