package com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class CreatorPermissionResponse {

    @C09CT("code")
    public final Integer code;

    @C09CT("extra")
    public final Map<String, String> extra;

    @C09CT("is_ec_permission")
    public final boolean isEcPermission;

    @C09CT("message")
    public final String message;

    public CreatorPermissionResponse() {
        this(0, "", false, null);
    }

    public CreatorPermissionResponse(Integer num, String str, boolean z, Map<String, String> map) {
        this.code = num;
        this.message = str;
        this.isEcPermission = z;
        this.extra = map;
    }
}
