package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class UserSuggestionInfo {

    @C09CT("vote_count")
    public long voteCount;

    @C09CT("voter_info_list")
    public List<UserInfo> voterInfoList = new ArrayList();

    @C09CT("detail_page_lynx")
    public String detailPageLynx = "";

    public static final class UserInfo {

        @C09CT("avatar_thumb")
        public ImageModel avatarThumb;

        @C09CT("nick_name")
        public String nickName = "";

        @C09CT("user_id")
        public long userId;
    }
}
