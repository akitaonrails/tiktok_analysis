package webcast.api.room;

import X.C09CT;
import com.bytedance.android.livesdk.message.proto.CppAgeVerificationInfo;
import com.bytedance.android.livesdk.message.proto.CppTaskInfo;
import com.bytedance.android.livesdk.message.proto.WebcastLSAccessStatus;

/* JADX INFO: loaded from: classes.dex */
public final class CppTaskInfoResponse {

    @C09CT("data")
    public Data data;

    @C09CT("extra")
    public Extra extra;

    public static final class Data {

        @C09CT("advanced_live_ban_status")
        public BanStatus advancedLiveBanStatus;

        @C09CT("anchor_level_permission")
        public AnchorLevelPermission anchorLevelPermission;

        @C09CT("ban_status")
        public BanStatus banStatus;

        @C09CT("cpp_age_verification_info")
        public CppAgeVerificationInfo cppAgeVerificationInfo;

        @C09CT("cpp_task_info")
        public CppTaskInfo cppTaskInfo;

        @C09CT("cpp_version")
        public int cppVersion;

        @C09CT("exam_status")
        public int examStatus;

        @C09CT("permission_level")
        public int permissionLevel;

        @C09CT("webcast_ls_access_status")
        public WebcastLSAccessStatus webcastLsAccessStatus;

        public static final class AnchorLevelPermission {

            @C09CT("cohost_and_pk")
            public int cohostAndPk;

            @C09CT("multi_guest")
            public int multiGuest;
        }

        public static final class BanStatus {

            @C09CT("end_time")
            public long endTime;

            @C09CT("is_ban")
            public boolean isBan;
        }
    }

    public static final class Extra {

        @C09CT("now")
        public long now;
    }
}
