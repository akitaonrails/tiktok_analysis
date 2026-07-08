package com.ss.android.ugc.aweme.template.datamodel;

import X.C09CT;
import X.C0X12;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class TemplateDetailModel extends BaseResponse implements C0X12, Serializable {
    public static final int $stable = 8;
    public String LL;
    public boolean LLILLJJLI;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("seven_post_count")
    public final TemplatePugcCreatorStatisticModel pugcCreatorStatistic;

    @C09CT("banner")
    public final TemplateBannerModel templateBanner;

    @C09CT("mv_info")
    public final TemplateStructModel templateInfo;

    @Override // X.C0X12
    public String getRequestId() {
        String str = this.LL;
        return str == null ? "" : str;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final TemplatePugcCreatorStatisticModel getPugcCreatorStatistic() {
        return this.pugcCreatorStatistic;
    }

    public final String getRid() {
        return this.LL;
    }

    public final TemplateBannerModel getTemplateBanner() {
        return this.templateBanner;
    }

    public final TemplateStructModel getTemplateInfo() {
        return this.templateInfo;
    }

    public final boolean isFromCache() {
        return this.LLILLJJLI;
    }

    public final void setFromCache(boolean z) {
        this.LLILLJJLI = z;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    @Override // X.C0X12
    public void setRequestId(String str) {
        this.LL = str;
    }

    public final void setRid(String str) {
        this.LL = str;
    }
}
