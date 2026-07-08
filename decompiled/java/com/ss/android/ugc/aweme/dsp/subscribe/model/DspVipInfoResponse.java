package com.ss.android.ugc.aweme.dsp.subscribe.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.music.model.TTMLink;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class DspVipInfoResponse extends BaseResponse implements Serializable {

    @C09CT("is_vip")
    public boolean isVip;

    @C09CT("log_extra")
    public String logExtra;

    @C09CT("next_schema")
    public String nextSchema;

    @C09CT("ttm_link")
    public TTMLink ttmLink;

    public final String getLogExtra() {
        return this.logExtra;
    }

    public final String getNextSchema() {
        return this.nextSchema;
    }

    public final TTMLink getTtmLink() {
        return this.ttmLink;
    }

    public final boolean isVip() {
        return this.isVip;
    }

    public final void setLogExtra(String str) {
        this.logExtra = str;
    }

    public final void setNextSchema(String str) {
        this.nextSchema = str;
    }

    public final void setTtmLink(TTMLink tTMLink) {
        this.ttmLink = tTMLink;
    }

    public final void setVip(boolean z) {
        this.isVip = z;
    }
}
