package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class GetAnchorMotionInfoResponse implements Serializable {

    @C09CT("anchor_privilege")
    public final AnchorPrivilege anchorPrivilege;

    @C09CT("extra")
    public final Map<String, String> extra;

    public GetAnchorMotionInfoResponse() {
        this(null, null);
    }

    public GetAnchorMotionInfoResponse(AnchorPrivilege anchorPrivilege, Map<String, String> map) {
        this.anchorPrivilege = anchorPrivilege;
        this.extra = map;
    }
}
