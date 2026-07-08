package tikcast.api.fans;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;
import webcast.data.CurrentSuperFanContract;
import webcast.data.FansClubBanner;
import webcast.data.SuperFanPackage;
import webcast.data.SuperFanPermissionInfo;
import webcast.data.SuperFanPrivilege;
import webcast.data.SuperFanRelation;
import webcast.data.TPText;

/* JADX INFO: loaded from: classes29.dex */
public final class GetNonFansUserDataResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("all_pkg_infos")
        public List<SuperFanPackage> allPkgInfos = new ArrayList();

        @C09CT("anchor_info")
        public User anchorInfo;

        @C09CT("current_contract_info")
        public CurrentSuperFanContract currentContractInfo;

        @C09CT("extra")
        public Extra extra;

        @C09CT("fans_club_banner")
        public FansClubBanner fansClubBanner;

        @C09CT("fans_count")
        public long fansCount;

        @C09CT("notice_board")
        public TPText noticeBoard;

        @C09CT("send_comment_num")
        public long sendCommentNum;

        @C09CT("sending_gift_num")
        public long sendingGiftNum;

        @C09CT("super_fan_permission_info")
        public SuperFanPermissionInfo superFanPermissionInfo;

        @C09CT("super_fan_privilege_info")
        public SuperFanPrivilege superFanPrivilegeInfo;

        @C09CT("super_fan_relation")
        public SuperFanRelation superFanRelation;

        @C09CT("user_info")
        public User userInfo;

        @C09CT("user_tip")
        public TPText userTip;

        @C09CT("watch_live_minute")
        public long watchLiveMinute;

        @C09CT("watch_live_times")
        public long watchLiveTimes;
    }

    public static final class Extra {

        @C09CT("is_sandbox")
        public boolean isSandbox;
    }
}
