package com.bytedance.ies.ugc.aweme.commercialize.compliance.thirdparty;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.AdvertiserModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class ThirdPartySetAdvertiserStatusResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;
    public AdvertiserModel LL;
    public boolean LLILLJJLI;

    @C09CT("learn_more_link")
    public String learnMoreLink;

    @C09CT("limit_reached_text")
    public String limitReachedText;

    @C09CT("removable")
    public Boolean removable;

    public ThirdPartySetAdvertiserStatusResponse() {
        this(Boolean.FALSE, null, null, null, false);
    }

    public final AdvertiserModel getAdvertiser() {
        return this.LL;
    }

    public final String getLearnMoreLink() {
        return this.learnMoreLink;
    }

    public final String getLimitReachedText() {
        return this.limitReachedText;
    }

    public final Boolean getRemovable() {
        return this.removable;
    }

    public final boolean isSuccess() {
        return this.LLILLJJLI;
    }

    public final void setAdvertiser(AdvertiserModel advertiserModel) {
        this.LL = advertiserModel;
    }

    public final void setLearnMoreLink(String str) {
        this.learnMoreLink = str;
    }

    public final void setLimitReachedText(String str) {
        this.limitReachedText = str;
    }

    public final void setRemovable(Boolean bool) {
        this.removable = bool;
    }

    public final void setSuccess(boolean z) {
        this.LLILLJJLI = z;
    }

    public ThirdPartySetAdvertiserStatusResponse(Boolean bool, String str, String str2, AdvertiserModel advertiserModel, boolean z) {
        this.removable = bool;
        this.learnMoreLink = str;
        this.limitReachedText = str2;
        this.LL = advertiserModel;
        this.LLILLJJLI = z;
    }
}
