package webcast.im;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class PermitJoinGroupBizContent {

    @C09CT("matched_preference_tag")
    public int matchedPreferenceTag;

    @C09CT("quick_cohost_invitee_user_info")
    public QuickCohostInviteeUserInfo quickCohostInviteeUserInfo;

    @C09CT("reply_status")
    public int replyStatus;

    @C09CT("skip_cancel_match")
    public boolean skipCancelMatch;

    @C09CT("source_type")
    public int sourceType;

    public static final class QuickCohostInviteeUserInfo {

        @C09CT("avatar_thumb")
        public ImageModel avatarThumb;

        @C09CT("nickname")
        public String nickname = "";
    }
}
