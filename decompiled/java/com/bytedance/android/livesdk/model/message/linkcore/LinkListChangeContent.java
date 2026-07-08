package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.ContentPosition;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: loaded from: classes.dex */
public final class LinkListChangeContent {

    @C09CT("content_pos")
    public List<ContentPosition> contentPos;

    @C09CT("linked_user_ui_positions")
    public List<String> linkedUserUiPositions;

    @C09CT("type")
    public int listChangeType;

    @C09CT("ui_pos")
    public List<PosIdentity> uiPos;

    @C09CT("list")
    public AllListUser userList;

    public LinkListChangeContent() {
        this(0, null, new ArrayList(), new ArrayList(), new ArrayList());
    }

    public LinkListChangeContent(int i, AllListUser allListUser, List<String> list, List<ContentPosition> list2, List<PosIdentity> list3) {
        this.listChangeType = i;
        this.userList = allListUser;
        this.linkedUserUiPositions = list;
        this.contentPos = list2;
        this.uiPos = list3;
    }
}
