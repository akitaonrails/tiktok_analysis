package com.ss.android.ugc.profile.business.ad.platform;

import X.C09CT;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;

/* JADX INFO: loaded from: classes20.dex */
public final class BABizData extends BizBaseData {
    public static final int $stable = 8;

    @C09CT("ba_category")
    public String category;

    @C09CT("identifier_type")
    public Integer identifierType;

    @C09CT("ba_company_name")
    public String rbaRealCompanyName;

    public final String getCategory() {
        return this.category;
    }

    public final Integer getIdentifierType() {
        return this.identifierType;
    }

    public final String getRbaRealCompanyName() {
        return this.rbaRealCompanyName;
    }

    public final void setCategory(String str) {
        this.category = str;
    }

    public final void setIdentifierType(Integer num) {
        this.identifierType = num;
    }

    public final void setRbaRealCompanyName(String str) {
        this.rbaRealCompanyName = str;
    }
}
