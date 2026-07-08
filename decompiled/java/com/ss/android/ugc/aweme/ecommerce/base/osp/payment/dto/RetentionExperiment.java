package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes2.dex */
public final class RetentionExperiment {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("type")
    public String type;

    public RetentionExperiment() {
        this(null, null);
    }

    public RetentionExperiment(String str, String str2) {
        this.type = str;
        this.id = str2;
    }
}
