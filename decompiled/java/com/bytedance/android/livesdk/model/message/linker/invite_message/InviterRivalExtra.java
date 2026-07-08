package com.bytedance.android.livesdk.model.message.linker.invite_message;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.model.interact.OptPairInfo;
import com.bytedance.android.livesdk.model.Hashtag;

/* JADX INFO: loaded from: classes.dex */
public class InviterRivalExtra {

    @C09CT("authentication_info")
    public AuthenticationInfo authenticationInfo;

    @C09CT("avatar_thumb")
    public ImageModel avatarThumb;

    @C09CT("display_id")
    public String displayId;

    @C09CT("follow_status")
    public long followStatus;

    @C09CT("follower_count")
    public long followerCount;

    @C09CT("is_best_teammate")
    public boolean isBestTeammate;

    @C09CT("Label")
    public String label;

    @C09CT("hashtag")
    public Hashtag mHashtag;

    @C09CT("nickname")
    public String nickname;

    @C09CT("opt_pair_info")
    public OptPairInfo optPairInfo;

    @C09CT("Text")
    public String text;

    @C09CT("TextType")
    public int textType;

    @C09CT("user_count")
    public int userCount;

    @C09CT("user_id")
    public long userId;
}
