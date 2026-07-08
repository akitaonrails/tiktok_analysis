package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import java.util.List;
import webcast.data.MsgFilter;
import webcast.data.UserIdentity;

/* JADX INFO: loaded from: classes.dex */
public class ChatMessage extends AbstractC1136060ffY {
    public transient String LL;

    @C09CT("at_user")
    public User atUser;

    @C09CT("background_image")
    public ImageModel background;

    @C09CT("background_image_v2")
    public ImageModel backgroundImageV2;

    @C09CT("chat_id")
    public long chatId;

    @C09CT("comment_label_scores")
    public List<CommentLabelScore> commentLabelScores;

    @C09CT("comment_quality_scores")
    public List<CommentQualityScore> commentQualityScores;

    @C09CT("comment_tag")
    public List<Integer> commentTag;

    @C09CT("community_flagged_status")
    public int communityflaggedStatus;

    @C09CT("content")
    public String content;

    /* JADX INFO: renamed from: emotes, reason: collision with root package name */
    @C09CT("emotes")
    public List<EmoteWithIndex> f314emotes;

    @C09CT("gift_image")
    public ImageModel giftImage;

    @C09CT("input_type")
    public int inputType;

    @C09CT("is_on_comment_tray")
    public boolean isOnCommentTray;

    @C09CT("mention_user_list")
    public List<Long> mentionUserList;

    @C09CT("mention_users")
    public List<User> mentionUsers;

    @C09CT("msg_filter")
    public MsgFilter msgFilter;

    @C09CT("public_area_common")
    public PublicAreaCommon publicAreaCommon;

    @C09CT("public_area_message_common")
    public PublicAreaMessageCommon publicAreaMessageCommon;

    @C09CT("quick_chat_scene")
    public int quickChatScene;

    @C09CT("screen_time")
    public long screenTime;

    @C09CT("user_identity")
    public UserIdentity userIdentity;

    @C09CT("user")
    public User userInfo;

    @C09CT("visible_to_sender")
    public boolean visibleToSender;

    @C09CT("signature_version")
    public String signatureVersion = "";

    @C09CT("ec_streamer_key")
    public String ecStreamerKey = "";

    @C09CT("full_screen_text_color")
    public String fullScreenTextColor = "#FF0000";

    @C09CT("content_language")
    public String contentLanguage = "";

    @C09CT("signature")
    public String signature = "";

    public final boolean LIZ() {
        return this.communityflaggedStatus == 1;
    }

    public final boolean LIZIZ() {
        return this.inputType == 2;
    }

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        if (this.userInfo == null) {
            return false;
        }
        if (!TextUtils.isEmpty(this.content)) {
            return true;
        }
        List<EmoteWithIndex> list = this.f314emotes;
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // X.AbstractC1136060ffY
    public final boolean supportDisplayText() {
        CommonMessageData commonMessageData = this.baseMessage;
        return (commonMessageData == null || commonMessageData.displayText == null) ? false : true;
    }

    public ChatMessage() {
        this.type = C001A.CHAT;
    }
}
