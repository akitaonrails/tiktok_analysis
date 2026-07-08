package tikcast.api.privilege.creator_points;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class RewardDetailsPage {

    @C09CT("current_balance")
    public int currentBalance;

    @C09CT("reward_definition")
    public RewardDefinition rewardDefinition;

    @C09CT("reward_status")
    public int rewardStatus;

    @C09CT("subtitle")
    public Text subtitle;

    @C09CT("main_colour")
    public String mainColour = "";

    @C09CT("sections")
    public List<RewardSection> sections = new ArrayList();

    @C09CT("use_reward_uri")
    public String useRewardUri = "";
}
