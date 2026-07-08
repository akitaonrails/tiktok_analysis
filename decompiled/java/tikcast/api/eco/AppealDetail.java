package tikcast.api.eco;

import X.C09CT;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class AppealDetail {

    @C09CT("is_appealed")
    public boolean isAppealed;

    @C09CT("penalty_time")
    public long penaltyTime;

    @C09CT("punish_id")
    public long punishId;

    @C09CT("restore_time")
    public long restoreTime;

    @C09CT(Scene.SCENE_SERVICE)
    public long scene;

    @C09CT("show_appeal_button")
    public boolean showAppealButton;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("user_id")
    public long userId;

    @C09CT("violation_reason")
    public List<String> violationReason = new ArrayList();

    @C09CT("subfeature_name")
    public String subfeatureName = "";

    @C09CT("violation_type")
    public String violationType = "";

    @C09CT("rank_details")
    public List<RankDetail> rankDetails = new ArrayList();

    @C09CT("punish_id_str")
    public String punishIdStr = "";

    @C09CT("user_id_str")
    public String userIdStr = "";

    @C09CT("moderation_info")
    public String moderationInfo = "";
}
