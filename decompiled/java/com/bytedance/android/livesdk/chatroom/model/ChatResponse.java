package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import webcast.data.UserIdentity;

/* JADX INFO: loaded from: classes.dex */
public final class ChatResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("background_image")
        public ImageModel backgroundImage;

        @C09CT("comment_tray")
        public CommentTray commentTray;

        @C09CT("display_text")
        public Text displayText;

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public long id;

        @C09CT("msg_id")
        public long msgId;

        @C09CT("user")
        public User user;

        @C09CT("user_identity")
        public UserIdentity userIdentity;

        @C09CT("content")
        public String content = "";

        @C09CT("msg_id_str")
        public String msgIdStr = "";

        @C09CT("fullscreen_text_color")
        public String fullscreenTextColor = "";

        @C09CT("content_language")
        public String contentLanguage = "";
    }
}
