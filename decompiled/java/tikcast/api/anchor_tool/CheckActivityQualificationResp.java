package tikcast.api.anchor_tool;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class CheckActivityQualificationResp {

    @C09CT("data")
    public CheckActivityQualificationData data;

    public static final class CheckActivityQualificationData {

        @C09CT("has_participated_before")
        public boolean hasParticipatedBefore;

        @C09CT("sec_inviter_id")
        public String secInviterId = "";

        @C09CT("inviter_avatar")
        public String inviterAvatar = "";

        @C09CT("inviter_nickname")
        public String inviterNickname = "";

        @C09CT("sec_uid")
        public String secUid = "";

        @C09CT("avatar")
        public String avatar = "";
    }
}
