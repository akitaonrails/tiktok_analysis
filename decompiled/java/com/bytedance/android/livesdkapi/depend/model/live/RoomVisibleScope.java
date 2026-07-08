package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class RoomVisibleScope {

    @C09CT("visible_scope_type")
    public int visibleScopeType;

    @C09CT("visible_user_id_list")
    public List<Long> visibleUserIdList = new ArrayList();

    @C09CT("visible_chat_id_list")
    public List<Long> visibleChatIdList = new ArrayList();
}
