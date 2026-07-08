package com.ss.android.ugc.aweme.commercialize.promote.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class PromoteConfig implements Serializable {

    @C09CT("icon_text")
    public String iconText;

    @C09CT("promote_pro_status")
    public Integer promoteProStatus;

    @C09CT("pa_recommend_cml")
    public Integer recommendCML;

    public final String getIconText() {
        return this.iconText;
    }

    public final Integer getPromoteProStatus() {
        return this.promoteProStatus;
    }

    public final Integer getRecommendCML() {
        return this.recommendCML;
    }

    public final void setIconText(String str) {
        this.iconText = str;
    }

    public final void setPromoteProStatus(Integer num) {
        this.promoteProStatus = num;
    }

    public final void setRecommendCML(Integer num) {
        this.recommendCML = num;
    }

    public PromoteConfig(Integer num, Integer num2, String str) {
        this.recommendCML = num;
        this.promoteProStatus = num2;
        this.iconText = str;
    }
}
