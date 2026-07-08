package com.bytedance.android.pgcsdk.subscribe.model;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class PGCGetSubEmoteDetailRequest {

    @C09CT("custom_subwave_only")
    public boolean customSubwaveOnly;

    @C09CT("display_type")
    public int displayType;

    @C09CT("for_anchor")
    public boolean forAnchor;

    @C09CT("room_id")
    public long roomId;

    @C09CT("sec_anchor_id")
    public String secAnchorId = "";

    @C09CT("package_id")
    public String packageId = "";
}
