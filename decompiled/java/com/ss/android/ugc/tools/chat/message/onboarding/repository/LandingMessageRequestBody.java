package com.ss.android.ugc.tools.chat.message.onboarding.repository;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.tools.chat.input.model.ConvContext;

/* JADX INFO: loaded from: classes5.dex */
public final class LandingMessageRequestBody {

    @C09CT("biz_id")
    public final String businessId;

    @C09CT("conv_ctx")
    public final ConvContext convContext;

    @C09CT("extra")
    public final String extra;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("biz_uid")
    public final Long uid;

    public LandingMessageRequestBody() {
        this(null, null, null, null, null);
    }

    public LandingMessageRequestBody(ConvContext convContext, Long l, String str, String str2, LogPbBean logPbBean) {
        this.convContext = convContext;
        this.uid = l;
        this.businessId = str;
        this.extra = str2;
        this.logPb = logPbBean;
    }
}
