package com.bytedance.android.livesdk.model.message.linker.listchangemessage;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LinkerListChangeContent {

    @C09CT("linked_users")
    public List<LinkListUser> onLineUsers = new ArrayList();

    @C09CT("applied_users")
    public List<LinkListUser> waitingUsers = new ArrayList();

    @C09CT("connecting_users")
    public List<LinkListUser> connectingUsers = new ArrayList();
}
