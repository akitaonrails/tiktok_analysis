package tikcast.api.privilege.user_level;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.List;
import tikcast.api.user_level.UserGrade;

/* JADX INFO: loaded from: classes18.dex */
public final class GameplayPage {

    @C09CT("blast_status")
    public int blastStatus;

    @C09CT("current_gift")
    public SHOWGiftMeta currentGift;

    @C09CT("end_time_ms")
    public long endTimeMs;

    @C09CT("has_upgraded")
    public boolean hasUpgraded;

    @C09CT("is_eligible")
    public boolean isEligible;

    @C09CT("minimum_grade_allowed_to_join")
    public long minimumGradeAllowedToJoin;

    @C09CT("next_gift")
    public SHOWGiftMeta nextGift;

    @C09CT("next_user_grade")
    public UserGrade nextUserGrade;

    @C09CT("start_time_ms")
    public long startTimeMs;

    @C09CT("user_grade")
    public UserGrade userGrade;

    @C09CT("user_unlock")
    public boolean userUnlock;

    @C09CT("bullet_message_list")
    public List<Text> bulletMessageList = new ArrayList();

    @C09CT("show_id")
    public String showId = "";

    @C09CT("progress")
    public String progress = "";

    public static final class SHOWGiftMeta {

        @C09CT("coins")
        public long coins;

        @C09CT("gift_group_in_tab")
        public int giftGroupInTab;

        @C09CT("gift_id")
        public long giftId;

        @C09CT("gift_left")
        public long giftLeft;
    }
}
