package com.ss.android.ugc.aweme.im.b2c.landing;

import X.C09CT;
import com.ss.android.ugc.aweme.im.b2c.platformization.ConvContext;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class LandingMessageRequestBody {

    @C09CT("biz_id")
    public final String businessId;

    @C09CT("conv_ctx")
    public final ConvContext convContext;

    @C09CT("extra")
    public final String extra;

    @C09CT("landing_messages")
    public final List<BusinessAutoMessage> landingMessages;

    @C09CT("trigger_scene")
    public final Integer triggerScene;

    @C09CT("biz_uid")
    public final Long uid;

    public LandingMessageRequestBody() {
        this(null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LandingMessageRequestBody)) {
            return false;
        }
        LandingMessageRequestBody landingMessageRequestBody = (LandingMessageRequestBody) obj;
        return Intrinsics.LJFF(this.convContext, landingMessageRequestBody.convContext) && Intrinsics.LJFF(this.uid, landingMessageRequestBody.uid) && Intrinsics.LJFF(this.businessId, landingMessageRequestBody.businessId) && Intrinsics.LJFF(this.extra, landingMessageRequestBody.extra) && Intrinsics.LJFF(this.triggerScene, landingMessageRequestBody.triggerScene) && Intrinsics.LJFF(this.landingMessages, landingMessageRequestBody.landingMessages);
    }

    public LandingMessageRequestBody(ConvContext convContext, Long l, String str, String str2, Integer num, List<BusinessAutoMessage> list) {
        this.convContext = convContext;
        this.uid = l;
        this.businessId = str;
        this.extra = str2;
        this.triggerScene = num;
        this.landingMessages = list;
    }
}
