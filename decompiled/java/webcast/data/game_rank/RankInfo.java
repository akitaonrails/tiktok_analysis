package webcast.data.game_rank;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.List;
import webcast.data.RankUser;

/* JADX INFO: loaded from: classes.dex */
public final class RankInfo {

    @C09CT("rank_index")
    public long rankIndex;

    @C09CT("room_game_type")
    public long roomGameType;

    @C09CT("room_id")
    public long roomId;

    @C09CT("score")
    public long score;

    @C09CT("user")
    public RankUser user;

    @C09CT("score_desc")
    public String scoreDesc = "";

    @C09CT("room_id_str")
    public String roomIdStr = "";

    @C09CT("values")
    public List<Long> values = new ArrayList();

    @C09CT("sub_contents")
    public List<Text> subContents = new ArrayList();
}
