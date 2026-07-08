package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class UpsellRevokeInfo {

    @C09CT("revoke_reason")
    public int revokeReason;

    @C09CT("revoke_tags")
    public List<Integer> revokeTags = new ArrayList();

    @C09CT("revoke_time")
    public long revokeTime;

    @C09CT("will_revoke")
    public boolean willRevoke;
}
