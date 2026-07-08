package tikcast.api.user_level;

import X.C09CT;
import com.bytedance.android.live.base.model.user.BadgeStruct;

/* JADX INFO: loaded from: classes.dex */
public final class UserGrade {

    @C09CT("current_grade")
    public int currentGrade;

    @C09CT("current_score")
    public long currentScore;

    @C09CT("default_grade_badge")
    public BadgeStruct defaultGradeBadge;

    @C09CT("grade_mode")
    public int gradeMode;

    @C09CT("grade_score_rule")
    public GradeScoreRule gradeScoreRule;

    @C09CT("nick_name")
    public String nickName = "";

    @C09CT("opacity_badge")
    public BadgeStruct opacityBadge;

    @C09CT("time_to_sleep")
    public int timeToSleep;

    @C09CT("version")
    public long version;
}
