package tikcast.api.privilege.creator_points;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class RewardDefinition {

    @C09CT("reward_id")
    public String rewardId = "";

    @C09CT("reward_image")
    public ImageModel rewardImage;

    @C09CT("reward_type")
    public int rewardType;

    @C09CT("tiles_cost")
    public long tilesCost;

    @C09CT("title")
    public Text title;
}
