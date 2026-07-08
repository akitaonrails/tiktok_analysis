package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class AddOnFeed implements Serializable {
    public static final int $stable = 0;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("type")
    public final int type;

    public AddOnFeed(String str, int i) {
        this.id = str;
        this.type = i;
    }
}
