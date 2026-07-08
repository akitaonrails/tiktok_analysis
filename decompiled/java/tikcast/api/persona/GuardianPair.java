package tikcast.api.persona;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GuardianPair {

    @C09CT("contenders")
    public List<GuardianParticipant> contenders = new ArrayList();

    @C09CT("creator")
    public User creator;

    @C09CT("creator_is_live")
    public boolean creatorIsLive;

    @C09CT("current_guardian")
    public GuardianParticipant currentGuardian;

    @C09CT("end_of_ranking_week")
    public long endOfRankingWeek;

    @C09CT("last_days")
    public int lastDays;

    @C09CT("surpass_gift_count")
    public int surpassGiftCount;

    @C09CT("surpass_price")
    public long surpassPrice;
}
