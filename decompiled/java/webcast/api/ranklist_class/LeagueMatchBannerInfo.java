package webcast.api.ranklist_class;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class LeagueMatchBannerInfo {

    @C09CT("anchor_avatar")
    public ImageModel anchorAvatar;

    @C09CT("content")
    public Text content;

    @C09CT("end_timestamp_sec")
    public long endTimestampSec;

    @C09CT("icon")
    public ImageModel icon;

    @C09CT("rank")
    public long rank;

    @C09CT("rank_str")
    public String rankStr = "";

    @C09CT("stage")
    public int stage;

    @C09CT("start_timestamp_sec")
    public long startTimestampSec;
}
