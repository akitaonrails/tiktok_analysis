package tikcast.api.privilege.creator_points;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class RewardsPlazaPage {

    @C09CT("num_redeemed")
    public int numRedeemed;

    @C09CT("tiles_balance")
    public TilesBalance tilesBalance;

    @C09CT("reward_icons")
    public List<ImageModel> rewardIcons = new ArrayList();

    @C09CT("swag_list")
    public List<RewardDefinition> swagList = new ArrayList();

    @C09CT("virtual_reward_list")
    public List<RewardDefinition> virtualRewardList = new ArrayList();

    @C09CT("tile_projects")
    public List<TileProject> tileProjects = new ArrayList();
}
