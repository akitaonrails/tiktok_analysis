package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class GetPlaylistAddableItemData {

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("next_cursor")
    public long nextCursor;

    @C09CT("replays")
    public List<AddableReplay> replays = new ArrayList();
}
