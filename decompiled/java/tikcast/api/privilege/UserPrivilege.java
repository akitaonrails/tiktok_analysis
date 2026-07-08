package tikcast.api.privilege;

import X.C09CT;
import com.bytedance.android.live.base.model.user.AvatarFrame;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.EntranceEffect;
import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class UserPrivilege {

    @C09CT("badge")
    public BadgeStruct badge;

    @C09CT("end_time")
    public long endTime;

    @C09CT("entrance_effect")
    public EntranceEffect entranceEffect;

    @C09CT("entrance_effect_issue_source")
    public int entranceEffectIssueSource;

    @C09CT("faq_info_list")
    public List<PrivilegeFAQ> faqInfoList;

    @C09CT("frame")
    public AvatarFrame frame;

    @C09CT("general_activity")
    public boolean generalActivity;

    @C09CT("is_lock")
    public boolean isLock;

    @C09CT("not_applicable")
    public boolean notApplicable;

    @C09CT("privilege_log_extra")
    public PrivilegeLogExtra privilegeLogExtra;

    @C09CT("privilege_type")
    public int privilegeType;

    @C09CT("profit_rank_type")
    public int profitRankType;

    @C09CT("start_time")
    public long startTime;

    @C09CT("suite_id")
    public long suiteId;

    @C09CT("user_selected")
    public boolean userSelected;

    @C09CT("user_id")
    public String userId = "";

    @C09CT("privilege_id")
    public String privilegeId = "";

    @C09CT("privilege_name")
    public String privilegeName = "";

    @C09CT("privilege_desc")
    public String privilegeDesc = "";

    @C09CT("suite_id_str")
    public String suiteIdStr = "";
}
