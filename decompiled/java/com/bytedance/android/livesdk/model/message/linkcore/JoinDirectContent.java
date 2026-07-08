package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class JoinDirectContent {

    @C09CT("all_users")
    public AllListUser allUsers;

    @C09CT("joiner")
    public LinkLayerListUser joiner;

    public JoinDirectContent() {
        this(null, null);
    }

    public JoinDirectContent(LinkLayerListUser linkLayerListUser, AllListUser allListUser) {
        this.joiner = linkLayerListUser;
        this.allUsers = allListUser;
    }
}
