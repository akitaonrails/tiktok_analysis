package com.ss.android.ugc.tiktok.pns.privacy.setting.agechange.model;

import X.C09CT;
import com.ss.android.ugc.aweme.network.model.BaseResponse;

/* JADX INFO: loaded from: classes29.dex */
public final class AgeGraduationPageResponse extends BaseResponse {

    @C09CT("age_type")
    public Integer ageType;

    @C09CT("link")
    public String link;

    public final Integer getAgeType() {
        return this.ageType;
    }

    public final String getLink() {
        return this.link;
    }

    public final void setAgeType(Integer num) {
        this.ageType = num;
    }

    public final void setLink(String str) {
        this.link = str;
    }
}
