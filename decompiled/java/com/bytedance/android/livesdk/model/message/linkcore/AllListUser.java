package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AllListUser {

    @C09CT("applied_list")
    public List<LinkLayerListUser> appliedList;

    @C09CT("invited_list")
    public List<LinkLayerListUser> invitedList;

    @C09CT("linked_list")
    public List<LinkLayerListUser> linkedList;

    @C09CT("ready_list")
    public List<LinkLayerListUser> readyList;

    public AllListUser() {
        this(null, null, null, null);
    }

    public AllListUser(List<LinkLayerListUser> list, List<LinkLayerListUser> list2, List<LinkLayerListUser> list3, List<LinkLayerListUser> list4) {
        this.linkedList = list;
        this.appliedList = list2;
        this.invitedList = list3;
        this.readyList = list4;
    }
}
