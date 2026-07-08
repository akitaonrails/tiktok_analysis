package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GiftRecord {

    @C09CT("from_user")
    public User fromUser;

    @C09CT("gift")
    public Gift gift;

    @C09CT("message")
    public Message message;

    @C09CT("tags")
    public List<String> tags = new ArrayList();

    public static final class Gift {

        @C09CT("diamonds")
        public long diamonds;

        @C09CT("gift_count")
        public int giftCount;

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public long id;

        @C09CT("image")
        public ImageModel image;

        @C09CT("name")
        public String name = "";
    }

    public static final class Message {

        @C09CT("created_on_timestamp")
        public long createdOnTimestamp;

        @C09CT("group_id")
        public long groupId;

        @C09CT("msg_id")
        public long msgId;
    }

    public static final class User {

        @C09CT("avatar")
        public ImageModel avatar;

        @C09CT("enigma_info")
        public User.EnigmaInfo enigmaInfo;

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public long id;

        @C09CT("nickname")
        public String nickname = "";
    }
}
