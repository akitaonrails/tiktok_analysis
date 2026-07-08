package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class CheckPermissionResponse {

    @C09CT("anchor_onboard_permit")
    public boolean anchorOnboardPermit;

    @C09CT("anchor_punished")
    public boolean anchorPunished;

    @C09CT("mutli_host_permission")
    public boolean multiHostPermission;

    public CheckPermissionResponse() {
        this(false, false, false);
    }

    public CheckPermissionResponse(boolean z, boolean z2, boolean z3) {
        this.multiHostPermission = z;
        this.anchorOnboardPermit = z2;
        this.anchorPunished = z3;
    }
}
