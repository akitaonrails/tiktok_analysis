package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RandomMatchContent {

    @C09CT("matched_preference_tag")
    public int matchedPreferenceTag;

    @C09CT("paired_time")
    public long pairedTime;

    @C09CT("source_type")
    public long sourceType;

    @C09CT("match_id")
    public String matchId = "";

    @C09CT("paired_group_list")
    public List<UserGroup> pairedGroupList = new ArrayList();

    public static final class UserGroup {

        @C09CT("user_info")
        public List<UserInfo> userInfo = new ArrayList();

        public static final class UserInfo {

            @C09CT("avatar_thumb")
            public ImageModel avatarThumb;

            @C09CT("invitation_role_type")
            public int invitationRoleType;

            @C09CT("nickname")
            public String nickname = "";

            @C09CT("room_id")
            public long roomId;

            @C09CT("user_id")
            public long userId;
        }
    }
}
