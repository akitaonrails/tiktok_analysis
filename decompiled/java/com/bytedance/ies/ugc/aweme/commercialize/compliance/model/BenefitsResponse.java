package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class BenefitsResponse extends BaseResponse implements Serializable {

    @C09CT("benefits")
    public List<BenefitInfo> benefits;

    @C09CT("benefits_title")
    public String benefitsTitle;

    @C09CT("benefit_page_learn_more_url")
    public final String questionMarkLink;

    public BenefitsResponse() {
        this(null, null, null);
    }

    public final List<BenefitInfo> getBenefits() {
        return this.benefits;
    }

    public final String getBenefitsTitle() {
        return this.benefitsTitle;
    }

    public final String getQuestionMarkLink() {
        return this.questionMarkLink;
    }

    public final void setBenefits(List<BenefitInfo> list) {
        this.benefits = list;
    }

    public final void setBenefitsTitle(String str) {
        this.benefitsTitle = str;
    }

    public BenefitsResponse(String str, List<BenefitInfo> list, String str2) {
        this.benefitsTitle = str;
        this.benefits = list;
        this.questionMarkLink = str2;
    }
}
