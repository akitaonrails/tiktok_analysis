package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C00G8;
import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class PageInfoData implements Serializable {

    @C09CT("compliance_theme")
    public final Integer complianceTheme;

    @C09CT("exception_ux")
    public final LsExceptionUx exceptionUx;

    @C09CT("price_secret")
    public final String priceSecret;

    public final boolean isTokopediaTheme() {
        Integer num = this.complianceTheme;
        return num != null && num.intValue() == C00G8.TOKOPEDIA.getType();
    }

    public PageInfoData(Integer num, LsExceptionUx lsExceptionUx, String str) {
        this.complianceTheme = num;
        this.exceptionUx = lsExceptionUx;
        this.priceSecret = str;
    }
}
