package com.ss.android.ugc.aweme.texttoimage;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class Text2ImageAIGCNotificationResponse {

    @C09CT("err_code")
    public final Integer errCode;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    /* JADX WARN: Multi-variable type inference failed */
    public Text2ImageAIGCNotificationResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public Text2ImageAIGCNotificationResponse(Integer num, Integer num2) {
        this.status = num;
        this.errCode = num2;
    }

    public /* synthetic */ Text2ImageAIGCNotificationResponse(Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
