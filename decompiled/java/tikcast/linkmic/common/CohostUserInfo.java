package tikcast.linkmic.common;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class CohostUserInfo {

    @C09CT("avatar_thumb")
    public ImageModel avatarThumb;

    @C09CT("best_teammate_uid")
    public long bestTeammateUid;

    @C09CT("cohost_mode")
    public CohostMode cohostMode;

    @C09CT("follow_status")
    public long followStatus;

    @C09CT("has_topic_perm")
    public boolean hasTopicPerm;

    @C09CT("in_different_invite_type_control_group")
    public boolean inDifferentInviteTypeControlGroup;

    @C09CT("is_enigma")
    public boolean isEnigma;

    @C09CT("is_low_version")
    public boolean isLowVersion;

    @C09CT("permission_type")
    public long permissionType;

    @C09CT("source_type")
    public int sourceType;

    @C09CT("stream_config")
    public CohostStreamConfig streamConfig;

    @C09CT("nickname")
    public String nickname = "";

    @C09CT("display_id")
    public String displayId = "";

    @C09CT("user_id_str")
    public String userIdStr = "";

    public static final class CohostMode {

        @C09CT("highest_take_the_stage_version_supported")
        public long highestTakeTheStageVersionSupported;

        @C09CT("is_take_the_stage_v2_supported")
        public boolean isTakeTheStageV2Supported;
    }
}
